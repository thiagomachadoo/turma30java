programa
{
	/*nome alune - alunes [4]
		//nota alune - notas [4]
		digite o nome: _
		digirte a nota :_

		mostra depois NOME - NOTA
		*?/
		*
		 */
	funcao inicio()
	{	
		
		cadeia nome[4]
		inteiro nota[4]
		
		para(inteiro x = 0; x < 4; x++ ){
		escreva("Digite seu nome: ")
		leia(nome[x])
		escreva("Digite sua nota: ")
		leia(nota[x])
		}
	limpa()
		para(inteiro x = 0; x < 4; x++){
		
			se(nota[x] > 5)
			{
				escreva("Nome: ",nome[x], " sua nota ",nota[x], ", continue assim!!!\n")
			} senao {
			
				escreva("Nome:  ",nome[x], " sua nota ",nota[x],", estude mais!!!\n")
				
			}
		}	
	}
} 
		
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 245; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */