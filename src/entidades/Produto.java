
package entidades;

import java.text.DecimalFormat;


public class Produto {
    DecimalFormat df = new DecimalFormat("#.##");
    private String nome;
    private Double precoCusto;
    private Double precoVenda;
    private Double margemLucro;

    public Produto() {
    }

    public Produto(Double precoCusto, Double precoVenda) {
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        
    }

    public Produto(String nome, Double precoCusto, Double precoVenda, Double margemLucro) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.margemLucro = margemLucro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(Double precoVenda) {
        try{
            if(precoVenda>this.precoCusto){
            this.precoVenda = precoVenda;
            }
        }
        catch(Exception errorPreco){
            System.out.println("Preco de venda nao pode ser inferior ao preco de custo");
        
        }
    }

    public Double getMargemLucro() {
        return margemLucro;
    }

    public void setMargemLucro(Double margemLucro) {
        this.margemLucro = margemLucro;
    }
    public Double calcularMargemLucro(){
   
    Double lucro=this.precoVenda-this.precoCusto;
    this.margemLucro=lucro;
    return lucro;
    }
    public void getMargemLucroPorcentagem(){
    
           this.margemLucro =(this.margemLucro*100)/this.precoCusto;
          System.out.println("Lucro em porcentagem em relacao ao produto:"+df.format(this.margemLucro)+"%");

           
    }
    
}
