package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes11.dex */
public final class y7e {
    public static final Map<String, String> a(String str) {
        HashMap map = new HashMap();
        if (str != null && str.length() != 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            while (stringTokenizer.hasMoreTokens()) {
                String[] strArrSplit = stringTokenizer.nextToken().trim().split(HttpUtils.EQUAL_SIGN);
                if (strArrSplit != null) {
                    if (strArrSplit.length == 2) {
                        map.put(strArrSplit[0].trim(), strArrSplit[1].trim());
                    } else if (strArrSplit.length == 1) {
                        map.put(strArrSplit[0].trim(), null);
                    }
                }
            }
        }
        return map;
    }
}
