programa
{
	
	funcao inicio()
	{
		inteiro numero[10],x,cont
		real media = 0.0
		cont=0
		real soma=0.0
		para(x=0;x<10;x++)
	{
		escreva("Entre com os valores da atividade ")
		leia(numero[x])
		soma+=numero[x]
		
	
	}
	
		para(x=0;x<10;x++)
		{
			escreva("Valor da posição ",x+1," : ",numero[x]," \n ")
			
			se (numero[x] == 6)
				cont++
		}
		media= soma / 10
		escreva("Vezes que saiu o numero 6: ",cont)
		escreva("\n Média: ",media)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 243; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */