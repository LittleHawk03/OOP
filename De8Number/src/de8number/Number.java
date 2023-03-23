/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de8number;

import java.util.Scanner;

/**
 *
 * @author honahl
 */
public class Number {

    private Scanner scanner = new Scanner(System.in);
    private int value;
    private int max;
    private int min;

    public Number() {
    }

    public Number(int value, int max, int min) {
        this.value = value;
        this.max = max;
        this.min = min;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void ValueCheck() throws ValueException {
        if (min < value && value < max) {

        } else {
            throw new ValueException();
        }
    }

    public void nhap() {
        System.out.println("min : ");
        min = scanner.nextInt();
        System.out.println("max : ");
        max = scanner.nextInt();
        System.out.println("value : ");
        value = scanner.nextInt();
    }
    
    public Boolean checkNT(){
        if (value == 2 || value == 3) {
            return true;
        }
        if (value < 2 || value % 2 == 0 || value % 3 == 0) {
            return false;
        }
        
        for (int i = 2; i*i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public String toString() {
        return "Number{ value=" + value + ", max=" + max + ", min=" + min + '}';
    }
    
    
}
