package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.deepthinker.platform.server.IDeepThinkerBridge;
import com.oplus.deepthinker.sdk.app.ServiceHolder;
import com.oplus.deepthinker.sdk.app.deepthinkermanager.domainmanager.UserDomainManager;
import com.oplus.deepthinker.sdk.app.userprofile.labels.ResidenceInfo;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes5.dex */
public class zod implements au9 {
    public final kp9 a;
    public final xp9 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vz9 f19483c;
    public final em9 d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gv9 f19484e;
    public ServiceHolder f;

    public zod(Context context) {
        ServiceHolder serviceHolder = new ServiceHolder();
        this.f = serviceHolder;
        this.a = new of5(context, serviceHolder);
        this.b = new cp6(this.f);
        this.f19483c = new UserDomainManager(this.f);
        this.d = new e90(this.f);
        this.f19484e = new yke(this.f);
    }

    public Map<Integer, Integer> b(int[] iArr) {
        return this.f19483c.a(iArr);
    }

    public ResidenceInfo c() {
        return this.b.a();
    }

    public ResidenceInfo d() {
        return this.b.b();
    }

    public void e(Supplier<IDeepThinkerBridge> supplier) {
        this.f.b(supplier);
    }
}
