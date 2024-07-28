package br.com.alura.TabelaFipe.principal;

import java.util.Scanner;

public class Pincipal {
   private Scanner entrada = new Scanner(System.in);

    public void exibiMenu(){

        var menu = """
                *** OPÇÕES ***
                Carro
                Moto
                Caminhão
                
                Digite uma das opções para consultar seus preços: 
                """;

        System.out.println(menu);
        var opcao = entrada.nextLine();



    }
}
