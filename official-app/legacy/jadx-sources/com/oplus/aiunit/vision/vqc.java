package com.oplus.aiunit.vision;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
public abstract class vqc {
    public static final String ADD = "4";
    public static final String BLE_KEY = "11";
    public static final String CARD_KEY = "9";
    public static final String CARKEY = "CARKEY";
    public static final String CCC_KEY = "15";
    public static final String CHANGE = "3";
    public static final String CREDIT = "2";
    public static final String DEBIT = "1";
    public static final String DOOR = "DOOR";
    public static final String DOOR_CARD = "6";
    public static final String EID = "7";
    public static final String ICCOA_KEY = "20";
    public static final String QL_DOOR_CARD = "10";
    public static final String TRAFFIC = "TRAFFIC";
    public static final String TRAFFIC_CARD = "5";

    public static Set<String> a() {
        HashSet hashSet = new HashSet();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("5");
        hashSet.add("6");
        hashSet.add("7");
        hashSet.add("9");
        hashSet.add("11");
        hashSet.add("15");
        hashSet.add("20");
        return hashSet;
    }
}
