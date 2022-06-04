package controlador;

import javax.swing.table.DefaultTableModel;
import vista.VistaPrincipal;
import modelo.Tabla;

public class ControlTabla{
    
    Tabla objTabla;
    VistaPrincipal objVista;
    
    public DefaultTableModel construirHeader(int columnas, int filas){
        
        String[] header = new String[columnas];
        for (int i = 0; i < header.length; i++) {
            header[i] = "P"+(i+1);
        }
        objTabla = new Tabla(header, filas);
        return objTabla.getModeloHeaderInicial();
    }
    
    public DefaultTableModel llenarFila(int columnas, int valor){
        int[] filaValoresInt = new int[columnas];
        Object[] filaValoresObj;
        for (int i = 0; i < filaValoresInt.length; i++) {
            filaValoresInt[i] = valor;
        }
        filaValoresObj = new Object[filaValoresInt.length];
        for (int i = 0; i < columnas; i++) {
            filaValoresObj[i] = filaValoresInt[i];
        }
        return objTabla.llenarTabla(filaValoresObj);
    }
    
}
