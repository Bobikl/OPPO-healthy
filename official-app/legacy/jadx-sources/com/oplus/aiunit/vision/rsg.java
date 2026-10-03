package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes19.dex */
public class rsg {
    public String a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16339c;
    public aed<oc7> d;

    public aed<oc7> a() {
        return this.d;
    }

    public String b() {
        return this.a;
    }

    public void c(aed<oc7> aedVar) {
        this.d = aedVar;
    }

    public void d(String str) {
        this.b = str;
    }

    public void e(String str) {
        this.f16339c = str;
    }

    public void f(String str) {
        this.a = str;
    }

    @NonNull
    public String toString() {
        return "SendInfoRecord{uri='" + this.a + "', sendFilePath='" + this.b + "', taskId='" + this.f16339c + "', observer=" + this.d + '}';
    }
}
