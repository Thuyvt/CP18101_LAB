/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.regex.Pattern;

/**
 *
 * @author ThuyVT
 */
public class ValidateUtil {
    private static final String NUMERRIC_PATTERN = "\\d+(\\.\\d+)?";
    private static final String DATE_PATTERN = "\\d{2}[-|/]\\d{2}[-|/]\\d{4}";
    
    public static boolean pattenMatches(String value, String regexPattern) {
        return Pattern.compile(regexPattern).matcher(value).matches();
    }
    
    public static boolean numberMatches(String value) {
        return pattenMatches(value, NUMERRIC_PATTERN);
    }
   
}
