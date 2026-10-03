package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.statistics.OplusTrack;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ylm {
    public static final String a = "OmsStatisticsManager";
    public static final int b = 1;

    public static class b {
        public static final ylm a = new ylm(null);
    }

    public ylm(a aVar) {
    }

    public void a(Context context, String str, f8i f8iVar) {
        if (context == null || f8iVar == null) {
            w7i.i(a, str + " reporter split params error", new Object[0]);
            return;
        }
        HashMap map = new HashMap(1);
        map.put(str, f8iVar.j());
        w7i.a(a, "reporter " + str + " split data:" + map, new Object[0]);
        if (map.isEmpty()) {
            w7i.a(a, "no statistics data need to upload.", new Object[0]);
        } else {
            OplusTrack.onCommon(context, "30079", "30079002", "oms_split_event", map);
        }
    }

    public void b(Context context, String str, List<f8i> list) {
        if (context == null || list == null || list.isEmpty()) {
            w7i.i(a, str + " reporter split list params error", new Object[0]);
            return;
        }
        w7i.a(a, "reporter " + str + " split list data:" + list, new Object[0]);
        HashMap map = new HashMap(1);
        for (f8i f8iVar : list) {
            if (f8iVar != null) {
                map.clear();
                map.put(str, f8iVar.j());
                OplusTrack.onCommon(context, "30079", "30079002", "oms_split_event", map);
            }
        }
    }
}
