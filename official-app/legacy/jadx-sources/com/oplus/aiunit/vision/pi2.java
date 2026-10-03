package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.coui.appcompat.reddot.COUIHintRedDot;

/* JADX INFO: loaded from: classes13.dex */
public class pi2 {
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15376c;

    public void a(@NonNull COUIHintRedDot cOUIHintRedDot) {
        cOUIHintRedDot.setPointMode(this.a);
        cOUIHintRedDot.setPointNumber(this.b);
        cOUIHintRedDot.setPointText(this.f15376c);
    }

    public void b(int i) {
        this.a = i;
    }

    public void c(int i) {
        this.b = i;
    }

    public void d(String str) {
        this.f15376c = str;
    }
}
