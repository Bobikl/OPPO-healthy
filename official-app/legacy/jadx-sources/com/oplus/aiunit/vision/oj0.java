package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.atrialfibril.AtrialFibrilWarn;
import com.heytap.health.healthbase.util.HealthFrgType;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/oj0;", "", "", "Lcom/heytap/databaseengine/model/atrialfibril/AtrialFibrilWarn;", "a", "Ljava/util/List;", "()Ljava/util/List;", "dataList", "Lcom/heytap/health/healthbase/util/HealthFrgType;", "b", "Lcom/heytap/health/healthbase/util/HealthFrgType;", "()Lcom/heytap/health/healthbase/util/HealthFrgType;", "c", "(Lcom/heytap/health/healthbase/util/HealthFrgType;)V", "healthFrgType", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class oj0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<AtrialFibrilWarn> dataList = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public HealthFrgType healthFrgType = HealthFrgType.DAY;

    @NotNull
    public final List<AtrialFibrilWarn> a() {
        return this.dataList;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final HealthFrgType getHealthFrgType() {
        return this.healthFrgType;
    }

    public final void c(@NotNull HealthFrgType healthFrgType) {
        Intrinsics.checkNotNullParameter(healthFrgType, "<set-?>");
        this.healthFrgType = healthFrgType;
    }
}
