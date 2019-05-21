package primerosobjetos;
import java.awt.Color;
public class Circulo {
   private Double Radio, Diámetro;
   private Integer x, y;
   //private String Color;   
   private Color Color;
public Circulo (Double r, Double D, Color c, Integer x, Integer y) {
    Radio = r;
    Diámetro = D;
    Color = c;
    this.x = x;
    this.y = y;
}

public Double GetRadio () {
    return Radio;
}

public void SetRadio (Double r) {
    Radio = r;
}

public Double GetDiámetro () {
    return Diámetro;
}

public void SetDiámetro (Double D) {
    Diámetro = D;
}

public Color GetColor () {
    return Color;
}

public void SetColor (Color c) {
    Color = c;
}

public Double Superficie () {
    return (3.14 * Radio * Radio);
}

public Double Perímetro () {
    return (3.14 * Diámetro);
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

    public void setY(Integer y) {
        this.y = y;
    }
}
