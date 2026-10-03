package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.menstrualcycle.DBMenstrualCycle;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\bg\u0018\u00002\u00020\u0001J8\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H'J@\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H'J(\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H'J*\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H'J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000bH'J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u0016\u0010\u001b\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/mtb;", "", "", "ssoid", "", "startTime", "endTime", "", "display", "sortOrder", "", "Lcom/heytap/databaseengineservice/db/table/menstrualcycle/DBMenstrualCycle;", "o", "count", LogFieldKey.MESSAGE_KEY, "n", "dataClient", MapSchema.FIELD_NAME_KEY, "dateList", "j", "c", "limitCount", "d", "dbMenstrualCycle", LogFieldKey.LEVEL_KEY, "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface mtb {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBMenstrualCycle> list);

    @Update
    int b(@NotNull List<DBMenstrualCycle> list);

    @Query("select MAX(modified_timestamp) from DBMenstrualCycle where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select '' as ssoid, start_timestamp, end_timestamp, stop_type, data_client, client_model, display, update_timestamp, sync_status, modified_timestamp from DBMenstrualCycle where ssoid = :ssoid and sync_status = 0  and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limitCount")
    @NotNull
    List<DBMenstrualCycle> d(long startTime, long endTime, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBMenstrualCycle where ssoid = :ssoid and start_timestamp in (:dateList) and sync_status = 0")
    @NotNull
    List<DBMenstrualCycle> j(@NotNull List<Long> dateList, @NotNull String ssoid);

    @Query("select * from DBMenstrualCycle where ssoid = :ssoid and start_timestamp = :startTime and data_client = :dataClient and display = :display order by start_timestamp desc")
    @Nullable
    DBMenstrualCycle k(@NotNull String ssoid, long startTime, @NotNull String dataClient, int display);

    @Insert(onConflict = 1)
    long l(@NotNull DBMenstrualCycle dbMenstrualCycle);

    @Query("select * from DBMenstrualCycle where ssoid = :ssoid and start_timestamp between :startTime and :endTime and display = :display order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :count")
    @Nullable
    List<DBMenstrualCycle> m(@NotNull String ssoid, long startTime, long endTime, int display, int sortOrder, int count);

    @Query("select * from DBMenstrualCycle where ssoid = :ssoid and ((start_timestamp <= :endTime) and (end_timestamp >= :startTime)) and display != 0 order by start_timestamp desc")
    @Nullable
    List<DBMenstrualCycle> n(@NotNull String ssoid, long startTime, long endTime);

    @Query("select * from DBMenstrualCycle where ssoid = :ssoid and start_timestamp between :startTime and :endTime and display = :display order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc")
    @Nullable
    List<DBMenstrualCycle> o(@NotNull String ssoid, long startTime, long endTime, int display, int sortOrder);
}
