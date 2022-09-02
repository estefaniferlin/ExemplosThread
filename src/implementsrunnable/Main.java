/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementsrunnable;

/**
 *
 * @author 20202PF.CC0011
 */
public class Main {
    
    public static void main(String[]args){
        
        ImplementsRunnable t1 = new ImplementsRunnable("Thread1");
        
        // java por padrao trabalha com a classe thread, entao com o implements preciso isstanciar a classe thread
        
        Thread thread1 = new Thread(t1);    
        thread1.start();
        
        // Preciso iniciar a thread e depois das o start, pois o t1 nao tem o metodo start para chamar o runn
        // Entao primeiro preciso instanciar a classe que vai instanciar as threads, e ai sim dar start
         
        
    }
    
}
