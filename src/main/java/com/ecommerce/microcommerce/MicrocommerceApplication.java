package com.ecommerce.microcommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration : donne à la classe actuelle la possibilité de définir des configurations
//qui iront remplacer les traditionnels fichiers XML. 
//Ces configurations se font via des Beans.

//@EnableAutoConfiguration : l'annotation vue précédemment qui permet, 
//au démarrage de Spring, de générer automatiquement les configurations nécessaires en fonction des dépendances situées dans notre classpath.

//@ComponentScan : Indique qu'il faut scanner les classes de ce package 
//afin de trouver des Beans de configuration


@SpringBootApplication
public class MicrocommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrocommerceApplication.class, args);
	}
}
