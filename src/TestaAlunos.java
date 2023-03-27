import java.util.*;

public class TestaAlunos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Larissa Fernandes");
        alunos.add("Sofia Freitas");
        alunos.add("Marina Silva");
        alunos.add("Miguel Fernandes");

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        alunos.remove("Larissa Fernandes");
        System.out.println(pauloEstaMatriculado);


        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });
        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);

    }
}
