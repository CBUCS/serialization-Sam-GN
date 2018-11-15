package Main;

import Classes.Serialization;
import Classes.mBinaryTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.FileUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String... args){
        mBinaryTree<Integer> tree = new mBinaryTree<Integer>();
        tree.add(4);
        tree.add(1);
        tree.add(3);
        tree.add(6);
        tree.add(2);
        tree.add(5);

        logger.info("Hello, world");

        tree.print();

       Serialization.Serialize("tree.ser",tree);
       Serialization.Deserialize("tree.ser");


    }
}
