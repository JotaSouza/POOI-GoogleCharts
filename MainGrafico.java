package GoogleCharts;

import java.io.IOException;
import java.util.Scanner;

public class MainGrafico {

	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		// constroi o objeto que guarda os dados do grafico
				Grafo g = new Grafo();
				g.setVetor(novoVetor()); // inicializa o atrributo que guarda o vetor a ser usado no gráfico
				
				try {
					GraficoHTML.geraHtml(g.getVetor());
				} catch (IOException e) {
//					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				
			}

			/**
			 * pega os dados do usuario e retorna o vetor
			 * 
			 * @return int[] vetor
			 */
			public static int[] novoVetor() {
				System.out.println("Informe o número de dias");
				int quantidade = entrada.nextInt();
				int vet[] = new int[quantidade];

				for (int i = 0; i < quantidade; i++) {
					System.out.println("Informe a quantidade vendida por dia");
					vet[i] = entrada.nextInt();
				}
				System.out.println("Dados salvos com sucesso.");
				entrada.close();

				return vet;

			}

		

	}


