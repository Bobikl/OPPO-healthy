package com.oplus.aiunit.vision;

import com.heytap.health.health.insight.ModuleType;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000f\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/f8b;", "", "Lcom/heytap/health/health/insight/ModuleType;", "getModuleType", "()Lcom/heytap/health/health/insight/ModuleType;", "moduleType", "", "getPriority", "()I", "priority", "getId", "id", "", "getNotifyId", "()Ljava/lang/String;", "notifyId", "health_release"}, k = 1, mv = {1, 8, 0})
public interface f8b {
    int getId();

    @NotNull
    ModuleType getModuleType();

    @NotNull
    String getNotifyId();

    int getPriority();
}
