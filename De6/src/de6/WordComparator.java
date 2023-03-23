/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de6;

import java.util.Comparator;

/**
 *
 * @author honahl
 */
public class WordComparator implements Comparator<Word>{

    @Override
    public int compare(Word t, Word t1) {
        return t.getEn().compareToIgnoreCase(t1.getEn());
    }
    
}
