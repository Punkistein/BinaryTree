package controlador;

import modelo.Lista;

public class ControlInputs {

    public String mensajeUsuario;
    public int longitudDefinitiva;
    Lista objLista;
    
    public ControlInputs(String longitudString, String valorString) {  
        
        if (validacionNumerica(longitudString) && validacionNumerica(valorString)) {
            int longitud = Integer.parseInt(longitudString);
            int valor = Integer.parseInt(valorString);
            if (validacionMultiplo(longitud)) {
                if (validacionRangoLongitud(longitud) && validacionRangoValor(valor)) {
                    if (validacionSuperior(longitud) != 0) {
                        longitudDefinitiva = validacionSuperior(longitud);
                        objLista = new Lista(longitud, valor);
                    } else {
                        mensajeUsuario = "Debe ingresar una longitud que sea recursivamente"
                                + " divisible para 2 y que no haya un resto de la división."
                                + "\n La longitud ingresada '" + longitud + "' no cumple con este criterio.";
                    }
                } else {
                    mensajeUsuario = "La longitud la lista debe estar entre 8 y 128"
                            + " y el valor debe ser un número entre 0 y 9";
                }
            } else {
                mensajeUsuario = "La longitud de la lista debe ser múltiplo de 8 y mayor a 8";
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
    
    public int validacionSuperior(int longitudIngresada){
        int filasPorAgregar = 0;
        int restoFinal = 0;
        
        for (int i = longitudIngresada; i >= 1; i--) {
            if (i == (longitudIngresada/2)) {
                restoFinal += longitudIngresada%2;
                filasPorAgregar++;
                longitudIngresada = i;
            }
        }
        if (restoFinal != 0) {
            return 0;
        } else {
            return filasPorAgregar;
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
