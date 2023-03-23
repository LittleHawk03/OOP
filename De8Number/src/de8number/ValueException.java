/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de8number;

/**
 *
 * @author honahl
 */
public class ValueException extends Exception{

    public ValueException() {
    }

    @Override
    public String getMessage() {
        return super.getMessage() +"gia tri value khong thoa man dieu kien min < value < max";
        
    }
    
    
}
