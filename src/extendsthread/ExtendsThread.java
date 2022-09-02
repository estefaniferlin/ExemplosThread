package extendsthread;

/**
 *
 * @author 20202PF.CC0011
 */
public class ExtendsThread extends Thread{
    
    // por ser extensao, temos que setar uma variavel (super) que vai receber o nome da thread
    public ExtendsThread(String text){       
        super(text);        
    }
    
    // tudo que estiver aqui dentro será executado pela thread, e dentro de run por padrao sempre colocamos tratamente de exceção com try catch
    public void run(){
        
        try{
            
            for(int i=0; i<10; i++){
                System.out.println(i + " " + this.getName());
            }
            
            sleep((long)(Math.random() * 1000));
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println("Finalizando o THREAD " + this.getName());
        
    }
    
}
