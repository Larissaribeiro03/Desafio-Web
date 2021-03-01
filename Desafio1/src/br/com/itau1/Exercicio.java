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
		System.out.println("Selecione umas das op��es:");
		System.out.println("Digite 1 para consultar os gastos ordenados por M�s");
		System.out.println("Digite 2 para consultar os lan�amentos de uma categoria");
		System.out.println("Digite 3 para consultar a fatura de um m�s");
		System.out.println("===========================================================");

		int selecao = entrada.nextInt();

		switch (selecao) {
		case 1:

			for (mes = 1; mes <= 7; mes++) {
				totalMes = 0;
				System.out.println("\n********");
				System.out.println("M�s" + mes);
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
					System.out.println("Digite uma op��o valida: ");

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
				System.out.println("Digite uma m�s: 1, 2, 3, 5, 6 e 7");
				System.out.println("===========================================================");

				selecao = entrada.nextInt();

				if (selecao > 7 || selecao == 4 || selecao < 1) {
					System.out.println("N�o h� extrato referente ao m�s digitado, digite novamente: ");

				} else {

					for (int posicao = 0; posicao <= 7; posicao++) {

						if (lancamentos.get(posicao).getMes() == selecao) {
							totalMes = totalMes + lancamentos.get(posicao).getValor();
						}
					}
					System.out.println("O valor total da fatura do m�s " + selecao + " � de: " + totalMes);
					break;

				}

			}
			break;
		default:

			System.out.println("N�mero inv�lido, digite novamente. ");
		}

	}
}
