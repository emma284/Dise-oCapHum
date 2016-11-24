package Logica;
import java.util.Vector;
import java.sql.*;

public class Puesto {
	public String codigo;
	public String nombre;
	String empresa;
	String descripcion;
	
	public Puesto(String cod, String nomb, String emp, String descrip) {
		this.codigo=cod;
		this.nombre=nomb;
		this.empresa=emp;
		this.descripcion=descrip;

		
	}
	//agregada
	public Puesto() {
		// TODO Auto-generated constructor stub
	}
	//agregada
	public String getCodigo(){
		return this.codigo;
	}
	//agregada
	public Vector<Puesto> cargarPuestos(){
		
		Vector<Puesto> salida= new Vector<Puesto>();
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbgrupo6b", "root", "grupo6b");
        Statement st = conexion.createStatement();
        
        ResultSet rs = st.executeQuery("SELECT * FROM Puesto;");
        
        if (rs != null) {
           

            while (rs.next()) {
            	
            	String codigo= (String) rs.getObject("codigo");
            	String nombre= (String) rs.getObject("nombre");
            	String empresa= (String) rs.getObject("empresa");
            	String descripcion= (String) rs.getObject("descripcion");
            	
            	Puesto p= new Puesto(codigo,nombre,empresa,descripcion);
            	
            	salida.add(p);
             
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
	//agregada
	public Puesto getPuesto(String pu){
		for(Puesto puestos : cargarPuestos()){
			if(puestos.getCodigo()==pu){
				return puestos;
			}
		}
		return null;
	}
	//agregada
	public void agregarPuestoABase(Puesto p){
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbgrupo6b", "root", "grupo6b");
	        Statement st = conexion.createStatement();
	        
	        st.executeUpdate("INSERT INTO Puesto (codigo, nombre, descripcion, empresa) VALUES (\""+p.codigo+"\", \""+p.nombre+"\", \""+p.descripcion+"\", \""+p.empresa+"\");");
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
		
	}
}
