import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeChamada {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de alunos na turma: ");
        int numAlunos = input.nextInt();
        ArrayList<String> alunos = new ArrayList<String>();

        int[] faltas = new int[numAlunos];



        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nomes = scanner.next();
            alunos.add(nomes);
            faltas[i] = 0;
        }



        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);
        int contFaltas = 0;
       List<Integer> falta = new ArrayList<>();
        System.out.println("Quantas faltas o aluno teve na semana?");
        int falt;
        for (int i = 0; i < numAlunos; i++) {
            System.out.print(alunos.get(i) + ": ");
            falt = Integer.parseInt(scanner.next());
            falta.add(falt);
            contFaltas = contFaltas + falta.get(i);
        }



        // Exibe a lista de alunos e suas faltas
        System.out.println("Lista de alunos e faltas:");
        for (int i = 0; i < numAlunos; i++) {
            System.out.println(alunos.get(i) + " - " + falta.get(i));
        }

    }


}