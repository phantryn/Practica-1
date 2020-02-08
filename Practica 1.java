import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*; 
 
public class practicados extends JFrame

 {   
 private JButton botonSimple1;
 private JButton botonSimple2;    	
 private JTextField campoTexto1;
 private JTextField campoTexto2; 
 private JTextField contra;  	
 private String claveadm="1";
 private String claveusu="2";
 	
 	 // configurar GUI    
 	 public practicados()   
 	 	 {
 	  //super( "MI PRIMER BOTON" );             
 	  JFrame ven = new JFrame("Practica 1 ");
 	  ven.setLayout(null);              
 	  	ven.setBounds(5,10,700,600);               
 	   ven.setVisible(true);    
 
 
      // crear botones       
      botonSimple1 = new JButton( "mensaje" );  
      ven.add( botonSimple1 );       
      botonSimple1.setBounds(150,250,400,100);      
     
     
    // botonSimple2 = new JButton( "ACCESAR COMO USUARIO" );        
      //ven.add( botonSimple2 );       
      //botonSimple2.setBounds(150,300,400,100);
      // crear mensajes de texto con tamaño predeterminado           
      JLabel nombre= new JLabel();   
     ven.add(nombre);   
     nombre.setBounds(220,2,600,200);   
    nombre.setFont(new Font("Arial Black",Font.BOLD,15));   
     nombre.setForeground(Color.BLACK);   
     nombre.setText("Nombre: Carlos Manuel Diaz Reyes");
     
     JLabel carrera= new JLabel();   
     ven.add(carrera);   
     carrera.setBounds(170,35,500,200);   
     carrera.setFont(new Font("Arial Black",Font.BOLD,15));   
     carrera.setForeground(Color.BLACK);   
     carrera.setText("Carrera: Ingenieria en Sistemas Computacionales"); 
      
     JLabel control= new JLabel();   
     ven.add(control);   
     control.setBounds(300,80,500,200);   
     control.setFont(new Font("Arial Black",Font.BOLD,15));   
     control.setForeground(Color.BLACK);   
     control.setText("N/C: 181160142");      
    
     //contra = new JTextField( 15 );          
     // ven.add( contra );     
      //contr 
                   
    ManejadorBoton manejador = new ManejadorBoton();       
    botonSimple1.addActionListener( manejador );                   
      	
    ManejadorBoton2 manejador2 = new ManejadorBoton2();       
    botonSimple2.addActionListener( manejador2 );           
     
      	
      	
          } // fin del constructor 
         
          public void nom(){
          	String nom2=campoTexto1.getText();
          }
 
   public static void main( String args[] )    {  
 
 
      practicados aplicacion = new practicados();    }
      
 //ACCION DEL BOTON 1   
       private class ManejadorBoton implements ActionListener  
       	
       	 {     
       // manejar evento de botón      
        private JButton botonv2;
        private JButton botonSimple1;  
        	
        public void actionPerformed( ActionEvent evento )      
        	 {
                         
        JFrame vdos = new JFrame("MENSAJE");
    	vdos.setLayout(null);              
 	    vdos.setBounds(690,10,700,600);               
 	    vdos.setVisible(true);  
 	    	
 	    JLabel direc= new JLabel();   
     vdos.add(direc);   
     direc.setBounds(230,0,500,200);   
     direc.setFont(new Font("Arial BLACK",Font.BOLD,15));   
     direc.setForeground(Color.BLACK);   
     direc.setText("Direccion: Barrio Nuevo");
     
     JLabel telefono= new JLabel();   
     vdos.add(telefono);   
     telefono.setBounds(240,35,500,200);   
     telefono.setFont(new Font("Arial BLACK",Font.BOLD,15));   
     telefono.setForeground(Color.BLACK);   
     telefono.setText("Telefono: 9581319586"); 
      
     JLabel genero= new JLabel();   
     vdos.add(genero);   
     genero.setBounds(260,75,500,200);   
     genero.setFont(new Font("Arial BLACK",Font.BOLD,15));   
     genero.setForeground(Color.BLACK);   
     genero.setText("Genero: Masculino");     
 	    	
 	 
      ManejadorBoton3 manejador3 = new ManejadorBoton3();       
    botonv2.addActionListener( manejador3 );            
         	 } 
 
         } 
         	
      