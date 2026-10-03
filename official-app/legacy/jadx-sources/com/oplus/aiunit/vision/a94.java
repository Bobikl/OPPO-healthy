package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import com.heytap.health.wallet.event.NetStateChangeEvent;

/* JADX INFO: loaded from: classes18.dex */
public class a94 {
    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public static boolean b(NetStateChangeEvent netStateChangeEvent, boolean z, Activity activity) {
        return z && a(activity) && netStateChangeEvent != null && !netStateChangeEvent.isNoneNet();
    }

    public static boolean c(boolean z, Activity activity) {
        return z && a(activity);
    }
}
