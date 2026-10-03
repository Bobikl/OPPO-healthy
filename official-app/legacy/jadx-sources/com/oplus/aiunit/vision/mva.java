package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class mva {
    public static hva a(Context context, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(str);
        }
        sb.append("track_sqlite");
        if (str3 != null && !str3.isEmpty()) {
            sb.append("_");
            sb.append(str3);
        }
        sb.append("_");
        sb.append(str2);
        return new hva(new jva(new kva(context.getApplicationContext(), sb.toString())));
    }
}
