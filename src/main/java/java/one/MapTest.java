package java.one;

import java.util.TreeMap;

/**
 * Created by root on 14-8-6.
 */
public class MapTest {

    public static TreeMap getTreeMap(){
        TreeMap tm=new TreeMap<String,Integer>();
        tm.put("age" ,28);
        return tm;
    }
}
