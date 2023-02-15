package PatronSingleton;

public class Usuarios {
    private int id;
    private static int contador = 0;

    private String nombre;
    private String Apellido;

    public Usuarios(String nombre, String apellido){
        this.nombre=nombre;
        this.Apellido=apellido;
        id = ++Usuarios.contador;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    @Override
    public String toString() {
        return "PatronSingleton.Usuarios{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                '}';
    }
}
