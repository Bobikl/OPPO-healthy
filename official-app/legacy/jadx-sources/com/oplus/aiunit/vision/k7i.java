package com.oplus.aiunit.vision;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class k7i {
    public static final int ERROR = -1;
    public static final int LENGTH = 2;

    public static String a(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("@");
        }
        return sb.toString();
    }
}
