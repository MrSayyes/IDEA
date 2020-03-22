package com.sayyes.test;

import java.util.ArrayList;
import java.util.List;

/**
 * 常用模板
 *
 * @author sayyes
 * @date 2020/3/22
 */
public class TemplatesTest {
    //模板7：prsf
    private static final String a = "1";
    //psfi/psfs
    public static final int b = 1;
    public static final String c = "2";

    //模板1：psvm
    public static void main(String[] args) {
        //模板2：sout
        System.out.println();
        //模板3：fori
        for (int i = 0; i < 10; i++) {

        }
        //模板4：foreach/iter/itar
        String[] str = null;
        for (String s : str) {

        }
        //模板5：list.for/list.fori/list.forr
        List listFor = new ArrayList();
        listFor.add("1");
        listFor.add("2");
        // list.for
        for (Object o : listFor) {

        }
        //list.fori
        for (int i = 0; i < listFor.size(); i++) {

        }
        //list.forr
        for (int i = listFor.size() - 1; i >= 0; i--) {

        }

        //模板6：ifn
        if (listFor == null) {

        }
        //xxx.nn/xxx.null
        if (listFor != null) {

        }

        //模板7：prsf

    }
}
