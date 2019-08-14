package GoogleCharts;

import java.io.IOException;
import java.util.Scanner;

public class MainGrafico {

	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		     // Objeto que guarda os dados do grafico
				Grafo g = new Grafo();
				g.setVetor(novoVetor()); //Atributo que guarda o vetor a ser usado no gr�fico
				
				try {
					GraficoHTML.geraHtml(g.getVetor());
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}

			
			 //Pega os dados do usuario e retorna o vetor			  
			
			public static int[] novoVetor() {
				System.out.println("::.. Acompanhamento de Treino ..::");
				System.out.print("\nInforme o n�mero de dias que voc� treinou: ");
				int numDias = entrada.nextInt();
				int vetor[] = new int[numDias];

				for (int i = 0; i < numDias; i++) {
					System.out.print("Informe a dist�ncia percorrida em Km no "+(i+1)+"� dia: ");
					vetor[i] = entrada.nextInt();
				}
				System.out.println("Dados salvos com sucesso.");
				entrada.close();

				return vetor;

			}

		

	}


