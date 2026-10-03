package com.oplus.aiunit.vision;

import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/z43;", "Lcom/oplus/aiunit/vision/x43;", "", "enable", "", ClickApiEntity.TIME, "", "a", "Lcom/oplus/aiunit/vision/x43;", oea.FEATURE_API_REQUEST, "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
public final class z43 implements x43 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final x43 api;

    public z43() {
        this.api = v3d.e() ? new c4d() : new b4d();
    }

    @Override // com.oplus.aiunit.vision.x43
    public void a(boolean enable, long time) {
        this.api.a(enable, time);
    }
}
