import com.dio.dominio.Bootcamp;
import com.dio.dominio.Curso;
import com.dio.dominio.Dev;
import com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria de java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Ana: "+devAna.getConteudosInscritos());
        devAna.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos Ana: "+devAna.getConteudosInscritos());
        System.out.println("Conteúdos concluidos Ana: "+devAna.getConteudosConcluidos());
        System.out.println("XP: "+devAna.calcularTotalXp());

        System.out.println("--------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: "+devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteúdos inscritos João: "+devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluidos João: "+devJoao.getConteudosConcluidos());
        System.out.println("XP: "+devJoao.calcularTotalXp());



    }
}
