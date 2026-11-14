import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Gerencia uma coleção de alunos e calcula estatísticas da turma.
 */
public class Turma {

    private final List<Aluno> alunos = new ArrayList<>();

    public void cadastrar(Aluno aluno) {
        for (Aluno a : alunos) {
            if (a.getChamada() == aluno.getChamada()) {
                throw new IllegalArgumentException("Já existe aluno com a chamada " + aluno.getChamada() + ".");
            }
        }
        alunos.add(aluno);
    }

    public boolean estaVazia() {
        return alunos.isEmpty();
    }

    public double media() {
        if (alunos.isEmpty()) {
            return 0.0;
        }
        double soma = 0;
        for (Aluno a : alunos) {
            soma += a.getNota();
        }
        return soma / alunos.size();
    }

    public double maiorNota() {
        double maior = Double.NEGATIVE_INFINITY;
        for (Aluno a : alunos) {
            maior = Math.max(maior, a.getNota());
        }
        return maior;
    }

    public double menorNota() {
        double menor = Double.POSITIVE_INFINITY;
        for (Aluno a : alunos) {
            menor = Math.min(menor, a.getNota());
        }
        return menor;
    }

    public List<Aluno> getAlunos() {
        return Collections.unmodifiableList(alunos);
    }
}
