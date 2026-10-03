package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.b79, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/b79;", "", "", "toString", "", "Lcom/oplus/aiunit/vision/f79;", "a", "Ljava/util/List;", "()Ljava/util/List;", "d", "(Ljava/util/List;)V", "labelList", "", "b", "J", "()J", MapSchema.FIELD_NAME_ENTRY, "(J)V", "timestamp", "", "c", "I", "()I", "f", "(I)V", "warningCount", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class HeartRateWarnDayBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public List<HeartRateWarnLabelBean> labelList = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public long timestamp;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int warningCount;

    @NotNull
    public final List<HeartRateWarnLabelBean> a() {
        return this.labelList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getWarningCount() {
        return this.warningCount;
    }

    public final void d(@NotNull List<HeartRateWarnLabelBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.labelList = list;
    }

    public final void e(long j2) {
        this.timestamp = j2;
    }

    public final void f(int i) {
        this.warningCount = i;
    }

    @NotNull
    public String toString() {
        return "HeartRateWarnDayBean(labelList=" + this.labelList + ", timestamp=" + this.timestamp + ", warningCount=" + this.warningCount + ")";
    }
}
