package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 =new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("descricao da mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devDavid = new Dev();
        devDavid.setNome("David");
        devDavid.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos David" + devDavid.getConteudosInscritos());
        devDavid.progredir();
        System.out.println("Conteudos concluidos David" + devDavid.getConteudosConcluidos());
        System.out.println("XP = " + devDavid.calcularXp());

        Dev devJhonata = new Dev();
        devJhonata.setNome("Jhonata");
        devJhonata.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Jhonata" + devJhonata.getConteudosInscritos());
        devJhonata.progredir();
        System.out.println("Conteudos concluidos Jhonata" + devJhonata.getConteudosConcluidos());
        System.out.println("XP = " + devJhonata.calcularXp());
    }

}
