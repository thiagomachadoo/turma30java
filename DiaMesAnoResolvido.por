programa{
	funcao inicio(){
		
		//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
		

		inteiro ano, mes, dia, total
			escreva("Digite em dia : ")
			leia(dia)
			escreva("Digite em mes:  ")
			leia(mes)
			escreva("Digite em anos:  ")
			leia(ano)

			total = (ano * 365) + (mes * 30) + dia
			escreva("Você tem ", total," dias")
	
		//sem considerar anos bissexto e meses de 29 dias ou 31 dias
		//aproximadamente
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */