package prototypes;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import interfaces.IPrototype;
import interfaces.ISom;

/**
 *
 * @author Emerson
 */
public class SomPopular implements ISom, IPrototype {

    public SomPopular() {
    }
    
    @Override
    public String tocar() {
        return "Tocando Som de CD!";
    }
    
    @Override
    public IPrototype clone() {
        SomPopular somPopular = new SomPopular();
        return somPopular;
    }
    
    @Override
    public String toString() {
        return "SomPopular";
    }
}
