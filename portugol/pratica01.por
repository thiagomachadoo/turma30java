programa
{
	
	funcao inicio()
	{		//Aula 2 - 
			/*cadeia nome
			escreva("Diga o seu nome: ")
			leia(nome)
			limpa()
			escreva("Olá ",nome,", bem vindo!")*/

			//Aula 3 -
			/*inteiro idade = 18
			real saldo = 300.85
			caracter sexo = 'M'
			cadeia nome = "João Roberto"
			logico casado = verdadeiro 
			escreva(nome," tem ",idade, " anos, se identifica com o sexo ",sexo, " e tem ",saldo, " na sua conta bancária")
			escreva(", é casado: ", casado)*/

			//Aula 4 -
			/*inteiro a = 2
			cadeia b = a+""
			escreva(b)*/

			//Aula 5 -
			//inteiro a = 2, b = 4, c
			//c = b * a //todo numero inteiro - real da um resultado real
			//escreva(c)
			//inteiro a=28, c
			//c = a%3 // para saber se o numero é par ou impar, multiplo ou nao
			//escreva(c)
			/*real a, b, soma
			escreva("Multiplicação: ")
			leia(a)
			limpa()
			escreva("Multiplicação: ",a," * ")
			leia(b)
			limpa()
			soma = a * b 
			escreva("Multiplicação: ",a," * ", b ," = ",soma)*/

			//Aula 6 - Desvios Condicionais
			/*cadeia op //operação
			real n1,n2, res // res= resultado
			escreva("Escolha um operador: +, -, *, / : \n")
			leia(op)//variavel op deve ter + ou -
			limpa()
			escreva("Insira os valores: \n")
			leia(n1)
			limpa()
			escreva("Insira os valores: \n")
			escreva(n1, " ", op, " ")
			leia(n2)
			limpa()
			se(op == "+")
			{
				res = n1 + n2
			}
			senao se(op == "-")
			{
				res = n1 - n2
			}
			senao se(op == "*")
			{
				res = n1 * n2
			}
			senao se(op == "/")
			{
				res = n1 / n2
			}
			senao {
				limpa()
				res = 0.0
				escreva("Digite um operador válido!!")
			}
			//escreva("\nResultado: ", n1, " ",op, " ", n2, " = ", res)*/

			//Aula 7 - Operadores Relacionais
			// > maior que / < menor que 
			/*real nota
			escreva("Insira sua nota: ")
			leia(nota)
			limpa()
			se(nota < 0 ou nota > 100)
			{
				escreva("Nota inválida, tente novamente")
			}
			senao se(nota <= 40)
			{
			 escreva("O aluno foi reprovado!!")
			} senao se(nota <= 60)
			{
			escreva("O aluno está de recuperação!!")
			}senao se(nota >= 80)
			{
			escreva("O aluno foi aprovado e se destacou!!")	
			}senao{
				escreva("O aluno foi aprovado!!")
			}
			escreva("\n\n")*/
			
			//Aula 8 - Laços de Repetição
			/*inteiro i = 1
			enquanto(i <=100)
			{
				escreva(i+", ")
				 i++ //incremento(cada vez que o laço for executado recebera +1)
				 //os comandos depois do laço so serao executados quando o laco acabar
			}
			escreva("\nFim do laço enquanto\n\n")
			// -- decremento
			//while = enquanto
			//for = para
			
			para(inteiro j = 100; j >=0; j--) 
			{
				escreva(j+", ")
				
			}
			escreva("\nFim do laço para")*/

			//Aula 9 - Operações Lógicas
			/* e = conjunção
			 *  ou = disjunção
			 *  não = negação
			 */
			/* cadeia pais
			 inteiro idade
			 logico permitido
			 escreva("país? (BRA, USA, POR)\n")
			 leia(pais)
			 limpa()
			 se(pais == "BRA" ou pais=="POR")
			 {
			 	escreva("Idade: ")
			 }senao
			 {
			 	escreva("Age: ")
			 }
			 
			 leia(idade)
			 limpa()

			 se(pais =="BRA" e idade >= 18 ou (pais =="USA" e idade>= 21) ou pais =="POR")
			 {
			 	permitido = verdadeiro 
			 }senao
			 {
			 	permitido = falso
			 }
			 se(permitido e (pais =="POR" ou pais=="BRA"))
			 {
			 	escreva("Permitido!")
			 }senao se(permitido e pais =="USA")
			 {
			 	escreva("Permitido!")
			 }senao se(nao permitido e pais == "USA")
			 {
			 	escreva("Não permitido!!")
			 }senao se(nao permitido e(pais =="POR" ou pais == "BRA"))
			 {
			 	escreva("Não permitido!!")
			 }

			 //Aula 10 - desvio de condicional 2
			/* inteiro pais
			 escreva("Escolha um país:\n(1) Japão\t(5) Portugal\n(2) Holanda\t(6) Lituânia\n(3) Austrália\t(7) Azerbaijão\n(4) Brasil\t(8) África do Sul\n")
			 leia(pais)

			escolha(pais)
			{
				caso 1: escreva("Japonês")
				pare
				caso 2: escreva("Neerlandês")
				pare
				caso 3: escreva("Ingles")
				pare
				caso 4: escreva("Português")
				pare
				caso 5: escreva("Português")
				pare
				caso 6: escreva("Lituano")
				pare
				caso 7: escreva("Armênio")
				pare
				caso 8: escreva("Africâner, inglês")
				pare
				caso contrario: escreva("Escolha um válido!")*/

				
				//Aula 11 - Vetores
				/*cadeia nome[5] 
				para(inteiro x = 0; x <=4; x++){
					escreva("Digite a posição ",x,": ")
					leia(nome[x])
					limpa()
				}

				
				para(inteiro x = 0; x<4; x++){
				escreva(x + ": ",nome[x]," | ")*/

				/*cadeia idiomas[8] = {"Amarelo","Azul","Roxo","Preto","Prata","Verde","Rosa","Laranja"}	
				inteiro carro
				escreva("Escolha um carro:\n(0) carroAmarelo\t(4) carroAzul\n(1) carroRoxo\t(5) carroPreto\n(2) carroPrata\t(6) carroVerde\n(3) carroRosa\t(7) carroLaranja\n")	
				leia(carro)
				se(carro >= 0 e carro <= 8)
				{
					escreva(idiomas[carro])
				}senao 
				{
					escreva("Digite um carro válido!!")*/
				
					
					
				
		} 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4838; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */