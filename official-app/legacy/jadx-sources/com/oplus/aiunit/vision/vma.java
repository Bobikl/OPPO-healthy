package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.owconnect.diagnosis.Events$OWStep;
import com.heytap.health.owconnect.diagnosis.Events$WConnectEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/vma;", "Lcom/oplus/aiunit/vision/o21;", "Lcom/heytap/health/owconnect/diagnosis/Events$OWStep;", "d", "Lcom/oplus/aiunit/vision/qg3;", "clinic", "", "a", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class vma extends o21 {
    public static final int $stable = 0;

    @Override // com.heytap.health.doctor.doctors.b
    public void a(@NotNull qg3 clinic) {
        Intrinsics.checkNotNullParameter(clinic, "clinic");
        if (qe0.w()) {
            Events$WConnectEvent event = getEvent();
            Intrinsics.checkNotNull(event);
            clinic.n("K." + event.getMessage(), qtf.l(R$string.device_settings_doctor_sugg_restart_watch));
            return;
        }
        Events$WConnectEvent event2 = getEvent();
        Intrinsics.checkNotNull(event2);
        clinic.n("K." + event2.getCode(), qtf.l(R$string.device_settings_doctor_sugg_restart_watch));
    }

    @Override // com.oplus.aiunit.vision.o21
    @NotNull
    public Events$OWStep d() {
        return Events$OWStep.KSC;
    }
}
