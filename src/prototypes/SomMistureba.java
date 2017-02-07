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
public class SomMistureba implements ISom, IPrototype {

    public SomMistureba () {
    }

    @Override
    public String tocar() {
        return "Tocando Som Mistureba!";
    }
    
    @Override
    public IPrototype clone() {
        SomMistureba somMistureba = new SomMistureba();
        return somMistureba;
    }
    
    @Override
    public String toString() {
        return "SomMistureba";
    }
}
