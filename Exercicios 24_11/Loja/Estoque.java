package Loja;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/*** 
 Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.

 
 */
public class Estoque {
	public static void main(String args[]) {
		int opcao = 1000;
		String item = "";
		Scanner ler = new Scanner (System.in);

		Collection<String> estoque = new ArrayList(); 
		System.out.println("Diga o que pretende fazer:\n");
		
		while(opcao != 0) {
			System.out.println("Digite 1 para adicionar itens ao estoque\n"
					+ "Digite 2 para remover dados do estoque\n"
					+ "Digite 3 para atualizar o estoque\n"
					+ "Digite 4 para Mostrar os itens do estoque\n"
					+ "Digite 0 para sair\n\n");
			opcao = ler.nextInt();
			
			if(opcao == 1) {
				System.out.println("Digite o nome do item a ser adicionado: ");
				item = ler.next();
				estoque.add(item);
			}
			else {
				if(opcao == 2) {
					System.out.println("Digite o item a ser removido: ");
					item = ler.next();
					estoque.remove(item);
				}
				else {
					if(opcao == 3) {
						System.out.println("Atualizando Estoque:\n");
						for (String name : estoque) {
							System.out.println(""+name);
						}
					}
					else {
						if(opcao == 4) {
							System.out.println("Itens Disponíveis no estoque:\n");
							for (String name : estoque) {
								System.out.println(""+name);
							}
						}
						else{
							if(opcao == 0) {
								System.out.println("Encerrando Programa...");
							}
							else {
								System.out.println("Opção Inválida, escolha uma opção existente");
							}
						}
					}
					
				}
			}
		}
		
		
		
		
		
	}
	
}
