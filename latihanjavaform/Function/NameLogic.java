/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjavaform.Function;

import latihanjavaform.ModelProgram.ModelProgram;

/**
 *
 * @author Nanda Yunita
 */
public class NameLogic {
        public String returnName(ModelProgram modelProgram){
    if (modelProgram.getName().equals("")){
        return "Your name couldn't be empty! ";
    } else {
        return "Hello, you must be " + modelProgram.getName();
    }
        }
}
