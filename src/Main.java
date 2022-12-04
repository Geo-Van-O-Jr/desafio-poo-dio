import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("iniciando na linguagem Java.");
        curso1.setCargaHoraria(151);

        Curso curso2 = new Curso();
            curso1.setTitulo("Curso de Typescript");
            curso1.setDescricao("Melhor que javascript");
            curso1.setCargaHoraria(42);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Monitoria do curso de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }

}
