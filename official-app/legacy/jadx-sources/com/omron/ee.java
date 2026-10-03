package com.omron;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class ee {
    private UUID a = null;
    private String b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f8982c = null;

    public String a() {
        return this.b;
    }

    public String b() {
        return this.f8982c;
    }

    public UUID c() {
        return this.a;
    }

    @NonNull
    public String toString() {
        return "ScanFilterData{serviceUuid=" + this.a + ", deviceAddress='" + this.b + "', deviceName='" + this.f8982c + "'}";
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(this.b)) {
            return true;
        }
        return this.b.equals(str);
    }

    public void b(String str) {
        this.b = str;
    }

    public boolean a(String str, String str2) {
        if (TextUtils.isEmpty(this.b) && TextUtils.isEmpty(this.f8982c)) {
            return true;
        }
        if (TextUtils.isEmpty(this.b) || !this.b.equals(str2)) {
            return !TextUtils.isEmpty(this.f8982c) && this.f8982c.equals(str);
        }
        return true;
    }
}
