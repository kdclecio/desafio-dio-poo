import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de js");
        curso2.setDescricao("descrição curso javaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BooteCamp Java Developer");
        bootCamp.setDescricao("Descrição BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devClecio = new Dev();
        devClecio.setNome("Clécio");
        devClecio.inscreverBootCamp(bootCamp);
        devClecio.progredir();
        devClecio.progredir();

        System.out.println("Conteudos inscritos Clécio: " + devClecio.getConteudosInscritos());
        System.out.println("--");
        System.out.println("Conteudos concluidos Clécio: " + devClecio.getConteudosConcluidos());
        System.out.println("XP: " + devClecio.calcularXp());

        Dev devFulano = new Dev();
        devFulano.setNome("Fulano");
        devFulano.inscreverBootCamp(bootCamp);
        devFulano.progredir();
        devFulano.progredir();
        devFulano.progredir();

        System.out.println("++++++++++");
        System.out.println("Conteudos inscritos Fulano: " + devFulano.getConteudosInscritos());
        System.out.println("--");
        System.out.println("Conteudos concluidos Fulano: " + devFulano.getConteudosConcluidos());
        System.out.println("XP: " + devFulano.calcularXp());
    }
}
