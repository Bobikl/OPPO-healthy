package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalAchievement;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H'J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0003\u001a\u00020\u0002H'J$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u000eH'J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H'J6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bH'J\u0016\u0010\u0019\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bH'¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/bje;", "", "", "ssoid", "", "startDay", "endDay", "sortOrder", "", "Lcom/heytap/databaseengineservice/db/table/phycialmental/DBPhysicalMentalAchievement;", "d", "dateList", LogFieldKey.LEVEL_KEY, "f", "Landroidx/sqlite/db/SupportSQLiteQuery;", SearchIntents.EXTRA_QUERY, "i", "", "c", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "limitCount", MapSchema.FIELD_NAME_ENTRY, "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface bje {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBPhysicalMentalAchievement> list);

    @Update
    int b(@NotNull List<DBPhysicalMentalAchievement> list);

    @Query("select MAX(modified_timestamp) from DBPhysicalMentalAchievement where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select * from DBPhysicalMentalAchievement where ssoid = :ssoid and (status_level > 0 or step > 0 or sleep_duration > 0 or should_skip_today > 0 or sunshine > 0 or regular_bed_time > 0 or exercise > 0 or calorie > 0) and date between :startDay and :endDay order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc")
    @NotNull
    List<DBPhysicalMentalAchievement> d(@NotNull String ssoid, int startDay, int endDay, int sortOrder);

    @Query("select '' as ssoid, data_client, client_model, date, level, progress, physical_mental_avg, status_level, vitality_avg, vitality_goal, step, step_goal, activity_count, activity_count_goal, sleep_duration, sleep_duration_goal_min, sleep_duration_goal_max,relax_duration, relax_duration_goal, display, sync_status, modified_timestamp, stats_version, should_skip_today, today_skip_reason, sunshine, sunshine_goal, regular_bed_time, regular_bed_time_goal, exercise, exercise_goal, calorie, calorie_goal, target_item_display from DBPhysicalMentalAchievement where ssoid = :ssoid and sync_status = 0 and (status_level > 0 or step > 0 or should_skip_today > 0) and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    @NotNull
    List<DBPhysicalMentalAchievement> e(int startDate, int endDate, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBPhysicalMentalAchievement where ssoid = :ssoid and date in (:dateList)")
    @NotNull
    List<DBPhysicalMentalAchievement> f(@NotNull List<Integer> dateList, @NotNull String ssoid);

    @RawQuery
    @NotNull
    List<DBPhysicalMentalAchievement> i(@NotNull SupportSQLiteQuery query);

    @Query("select * from DBPhysicalMentalAchievement where ssoid = :ssoid and date in (:dateList) and sync_status = 0")
    @NotNull
    List<DBPhysicalMentalAchievement> l(@NotNull List<Integer> dateList, @NotNull String ssoid);
}
