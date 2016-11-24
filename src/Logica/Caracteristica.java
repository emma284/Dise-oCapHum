package Logica;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import com.sun.javafx.collections.MappingChange.Map;

public class Caracteristica {
	
	Map <String,Integer> competenciaYPonderacion;
	Puesto puesto;
	
	public Caracteristica(Map <String,Integer> competenciaYPonderacion, String codigo) {
		
		this.competenciaYPonderacion=competenciaYPonderacion;
		this.puesto=puesto.getPuesto(codigo);
		
	}
	

	
public Vector<Caracteristica> cargarCaracteristicas(){
		
		Vector<Caracteristica> salida= new Vector<Caracteristica>();
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/dbgrupo6b", "root", "grupo6b");
        Statement st = conexion.createStatement();
        
        ResultSet rs = st.executeQuery("SELECT DISTINCT codigo FROM Caracteristica;");
        Vector<String> aux=new Vector<String>();
        if (rs != null){
        	
        	while (rs.next()){
        		String codigo= (String) rs.getObject("codigo");
        		aux.add(codigo);
        	}
        }
        
        
        for(String a: aux){
        	rs = st.executeQuery("SELECT * FROM Caracteristica WHERE codigo=\""+a+"\";");
        	Map<String, Integer> b=(Map<String, Integer>) new HashMap<String,Integer>();
        	while (rs.next()){
        		 ((HashMap<String, Integer>) b).put(((String) rs.getObject("id_competencia")),((Integer) rs.getObject("ponderacion")));
        	}
        	Caracteristica c= new Caracteristica(b,a);
        	salida.add(c);
        }
        rs.close();
        
        
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


}
