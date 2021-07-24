package br.com.inclusaodev.board.business.curso.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Curso {

	private Long id;
	private String nome;
	private String categoria;

}