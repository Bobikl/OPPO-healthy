package com.oplus.aiunit.vision;

import com.oplus.deepthinker.platform.server.IDeepThinkerBridge;
import com.oplus.deepthinker.sdk.app.ServiceHolder;
import com.oplus.deepthinker.sdk.app.userprofile.labels.ResidenceInfo;

/* JADX INFO: loaded from: classes5.dex */
public class cp6 implements xp9 {
    public ServiceHolder a;

    public cp6(ServiceHolder serviceHolder) {
        this.a = serviceHolder;
    }

    @Override // com.oplus.aiunit.vision.xp9
    public ResidenceInfo a() {
        return (ResidenceInfo) uld.a(new bp6(this), 15, ResidenceInfo.class);
    }

    @Override // com.oplus.aiunit.vision.xp9
    public ResidenceInfo b() {
        return (ResidenceInfo) uld.a(new bp6(this), 14, ResidenceInfo.class);
    }

    public final IDeepThinkerBridge d() {
        return this.a.a();
    }
}
