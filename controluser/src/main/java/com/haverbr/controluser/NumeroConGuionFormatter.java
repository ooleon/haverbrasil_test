package com.haverbr.controluser;


import java.util.regex.Pattern;
//import javafx.css.converter.StringConverter;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.TextFormatter.Change;
import javafx.util.StringConverter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leo
 */
public class NumeroConGuionFormatter{
/*
public class NumeroConGuionFormatter extends TextFormatter {

    private final Pattern pattern;
    private final String mask;

    public NumeroConGuionFormatter() {
        
        this.pattern = Pattern.compile("\\d{5}-\\d{3}");
        this.mask = "#####-###";
    }

    public Change filter(Change change) {
        String text = change.getControlText();
        String filteredText = "";

        if (pattern.matcher(text).matches()) {
            filteredText = text;
        } else {
            for (int i = 0; i < Math.min(text.length(), mask.length()); i++) {
                char c = text.charAt(i);
                if (mask.charAt(i) == '#' && Character.isDigit(c)) {
                    filteredText += c;
                }
            }
        }
//Change c1 = new Change();
//        return new Change(change.getControl(), 1, filteredText);
return null;
    }
*/
}
