
package caixasupermercado;

public class EspecProduto {
    public int idItem;
    public String nomeItem;
    public float precoItem;
    
    @Override
    public String toString(){
        return "Produto" + "id =" + idItem + ", Item =" + nomeItem + ", preco=" + precoItem + '}';
    }
    
    public EspecProduto(int idItem,String nomeItem,float precoItem){
        this.idItem = idItem;
        this.nomeItem = nomeItem;
        this.precoItem = precoItem;
    }
    
    public float getPreco(){
        return this.precoItem;
    }
}
