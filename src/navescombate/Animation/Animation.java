package navescombate.Animation;

import java.awt.Graphics;
import javax.swing.JComponent;

public class Animation extends JComponent{

    private Nave naveUser;
    private Nave enemigo;

    @Override
    protected void paintComponent(Graphics g) {
        
        int width = this.getWidth();
        int height = this.getHeight();
        g.drawPolygon(naveUser.getCoorX(), naveUser.getCoorY(), naveUser.getVertices());
//        g.drawPolygon(naveUser.getPolygon());
//        g.drawPolygon(enemigo.getPolygon());
        g.drawPolygon(enemigo.getCoorX(),enemigo.getCoorY(), enemigo.getVertices());
        
    }
    
    public void init(){
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
    
    
    
    
    
}
