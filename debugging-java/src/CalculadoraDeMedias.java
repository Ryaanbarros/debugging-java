// o debugging é muito util para encontrar os erros, basta colocar o breakpoint(bolinha vermelha) no espaço que acha que está com o erro e vai executando linha por linha, neste caso tem interação com usuario/teclado (Scanner)... por tanto da pra ir interagindo usando debugging e ir encotrando e fazendo os testes... usando o debuggin quando estava tudo INT eu vi que a soma estava correta, por tanto não era erro na soma, e sim o erro estava no tipo da variavel que devia ser double

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan); // simulando as notas 7,6,5,4 a média é 5,5.. e se for int o sistema irá dar média de 5, ou seja, está com erro semantica... para corrigir o certo é ser double ao invés do int.. mas precisamos do debugging para achar o erro, pois o sistema em si não mostra pra gente, afinal o código rodou bonitinho

        System.out.printf("Média da turma %.1f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0; //se aqui fosse int também estaria errado, o código originalmente tava com int a onde era doble para simular o erro
        for(String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }

}

