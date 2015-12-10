package navescombate.UI.Animation;

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
    
    //*****************************
    //Metodos para el movimiento
    public void MoveRight(int unidades){
        for(int x : this.CoorX){
            x += unidades;
        }
    }
    
    public void MoveLeft(int unidades){
        for(int x : this.CoorX){
            x -= unidades;
        }
    }
    
    public void MoveUp(int unidades){
        for(int y : this.CoorY){
            y -= unidades;
        }
    }
    
    public void MoveDown(int unidades){
        for(int y : this.CoorY){
            y += unidades;
        }
    }
    
    
    
    
}
