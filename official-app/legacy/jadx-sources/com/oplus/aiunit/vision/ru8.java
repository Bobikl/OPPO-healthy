package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes15.dex */
public final class ru8 extends cfg {
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cfg f16357l;

    public ru8(String str, cfg cfgVar) {
        this.k = str;
        this.f16357l = cfgVar;
    }

    public static cfg k(cfg cfgVar, String str) {
        return l(cfgVar, str, null);
    }

    public static cfg l(cfg cfgVar, String str, @Nullable String str2) {
        return cfgVar instanceof ru8 ? cfgVar : new ru8(apj.c(str, str2), cfgVar);
    }

    @Override // com.oplus.aiunit.vision.cfg
    @NonNull
    public cfg.c c() {
        return new fw8(this.k, this.f16357l.c());
    }
}
