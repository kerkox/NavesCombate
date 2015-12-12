package navescombate.UI.Animation;

import java.awt.Polygon;

public class Nave {

    private int[] CoorX;
    private int[] CoorY;
    private int vertices;
    private Polygon polygon;

    public Nave(int[] CoorX, int[] CoorY) {
        this.CoorX = CoorX;
        this.CoorY = CoorY;
        this.vertices = CoorX.length;
        this.polygon = new Polygon(this.CoorX, this.CoorY, this.vertices);
    }

    public Nave(int posX, int posY, boolean enemigo){
        posicionar(posX, posY, enemigo);
    }
    
    public Nave() {

    }

    public void setCoorX(int[] CoorX) {
        this.CoorX = CoorX;
        this.vertices = CoorX.length;
    }

    public void setCoorY(int[] CoorY) {
        this.CoorY = CoorY;
        this.vertices = CoorY.length;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public void CreatePolygon() {
        this.polygon = new Polygon(this.CoorX, this.CoorY, this.vertices);
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
    public void MoveRight(int unidades) {
        for (int x = 0; x < this.CoorX.length; x++) {
            this.CoorX[x] += unidades;

        }
        CreatePolygon();
    }

    public void MoveLeft(int unidades) {
        for (int x = 0; x < this.CoorX.length; x++) {
            this.CoorX[x] -= unidades;

        }
        CreatePolygon();
    }

    public void MoveUp(int unidades) {
        for (int x = 0; x < this.CoorY.length; x++) {
            this.CoorY[x] -= unidades;

        }
        CreatePolygon();
    }

    public void MoveDown(int unidades) {
        for (int x = 0; x < this.CoorY.length; x++) {
            this.CoorY[x] += unidades;

        }
        CreatePolygon();
    }

    public void MoverPunto(int x, int y) {
        int moveX = 0, moveY = 0;
        moveX = x - CoorX[0];
        moveY = y - CoorY[0];
        MoveDown(moveY);
        MoveRight(moveX);

    }

    public void MoverX(int x) {
        MoveRight(x - CoorX[0]);
    }

    public void MoverY(int y) {
        MoveRight(y - CoorY[0]);
    }

    public void posicionar(int x, int y, boolean enemigo) {
        int[] xCoord = {x, x + 30, x + 5, x, x - 5, x - 30};
        if (enemigo) {
            int[] yCoord = {y, y - 20, y - 15, y - 20, y - 15, y - 20};
            this.CoorY = yCoord;
        } else {
            int[] yCoord = {y, y + 20, y + 15, y + 20, y + 15, y + 20};
            this.CoorY = yCoord;
        }
        this.CoorX = xCoord;

        this.vertices = CoorX.length;
        CreatePolygon();
    }

}
