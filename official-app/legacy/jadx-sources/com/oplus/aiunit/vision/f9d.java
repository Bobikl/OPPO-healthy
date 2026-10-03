package com.oplus.aiunit.vision;

import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.owconnect.diagnosis.Events$WConnectEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/owconnect/diagnosis/Events$WConnectEvent;", "event", "", "a", "device_settings_impl_release"}, k = 2, mv = {1, 8, 0})
public final class f9d {
    @NotNull
    public static final String a(@NotNull Events$WConnectEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return event.getCode() == -2106 ? qtf.l(R$string.device_settings_doctor_sugg_5_restart_phone) : qtf.l(R$string.device_settings_doctor_sugg_restart_watch);
    }
}
