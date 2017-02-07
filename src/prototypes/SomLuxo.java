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
public class SomLuxo implements ISom, IPrototype {

    public SomLuxo() {
    }

    @Override
    public String tocar() {
        return "Tocando Som Multimídia!";
    }
    
    @Override
    public IPrototype clone() {
        SomLuxo somLuxo = new SomLuxo();
        return somLuxo;
    }
    
    @Override
    public String toString() {
        return "SomLuxo";
    }
    
}
