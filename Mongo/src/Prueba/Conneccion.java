package Prueba;



import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;
 
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
 
import static java.util.Arrays.asList;
import java.util.LinkedList;
 
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conneccion {
private static MongoClient mongoClient;
private static MongoDatabase mongodb;
		
	
public static void main(String[] args) {        
	
  mongoClient = new MongoClient("localhost",27017);
    //((MongoClient) mongodb).getDatabase("tos");}
	mongodb = mongoClient.getDatabase("corta");
	//mongodb.createCollection("Libros");
	
	Document libro =  new Document();
	libro.append("titulo","El hombre no comia");
	libro.append("autor"," Malba Disco ");
	
	mongodb.getCollection("Libros").insertOne(libro);
	System.out.println("el mongo");
}
	
}
