package tarea.algoritmos.pkg2;
import java.util.*; 
import java.io.IOException;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author massa
 */
public class Calculos {
       public static void LeerArchivos(File f) throws IOException {
           Vector<String[]> operacion = new Vector<String[]>(5);
           FileReader fr = new FileReader(f); 
           BufferedReader br = new BufferedReader(fr);
           double suma = 0;
           String temp = "";
           double resta = 0;
           double multi = 0; 
           double div = 0;
           String line; 
           Calculadora calc = new Calculo(); 
           int size;
           while((line = br.readLine())!= null){
                System.out.println("El resultado de la "+line+" es "+calc.operar(line));
                operacion.add(line.split("")); 
           }
           size = operacion.size();
       }
       public static void main(String[] args){
           File f =  new File("src/datos.txt"); 
           try{
               LeerArchivos(f);
           }
           catch(IOException e){
               e.printStackTrace();
           }
       }
}