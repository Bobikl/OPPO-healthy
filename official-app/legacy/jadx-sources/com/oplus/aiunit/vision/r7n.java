package com.oplus.aiunit.vision;

import android.app.OplusNotificationManager;
import android.os.Build;
import android.util.Log;
import com.android.id.impl.IdProviderImpl;

/* JADX INFO: loaded from: classes11.dex */
public final class r7n {
    public final IdProviderImpl a;
    public OplusNotificationManager b = null;

    public r7n() {
        this.a = null;
        int i = Build.VERSION.SDK_INT;
        if (i == 31 || i == 32) {
            a();
            return;
        }
        try {
            this.a = new IdProviderImpl();
        } catch (Error | Exception e2) {
            StringBuilder sb = new StringBuilder("1084: ");
            sb.append(e2.getMessage() != null ? e2.getMessage() : e2.getLocalizedMessage());
            Log.e("IDHelper", sb.toString());
            a();
        }
    }

    public static boolean b() {
        return true;
    }

    public final void a() {
        try {
            this.b = new OplusNotificationManager();
        } catch (Error | Exception e2) {
            StringBuilder sb = new StringBuilder("1085: ");
            sb.append(e2.getMessage() != null ? e2.getMessage() : e2.getLocalizedMessage());
            Log.e("IDHelper", sb.toString());
        }
    }
}
