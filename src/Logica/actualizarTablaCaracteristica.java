package Logica;
import java.sql.*;
 
public class actualizarTablaCaracteristica {
	static String id_competencia;
	static String codigo;
	static int ponderacion;
	
	public actualizarTablaCaracteristica(String id_competencia, String codigo, int ponderacion) {
		super();
		this.id_competencia = id_competencia;
		this.codigo = codigo;
		this.ponderacion = ponderacion;
	}



	public static void actualizar() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbgrupo6b", "root", "grupo6b");
            Statement st = conexion.createStatement();
            st.executeUpdate("INSERT INTO Competencia (id_competencia, codigo, ponderacion) VALUES ("+id_competencia+", "+codigo+", "+ponderacion+")");
           /* ResultSet rs = st.executeQuery("SELECT * FROM Competencia;");
 
            if (rs != null) {
                System.out.println("El listado de competencias es el siguiente:");
 
                while (rs.next()) {
                    System.out.println("  ID: " + rs.getObject("id_competencia"));
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