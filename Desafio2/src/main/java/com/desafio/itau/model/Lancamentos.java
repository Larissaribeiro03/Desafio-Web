package com.desafio.itau.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="tb_lancamentos")
	public class Lancamentos {
		@Id //primary key
		@GeneratedValue(strategy=GenerationType.IDENTITY) //auto increment 
		private Long id;
		
		@Column
		private double valor;
		
		@Column
		private String origem;
		
		@Column
	    private int categoria;
		
		@Column
		private int mes_lancamento;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public String getOrigem() {
			return origem;
		}

		public void setOrigem(String origem) {
			this.origem = origem;
		}

		public int getCategoria() {
			return categoria;
		}

		public void setCategoria(int categoria) {
			this.categoria = categoria;
		}

		public int getMes_lancamento() {
			return mes_lancamento;
		}

		public void setMes_lancamento(int mes_lancamento) {
			this.mes_lancamento = mes_lancamento;
		}

}
