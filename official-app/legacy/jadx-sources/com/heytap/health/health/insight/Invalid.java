package com.heytap.health.health.insight;

import com.lifesense.android.bluetooth.scale.bean.WeightData_A3;
import com.oplus.aiunit.vision.f8b;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B)\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/health/insight/Invalid;", "", "Lcom/oplus/aiunit/vision/f8b;", "Lcom/heytap/health/health/insight/ModuleType;", "moduleType", "Lcom/heytap/health/health/insight/ModuleType;", "getModuleType", "()Lcom/heytap/health/health/insight/ModuleType;", "", "priority", "I", "getPriority", "()I", "id", "getId", "", "notifyId", "Ljava/lang/String;", "getNotifyId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILcom/heytap/health/health/insight/ModuleType;IILjava/lang/String;)V", WeightData_A3.IMPEDANCE_STATUS_ERROR, "health_release"}, k = 1, mv = {1, 8, 0})
public enum Invalid implements f8b {
    ERROR(ModuleType.INVLAID, -1, -1, "");

    private final int id;

    @NotNull
    private final ModuleType moduleType;

    @NotNull
    private final String notifyId;
    private final int priority;

    Invalid(ModuleType moduleType, int i, int i2, String str) {
        this.moduleType = moduleType;
        this.priority = i;
        this.id = i2;
        this.notifyId = str;
    }

    @Override // com.oplus.aiunit.vision.f8b
    public int getId() {
        return this.id;
    }

    @Override // com.oplus.aiunit.vision.f8b
    @NotNull
    public ModuleType getModuleType() {
        return this.moduleType;
    }

    @Override // com.oplus.aiunit.vision.f8b
    @NotNull
    public String getNotifyId() {
        return this.notifyId;
    }

    @Override // com.oplus.aiunit.vision.f8b
    public int getPriority() {
        return this.priority;
    }
}
