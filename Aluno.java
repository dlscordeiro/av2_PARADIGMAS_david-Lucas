/**
 * Representa um aluno com número de chamada, nome e nota.
 */
public class Aluno {

    private static final double NOTA_MINIMA = 6.0;

    private final int chamada;
    private final String nome;
    private double nota;

    public Aluno(int chamada, String nome, double nota) {
        this.chamada = chamada;
        this.nome = nome;
        setNota(nota);
    }

    public int getChamada() {
        return chamada;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
        this.nota = nota;
    }

    public String getSituacao() {
        return nota >= NOTA_MINIMA ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return String.format("Chamada: %d | %s | %.1f | %s", chamada, nome, nota, getSituacao());
    }
}
