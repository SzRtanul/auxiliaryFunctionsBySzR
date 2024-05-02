/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 * @author SzabóRoland(SZOFT_20
 */
public class AuxiliaryFunctions {
    
    // <editor-fold defaultstate="collapsed" desc="Közös">
    public static int intBekeres(String inputText){
        String bem;
        int a;
        do {
            bem = bekeres(inputText);
            a = tryParse(bem);
        } while (!CanITryParse(bem));
        return a;
    }
    
    public static String bekeres(String inputText){
        KonzolraKiir(inputText, "");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
    public static void KonzolraKiir(String bem){
        System.out.println(bem);
    }
    
    public static void KonzolraKiir(String bem, String end){
        System.out.print(bem+end);
    }
    
    public static <T> String tombKiir(T[] tomb){
        return tombKiir(tomb,  "\n");
    }
     
    public static <T> String tombKiir(T[] tomb, String elvalaszt){
        String s = "";
        for(Object item : tomb){
            s += String.valueOf(item) + elvalaszt;
        }
        return s;
    }
     
    public static <T> String tombKiir(T[] tomb, String elvalaszt, int egysorbanmennyi){
        String s = "";
        int valaszt = 0;
        for(T item : tomb){
            if(valaszt >= egysorbanmennyi){
                s += "\n";
                valaszt = 0;
            }
            s += String.valueOf(item) + elvalaszt;
            valaszt++;
        }
        return s.substring(0, s.length() - elvalaszt.length());
    }
    
    public static void fajlbair(String bem, String filename) throws FileNotFoundException{
        //File f = new File(filename);
        PrintWriter pn = new PrintWriter(new OutputStreamWriter(new FileOutputStream(filename), StandardCharsets.UTF_8));
        pn.print(bem);
        pn.flush();
    }
    
    public static int tryParse(String bem){
        try {
            return Integer.parseInt(bem);
        } catch (Exception e) {
            return -1;
        }
    }
    public static boolean CanITryParse(String bem){
        try {
            int a = Integer.parseInt(bem);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public static int sum(int[] szamok){
        int sum = 0;
        for(int szam : szamok){
            sum += szam;
        }
        return sum;
    }
    
    public static int min(int[] szamok){
        int min = Integer.MAX_VALUE;
        for(int szam : szamok){
            min = szam < min ? szam : min;
        }
        return min;
    }

    public static int max(int[] szamok){
        int max = Integer.MIN_VALUE;
        for(int szam : szamok){
            max = szam > max ? szam : max;
        }
        return max;
    }
    
    public static int kivalasztas(int[] szamok, int melyik) {
        int index = -1;
        boolean both = false;
        for (int i = 0; i < szamok.length && !both; i++) {
            both = szamok[i] == melyik;
            if(both) index = i;
        }
        return index;
    }
    // </editor-fold>
    
    public static byte[] add(byte[] numbers, byte newItem){
        byte[] newArray = new byte[numbers.length +1];
        System.arraycopy(numbers, 0, newArray, 0, numbers.length);
        newArray[numbers.length] = newItem;
        return newArray;
    }
    
    public static int[] add(int[] numbers, int newItem){
        int[] newArray = new int[numbers.length +1];
        System.arraycopy(numbers, 0, newArray, 0, numbers.length);
        newArray[numbers.length] = newItem;
        return newArray;
    }
    
    public static double[] add(double[] numbers, double newItem){
        double[] newArray = new double[numbers.length +1];
        System.arraycopy(numbers, 0, newArray, 0, numbers.length);
        newArray[numbers.length] = newItem;
        return newArray;
    }
    
    public static float[] add(float[] numbers, float newItem){
        float[] newArray = new float[numbers.length +1];
        System.arraycopy(numbers, 0, newArray, 0, numbers.length);
        newArray[numbers.length] = newItem;
        return newArray;
    }
    
    public static short[] add(short[] numbers, short newItem){
        short[] newArray = new short[numbers.length +1];
        System.arraycopy(numbers, 0, newArray, 0, numbers.length);
        newArray[numbers.length] = newItem;
        return newArray;
    }
    
    public static long[] add(long[] numbers, long newItem){
        long[] newArray = new long[numbers.length +1];
        System.arraycopy(numbers, 0, newArray, 0, numbers.length);
        newArray[numbers.length] = newItem;
        return newArray;
    }
    
    public static boolean[] add(boolean[] items, boolean newItem){
        boolean[] newArray = new boolean[items.length +1];
        System.arraycopy(items, 0, newArray, 0, items.length);
        newArray[items.length] = newItem;
        return newArray;
    }
    
    public static <T> T[] add(T[] items, T newItem){
        T[] newArray = (T[]) new Object[items.length +1];
        System.arraycopy(items, 0, newArray, 0, items.length);
        newArray[items.length] = newItem;
        return newArray;
    }
}
