package controlador;

import javax.swing.JOptionPane;
import modelo.Lista;

public class ControlInputs {

    public String mensajeUsuario;
    Lista objLista;
    
    public ControlInputs(String longitudString, String valorString) {  
        
        if (validacionNumerica(longitudString) && validacionNumerica(valorString)) {
            int longitud = Integer.parseInt(longitudString);
            int valor = Integer.parseInt(valorString);
            if (validacionMultiplo(longitud)) {
                if (validacionRangoLongitud(longitud) && validacionRangoValor(valor)) {
                    objLista = new Lista(longitud, valor);
                    objLista.imprimirLista();
                } else {
                    mensajeUsuario = "La longitud la lista debe estar entre 8 y 128"
                            + " y el valor debe ser un número entre 0 y 9";
                }
            } else {
                mensajeUsuario = "La longitud de la lista debe ser múltiplo de 8";
            }
        } else {
            mensajeUsuario = "Ingrese solo números en ambos campos";
        }
    }
        
    public boolean validacionNumerica(String longitudIngresada){
        try { 
          Integer.parseInt(longitudIngresada); 
          return true;
        } catch(NumberFormatException e){
          return false;  
        }
    }
    
    public boolean validacionMultiplo(int longitudIngresada){
        if (longitudIngresada % 8 != 0) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean validacionRangoLongitud(int longitudIngresada){
        if (longitudIngresada >= 8 && longitudIngresada <= 128) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean validacionRangoValor(int valorIngresada) {
        if (valorIngresada >= 0 && valorIngresada <= 9) {
            return true;
        } else {
            return false;
        }
    }
    
}
