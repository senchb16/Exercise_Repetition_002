
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christoph
 */
public class Wetter_BL extends AbstractListModel{
    ArrayList<WetterAufnahme> liste = new ArrayList<WetterAufnahme>();

    @Override
    public int getSize() {
        return liste.size();
    }

    @Override
    public Object getElementAt(int i) {
        return liste.get(i);
    }

    public void add(WetterAufnahme aufnahme) {
        liste.add(aufnahme);
        fireIntervalAdded(this, 0, liste.size()-1);
    }
    public void saveFile(){
           JFileChooser chooser = new JFileChooser();
        if(chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION){
            File f = chooser.getSelectedFile();
            
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(f,false))){ // [true/false] -> optional
                for (WetterAufnahme aufnahme : liste) {
                    String line = aufnahme.getTemp() +"," + aufnahme.getLuftfeuchtigkeit() +","+aufnahme.getDate();
                    bw.write(line);
                    bw.newLine();
                }
            }
            catch(Exception ex){
                
            }
        }
    }
    
    public void loadFile(File file){
        liste.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {

                try {
                    
                    WetterAufnahme aufnahme = new  WetterAufnahme(line);
                    liste.add(aufnahme);
                
                } catch (Exception e) {
                    
                }
            }
        } catch (Exception e) {

        }
        fireIntervalAdded(this, 0, liste.size()-1);
    }
}
