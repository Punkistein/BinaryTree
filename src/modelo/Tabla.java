package modelo;

import javax.swing.table.DefaultTableModel;

public class Tabla{
    
    private DefaultTableModel modeloHeaderInicial;
    int[] filaValoresInt;
    
    public Tabla(String[] columnas, int filas) {
        modeloHeaderInicial = new DefaultTableModel(columnas, filas);
    }
    
    public Tabla(){};

    public DefaultTableModel getModeloHeaderInicial() {
        return modeloHeaderInicial;
    }
    
    public DefaultTableModel llenarTabla(Object[] filaValoresObj){
        modeloHeaderInicial.addRow(filaValoresObj);
        return modeloHeaderInicial;
    }

}
