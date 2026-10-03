package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class bhm {
    public com.alipay.sdk.m.r.a a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String[] f9757c;

    public bhm(String str, com.alipay.sdk.m.r.a aVar) {
        this.b = str;
        this.a = aVar;
    }

    public static List<bhm> b(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        String[] strArrD = d(jSONObject.optString("name", ""));
        for (int i = 0; i < strArrD.length; i++) {
            com.alipay.sdk.m.r.a aVarA = com.alipay.sdk.m.r.a.a(strArrD[i]);
            if (aVarA != com.alipay.sdk.m.r.a.None) {
                bhm bhmVar = new bhm(strArrD[i], aVarA);
                bhmVar.f9757c = e(strArrD[i]);
                arrayList.add(bhmVar);
            }
        }
        return arrayList;
    }

    public static void c(bhm bhmVar) {
        String[] strArrF = bhmVar.f();
        if (strArrF.length == 3 && TextUtils.equals("tid", strArrF[0])) {
            ram ramVarA = ram.a(chm.e().c());
            if (TextUtils.isEmpty(strArrF[1]) || TextUtils.isEmpty(strArrF[2])) {
                return;
            }
            ramVarA.b(strArrF[1], strArrF[2]);
        }
    }

    public static String[] d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(";");
    }

    public static String[] e(String str) {
        ArrayList arrayList = new ArrayList();
        int iIndexOf = str.indexOf(40);
        int iLastIndexOf = str.lastIndexOf(41);
        if (iIndexOf == -1 || iLastIndexOf == -1 || iLastIndexOf <= iIndexOf) {
            return null;
        }
        for (String str2 : str.substring(iIndexOf + 1, iLastIndexOf).split("' *, *'", -1)) {
            arrayList.add(str2.trim().replaceAll("'", "").replaceAll("\"", ""));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public com.alipay.sdk.m.r.a a() {
        return this.a;
    }

    public String[] f() {
        return this.f9757c;
    }
}
