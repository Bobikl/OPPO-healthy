package com.oplus.oms.split.full.common;

import android.text.TextUtils;
import com.oplus.aiunit.vision.b7i;
import com.oplus.aiunit.vision.w7i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public class SplitProcessUtils {
    public static final HashMap<String, ProcessInfoData> a = (HashMap) b7i.e();
    public static final HashMap<String, SplitInfoData> b = (HashMap) b7i.f();

    public static synchronized ProcessInfoData getMainProcessInfoData(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("getMainProcessInfoData sSplitMap = ");
        HashMap<String, SplitInfoData> map = b;
        sb.append(map.toString());
        sb.append(" ,sProcessMap = ");
        HashMap<String, ProcessInfoData> map2 = a;
        sb.append(map2.toString());
        w7i.a("SplitProcessUtils", sb.toString(), new Object[0]);
        if (str != null && map != null) {
            SplitInfoData splitInfoData = map.get(str);
            if (splitInfoData == null) {
                return null;
            }
            return map2.get(splitInfoData.getMainProcessName());
        }
        return null;
    }

    public static synchronized Set<SplitInfoData> getSplitInfoDataFromProcess(String str) {
        HashSet hashSet = new HashSet();
        if (str != null && b != null) {
            ProcessInfoData processInfoData = a.get(str);
            if (processInfoData == null) {
                return hashSet;
            }
            List<String> splitList = processInfoData.getSplitList();
            if (splitList != null && !splitList.isEmpty()) {
                Iterator<String> it = splitList.iterator();
                while (it.hasNext()) {
                    SplitInfoData splitInfoData = b.get(it.next());
                    if (splitInfoData != null) {
                        hashSet.add(splitInfoData);
                    }
                }
                return hashSet;
            }
            return hashSet;
        }
        return hashSet;
    }

    public static synchronized List<ProcessInfoData> getSubProcessInfoData(String str) {
        if (str != null) {
            HashMap<String, SplitInfoData> map = b;
            if (map != null) {
                SplitInfoData splitInfoData = map.get(str);
                if (splitInfoData == null) {
                    return Collections.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                List<String> subProcessList = splitInfoData.getSubProcessList();
                if (subProcessList != null && !subProcessList.isEmpty()) {
                    Iterator<String> it = subProcessList.iterator();
                    while (it.hasNext()) {
                        ProcessInfoData processInfoData = a.get(it.next());
                        if (processInfoData != null) {
                            arrayList.add(processInfoData);
                        }
                    }
                    return arrayList;
                }
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }

    public static synchronized void setInfoData(String str, String str2) {
        w7i.a("SplitProcessUtils", "setInfoData splitName = " + str, new Object[0]);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        HashMap<String, SplitInfoData> map = b;
        if (map.get(str) == null) {
            map.put(str, new SplitInfoData(str, str2, new ArrayList()));
        }
        HashMap<String, ProcessInfoData> map2 = a;
        ProcessInfoData processInfoData = map2.get(str2);
        if (processInfoData == null) {
            return;
        }
        if (!processInfoData.getSplitList().contains(str)) {
            processInfoData.getSplitList().add(str);
        }
        map2.put(str2, processInfoData);
    }
}
