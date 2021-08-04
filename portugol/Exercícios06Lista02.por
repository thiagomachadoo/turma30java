programa
{
	
	funcao inicio()
	{
		
		inteiro idade
		escreva("Digite sua idade: ")
		leia(idade)
		

		se (idade <= 7 e idade >= 5){
			escreva("Idade ", idade ,"\nInfantil A")
		} 
		senao se(idade >= 8 e idade <= 11){
			escreva("Idade ", idade ,"\nInfantil B")
		}
		senao se(idade >= 12 e idade <= 13){
			escreva("Idade ", idade ,"\nJuvenil A")
		}
		senao se(idade >= 14 e idade <= 17){
			escreva("Idade ", idade ,"\nJuvenil B")
		} 
		senao{
			escreva("\nAdulto")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 434; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */