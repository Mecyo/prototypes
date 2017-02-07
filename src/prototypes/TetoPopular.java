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
public class TetoPopular implements ITeto, IPrototype {

    public TetoPopular() {
    }
    
    @Override
    public String abrir() {
        return "Abrindo Teto Popular!";
    }
    
    @Override
    public IPrototype clone() {
        TetoPopular tetoPopular = new TetoPopular();
        return tetoPopular;
    }
    
    @Override
    public String toString() {
        return "TetoPopular";
    }
}
