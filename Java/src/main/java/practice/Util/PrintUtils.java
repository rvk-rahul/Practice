package practice.Util;

import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class PrintUtils {

    public static void lstPrintInt(List<Integer> lst){
        for (int i: lst) {
            System.out.println(i);
        }
    }

    public static void lstPrintStr(List<String> lst){
        for (String i: lst) {
            System.out.println(i);
        }
    }

    public static void treePrintInt(TreeSet<Integer> treeSet){
        for (int i: treeSet) {
            System.out.println(i);
        }
    }

    public static void printMapCharInt(Map<Character, Integer> characterIntegerMap){
        for (Map.Entry<Character, Integer> entry: characterIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
