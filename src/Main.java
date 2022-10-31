import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição de Mentoria de Java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devWesley = new Dev();
        devWesley.setNome("Wesley");
        devWesley.inscreverBotcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Wesley: " + devWesley.getConteudoInscritos());

        devWesley.progredir();
        devWesley.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos de Wesley: " + devWesley.getConteudoInscritos());
        System.out.println("Conteúdos concluídos de Wesley: " + devWesley.getConteudosConcluidos());
        System.out.println("XP: " + devWesley.calcularTotalXp());

        System.out.println("\n----------\n");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBotcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudoInscritos());

        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudoInscritos());
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }
}
