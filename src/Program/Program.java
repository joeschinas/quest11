/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

import entidades.Produto;
import java.util.Locale;
import java.util.Scanner;


public class Program {

    
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner read = new Scanner (System.in);
       
        System.out.println("Entre com o preco de custo do produto");
        Double precoCusto=read.nextDouble();
        System.out.println("Entre com o preco de Venda do produto");
        Double precoVenda=read.nextDouble();
        
       Produto p1 = new Produto(precoCusto, precoVenda);
       
        System.out.println("Lucro em moedas em relacao a esse produto:"+p1.calcularMargemLucro());
        p1.getMargemLucroPorcentagem();

        
    }
    
}
