public class ClaseHija<T extends ClasePadreGenerica<?>> extends ClasePadreGenerica<T>{



    ///constructores
    public ClaseHija() {
    }

    public ClaseHija(T elemento) {
        super(elemento);
    }



}
