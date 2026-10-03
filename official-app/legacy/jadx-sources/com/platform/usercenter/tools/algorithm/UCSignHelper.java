package com.platform.usercenter.tools.algorithm;

import android.text.TextUtils;
import com.heytap.store.base.core.http.HttpUtils;
import com.platform.usercenter.basic.annotation.NoSign;
import com.platform.usercenter.tools.datastructure.Lists;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public class UCSignHelper {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String IGNORE_JACO = "$jacocoData";
    private static final String TAG = "UCSignHelper";

    private static ArrayList<String> filterSourceList(Object obj, String str) {
        Object string;
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            ArrayList<Field> arrayListNewArrayList = Lists.newArrayList();
            for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
                arrayListNewArrayList.addAll(Arrays.asList(superclass.getDeclaredFields()));
            }
            for (Field field : arrayListNewArrayList) {
                field.setAccessible(true);
                if (field.getAnnotation(NoSign.class) == null && (string = field.get(obj)) != null && string != "" && !TextUtils.isEmpty(string.toString())) {
                    if (string instanceof String[]) {
                        string = Arrays.toString((String[]) string);
                    }
                    String name = field.getName();
                    if (TextUtils.isEmpty(str) || !str.equals(name)) {
                        if (!IGNORE_JACO.equals(name)) {
                            arrayList.add(name + HttpUtils.EQUAL_SIGN + string + "&");
                        }
                    }
                }
            }
        } catch (IllegalAccessException e2) {
            UCLogUtil.e(TAG, "filterSourceList 2" + e2.getMessage());
        } catch (IllegalArgumentException e3) {
            UCLogUtil.e(TAG, "filterSourceList 1" + e3.getMessage());
        }
        return arrayList;
    }

    private static ArrayList<String> getSourceList(Object obj, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                Object string = field.get(obj);
                if (string != null && string != "") {
                    if (string instanceof String[]) {
                        string = Arrays.toString((String[]) string);
                    }
                    String name = field.getName();
                    if ((TextUtils.isEmpty(str) || !str.equals(name)) && !IGNORE_JACO.equals(name)) {
                        arrayList.add(name + HttpUtils.EQUAL_SIGN + string + "&");
                    }
                }
            }
        } catch (IllegalAccessException e2) {
            UCLogUtil.e(TAG, "getSourceList 2" + e2.getMessage());
        } catch (IllegalArgumentException e3) {
            UCLogUtil.e(TAG, "getSourceList 1" + e3.getMessage());
        }
        return arrayList;
    }

    public static String signStrOrderByString(Object obj, String str) {
        ArrayList<String> sourceList = getSourceList(obj, str);
        if (sourceList.isEmpty()) {
            return null;
        }
        int size = sourceList.size();
        String[] strArr = (String[]) sourceList.toArray(new String[size]);
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    public static String signWithAnnotation(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        ArrayList<String> arrayListFilterSourceList = filterSourceList(obj, str);
        if (arrayListFilterSourceList.isEmpty()) {
            return null;
        }
        int size = arrayListFilterSourceList.size();
        String[] strArr = (String[]) arrayListFilterSourceList.toArray(new String[size]);
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    public static String signStrOrderByString(Object obj, ArrayList<String> arrayList) {
        ArrayList<String> sourceList = getSourceList(obj, arrayList);
        if (sourceList.isEmpty()) {
            return null;
        }
        int size = sourceList.size();
        String[] strArr = (String[]) sourceList.toArray(new String[size]);
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    public static String signWithAnnotation(Object obj) {
        if (obj == null) {
            return null;
        }
        ArrayList<String> arrayListFilterSourceList = filterSourceList(obj, null);
        if (arrayListFilterSourceList.isEmpty()) {
            return null;
        }
        int size = arrayListFilterSourceList.size();
        String[] strArr = (String[]) arrayListFilterSourceList.toArray(new String[size]);
        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(strArr[i]);
        }
        return sb.toString();
    }

    private static ArrayList<String> getSourceList(Object obj, ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                boolean z = true;
                field.setAccessible(true);
                Object string = field.get(obj);
                if (string != null && !"".equals(string)) {
                    if (string instanceof String[]) {
                        string = Arrays.toString((String[]) string);
                    }
                    String name = field.getName();
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(IGNORE_JACO);
                    int i = 0;
                    while (true) {
                        if (i >= arrayList.size()) {
                            z = false;
                            break;
                        }
                        String str = arrayList.get(i);
                        if (!TextUtils.isEmpty(str) && str.equals(name)) {
                            break;
                        }
                        i++;
                    }
                    if (!z) {
                        arrayList2.add(name + HttpUtils.EQUAL_SIGN + string + "&");
                    }
                }
            }
        } catch (IllegalAccessException e2) {
            UCLogUtil.e(TAG, "getSourceList 4" + e2.getMessage());
        } catch (IllegalArgumentException e3) {
            UCLogUtil.e(TAG, "getSourceList 3" + e3.getMessage());
        }
        return arrayList2;
    }
}
