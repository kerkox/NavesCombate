package navescombate.UI.Animation;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import org.w3c.dom.css.Rect;

public class Animacion extends JComponent {

    private Nave naveUser = null;
    private Nave enemigo = null;
    private Bala bala = null;
    private Timer timerEnemigo = null;
    private Timer TimerDisparo = null;
    private int width = 0;
    private int direccion = 1;
    public boolean iniciada = false;
    private boolean winner = false;

    public Animacion(int width) {
        this.width = width;
        System.out.println("Ancho del panel: " + this.width);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        if (naveUser != null) {
            g.fillPolygon(naveUser.getPolygon());
        }
        if (enemigo != null) {
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
            this.naveUser = new Nave(100, 210, false);
        }
        if (this.enemigo == null) {
            System.out.println("Creo la nave del enemigo");
            this.enemigo = new Nave(100, 25, true);

        }
        if (!winner) {
            if (this.timerEnemigo == null) {
                System.out.println("Creo el timer");

                this.timerEnemigo = new Timer(10, (ActionEvent e) -> {
                    MoveEnemigo(1);
                    if (bala != null) {
                        bala.moverUp(1);
                        repaint();
                    }
                    if (Impacto()) {
                        destroyEnemy();
                        bala = null;

                    }
                    repaint();
                });
            }

            this.timerEnemigo.start();
        }

    }

    public void MoveMousePoint(int posx, int posy) {
        this.naveUser.MoverPunto(posx, posy);
        repaint();

    }

    /**
     *
     * @param unidades a mover del enemigo
     */
    public void MoveEnemigo(int unidades) {
        int posx = (int) this.enemigo.getNariz().getX();

        if (posx - 25 <= 0) {
            direccion = 1;
        }
        if (posx + 30 >= this.width) {
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

    }

    public boolean Impacto() {
        boolean destroy = false;
        if (bala == null) {
            return false;
        }
        if (enemigo == null) {
            return false;
        }
        int x = bala.getPosx();
        int x1 = (int) enemigo.getNariz().getX() - 30;
        int y1 = (int) enemigo.getNariz().getY() - 20;
        int x2 = enemigo.getNariz().x;
        int y2 = enemigo.getNariz().y;
        if (bala.getPosy() + 10 <= 0) {
            System.out.println("Valor de pos y bala: " + bala.getPosy());
            System.out.println("Se perdio el disparo");
            bala = null;
            TimerDisparo = null;
            return false;
        }
        if (bala.getPosy() <= y2 + 40) {
            if ((bala.getPosx() >= x1) && (bala.getPosx() <= x2 + 30)) {

                int y = (((x - x1) * (y2 - y1)) / (x2 - x1)) + y1;
                System.out.println("Valor de y: " + y); 
                System.out.println("pos bala  y: " + bala.getPosy());
                if (bala.getPosy() == y) {
                    return true;
                }

            }
        }

        return destroy;
    }

    public void Disparar() {
        if (!winner) {
            bala = new Bala(this.naveUser.getNariz());
        }
//        if (this.TimerDisparo == null) {
//            System.out.println("##Timer Disparo----------------------------");
//            bala = new Bala(this.naveUser.getNariz());
//            TimerDisparo = new Timer(50, (ActionEvent e) -> {
//
//                if (bala != null) {
//                    bala.moverUp(15);
//                    repaint();
//                }
//                if (Impacto()) {
//                    destroyEnemy();
//                    bala = null;
//                    TimerDisparo = null;
//                }
//                System.out.println("Tiempo timer: " + TimerDisparo.getDelay());
//            });
//
//            TimerDisparo.start();
//        }

    }

    public void destroyEnemy() {
        this.winner = true;
        enemigo = null;
        JOptionPane.showMessageDialog(null, "Has Ganado");
    }

}
