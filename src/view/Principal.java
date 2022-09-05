package view;

import controller.SomaVetor;

public class Principal {

	public static void main(String[] args) {
		
		int [] vetor = {4,5,10,11,15,16,20};
		int tamanho = vetor.length; //verifica o tamanho do vetor e você nao precisa dizer o tamanho
		SomaVetor soma = new SomaVetor();
		int vetorSoma = soma.vetorSoma(vetor, tamanho);
		System.out.println(vetorSoma);
	}

}
