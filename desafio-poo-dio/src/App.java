import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {

    public static void main(String[] args) {
        try {
            Curso curso1 = new Curso();
            curso1.setTitulo("Curso java");
            curso1.setDescricao("Descrição do curso de Java");
            curso1.setCargaHoraria(8);

            Curso curso2 = new Curso();
            curso2.setTitulo("Curso Js");
            curso2.setDescricao("Descrição do curso de Js");
            curso2.setCargaHoraria(4);

            Mentoria mentoria = new Mentoria();
            mentoria.setTitulo("Mentoria Java");
            mentoria.setDescricao("Descrição mentoria Java");
            mentoria.setData(LocalDate.now());

            /*
             * System.out.println(curso1);
             * // Conteudo conteudo = new Conteudo();
             * System.out.println(mentoria);
             */
            // Criando um Bootcamp
            Bootcamp bootcamp = new Bootcamp();
            bootcamp.setName("Bootcamp Java Developer");
            bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
            bootcamp.getConteudos().add(curso1);
            bootcamp.getConteudos().add(curso2);
            bootcamp.getConteudos().add(mentoria);

            // criar os Devs
            Dev devCamila = new Dev();
            devCamila.setNome("Camila");
            // imprimir o conteudo que cada dev esta inscrito Antes da Matricula
            // System.out.println("Conteúdo Inscrito Camila - Antes da Matricula: " +
            // devCamila.getConteudosInscritos());
            // escrever Camila no bootcamp
            devCamila.inscreverBootcamp(bootcamp);
            // imprimir o conteudo que cada dev esta inscrito Depois da matricula
            System.out.println("Conteúdo Inscrito Camila - Antes da Matricula: " + devCamila.getConteudosInscritos());
            System.out.println("-");
            // imprimir o conteudo Concluido
            devCamila.progredir();
            System.out.println("Conteúdo concluidos Camila: " + devCamila.getConteudosConcluidos());
            System.out.println("Conteúdo inscrito Camila  : " + devCamila.getConteudosInscritos());
            System.out.println("XP : " + devCamila.calcularTotalXp());

            System.out.println("--------------------------------------");
            Dev devJoao = new Dev();
            devCamila.setNome("João");
            // imprimir o conteudo que cada dev esta inscrito Antes da Matricula
            // System.out.println("Conteúdo Inscrito João - Antes da Matricula: " +
            // devJoao.getConteudosInscritos());
            // escrever Camila no bootcamp
            devJoao.inscreverBootcamp(bootcamp);
            // imprimir o conteudo que cada dev esta inscrito Depois da matricula
            System.out.println("Conteúdo Inscrito João - Antes da Matricula: " + devJoao.getConteudosInscritos());
            System.out.println("-");
            devJoao.progredir();
            devJoao.progredir();
            // imprimir o conteudo Concluido
            System.out.println("Conteúdo concluidos João: " + devJoao.getConteudosConcluidos());
            System.out.println("Conteúdo inscrito João  : " + devJoao.getConteudosInscritos());
            System.out.println("XP : " + devCamila.calcularTotalXp());
        } catch (Exception e) {
            System.err.println("Houve um erro !" + e.getMessage());
        }

    }
}
