import java.util.Scanner;

/**
 * Interface de terminal (menu) do sistema.
 */
public class Sistema {

    private final Turma turma = new Turma();
    private final Scanner scanner = new Scanner(System.in);

    public void executar() {
        while (true) {
            System.out.print("\n1. Cadastrar | 2. Listar | 3. Sair\nOpção: ");
            String opcao = scanner.nextLine().trim();

            switch (opcao) {
                case "1" -> cadastrarAluno();
                case "2" -> listarAlunos();
                case "3" -> {
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private void cadastrarAluno() {
        try {
            System.out.print("Chamada: ");
            int chamada = Integer.parseInt(scanner.nextLine().trim());
            System.out.print("Nome: ");
            String nome = scanner.nextLine().trim();
            System.out.print("Nota: ");
            double nota = Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));

            turma.cadastrar(new Aluno(chamada, nome, nota));
            System.out.println("Aluno cadastrado!");
        } catch (NumberFormatException e) {
            System.out.println("Erro: valor numérico inválido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private void listarAlunos() {
        if (turma.estaVazia()) {
            System.out.println("Nenhum aluno cadastrado.");
            return;
        }
        for (Aluno aluno : turma.getAlunos()) {
            System.out.println(aluno);
        }
        System.out.printf("Média: %.1f | Maior: %.1f | Menor: %.1f%n",
                turma.media(), turma.maiorNota(), turma.menorNota());
    }
}
