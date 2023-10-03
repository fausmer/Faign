import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Usuario {
    private int cod;
    private String dni;
    private String contraseña;
    private String nombre;

    public Usuario(int cod, String dni, String contraseña, String nombre) {
        this.cod = cod;
        this.dni = dni;
        this.contraseña = contraseña;
        this.nombre = nombre;
    }

    public Usuario() {
        this.cod = 0;
        this.dni = "";
        this.contraseña = "";
        this.nombre = "";
    }

    public Usuario(String nombre, String apellido, String dni) {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{}";
    }


    private static final Map<String, Usuario> usuarios = new HashMap<>();

    public static void crearUsuario(String nombre, String apellido, String dni) {
        Usuario usuario = new Usuario(nombre, apellido, dni);
        usuarios.put(dni, usuario);
    }

    private static Usuario usuarioActual;

    public static boolean iniciarSesion(String dni) {
        Usuario usuario = usuarios.get(dni);
        if (usuario != null) {
            usuarioActual = usuario;
            return true;
        }
        return false;
    }

    public static void cerrarSesion() {

        usuarioActual = null;
    }
    public Arraylist listarUsuario() {
        Arraylist<Usuario> listadoAus;
        return listadous;
    }
    public boolean ModificarUsuario (){

        return true;
    }
    public Usuario buscarUsuario (int cod){
        Usuario us;
        return us;
    }s
    public ArrayList listarUsuario(){

        return list;
    }
    public boolean eliminarUsuario(int cod){

        return true;
    }
    public boolean agregarUsuario (Usuario us){
        UsuarioBase usBase=new UsuarioBase();
        return usBase.agregarUsuario(us);
}