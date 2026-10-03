package com.omron;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class ba {
    private final String a;
    private final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8836c;
    private final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f8837e;
    private final int f;

    public ba(az azVar) {
        this.a = azVar.a;
        this.b = azVar.b;
        this.f8836c = azVar.f8833c;
        this.d = azVar.d;
        this.f8837e = azVar.f8834e;
        this.f = azVar.f;
    }

    public String a() {
        return a("");
    }

    public String b() {
        return this.a;
    }

    public int c() {
        return this.f;
    }

    public String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.b;
        }
        return this.b + str;
    }

    public boolean b(@NonNull File file) {
        return System.currentTimeMillis() - file.lastModified() > this.d;
    }

    public boolean a(@NonNull File file) {
        return file.length() > this.f8836c;
    }
}
