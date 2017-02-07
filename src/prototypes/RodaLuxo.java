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
public class RodaLuxo implements IRoda, IPrototype {

    public RodaLuxo() {
    }

    @Override
    public String alinhar() {
        return "Alinhando Roda de Liga Leve!";
    }
    
    @Override
    public IPrototype clone() {
        RodaLuxo rodaLuxo = new RodaLuxo();
        return rodaLuxo;
    }
    
    @Override
    public String toString() {
        return "RodaLuxo";
    }
    
}
