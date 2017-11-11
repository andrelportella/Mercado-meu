
package caixasupermercado;

public class ItemDeVenda {
    int qtd;
    EspecProduto espec;
    
    public ItemDeVenda(int qtd, EspecProduto espec ){
        this.espec = espec;
        this.qtd = qtd;
    }   
    
    @Override
    public String toString(){
        return "ItemdeVenda{" + "quantidade= " + qtd + "," + espec.toString() + '}';
    }
    
    public Float subTotal(){
        return(espec.getPreco() * this.qtd);
    }
}

