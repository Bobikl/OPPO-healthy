package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.health.telecom.TelecomPairReceiver;

/* JADX INFO: loaded from: classes18.dex */
public class hqj {
    public static final String TELECOM_TAG_PREFIX = "TelHealth.";

    public static void b(Context context) {
        a7b.f("TelHealth.TelecomApp", "initInMain: ");
        TelecomPairReceiver.a(context);
        k87.registerPermChangedListener(new iid() { // from class: com.oplus.aiunit.vision.gqj
            @Override // com.oplus.aiunit.vision.iid
            public final void b(PermMsgHolder permMsgHolder) {
                hqj.c(permMsgHolder);
            }
        });
    }

    public static /* synthetic */ void c(PermMsgHolder permMsgHolder) {
        if (!gl4.managerApi.isCurrentConnected()) {
            a7b.f("TelHealth.TelecomApp", "onPermMsgChanged() no connect");
            return;
        }
        if (permMsgHolder.getFeatureId() == 9 && permMsgHolder.getPermOpen()) {
            mqj.a(permMsgHolder.c());
        } else {
            if (permMsgHolder.getFeatureId() != 9 || permMsgHolder.getPermOpen()) {
                return;
            }
            mqj.c(permMsgHolder.c());
        }
    }
}
