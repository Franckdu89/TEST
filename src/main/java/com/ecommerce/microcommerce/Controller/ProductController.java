package com.ecommerce.microcommerce.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.microcommerce.dao.ProductDao;
import com.ecommerce.microcommerce.model.Product;


//@RestController est simplement la combinaison des deux annotations précédentes.
//Une fois ajouté, il indique que cette classe va pouvoir traiter les requêtes que nous allons définir.
//Il indique aussi que chaque méthode va renvoyer directement la réponse JSON à l'utilisateur,
//donc pas de vue dans le circuit.
@RestController
public class ProductController {
	
	 @Autowired
	 private ProductDao productDao;
	
	 //Récupérer la liste des produits
	    @RequestMapping(value="/Produits", method=RequestMethod.GET)
	    public List<Product> listeProduits() {
	        return productDao.findAll();
	    }

	 //Récupérer un produit par son id
	 @GetMapping(value="/Produits/{id}")
	 public Product afficherUnProduit(@PathVariable int id) {
	        return productDao.findById(id);
	    }
	
}
