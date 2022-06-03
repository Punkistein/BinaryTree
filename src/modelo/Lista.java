package modelo;

public class Lista {
    int longitudLista;
    int valorLista;
    int[] miLista;
    
    public Lista(int longitudIngresada, int valorIngresado){
        this.longitudLista = longitudIngresada;
        this.valorLista = valorIngresado;
        
        miLista = new int[this.longitudLista];
        
        for (int i = 0; i < miLista.length; i++) {
            miLista[i] = this.valorLista;
        }
    }
    
    public void imprimirLista(){
        for (int i = 0; i < miLista.length; i++) {
            System.out.print(this.valorLista + " ");
        }
    }
}
