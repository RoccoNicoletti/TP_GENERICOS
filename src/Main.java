import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ///EJERCICIO 1

        ListaGenerica<String> listitaGenerica=new ListaGenerica<>();
        listitaGenerica.agregarElemento("Rocco");
        listitaGenerica.agregarElemento("Toto");
        listitaGenerica.agregarElemento("Diana");
        listitaGenerica.agregarElemento("Martin");

        listitaGenerica.tamañoLista();

        listitaGenerica.obtenerElementoEnPos(3);

        ///EJERCICIO 2
        listitaGenerica.intercambiarElementos("Martin", "Diana");

        ///EJERCICIO 3
        PilaGenerica<Integer> pila=new PilaGenerica<>();
        pila.agregarElementos(3);
        pila.agregarElementos(6);
        pila.agregarElementos(8);
        pila.mostrar();

        /// EJERCICIO 4
        Persona per1=new Persona("Pela", 2010);
        Colegio colegio1=new Colegio("UTN");
        ArrayList<Persona> persona=new ArrayList<>();
        persona.add(per1);
        ArrayList<Colegio> cole=new ArrayList<>();
        cole.add(colegio1);
        listitaGenerica.imprimirLista(persona);
       ///dara error porque colegio no implementa comparable listitaGenerica.imprimirLista(cole);

        ///EJERCICIO 5

      ///en este caso daria error en tiempo de compilacion porque ya que String no es subclase de ClasePadre
      /// ClaseHija<String> dato=new ClaseHija<String>();
         ClaseHija<ClasePadreGenerica<Integer>> datito=new ClaseHija<>();

         ///EJERCICIO 6

       boolean comparar= datito.comparar(2,2);

       if(comparar){
           System.out.println("Son iguales");
       }
       else{
           System.out.println("No son iguales");
       }

     ////EJERCICIO 7
     Par <Integer, Integer> dobleDato=new Par<>(3, 2);
        int uno= dobleDato.getElementoUno();
        int dos= dobleDato.getElementoDos();

        System.out.println(uno  + "," +dos);

        ///EJERCICIO 8

        ClasePadreGenerica<Integer> elemento1=new ClasePadreGenerica<>();
        elemento1.setElemento(5);
        ClasePadreGenerica<Integer> elemento2=new ClasePadreGenerica<>();
        elemento2.setElemento(6);

        List<ClasePadreGenerica> lista=new ArrayList<>();
        lista.add(elemento1);
        lista.add(elemento2);

        ///PERMITE SOLO ELEMENTOS DE LA CLASE  PADRE QUE ES LA LA SUPERCLASE DE LA CLASE HIJA

        SoloSuperclases instancia = new SoloSuperclases<>();
        instancia.imprimirElementos(lista);

        ///EJERCICIO 9
        Contenedor<ClasePadreGenerica> conteiner1=new Contenedor<>();
        conteiner1.setDato(elemento1);
        Contenedor<String> conteiner2=new Contenedor<>();
        conteiner2.setDato("Rocco");
        ClasePadreGenerica element=conteiner1.getDato();
        String element2=conteiner2.getDato();
        System.out.println(element);
        System.out.println(element2);

        ///EJERCICIO 10

        Contenedor.concatenar(element2 , "crack");











    }
}