package articlesProyect;

import java.util.*;

public class Article {
	
	private int id;
	private static int nextId=1;
	private String name;
	private Date created;
	private Date updated;
	//private Date newCreatedDate;
	//private Date newUpdatedDate;

	
	public Article(int id, String name, int yearCreated, int monthCreated, int dayCreated, 
			int yearUpdated, int monthUpdated, int dayUpdated) {
		
		this.id = nextId;
		this.name = name;
		GregorianCalendar calendario=new GregorianCalendar(yearCreated, monthCreated-1, dayCreated);
		created=calendario.getTime();
		GregorianCalendar calendario2=new GregorianCalendar(yearUpdated, monthUpdated-1, dayUpdated);
		updated=calendario2.getTime();
		nextId++;
	}
	
	
	public String getName() { //getter
		return name;
	}
	
	public int getId() { //getter
		return id;
	}

	public Date getCreatedDate() { //getter
		return created;
	}
	
	public Date getUpdatedDate() { //getter
		return updated;
	}
	
	public void setName(String nom) { //setter
		name=nom;
	}

	public void setCreatedDate(String newCreatedDate) { //setter
		int yearCreated=Integer.parseInt(newCreatedDate.substring(0, 4));
		int monthCreated=Integer.parseInt(newCreatedDate.substring(4, 6));
		int dayCreated=Integer.parseInt(newCreatedDate.substring(6, 8));
		GregorianCalendar calendario=new GregorianCalendar(yearCreated, monthCreated-1, dayCreated);
		created=calendario.getTime();
	}

	public void setUpdateDate() { //setter
		GregorianCalendar actualDate=new GregorianCalendar();
		updated=actualDate.getTime();

		//this.newUpdatedDate=newUpdatedDate;
	}
	
}
