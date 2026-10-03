package com.oplus.aiunit.vision;

import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;

/* JADX INFO: loaded from: classes15.dex */
public class lde extends h1h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f13642c;

    public lde(AppCompatActivity appCompatActivity, String str) {
        super(appCompatActivity);
        this.f13642c = str;
    }

    @Override // com.oplus.aiunit.vision.h1h
    public Uri c() {
        return e(this.f13642c);
    }

    @Override // com.oplus.aiunit.vision.h1h
    public String d() {
        return "application/pdf";
    }
}
