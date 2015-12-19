package navescombate.UI.Animation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import navescombate.UI.CampoBatalla;
import org.w3c.dom.css.Rect;

public class Animacion extends JComponent {

    private Nave naveUser = null;
    private Nave enemigo = null;
    private Bala bala = null;
    private Timer timerEnemigo = null;
    private Timer TimerDisparo = null;
    private int width = 0;
    private int height = 0;
    private int direccion = 1;
    public boolean iniciada = false;
    private boolean winner = false;
    private JPanel panel;
    private CampoBatalla campo;
    
    public Animacion(CampoBatalla campo) {
        this.campo = campo;
        this.panel = campo.getPanel();
        this.height = panel.getHeight();
        this.width = panel.getWidth();
        System.out.println("Ancho del panel: " + this.width);
    }

    @Override
    protected void paintComponent(Graphics g) {
        
        if (naveUser != null) {
            g.setColor(Color.BLACK);
            g.fillPolygon(naveUser.getPolygon());
        }
        
        if (enemigo != null) {
            g.setColor(Color.BLUE);
            g.fillPolygon(enemigo.getPolygon());
        }
        
        if (bala != null) {
            g.setColor(Color.RED);
            g.fillRect(bala.getPosx(), bala.getPosy(), bala.getWidth(), bala.getHeigth());
        }

    }

    public void init() {
        this.iniciada = true;
        System.out.println("Incio la animacion");
        if (this.naveUser == null) {
            System.out.println("Creo la nave del usuario");
            System.out.println("Height: "+ this.height);
            this.naveUser = new Nave(100, this.height-30, false);
        }
        if (this.enemigo == null) {
            System.out.println("Creo la nave del enemigo");
            this.enemigo = new Nave(100, 25, true);

        }
        if (enemigo == null) {
            System.out.println("@@@@@Enemigo Null");
        }
        if (!winner) {
            if (this.timerEnemigo == null) {
                System.out.println("Creo el timer");

                this.timerEnemigo = new Timer(10, (ActionEvent e) -> {
                    this.width = this.campo.getPanel().getWidth();
                    this.height = this.campo.getPanel().getHeight();
                    if(naveUser!=null){
                        naveUser.posicionar((int)naveUser.getNariz().getX(), this.height-30, false);
                    }
                    
                        
                    if (bala != null) {
                        bala.moverUp(5);
                        repaint();
                    }
                    if (Impacto()) {
                        destroyEnemy();
                        bala = null;
                        restart();

                    }
                    if (enemigo != null) {
                        MoveEnemigo(1);
                    }
                    repaint();
                });
            }

            this.timerEnemigo.start();
        }

    }

//    public void MoveMousePoint(int posx, int posy) {
//        this.naveUser.MoverPunto(posx, posy);
//        repaint();
//
//    }

    /**
     *
     * @param unidades a mover del enemigo
     */
    public void MoveEnemigo(int unidades) {
        int posx = (int) this.enemigo.getNariz().getX();
        System.out.println("posx: " + posx);
        if (posx - 25 <= 0) {
            System.out.println("---Direccion 1");
            direccion = 1;
        }
        
        if (posx + 30 >= this.width) {
            System.out.println("##Direccion 2");
            direccion = 2;
        }

        switch (direccion) {
            case 1:
                this.enemigo.MoveRight(unidades);
                break;
            case 2:
                this.enemigo.MoveLeft(unidades);
                break;
        }

        repaint();
    }

    public void MoveMouseX(int posx) {
        this.naveUser.MoverX(posx);
        repaint();

    }

    public void MoveMouseY(int posx, int posy) {
        this.naveUser.MoverY(posy);
        repaint();

    }

    public void Mover(int unidades, int direccion) {
        System.out.println("ENTRO A MOVERSE");
        switch (direccion) {
            case 1:
                this.naveUser.MoveUp(unidades);
                repaint();
                System.out.println("Arriba");
                break;
            case 2:
                this.naveUser.MoveDown(unidades);
                repaint();
                System.out.println("Abajo");
                break;
            case 3:
                this.naveUser.MoveRight(unidades);
                repaint();
                System.out.println("Derecha");
                break;
            case 4:
                this.naveUser.MoveLeft(unidades);
                repaint();
                System.out.println("Izquierda");
                break;
        }

    }

    public void pause() {

    }

    public void restart() {
        clear();
        init();
    }

    public boolean Impacto() {
        boolean destroy = false;
        if (bala == null) {
            return false;
        }
        if (enemigo == null) {
            return false;
        }
        
        if(enemigo.getPolygon().contains(bala.getPoint())){
            return true;
        }
        
        return destroy;
    }

    public void Disparar() {
        if (!winner) {
            bala = new Bala(this.naveUser.getNariz());
        }

    }

    public void clear() {
        naveUser = null;
        enemigo = null;
        bala = null;
        timerEnemigo = null;
        TimerDisparo = null;
        width = this.panel.getWidth();
        direccion = 1;
        iniciada = false;
        winner = false;

    }

    public void destroyEnemy() {
        this.timerEnemigo.stop();
        this.timerEnemigo=null;
        this.winner = true;
        enemigo = null;
        JOptionPane.showMessageDialog(null, "Has Ganado");
        clear();
        

    }

}
