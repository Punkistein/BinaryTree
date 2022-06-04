package modelo;

import javax.swing.table.DefaultTableModel;
import controlador.ControlInputs;

public class Tabla extends DefaultTableModel{
        
    public Tabla(String[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }    
}
