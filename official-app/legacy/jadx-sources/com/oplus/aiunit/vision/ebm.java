package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class ebm {
    public static boolean a(Context context, String str, com.heytap.msp.push.mode.b bVar) {
        ArrayList arrayList = new ArrayList();
        String packageName = context.getPackageName();
        arrayList.add(bVar == null ? new com.heytap.msp.push.mode.c(packageName, str) : new com.heytap.msp.push.mode.c(bVar.g(), packageName, bVar.f(), bVar.k(), str, null, bVar.j(), bVar.c()));
        return omi.b(context, arrayList);
    }
}
