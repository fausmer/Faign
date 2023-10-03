public class Alumno {
    private int cod;
    private String nombre;
    private String apellido;
    private int dni;
    private String curso;
    private String estado;
    private float aportes;

    public Alumno(int cod, String nombre, String apellido, int dni, String curso, String estado, float aportes) {
        this.cod = cod;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.curso = curso;
        this.estado = estado;
        this.aportes = aportes;
    }

    public int getCod() {

        return cod;
    }

    public void setCod(int cod) {

        this.cod = cod;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public int getDni() {

        return dni;
    }

    public void setDni(int dni) {

        this.dni = dni;
    }

    public String getCurso() {

        return curso;
    }

    public void setCurso(String curso) {

        this.curso = curso;
    }

    public String getEstado() {

        return estado;
    }

    public void setEstado(String estado) {

        this.estado = estado;
    }

    public float getAportes() {

        return aportes;
    }

    public void setAportes(float aportes) {

        this.aportes = aportes;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "cod=" + cod +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", curso='" + curso + '\'' +
                ", estado='" + estado + '\'' +
                ", aportes=" + aportes +
                '}';
    }
    ///////////////////////
    //  METODOS PROPIOS  //
    ///////////////////////

    // metodo para editar el nombre del alumno
    public void editarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    // Método para editar la edad del alumno
    public void editarApellido(String nuevoApellido) {

        this.apellido = nuevoApellido;
    }
    public void editarDni(int nuevoDni) {

        this.dni = nuevoDni;
    }
    public void editarCurso(String nuevoCurso) {

        this.apellido = nuevoCurso;
    }
    public void editarEstado(String nuevoEstado) {

        this.estado = nuevoEstado;
    }
    public void editarAportes(int nuevoAportes) {

        this.aportes = nuevoAportes;
    }
    public boolean agregarAlumno (Alumno al){
        AlumnoBase alBase=new AlumnoBase();
        return alBase.agregarAlumno(al);
    }
    public boolean ModificarAlumno (){
        return true;
    }
    public Alumno buscarAlumno (int cod){
        Alumno al;
        return al;
    }
    public Alumno buscarAlumno (String nombre) {
        Alumno al;
        return al;
    }
    public Alumno buscar (String apellido){
        Alumno al;
        return al;
    }
    public Arraylist listarAlumno(){
        Arraylist <Alumno> listadoAl;
        return listadoAl;
    }
    public boolean eliminarAlumno(int cod){
        return true;
    }
}
