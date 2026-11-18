package rei_do_burguer;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu;
		int item;
		String finalizar;
		double soma = 0;
		String[] carrinho = new String[100];
		int quantidade = 0;
		do {

			System.out.println("Olá bem-vindo");
			System.out.println("Deseja acessar nosso cardápio? ");
			menu = sc.next();
			if (menu.equalsIgnoreCase("Sim")) {
				System.out.println("Este e nosso cardápio:");
				System.out.println("Qual setor deseja ir? ");
				System.out.println("1-Hamburgueres");
				System.out.println("2-Bebidas");
				System.out.println("3-Sobremesas");
				System.out.println("4-Acompanhametos");
				System.out.println("5-Sair");
				item = sc.nextInt();
				if (item == 1) {
					System.out.println("Essas são nossas opções de lanches: ");
					System.out.println("1-Rainha Correia: R$39,90");
					System.out.println("2-Rainha Marselha: R$39,90");
					System.out.println("3-Rainha Santos: R$40,90");
					System.out.println("4-Rei Borges: R$40,00");
					System.out.println("5-Rei Matos: R$38,90");
					System.out.println("6-Rainha Carvalho: R$37,90");
					System.out.println("7-voltar para o menu");
					System.out.println("-------------------");
					System.out.println("O que você deseja pedir? ");
					int lanche = sc.nextInt();

					if (lanche == 1) {
						soma += 39.90;
						carrinho[quantidade] = "Rainha Correia";
						quantidade++;
						System.out.println("Lanche Rainha Correia adicionado ao carrinho!");
						System.out.println("---------------------");
						System.out.println("Deseja finalizar a compra? ");
						System.out.println("---------------------");
						finalizar = sc.next();
						if (finalizar.equalsIgnoreCase("Sim")) {
							System.out.println("Pedido finalizado!");
							 System.out.println("Itens do seu pedido:");
							    for (int a = 0; a < quantidade; a++) {
							        System.out.println("- " + carrinho[a]);
							    }
							System.out.printf("O total do seu pedido foi de: R$%.2f",soma);
							break;
						} else {
							System.out.println("Voltando ao menu!");
							System.out.println("---------------------");
						}
					} else if (lanche == 2) {
						soma+=39.90;
						carrinho[quantidade] = "Rainha Marselha";
						quantidade++;
						System.out.println("Lanche Rainha Marselha adicionado ao carrinho!");
						System.out.println("---------------------");
						System.out.println("Deseja finalizar a compra? ");
						System.out.println("---------------------");
						finalizar = sc.next();
						if (finalizar.equalsIgnoreCase("Sim")) {
							System.out.println("Pedido finalizado!");
							 System.out.println("Itens do seu pedido:");
							    for (int b = 0; b < quantidade; b++) {
							        System.out.println("- " + carrinho[b]);
							    }
							System.out.printf("O total do seu pedido foi de: R$%.2f",soma);
							break;
						} else {
							System.out.println("Voltando ao menu!");
							System.out.println("---------------------");
						}
					} else if (lanche == 3) {
						soma+=40.90;
						carrinho[quantidade] = "Rainha Santos";
						quantidade++;
						System.out.println("Lanche Rainha Santos adicionado ao carrinho!");
						System.out.println("---------------------");
						System.out.println("Deseja finalizar a compra? ");
						System.out.println("---------------------");
						finalizar = sc.next();
						if (finalizar.equalsIgnoreCase("Sim")) {
							System.out.println("Pedido finalizado!");
							 System.out.println("Itens do seu pedido:");
							    for (int c = 0; c < quantidade; c++) {
							        System.out.println("- " + carrinho[c]);
							    }
							System.out.printf("O total do seu pedido foi de: R$%.2f",soma);
							break;
						} else {
							System.out.println("Voltando ao menu!");
							System.out.println("---------------------");
						}
					} else if (lanche == 4) {
						soma+=40.00;
						carrinho[quantidade] = "Rei Borges";
						quantidade++;
						System.out.println("Lanche Rei Borges adicionado ao carrinho!");
						System.out.println("---------------------");
						System.out.println("Deseja finalizar a compra? ");
						System.out.println("---------------------");
						finalizar = sc.next();
						if (finalizar.equalsIgnoreCase("Sim")) {
							System.out.println("Pedido finalizado!");
							 System.out.println("Itens do seu pedido:");
							    for (int d = 0; d < quantidade; d++) {
							        System.out.println("- " + carrinho[d]);
							    }
							System.out.printf("O total do seu pedido foi de: R$%.2f",soma);
							break;
						} else {
							System.out.println("Voltando ao menu!");
							System.out.println("---------------------");
						}

					} else if (lanche == 5) {
						soma+=38.90;
						carrinho[quantidade] = "Rei Matos";
						quantidade++;
						System.out.println("Lanche Rei Matos adicionado ao carrinho!");
						System.out.println("---------------------");
						System.out.println("Deseja finalizar a compra? ");
						System.out.println("---------------------");
						finalizar = sc.next();
						if (finalizar.equalsIgnoreCase("Sim")) {
							System.out.println("Pedido finalizado!");
							 System.out.println("Itens do seu pedido:");
							    for (int e = 0; e < quantidade; e++) {
							        System.out.println("- " + carrinho[e]);
							    }
							System.out.printf("O total do seu pedido foi de: R$%.2f",soma);
							break;
						} else {
							System.out.println("Voltando ao menu!");
							System.out.println("---------------------");
						}
					} else if (lanche == 6) {
						soma+=37.90;
						carrinho[quantidade] = "Rainha Carvalho";
						quantidade++;
						System.out.println("Lanche Rainha Carvalho adicionado ao carrinho!");
						System.out.println("---------------------");
						System.out.println("Deseja finalizar a compra? ");
						System.out.println("---------------------");
						finalizar = sc.next();
						if (finalizar.equalsIgnoreCase("Sim")) {
							System.out.println("Pedido finalizado!");
							 System.out.println("Itens do seu pedido:");
							    for (int f = 0; f < quantidade; f++) {
							        System.out.println("- " + carrinho[f]);
							    }
							System.out.printf("O total do seu pedido foi de: R$%.2f",soma);
							break;
						} else {
							System.out.println("Voltando ao menu!");
							System.out.println("---------------------");
						}
					} else {
						System.out.println("Opção inválida");
					}

				}
				 else if (item == 2) {
    System.out.println("Opções de bebidas:");
    System.out.println("1-Água sem gás: R$3,90");
    System.out.println("2-Água com gás: R$4,90");
    System.out.println("3-Coca Cola lata: R$7,90");
    System.out.println("4-Coca Cola zero lata: R$7,90");
    System.out.println("5-Suco de Laranja: R$14,90");
    System.out.println("6-Suco de Morango: R$12,90");
    System.out.println("7-Suco de Goiaba: R$12,90");
    System.out.println("8-Suco de Maracujá: R$14,90");
    System.out.println("9-Suco de Limão: R$12,90");
    System.out.println("10-Voltar");

    System.out.println("Qual você deseja pedir?");
    int bebida = sc.nextInt();

    if (bebida == 1) {
        soma += 3.90;
        carrinho[quantidade] = "Água sem gás";
        quantidade++;
        System.out.println("Água sem gás adicionada ao carrinho!");

    } else if (bebida == 2) {
        soma += 4.90;
        carrinho[quantidade] = "Água com gás";
        quantidade++;
        System.out.println("Água com gás adicionada ao carrinho!");

    } else if (bebida == 3) {
        soma += 7.90;
        carrinho[quantidade] = "Coca Cola lata";
        quantidade++;
        System.out.println("Coca Cola lata adicionada ao carrinho!");

    } else if (bebida == 4) {
        soma += 7.90;
        carrinho[quantidade] = "Coca Cola zero lata";
        quantidade++;
        System.out.println("Coca Cola zero lata adicionada ao carrinho!");

    } else if (bebida == 5) {
        soma += 14.90;
        carrinho[quantidade] = "Suco de Laranja";
        quantidade++;
        System.out.println("Suco de Laranja adicionado ao carrinho!");

    } else if (bebida == 6) {
        soma += 12.90;
        carrinho[quantidade] = "Suco de Morango";
        quantidade++;
        System.out.println("Suco de Morango adicionado ao carrinho!");

    } else if (bebida == 7) {
        soma += 12.90;
        carrinho[quantidade] = "Suco de Goiaba";
        quantidade++;
        System.out.println("Suco de Goiaba adicionado ao carrinho!");

    } else if (bebida == 8) {
        soma += 14.90;
        carrinho[quantidade] = "Suco de Maracujá";
        quantidade++;
        System.out.println("Suco de Maracujá adicionado ao carrinho!");

    } else if (bebida == 9) {
        soma += 12.90;
        carrinho[quantidade] = "Suco de Limão";
        quantidade++;
        System.out.println("Suco de Limão adicionado ao carrinho!");

    } else if (bebida == 10) {
        System.out.println("Voltando ao menu!");

    } else {
        System.out.println("Opção inválida");
    }

    if (bebida >= 1 && bebida <= 9) {
        System.out.println("---------------------");
        System.out.println("Deseja finalizar a compra?");
        System.out.println("---------------------");
        finalizar = sc.next();

        if (finalizar.equalsIgnoreCase("Sim")) {
            System.out.println("Pedido finalizado!");
            System.out.println("Itens do seu pedido:");

            for (int i = 0; i < quantidade; i++) {
                System.out.println("- " + carrinho[i]);
            }

            System.out.printf("O total do seu pedido foi de: R$%.2f", soma);
            break;

        } else {
            System.out.println("Voltando ao menu!");
            System.out.println("---------------------");
        }
    }
}
	else if (item == 3) {
					System.out.println("Opções de Sobremesas:");
					System.out.println("1-Taça da felicidade: R$24,90");
					System.out.println("2-Petit Gateau: R$22,90");
					System.out.println("3-Brownie: R$14,90");
					System.out.println("4-Voltar");
					System.out.println("Qual você deseja pedir? ");
					int sobremesa = sc.nextInt();
					if (sobremesa == 1) {
						soma+=24.90;
						carrinho[quantidade] = "Taça da felicidade";
						quantidade++;
						System.out.println("Taça da felicidade adicionada ao carrinho!");
						System.out.println("---------------------");
						System.out.println("Deseja finalizar a compra? ");
						System.out.println("---------------------");
						finalizar = sc.next();
						if (finalizar.equalsIgnoreCase("Sim")) {
							System.out.println("Pedido finalizado!");
							 System.out.println("Itens do seu pedido:");
							    for (int p = 0; p < quantidade; p++) {
							        System.out.println("- " + carrinho[p]);
							    }
							System.out.printf("O total do seu pedido foi de: R$%.2f",soma);
							break;
						} else {
							System.out.println("Voltando ao menu!");
							System.out.println("---------------------");
						}
					} else if (sobremesa == 2) {
						soma+=22.90;
						carrinho[quantidade] = "Petit Gateau";
						quantidade++;
						System.out.println("Petit Gateau adicionado ao carrinho!");
						System.out.println("---------------------");
						System.out.println("Deseja finalizar a compra? ");
						System.out.println("---------------------");
						finalizar = sc.next();
						if (finalizar.equalsIgnoreCase("Sim")) {
							System.out.println("Pedido finalizado!");
							 System.out.println("Itens do seu pedido:");
							    for (int q = 0; q < quantidade; q++) {
							        System.out.println("- " + carrinho[q]);
							    }
							System.out.printf("O total do seu pedido foi de: R$%.2f",soma);
							break;
						} else {
							System.out.println("Voltando ao menu!");
							System.out.println("---------------------");
						}
					} else if (sobremesa == 3) {
						soma+=14.90;
						carrinho[quantidade] = "Brownie";
						quantidade++;
						System.out.println("Brownie adicionado ao carrinho!");
						System.out.println("---------------------");
						System.out.println("Deseja finalizar a compra? ");
						System.out.println("---------------------");
						finalizar = sc.next();
						if (finalizar.equalsIgnoreCase("Sim")) {
							System.out.println("Pedido finalizado!");
							 System.out.println("Itens do seu pedido:");
							    for (int r = 0; r < quantidade; r++) {
							        System.out.println("- " + carrinho[r]);
							    }
							System.out.printf("O total do seu pedido foi de: R$%.2f",soma);
							break;
						} else {
							System.out.println("Voltando ao menu!");
							System.out.println("---------------------");
						}
					} else {
						System.out.println("Opção inválida");

					}
				 }
				

			else if(item ==4) {
			System.out.println("Opções de Acompanhamentos:");
			System.out.println("1-Onion Rings: R$22,90");
			System.out.println("2-Batata Frita com cheddar e bacon : R$25,90");
			System.out.println("3-Batata Rústica: R$20,90");
			System.out.println("4-Voltar");
			System.out.println("Qual você deseja pedir? ");
			int acompanhamentos = sc.nextInt();
			if (acompanhamentos == 1) {
				soma+=22.90;
				carrinho[quantidade] = "Onion Rings";
				quantidade++;
				System.out.println("Onion Rings adicionado ao carrinho!");
				System.out.println("---------------------");
				System.out.println("Deseja finalizar a compra? ");
				System.out.println("---------------------");
				finalizar = sc.next();
				if (finalizar.equalsIgnoreCase("Sim")) {
					System.out.println("Pedido finalizado!");
					 System.out.println("Itens do seu pedido:");
					    for (int s = 0; s < quantidade; s++) {
					        System.out.println("- " + carrinho[s]);
					    }
					System.out.printf("O total do seu pedido foi de: R$%.2f",soma);
					break;
				} else {
					System.out.println("Voltando ao menu!");
					System.out.println("---------------------");
				}
			} else if (acompanhamentos == 2) {
				soma+=25.90;
				carrinho[quantidade] = "Batata Frita com cheddar e bacon";
				quantidade++;
				System.out.println("Batata Frita com cheddar e bacon adicionada ao carinho!");
				System.out.println("---------------------");
				System.out.println("Deseja finalizar a compra? ");
				System.out.println("---------------------");
				finalizar = sc.next();
				if (finalizar.equalsIgnoreCase("Sim")) {
					System.out.println("Pedido finalizado!");
					 System.out.println("Itens do seu pedido:");
					    for (int t = 0; t < quantidade; t++) {
					        System.out.println("- " + carrinho[t]);
					    }
					System.out.printf("O total do seu pedido foi de: R$%.2f",soma);
					break;
				} else {
					System.out.println("Voltando ao menu!");
					System.out.println("---------------------");
				}
			} else if (acompanhamentos == 3) {
				soma+=20.90;
				carrinho[quantidade] = "Batata Rústica";
				quantidade++;
				System.out.println("Batata Rústica adicionada ao carinho!");
				System.out.println("---------------------");
				System.out.println("Deseja finalizar a compra? ");
				System.out.println("---------------------");
				finalizar = sc.next();
				if (finalizar.equalsIgnoreCase("Sim")) {
					System.out.println("Pedido finalizado!");
					 System.out.println("Itens do seu pedido:");
					    for (int u = 0; u < quantidade; u++) {
					        System.out.println("- " + carrinho[u]);
					    }
					System.out.printf("O total do seu pedido foi de: R$%.2f",soma);
					break;
				} else {
					System.out.println("Voltando ao menu!");
					System.out.println("---------------------");
				}
			} else {
				System.out.println("Opção inválida");

			}
		}

			
		
	}
	} while (!menu.equalsIgnoreCase("Sair"));

	
   }
}
