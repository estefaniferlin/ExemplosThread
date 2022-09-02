package extendsthread;

/**
 *
 * @author 20202PF.CC0011
 */
public class Main {
    
    public static void main(String[] args){
        
        // por parametro passo um texto, que em tese será um nome de thread
        ExtendsThread t1 = new ExtendsThread("Thread1"); // 1º objeto instanciado    
        t1.start(); // 2º passa thread para o estado de iniciada
        
        // posso chamar uma ou n threads, instanciando cada uma e iniciando elas
        ExtendsThread t2 = new ExtendsThread("Thread2");
        t2.start();  
        
        //shift + f6 aqui para rodar
        // nao temos sincronização dasthreads, entao a execução delas aqui não será a mesma para todas as pessoas que executarem isso
        // por exemplo, a do professor primeiro executou todas as 1 e depois todas as 2, e a minha aqui executou um pouco de cada
        // Isso ocorre por nao ter sincronização
        
    }
    
}
