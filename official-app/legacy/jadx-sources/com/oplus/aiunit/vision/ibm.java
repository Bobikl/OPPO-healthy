package com.oplus.aiunit.vision;

import com.oplus.instant.router.Instant;
import com.oplus.instant.router.callback.Callback;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public abstract class ibm extends Instant.Req {
    public Map<String, String> a;
    public Map<String, String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f12469c;
    public Map<String, String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Callback f12470e;
    public String f;

    public ibm(nhm nhmVar) {
        this.a = nhmVar.a;
        this.b = nhmVar.b;
        this.f12469c = nhmVar.f14522c;
        this.d = nhmVar.d;
        this.f12470e = nhmVar.f14523e;
        this.f = nhmVar.f;
    }
}
