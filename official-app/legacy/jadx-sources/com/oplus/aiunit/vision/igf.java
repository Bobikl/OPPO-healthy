package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.core.widget.charts.data.RecordTimeStampedData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\f\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0003\u0010\u0015\"\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/igf;", "", "", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "type", "", "Lcom/heytap/health/core/widget/charts/data/RecordTimeStampedData;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "setTimeStampedDataList", "(Ljava/util/List;)V", "timeStampedDataList", "", UserInfo.SEX_FEMALE, "()F", "setMinValue", "(F)V", "minValue", "setMaxValue", "maxValue", "<init>", "(Ljava/lang/String;Ljava/util/List;FF)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
public final class igf {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<RecordTimeStampedData> timeStampedDataList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public float minValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float maxValue;

    public igf(@NotNull String type, @NotNull List<RecordTimeStampedData> timeStampedDataList, float f, float f2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(timeStampedDataList, "timeStampedDataList");
        this.type = type;
        this.timeStampedDataList = timeStampedDataList;
        this.minValue = f;
        this.maxValue = f2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getMinValue() {
        return this.minValue;
    }

    @NotNull
    public final List<RecordTimeStampedData> c() {
        return this.timeStampedDataList;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
