package main;

import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
	public static void main(String[] args) {

		// Curso (JAVA)
		Curso curso1 = new Curso();
		curso1.setTitulo("Java Básico");
		curso1.setDescricao("Aprenderemos os conceitos iniciais do Java!");
		curso1.setCargaHoraria(41);
		
		// Mentoria (JAVA)
		Mentoria mentoriaCurso1 = new Mentoria();
		mentoriaCurso1.setTitulo("POO na prática!");
		mentoriaCurso1.setDescricao("Aprenderemos os pilares de OO em Java!");
		mentoriaCurso1.setData(LocalDate.now());
		
		// Bootcamp (JAVA)
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setNome("Bootcamp Java Developer");
		bootcamp1.setDescricao("Aqui você aprendera do básico ao avançado o JAVA!");
		bootcamp1.getConteudos().add(curso1);
		bootcamp1.getConteudos().add(mentoriaCurso1);
		
		// Desenvolvedor(es) participante(s) (DEV)
		Dev devBootcamp1 = new Dev();
		devBootcamp1.setNome("Lucas");
		devBootcamp1.inscreverBootcamp(bootcamp1);
		System.out.println("=========");
		System.out.println("DEV " + devBootcamp1.getNome());
		System.out.println("=========");

		System.out.println();
		System.out.println("CONTEÚDOS INSCRITOS: " + "\n" + devBootcamp1.getConteudosInscritos() + "\n");
		System.out.println("CONTEÚDOS CONCLUÍDOS: " + "\n" + devBootcamp1.getConteudosConcluidos() + "\n");
		System.out.println("XP: " + devBootcamp1.calcularTotalXp() + "\n");
		
		devBootcamp1.progredir();
		
		System.out.println("PROGREDI..." + "\n");
		System.out.println("CONTEÚDOS INSCRITOS: " + "\n" + devBootcamp1.getConteudosInscritos() + "\n");
		System.out.println("CONTEÚDOS CONCLUÍDOS: " + "\n" + devBootcamp1.getConteudosConcluidos() + "\n");
		System.out.println("XP: " + devBootcamp1.calcularTotalXp()  + "\n");
		
		System.out.println("CANCELANDO MATRÍCULA...");
		devBootcamp1.cancelarMatriculaBootcamp(bootcamp1);
		System.out.println("CONTEÚDOS INSCRITOS: " + devBootcamp1.getConteudosInscritos() + "\n");
		System.out.println("CONTEÚDOS CONCLUÍDOS: " + "\n" + devBootcamp1.getConteudosConcluidos() + "\n");

	}
	

}
