/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jolab.jsf.test;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author jolab
 */
@ManagedBean(name = "hello")
public class IndexManagedBean {
    
    public String getHello(){
        String name = "Jolab";
        if(name==null || name.equals("")){
            name = new String();
        }
        return "Hello " + name + " " + new java.util.Date();
    }
    
}
