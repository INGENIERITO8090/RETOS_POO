package Principal;

import java.util.Scanner;
import Juego.Juego;
import Juego.piedrapapel;
import Figura.*;
import Salud.Empleado;
import Salud.Persona;  

public class Inicio{ 
 
     public static void main(String[] args) { 



      int documento,edad,valorhora,horastrabajadas;
    String nombre,apellido,sexo,tipoDoc,cargo,departamento;
    double peso,estatura;
      double pesoActual=0;
    Scanner leer= new Scanner(System.in);
    
        
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
        System.out.println("digite peso en kg");
        peso=leer.nextDouble();
        System.out.println("digite estarura");
        estatura=leer.nextDouble();
        System.out.println(" escriba el cargo que ejerce en la empreza");
        cargo=leer.next();
        System.out.println("digite el valor de la hora de su trabajo ");
        valorhora=leer.nextInt();
        System.out.println("digite las  horas trabajadas");
        horastrabajadas=leer.nextInt();
        System.out.println("digite en el departamento en el que ejerce su funcion ");
        departamento=leer.next();



        Persona persona = new Persona(tipoDoc,documento,nombre,apellido,sexo,edad,peso,estatura);
        Empleado empleado= new Empleado(persona.getTipoDoc(),persona.getDocumento(),persona.getNombre(),persona.getApellido(),persona.getSexo(),persona.getEdad(),persona.getPeso(),persona.getEstatura(),cargo,valorhora,horastrabajadas,departamento);

        empleado.pedirDatos();
        empleado.mostrarEmpleado();
        empleado.calcularHonorarios();

    
   /* int desicion,rp,i=0; 
    Scanner leer= new Scanner(System.in ); 


   do {
   
    System.out.println(" digite la figura la cual desea calcular su area \n1: circulo \n2: rectangulo\n3: triangulo   " ); 
    desicion=leer.nextInt();


     switch (desicion){

        case 1 :  
           Float radio ;
          System.out.println(" digite el radio del circulo ");

           radio=leer.nextFloat();


          Circulo circulo = new Circulo(radio);

          circulo.calcaularArea();
         break;

         case 2 :

         float base,altura;
         System.out.println( "digite la base de el rectangulo ");
         base=leer.nextFloat();
         System.out.println("digite la altura del rectangulo ");
         altura=leer.nextFloat();

         Rectangulo rectangulo = new Rectangulo(altura, base);

          rectangulo.calcaularArea();
        break ;
        
        case 3 :  
        float base1,altura1; 
        
        System.out.println( "digite la base de el triangulo  ");
        base1=leer.nextFloat();
        System.out.println("digite la altura del triangulo ");
        altura1=leer.nextFloat();
     
        
        Triangulo triangulo = new Triangulo(base1, altura1);

        triangulo.calcaularArea();

        break;

      } 


      System.out.println(" digite 0 si desea repetir el programa de nuevo o   1 para salir del programa ");
       rp=leer.nextInt();
          

       switch (rp ){
     
         case 0 :  
         i=i+0;
         break;
         case 1 :
         i=i+1;





       }



    }while( i==0 );
      
System.out.println( " quchau ");
*/



    /*    Persona persona = new Persona();
       persona.pedirDatos(); 
       persona.mostrarPersona();
    



       Double condicion = persona.calcularImc(  persona.getPeso() );
       if (condicion<20){ 
      System.out.println( " PESO BAJO ");
       }
  
       else if (condicion>=20 && condicion<=25){
  
      System.out.println( "PESO IDEAL " );
  
       }
       else if (condicion>25){
      System.out.println(" SOBRE PESO  ");
  
       }
        
          persona.mayorEdad();*/
    
    /*   Juego ppt= new piedrapapel();

      ppt.iniciar();
      ppt.jugar();
      ppt.finalizar();
*/





   
  /*   int documento,edad,valorhora;
    String nombre,apellido,sexo,tipoDoc,cargo,departamento;
    double peso,estatura,horastrabajadas;
      double pesoActual=0;
    Scanner leer= new Scanner(System.in);
    
        
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
        System.out.println("digite peso en kg");
        peso=leer.nextDouble();
        System.out.println("digite estarura");
        estatura=leer.nextDouble();
        System.out.println(" escriba el cargo que ejerce en la empreza");
        cargo=leer.next();
        System.out.println("digite el valor de la hora de su trabajo ");
        valorhora=leer.nextInt();
        System.out.println("digite lasa horas trabajadas");
        horastrabajadas=leer.nextInt();
        System.out.println("digite en el departamento en el que ejerce su funcion ");
        departamento=leer.next();




        Persona persona = new Persona( tipoDoc, documento, nombre,apellido,sexo,edad,peso,estatura);
        Empleado empleado= new Empleado(persona.getTipoDoc(),persona.getDocumento(),persona.getNombre(),persona.getApellido(),persona.getSexo(),persona.getEdad(),persona.getPeso(),persona.getEstatura(),cargo,valorhora,horastrabajadas, valorhora, departamento);
        
  
      

 




   




*/


 
    }





}



