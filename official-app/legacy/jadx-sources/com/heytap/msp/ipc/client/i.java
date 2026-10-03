package com.heytap.msp.ipc.client;

import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class i {
    public static <E> String a(List<E> list) {
        return b(list, ",");
    }

    public static <E> String b(List<E> list, String str) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i) != null ? list.get(i).toString() : "");
            if (i < list.size() - 1) {
                sb.append(str);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
