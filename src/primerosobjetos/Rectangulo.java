package primerosobjetos;
import java.awt.Color;
public class Rectangulo {
    private Canvas miCanvas;
    private Double largo, ancho;
    private Integer x, y;
    //private String color;
    private Color color;
    public Rectangulo (Double l, Double a, Color c) {
        largo = l;
        ancho = a;
        color = c;
    }
    
    public Rectangulo (Double l, Double a, Color c, Integer x, Integer y) {
        largo = l;
        ancho = a;
        color = c;
        this.x = x;
        this.y = y;
    }
    
    public Double getLargo () {
        return largo;
    }

    public void setLargo (Double l) {
        largo = l;
    }
    
    public Double getAncho () {
        return ancho;
    }
    
    public void setAncho (Double a) {
        ancho = a;
    }
    
    public Double Perimetro () {
        return 2 * largo + 2 * ancho;
    }

    public Double Superficie () {
        return largo * ancho;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}