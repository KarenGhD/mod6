import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeChamada {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<String>();

        // Adiciona os nomes dos alunos à lista
       System.out.println("Digite a lista de alunos  (digite 'fim' para parar):");
       String nomeAluno = scanner.nextLine();
        while (!nomeAluno.equalsIgnoreCase("fim")) {
            alunos.add(nomeAluno);
            nomeAluno = scanner.nextLine();
        }

        // Realizando a chamada
        //data de input

        int presenca = 0, presenca2 = 0;
        String data1 = new String("dd/MM/yyyy");
        System.out.println("Digite a data da chamada na semana:");
        data1 = scanner.nextLine();

        System.out.println("Digite o nome dos alunos presentes (digite 'fim' para parar):");
        nomeAluno = scanner.nextLine();
        while (!nomeAluno.equalsIgnoreCase("fim")) {
            if (alunos.contains(nomeAluno)) {
                System.out.println(nomeAluno + " está presente.");
                presenca = 1;

            } else {
                System.out.println("Não há um aluno com esse nome.");
            }
            nomeAluno = scanner.nextLine();
        }

        String data2 = new String("dd/MM/yyyy");
        System.out.println("Digite a data da chamada na semana:");
        data2 = scanner.nextLine();

        System.out.println("Digite o nome dos alunos presentes (digite 'fim' para parar):");
        nomeAluno = scanner.nextLine();
        while (!nomeAluno.equalsIgnoreCase("fim")) {
            if (alunos.contains(nomeAluno)) {
                System.out.println(nomeAluno + " está presente.");
                presenca2 = presenca + 1;
                for (String name : alunos) {
                    System.out.println("O aluno:" + nomeAluno + " " + "esteve presente: " + presenca2 + " dia(s) da semana");
                }


            } else {
                System.out.println("Não há um aluno com esse nome.");
            }
            nomeAluno = scanner.nextLine();


        }

// Fechando o scanner
        scanner.close();

    }

        //removendo o nome do aluno para não haver duplicação, já que tem-se apenas 2 aulas
        //alunos.remove(nomeAluno);

}






