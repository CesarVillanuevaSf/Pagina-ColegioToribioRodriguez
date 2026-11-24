package Proyecto_ColegioToribio.model;

public class Alumno {
    private long idAlumno;
    private String codigoAlumno;
    private String nombres;
    private String apellidos;

    public Alumno(Long idAlumno, String codigoAlumno, String nombres, String apellidos) {
        this.idAlumno = idAlumno;
        this.codigoAlumno = codigoAlumno;
        this.nombres = nombres;
        this.apellidos = apellidos;

    }

    public long getIdAlumno() {
        return idAlumno;
    }
    public String getCodigoAlumno() {
        return codigoAlumno;
    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
}
