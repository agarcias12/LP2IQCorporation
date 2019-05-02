/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.pucp.inf.iqgesttec.mysql;

import pe.edu.pucp.inf.iqgesttec.model.bean.State;

/**
 *
 * @author ASUS
 */
public class Utils {
    public static State convertState(String st){
        State state=State.Damaged;
        if(State.Damaged.toString()==st){
            state =State.Damaged;            
        }
        else if(State.Good.toString()==st){
            state =State.Good;            
        }
        else if(State.New.toString()==st){
            state =State.New;            
        }
        else if(State.Repaired.toString()==st){
            state =State.Repaired;            
        }
        return state;
    } 
}
