package implementsrunnable;

/**
 *
 * @author 20202PF.CC0011
 */
public class ImplementsRunnable implements Runnable{

    private String text;  // com isso declarado, preciso criar os metodos get e set
    
    public ImplementsRunnable(String text){
        this.text = text;
    }
    
    @Override
    public void run() {
        try{
            
            for(int i=0; i<10; i++){
                System.out.println(i + " " + this.getText());  // como estamos implementando nao extendo nao temos o getname tambem, mas temos o gettext que refatoramos
            }
            
            Thread.sleep((long)(Math.random() * 1000));  // por padrao preciso botar na frente o Thread.
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        System.out.println("Finalizando o THREAD " + this.getText());
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
     
}
