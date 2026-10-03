package com.oplus.aiunit.vision;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class g4i {
    public static int VALUE_CONTAINER_TYPE_BIG_BANNER = 3;
    public static int VALUE_CONTAINER_TYPE_BIG_CARD = 1;
    public static int VALUE_CONTAINER_TYPE_BUTTON = 11;
    public static int VALUE_CONTAINER_TYPE_DEVICE_BANNER = 16;
    public static int VALUE_CONTAINER_TYPE_DIALOG = 2;
    public static int VALUE_CONTAINER_TYPE_GUIDE = 8;
    public static int VALUE_CONTAINER_TYPE_MULTI_CONTENT = 7;
    public static int VALUE_CONTAINER_TYPE_SHARE = 10;
    public static int VALUE_CONTAINER_TYPE_SHARE_SCAN = 17;
    public static int VALUE_CONTAINER_TYPE_SHORTCUT = 14;
    public static int VALUE_CONTAINER_TYPE_SINGLE_CONTENT = 6;
    public static int VALUE_CONTAINER_TYPE_SMALL_BANNER = 4;
    public static int VALUE_CONTAINER_TYPE_SPECIAL_MATERIALS = 19;
    public static int VALUE_CONTAINER_TYPE_STORE = 13;
    public static int VALUE_CONTAINER_TYPE_TEXT = 5;
    public static List<Integer> containerTypeList;

    static {
        ArrayList arrayList = new ArrayList();
        containerTypeList = arrayList;
        arrayList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_BIG_CARD));
        containerTypeList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_DIALOG));
        containerTypeList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_BIG_BANNER));
        containerTypeList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_SMALL_BANNER));
        containerTypeList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_TEXT));
        containerTypeList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_SINGLE_CONTENT));
        containerTypeList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_MULTI_CONTENT));
        containerTypeList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_GUIDE));
        containerTypeList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_SHARE));
        containerTypeList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_BUTTON));
        containerTypeList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_STORE));
        containerTypeList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_SHORTCUT));
        containerTypeList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_DEVICE_BANNER));
        containerTypeList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_SHARE_SCAN));
        containerTypeList.add(Integer.valueOf(VALUE_CONTAINER_TYPE_SPECIAL_MATERIALS));
    }
}
