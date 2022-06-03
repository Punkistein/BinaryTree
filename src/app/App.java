package app;

import vista.VistaPrincipal;
import java.util.Scanner;

public class App {
    
    static Scanner entrada = new Scanner(System.in);
    static VistaPrincipal objVP = new VistaPrincipal();
    
    public static void main(String[] args) {
        System.out.println("cambio en branch Saul");
        objVP.setVisible(true);
    }    
    
}
