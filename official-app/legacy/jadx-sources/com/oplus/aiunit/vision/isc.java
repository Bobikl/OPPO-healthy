package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/isc;", "", "", "a", "<init>", "()V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class isc {

    @NotNull
    public static final isc INSTANCE = new isc();

    public final boolean a() {
        if (!iba.c()) {
            return false;
        }
        if (ilj.l() >= 39) {
            return true;
        }
        return ilj.l() >= 38 && ilj.o("com.heytap.accessory") >= 160320010;
    }
}
