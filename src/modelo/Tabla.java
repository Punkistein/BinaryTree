package modelo;

import javax.swing.table.DefaultTableModel;

public class Tabla{
    
    private DefaultTableModel laTabla;
    
    public Tabla(String[] columnas, int filas) {
        laTabla = new DefaultTableModel(columnas, filas);
    }
    
    //8 -> 3
    //16 -> 4
    //32 -> 5
    //64 -> 6
    //128 -> 7
    
    public Tabla(){};

    public DefaultTableModel getModeloHeaderInicial() {
        return laTabla;
    }
    
    public DefaultTableModel llenarTabla(Object[] filaValoresObj){
        laTabla.addRow(filaValoresObj);
        return laTabla;
    }

}
