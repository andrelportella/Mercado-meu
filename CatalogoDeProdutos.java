package caixasupermercado;

import java.util.*;

public class CatalogoDeProdutos {

    HashMap<Integer, EspecProduto> hashEspecProduto = new HashMap();

    public CatalogoDeProdutos() {
        EspecProduto espec1 = new EspecProduto(1, "Banana", 1.99f);
        EspecProduto espec2 = new EspecProduto(2, "Pera", 5.00f);
        EspecProduto espec3 = new EspecProduto(3, "Uva", 3.50f);
        hashEspecProduto.put(1, espec1);
        hashEspecProduto.put(2, espec2);
        hashEspecProduto.put(3, espec3);

    }

    public EspecProduto identificarItem(int idItem) {
        return hashEspecProduto.get(idItem);
    }
}
