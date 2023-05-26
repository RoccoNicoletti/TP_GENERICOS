public class Par <T, B>{

    private T elementoUno;
    private B elementoDos;

    ///constructores
    public Par(){

    }

    public Par(T elementoUno, B elementoDos) {
        this.elementoUno = elementoUno;
        this.elementoDos = elementoDos;
    }

    ///getters y setters

    public T getElementoUno() {
        return elementoUno;
    }

    public void setElementoUno(T elementoUno) {
        this.elementoUno = elementoUno;
    }

    public B getElementoDos() {
        return elementoDos;
    }

    public void setElementoDos(B elementoDos) {
        this.elementoDos = elementoDos;
    }

    //metodos

    public void mostrar(){


    }
}
