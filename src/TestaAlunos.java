import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {

        //garante que não haja repetição
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Mocp Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Maruicio Aniche");
        alunos.add("Alberto Souza");

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println(alunos);

        alunos.forEach(aluno -> {
            System.out.println(alunos);
        });
    }
}
