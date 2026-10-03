package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.databaseengineservice.db.table.sunshine.DBSunshineStat;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J.\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H'J6\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H'J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H'J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H'J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\u0012H'J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H'J6\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH'J\u0016\u0010\u001b\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH'¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/y3j;", "", "", "ssoid", "", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "sortOrder", "", "Lcom/heytap/databaseengineservice/db/table/sunshine/DBSunshineStat;", LogFieldKey.MESSAGE_KEY, "count", "n", "date", b2n.g, "d", "dateList", LogFieldKey.LEVEL_KEY, "Landroidx/sqlite/db/SupportSQLiteQuery;", SearchIntents.EXTRA_QUERY, "i", "", "c", "limitCount", MapSchema.FIELD_NAME_ENTRY, "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface y3j {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBSunshineStat> list);

    @Update
    int b(@NotNull List<DBSunshineStat> list);

    @Query("select MAX(modified_timestamp) from DBSunshineStat where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select * from DBSunshineStat where ssoid = :ssoid and date = :date and target_duration > 0")
    @NotNull
    List<DBSunshineStat> d(@NotNull String ssoid, int date);

    @Query("select '' as ssoid, data_client, client_model, date, total_duration, target_duration, vitamin_d, vitamin_d_ingestion, vitamin_d_ingestion_time, avg_v_d, goal_complete, favorite_time, sunshine_type, sync_status, modified_timestamp from DBSunshineStat where ssoid = :ssoid and sync_status = 0 and (total_duration > 0 or target_duration > 0) and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limitCount")
    @NotNull
    List<DBSunshineStat> e(int startDate, int endDate, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBSunshineStat where ssoid = :ssoid and date = :date")
    @NotNull
    List<DBSunshineStat> h(@NotNull String ssoid, int date);

    @RawQuery
    @NotNull
    List<DBSunshineStat> i(@NotNull SupportSQLiteQuery query);

    @Query("select * from DBSunshineStat where ssoid = :ssoid and date in (:dateList) and sync_status = 0")
    @NotNull
    List<DBSunshineStat> l(@NotNull List<Integer> dateList, @NotNull String ssoid);

    @Query("select * from DBSunshineStat where ssoid = :ssoid and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc")
    @NotNull
    List<DBSunshineStat> m(@NotNull String ssoid, int startDate, int endDate, int sortOrder);

    @Query("select * from DBSunshineStat where ssoid = :ssoid and date between :startDate and :endDate order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :count")
    @NotNull
    List<DBSunshineStat> n(@NotNull String ssoid, int startDate, int endDate, int sortOrder, int count);
}
