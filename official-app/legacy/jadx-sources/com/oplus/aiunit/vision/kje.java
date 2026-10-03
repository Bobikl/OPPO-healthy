package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalStat;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\bg\u0018\u00002\u00020\u0001J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H'J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H'J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H'J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0012\u001a\u00020\u0011H'J2\u0010\u0018\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0002H'J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H'J6\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bH'J\u0016\u0010 \u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bH'¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/kje;", "", "", "ssoid", "", "startDay", "endDay", "sortOrder", "", "Lcom/heytap/databaseengineservice/db/table/phycialmental/DBPhysicalMentalStat;", "d", "limit", "f", "date", b2n.g, "dateList", b2n.f, "Landroidx/sqlite/db/SupportSQLiteQuery;", SearchIntents.EXTRA_QUERY, "i", "", "startTime", "endTime", "groupBy", "j", "c", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "limitCount", MapSchema.FIELD_NAME_ENTRY, "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface kje {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBPhysicalMentalStat> list);

    @Update
    int b(@NotNull List<DBPhysicalMentalStat> list);

    @Query("select MAX(modified_timestamp) from DBPhysicalMentalStat where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select * from DBPhysicalMentalStat where ssoid = :ssoid and stress_state > 0 and date between :startDay and :endDay order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc")
    @NotNull
    List<DBPhysicalMentalStat> d(@NotNull String ssoid, int startDay, int endDay, int sortOrder);

    @Query("select '' as ssoid, data_client, client_model, date, avg_hrv, min_hrv, max_hrv, avg_stress, min_stress, min_stress_timestamp, max_stress, max_stress_timestamp, stress_state, baseline_low, baseline_middle, baseline_high, base_hrv, avg_sleep_hrv, min_sleep_hrv, max_sleep_hrv, hrv_reasonable_range_low,hrv_reasonable_range_high, avg_resting_heart_rate, stress_reminder, display, sync_status, modified_timestamp from DBPhysicalMentalStat where ssoid = :ssoid and sync_status = 0 and stress_state > 0 and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    @NotNull
    List<DBPhysicalMentalStat> e(int startDate, int endDate, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBPhysicalMentalStat where ssoid = :ssoid and stress_state > 0 and date between :startDay and :endDay order by  case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limit")
    @NotNull
    List<DBPhysicalMentalStat> f(@NotNull String ssoid, int startDay, int endDay, int sortOrder, int limit);

    @Query("select * from DBPhysicalMentalStat where ssoid = :ssoid and date in (:dateList) and sync_status = 0")
    @NotNull
    List<DBPhysicalMentalStat> g(@NotNull List<Integer> dateList, @NotNull String ssoid);

    @Query("select * from DBPhysicalMentalStat where ssoid = :ssoid and date = :date")
    @NotNull
    List<DBPhysicalMentalStat> h(@NotNull String ssoid, int date);

    @RawQuery
    @NotNull
    List<DBPhysicalMentalStat> i(@NotNull SupportSQLiteQuery query);

    @Query("select ssoid, :date as date, data_client, client_model, avg(case when value > 0 then value end) as avg_hrv, min(case when value > 0 then value end) as min_hrv, max(value) as max_hrv, max(case stress when (select min(case when stress > 0 then stress end) from DBPhysicalMentalStatus where ssoid = :ssoid and start_timestamp between :startTime and :endTime and display = 1) then start_timestamp end) as min_stress_timestamp, max(case stress when (select max(stress) from DBPhysicalMentalStatus where ssoid = :ssoid and start_timestamp between :startTime and :endTime and display = 1) then start_timestamp end) as max_stress_timestamp, avg(case when stress > 0 then stress end) as avg_stress, min(case when stress > 0 then stress end) as min_stress, max(stress) as max_stress, count(case when stress_state = 1 then stress_state end) as stress_reminder, stress_state, 0 as baseline_low, 0 as baseline_middle, 0 as baseline_high, 0 as base_hrv, 0 as avg_sleep_hrv, 0 as min_sleep_hrv, 0 as max_sleep_hrv, 0 as hrv_reasonable_range_low, 0 as hrv_reasonable_range_high, 0 as avg_resting_heart_rate, display, sync_status, 0 as modified_timestamp from DBPhysicalMentalStatus where ssoid = :ssoid and start_timestamp between :startTime and :endTime and display = 1 group by :groupBy order by start_timestamp desc limit 1")
    @Nullable
    DBPhysicalMentalStat j(@NotNull String ssoid, int date, long startTime, long endTime, @NotNull String groupBy);
}
