package com.heytap.msp.push.statis;

import android.content.Context;
import com.heytap.msp.push.mode.b;
import com.heytap.msp.push.mode.c;
import com.oplus.aiunit.vision.omi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public static boolean a(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(context.getPackageName(), str));
        return omi.b(context, arrayList);
    }

    public static boolean b(Context context, Map<String, List<b>> map) {
        if (map == null) {
            return false;
        }
        String packageName = context.getPackageName();
        ArrayList arrayList = new ArrayList();
        for (String str : map.keySet()) {
            List<b> list = map.get(str);
            if (list != null) {
                for (b bVar : list) {
                    arrayList.add(new c(bVar.g(), packageName, bVar.f(), bVar.k(), str, null, bVar.j(), bVar.c()));
                }
            } else {
                arrayList.add(new c(packageName, str));
            }
        }
        return omi.b(context, arrayList);
    }
}
