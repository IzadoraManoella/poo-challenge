package br.com.dio.desafio.dominio;

import br.com.dio.desafio.dominio.Curso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js ");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
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

        Dev devIzadora = new Dev();
        devIzadora.setNome("Izadora");
        devIzadora.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Izadora:" + devIzadora.getConteudosInscritos());
        devIzadora.progredir();
        devIzadora.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Izadora:" + devIzadora.getConteudosInscritos());
        System.out.println("Conteúdos Conteúdos Izadora:" + devIzadora.getConteudosConcluidos());
        System.out.println("XP:" + devIzadora.calcularTotalXp());

        System.out.println("-------");


        Dev devRhuan = new Dev();
        devRhuan.setNome("Rhuan");
        devRhuan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rhuan:" + devRhuan.getConteudosInscritos());
        devRhuan.progredir();
        devRhuan.progredir();
        devRhuan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rhuan:" + devRhuan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Rhuan:" + devRhuan.getConteudosConcluidos());
        System.out.println("XP:" + devRhuan.calcularTotalXp());






    }
}
