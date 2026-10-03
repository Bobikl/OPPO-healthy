package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.sleepdaystat.DBSleepDayStat;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'J0\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H'J8\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H'J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H'J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H'J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00022\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H'J\u0016\u0010\u0016\u001a\u00020\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H'¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/ufh;", "", "", "", "dateList", "", "ssoid", "Lcom/heytap/databaseengineservice/db/table/sleepdaystat/DBSleepDayStat;", LogFieldKey.LEVEL_KEY, f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "sortOrder", LogFieldKey.MESSAGE_KEY, "count", "n", "", "c", "f", "limitCount", MapSchema.FIELD_NAME_ENTRY, "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface ufh {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@Nullable List<DBSleepDayStat> list);

    @Update
    int b(@NotNull List<DBSleepDayStat> list);

    @Query("select MAX(modified_timestamp) from DBSleepDayStat where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select '' as ssoid, device_unique_id, date, sleep_in_timestamp, sleep_out_timestamp, total_sleep_time, total_deep_sleep_time, total_lightly_sleep_time, total_rem_time, total_wake_up_time, sleep_score, wake_count, calibrated, sync_status, updated, modified_timestamp, sleep_main_data, sleep_frg_data, data_version, source, standard_time, rest_in_timestamp, rest_out_timestamp from DBSleepDayStat where ssoid = :ssoid and (sync_status = 0 or updated = 1) and total_wake_up_time >= 0 and total_sleep_time <= 1440 and sleep_in_timestamp >= 1546272000000 and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    @NotNull
    List<DBSleepDayStat> e(int startDate, int endDate, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("delete from DBSleepDayStat where ssoid = :ssoid")
    int f(@NotNull String ssoid);

    @Query("select * from DBSleepDayStat where ssoid = :ssoid and date in (:dateList) and sync_status = 0")
    @NotNull
    List<DBSleepDayStat> l(@NotNull List<Integer> dateList, @NotNull String ssoid);

    @Query("select * from DBSleepDayStat where ssoid = :ssoid and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc")
    @Nullable
    List<DBSleepDayStat> m(@NotNull String ssoid, int startDate, int endDate, int sortOrder);

    @Query("select * from DBSleepDayStat where ssoid = :ssoid and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :count")
    @Nullable
    List<DBSleepDayStat> n(@NotNull String ssoid, int startDate, int endDate, int sortOrder, int count);
}
