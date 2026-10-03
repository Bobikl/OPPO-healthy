package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SportHealthData;
import com.heytap.health.sleep.measure.PhoneStatDataParser;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/rhe;", "", "", MapSchema.FIELD_NAME_ENTRY, "a", "", "Lcom/heytap/health/sleep/measure/PhoneStatDataParser$SleepDayTime;", "Ljava/util/List;", "c", "()Ljava/util/List;", "sleepDayTimeList", "Lcom/heytap/databaseengine/model/SportHealthData;", "b", "d", "sleepIndexList", "sleepBaseHeartRateList", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class rhe {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<PhoneStatDataParser.SleepDayTime> sleepDayTimeList = new ArrayList();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<SportHealthData> sleepIndexList = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<SportHealthData> sleepBaseHeartRateList = new ArrayList();

    public final long a() {
        if (!(!this.sleepDayTimeList.isEmpty())) {
            return 0L;
        }
        List<PhoneStatDataParser.SleepDayTime> list = this.sleepDayTimeList;
        return list.get(list.size() - 1).getEndDayTime();
    }

    @NotNull
    public final List<SportHealthData> b() {
        return this.sleepBaseHeartRateList;
    }

    @NotNull
    public final List<PhoneStatDataParser.SleepDayTime> c() {
        return this.sleepDayTimeList;
    }

    @NotNull
    public final List<SportHealthData> d() {
        return this.sleepIndexList;
    }

    public final long e() {
        if (!this.sleepDayTimeList.isEmpty()) {
            return this.sleepDayTimeList.get(0).getStartDayTime();
        }
        return 0L;
    }
}
