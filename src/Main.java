import java.time.LocalDate;

import desafio_dio.dominio.Bootcamp;
import desafio_dio.dominio.Curso;
import desafio_dio.dominio.Dev;
import desafio_dio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ana" + devAna.getConteudosInscritos());

        devAna.progredir();
        devAna.progredir();

        System.out.println("\nConteúdos Inscritos Ana" + devAna.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos Ana" + devAna.getConteudosConcluidos());
        System.out.println("XP: " + devAna.calcularTotalXp());

        System.out.println("\n-------------------------");

        Dev devKiany = new Dev();
        devKiany.setNome("Kiany");
        devKiany.inscreverBootcamp(bootcamp);
        System.out.println("\nConteúdos Inscritos Kiany" + devKiany.getConteudosInscritos());

        devKiany.progredir();

        System.out.println("\nConteúdos Inscritos Kiany" + devKiany.getConteudosInscritos());
        System.out.println("\nConteúdos Concluídos Kiany" + devKiany.getConteudosConcluidos());
        System.out.println("XP: " + devKiany.calcularTotalXp());

    

    }
}
