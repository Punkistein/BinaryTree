package controlador;

import javax.swing.table.DefaultTableModel;
import vista.VistaPrincipal;
import modelo.Tabla;

public class ControlTabla{
    
    Tabla objTabla;
    VistaPrincipal objVista;
    
    //desde la vista paso longitud para construir
    //los P con el metodo de esta clase
    
    public DefaultTableModel construirHeader(int columnas, int filas){
        
        String[] header = new String[columnas];
        for (int i = 0; i < header.length; i++) {
            header[i] = "P"+(i+1);
        }
        objTabla = new Tabla(header, filas);
        return objTabla.getModeloHeaderInicial();
    }
}
