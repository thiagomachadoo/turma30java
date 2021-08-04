programa
{
	inclua biblioteca Matematica-->mat
	inclua biblioteca Texto
	inclua biblioteca Tipos
	
	funcao inicio()
	{	
	//VARIAVEIS
	const inteiro minimo = 10
	inteiro x = 0, y = 0
	inteiro estoque[minimo] = {10,10,10,10,10,10,10,10,10,10}
	//CODIGOS E VALOR DOS PRODUTOS
	real valor[minimo] = {5000.20,2000.10,299.99,3000.50 ,245.49 ,200.99,140.99,129.01,130.99,140.99}
	inteiro codigo[minimo] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, vezes = 0
	real valorCompras[minimo]
	real valorTotal = 0.0, imp = 0.0, valorAtualizado = 0.0
	//PRODUTOS DA NOSSA LOJA
	cadeia produtos[minimo] = {"Playstation5","Playstation4","FifaUltimate","  XboxOne   ","    Gta     ","Controle PS5","Controle PS4"," Cabo Hdmi  ","Controle PC ","TecladoGamer"}
	//caracteres de intração com o usuario
	logico user = verdadeiro
	cadeia nomeComprador
	caracter op = 'N'
	caracter op1 = 'S'
	cadeia compras[minimo]
	caracter dinheiro, cheque, credito, parcelas, juros, notaFiscal, empresa, imposto, totalPagar, confirmacao, novoUser
	cadeia pag, parc
	
     escreva("Bem Vindo a Smart Gamer!\n")
	 
		// Peça nome e cpf do cliente
		escreva("Digite seu nome: ")
		leia(nomeComprador)
		escreva("Deseja fazer compras S/N: ")
		
		enquanto (op == 'N' ou op == 'n') {
			leia(op)
			se(op == 'S' ou op == 's')
			{
				escreva("Estamos a sua disposição:\n")
				
			}senao
			{
				escreva("Até breve:\n")
				limpa()
				escreva("Deseja fazer compras S/N: ")
				
			}
			
	 	}
	 	limpa()
	 	escreva("Bem Vindo a Smart Gamer!\n")
	 	escreva("\n")
	 	//SLOGAN APARECENDO
	 	escreva("Temos os seguintes produtos a sua disposição:\n")
	 	
		//limpa()
		//Se cpf < 11 digitos
		//escreva("Digite um cpf válido") 
		
	 
		// Liste os produtos a disposição
		escreva("\nCOD","  ","  PRODUTO  ","  ","  VALOR  ","  ","ESTOQUE")
	  	para(x = 0 ; x < 10; x++){
			//escreva("\n",x+1,"- ","o código ",codProduto[x]," é: ",mercadoria[x]," o valor do produto R$",mat.arredondar(preco[x],2), " em estoque: ", unidades[x])
			//escreva("\n")
			
			escreva("\n",codigo[x]," | ",produtos[x]," | ",mat.arredondar(valor[x],2)," | ", estoque[x])
			
		}
		escreva("\n")
		escreva("Nossos estoques contam com 10 unidades de cada produto. Boas Compras!")
		escreva("\nEscreva o código do produto selecionado: ")
		
	 	//escreva("\nQuantos unidades deseja?: ")
	 	//leia(unidades[x])
	 	para(x = 0 ; x < 10; x++){
	 		leia(codigo[x])
	 		
	 		
			se(codigo[x] == 1){
			estoque[0] = estoque[0] -1
			compras[x] = produtos[0]
			valorCompras[x] = valor[0]
			escreva("O produto ","'",produtos[0],"'", " foi adicionado ao carrinho.\n")
			escreva("\nDeseja adicionar outros produtos ao carrinho (S/N): ")
			leia(op1)
			se(op1 == 'S' ou op1 == 's'){
				escreva("Escreva o código do produto selecionado: ")
				
			} se(op == 'N' ou op == 'n')
			{
				
				escreva("Carrinho de compras:\n")
				escreva("PRODUTOS:\t","VALOR:\n")
				valorTotal = valorTotal + valorCompras[x]
				escreva("------------------------------------------------\n")
				escreva(x + 1," - ",compras[x],"\t","R$ ", valorCompras[x],"\n")
				}
			}
		
			
			senao se(codigo[x] == 2)
			{
			estoque[1] = estoque[1] -1
			compras[x] = produtos[1]
			valorCompras[x] = valor[1]
				escreva("O produto ","'",produtos[1],"'", " foi adicionado ao carrinho.\n")
				escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
			leia(op1)
			se(op1 == 'S' ou op1 == 's')
			{
				escreva("Escreva o código do produto selecionado: ")
				
			} 
			}
			senao se(codigo[x] == 3)
			{
			estoque[2] = estoque[2] - 1
			compras[x] = produtos[2]
			valorCompras[x] = valor[2]
				escreva("O produto ","'",produtos[2],"'", " foi adicionado ao carrinho.\n")
				escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
			leia(op1)
			se(op1 == 'S' ou op1 == 's')
			{
				escreva("Escreva o código do produto selecionado: ")
				
			} 
			}senao se(codigo[x] == 4){
			estoque[3] = estoque[3] -1
			compras[x] = produtos[3]
			valorCompras[x] = valor[3]
				escreva("O produto ","'",produtos[3],"'", " foi adicionado ao carrinho.\n")
				escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
			leia(op1)
			se(op1 == 'S' ou op1 == 's')
			{
				escreva("Escreva o código do produto selecionado: ")
				
			}
			}
			senao se(codigo[x] == 5){
			estoque[4] = estoque[4] -1
			compras[x] = produtos[4]
			valorCompras[x] = valor[4]
				escreva("O produto ","'",produtos[4],"'", " foi adicionado ao carrinho.\n")
				escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
			leia(op1)
			se(op1 == 'S' ou op1 == 's')
			{
				escreva("Escreva o código do produto selecionado: ")
				
			}
			}
			senao se(codigo[x] == 6){
			estoque[5] = estoque[5] -1
			compras[x] = produtos[5]
			valorCompras[x] = valor[5]
				escreva("O produto ","'",produtos[5],"'", " foi adicionado ao carrinho.\n")
				escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
			leia(op1)
			se(op1 == 'S' ou op1 == 's')
			{
				escreva("Escreva o código do produto selecionado: ")
				
			}
			}senao se(codigo[x] == 7){
			estoque[6] = estoque[6] -1
			compras[x] = produtos[6]
			valorCompras[x] = valor[6]
				escreva("O produto ","'",produtos[6],"'", " foi adicionado ao carrinho.\n")
				escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
			leia(op1)
			se(op1 == 'S' ou op1 == 's')
			{
				escreva("Escreva o código do produto selecionado: ")
				
			}
			}senao se(codigo[x] == 8){
			estoque[7] = estoque[7] -1
			compras[x] = produtos[7]
			valorCompras[x] = valor[7]
				escreva("O produto ","'",produtos[7],"'", " foi adicionado ao carrinho.\n")
				escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
			leia(op1)
			se(op1 == 'S' ou op1 == 's')
			{
				escreva("Escreva o código do produto selecionado: ")
				
			}
			}senao se(codigo[x] == 9){
			estoque[8] = estoque[8] -1
			compras[x] = produtos[8]
			valorCompras[x] = valor[8]
				escreva("O produto ","'",produtos[8],"'", " foi adicionado ao carrinho.\n")
				escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
			leia(op1)
			se(op1 == 'S' ou op1 == 's')
			{
				escreva("Escreva o código do produto selecionado: ")
				
			}
			}senao se(codigo[x] == 10){
			estoque[9] = estoque[9] -1
			compras[x] = produtos[9]
			valorCompras[x] = valor[9]
				escreva("O produto ","'",produtos[9],"'", " foi adicionado ao carrinho.\n")
				escreva("\nDeseja adicionar outros produtos ao carrinho ?(S/N)")
			leia(op1)
			se(op1 == 'S' ou op1 == 's')
			{
				escreva("Escreva o código do produto selecionado: ")
				
			}
			}
	 	}
				
			
	 	
			
				
			para(x = 0; x < minimo; x++ ){
				
				escreva("Carrinho de compras:\n")
				escreva("PRODUTOS:\t","VALOR:\n")
				valorTotal = valorTotal + valorCompras[x]
				escreva("------------------------------------------------\n")
				escreva(x + 1," - ",compras[x],"\t","R$ ", valorCompras[x],"\n")
				}
				imp = mat.arredondar((valorTotal*0.09), 2)
				escreva("\nValor total do carrinho: R$",valorTotal)
				escreva("\nValor total dos impostos a serem pagos: R$",imp,"\n")
				escreva("\n--------------FORMA DE PAGAMENNTO---------------\n")
				escreva ("\n\nInsira 'A' para á vista em dinheiro, 'AC' para á vista no cartão de crédito ou 'CC' para cartão de crédito: ")
				leia (pag)
	
				se (pag == "A" ou pag == "a")
				{
					valorAtualizado = valorTotal * 0.10
					valorTotal = valorTotal - valorAtualizado
				}
				se (pag == "AC" ou pag == "ac")
				{
					valorAtualizado = valorTotal * 0.10
					valorTotal = valorTotal - valorAtualizado
				}
				se (pag == "CC" ou  pag == "cc")
				{
					escreva ("\nEm 2x: ")
					leia (parc)
	
					se (parc == "2x" ou parc == "2")
					{
						vezes = 1	
						valorAtualizado = valorTotal * 0.15
					valorTotal = valorTotal - valorAtualizado
					}
					
					
				}
				escreva ("\nDeseja a impressão da nota fiscal - S/N ?")
				leia (notaFiscal)
	
				se (notaFiscal == 'S' ou notaFiscal == 's')
				{
					limpa ()
					escreva ("NOTA FISCAL\n")
					escreva ("\n")
					para(x = 0; x < minimo; x++ ){
					escreva("------------------------------------------------\n")
					escreva(x + 1," - ",compras[x],"\t","R$ ", valorCompras[x],"\n")				
					}
					escreva ("\n---------IMPOSTOS PAGOS = " + imp + " -----------\n")					
					
					se (vezes == 1)
					{ 
						escreva ("\n\n---------TOTAL A SER PAGO = R$ " + valorTotal + " -----------\n")
						valorTotal =mat.arredondar((valorTotal / 2), 2)
						escreva ("\n\n---------PARCELADO EM 2X DE R$ " + valorTotal + " -----------\n")
					}
					senao se (vezes == 2)
					{ 
						escreva ("\n\n---------TOTAL A SER PAGO = R$ " + valorTotal + " -----------\n")
						valorTotal =mat.arredondar((valorTotal / 3), 2)
						escreva ("\n\n---------PARCELADO EM 3X DE R$ " + valorTotal + " -----------\n")
					}
					senao
					{
						escreva ("\n\n---------TOTAL A SER PAGO = R$ " + valorTotal + " -----------\n")
					}
					escreva ("\n\n---------OBRIGADO E VOLTE SEMPRE -----------\n")
					
				}
				senao{
					
					escreva ("\n\n---------OBRIGADO E VOLTE SEMPRE -----------\n\n")
				}
				escreva("\nDeseja continuar com novas compras ? (S/N)" )
				leia(novoUser)
				se (novoUser == 'S' ou novoUser == 's') {
					limpa()
					user = verdadeiro
				} senao {
					user = falso
				}

		}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 817; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */