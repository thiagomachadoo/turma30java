programa
{
	/*1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.*/
	funcao inicio()
	{
	inteiro pesoDeTomates
	inteiro excesso
	real auxiliar
	 real multa = 0.00
	 real PESO_EXCEDENTE = 0
	
	escreva("\nPeso de tomates: ")
	leia(pesoDeTomates)

	PESO_EXCEDENTE = pesoDeTomates - 50
	multa = PESO_EXCEDENTE * 4.00
		
		se(pesoDeTomates < 50){
			escreva("/nEstá no regulamento")
		}
		senao se(pesoDeTomates > 50)
		escreva("\nVocê excedeu, a multa é de: R$ ", multa)
		escreva("\nPeso excedente ",PESO_EXCEDENTE, " KG")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 873; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */