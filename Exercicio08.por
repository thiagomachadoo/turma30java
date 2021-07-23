programa
{
	
	funcao inicio()
	{
	//porcentagem distribuidor 28%
	//impostos de 45%
	inteiro imposto, porcento, custoFinal, custoFabrica, taxaVenda, taxaGoverno 

	imposto = 0.45
	porcento = 0.28

	
escreva("Qual o custo de Fabrica do carro?\n")
leia(custoFabrica)

taxaGoverno = custoFabrica * 0.45
	taxaVenda = custoFabrica * 0.28
	
custoFinal = custoFabrica+taxaVenda+taxaGoverno

  escreva("\n O custo para o consumidor é de : "+custoFinal)



		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */