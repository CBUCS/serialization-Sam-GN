package Classes;

import Main.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

public class Serialization {
    public static final Logger logger = LogManager.getLogger(Serialization.class);
    public static void Serialize(String pFilename, Object pObject){
        try {
            FileOutputStream fileOutPutStream = new FileOutputStream(pFilename);
            ObjectOutputStream ObjectOut = new ObjectOutputStream(fileOutPutStream);
            ObjectOut.writeObject(pObject);
            ObjectOut.close();
            fileOutPutStream.close();

            logger.info("Serialized data is saved in binaryTree.ser");

        } catch (IOException ex) {

            logger.info(ex.getMessage());

        }
    }

    public static void Deserialize(String pFileName){

        try {
            FileInputStream fileInputStream = new FileInputStream(pFileName);
            ObjectInputStream objectStream = new ObjectInputStream(fileInputStream);
            mBinaryTree<Integer> loadedTree = (mBinaryTree<Integer>) objectStream.readObject();
            objectStream.close();
            fileInputStream.close();
            System.out.println("Deserialized data from tree.ser");
            loadedTree.print();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());
        }
    }
}
