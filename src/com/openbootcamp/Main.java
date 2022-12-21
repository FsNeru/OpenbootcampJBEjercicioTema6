package com.openbootcamp;

import java.io.InputStream;
import java.io.PrintStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.SimpleTimeZone;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        String saludo = "Hola Neru";

        String[] arrayString = {"Hola","Neru"};

        String[][] arrayStringBi = {{"Hola","Neru"},
                                {"Hola","Diovan"}};

        Vector<String> vectorString = new Vector<>();
        vectorString.add("Hola");
        vectorString.add("Buenos");
        vectorString.add("dias");
        vectorString.add("Que");
        vectorString.add("Pereza");

        ArrayList<String> arrayListString = new ArrayList<>();

        arrayListString.add("Hola");
        arrayListString.add("Buenas");
        arrayListString.add("Que");
        arrayListString.add("Pereza");

        ArrayList<Integer> arrayListInt = new ArrayList<>();








        System.out.println(saludo);
        System.out.println(reverseString(saludo));
        System.out.println("----------------------------------------------------");
        recorrerArray(arrayString);
        System.out.println("----------------------------------------------------");
        recorrerArrayBi(arrayStringBi);
        System.out.println("----------------------------------------------------");
        eliminarElementosVector(vectorString);
        System.out.println("----------------------------------------------------");
        arrayListToLinkedList(arrayListString);
        System.out.println("----------------------------------------------------");
        ArrayList<Integer> arrayListDel1al10 = rellenarArrayListInteger(arrayListInt);
        System.out.println(arrayListDel1al10);
        System.out.println("----------------------------------------------------");
        ArrayList<Integer> arrayListSinNumPar = eliminarIntParArrayList(arrayListDel1al10);
        System.out.println(arrayListSinNumPar);
        System.out.println("----------------------------------------------------");
        recorrerArrayList(arrayListSinNumPar);
        System.out.println("----------------------------------------------------");
        System.out.println(dividirPorCero(5));



    }


    public static String reverseString (String text){
        String result = "";

        for (int i = text.length() -1 ; i >= 0 ; i--)
        {
            result += text.charAt(i);
        }

        return result;
    }
    public static void recorrerArray(String[] array){
        for (String texto : array){
            System.out.println(texto);

        }
    }
    public static void recorrerArrayBi(String[][] array){
        for (int i = 0; array.length > i ; i++){
            for (int j = 0; array[i].length > j ; j++){
                System.out.println(array[i][j]);
            }

        }
    }
    public static void eliminarElementosVector (Vector vector){
        vector.remove(2);
        vector.remove(1);
        System.out.println(vector);
    }
    public static void arrayListToLinkedList(ArrayList arrayList){
        Vector<String> result = new Vector<>();
        for (Object texto : arrayList){
            result.add(texto.toString());
        }
        System.out.println(arrayList);
        System.out.println(result);
    }
    public static ArrayList<Integer> rellenarArrayListInteger(ArrayList arrayList){
        for (int i = 1 ; i <= 10; i++){
            arrayList.add(i);
        }
        return arrayList;
    }
    public static ArrayList<Integer> eliminarIntParArrayList(ArrayList arrayList){
        for (int i = 0 ; i < arrayList.size(); i++){
            int num = (int) arrayList.get(i);
            if (num % 2 == 0){
                arrayList.remove(i);
            }
        }
        return arrayList;
    }
    public static void recorrerArrayList(ArrayList arrayList){
        for (Object number : arrayList){
            System.out.println(number.toString());

        }
    }
    public static int dividirPorCero (int num){
        int result = 0;
        try {
            result = num / 0;
        }catch (Exception e ){
            System.out.println("Esto no puede hacerce. Error: " + e);
        } finally {
            System.out.println("Demo de codigo");
        }

        return result;
    }
    public static void copyStream (InputStream fileIn , PrintStream fileOut){
        
    }
}
