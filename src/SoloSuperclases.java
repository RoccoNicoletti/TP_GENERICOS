import java.util.ArrayList;
import java.util.List;

public class SoloSuperclases <T> {



        ///constructores
        public SoloSuperclases(){

        }

        //getters y setters


        ///metodos

       public static <T> void imprimirElementos(List<? super ClaseHija > lista){

            for(Object obj: lista){

                System.out.println(obj);

            }


    }
}
