package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class c8i {
    public static void a(List<String> list, String str, int i) {
        String strA = k7i.a(list);
        if (TextUtils.isEmpty(strA)) {
            w7i.i("SplitReportUtil", "reportInstallResult error", new Object[0]);
            return;
        }
        f8i f8iVar = new f8i(strA);
        f8iVar.b(str);
        f8iVar.f(i);
        e8i.a("install", f8iVar);
    }
}
