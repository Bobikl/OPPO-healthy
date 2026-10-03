package com.oplus.aiunit.vision;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes12.dex */
public final class mom {
    public int a;
    public int[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14145c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14146e;
    public String f;
    public String g;

    public mom(int i, int[] iArr, String str, String str2, String str3) {
        this.a = i;
        this.b = iArr;
        this.f14146e = str;
        this.f = str2;
        this.g = str3;
        str = TextUtils.isEmpty(str) ? str2 : str;
        this.f14145c = -1000;
        if ("regions".equals(str)) {
            this.f14145c = 1001;
        } else if ("water".equals(str)) {
            this.f14145c = 1002;
        } else if ("buildings".equals(str)) {
            this.f14145c = 1003;
        } else if ("roads".equals(str)) {
            this.f14145c = 1004;
        } else if ("labels".equals(str)) {
            this.f14145c = 1005;
        } else if ("borders".equals(str)) {
            this.f14145c = 1006;
        }
        this.d = (i * 1000) + iArr.hashCode();
    }
}
