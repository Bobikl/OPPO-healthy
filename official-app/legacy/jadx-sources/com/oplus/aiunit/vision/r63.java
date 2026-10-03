package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class r63 {
    public ArrayList<v92> a;
    public boolean b;

    public r63(int i) {
        this.a = new ArrayList<>(i);
    }

    public static r63 c(String str, int i, String str2) {
        r63 r63Var = new r63(1);
        r63Var.a(str, i, str2);
        return r63Var;
    }

    public static r63 d(String[] strArr, int i, String str) {
        r63 r63Var = new r63(strArr.length);
        r63Var.b(strArr, i, str);
        return r63Var;
    }

    public r63 a(String str, int i, String str2) {
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = ".*(9000)$";
        }
        v92 v92Var = new v92();
        v92Var.setCommand(str);
        v92Var.a = i;
        v92Var.setChecker(str2);
        this.a.add(v92Var);
        return this;
    }

    public r63 b(String[] strArr, int i, String str) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            a(strArr[i2], i + i2, str);
        }
        return this;
    }

    public v92 e(int i) {
        ArrayList<v92> arrayList;
        if (i < 0 || (arrayList = this.a) == null || arrayList.size() <= i) {
            return null;
        }
        return this.a.get(i);
    }

    public int f() {
        ArrayList<v92> arrayList = this.a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public boolean g() {
        return this.b;
    }

    public void h(boolean z) {
        this.b = z;
    }
}
