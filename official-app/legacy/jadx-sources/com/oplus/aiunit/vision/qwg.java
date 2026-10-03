package com.oplus.aiunit.vision;

import com.heytap.health.watchpair.view.WatchView;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class qwg {
    public String a;
    public Function1<WatchView, Unit> b;

    public qwg(String str, Function1<WatchView, Unit> function1) {
        this.a = str;
        this.b = function1;
    }

    public Function1<WatchView, Unit> a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }
}
