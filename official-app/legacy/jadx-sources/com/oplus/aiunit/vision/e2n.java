package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class e2n {
    public v0n a;

    public static class a {
        public static Map<String, e2n> a = new HashMap();
    }

    public e2n(v0n v0nVar) {
        this.a = v0nVar;
    }

    public static e2n a(v0n v0nVar) {
        if (a.a.get(v0nVar.a()) == null) {
            a.a.put(v0nVar.a(), new e2n(v0nVar));
        }
        return a.a.get(v0nVar.a());
    }

    public final void b(Context context, boolean z, boolean z2) {
        p2n.b(context, this.a, "sckey", String.valueOf(z));
        if (z) {
            p2n.b(context, this.a, "scisf", String.valueOf(z2));
        }
    }

    public final boolean c(Context context) {
        try {
            return Boolean.parseBoolean(p2n.a(context, this.a, "sckey"));
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean d(Context context) {
        try {
            return Boolean.parseBoolean(p2n.a(context, this.a, "scisf"));
        } catch (Throwable unused) {
            return true;
        }
    }
}
