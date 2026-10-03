package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes19.dex */
public class oc7 {
    public String a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14886c;

    public oc7(String str, String str2, int i) {
        this.a = str;
        this.f14886c = str2;
        this.b = i;
    }

    public String a() {
        return this.f14886c;
    }

    public int b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    @NonNull
    public String toString() {
        return "FileTaskProcess{taskId='" + this.a + "', process=" + this.b + ", fileName='" + this.f14886c + "'}";
    }
}
