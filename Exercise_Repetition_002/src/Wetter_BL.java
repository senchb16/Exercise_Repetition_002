
import java.io.BufferedWriter;
import java.io.File;
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
                    bw.write(aufnahme.toString());
                    bw.newLine();
                }
            }
            catch(Exception ex){
                
            }
        }
    }
}
