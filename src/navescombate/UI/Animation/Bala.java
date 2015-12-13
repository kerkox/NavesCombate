package navescombate.UI.Animation;

import java.awt.Point;

public class Bala {

    private int posx;
    private int posy;
    private int width;
    private int heigth;

    public Bala(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
        this.width = 4;
        this.heigth = 10;
    }

    public Bala(Point point) {
        this.width = 4;
        this.heigth = 10;
        this.posx = (int) point.getX();
        this.posy = (int) point.getY()-heigth;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }
    
    public void MoverPunto(Point point){
        this.posx = (int) point.getX();
        this.posy = (int) point.getY();
        
    }
    
    public void moverX(int x){
        this.posx = x;
    }
    public void moverY(int y){
        this.posy= y;
    }
    
    public void moverUp(int unidades){
        moverY(this.posy - unidades);
    }

}
