package primerosobjetos;
import java.awt.Color;
import java.awt.*;

public class PrimerosObjetos {
private Canvas miCanvas;
    public static void main(String[] args) {      
    Rectangulo r = new Rectangulo (15.0, 12.0, Color.BLUE, 550, 400);
    Triangulo t = new Triangulo (13.5, 20.14, Color.DARK_GRAY, 300, 400);
    Circulo c = new Circulo (5.3, 12.0, Color.ORANGE, 400, 550);
    System.out.println ("Se ha formado un rectángulo de: "+r.getAncho()+"m de ancho, "+r.getLargo()+"m de largo. Formando un perimetro de: "+r.Perimetro()+"m, y una superficie de: "+r.Superficie()+"m.");
    r.setAncho (22.2);
    r.setLargo(12.0);
    System.out.println ("Con los valores asignados tenemos un rectángulo de: "+r.getAncho()+"m de ancho, "+r.getLargo()+"m de largo obteniendo un perimetro de: "+r.Perimetro()+"m y una superficie de: "+r.Superficie()+"m.");
    System.out.println ("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println ("Se ha formado un triángulo de: "+t.getBase()+"m de base, "+t.getAltura()+"m de altura.");
    t.setBase(12.12);
    t.setAltura(14.5);
    System.out.println ("Con los datos modificados queda un triángulo de: "+t.getBase()+"m de base y "+t.getAltura()+"m de altura.");
    System.out.println ("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println ("Se ha formado un circulo con un radio de: "+c.GetRadio()+"m y un diámetro de: "+c.GetDiámetro()+"m, dando una superficie de: "+c.Superficie()+"m y un perímetro de: "+c.Perímetro()+"m.");
    c.SetRadio(12.3);
    c.SetDiámetro(5.3);
    System.out.println ("Con los datos modificados queda un circulo con: "+c.GetRadio()+"m de radio, "+c.GetDiámetro()+"m de diámetro, dando una superficie de: "+c.Superficie()+"m y un perímetro de: "+c.Perímetro()+"m.");
    PelotasDemo p;
    p = new PelotasDemo();
// p.rebotar();
// p.demoDibujar();
PrimerosObjetos pantalla = new PrimerosObjetos ();
pantalla.GraficarFiguras ();

    
}
private void GraficarFiguras () {  
    Rectangulo r = new Rectangulo (15.0, 12.0, Color.BLUE, 10, 150);
    Triangulo t = new Triangulo (13.5, 20.14, Color.DARK_GRAY, 300, 400);
    Circulo c = new Circulo (5.3, 12.0, Color.ORANGE, 400, 550);
      miCanvas = new Canvas ("Figura Geometrica", 600, 500);
      miCanvas.setVisible (true);
      //miCanvas.setColorDeLapiz(Color.green);
      //miCanvas.rellenarRectangulo(500, 300, 85, 40);
      //miCanvas.setColorDeLapiz(Color.blue);
      //miCanvas.rellenarCirculo (400, 300, 40);
      //miCanvas.setColorDeLapiz(Color.orange);
      //miCanvas.rellenarTriangulo(300, 300, 33, 90);   
      int PosX = 10;
      miCanvas.setColorDeLapiz(Color.orange);
      miCanvas.rellenarRectangulo(PosX, 150, 40, 30);
      for (int x = 0; x < 200; x++) {
          miCanvas.rellenarRectangulo(PosX, 150, 40, 30);
          miCanvas.espera(10);
          miCanvas.borrarRectangulo(PosX, 150, 40, 30);
          PosX++;
          r.getX();
          r.getY();
          r.getAncho();
          r.getLargo();
      }
      miCanvas.rellenarRectangulo(PosX, 150, 40, 30);
      /*--------------------------------------------------------------*/
       miCanvas.setColorDeLapiz(Color.green);
        int PosY = 400;
        miCanvas.rellenarTriangulo (300, PosY, 33, 90);
        for (int tt = 0; tt < 800; tt++) {
            miCanvas.rellenarTriangulo(300, PosY, 33, 90);
            miCanvas.espera(10);
            miCanvas.borrarTriangulo(300, PosY, 33, 90);
            PosY--;
            t.getX();
            t.getY();
            t.getBase();
            t.getAltura();
        }
        miCanvas.rellenar();
        /*--------------------------------------------------------------*/
        miCanvas.setColorDeLapiz(Color.CYAN);
        int PosX2 = 400, PosY2 = 300;
        miCanvas.rellenarCirculo(PosX2, PosY2, 40);
        for (int g = 0; g < 200; g++) {
            miCanvas.rellenarCirculo(PosX2, PosY2, 40);
            miCanvas.espera(10);
            miCanvas.borrarCirculo(PosX2, PosY2, 40);
            PosX2++;
            PosY2++;
            c.getX();
            c.getY();
            c.GetDiámetro();
        }
        miCanvas.rellenar();
    }

}



    

