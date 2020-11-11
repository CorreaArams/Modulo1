programa
{
	
	funcao inicio()
	{
		inteiro numero[5],x,maior
		maior=0
		para(x=0;x<5;x++)
	{
		escreva("Entre com os valores da atividade ")
		leia(numero[x])
	}
	
		para(x=0;x<5;x++)
		{
			escreva("Valor da posição ",x+1," : ",numero[x]," \n ")
			se (numero[x]>maior)
				maior = numero[x]
		}
		escreva("Maior valor digitado: ",maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 240; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */