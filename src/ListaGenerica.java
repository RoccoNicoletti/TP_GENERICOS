import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListaGenerica <T>{

    private List<T> elementos=new ArrayList<>();


    ///constructores
    public ListaGenerica(){

    }

    //getters y setters


    public List<T> getElementos() {
        return elementos;
    }

    public void setElementos(List<T> elementos) {
        this.elementos = elementos;
    }

    ///metodos
    public void agregarElemento(T t){
        elementos.add(t);
    }

    public void tamañoLista(){

        System.out.println("El tamaño de la lista es: " + elementos.size());

    }

    public void obtenerElementoEnPos(int pos){



        if(pos>elementos.size()){
            System.out.println("La posicion no esta dentro de la lista");
        }
        else if(pos<=elementos.size()){
            System.out.println("El elemento en esa posicion es: " + elementos.get(pos));

        }
    }

    public void intercambiarElementos(T nombre, T nombre1){

        T temp=nombre;
        nombre=nombre1;
        nombre1=temp;


    }

    public <T extends Comparable<T>> void imprimirLista(List <T> listita){

        for(T obj: listita){

            System.out.println(obj);


        }


    }

    @Override
    public String toString() {
        return "ListaGenerica{" +
                "elementos=" + elementos +
                '}';
    }
}
