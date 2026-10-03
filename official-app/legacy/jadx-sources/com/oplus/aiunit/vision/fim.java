package com.oplus.aiunit.vision;

import com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.CloudDownloadWorker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class fim extends x7f.a {
    public Map<String, String> a = new HashMap();
    public Map<String, String> b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f11380c = null;
    public Map<String, String> d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ws2 f11381e;
    public String f;

    public fim(String str, String str2) {
        i(str);
        j(str2);
    }

    @Override // com.oplus.aiunit.vision.x7f.a
    public x7f.c a() {
        return new qpm(this);
    }

    @Override // com.oplus.aiunit.vision.x7f.a
    public x7f.a b(String str, String str2) {
        if (this.a == null) {
            this.a = new HashMap();
        }
        this.a.put(str, str2);
        return this;
    }

    @Override // com.oplus.aiunit.vision.x7f.a
    public x7f.a c(String str, String str2) {
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.put(str, str2);
        return this;
    }

    @Override // com.oplus.aiunit.vision.x7f.a
    public x7f.a d(String str, String str2) {
        this.b.put(str, str2);
        return this;
    }

    @Override // com.oplus.aiunit.vision.x7f.a
    public x7f.a e(String str, String str2) {
        if (this.f11380c == null) {
            this.f11380c = new HashMap();
        }
        this.f11380c.put(str, str2);
        return this;
    }

    @Override // com.oplus.aiunit.vision.x7f.a
    public x7f.a f(ws2 ws2Var) {
        this.f11381e = ws2Var;
        return this;
    }

    @Override // com.oplus.aiunit.vision.x7f.a
    public x7f.a g(String str) {
        this.f = str;
        return this;
    }

    @Override // com.oplus.aiunit.vision.x7f.a
    public x7f.a h() {
        this.b.put("sgtp", "1");
        return this;
    }

    public final x7f.a i(String str) {
        this.b.put("origin", str);
        return this;
    }

    public final x7f.a j(String str) {
        this.b.put(CloudDownloadWorker.KEY_SECRET, str);
        return this;
    }
}
