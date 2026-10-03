package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a implements v {
    public Method a;
    public byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f546c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f547e;
    public boolean f;

    public a(Method method, int i, String str, byte[] bArr, String str2, boolean z) {
        this.a = method;
        this.d = i;
        this.f546c = str;
        this.b = bArr;
        this.f547e = str2;
        this.f = z;
    }
}
