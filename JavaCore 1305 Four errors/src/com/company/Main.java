package com.company;

/*

1305 Four errors
Correct 4 errors in the program so that it compiles.

Requirements:
1. Variables declared in the interface can have only the widest level of access (public).
2. Extends can only be inherited from a class; the implements keyword is used to implement interfaces.
3. The Hobbie class must be declared with a static access modifier.
4. There is no need to create a Dream object to access the HOBBIE variable.
5. Do not modify interface declarations.


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println(Dream.HOBBIE.toString());
        System.out.println(new Hobbie().toString());

    }

    interface Desire {
    }

    interface Dream {
        static Hobbie HOBBIE = new Hobbie();
    }

    static class Hobbie implements Dream, Desire {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}



