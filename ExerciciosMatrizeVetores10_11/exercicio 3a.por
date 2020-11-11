programa
{
	
	funcao inicio()
	{
		
		inteiro n1[4][6]
		inteiro n2[4][6]
		inteiro m1[4][6]
		inteiro l,c

		para(l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("Entre com o valor da linha ",l+1," coluna ",c+1," da primeira matriz: ")
				leia(n1[l][c])
			}
		}
		limpa()
		para(l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva("Entre com o valor da linha ",l+1," coluna ",c+1," da segunda matriz: ")
				leia(n2[l][c])
			}
		}
		
		//soma das matrizes abaixo:
		para(l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				m1[l][c] = n1[l][c] + n2[l][c]
			}
		}
		
		// imprime a matriz soma na tela:

		escreva("\n A Matriz soma resultante é:\n")
		
		para(l=0;l<4;l++)
		{
			para(c=0;c<6;c++)
			{
				escreva(" [ ",m1[l][c]," ]")
			
			}
			escreva("\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 447; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */