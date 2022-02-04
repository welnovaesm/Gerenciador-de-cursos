import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona((new Aula( "Modelando com coleções", 22)));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        //evita criar um for, pois a biblioteca do java já ajuda nessa questão de ordenar
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);
    }

}