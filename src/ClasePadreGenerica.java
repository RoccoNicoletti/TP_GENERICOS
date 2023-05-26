import java.util.ArrayList;
import java.util.List;

public class ClasePadreGenerica <T>{

   private T elemento;


    ///constructores
    public ClasePadreGenerica(){

    }

    public ClasePadreGenerica(T elemento) {
        this.elemento = elemento;
    }

    ///getters y setters


    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    ///metodos

    public static <T> boolean comparar ( T elemento, T elemento1){

        if(elemento.equals(elemento1)){

            return true;
        }
        return false;
    }
}
