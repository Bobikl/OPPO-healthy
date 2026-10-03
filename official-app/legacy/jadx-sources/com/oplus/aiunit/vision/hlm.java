package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.PushService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class hlm implements bpm {
    public static List<com.heytap.msp.push.mode.a> b(Context context, Intent intent) {
        int i;
        com.heytap.msp.push.mode.a aVarA;
        if (intent == null) {
            return null;
        }
        try {
            i = Integer.parseInt(mhm.f(intent.getStringExtra("type")));
        } catch (Exception e2) {
            cpm.c("MessageParser--getMessageByIntent--Exception:" + e2.getMessage());
            i = 4096;
        }
        cpm.a("MessageParser--getMessageByIntent--type:" + i);
        ArrayList arrayList = new ArrayList();
        for (bpm bpmVar : PushService.j().o()) {
            if (bpmVar != null && (aVarA = bpmVar.a(context, i, intent)) != null) {
                arrayList.add(aVarA);
            }
        }
        return arrayList;
    }
}
