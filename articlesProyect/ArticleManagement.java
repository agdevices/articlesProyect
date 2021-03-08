package articlesProyect;

import java.util.*;

public class ArticleManagement {
	
	static ArrayList<Article> myArticles = new ArrayList<Article>();

	//Inicializa arrayList con la cantidad de Articulos ingresados
	public static void initArrayList(int qty) {
		for (int i = 1; i < qty+1; i++){
			String articleName = "Art " + i;
			myArticles.add(new Article (i, articleName, 1999, 05, 18, 2008, 06, 12));
			
		}
	}

	// Borra el articulo ingresado
	public static void delArticle(int order) {
		myArticles.remove(myArticles.get(order-1));
	
	}

	//Imprime en consola la lista de articulos
	public static void showList() {
		for (Article e: myArticles) {
		System.out.println("Id: " + e.getId() + " Nombre: " + e.getName() + ". Creado: " + e.getCreatedDate()
				+ ". Actualizado: " + e.getUpdatedDate());
	}
	}

	//Devuelve el tamaño del arrayList
	public static int getArrayLenght () {
		return myArticles.size();
	}
	
	
	//Cambia el nombre del articulo
	public static void changeName (String name, int Id) {
		myArticles.get(Id-1).setName(name);
	}

	//Cambia Fecha de alta del articulo
	public static void changeDate (String newCreatedDate, int Id) {
		myArticles.get(Id-1).setCreatedDate(newCreatedDate);
	}

	//Cambia Fecha de alta del articulo
	public static void UpdateDate (int Id) {
		myArticles.get(Id-1).setUpdateDate();;
	}
}
	