
public class App {
    public static void main(String[] args){ // um programa java começa pelo metodo main e termina pelo metodo main, esse código é a prova disso...
        System.out.println("Iniciou o programa no método main");
        a(); //aqui pula pro metodo a
        System.out.println("Finalizou o programa no método main");
    }
    

    static void a(){ //o public na criação desse método foi omitido, mas poderia estar ali sem problemas, vai acontumando com códigos sem public porque pode aparecer em projetos de outras pessoas, por patrão será public
        System.out.println("Entrou no método a.");
        b(); ////aqui pula pro metodo b
        System.out.println("Finalizou o método a."); //Método A encerrado volta para encerrar o main
    }

    static void b(){
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c(); //aqui pula pro metodo c
        System.out.println("Finalizou o método b."); //Método B encerrado volta para encerrar o A
    }

    static void c(){
        System.out.println("Entrou no método c.");
        Thread.dumpStack();   //Esse metodo mostra a pilha de execução, esse metodo só é recomendado utilizar quando será feito a depuração/debugging do código
        System.out.println("Finalizou o método c.");  //Método C encerrado volta para encerrar o B
    }
}
