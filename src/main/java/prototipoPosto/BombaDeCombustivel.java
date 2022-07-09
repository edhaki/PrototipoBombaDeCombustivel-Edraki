/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototipoPosto;

/**
 *
 * @author Ederson .A Silva
 */
public class BombaDeCombustivel {
    private String tipodeCombustivel;
    private float valorLitro, quantidadeDeCombustivel,valorEmDinheiroPorLitro;
    
   
    
    
    
    public BombaDeCombustivel(String tipodeCombustivel, float valorLitro, float quantidadeDeCombustivel, float valorEmDinheiroPorLitro) {
        this.tipodeCombustivel = tipodeCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
        this.valorEmDinheiroPorLitro = valorEmDinheiroPorLitro;
    }
    /*Manipulando Objeto criei um objeto abastecimentoPorValor, esse objeto é 
    responsavel de receber o dinheiro que irei colocar para abastecer, assim
    valorEmDinheiroPorLitro vai receber o dinheiro que esta alocado no 
    objeto abastecimentoPorValor assim a quantidadeDeCombustivel vai fazer o 
    metodo de valorEmDinheiro dividido pelo valor do litro setado no default no
    construtor assim me retornando o calculo do Valor/ValorCombustivel.
    */
    public void abastecimentoPorValor(float valorEmDinheiroPorLitro){
        this.quantidadeDeCombustivel = (valorEmDinheiroPorLitro / valorLitro);
    }
    
    public void abastecerPorLitro(float quantidadeDeCombustivel){
        this.quantidadeDeCombustivel = (valorLitro * quantidadeDeCombustivel);
    }
    
    public void alterarValorCombustivel(float NovoValor){
        this.valorLitro = NovoValor;
    }
    /*Aqui é o mesmo processo de manipulação o objeto alterarTipoCombustivel
    vai receber a nova String no NovoTipo assim que eu escrever etanol ou diesel
    vai ocorrer a substituicao do valor na variavel tipodeCombustivel assim 
    alternando o tipo do combustivel*/
    public void alterarTipoCombustivel(String NovoTipo){
        this.tipodeCombustivel = NovoTipo;
    }
    
    public void alterarQuantidadeDeCombustivel(float alterarQtdComb){
        this.quantidadeDeCombustivel = alterarQtdComb;
    }
    
    public void setTipodeCombustivel(String tipodeCombustivel) {
        this.tipodeCombustivel = tipodeCombustivel;
    }

    public void setValorLitro(float valorLitro) {
        this.valorLitro = valorLitro;
    }

    public void setQuantidadeDeCombustivel(float quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }

    public void setValorEmDinheiroPorLitro(float valorEmDinheiroPorLitro) {
        this.valorEmDinheiroPorLitro = valorEmDinheiroPorLitro;
    }

    public String getTipodeCombustivel() {
        return tipodeCombustivel;
    }

    public float getValorLitro() {
        return valorLitro;
    }

    public float getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }

    public float getValorEmDinheiroPorLitro() {
        return valorEmDinheiroPorLitro;
    }
 
}
