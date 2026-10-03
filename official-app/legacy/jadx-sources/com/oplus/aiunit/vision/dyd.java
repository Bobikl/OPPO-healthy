package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.menstrualcycle.DBOvulation;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J8\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H'J@\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H'J$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H'J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\nH'J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tH'J\u0016\u0010\u0018\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tH'¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/dyd;", "", "", "ssoid", "", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "display", "sortOrder", "", "Lcom/heytap/databaseengineservice/db/table/menstrualcycle/DBOvulation;", b2n.f, "count", "f", "dateList", LogFieldKey.LEVEL_KEY, "", "c", "limitCount", MapSchema.FIELD_NAME_ENTRY, "data", "d", "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface dyd {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBOvulation> list);

    @Update
    int b(@NotNull List<DBOvulation> list);

    @Query("select MAX(modified_timestamp) from DBOvulation where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Insert(onConflict = 1)
    long d(@NotNull DBOvulation data);

    @Query("select '' as ssoid, data_client, client_model, ovula_date, ovulation_pre_type, ovula_date_algor_time, ovula_begin_date, ovula_end_date, display, sync_status, modified_timestamp from DBOvulation where ssoid = :ssoid and sync_status = 0 and ovula_date between :startDate and :endDate order by case when :sortOrder = 1 then ovula_date end desc, case when :sortOrder = 0 then ovula_date end asc limit :limitCount")
    @NotNull
    List<DBOvulation> e(int startDate, int endDate, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBOvulation where ssoid = :ssoid and ovula_date between :startDate and :endDate and display != :display order by case when :sortOrder = 1 then ovula_date end desc, case when :sortOrder = 0 then ovula_date end asc limit :count")
    @Nullable
    List<DBOvulation> f(@NotNull String ssoid, int startDate, int endDate, int display, int sortOrder, int count);

    @Query("select * from DBOvulation where ssoid = :ssoid and ovula_date between :startDate and :endDate and display != :display order by case when :sortOrder = 1 then ovula_date end desc, case when :sortOrder = 0 then ovula_date end asc")
    @Nullable
    List<DBOvulation> g(@NotNull String ssoid, int startDate, int endDate, int display, int sortOrder);

    @Query("select * from DBOvulation where ssoid = :ssoid and ovula_date in (:dateList) and sync_status = 0")
    @NotNull
    List<DBOvulation> l(@NotNull List<Integer> dateList, @NotNull String ssoid);
}
