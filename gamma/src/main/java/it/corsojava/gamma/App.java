package it.corsojava.gamma;

import java.math.BigDecimal;

import it.corsojava.bookstore.beans.Prodotto;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;

public class App {
    
	public static void main( String[] args ) {
    	
    	Jsonb builder = JsonbBuilder.create();
    	Prodotto p = new Prodotto();
    	
    	// SERIALIZZAZIONE 
    	
    	/*   	
    	p.setTitolo("Volume principale");
    	p.setDescrizione("Descrizione principale");
    	p.setIdProdotto(8009);
    	p.setAliquota(BigDecimal.valueOf(10));
    	p.setPrezzo(BigDecimal.valueOf(36.50));
    	
    	String json = builder.toJson(p);
    	
    	System.out.println(json);
    	*/
    	
    	// DESERIALIZZAZIONE    	
    	
    	/*
    	String json ="{\"aliquota\":10,\"descrizione\":\"Descrizione principale\",\"idProdotto\":8009,\"imageFileName\":\"/bookstore/images/prod009.png\",\"prezzo\":36.5,\"titolo\":\"Volume principale\"}";
    	//String json ="{\"aliquota\":10,\"intestazione\":\"Volume principale\"}";
    	
    	p=builder.fromJson(json, Prodotto.class);
    	
    	System.out.println(p.getTitolo()+" - "+p.getDescrizione());
    	*/
    }
}
