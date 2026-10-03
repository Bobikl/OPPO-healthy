package com.client.platform.opensdk.pay.download.util;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class JsonUtil {
    public static String list2json(List<?> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"data\":[");
        if (list == null || list.size() <= 0) {
            sb.append("]}");
        } else {
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(",");
            }
            sb.setCharAt(sb.length() - 1, ']');
            sb.append("}");
        }
        return sb.toString();
    }
}
