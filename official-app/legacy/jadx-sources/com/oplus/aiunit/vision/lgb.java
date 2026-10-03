package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public class lgb extends j6 {
    public final jgb.b a;

    public lgb(@NonNull jgb.b bVar) {
        this.a = bVar;
    }

    @NonNull
    public static lgb l() {
        return m(jgb.v());
    }

    @NonNull
    public static lgb m(@NonNull jgb.b bVar) {
        return new lgb(bVar);
    }

    @Override // com.oplus.aiunit.vision.j6, com.oplus.aiunit.vision.mgb
    public void j(@NonNull i8e.b bVar) {
        bVar.j(this.a.build());
    }

    @NonNull
    public jgb.b n() {
        return this.a;
    }
}
