package navescombate.Animation;

import java.awt.Polygon;

public class Nave {
    
    private int[] CoorX;
    private int[] CoorY;
    private int vertices;
    private Polygon polygon;

    public Nave(int[] CoorX, int[] CoorY, int vertices) {
        this.CoorX = CoorX;
        this.CoorY = CoorY;
        this.vertices = vertices;
        this.polygon = new Polygon(this.CoorX,this.CoorY, this.vertices);
    }
    
    public Nave(){
        
    }

    public void setCoorX(int[] CoorX) {
        this.CoorX = CoorX;
    }

    public void setCoorY(int[] CoorY) {
        this.CoorY = CoorY;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }
    
    public void CreatePolygon(){
        this.polygon = new Polygon(this.CoorX,this.CoorY, this.vertices);
    }

    public Polygon getPolygon() {
        return polygon;
    }

    public int[] getCoorX() {
        return CoorX;
    }

    public int[] getCoorY() {
        return CoorY;
    }

    public int getVertices() {
        return vertices;
    }
    
    
    
    
    
    
}
