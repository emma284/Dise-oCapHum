package Interfaces;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.sun.javafx.collections.MappingChange.Map;

import Logica.Competencia;
import Logica.Puesto;

public class AgregarPonderaciones {

	private JFrame frame;
	private JTable tabla;
	
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarPonderaciones window = new AgregarPonderaciones();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	
	
	public AgregarPonderaciones(Vector<String> nombreCompetencias,Puesto p){
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.BOLD, 14));
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
		
		String[] columnas = {"Competencia","Ponderación"};
		String [][] datosTabla = new String[nombreCompetencias.size()][2] ;
		for(int i=0;i<nombreCompetencias.size();i++){
			datosTabla[i][0] = nombreCompetencias.get(i);
			datosTabla[i][1] = "0";
		}
		frame.getContentPane().setLayout(null);
		
		tabla = new JTable(datosTabla, columnas);
		tabla.setFont(new Font("Arial", Font.BOLD, 14));
		tabla.setBounds(1, 26, 582, 216);
		frame.getContentPane().add(tabla);
		
		JScrollPane scrollPane = new JScrollPane(tabla);
		scrollPane.setBounds(0, 0, 584, 240);
		frame.getContentPane().add(scrollPane);
		
		JButton aceptar = new JButton("Aceptar");
		aceptar.setFont(new Font("Arial", Font.BOLD, 14));
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Caracteristica c = new Caracteristica(listaComp, p);
				String com;
				Integer num=0;
				Map<String, Integer> listaComp = (Map<String, Integer>) new HashMap<String,Integer>();
				
				/*
				Boolean control=true;
				
				for(int i=0;i<nombreCompetencias.size();i++){
					if(Integer.getInteger(datosTabla[i][1])>10)control=false;
				}
				*/
				
				for(int i=0;i<nombreCompetencias.size();i++){

					com=nombreCompetencias.elementAt(i);
					num=Integer.getInteger(datosTabla[1][i]);
					((HashMap<String, Integer>) listaComp).put(com,num);
					
				}
				
				
				
				
				
			}
		});
		aceptar.setBounds(247, 291, 89, 23);
		frame.getContentPane().add(aceptar);
		
		
	}
}
