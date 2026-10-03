package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.snore.SnoreEnvNoise;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/nvh;", "", "", "Lcom/heytap/databaseengine/model/snore/SnoreEnvNoise;", "snoreEnvNoiseList", "", "startTime", "endTime", "Lcom/oplus/aiunit/vision/gvh;", "b", "d", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class nvh {
    public static final int $stable = 0;

    public static final int c(SnoreEnvNoise snoreEnvNoise, SnoreEnvNoise snoreEnvNoise2) {
        long dataTimestamp = snoreEnvNoise.getDataTimestamp() - snoreEnvNoise2.getDataTimestamp();
        if (dataTimestamp > 0) {
            return 1;
        }
        return dataTimestamp < 0 ? -1 : 0;
    }

    @NotNull
    public final gvh b(@NotNull List<SnoreEnvNoise> snoreEnvNoiseList, long startTime, long endTime) {
        Intrinsics.checkNotNullParameter(snoreEnvNoiseList, "snoreEnvNoiseList");
        if (snoreEnvNoiseList.isEmpty()) {
            return d(startTime, endTime);
        }
        CollectionsKt__MutableCollectionsJVMKt.sortWith(snoreEnvNoiseList, new Comparator() { // from class: com.oplus.aiunit.vision.mvh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return nvh.c((SnoreEnvNoise) obj, (SnoreEnvNoise) obj2);
            }
        });
        ArrayList arrayList = new ArrayList();
        int iIntValue = 0;
        int iIntValue2 = 0;
        for (SnoreEnvNoise snoreEnvNoise : snoreEnvNoiseList) {
            Integer value = snoreEnvNoise.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "value");
            if (iIntValue2 > value.intValue() || iIntValue2 == 0) {
                iIntValue2 = value.intValue();
            }
            if (iIntValue < value.intValue()) {
                iIntValue = value.intValue();
            }
            TimeStampedData timeStampedData = new TimeStampedData();
            timeStampedData.setTimestamp(snoreEnvNoise.getDataTimestamp());
            timeStampedData.setY(value.intValue());
            arrayList.add(timeStampedData);
        }
        gvh gvhVar = new gvh();
        gvhVar.h(startTime);
        gvhVar.g(endTime);
        gvhVar.d(arrayList);
        gvhVar.e(iIntValue);
        gvhVar.f(iIntValue2);
        return gvhVar;
    }

    public final gvh d(long startTime, long endTime) {
        ArrayList arrayList = new ArrayList();
        TimeStampedData timeStampedData = new TimeStampedData();
        timeStampedData.setY(-10.0f);
        timeStampedData.setTimestamp(startTime);
        arrayList.add(timeStampedData);
        gvh gvhVar = new gvh();
        gvhVar.h(startTime);
        gvhVar.g(endTime);
        gvhVar.d(arrayList);
        return gvhVar;
    }
}
