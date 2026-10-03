package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/jo5;", "", "", "mac", "secondPhoneName", "", "b", "a", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class jo5 {

    @NotNull
    public static final jo5 INSTANCE = new jo5();

    @NotNull
    public final String a(@NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        String strD = o1h.d(b78.b(), "second_phone_name_" + mac, "");
        Intrinsics.checkNotNullExpressionValue(strD, "getStr(GlobalApplication…_PHONE_NAME}_${mac}\", \"\")");
        return strD;
    }

    public final void b(@NotNull String mac, @NotNull String secondPhoneName) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(secondPhoneName, "secondPhoneName");
        o1h.g(b78.b(), "second_phone_name_" + mac, secondPhoneName);
    }
}
