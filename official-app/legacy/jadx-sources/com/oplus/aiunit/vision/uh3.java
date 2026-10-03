package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/uh3;", "", "", "b", "", "c", "a", "AUTO_OPEN_TRUE", "I", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class uh3 {
    public static final int AUTO_OPEN_TRUE = 1;

    @NotNull
    public static final uh3 INSTANCE = new uh3();

    public final void a() {
        a7b.f("NTF_CloudAutoOpenUtil", "cancelAutoOpen");
        v9g.x("notification_sp").S("cloud_auto_open", 0);
    }

    public final int b() {
        return v9g.x("notification_sp").z("cloud_auto_open", 0);
    }

    public final void c() {
        a7b.f("NTF_CloudAutoOpenUtil", "saveAutoOpen");
        v9g.x("notification_sp").S("cloud_auto_open", 1);
    }
}
