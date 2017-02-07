package prototypes;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import interfaces.IPrototype;
import interfaces.ITeto;

/**
 *
 * @author Emerson
 */
public class TetoMistureba implements ITeto, IPrototype {

    public TetoMistureba() {
    }

    @Override
    public String abrir() {
        return "Abrindo Teto Mistureba!";
    }

    @Override
    public IPrototype clone() {
        TetoMistureba tetoMistureba = new TetoMistureba();
        return tetoMistureba;
    }
    
    @Override
    public String toString() {
        return "TetoMistureba";
    }
    
}
