/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IleInterdite;

/**
 *
 * @author mariottp
 */
public enum TypeEnum {
    SEC("SEC"),
    MOUILLE("MOUILLE"),
    INONDE("INONDE");
    
    private String etat = "";
    
    TypeEnum(String etat){
        this.etat = etat;
    }
    
    @Override
    public String toString(){
        return etat;
    }
}