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
        int vertices;

        if (this.naveUser == null) {
            System.out.println("Creo la nave del usuario");
            int[] xCoord = {30, 60, 35, 30, 25, 0};
            int[] yCoord = {0, 20, 15, 20, 15, 20};
            vertices = xCoord.length;
            this.naveUser = new Nave(xCoord, yCoord, vertices);
        }

        if (this.enemigo == null) {
            System.out.println("Creo la nave del enemigo");
            int[] xCoordEne = {30, 60, 35, 30, 25, 0};
            int[] yCoordEne = {20, 0, 5, 0, 5, 0};
            vertices = xCoordEne.length;
            this.enemigo = new Nave(xCoordEne, yCoordEne, vertices);
        }

//        repaint();

    }

    public void Mover(int unidades, int direccion) {
        System.out.println("ENTRO A MOVERSE");
        switch (direccion) {
            case 1:
                this.naveUser.MoveUp(unidades);
                System.out.println("Arriba");
                break;
            case 2:
                this.naveUser.MoveDown(unidades);
                System.out.println("Abajo");
                break;
            case 3:
                this.naveUser.MoveRight(unidades);
                System.out.println("Derecha");
                break;
            case 4:
                this.naveUser.MoveLeft(unidades);
                System.out.println("Izquierda");
                break;
        }
    }
    
    public void pause(){
        
        
    }
    
    public void restart(){
        
    }
    

}
