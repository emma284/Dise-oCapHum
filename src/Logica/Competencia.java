package Logica;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class Competencia {
	String id_competencia;
	String nombre;
	String descripcion;
	public Competencia(String id,String n,String d) {
		this.id_competencia=id;
		this.nombre=n;
		this.descripcion=d;
	}
	public Competencia(){
		
	}
	
	//agregada
	public Vector<Competencia> cargarCompetencias(){
		
		Vector<Competencia> salida= new Vector<Competencia>();
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbgrupo6b", "root", "grupo6b");
        Statement st = conexion.createStatement();
        
        ResultSet rs = st.executeQuery("SELECT * FROM Competencia;");
        
        if (rs != null) {
           

            while (rs.next()) {
            	
            	String id_competencia= (String) rs.getObject("id_competencia");
            	String nombre= (String) rs.getObject("nombre");
            	String descripcion= (String) rs.getObject("descripcion");
            	
            	Competencia c= new Competencia(id_competencia,nombre,descripcion);
            	
            	salida.add(c);
             
            }
            rs.close();
        }
        st.close();
        
        
        return salida;
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
		return null;
	}

	public Competencia competenciaNombre(String c){
		
		for(Competencia comp : cargarCompetencias()){
			if(comp.nombre==c){
				return comp;
			}
		}
		return null;
	}
	

}
