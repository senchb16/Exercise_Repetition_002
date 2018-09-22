
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph
 */
public class WetterAufnahme {

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM - HH:mm:ss");
        String s = "%";
        return String.format("%s - %d° - %d%s",date.format(dtf),temp, luftfeuchtigkeit,s);
    }

    public WetterAufnahme(int temp, int luftfeuchtigkeit, LocalDateTime date) {
        this.temp = temp;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.date = date;
    }
    int temp;
    int luftfeuchtigkeit;
    LocalDateTime date;
    
}
