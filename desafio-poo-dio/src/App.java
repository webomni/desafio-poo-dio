import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class App {

    public static void main(String[] args) {
        try {
            Curso curso1 = new Curso();
            curso1.setTitulo("Curso java");
            curso1.setDescricao("Descrição do curso");
            curso1.setCargaHoraria(8);

            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria Java");
            mentoria.setDescricao("Descrição mentoria Java");
            mentoria.setData(LocalDate.now());

            System.out.println(curso1.getTitulo());

            // muito interesane uso de pattern para formatar data
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println(mentoria.getDescricao() + " - " + mentoria.getTitulo() + " - "
                    + mentoria.getData().format(formatter));

        } catch (Exception e) {
            System.err.println("Houve um erro !" + e.getMessage());
        }

    }
}
