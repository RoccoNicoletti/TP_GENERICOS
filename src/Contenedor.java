public class Contenedor <T>{

    private T dato;


    ///constructores
    public Contenedor(){

    }

    public Contenedor(T dato) {
        this.dato = dato;
    }

    ///getters y setters


    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public static <T> void concatenar (T t, T t1){

        System.out.println(t +  " "  + t1);


    }
}
