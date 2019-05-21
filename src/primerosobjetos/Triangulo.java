package primerosobjetos;
import java.awt.Color;
public class Triangulo {
    private Double base, altura;
    private Integer x, y;
    //private String color;
    private Color color;
    public Triangulo (Double base, Double altura, Color color, Integer x, Integer y) {
        this.base = base;
        this.altura = altura;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(String color) {
        this.setColor(color);
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }    
}