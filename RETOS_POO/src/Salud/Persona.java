
package Salud;
// IMPORTAMOS LAS CLASES DE LOS  OBJETOS A UTILIZAR  
import java.util.Scanner;

public class Persona {
     
// atributos 
 private int documento;
 private int edad;
 private String  nombre;
 private String apellido;
 private String tipoDoc;
 private String sexo;
 private  double peso;
 private double estatura; 
    double pesoActual=0;
   
 // creamos  el metodo contructor sin argumentos 
public Persona(){};

// creamos el metodo constructor con argumentos 
 public Persona(String tipoDoc,int documento, String nombre,String apellido,String sexo,int edad,double peso,double estatura) {
        this.tipoDoc = tipoDoc;     
      this.nombre = nombre;
      this.apellido = apellido;
       this.sexo = sexo;
      this.edad = edad;
      this.documento = documento;
      this.peso = peso;
      this.estatura = estatura;

     }

     // creamos un objeto de la clase scaneer 

 Scanner leer = new Scanner(System.in); 

// creamos un metodo sin retorno y sin parametros 
public void pedirDatos() {
   
System.out.println( " escriba su tipo de documento ");
tipoDoc = leer.next();
System.out.println( " digite el numero de su documento ");
documento = leer.nextInt(); 
System.out.println(" escriba su  nombre ");
nombre =leer.next(); 
System.out.println("escriba su apellido ");
apellido  =leer.next();
System.out.println( " escriba su sexo ");
sexo=leer.next(); 
System.out.println( " escriba su edad ");
edad=leer.nextInt();   
System.out.println("digite su peso ");
peso=leer.nextDouble();
System.out.println( "digite su estatura");
estatura=leer.nextDouble();
}

// creamos un metodo sin retorno y sin parametros 
public void mostrarPersona() { 

        System.out.println("su tipo de documento "+ getTipoDoc());
  
        System.out.println("el numero de su documento "+ getDocumento());
 
        System.out.println("su nombre " + getNombre());
        
        System.out.println("su apellido " + getApellido());
   
        System.out.println("su sexo " + getSexo());
         
        System.out.print(" su edad "+getEdad()); 

        System.out.println(" su peso en kg " + getPeso());
        System.out.println("su estatura "+getEstatura());
        
 }  
  
   
// creamos un metodo con retorno tipo double con los parametros de tipo duble  ponemos get peso para que se ejecute solo si el atributo peso ya tiene un valor  este metodo va a retornar el resultado de la opreracion pesoActual
 public double  calcularImc(  double getPeso){  
     pesoActual=0;
     pesoActual =( getPeso())/(getEstatura()*getEstatura());
    
     System.out.println(pesoActual);

    return  pesoActual;



   

 }
 
                
                    public void mayorEdad () {       

                    if (getEdad()>=18){
                    System.out.println("eres mayor de edad ");
                        } 
                     else if ( getEdad()<18){
                     System.out.println( " eres menor de edad");
                        } 
                        

                    }

                    public int getDocumento() {
                        return documento;
                    }

                    public void setDocumento(int documento) {
                        this.documento = documento;
                    }

                    public int getEdad() {
                        return edad;
                    }

                    public void setEdad(int edad) {
                        this.edad = edad;
                    }

                    public String getNombre() {
                        return nombre;
                    }

                    public void setNombre(String nombre) {
                        this.nombre = nombre;
                    }

                    public String getApellido() {
                        return apellido;
                    }

                    public void setApellido(String apellido) {
                        this.apellido = apellido;
                    }

                    public String getTipoDoc() {
                        return tipoDoc;
                    }

                    public void setTipoDoc(String tipoDoc) {
                        this.tipoDoc = tipoDoc;
                    }

                    public String getSexo() {
                        return sexo;
                    }

                    public void setSexo(String sexo) {
                        this.sexo = sexo;
                    }

              

                    public double getPeso() {
                        return peso;
                    }

                    public void setPeso(double peso) {
                        this.peso = peso;
                    }

                    public double getEstatura() {
                        return estatura;
                    }

                    public void setEstatura(double estatura) {
                        this.estatura = estatura;
                    }

                    public Scanner getLeer() {
                        return leer;
                    }

                    public void setLeer(Scanner leer) {
                        this.leer = leer;
                    }
                    

                    }
