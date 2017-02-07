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
public class RodaPopular implements IRoda, IPrototype {

    public RodaPopular() {
    }
    
    @Override
    public String alinhar() {
        return "Alinhando Roda de Ferro!";
    }
    
    @Override
    public IPrototype clone() {
        RodaPopular rodaPopular = new RodaPopular();
        return rodaPopular;
    }
    
    @Override
    public String toString() {
        return "RodaPopular";
    }
}
