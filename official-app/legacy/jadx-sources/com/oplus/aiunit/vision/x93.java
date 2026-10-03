package com.oplus.aiunit.vision;

import androidx.lifecycle.LiveData;
import com.heytap.health.owconnect.diagnosis.Events$OWConnection;
import com.heytap.health.owconnect.diagnosis.Events$WConnectEvent;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/x93;", "", "Lcom/heytap/health/owconnect/diagnosis/Events$OWConnection;", "a", "()Lcom/heytap/health/owconnect/diagnosis/Events$OWConnection;", "owConnection", "Landroidx/lifecycle/LiveData;", "Lcom/heytap/health/owconnect/diagnosis/Events$WConnectEvent;", "b", "()Landroidx/lifecycle/LiveData;", "watchdog", "oafhost_release"}, k = 1, mv = {1, 8, 0})
public interface x93 {
    @NotNull
    Events$OWConnection a();

    @NotNull
    LiveData<Events$WConnectEvent> b();
}
