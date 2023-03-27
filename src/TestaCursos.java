import java.util.ArrayList;
import java.util.List;

public class TestaCursos {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");
        List<Aula> aulas = javaColecoes.getAulas();


        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        List<Aula> aulasImutavel = javaColecoes.getAulas();


        System.out.println(aulas);



    }
}
