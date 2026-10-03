package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public final class qjm {
    public Context a;

    public qjm(Context context) {
        this.a = context;
    }

    public static boolean b(String str, Context context, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strY = xsm.Y(context);
        try {
            File file = new File(strY + str2 + str + ".dat");
            if (file.exists() && !ekm.l(file)) {
                return false;
            }
            try {
                ekm.h(strY + str2);
                ekm.k(str, context);
                return true;
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            } catch (Exception e3) {
                e3.printStackTrace();
                return false;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public static boolean d(String str, Context context, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strV = xsm.v(context);
        try {
            File file = new File(strV + str2 + str);
            if (file.exists() && !ekm.l(file)) {
                return false;
            }
            try {
                ekm.h(strV + str2);
                ekm.k(str, context);
                return true;
            } catch (IOException e2) {
                e2.printStackTrace();
                return false;
            } catch (Exception e3) {
                e3.printStackTrace();
                return false;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public final void a(com.amap.api.col.p0003sl.bb bbVar) {
        c(bbVar);
    }

    public final boolean c(com.amap.api.col.p0003sl.bb bbVar) {
        if (bbVar != null) {
            String pinyin = bbVar.getPinyin();
            boolean zB = b(pinyin, this.a, "vmap/");
            if (pinyin.equals("quanguogaiyaotu")) {
                pinyin = "quanguo";
            }
            boolean z = true;
            boolean z2 = b(pinyin, this.a, "map/") || zB;
            if (!d(ekm.i(bbVar.getUrl()), this.a, "map/") && !z2) {
                z = false;
            }
            if (z) {
                bbVar.i();
                return z;
            }
            bbVar.h();
        }
        return false;
    }
}
