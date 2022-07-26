package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso JS");
		curso2.setDescricao("descrição curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de Java");
		mentoria.setDescricao("descrição mentoria Java");
		mentoria.setData(LocalDate.now());

		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Developer");
		bootcamp.setDescrição("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devSarah = new Dev();
		devSarah.setNome("Sarah Lee");
		devSarah.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Sarah Lee: " + devSarah.getConteudosInscritos());
		devSarah.progredir();
		devSarah.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Sarah Lee: " + devSarah.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Sarah Lee: " + devSarah.getConteudosConcluidos());
		System.out.println("XP: "+ devSarah.calcularTotalXp());
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		Dev devMiguel = new Dev();
		devMiguel.setNome("Miguel Braga");
		devMiguel.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Miguel Braga: " + devMiguel.getConteudosInscritos());
		devMiguel.progredir();
		devMiguel.progredir();
		devMiguel.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Miguel Braga: " + devMiguel.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Miguel Braga: " + devMiguel.getConteudosConcluidos());
		System.out.println("XP: "+ devMiguel.calcularTotalXp());
		
		
		

	}

}
