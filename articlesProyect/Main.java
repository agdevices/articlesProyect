package articlesProyect;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {

		try {
			int qty=0;
			String number=JOptionPane.showInputDialog("Introduce la cantidad de Articulos de la lista");
			qty=Integer.parseInt(number);
			ArticleManagement.initArrayList(qty);
		}
		catch (NumberFormatException e) {
			System.out.println("Se presiono Cancel");
			System.exit(0);
		}		
		catch (NullPointerException e) {
		System.out.println("Numero ingresado inválido");
		System.exit(0);
		}		
		
		String option = "";
		try {
			while (option.equals("B") != true && option.equals("E") != true &&
				option.equals("C") != true) {
				option = JOptionPane.showInputDialog("Seleccione:\n B: borra un articulo\n E: Edita un articulo\n "
						+ "C: Borra todos los articulos").toUpperCase();
					if 	(option.equals("B")!=true && option.equals("E")!=true && option.equals("C")!=true) {
						JOptionPane.showMessageDialog(null, "Opcion Incorrecta. Intente nuevamente");
						option = "";
					}
			} 
		}catch (NullPointerException e) {
			System.out.println("Se presiono Cancel");
		}
	
		
		switch(option) {
			case "B":
				try {	
					int articleNumber=0;
					boolean inRange;
					do {
						inRange=true;
						String number=JOptionPane.showInputDialog("Introduce el articulo a Borrar");
						articleNumber=Integer.parseInt(number);
						if (number!=null) {
							if (articleNumber>ArticleManagement.getArrayLenght() || articleNumber<0) {
								inRange=false;			
								JOptionPane.showMessageDialog(null, "El Articulo no existe");
							}
						}
					}while (!inRange);
		
					ArticleManagement.delArticle(articleNumber);
					ArticleManagement.showList();
					System.out.println("Se borro correctamente el Articulo");
					System.exit(0);
				}catch (NumberFormatException e) {
					System.out.println("Se presiono Cancel");
					System.exit(0);
				}
			
			case "E":

				try {
					int articleNumber=0;
					boolean inRange;
					do {
						inRange=true;
						String number=JOptionPane.showInputDialog("Introduce el articulo a Editar");
						articleNumber=Integer.parseInt(number);
						if (number!=null) {
							if (articleNumber>ArticleManagement.getArrayLenght() || articleNumber<0) {
								inRange=false;			
								JOptionPane.showMessageDialog(null, "El Articulo no existe");
							}
						}
					}while (!inRange);

						int articleNumber1=0;
						boolean inRange1;
					
					do {
						inRange1=true;
						String number = JOptionPane.showInputDialog("Seleccione:\n 1: Editar Nombre\n 2: Editar Fecha de Alta");
						articleNumber1=Integer.parseInt(number);
						if (number!=null) {
							if (articleNumber1 > 3 || articleNumber1 < 0) {
								inRange1=false;			
								JOptionPane.showMessageDialog(null, "La opción es inválida");
							}
						}				
					}while(!inRange1);

						switch(articleNumber1) {	
						
							case 1:
								String name = JOptionPane.showInputDialog("Ingrese un nombre");
								ArticleManagement.changeName(name, articleNumber);
								ArticleManagement.showList();
								System.out.println("Se cambio el nombre del Articulo");
								System.exit(0);

							case 2:
								String dateIn = JOptionPane.showInputDialog("Ingrese una Fecha AAAAMMDD");
								ArticleManagement.changeDate(dateIn, articleNumber);
								ArticleManagement.UpdateDate(articleNumber);
								ArticleManagement.showList();
								System.exit(0);
	
						}
						
				}catch (NumberFormatException e) {
					System.out.println("Se presiono Cancel");
					System.exit(0);

				}	
				
				
				
				
		}	
			
					
	}
}
				
				
//System.out.println(number);
//System.out.println(articleNumber);

/*try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}*/

		
		/*else if (opcion.equalsIgnoreCase("E")==true) {
				
		//	String nro=JOptionPane.showInputDialog("Introduce el articulo a Editar");

		//	int nroArticulo=Integer.parseInt(nro);

		//	String nombre=JOptionPane.showInputDialog("Introduce el nombre");

		//	misArticulos.get(nroArticulo-1).setName(nombre);
			
		//	for (int i=0; i<misArticulos.size(); i++){

		//		System.out.println("Id: " + misArticulos.get(i).getId() + " Nombre: " 
		//		+ misArticulos.get(i).getName() + ". Creado: " + misArticulos.get(i).getCreatedDate()
		//		+ ". Actualizado: " + misArticulos.get(i).getUpdatedDate());
		//	}
		//	
		//	System.out.println("Se editó correctamente el Articulo");	
		
		//}

		//else if (opcion.equalsIgnoreCase("C")==true) {
				
		//	for (int i=0; i<misArticulos.size(); i++){

		//		misArticulos.remove(misArticulos.get(i));

		//	}
						

		//	for (int i=0; i<misArticulos.size(); i++){

		//		System.out.println("Id: " + misArticulos.get(i).getId() + " Nombre: " 
		//		+ misArticulos.get(i).getName() + ". Creado: " + misArticulos.get(i).getCreatedDate()
		//		+ ". Actualizado: " + misArticulos.get(i).getUpdatedDate());
		//	}			
			
		//	System.out.println("Se selecciono Borrar todos los registros");
					
		//}
		
		//else {
			
		//	System.out.println("Error de seleccion....Chau");

			
		//}*/
	
		
	
	



