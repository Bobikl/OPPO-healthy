package com.oplus.aiunit.vision;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public final class v3n {
    public Context a;
    public v0n b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17699c;

    public v3n(Context context, v0n v0nVar, String str) {
        this.a = context.getApplicationContext();
        this.b = v0nVar;
        this.f17699c = str;
    }

    public static String a(Context context, v0n v0nVar, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("\"sdkversion\":\"");
            sb.append(v0nVar.f());
            sb.append("\",\"product\":\"");
            sb.append(v0nVar.a());
            sb.append("\",\"nt\":\"");
            sb.append(p0n.w(context));
            sb.append("\",\"details\":");
            sb.append(str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return sb.toString();
    }

    public final byte[] b() {
        return w0n.n(a(this.a, this.b, this.f17699c));
    }
}
