programa
{
	
	funcao inicio()
	{
		
		inteiro n1[3][3]
		inteiro l,c,soma = 0

		para(l=0;l<3;l++)
		{
			para(c=0;c<3;c++)
			{
				escreva("Entre com o valor da linha ",l+1," coluna ",c+1," da primeira matriz: ")
				leia(n1[l][c])
				se(l == c)
				soma += n1[l][c]
			}
		}
		limpa()

		escreva("\n A matriz digitada foi:\n")
		
		para(l=0;l<3;l++)
		{
			para(c=0;c<3;c++)
			{
				escreva(" [ ",n1[l][c]," ]")
			
			}
			escreva("\n")
		}
		escreva("\n A soma da diagonal principal da matriz digitada é ",soma,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 522; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */