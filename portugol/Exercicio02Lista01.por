programa
{
	
	funcao inicio()
	{
	inteiro ano, mes, dia, dia1
	escreva("Digite sua idade em dias: ")
	
	leia(dia)

	ano = dia/365
	mes = (dia%365)/30
	dia1 = (dia%365) % 30
	escreva("\nVocê tem  ", ano, " anos ", mes, " meses, e ", dia1 , " dias" )
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 102; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */