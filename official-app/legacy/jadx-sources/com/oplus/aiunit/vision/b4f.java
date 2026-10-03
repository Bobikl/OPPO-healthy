package com.oplus.aiunit.vision;

import com.heytap.health.base.task.ThreadUtils;

/* JADX INFO: loaded from: classes15.dex */
public class b4f extends a8a {
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void lambda$initAfterPrivacyAgreed$0() {
        a7b.f("PushProcessInitializer", "initPush");
        xs8.INSTANCE.a().h().a(false);
    }

    @Override // com.oplus.aiunit.vision.a8a
    public int configProcess() {
        return 16;
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void init() {
    }

    @Override // com.oplus.aiunit.vision.a8a
    public void initAfterPrivacyAgreed() {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.a4f
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$initAfterPrivacyAgreed$0();
            }
        });
    }
}
