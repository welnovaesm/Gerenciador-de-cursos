public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 10));
        javaColecoes.adiciona((new Aula( "Modelando com coleções", 25)));

        Aluno a1 = new Aluno("Rodrigo Turini", 34567);
        Aluno a2 = new Aluno("Guilherme Santana", 23451);
        Aluno a3 = new Aluno("Mauricio Kobsch", 24569);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem é o aluno com matricula 23451?");
        Aluno aluno = javaColecoes.buscarMatricula(23451);
        System.out.println("Aluno : " + aluno);
    }
}
