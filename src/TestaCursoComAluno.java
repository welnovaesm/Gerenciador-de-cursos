public class TestaCursoComAluno {
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

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a -> {
            System.out.println(a);
        });

        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 34567);
        System.out.println("E esse turini, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("O a1 é equals ao turini?");
        System.out.println(a1.equals(turini));
    }
}
