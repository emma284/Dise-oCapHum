package Logica;
import java.sql.*;
 
public class crearTablas {
	
    public static void main(String[] args) throws SQLException {
        System.out.println("INICIO DE EJECUCIÓN.");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbgrupo6b", "root", "grupo6b");
            Statement st = conexion.createStatement();
            //st.executeUpdate("DROP TABLE IF EXISTS caracteristica, competencia, puesto;");
            
            st.executeUpdate("CREATE TABLE Competencia(	id_competencia VARCHAR(20),descripcion VARCHAR(100),nombre VARCHAR(50),PRIMARY KEY(id_competencia));");
            st.executeUpdate("CREATE TABLE Puesto(codigo VARCHAR(20) NOT NULL,nombre VARCHAR(50),descripcion VARCHAR(100),empresa VARCHAR(50),PRIMARY KEY(codigo));");
            st.executeUpdate("CREATE TABLE Caracteristica(id_competencia VARCHAR(20),codigo VARCHAR(20),ponderacion INT,FOREIGN KEY (id_competencia) REFERENCES Competencia(id_competencia),FOREIGN KEY (codigo) REFERENCES Puesto(codigo),PRIMARY KEY (id_competencia,codigo));");
            
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