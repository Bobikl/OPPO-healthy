package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.heytap.databaseengine.model.SportDataStat;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/kqi;", "", "Landroid/os/Bundle;", "bundle", "", "Lcom/heytap/databaseengine/model/SportDataStat;", "sportDataStatList", "Lkotlin/Pair;", "", "a", "<init>", "()V", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStepDataTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepDataTransform.kt\ncom/health/health_seedlingcard/model/StepDataTransform\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1855#2,2:42\n*S KotlinDebug\n*F\n+ 1 StepDataTransform.kt\ncom/health/health_seedlingcard/model/StepDataTransform\n*L\n26#1:42,2\n*E\n"})
public final class kqi {
    @NotNull
    public final Pair<Integer, Integer> a(@NotNull Bundle bundle, @NotNull List<? extends SportDataStat> sportDataStatList) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(sportDataStatList, "sportDataStatList");
        int totalSteps = (int) bundle.getLong("step");
        int i = (int) bundle.getLong("stepGoal");
        a7b.f("StepDataTransform", "p:" + totalSteps + " ,:" + i);
        boolean z = (totalSteps == 0 || i == 0) ? false : true;
        int iE = mq8.INSTANCE.e(System.currentTimeMillis());
        for (SportDataStat sportDataStat : sportDataStatList) {
            if (sportDataStat.getDate() == iE) {
                if (z) {
                    sportDataStat.setTotalSteps(totalSteps);
                } else {
                    totalSteps = sportDataStat.getTotalSteps();
                    a7b.f("StepDataTransform", "s:" + sportDataStat.getTotalSteps());
                }
            }
        }
        return new Pair<>(Integer.valueOf(totalSteps), Integer.valueOf(i));
    }
}
