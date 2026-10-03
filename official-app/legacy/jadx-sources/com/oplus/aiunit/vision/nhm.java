package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.CloudDownloadWorker;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.instant.router.Instant;
import com.oplus.instant.router.callback.Callback;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class nhm extends Instant.Builder {
    public Map<String, String> a = new HashMap();
    public Map<String, String> b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, String> f14522c = null;
    public Map<String, String> d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Callback f14523e;
    public String f;

    public nhm(String str, String str2) {
        a(str);
        b(str2);
    }

    public final Instant.Builder a(String str) {
        this.b.put("origin", str);
        return this;
    }

    public final Instant.Builder b(String str) {
        this.b.put(CloudDownloadWorker.KEY_SECRET, str);
        return this;
    }

    @Override // com.oplus.instant.router.Instant.Builder
    public Instant.Req build() {
        return (TextUtils.isEmpty(this.f) || this.f.startsWith("oaps://instant/app")) ? new dpm(this) : new nrm(this);
    }

    @Override // com.oplus.instant.router.Instant.Builder
    public Instant.Builder putExtra(String str, String str2) {
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.put(str, str2);
        return this;
    }

    @Override // com.oplus.instant.router.Instant.Builder
    public Instant.Builder putParams(String str, String str2) {
        this.b.put(str, str2);
        return this;
    }

    @Override // com.oplus.instant.router.Instant.Builder
    public Instant.Builder putStat(String str, String str2) {
        if (this.f14522c == null) {
            this.f14522c = new HashMap();
        }
        this.f14522c.put(str, str2);
        return this;
    }

    @Override // com.oplus.instant.router.Instant.Builder
    public Instant.Builder setCallback(Callback callback) {
        this.f14523e = callback;
        return this;
    }

    @Override // com.oplus.instant.router.Instant.Builder
    public Instant.Builder setExtra(String str) {
        this.a.put(ConnectIdLogic.PARAM_EXT, str);
        return this;
    }

    @Override // com.oplus.instant.router.Instant.Builder
    public Instant.Builder setFrom(String str) {
        this.a.put("f", str);
        return this;
    }

    @Override // com.oplus.instant.router.Instant.Builder
    @Deprecated
    public Instant.Builder setPackage(String str) {
        this.a.put("pkg", str);
        return this;
    }

    @Override // com.oplus.instant.router.Instant.Builder
    @Deprecated
    public Instant.Builder setPage(String str) {
        this.a.put(RnConstant.KEY_PAGE, str);
        return this;
    }

    @Override // com.oplus.instant.router.Instant.Builder
    @Deprecated
    public Instant.Builder setPath(String str) {
        this.a.put("path", str);
        return this;
    }

    @Override // com.oplus.instant.router.Instant.Builder
    public Instant.Builder setRequestUrl(String str) {
        this.f = str;
        return this;
    }

    @Override // com.oplus.instant.router.Instant.Builder
    public Instant.Builder signAsPlatform() {
        this.b.put("sgtp", "1");
        return this;
    }
}
