package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.Spo2Warning;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.x8i, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/x8i;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "b", "()I", "warnCount", "", "Lcom/heytap/databaseengine/model/Spo2Warning;", "Ljava/util/List;", "()Ljava/util/List;", "dataList", "<init>", "(ILjava/util/List;)V", "blood_oxygen_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Spo2WarnBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int warnCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<Spo2Warning> dataList;

    /* JADX WARN: Multi-variable type inference failed */
    public Spo2WarnBean(int i, @NotNull List<? extends Spo2Warning> dataList) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.warnCount = i;
        this.dataList = dataList;
    }

    @NotNull
    public final List<Spo2Warning> a() {
        return this.dataList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getWarnCount() {
        return this.warnCount;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Spo2WarnBean)) {
            return false;
        }
        Spo2WarnBean spo2WarnBean = (Spo2WarnBean) other;
        return this.warnCount == spo2WarnBean.warnCount && Intrinsics.areEqual(this.dataList, spo2WarnBean.dataList);
    }

    public int hashCode() {
        return (Integer.hashCode(this.warnCount) * 31) + this.dataList.hashCode();
    }

    @NotNull
    public String toString() {
        return "Spo2WarnBean(warnCount=" + this.warnCount + ", dataList=" + this.dataList + ")";
    }
}
