package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.databaseengineservice.db.table.newsleep.DBSleepHeartRateStat;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H'J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H'J\"\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH'J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0012H'J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0003\u001a\u00020\u0002H'J6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\bH'¨\u0006\u001d"}, d2 = {"Lcom/oplus/aiunit/vision/lih;", "", "", "ssoid", "", "startDay", "endDay", "sortOrder", "", "Lcom/heytap/databaseengineservice/db/table/newsleep/DBSleepHeartRateStat;", "d", "limit", "f", "", "startTime", "endTime", "b", "c", "Landroidx/sqlite/db/SupportSQLiteQuery;", SearchIntents.EXTRA_QUERY, "i", "dateList", LogFieldKey.LEVEL_KEY, f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "limitCount", MapSchema.FIELD_NAME_ENTRY, "list", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface lih {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBSleepHeartRateStat> list);

    @Query("select ssoid, 0 as date, min(sleep_heart_rate_range_low) as min_hr, max(sleep_heart_rate_range_high) as max_hr, min(heart_rate_reasonable_range_low) as reasonable_range_low, max(heart_rate_reasonable_range_high) as reasonable_range_high, avg(avg_sleep_heart_rate) as avg_sleep_heart_rate, 0 as warning_number, sync_status, 0 as modified_timestamp from DBSleepIndex where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime order by data_created_timestamp asc limit 1")
    @Nullable
    DBSleepHeartRateStat b(@NotNull String ssoid, long startTime, long endTime);

    @Query("select MAX(modified_timestamp) from DBSleepHeartRateStat where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select * from DBSleepHeartRateStat where ssoid = :ssoid and max_hr > 0 and date between :startDay and :endDay order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc")
    @NotNull
    List<DBSleepHeartRateStat> d(@NotNull String ssoid, int startDay, int endDay, int sortOrder);

    @Query("select '' as ssoid, date, min_hr, max_hr, reasonable_range_low, reasonable_range_high,warning_number, avg_sleep_heart_rate, sync_status, modified_timestamp from DBSleepHeartRateStat where ssoid = :ssoid and sync_status = 0 and max_hr > 0 and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    @NotNull
    List<DBSleepHeartRateStat> e(int startDate, int endDate, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBSleepHeartRateStat where ssoid = :ssoid and max_hr > 0 and date between :startDay and :endDay order by  case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limit")
    @NotNull
    List<DBSleepHeartRateStat> f(@NotNull String ssoid, int startDay, int endDay, int sortOrder, int limit);

    @RawQuery
    @NotNull
    List<DBSleepHeartRateStat> i(@NotNull SupportSQLiteQuery query);

    @Query("select * from DBSleepHeartRateStat where ssoid = :ssoid and date in (:dateList) and sync_status = 0")
    @NotNull
    List<DBSleepHeartRateStat> l(@NotNull List<Integer> dateList, @NotNull String ssoid);
}
