package caixasupermercado;
import java.util.ArrayList;
import java.util.Iterator;

public class Venda {
    Pagamento pagamento;
    ArrayList listaDeVenda;
    
    public Venda(){
    listaDeVenda = new ArrayList();
    }
    
    public void incluirItemDeVenda(EspecProduto espec, int qtd){
        ItemDeVenda itemV = new ItemDeVenda(qtd,espec);
        listaDeVenda.add(itemV);          
    }
    
    public float getTotal(){
        float total = 0;
        Iterator i = listaDeVenda.iterator();
        while(i.hasNext()) {
            ItemDeVenda proximo = (ItemDeVenda) i.next();
            total = total + proximo.subTotal();
        } 
        return total;
    }
    
    public void listarItem(){
        Iterator i = listaDeVenda.iterator();
        while(i.hasNext()){
            ItemDeVenda proximo = (ItemDeVenda) i.next();
            System.out.println(proximo.toString());
        }
    }
    
    public void efetuarPagamento(float valorPago){
        this.pagamento = new Pagamento(valorPago);
    }
    
    public float getTroco(){
        float tot, val;
        tot = this.getTotal();
        val = this.pagamento.valor;
        return val - tot;
    }
}
