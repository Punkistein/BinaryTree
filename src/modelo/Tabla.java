package modelo;

import javax.swing.table.DefaultTableModel;
import vista.VistaPrincipal;

public class Tabla{
    private DefaultTableModel modeloHeaderInicial;

    public Tabla(String[] columnas, int filas) {
        modeloHeaderInicial = new DefaultTableModel(columnas, filas);
//        VistaPrincipal.jtblTree.setModel(table_model);
    }

    public DefaultTableModel getModeloHeaderInicial() {
        return modeloHeaderInicial;
    }
    
}
