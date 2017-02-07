package prototypes;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import interfaces.IPrototype;
import interfaces.IRoda;

/**
 *
 * @author Emerson
 */
public class RodaMistureba implements IRoda, IPrototype {

    public RodaMistureba() {
    }

    @Override
    public String alinhar() {
        return "Alinhando Roda Mistureba!";
    }
    
    @Override
    public IPrototype clone() {
        RodaMistureba rodaMistureba = new RodaMistureba();
        return rodaMistureba;
    }
    
    @Override
    public String toString() {
        return "RodaMistureba";
    }
}
