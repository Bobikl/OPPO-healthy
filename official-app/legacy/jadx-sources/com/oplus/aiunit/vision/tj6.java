package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.heytap.wearable.emergency.api.emergency.EmergencyTransportApis;
import com.heytap.wearable.emergency.api.emergency.IEmergency;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/tj6;", "", "", "b", "a", "", "content", "c", "<init>", "()V", "emergency_release"}, k = 1, mv = {1, 8, 0})
public final class tj6 {

    @NotNull
    public static final tj6 INSTANCE = new tj6();

    @JvmStatic
    public static final void a() {
        Object objNavigation = x0.d().b("/emergency_impl/emergency").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.wearable.emergency.api.emergency.IEmergency");
        ((IEmergency) objNavigation).r7();
    }

    @JvmStatic
    public static final void b() {
        Object objNavigation = x0.d().b("/emergency_impl/emergency").navigation();
        Intrinsics.checkNotNull(objNavigation, "null cannot be cast to non-null type com.heytap.wearable.emergency.api.emergency.IEmergency");
        ((IEmergency) objNavigation).a6();
    }

    @JvmStatic
    public static final void c(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        EmergencyTransportApis emergencyTransportApis = EmergencyTransportApis.INSTANCE;
        Bundle bundle = new Bundle();
        bundle.putString(EmergencyTransportApis.EMERGENCY_SAFE_EVENT_KEY, content);
        emergencyTransportApis.e(bundle);
    }
}
