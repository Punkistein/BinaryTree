package controlador;

import javax.swing.table.DefaultTableModel;
import vista.VistaPrincipal;
import static vista.VistaPrincipal.jtblTree;

public class ControlTabla extends DefaultTableModel {

    String nombresColumnas[] = {"Serial Number", "Medicine Name", "Dose", "Frequency"};
    DefaultTableModel table_model = new DefaultTableModel(nombresColumnas, 3);

//    VistaPrincipal.jtblTree.setModel(table_model);

}
