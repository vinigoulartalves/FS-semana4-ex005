package Objetos;

public class Curso {
    public String nome;
    public String descricao;
    public String professores;
    public String cargaHoraria;

    public void progresso() {
        System.out.println("O curso " + nome + " está completo.");
    }

    public void notas() {
        System.out.println("É necessário pelo menos média 7.0 para aprovação.");
    }

    public void participacao() {
        System.out.println("É necessário pelo menos 70% de participação para aprovação.");
    }
}
