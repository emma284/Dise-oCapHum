package Interfaces;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.Timer;

import com.sun.javafx.collections.MappingChange.Map;

import Logica.Competencia;
import Logica.Puesto;
import Logica.Caracteristica;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class InterfazAltaPuesto {

	private JFrame frame;
	private JTextField campo1;
	private JTextField campo2;
	private JTextField campo3;
	private JTextField campo4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazAltaPuesto window = new InterfazAltaPuesto();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazAltaPuesto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel texto1 = new JLabel("Alta Puesto");
		texto1.setFont(new Font("Arial", Font.BOLD, 14));
		texto1.setBounds(10, 30, 86, 14);
		frame.getContentPane().add(texto1);
		
		JLabel texto2 = new JLabel("C\u00F3digo:");
		texto2.setFont(new Font("Arial", Font.BOLD, 14));
		texto2.setBounds(10, 65, 54, 14);
		frame.getContentPane().add(texto2);
		
		JLabel texto3 = new JLabel("Nombre del Puesto:");
		texto3.setFont(new Font("Arial", Font.BOLD, 14));
		texto3.setBounds(10, 100, 138, 14);
		frame.getContentPane().add(texto3);
		
		JLabel texto4 = new JLabel("Descripci\u00F3n:");
		texto4.setFont(new Font("Arial", Font.BOLD, 14));
		texto4.setBounds(10, 138, 95, 14);
		frame.getContentPane().add(texto4);
		
		JLabel texto5 = new JLabel("Empresa:");
		texto5.setFont(new Font("Arial", Font.BOLD, 14));
		texto5.setBounds(10, 170, 65, 14);
		frame.getContentPane().add(texto5);
		
		JLabel texto6 = new JLabel("Caracter\u00EDsticas del Puesto:");
		texto6.setFont(new Font("Arial", Font.BOLD, 14));
		texto6.setBounds(10, 205, 188, 14);
		frame.getContentPane().add(texto6);
		
		JLabel texto7 = new JLabel("* (Campos obligatorios)");
		texto7.setFont(new Font("Arial", Font.BOLD, 14));
		texto7.setBounds(10, 444, 163, 14);
		frame.getContentPane().add(texto7);
		
		JLabel texto8 = new JLabel("*");
		texto8.setFont(new Font("Arial", Font.BOLD, 14));
		texto8.setBounds(410, 100, 46, 14);
		frame.getContentPane().add(texto8);
		
		JLabel texto9 = new JLabel("*");
		texto9.setFont(new Font("Arial", Font.BOLD, 14));
		texto9.setBounds(410, 135, 46, 14);
		frame.getContentPane().add(texto9);
		
		JLabel texto10 = new JLabel("*");
		texto10.setFont(new Font("Arial", Font.BOLD, 14));
		texto10.setBounds(410, 65, 46, 14);
		frame.getContentPane().add(texto10);
		
		JLabel texto11 = new JLabel("*");
		texto11.setFont(new Font("Arial", Font.BOLD, 14));
		texto11.setBounds(410, 170, 46, 14);
		frame.getContentPane().add(texto11);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		cancelar.setFont(new Font("Arial", Font.BOLD, 14));
		cancelar.setBounds(678, 527, 100, 23);
		frame.getContentPane().add(cancelar);
		
		JButton aceptar = new JButton("Aceptar");
		aceptar.setFont(new Font("Arial", Font.BOLD, 14));
		aceptar.setBounds(575, 527, 89, 23);
		frame.getContentPane().add(aceptar);
		
		campo1 = new JTextField();
		campo1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				hacerMayusculas(e);
			}
		});
		campo1.setFont(new Font("Arial", Font.BOLD, 14));
		campo1.setBounds(205, 65, 188, 20);
		frame.getContentPane().add(campo1);
		campo1.setColumns(10);
		
		campo2 = new JTextField();
		campo2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				hacerMayusculas(e);
			}
		});
		campo2.setFont(new Font("Arial", Font.BOLD, 14));
		campo2.setBounds(205, 100, 188, 20);
		frame.getContentPane().add(campo2);
		campo2.setColumns(10);
		
		campo3 = new JTextField();
		campo3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				hacerMayusculas(e);
			}
		});
		campo3.setFont(new Font("Arial", Font.BOLD, 14));
		campo3.setBounds(205, 135, 188, 20);
		frame.getContentPane().add(campo3);
		campo3.setColumns(10);
		
		campo4 = new JTextField();
		campo4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				hacerMayusculas(e);
			}
		});
		campo4.setFont(new Font("Arial", Font.BOLD, 14));
		campo4.setBounds(205, 170, 188, 20);
		frame.getContentPane().add(campo4);
		campo4.setColumns(10);
		
		JButton agregar = new JButton("-->");
		agregar.setBounds(429, 261, 89, 23);
		frame.getContentPane().add(agregar);
		
		
		
		JButton quitar = new JButton("<--");
		quitar.setBounds(429, 343, 89, 23);
		frame.getContentPane().add(quitar);
		
		
		//definicion de modelos
		DefaultListModel modelo1 = new DefaultListModel();
		DefaultListModel modelo2 = new DefaultListModel();
		
		
		
		//Vector<String> competencias = obtenerCompetencias();
		
		for(String s: obtenerCompetencias()){
			modelo1.addElement(s);
		}
		JList listaCompetencias=new JList(modelo1);
		listaCompetencias.setBounds(205, 230, 138, 88);
		//
		
		
		
		
		
		JScrollPane scrollLista = new JScrollPane();
		scrollLista.setBounds(205, 230, 188, 200);
		scrollLista.setViewportView(listaCompetencias);
		frame.getContentPane().add(scrollLista);
		
		//Este vector se usa para guardar los nombres de las competencias elegidas
		Vector <String> nombreDeCompetencias = new Vector<String>();
		
		
		
		JList listaElegidas=new JList(modelo2);
		//rellenamos lista elegidas al apretar el boton "-->"
		agregar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int [] indices = listaCompetencias.getSelectedIndices();
				int numero = (listaCompetencias.getSelectedIndices()).length-1;
				for(int i :indices){
					modelo2.addElement(modelo1.elementAt(i));
					nombreDeCompetencias.add((String) modelo1.elementAt(i));
					
				}
				
				for(int i=numero; i>=0;i--){
					modelo1.removeElementAt(indices[i]);
				}
			}
		});
		
		agregar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) 
					{
						int [] indices = listaCompetencias.getSelectedIndices();
						int numero = (listaCompetencias.getSelectedIndices()).length-1;
						for(int i :indices){
							modelo2.addElement(modelo1.elementAt(i));
							nombreDeCompetencias.add((String) modelo1.elementAt(i));
							
						}
						
						for(int i=numero; i>=0;i--){
							modelo1.removeElementAt(indices[i]);
						}
					
		          }
			}
		});
		
		
		
		quitar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int [] indices = listaElegidas.getSelectedIndices();
				int numero = (listaElegidas.getSelectedIndices()).length-1;
				for(int i :indices){
					modelo1.addElement(modelo2.elementAt(i));
				}
				
				for(int i=numero; i>=0;i--){
					modelo2.removeElementAt(indices[i]);
					nombreDeCompetencias.remove(indices[i]);
				}
			}
		});
		
		quitar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER){ 
					int [] indices = listaElegidas.getSelectedIndices();
				int numero = (listaElegidas.getSelectedIndices()).length-1;
				for(int i :indices){
					modelo1.addElement(modelo2.elementAt(i));
				}
				
				for(int i=numero; i>=0;i--){
					modelo2.removeElementAt(indices[i]);
					nombreDeCompetencias.remove(indices[i]);
				}
			}}
		});
		
		JLabel lblNewLabel = new JLabel("Codigo incorrecto");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 469, 46, 14);
		//frame.getContentPane().add(lblNewLabel);
		
		aceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Boolean correcto1;
				Boolean correcto2;
				Boolean correcto3;
				Boolean correcto4;
				Boolean correcto5;
				Boolean correcto6;
				
				String cod= campo1.getText();
				String nombre= campo2.getText();
				String descripcion= campo3.getText();
				String empresa= campo4.getText();
				
				correcto1= validarCodigo(cod);
				correcto2=validarNombrePuesto(nombre);
				correcto3=validarDescripcion(descripcion);
				correcto4=validarNombreEmpresa(empresa);
				
				
				Vector<Puesto> puestos=obtenerPuestos();
				
				correcto5=codigoExistente(cod, puestos);
				correcto6=nombreExistente(nombre, puestos);
				
				
				if((correcto1)&&(correcto2)&&(correcto3)&&(correcto4)&&(correcto5)&&(correcto6)){
					
					Puesto p= new Puesto(cod, nombre, empresa, descripcion);
					AgregarPonderaciones window = new AgregarPonderaciones(nombreDeCompetencias,p);
					p.agregarPuestoABase(p);
					
				}
				
				
				//Mensajes de error
				JLabel errorCodigoIncorrecto = new JLabel("Código incorrecto.");
				JLabel errorNombreIncorrecto = new JLabel("Nombre incorrecto.");
				JLabel errorCamposIncompletos = new JLabel("Error: Uno o m\u00E1s de los campos obligatorios est\u00E1 incompleto.");
				JLabel errorDescripcionIncorrecta = new JLabel("Descripción Incorrecta.");
				JLabel errorEmpresaIncorrecta = new JLabel("Empresa Incorrecta.");
				JLabel errorCodigoExistente = new JLabel("Codigo ya existente.");
				JLabel errorNombreExistente = new JLabel("Nombre de puesto ya existente.");
				errorCodigoIncorrecto.setForeground(Color.RED);
				errorCodigoIncorrecto.setFont(new Font("Arial", Font.BOLD, 14));
				errorNombreIncorrecto.setForeground(Color.RED);
				errorNombreIncorrecto.setFont(new Font("Arial", Font.BOLD, 14));
				errorCamposIncompletos.setForeground(Color.RED);
				errorCamposIncompletos.setFont(new Font("Arial", Font.BOLD, 14));
				errorDescripcionIncorrecta.setForeground(Color.RED);
				errorDescripcionIncorrecta.setFont(new Font("Arial", Font.BOLD, 14));
				errorEmpresaIncorrecta.setForeground(Color.RED);
				errorEmpresaIncorrecta.setFont(new Font("Arial", Font.BOLD, 14));
				errorCodigoExistente.setForeground(Color.RED);
				errorCodigoExistente.setFont(new Font("Arial", Font.BOLD, 14));
				errorNombreExistente.setForeground(Color.RED);
				errorNombreExistente.setFont(new Font("Arial", Font.BOLD, 14));
				
				
				PopupFactory factory = PopupFactory.getSharedInstance();
				Popup popup = factory.getPopup(frame, errorCamposIncompletos, 120, 610);
				Popup popup2 = factory.getPopup(frame, errorCodigoIncorrecto, 550,195);
				Popup popup3 = factory.getPopup(frame, errorNombreIncorrecto, 550, 230);
				Popup popup4 = factory.getPopup(frame, errorDescripcionIncorrecta, 550, 265);
				Popup popup5 = factory.getPopup(frame, errorEmpresaIncorrecta, 550, 300);
				Popup popup6 = factory.getPopup(frame, errorCodigoExistente,120, 645);
				Popup popup7 = factory.getPopup(frame, errorNombreExistente,120, 645);
				
				if(cod.isEmpty() || nombre.isEmpty()|| descripcion.isEmpty() || empresa.isEmpty()){
					popup.show();
					ActionListener hider = new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							popup.hide();
				        }
					};
					Timer timer = new Timer(10000, hider);
					timer.start();   
				}
				
				if(!correcto1){
					//Crea el mensaje de error que se ocultará en 10 segundos
					popup2.show();
					ActionListener hider = new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							popup2.hide();
				        }
					};
					Timer timer = new Timer(10000, hider);
					timer.start();       
				}
				
				
				
				if(!correcto2){
					//Crea el mensaje de error que se ocultará en 10 segundos
					popup3.show();
					ActionListener hider = new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							popup3.hide();
				        }
					};
					Timer timer = new Timer(10000, hider);
					timer.start();
					}
				
				
				if(!correcto3){
					//Crea el mensaje de error que se ocultará en 10 segundos
					popup4.show();
					ActionListener hider = new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							popup4.hide();
				        }
					};
					Timer timer = new Timer(10000, hider);
					timer.start();
					}
				if(!correcto4){
					//Crea el mensaje de error que se ocultará en 10 segundos
					popup5.show();
					ActionListener hider = new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							popup5.hide();
				        }
					};
					Timer timer = new Timer(10000, hider);
					timer.start();
					}
				if(!correcto5){
					//Crea el mensaje de error que se ocultará en 10 segundos
					popup6.show();
					ActionListener hider = new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							popup6.hide();
				        }
					};
					Timer timer = new Timer(10000, hider);
					timer.start();
				}
				if(!correcto6){
					//Crea el mensaje de error que se ocultará en 10 segundos
					popup7.show();
					ActionListener hider = new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							popup7.hide();
				        }
					};
					Timer timer = new Timer(10000, hider);
					timer.start();
				}
				
				 
				
				
			}
		});
		
		
		
		
		
		JScrollPane scrollElegidas = new JScrollPane();
		scrollElegidas.setBounds(550, 230, 188, 200);
		scrollElegidas.setViewportView(listaElegidas);
		frame.getContentPane().add(scrollElegidas);
		
		

		
		

		
		
	}
	
	
	
	public void hacerMayusculas(KeyEvent e){
		char c = e.getKeyChar();
		if(Character.isLowerCase(c)){
			String cad=(""+c).toUpperCase();
			c=cad.charAt(0);
			e.setKeyChar(c);
		}
	}
	
	
	//Obtener todos los puestos de la BD
	public Vector<Puesto> obtenerPuestos(){
		Puesto p = new Puesto();
		Vector<Puesto> v = p.cargarPuestos();
		return v;
	}
	//Obtener todas las competencias de la BD
	public Vector<String> obtenerCompetencias(){
		Competencia c = new Competencia();
		Vector<String> v = new Vector();
		for( Competencia comp : c.cargarCompetencias()){
			v.add(comp.nombre);
		}
		return v;
	}
	
/*	public HashMap<String,JComboBox> hashComp(){
		Competencia c=new Competencia();
		HashMap<String,JComboBox> h = new HashMap<String,JComboBox>();
		for( Competencia comp : c.cargarCompetencias()){
			JComboBox n = new JComboBox();
			n.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
			h.put(comp.nombre, n);
			
		}
		return null;
		
	}*/
	//Comprobaciones:
	public Boolean validarCodigo(String cod){
		
		Boolean salida= true;
		
		if(!((cod.length()>3)&&(cod.length()<21)))salida=false;
		
		if (!sinCarEsp(cod)) 
			salida = false;
		
		return salida;
		
	}
	
	public Boolean codigoExistente(String cod, Vector <Puesto> puestos){
		
		
		for(Puesto p : puestos)
			if((((String)p.codigo).equals(cod)))
				return false;
				
		return true;
	}
	
	public Boolean nombreExistente(String nomb, Vector <Puesto> puestos){
	
	
	for(Puesto p : puestos)
		if((((String)p.nombre).equals(nomb)))
			return false;
			
	return true;
	}


	
	public Boolean validarNombrePuesto(String cadena){
	
	Boolean salida= true;
	
	if(!((cadena.length()>2)&&(cadena.length()<51)))salida=false;
	
	if (!sinCarEsp(cadena)) 
		salida = false;
	
	return salida;
	
	}
	
	public Boolean validarNombreEmpresa(String cadena){
		
		Boolean salida= true;
			
		if(!((cadena.length()>2)&&(cadena.length()<51)))salida=false;
		
		if (!((cadena).matches("([a-z]|[A-Z]|\\s)+"))) 
			salida = false;
		
		return salida;
		
	}
	public Boolean validarDescripcion(String cadena){
		
		Boolean salida= true;
		
		if(!((cadena.length()>2)&&(cadena.length()<101)))salida=false;
		
		if (!((cadena).matches("([a-z]|[A-Z]|\\s)+"))) 
			salida = false;
		
		return salida;
		
	}
	
	public Boolean sinCarEsp(String s){
		
		if (((s).matches("([a-z]|[A-Z]|\\s)+([0-9]|[a-z]|[A-Z])*"))){
			return true;
		}
			
		return false;
	}
}
