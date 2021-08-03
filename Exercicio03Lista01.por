programa
{
	
	funcao inicio()
	{

	  inteiro duracaoSegundos, horas, minutos, segundos
        

         escreva("Tempo de duração do evento em segundos:")
         leia(duracaoSegundos)


         horas = duracaoSegundos / 3600
         minutos = (duracaoSegundos % 3600)/60
         segundos = ((duracaoSegundos % 3600)%60)
         escreva("\nHoras: "+horas)
         escreva("\nMinutos: "+minutos)
         escreva("\nSegundos: "+segundos)




	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 331; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */