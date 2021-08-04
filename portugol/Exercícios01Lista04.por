programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
	/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
	que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
	imprima a média aritmética dos lançamentos, contabilize e apresente também
	quantas foram as ocorrências da maior pontuação.*/
	inteiro dado[10]
	inteiro contador = 0
	inteiro maiorNumero =0 
	inteiro media =0 

	para(inteiro x=0; x<10;x++){
		dado[x]= Util.sorteia(1,6)
		escreva("Dado [",x,"] valor ",dado[x],"\n")
		contador = contador + dado[x]
		se(dado[x] > maiorNumero)
		maiorNumero=dado[x]
	}
	escreva("\nContador = ", contador)
	 	media = contador / 10
	 	escreva("\nMédia dos lançamentos: ",media)
	 	escreva("\nMaior valor :",maiorNumero)




		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 435; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */