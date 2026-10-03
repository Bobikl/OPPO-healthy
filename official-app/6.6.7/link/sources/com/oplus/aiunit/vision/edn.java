package com.oplus.aiunit.vision;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import s_a.s_f;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public final class edn extends cdn {
    public edn() {
        ((cdn) this).e = new ycn(this);
    }

    public final Intent a() {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.oplus.stdid", "com.oplus.stdid.IdentifyService"));
        intent.setAction("action.com.oplus.stdid.ID_SERVICE");
        mdn.a("2012");
        return intent;
    }

    public final void b(Context context, String str, String str2) {
        rcn.s_a.b(context, str, str2);
    }

    public final boolean f(String str) {
        vcn vcnVar = rcn.s_a;
        return !((scn) vcnVar).a.isEmpty() && ((scn) vcnVar).a.containsKey(str);
    }

    public final boolean h(String str) {
        return rcn.s_a.d(str);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0023 A[ORIG_RETURN, RETURN] */
    public final String i(String str) {
        try {
            return ((s_f) ((cdn) this).a).s_a(((cdn) this).b, ((cdn) this).c, str);
        } catch (NullPointerException e) {
            mdn.b("1080", e);
            if (str == "OUID_STATUS") {
                return "FALSE";
            }
            return "";
        } catch (Exception e2) {
            mdn.b("1081", e2);
            if (str == "OUID_STATUS") {
                return "FALSE";
            }
            return "";
        }
    }
}
