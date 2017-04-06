package modele;
import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.*;

public class ExoplaneteHelper {
    public static void write(Exoplanete f, String filename) throws Exception
    {
    	filename = "../sauvegardes/" + filename;
    	
        XMLEncoder encoder =
           new XMLEncoder(
              new BufferedOutputStream(
                new FileOutputStream(filename)));
        encoder.writeObject(f);
        encoder.close();
    }

    public static Exoplanete read(String filename) throws Exception 
    {
    	filename = "../sauvegardes/" + filename;
    	
        XMLDecoder decoder =
            new XMLDecoder(new BufferedInputStream(
                new FileInputStream(filename)));
        Exoplanete o = (Exoplanete)decoder.readObject();
        decoder.close();
        return o;
    }
}