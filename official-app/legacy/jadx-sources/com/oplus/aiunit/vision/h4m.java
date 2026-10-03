package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.databaseengineservice.db.table.wristtemperature.DBWristTemperatureStat;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H'J.\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H'J6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H'J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0004H'J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u0016\u001a\u00020\u0015H'J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H'J6\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J:\u0010!\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0002H'J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\rH'J\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fH'J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\rH'J\u0016\u0010'\u001a\u00020\u00042\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\r0\fH'¨\u0006("}, d2 = {"Lcom/oplus/aiunit/vision/h4m;", "", "", "ssoid", "", "today", "j", "oldestDay", b2n.g, f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "sortOrder", "", "Lcom/heytap/databaseengineservice/db/table/wristtemperature/DBWristTemperatureStat;", LogFieldKey.MESSAGE_KEY, "dataClient", "n", "date", MapSchema.FIELD_NAME_KEY, "dateList", b2n.f, "Landroidx/sqlite/db/SupportSQLiteQuery;", SearchIntents.EXTRA_QUERY, LogFieldKey.LEVEL_KEY, "", "c", "limitCount", MapSchema.FIELD_NAME_ENTRY, "f", "timezone", "startTime", "endTime", "groupBy", "d", "data", "o", "list", "a", "i", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface h4m {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBWristTemperatureStat> list);

    @Update
    int b(@NotNull List<DBWristTemperatureStat> list);

    @Query("select MAX(modified_timestamp) from DBWristTemperatureStat where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select ssoid, :date as date, :timezone as timezone, data_client, client_model, min(value - base_line) as min_value, max(value - base_line) as max_value, confidence, 0 as day_baseline_value, 0 as value, 0 as symptoms, 0 as actions, 0 as update_timestamp, sync_status, 0 as modified_timestamp from DBWristTemperature where ssoid = :ssoid and start_timestamp between :startTime and :endTime and confidence = 1 group by :groupBy order by start_timestamp asc limit 1")
    @Nullable
    DBWristTemperatureStat d(@NotNull String ssoid, int date, @NotNull String timezone, long startTime, long endTime, @NotNull String groupBy);

    @Query("select '' as ssoid, data_client, client_model, date, timezone, day_baseline_value, value, confidence, min_value, max_value, symptoms, actions, update_timestamp, sync_status, modified_timestamp from DBWristTemperatureStat where ssoid = :ssoid and sync_status = 0 and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    @NotNull
    List<DBWristTemperatureStat> e(int startDate, int endDate, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("delete from DBWristTemperatureStat where ssoid = :ssoid")
    int f(@NotNull String ssoid);

    @Query("select * from DBWristTemperatureStat where ssoid = :ssoid and date in (:dateList) and sync_status = 0")
    @NotNull
    List<DBWristTemperatureStat> g(@NotNull List<Integer> dateList, @NotNull String ssoid);

    @Query("select min(date) from DBWristTemperatureStat where ssoid = :ssoid and date >= :oldestDay")
    int h(@NotNull String ssoid, int oldestDay);

    @Update
    int i(@NotNull DBWristTemperatureStat data);

    @Query("select MAX(date) from DBWristTemperatureStat where ssoid = :ssoid and date <= :today")
    int j(@NotNull String ssoid, int today);

    @Query("select * from DBWristTemperatureStat where ssoid = :ssoid and date = :date")
    @Nullable
    DBWristTemperatureStat k(@NotNull String ssoid, int date);

    @RawQuery
    @Nullable
    List<DBWristTemperatureStat> l(@NotNull SupportSQLiteQuery query);

    @Query("select * from DBWristTemperatureStat where ssoid = :ssoid and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc")
    @NotNull
    List<DBWristTemperatureStat> m(@NotNull String ssoid, int startDate, int endDate, int sortOrder);

    @Query("select * from DBWristTemperatureStat where ssoid = :ssoid and date between :startDate and :endDate and data_client = :dataClient order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc")
    @NotNull
    List<DBWristTemperatureStat> n(@NotNull String ssoid, int startDate, int endDate, int sortOrder, @NotNull String dataClient);

    @Insert(onConflict = 1)
    long o(@NotNull DBWristTemperatureStat data);
}
