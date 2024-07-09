public class Estudiantes {
    String nombre, cedula;
    Double b1, b2;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, String cedula, Double b1, Double b2) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.b1 = b1;
        this.b2 = b2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Double getB1() {
        return b1;
    }

    public void setB1(Double b1) {
        this.b1 = b1;
    }

    public Double getB2() {
        return b2;
    }

    public void setB2(Double b2) {
        this.b2 = b2;
    }
    public void mostrarEstudiantes() {
        System.out.println("Cédula: " + getCedula());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nota primer bimestre: " + getB1());
        System.out.println("Nota segundo bimestre: " + getB2());
        Double promedio = (getB1() + getB2())/2;
        System.out.println("Promedio: " + String.format("%.2f",promedio));
    }
}
