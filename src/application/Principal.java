package application;

import java.util.Scanner;

import controller.GereCliente;
import model.Cliente;

public class Principal {

	int opcao;
	int numRegistos;
	Scanner sc = new Scanner(System.in);

	int id = 0;
	String nome;
	String morada;
	String email;
	String contacto;

	boolean sair = false;
	boolean saida;
	int opcSair;

	public Principal() 
	{
		// Cliente gere = new Cliente(1, "Joao", "Rua", "JPPwnz@gmail.com",
		// 913535673);
	do {
		GereCliente gestor = new GereCliente();

		// System.out.println(gere.getNome());
		
			System.out.print("Menu:  \n \n");
			System.out.println("1 - Introduzir clientes ");
			System.out.println("2 - Introduzir animais \n");
			System.out.println("3 - Listar clientes \n");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1: {

				do
				{
					
				
					System.out.println("Quantos clientes deseja inserir? \n");
					numRegistos = sc.nextInt();

					for (int i = 0; i < numRegistos; i++) 
					{
						id = id + 1;
						System.out.println("Introduza o nome do cliente: \n");
						nome = sc.next();
						System.out.println("Introduza a morada do cliente: \n");
						morada = sc.next();
						System.out.println("Introduza o email do cliente: \n");
						email = sc.next();
						System.out.println("Introduza o contacto do cliente: \n");
						contacto = sc.next();

						Cliente gere = new Cliente(nome, morada, email, contacto);

						gestor.arClientes.add(gere);

					}

					
					System.out.println("Deseja introduzir mais clientes? /n 1 - nao 2 - sim/n");
					opcSair = sc.nextInt();
					if (opcSair == 1)
					{
						
						sair = false;
						saida = true;
					}
					else 
					{
						sair = true;
						saida = false;
					}

					
				} while(sair);
				break;
			}

			case 2: {
						
				break;
			}
			
			case 3: 
			{
				
				for (int i = 0; i < 2; i++) 
				{

					System.out.println("\n" + gestor.arClientes.get(i).getNome());
					System.out.println("\n" + gestor.arClientes.get(i).getMorada());
					System.out.println("\n" + gestor.arClientes.get(i).getEmail());
					System.out.println("\n" + gestor.arClientes.get(i).getTelefone());

				}
				break;
			}

			default:
				System.out.println("Essa opcao nao existe");

			}

		} while (saida);

	}

	public static void main(String[] args) 
	{
		new Principal();
	}

}
