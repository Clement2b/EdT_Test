/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;
import java.util.Calendar;
/**
 *
 * @author cleme
 */
public class FindWeek {
    
    public static int FindWeek() {
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.WEEK_OF_YEAR);
        return week;
    }
}
