package prototipoPosto;

import java.util.Scanner;

/**
 *
 * @author Ederson .A Silva
 * 
 * Criado no jdk1.8.0_333 =] 
 */
public class Main {

    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        BombaDeCombustivel bomba = new BombaDeCombustivel("Gasolina",5.89f,50.f,0.0f);
        
        System.out.println(bomba.getTipodeCombustivel()+bomba.getValorLitro()+bomba.getQuantidadeDeCombustivel());
        
        /*
        Objeto alterarValorCombustivel vai substituir o valor que está em 
        default no construtor ou seja o valor valorLitro vai ser 
        substituido pelo NovoValor ou seja vai fazer a troca do valor do combus
        tivel quando isso ocorrer.
        */
        System.out.println("Frentista Por Favor Digite novo valor do Litro Gasolina :");
        bomba.alterarValorCombustivel(leitor.nextFloat());
       
        System.out.println("Frentista Digite se é Gasolina ou Etanol:");
        bomba.alterarTipoCombustivel(leitor.next());
        
        System.out.println("Frentista vai esvaziar ou encher a Bomba com Combustivel:");
        bomba.alterarQuantidadeDeCombustivel(leitor.nextFloat());
        
        /*Lembrando quem vai receber o valor para o calculo vai ser o parametro
        ValorEmDinheiroPorLitro com o valor armazenado na variavel conseguimos
        fazer o metodo que é pegar a quantidadeDeCombustivel dividido pelo 
        ValorEmDinheiroPorLitro dado ao cliente assim o objeto 
        abastecimentoPorValor me retorna o calculo do metodo resolvido*/
        System.out.println("Qual Valor quer abastecer: ");
        bomba.abastecimentoPorValor(leitor.nextFloat());
        System.out.println(bomba.getQuantidadeDeCombustivel() + "Lts");
        
        System.out.println("Quantos Litros você Deseja : ");
        bomba.abastecerPorLitro(leitor.nextFloat());
        System.out.println(bomba.getQuantidadeDeCombustivel());
        
        
        System.out.println(bomba.getTipodeCombustivel()+bomba.getValorLitro()+bomba.getQuantidadeDeCombustivel());
        
        
        
        
    }

}
