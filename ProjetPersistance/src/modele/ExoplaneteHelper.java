package modele;
import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.*;

public class ExoplaneteHelper {
    public static void write(Exoplanete m, String filename) throws Exception
    {
    	filename = "src/sauvegardes/" + filename + ".xml";
    	
        XMLEncoder encoder =
           new XMLEncoder(
              new BufferedOutputStream(
                new FileOutputStream(filename)));
        encoder.writeObject(m);
        encoder.close();
    }

    public static Exoplanete read(String filename) throws Exception 
    {
    	filename = "src/sauvegardes/" + filename;
    	
        XMLDecoder decoder =
            new XMLDecoder(new BufferedInputStream(
            new FileInputStream(filename)));
        Exoplanete o = (Exoplanete)decoder.readObject();
        decoder.close();
        return o;
    }
}