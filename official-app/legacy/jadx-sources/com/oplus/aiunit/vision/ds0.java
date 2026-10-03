package com.oplus.aiunit.vision;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.heytap.health.core.push.badge.BadgePushData;

/* JADX INFO: loaded from: classes17.dex */
public final class ds0 {
    public static final String DESC_BADGE = "badge";

    public void a(com.heytap.msp.push.mode.b bVar) {
        a7b.f("BadgeParser", "checkPushSptDataMessage begin");
        if (bVar.d().contains(DESC_BADGE)) {
            try {
                BadgePushData badgePushData = (BadgePushData) new Gson().fromJson(bVar.b(), BadgePushData.class);
                badgePushData.toString();
                if (badgePushData.getMessageType().equalsIgnoreCase(DESC_BADGE)) {
                    a7b.f("BadgeParser", "badge message");
                    cs0.a();
                }
            } catch (JsonSyntaxException e2) {
                a7b.b("BadgeParser", "checkPushSptDataMessage failed..." + e2.getMessage());
            }
        }
    }
}
