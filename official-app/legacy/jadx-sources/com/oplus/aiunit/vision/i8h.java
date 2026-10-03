package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.newsleep.DBSleepAdvice;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J$\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H'J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH'J6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH'J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H'J \u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H'J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H'J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H'J\u0016\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H'¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/i8h;", "", "", "", "dateList", "", "ssoid", "Lcom/heytap/databaseengineservice/db/table/newsleep/DBSleepAdvice;", "j", "startTime", "endTime", "", "sortOrder", b2n.g, "limit", "i", "c", "startOfToday", "currentTime", b2n.f, "limitCount", "d", "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface i8h {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBSleepAdvice> list);

    @Update
    int b(@NotNull List<DBSleepAdvice> list);

    @Query("select MAX(modified_timestamp) from DBSleepAdvice where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select '' as ssoid, data_client, data_timestamp, bedtime, out_bedtime, duration, burden, sync_status, modified_timestamp from DBSleepAdvice where ssoid = :ssoid and sync_status = 0 and data_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then data_timestamp end desc, case when :sortOrder = 0 then data_timestamp end asc limit :limitCount")
    @NotNull
    List<DBSleepAdvice> d(long startTime, long endTime, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select MAX(modified_timestamp) from DBSleepAdvice where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(@NotNull String ssoid, long startOfToday, long currentTime);

    @Query("select * from DBSleepAdvice where ssoid = :ssoid and data_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then data_timestamp end desc, case when :sortOrder = 0 then data_timestamp end asc")
    @NotNull
    List<DBSleepAdvice> h(@NotNull String ssoid, long startTime, long endTime, int sortOrder);

    @Query("select * from DBSleepAdvice where ssoid = :ssoid and data_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then data_timestamp end desc, case when :sortOrder = 0 then data_timestamp end asc limit :limit")
    @NotNull
    List<DBSleepAdvice> i(@NotNull String ssoid, long startTime, long endTime, int sortOrder, int limit);

    @Query("select * from DBSleepAdvice where ssoid = :ssoid and data_timestamp in (:dateList) and sync_status = 0")
    @NotNull
    List<DBSleepAdvice> j(@NotNull List<Long> dateList, @NotNull String ssoid);
}
