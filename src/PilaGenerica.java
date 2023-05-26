import java.util.Stack;

public class PilaGenerica <T extends Number> {

    private Stack<T> pila=new Stack<>();



    //constructores

    public PilaGenerica(){

    }

    ///metodos
    public void agregarElementos(T t){

        pila.push(t);
    }

    public void mostrar(){
        for(T t: pila){
            System.out.println(t);
        }
    }

    ///getters y setters


    public Stack<T> getPila() {
        return pila;
    }

    public void setPila(Stack<T> pila) {
        this.pila = pila;
    }
}
