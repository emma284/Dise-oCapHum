package Logica;
import java.sql.*;
 
public class actualizarTablaPuesto {
	static String codigo;
	static String nombre;
	static String descripcion;
	static String empresa;
	
	public actualizarTablaPuesto(String codigo, String nombre, String descripcion, String empresa) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.empresa = empresa;
	}



	public static void actualizar() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbgrupo6b", "root", "grupo6b");
            Statement st = conexion.createStatement();
            st.executeUpdate("INSERT INTO Competencia (codigo, nombre, descripcion, empresa) VALUES ("+codigo+", "+nombre+", "+descripcion+", "+empresa+")");
           /* ResultSet rs = st.executeQuery("SELECT * FROM Competencia;");
 
            if (rs != null) {
                System.out.println("El listado de competencias es el siguiente:");
 
                while (rs.next()) {
                    System.out.println("  ID: " + rs.getObject("codigo"));
                    System.out.println("  Nombre completo: " + rs.getObject("nombre"));
                    System.out.println("  Descripcion: " + rs.getObject("descripcion"));
                    System.out.println("- ");
                }
                rs.close();
            }*/
            st.close();
 
        }
        catch(SQLException s)
        {
            System.out.println("Error: SQL.");
            System.out.println("SQLException: " + s.getMessage());
        }
        catch(Exception s)
        {
            System.out.println("Error: Varios.");
            System.out.println("SQLException: " + s.getMessage());
        }
        System.out.println("FIN DE EJECUCIÓN.");
    }



	
}