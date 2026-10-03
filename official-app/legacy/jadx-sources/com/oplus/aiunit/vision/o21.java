package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.owconnect.OWConnectRecord;
import com.heytap.health.owconnect.diagnosis.Events$OWStep;
import com.heytap.health.owconnect.diagnosis.Events$WConnectEvent;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H&R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/o21;", "Lcom/heytap/health/doctor/doctors/a;", "Lcom/oplus/aiunit/vision/qg3;", "clinic", "", "c", "Lcom/heytap/health/owconnect/diagnosis/Events$OWStep;", "d", "Lcom/heytap/health/owconnect/diagnosis/Events$WConnectEvent;", "a", "Lcom/heytap/health/owconnect/diagnosis/Events$WConnectEvent;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/health/owconnect/diagnosis/Events$WConnectEvent;", "setEvent", "(Lcom/heytap/health/owconnect/diagnosis/Events$WConnectEvent;)V", "event", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOWDoctors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OWDoctors.kt\ncom/heytap/health/doctor/doctors/BaseEventDoctor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,249:1\n1#2:250\n*E\n"})
public abstract class o21 extends com.heytap.health.doctor.doctors.a {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Events$WConnectEvent event;

    @Override // com.heytap.health.doctor.doctors.b
    public boolean c(@NotNull qg3 clinic) {
        boolean z;
        Object next;
        Intrinsics.checkNotNullParameter(clinic, "clinic");
        List<Events$WConnectEvent> eventsList = clinic.s().a().getEventsList();
        Intrinsics.checkNotNullExpressionValue(eventsList, "clinic.checkup.owConnection.eventsList");
        Iterator<T> it = eventsList.iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((Events$WConnectEvent) next).getStep() == d()));
        Events$WConnectEvent events$WConnectEvent = (Events$WConnectEvent) next;
        this.event = events$WConnectEvent;
        wil.d(OWConnectRecord.DOC_TAG, "BaseEventDoctor-> " + this + " event -> " + (events$WConnectEvent != null ? c9d.k(events$WConnectEvent) : null));
        Events$WConnectEvent events$WConnectEvent2 = this.event;
        if (events$WConnectEvent2 != null && events$WConnectEvent2.getConnect()) {
            z = true;
        }
        return !z;
    }

    @NotNull
    public abstract Events$OWStep d();

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Events$WConnectEvent getEvent() {
        return this.event;
    }
}
