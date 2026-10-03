package com.oplus.aiunit.vision;

import com.alibaba.android.arouter.exception.NoRouteFoundException;
import com.alibaba.android.arouter.facade.Postcard;

/* JADX INFO: loaded from: classes2.dex */
public class uma {
    public static final String TAG = "JumpUtils";

    public static void a(boolean z) {
        try {
            Postcard postcardB = x0.d().b("/app/MainActivity");
            t8b.c(postcardB);
            Class<?> destination = postcardB.getDestination();
            boolean zC = op.n().c(destination);
            StringBuilder sb = new StringBuilder();
            sb.append("class:");
            sb.append(destination);
            sb.append("    exists:");
            sb.append(zC);
            sb.append("    nfc:");
            sb.append(z);
            if (!zC) {
                x0.d().b("/app/MainActivity").navigation();
            } else if (z) {
                x0.d().b("/app/MainActivity").withString("tab", "2").navigation();
            }
        } catch (NoRouteFoundException e2) {
            e2.getMessage();
        }
    }
}
