package Logica;
import java.sql.*;
 
public class conectarMostrar2 {
	static int numero = 25;
    public static void main(String[] args) throws SQLException {
        System.out.println("INICIO DE EJECUCIÓN.");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbgrupo6b", "root", "grupo6b");
            Statement st = conexion.createStatement();
            /*st.executeUpdate("DROP TABLE IF EXISTS personal;");
            st.executeUpdate("CREATE TABLE personal (`Identificador` int(11) NOT NULL AUTO_INCREMENT, `Nombre` varchar(50) NOT NULL, `Apellidos` varchar(50) NOT NULL, `Telefono` varchar(9) DEFAULT NULL, `Email` varchar(60) DEFAULT NULL, PRIMARY KEY (`Identificador`));");
            st.executeUpdate("INSERT INTO personal (`Identificador`, `Nombre`, `Apellidos`, `Telefono`, `Email`) VALUES (" + numero + ", 'José', 'Martínez López', '968112233', 'jose@martinezlopez.com'), (2, 'María', 'Gómez Muñoz', '911876876', 'maria@gomezoliver.com'), (3, 'Juan', 'Sánchez Fernández', '922111333', 'juan@sanchezfernandez.com'), (4, 'Ana', 'Murcia Rodríguez', '950999888', 'ana@murciarodriguez.com');");
            ResultSet rs = st.executeQuery("SELECT * FROM personal;");*/
            String s="Lealtad";
            ResultSet rs = st.executeQuery("SELECT * FROM competencia WHERE nombre=\""+s+"\";");
            if (rs != null) {
                System.out.println("El listado de persona es el siguiente:");
 
                while (rs.next()) {
                    System.out.println("  ID: " + rs.getObject("id_competencia"));
                    System.out.println("  Descripcion: " + rs.getObject("descripcion"));
                    System.out.println("  Nombre: " + rs.getObject("nombre"));
                    System.out.println("- ");
                }
                rs.close();
            }
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