package br.com.itau1;

import java.util.List;
import java.util.Scanner;
import br.com.itau.modelo.Lancamento;
import br.com.itau.service.LancamentoService;

public class Exercicio {

	public static void main(String[] args) {
		List<Lancamento> lancamentos = new LancamentoService().listarLancamentos();

		// TODO: continue daqui
		Scanner entrada = new Scanner(System.in);
		int mes;
		double totalMes = 0;

		System.out.println("===========================================================");
		System.out.println("Selecione umas das opções:");
		System.out.println("Digite 1 para consultar os gastos ordenados por Mês");
		System.out.println("Digite 2 para consultar os lançamentos de uma categoria");
		System.out.println("Digite 3 para consultar a fatura de um mês");
		System.out.println("===========================================================");

		int selecao = entrada.nextInt();

		switch (selecao) {
		case 1:

			for (mes = 1; mes <= 7; mes++) {
				totalMes = 0;
				System.out.println("\n********");
				System.out.println("Mês" + mes);
				for (int posicao = 0; posicao <= 7; posicao++) {

					if (lancamentos.get(posicao).getMes() == mes) {
						System.out.println(lancamentos.get(posicao).getValor());
					}

				}
			}
			break;

		case 2:
			while (true) {
				System.out.println("===========================================================");
				System.out.println("Digite uma categoria: 1, 2, 3, 4 e 6");
				System.out.println("===========================================================");

				selecao = entrada.nextInt();

				if (selecao > 6 || selecao == 5 || selecao < 1) {
					System.out.println("Digite uma opção valida: ");

				} else {

					for (int posicao = 0; posicao <= 7; posicao++) {

						if (lancamentos.get(posicao).getCategoria() == selecao) {
							System.out.println(lancamentos.get(posicao));
						}

					}
					break;
				}

			}

		case 3:
			while (true) {
				System.out.println("===========================================================");
				System.out.println("Digite uma mês: 1, 2, 3, 5, 6 e 7");
				System.out.println("===========================================================");

				selecao = entrada.nextInt();

				if (selecao > 7 || selecao == 4 || selecao < 1) {
					System.out.println("Não há extrato referente ao mês digitado, digite novamente: ");

				} else {

					for (int posicao = 0; posicao <= 7; posicao++) {

						if (lancamentos.get(posicao).getMes() == selecao) {
							totalMes = totalMes + lancamentos.get(posicao).getValor();
						}
					}
					System.out.println("O valor total da fatura do mês " + selecao + " é de: " + totalMes);
					break;

				}

			}
			break;
		default:

			System.out.println("Número inválido, digite novamente. ");
		}

	}
}
