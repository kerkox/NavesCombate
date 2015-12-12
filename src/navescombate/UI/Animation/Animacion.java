package navescombate.UI.Animation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JComponent;
import javax.swing.Timer;

public class Animacion extends JComponent {

    private Nave naveUser = null;
    private Nave enemigo = null;
    private Timer timerEnemigo = null;
    public int width =0;
    
    public Animacion(int width){
        this.width =width;
        System.out.println("Ancho del panel: "+ this.width);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawPolygon(naveUser.getPolygon());
        g.drawPolygon(enemigo.getPolygon());

    }

    public void init() {
        System.out.println("Incio la animacion");
        if (this.naveUser == null) {
            System.out.println("Creo la nave del usuario");
            this.naveUser = new Nave(100, 210, false);
        }
        if (this.enemigo == null) {
            System.out.println("Creo la nave del enemigo");
            this.enemigo = new Nave(100, 25, true);

        }
        if(this.timerEnemigo==null){
            System.out.println("Creo el timer");
            this.timerEnemigo = new Timer(10, (ActionEvent e) -> {
                System.out.println("movido");
                MoveEnemigo(10);
                repaint();
            });
        }
        this.timerEnemigo.start();
        
    }

    public void MoveMousePoint(int posx, int posy) {
        this.naveUser.MoverPunto(posx, posy);
        repaint();

    }
/**
 * 
 * @param unidades  a mover del enemigo
 */
    public void MoveEnemigo(int unidades){
        if((int)this.enemigo.getNariz().getX()>=this.width){
            
            this.enemigo.MoverX((unidades*-1));    
        }else{
            this.enemigo.MoverX(unidades);
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

    }

}
