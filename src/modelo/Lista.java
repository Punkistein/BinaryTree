package modelo;

public class Lista {
    private int longitudLista;
    private int valorLista;
    private int[] miLista;
    
    public Lista(int longitudIngresada, int valorIngresado){
        this.longitudLista = longitudIngresada;
        this.valorLista = valorIngresado;
        
        miLista = new int[this.longitudLista];
        
        for (int i = 0; i < miLista.length; i++) {
            miLista[i] = this.valorLista;
        }
    }

    public int getLongitudLista() {
        return longitudLista;
    }

    public void setLongitudLista(int longitudLista) {
        this.longitudLista = longitudLista;
    }
    public int getValorLista() {
        return valorLista;
    }
    public void setValorLista(int valorLista) {
        this.valorLista = valorLista;
    }
    public int[] getMiLista() {
        return miLista;
    }
    public void setMiLista(int[] miLista) {
        this.miLista = miLista;
    }
    
    
}
