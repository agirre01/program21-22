/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author agirrezabala.peru
 */
<<<<<<< HEAD
public class Enpresa implements Bezeroa {
   private int kodea;
   private String izenJuridikoa;
   private String izenKomertziala;
   private String helbidea;
   private String[] kontaktoenemailak;

    public int getKodea() {
        return kodea;
    }

    public String getHelbidea() {
        return helbidea;
    }
   
   public String getIzena(){
       return izenJuridikoa;
   }
   public String getEmaila(){
       
       return kontaktoenemailak[0];
   }
=======
public class Enpresa extends Bezeroa {
    private String izenJuridikoa;
    private String izenKomertziala;
    private String[] kontaktoenEmailak;
>>>>>>> ad318edc19db29cf2450f8a35d69cdb170dd37b4
    
    
     
}
