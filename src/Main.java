import java.util.Scanner;
import java.sql.*;
public class Main {
    public static void main(String[] args) {
        Estudiantes est = new Estudiantes();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cédula del estudiante: ");
        est.setCedula(sc.nextLine());
        System.out.print("Ingrese el nombre del estudiante: ");
        est.setNombre(sc.nextLine());
        System.out.print("Ingrese la nota del primer bimestre: ");
        est.setB1(sc.nextDouble());
        System.out.print("Ingrese la nota del segundo bimestre: ");
        est.setB2(sc.nextDouble());
        String url = "jdbc:mysql://localhost:3306/clasepoo";
        String usuario = "root";
        String clave = "123456";
        String query = "insert into estudiantes (cedula, nombre, b1, b2) values(?,?,?,?)";
        try(Connection con = DriverManager.getConnection(url, usuario,clave)){
            System.out.println("Conexión a la base de datos exitosa");
            PreparedStatement ins = con.prepareStatement(query);
            ins.setString(1, est.getCedula());
            ins.setString(2, est.getNombre());
            ins.setDouble(3, est.getB1());
            ins.setDouble(4, est.getB2());
            ins.executeUpdate();
            System.out.println("Estudiante se ha registrado correctamente");
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
}