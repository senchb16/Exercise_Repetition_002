
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

    public LocalDateTime getDate() {
        return date;
    }

    public int getTemp() {
        return temp;
    }

    public int getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public WetterAufnahme(String line) {
       String[] parts = line.split(",");
       this.temp = Integer.parseInt(parts[0]);
       this.luftfeuchtigkeit = Integer.parseInt(parts[1]);
       this.date = LocalDateTime.parse(parts[2]);
    }

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
    private int temp;
    private int luftfeuchtigkeit;
    private LocalDateTime date;
    
    
    
}
