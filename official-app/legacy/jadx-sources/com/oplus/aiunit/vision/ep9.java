package com.oplus.aiunit.vision;

import com.heytap.databaseengine.model.DisturbSleep;
import com.heytap.databaseengineservice.db.table.DBSleep;
import com.heytap.health.sleepcheck.result.SleepCheckAndSleepScoreResult;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J.\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H&J\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H&J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH&¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/ep9;", "", "", "level", "", "date", "", "a", "", "mac", "x", LogFieldKey.LEVEL_KEY, "score", "f", "ssoid", "", "Lcom/heytap/databaseengineservice/db/table/DBSleep;", "dbSleepList", "", "sleepStatus", "Lcom/heytap/health/sleepcheck/result/SleepCheckAndSleepScoreResult;", "sleepCheckAndSleepScoreResult", "d", "", "startTime", "endTime", "Lcom/heytap/databaseengine/model/DisturbSleep;", MapSchema.FIELD_NAME_ENTRY, "", "floatArray", b2n.f, "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface ep9 {
    void a(byte level, int date);

    void d(@NotNull String ssoid, @NotNull List<? extends DBSleep> dbSleepList, @NotNull short[] sleepStatus, @NotNull SleepCheckAndSleepScoreResult sleepCheckAndSleepScoreResult);

    @NotNull
    List<DisturbSleep> e(long startTime, long endTime);

    void f(int score, int date);

    void g(@NotNull float[] floatArray);

    int l(@NotNull String mac);

    int x(@NotNull String mac);
}
