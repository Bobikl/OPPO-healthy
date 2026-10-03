package com.oplus.aiunit.vision;

import com.heytap.health.watchface.business.legacy.creation.outfits.view.mainshutterbutton.MainShutterButton;

/* JADX INFO: loaded from: classes19.dex */
public class qeb {
    public int a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15768c;
    public int d;

    public qeb(int i, String str) {
        this.a = i;
        this.b = str;
        this.f15768c = MainShutterButton.BUTTON_SHAPE_DIAL_NONE;
        this.d = 0;
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.d;
    }

    public String c() {
        return this.f15768c;
    }

    public int d() {
        return this.a;
    }

    public qeb(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.f15768c = str2;
        this.d = 1;
    }
}
