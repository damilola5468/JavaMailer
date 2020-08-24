/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Mailer.Mailer;

/**
 *
 * @author DATA PC
 */
public class test {
    public static void main(String[] args){
        Mailer mailer = new Mailer();
        mailer.send("lorlahstrings@gmail.com","Hello World","Hello Damilola");
    }
}
