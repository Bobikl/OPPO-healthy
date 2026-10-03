package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes19.dex */
public class na2 implements ia2<String> {
    public static final na2 d = new na2(1300, 21, 40);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final na2 f14416e = new na2(1300, 24, 40);
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14417c;

    public na2(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.f14417c = i3;
    }

    public static na2 c() {
        return d;
    }

    @Override // com.oplus.aiunit.vision.ia2
    public int a() {
        return 0;
    }

    @Override // com.oplus.aiunit.vision.ia2
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public String b(z92 z92Var) {
        v92 v92VarA;
        int i;
        if (z92Var != null && (v92VarA = z92Var.a(this.a)) != null && !TextUtils.isEmpty(v92VarA.getResult())) {
            String result = v92VarA.getResult();
            int i2 = this.b;
            if (i2 >= 0 && (i = this.f14417c) >= 0 && i > i2 && result != null && result.length() > this.b) {
                int length = result.length();
                int i3 = this.f14417c;
                if (length >= i3) {
                    return result.substring(this.b, i3);
                }
            }
        }
        return null;
    }
}
