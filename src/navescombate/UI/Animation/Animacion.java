package navescombate.UI.Animation;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Animacion extends JComponent {

    private Nave naveUser = null;
    private Nave enemigo = null;

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

    }

    public void MoveMousePoint(int posx, int posy) {
        this.naveUser.MoverPunto(posx, posy);
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
