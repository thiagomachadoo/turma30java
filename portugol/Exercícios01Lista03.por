programa
{
	
	funcao inicio()
	{
		/*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
		apresente no final o total do somatório, a média e o total de valores lidos. O programa
		deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
		positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor
		negativo. */
		//Variaveis
		inteiro valor = 1, soma = 0, contador = 0, media = 0
		
		enquanto(valor>0)
		{
		escreva("\nDigite um número: ")
		leia(valor)
		soma = soma + valor
		se(valor > 0)
		{
		contador++ //contador = contador + 1	
		}
		media = soma / contador
	}
	escreva("\no valor foi: ", valor)
	escreva("\no contador foi: ", contador)
	escreva("\na media foi: ", media)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 729; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */