package com.pm.commons.examples;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.list.UnmodifiableList;
import org.apache.commons.collections4.map.FixedSizeMap;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by PawelM on 2017-03-12.
 */
public class CollectionsTest {

    @Test
    public void testBags() {
        Bag<String> myBag = new HashBag<String>();

        myBag.add("Test1", 3);
        myBag.add("Test2");
        System.out.println(myBag.size());
        System.out.println(myBag);

        myBag.remove("Test1");
        System.out.println(myBag.size());
        System.out.println(myBag);
    }

    @Test
    public void testFixedSizedMap() {
        Map<String, String> myMap = new HashMap<String, String>();
        myMap.put("One", "1");
        myMap.put("Two", "2");
        myMap.put("Three", "3");
        assertEquals(3, myMap.size());

        myMap = FixedSizeMap.fixedSizeMap(myMap);
        try {
            myMap.put("Four", "4");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testUnmodifiableList(){
        List<String> ccc = new ArrayList<String>();
        ccc.add("aaa");
        ccc.add("bbb");
        ccc.add("ccc");
        ccc = UnmodifiableList.unmodifiableList(ccc);
        try {
            ccc.add("ddd");
        } catch (UnsupportedOperationException eee){
            System.out.println(eee.getMessage());
        }
    }

    @Test
    public void testUnmodifiableList_java8(){
        List<String> ccc = new ArrayList<String>();
        ccc.add("aaa");
        ccc.add("bbb");
        ccc.add("ccc");
        ccc = Collections.unmodifiableList(ccc);
        try {
            ccc.add("ddd");
        } catch (UnsupportedOperationException eee){
        }
    }
}
