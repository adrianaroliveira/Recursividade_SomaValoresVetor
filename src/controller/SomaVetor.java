package controller;

public class SomaVetor {
	public SomaVetor() {
		super();
	}
	public int vetorSoma(int []vetor, int tamanho) {
		//quando acabar as posições do vetor, parar
		if (tamanho == 0) {
			return 0;
		} else {
			int ultimaPosicao = tamanho -1; // ele busca a ultim posição do vetor
			int valor = vetor[ultimaPosicao]; // ele da a valoresta posição do vetor
			tamanho --; // diminui uma posição para ler o proximo valor
			return valor + vetorSoma(vetor, tamanho); //Retorno é o valor obtido da última posição do vetor com 
													  //a chamada da função com um vetor de tamanho reduzido em 1 posição
		}
	}

}
