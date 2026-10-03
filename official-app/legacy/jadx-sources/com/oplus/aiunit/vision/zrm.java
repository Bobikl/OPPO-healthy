package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class zrm extends eym {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f19534l = "LocalProcessSplitInfo";

    public zrm(Context context) {
        d(context);
    }

    @Override // com.oplus.aiunit.vision.eym
    public v5n c(v5n v5nVar) {
        if (v5nVar == null) {
            w7i.c(f19534l, "Base SplitVersionInfo is null", new Object[0]);
            return null;
        }
        if (this.a == null) {
            w7i.i(f19534l, "context is null", new Object[0]);
            return f(v5nVar);
        }
        if (!v5nVar.j().x()) {
            w7i.i(f19534l, "no component feature, skip!", new Object[0]);
            return f(v5nVar);
        }
        h7i h7iVarJ = v5nVar.j();
        String strG = g(this.a, h7iVarJ);
        if (TextUtils.isEmpty(strG)) {
            w7i.i(f19534l, "componentVersion is null", new Object[0]);
            return f(v5nVar);
        }
        String[] strArrSplit = strG.split("@");
        String str = strArrSplit[0];
        int i = Integer.parseInt(strArrSplit[1]);
        if (e(h7iVarJ.r(), i) && v5nVar.g() < i) {
            return f(b(3, i, str, v5nVar));
        }
        return f(v5nVar);
    }

    public final String g(Context context, h7i h7iVar) {
        HashMap<String, String> mapC = h7iVar.c();
        if (mapC == null) {
            return null;
        }
        String str = mapC.get("componentAction");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (String) p1h.b(context).a(str + "_COMPONENT_VERSION", "");
    }
}
