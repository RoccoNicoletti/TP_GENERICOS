import java.util.ArrayList;

public class Persona implements Comparable{

    private String nombre;
    private int añoEgreso;


    public Persona(){

    }

    public Persona(String nombre, int añoEgreso) {
        this.nombre = nombre;
        this.añoEgreso = añoEgreso;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoEgreso() {
        return añoEgreso;
    }

    public void setAñoEgreso(int añoEgreso) {
        this.añoEgreso = añoEgreso;
    }
}
