package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import s_a.s_d;
import s_a.s_f;

/* JADX INFO: loaded from: classes8.dex */
public final class c8n extends a8n {
    public c8n() {
        this.f9248e = new w7n(this);
    }

    @Override // com.oplus.aiunit.vision.a8n
    public final Intent a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.oplus.stdid", "com.oplus.stdid.IdentifyService"));
        intent.setAction("action.com.oplus.stdid.ID_SERVICE");
        k8n.a("2012");
        return intent;
    }

    @Override // com.oplus.aiunit.vision.a8n
    public final void b(Context context, String str, String str2) {
        p7n.f15250s_a.b(context, str, str2);
    }

    @Override // com.oplus.aiunit.vision.a8n
    public final boolean f(String str) {
        t7n t7nVar = p7n.f15250s_a;
        return !t7nVar.a.isEmpty() && t7nVar.a.containsKey(str);
    }

    @Override // com.oplus.aiunit.vision.a8n
    public final boolean h(String str) {
        return p7n.f15250s_a.d(str);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[ORIG_RETURN, RETURN] */
    @Override // com.oplus.aiunit.vision.a8n
    public final String i(String str) {
        try {
            return ((s_d) ((s_f) this.a)).s_a(this.b, this.f9247c, str);
        } catch (NullPointerException e2) {
            k8n.b("1080", e2);
            if (str == "OUID_STATUS") {
                return "FALSE";
            }
            return "";
        } catch (Exception e3) {
            k8n.b("1081", e3);
            if (str == "OUID_STATUS") {
                return "FALSE";
            }
            return "";
        }
    }
}
