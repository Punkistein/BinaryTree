package controlador;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import vista.VistaPrincipal;
import javax.swing.table.TableCellRenderer;

public class ControladorCeldas extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        ControlInputs objCI = new ControlInputs();
        int columnas = VistaPrincipal.longitudDefi;
        int filas = objCI.validacionSuperior(columnas);

        this.setBackground(Color.red); //globalizando el rojo
        int agrupacion;

        switch (columnas) {
            case 8:
                if (row == 0) {
                    if ((column == 0) || (column == 1) || (column == 2) || (column == 3)) {
                        this.setBackground(Color.GREEN);
                    }
                } else if (row == 1) {
                    if ((column == 0) || (column == 1) || (column == 4) || (column == 5)) {
                        this.setBackground(Color.GREEN);
                    }
                } else if (row == 2) {
                    if ((column == 0) || (column == 2) || (column == 4) || (column == 6)) {
                        this.setBackground(Color.GREEN);
                    }
                }
                break;
            case 16:
                if (row == 0) {
                    agrupacion = hacerGruposDe(columnas);
                    for (int i = 0; i < agrupacion; i++) {
                        if (column == i) {
                            this.setBackground(Color.GREEN);
                        }
                    }
                } else if (row == 1) {
                    agrupacion = hacerGruposDe(columnas / 2);
                    int iterador = 0;
                    int inicio = 0;
                    int objetivo = agrupacion; //4
                    //OJO PONER ESTE WHILE EN UNA FUNCION
                    while (iterador < objetivo) { //3<4 true ...          
                        if (column == iterador) {
                            this.setBackground(Color.GREEN);
                        }
                        if ((objetivo - 1) == iterador) { //para saber si en la siguiente iteracion el bucle acabará

                            int newIterator = iterador + agrupacion; //me da un valor de 7 para mi new1
                            int newObjective = objetivo + iterador + agrupacion; //me da un valor de 11 para mi new2
                            while (newIterator < newObjective) {
                                if (column == newIterator + 1) {
                                    this.setBackground(Color.GREEN);
                                }
                                newIterator++;
                            }
                        }
                        iterador++;
                    }
                } else if (row == 2) {
                    agrupacion = hacerGruposDe(columnas / 4);
                    int iterador = 0;
                    int objetivo = agrupacion; //2
                    //OJO PONER ESTE WHILE EN UNA FUNCION
                    while (iterador < objetivo) { //3<4 true ...          
                        if (column == iterador) {
                            this.setBackground(Color.GREEN);
                        }
                        if ((objetivo - 1) == iterador) { //para saber si en la siguiente iteracion el bucle acabará
                            int newIterator = iterador + agrupacion; //me da un valor de 7 para mi new1
                            int newObjective = objetivo + iterador + agrupacion; //me da un valor de 11 para mi new2

                            while (newIterator < newObjective) {
                                if (column == newIterator + 1) {
                                    this.setBackground(Color.GREEN);
                                }
                                newIterator++;
                            }
                        }
                        iterador++;
                    }
                    if ((column == 8) || (column == 9) || (column == 12) || (column == 13)) { //pintando por condicional :(
                        this.setBackground(Color.GREEN);
                    }
                } else if (row == 3) {
                    for (int i = 0; i < columnas; i += 2) {
                        if (column == i) {
                            this.setBackground(Color.GREEN);
                        }
                    }
                }
                break;
            case 32:
                if (row == 0) {
                    agrupacion = hacerGruposDe(columnas);
                    for (int i = 0; i < agrupacion; i++) {
                        if (column == i) {
                            this.setBackground(Color.GREEN);
                        }
                    }
                } else if (row == 1) {
                    agrupacion = hacerGruposDe(columnas / 2);
                    int iterador = 0;
                    int inicio = 0;
                    int objetivo = agrupacion; //4
                    //OJO PONER ESTE WHILE EN UNA FUNCION
                    while (iterador < objetivo) { //3<4 true ...          
                        if (column == iterador) {
                            this.setBackground(Color.GREEN);
                        }
                        if ((objetivo - 1) == iterador) { //para saber si en la siguiente iteracion el bucle acabará

                            int newIterator = iterador + agrupacion; //me da un valor de 7 para mi new1
                            int newObjective = objetivo + iterador + agrupacion; //me da un valor de 11 para mi new2
                            while (newIterator < newObjective) {
                                if (column == newIterator + 1) {
                                    this.setBackground(Color.GREEN);
                                }
                                newIterator++;
                            }
                        }
                        iterador++;
                    }
                } else if (row == 2) {
                    for (int i = 0; i < columnas; i = i + 8) {
                        if (column == i || column == i + 1 || column == i + 2 || column == i + 3) {
                            this.setBackground(Color.GREEN);
                        }
                    }
                } else if (row == 3) {
                    for (int i = 0; i < columnas; i = i + 4) {
                        if (column == i || column == i + 1) {
                            this.setBackground(Color.GREEN);
                        }
                    }
                } else if (row == 4) {
                    for (int i = 0; i < columnas; i += 2) {
                        if (column == i) {
                            this.setBackground(Color.GREEN);
                        }
                    }
                }
                break;
            case 64:
                if (row == 0) {
                    agrupacion = hacerGruposDe(columnas);
                    for (int i = 0; i < agrupacion; i++) {
                        if (column == i) {
                            this.setBackground(Color.GREEN);
                        }
                    }
                } else if (row == 1) {      //ESTE ES EL DEFINITIVO :)))) quiero agradecer a todos los que me han apoyado
                    //hasta llegar aqui, sobre todo a mi madre, padre, abuela, abuelo, mi vecina, mi vecino, mi tios, mis tias,
                    //mis primos, mis hijos, mi esposa, mis compañeros, mis maestros, mi jefe, mi amigo, el amigo de mi amigo, 
                    //el jefe de mi amigo, el amigo de mi jefe, el granjero, el amigo del granjero, el granjero del amigo, el lechero
                    //el hijo del lechero, la esposa del lechero, la hermana de la esposa del lechero, ah y cierto, a Pepe, José y Luis!
                    for (int i = 0; i < columnas; i = i + 32) {
                        for (int j = 0; j < 16; j++) {
                            if (column == i || column == i + j) {
                                this.setBackground(Color.GREEN);
                            }
                        }
                    }
                } else if (row == 2) {
                    for (int i = 0; i < columnas; i = i + 16) {
                        if (column == i || column == i + 1 || column == i + 2 || column == i + 3
                                || column == i + 4 || column == i + 5 || column == i + 6 || column == i + 7) {
                            this.setBackground(Color.GREEN);
                        }
                    }
                } else if (row == 3) {
                    for (int i = 0; i < columnas; i = i + 8) {
                        if (column == i || column == i + 1 || column == i + 2 || column == i + 3) {
                            this.setBackground(Color.GREEN);
                        }
                    }
                } else if (row == 4) {
                    for (int i = 0; i < columnas; i = i + 4) {
                        if (column == i || column == i + 1) {
                            this.setBackground(Color.GREEN);
                        }
                    }
                } else if (row == 5) {
                    for (int i = 0; i < columnas; i += 2) {
                        if (column == i) {
                            this.setBackground(Color.GREEN);
                        }
                    }
                }
                break;
            case 128:
                if (row == 0) {
                    for (int i = 0; i < columnas / 2; i++) {
                        if (column == i) {
                            this.setBackground(Color.GREEN);
                        }
                    }
                } else if (row == 1) {
                    for (int i = 0; i < columnas; i = i + 64) {
                        for (int j = 0; j < 32; j++) {
                            if (column == i || column == i + j) {
                                this.setBackground(Color.GREEN);
                            }
                        }
                    }
                } else if (row == 2) {
                    for (int i = 0; i < columnas; i = i + 32) {
                        for (int j = 0; j < 16; j++) {
                            if (column == i || column == i + j) {
                                this.setBackground(Color.GREEN);
                            }
                        }
                    }
                } else if (row == 3) {
                    for (int i = 0; i < columnas; i = i + 16) {
                        for (int j = 0; j < 8; j++) {
                            if (column == i || column == i + j) {
                                this.setBackground(Color.GREEN);
                            }
                        }
                    }
                } else if (row == 4) {
                    for (int i = 0; i < columnas; i = i + 8) {
                        for (int j = 0; j < 4; j++) {
                            if (column == i || column == i + j) {
                                this.setBackground(Color.GREEN);
                            }
                        }
                    }
                } else if (row == 5) {
                    for (int i = 0; i < columnas; i = i + 4) {
                        for (int j = 0; j < 2; j++) {
                            if (column == i || column == i + j) {
                                this.setBackground(Color.GREEN);
                            }
                        }
                    }
                } else if (row == 6) {
                    for (int i = 0; i < columnas; i = i + 2) {
                        for (int j = 0; j < 1; j++) {
                            if (column == i || column == i + j) {
                                this.setBackground(Color.GREEN);
                            }
                        }
                    }
                }
                break;
            default:
                throw new AssertionError();
        }

        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }

    public int hacerGruposDe(int columnas) {
        int gruposDe = columnas / 2;
        return gruposDe;
    }
}

//        System.out.println("row " + (row));
//        System.out.println("col " + (column));
//        System.out.println("col/2 " + (column) / 2);
//        System.out.println("---------");
//                    int inicio = 0;
//                    int objetivo = agrupacion; //agrupacion es 4
//                    for (int i = inicio; i < 4; i++) { //0=0
//                        System.out.println(i);
//                        if () {
//
//                        }
//                    }
//                    if ((column == 0) || (column == 1) || (column == 2) || (column == 3) || (column == 8) || (column == 9) || (column == 10) || (column == 11)) {
//                        this.setBackground(Color.GREEN);
//                    }
