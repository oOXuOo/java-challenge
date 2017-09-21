package com.zahi.zhang;

import java.util.ArrayList;
import java.util.List;

/**
 * Arrays iteration!
 */
public class ListPuzzle1 {
    public static void main( String[] args ) {
        List<String> list = new ArrayList<String>();
        list.add("var1");
        list.add("var2");
        list.add("var3");
        list.add("var4");
        list.add("var5");

        for (String var : list) {
            if (var.equals("var2")) {
                list.remove(var);
            }
        }
    }
}
