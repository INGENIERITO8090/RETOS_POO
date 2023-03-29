package Salud;
public class Empleado extends Persona { 
private String cargo ;
private int valorhora;
private int horastrabajadas ;
private String departamento; 
         int totalapagar;

public Empleado(String tipoDoc, int documento, String nombre, String apellido, String sexo, int edad,  double peso, double estatura, String cargo, int valorhora, int horastrabajadas2, String departamento
                ) {
            super(tipoDoc, documento, nombre, apellido, sexo, edad, peso, estatura);
            this.cargo = cargo;
            this.valorhora = valorhora;
            this.horastrabajadas = horastrabajadas2;
            this.departamento = departamento;
           
        }

  


public void pedirDatos() {
   getTipoDoc();
   getDocumento();
   getNombre();
   getApellido();
    getCargo();
    getValorhora();
    getDepartamento();
    getHorastrabajadas();
  
 };




 
 
  
public void calcularHonorarios(){
  
    int  honorarios=(int) ( getValorhora()* getHorastrabajadas());
        
    int resultado = (int) (honorarios*(0.966/100.0)); // Calcula el porcentaje

    int totalapagar = honorarios-resultado;

  
  System.out.println( "total a pagar "+ totalapagar);
}   

  public void mostrarEmpleado() { 
    System.out.println("su tipo de documento"+getTipoDoc());
    System.out.println("su documento"+getDocumento());
    System.out.println("su nombre "+ getNombre() );
    System.out.println("su apellido " +getApellido());
    System.out.println( "su cargo es "+getCargo());
   System.out.println(" valor hora trabajada "+ getValorhora());
   System.out.println( "horas trabajadas"+getHorastrabajadas());
  
  }

public String getCargo() {
    return cargo;
}



public void setCargo(String cargo) {
    this.cargo = cargo;
}



public int getValorhora() {
    return valorhora;
}



public void setValorhora(int valorhora) {
    this.valorhora = valorhora;
}



public double getHorastrabajadas() {
    return horastrabajadas;
}



public void setHorastrabajadas(int horastrabajadas) {
    this.horastrabajadas = horastrabajadas;
}



public String getDepartamento() {
    return departamento;
}



public void setDepartamento(String departamento) {
    this.departamento = departamento;
}








}
