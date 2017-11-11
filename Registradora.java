
package caixasupermercado;

public class Registradora {
    Venda v1;

   private CatalogoDeProdutos catProd;
   
   public Registradora() {
       catProd = new CatalogoDeProdutos();       
   }
   
   public void iniciarVenda(){
         v1 = new Venda();
   }
      
   public void incluirItem(int idItem, int qtdItem){
      EspecProduto espec = catProd.identificarItem(idItem);    
      v1.incluirItemDeVenda(espec, qtdItem);
      v1.listarItem();
   }
   
   public float concluirVenda(){
       float total = v1.getTotal();
       return total;               
   }

    public void pagamento(float valorPago){
        v1.efetuarPagamento(valorPago);
    } 
    
    public float getTroco(){
        float troco;
        troco = v1.getTroco();
        return troco;
    }

}
