package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.databaseengineservice.db.table.bloodsugar.DBBloodSugarStat;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0004H'J(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H'J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\u0006\u0010\u0012\u001a\u00020\u0011H'J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H'J6\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0004H'J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H'J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\r2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH'J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0007H'J\u0016\u0010\"\u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\rH'¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/dt1;", "", "", "ssoid", "", "today", "j", "Lcom/heytap/databaseengineservice/db/table/bloodsugar/DBBloodSugarStat;", "n", "oldestDay", b2n.g, f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "", "d", "dateList", LogFieldKey.LEVEL_KEY, "Landroidx/sqlite/db/SupportSQLiteQuery;", SearchIntents.EXTRA_QUERY, "", "i", "", "c", "limitCount", "sortOrder", MapSchema.FIELD_NAME_ENTRY, "f", "date", MapSchema.FIELD_NAME_KEY, "bloodPressureStat", "o", "list", "a", LogFieldKey.MESSAGE_KEY, "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface dt1 {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBBloodSugarStat> list);

    @Update
    int b(@NotNull List<DBBloodSugarStat> list);

    @Query("select MAX(modified_Timestamp) from DBBloodSugarStat where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select * from DBBloodSugarStat where ssoid = :ssoid and date between :startDate and :endDate and max_value > 0")
    @Nullable
    List<DBBloodSugarStat> d(@NotNull String ssoid, int startDate, int endDate);

    @Query("select '' as ssoid, data_client, client_model, date, timezone, avg_value, min_value, max_value, warning_counts, high_counts, normal_counts, low_counts, normal_percent, low_threshold, high_threshold, goal_achieved, device_active_timestamp, sync_status, modified_timestamp  from DBBloodSugarStat where ssoid = :ssoid and sync_status = 0 and date between :startDate and :endDate and max_value > 0 order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    @NotNull
    List<DBBloodSugarStat> e(int startDate, int endDate, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("delete from DBBloodSugarStat where ssoid = :ssoid")
    int f(@NotNull String ssoid);

    @Query("select min(date) from DBBloodSugarStat where ssoid = :ssoid and date >= :oldestDay")
    int h(@NotNull String ssoid, int oldestDay);

    @RawQuery
    @NotNull
    List<DBBloodSugarStat> i(@NotNull SupportSQLiteQuery query);

    @Query("select MAX(date) from DBBloodSugarStat where ssoid = :ssoid and date <= :today")
    int j(@NotNull String ssoid, int today);

    @Query("select * from DBBloodSugarStat where ssoid = :ssoid and date = :date")
    @Nullable
    DBBloodSugarStat k(@NotNull String ssoid, int date);

    @Query("select * from DBBloodSugarStat where ssoid = :ssoid and date in (:dateList) and sync_status = 0")
    @NotNull
    List<DBBloodSugarStat> l(@NotNull List<Integer> dateList, @NotNull String ssoid);

    @Update
    int m(@NotNull DBBloodSugarStat bloodPressureStat);

    @Query("select * from DBBloodSugarStat where ssoid = :ssoid and date <= :today order by date desc limit 1")
    @Nullable
    DBBloodSugarStat n(@NotNull String ssoid, int today);

    @Insert(onConflict = 1)
    long o(@NotNull DBBloodSugarStat bloodPressureStat);
}
