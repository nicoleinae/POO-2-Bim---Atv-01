package loja;

import java.util.Scanner;

public class TestaBrinquedo {

	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in);
		
		Brinquedo brinquedo = new Brinquedo();
		
		System.out.println("Qual o nome do brinquedo? \n");
		String nome = sc.nextLine();
		brinquedo.setNome(nome);
		
	    System.out.println("Qual a faixa etária indicada? \n");
		String faixaEtaria = sc.nextLine();
        boolean faixaValida = brinquedo.setFaixaEtaria(faixaEtaria);
        if (!faixaValida) {
            System.out.println("Faixa etária inválida");
            sc.close();
            return;
        }
		
		System.out.println("Qual o preço? \n");
		float preco = sc.nextFloat();
		brinquedo.setPreco(preco);
		
		sc.close();
		
		
		System.out.println("Produto Inserido no Sistema:");
		System.out.println("Nome do Brinquedo: " + brinquedo.getNome());
		System.out.println("Faixa Etária: " + brinquedo.getFaixaEtaria());
		System.out.println("Preço: " + brinquedo.getPreco());

	}
}
