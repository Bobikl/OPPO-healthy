package com.oplus.aiunit.vision;

import android.os.Build;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/n52;", "", "", "a", "<init>", "()V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class n52 {

    @NotNull
    public static final n52 INSTANCE = new n52();

    public final boolean a() {
        return Intrinsics.areEqual("OnePlus", Build.BRAND);
    }
}
