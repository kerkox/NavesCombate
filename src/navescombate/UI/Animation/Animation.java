package navescombate.UI.Animation;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Animation extends JComponent{

    private Nave naveUser;
    private Nave enemigo;

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        
        int width = this.getWidth();
        int height = this.getHeight();

        g.fillRect(0, 0, width, height);
        
        g.drawOval(50, 50, 25, 25);
//        int width = this.getWidth();
//        int height = this.getHeight();
        g.drawPolygon(naveUser.getCoorX(), naveUser.getCoorY(), naveUser.getVertices());
//        g.drawPolygon(naveUser.getPolygon());
//        g.drawPolygon(enemigo.getPolygon());
        g.drawPolygon(enemigo.getCoorX(),enemigo.getCoorY(), enemigo.getVertices());
        
    }
    
    public void init(){
        System.out.println("Incio la animacion");
        int vertices;
        int[] xCoord = { 30, 60, 35, 30, 25, 0 };
        int[] yCoord = { 0, 20, 15, 20, 15, 20 };
        vertices = xCoord.length;
        
        this.naveUser = new Nave(xCoord,yCoord,vertices);
        
        int[] xCoordEne = { 30, 60, 35, 30, 25, 0 };
        int[] yCoordEne = { 20, 0, 5, 0, 5, 0 };
        vertices = xCoordEne.length;
        
        this.enemigo = new Nave(xCoordEne,yCoordEne, vertices);
        repaint();
        
    }
    
    public void Mover(int unidades, int direccion){
        System.out.println("ENTRO A MOVERSE");
        switch(direccion){
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
    
    
    
    
    
}
