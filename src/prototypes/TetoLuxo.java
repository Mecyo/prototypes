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
public class TetoLuxo implements ITeto, IPrototype {

    public TetoLuxo() {
    }

    @Override
    public String abrir() {
        return "Abrindo Teto de Luxo!";
    }

    @Override
    public IPrototype clone() {
        TetoLuxo tetoLuxo = new TetoLuxo();
        return tetoLuxo;
    }
    
    @Override
    public String toString() {
        return "TetoLuxo";
    }
    
}
