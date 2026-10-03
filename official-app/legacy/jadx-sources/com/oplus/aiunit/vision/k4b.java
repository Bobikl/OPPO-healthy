package com.oplus.aiunit.vision;

import android.content.Context;
import android.telecom.TelecomManager;
import androidx.core.content.ContextCompat;
import com.heytap.health.telecom.proto.TelecomProto$WatchCallChange;

/* JADX INFO: loaded from: classes18.dex */
public class k4b {
    public static void a(Context context) {
        try {
            if (ContextCompat.checkSelfPermission(context, "android.permission.ANSWER_PHONE_CALLS") != 0) {
                a7b.b("TelHealth.LocalTelecomUtils", "endCall() permission denied");
                return;
            }
            TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
            if (telecomManager != null) {
                telecomManager.endCall();
            } else {
                a7b.b("TelHealth.LocalTelecomUtils", "endCall() telecomManager is null!");
            }
        } catch (Throwable th) {
            a7b.b("TelHealth.LocalTelecomUtils", "endCall() : " + th.getMessage());
        }
    }

    public static boolean b(Context context, TelecomProto$WatchCallChange telecomProto$WatchCallChange) {
        a7b.f("TelHealth.LocalTelecomUtils", "onHandleWatchChange() called with: context = [" + context + "]");
        if (telecomProto$WatchCallChange.getChangeStatus() != 5) {
            return false;
        }
        a(context);
        return true;
    }
}
