package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.*;
import play.api.libs.json.*;
import play.libs.Json;
import play.mvc.*;
import views.html.*;

import java.util.Hashtable;

public class Application extends Controller {
    static Hashtable<String, String> table;
    //-------------------------------------






    public static Result index() {
        return ok(index.render("Listo los servicios web!!"));
    }

    /**
     * El siguiente metodo hace una multiplicacion de enteros
     * @param a
     * @param b
     * @return
     */
    public static Result getMultiplicacion(int a, int b){
        ObjectNode result = Json.newObject();
        result.put("resultado", a*b );
        return ok(result);
    }

    /**
     * SE verifica una palabra si es una palindromo
     * @param word
     * @return
     */
    public static Result getPalindromo(String word){
        ObjectNode result = Json.newObject();
        String myWord = word.replaceAll("\\s+","");
        String reverse = new StringBuffer(myWord).reverse().toString();
        result.put("resultado", reverse.equalsIgnoreCase(myWord));
        return ok(result);
    }

    /**
      Se hace el cambio de valor de dolares a peso
    */
    public static Result getCota(Double dolares)
    {
        ObjectNode result = Json.newObject();
        result.put("pesos", dolares*15.28);
        return ok(result);
    }
    // Se obtiene la capital del pais seleccionado
    public static Result getCapital(String pais){
        ObjectNode result = Json.newObject();
        table = new  Hashtable<String, String>();
        table.put("Alemania", "Berlin");
        table.put("Austria", "Viena");
        table.put("Belgica", "Bruselas");
        table.put("España", "Madrid");
        table.put("Francia", "Paris");
        table.put("Reino Unido", "Londres");
        table.put("Italia", "Roma");

        result.put("capital",table.get(pais));
        return ok(result);

    }

    // Se hace la conversion de farenheit a celcius
    public static Result getCelcius(Double farenheit){
      ObjectNode result =Json.newObject();
      result.put("celcius", (farenheit-32)/1.8);
      return ok(result);
    }

    // Se obtien la localizacion de la embajda mexica en dicho pais
    public static Result getLocalizacion(String pais){
        ObjectNode result = Json.newObject();
        table = new  Hashtable<String, String>();
        table.put("Alemania", "52.5077843,13.3517587");
        table.put("Austria", "48.1979070,16.3663390");
        table.put("Belgica", "50.8083158,4.3849209");
        table.put("España", "40.4160947,-3.6973632");
        table.put("Francia", "48.8648275,2.292344");
        table.put("Reino Unido", "51.513845,-0.1422097");
        table.put("Italia", "41.9133032,12.5097257");

        result.put("ubicacion",table.get(pais));
        return ok(result);

    }


}
