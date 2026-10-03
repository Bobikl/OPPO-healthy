package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.bloodsugar.DBBloodSugar;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\bg\u0018\u00002\u00020\u0001J8\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H'JF\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\nH'J>\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\nH'J0\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J*\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0007H'J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H'J6\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000bH'J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J\u0016\u0010\u001f\u001a\u00020\u00072\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/us1;", "", "", "ssoid", "", "startTime", "endTime", "", "sortOrder", "limit", "", "Lcom/heytap/databaseengineservice/db/table/bloodsugar/DBBloodSugar;", b2n.g, "deviceCategoryList", LogFieldKey.MESSAGE_KEY, LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_ENTRY, "c", "dataClient", "display", MapSchema.FIELD_NAME_KEY, "startOfToday", "currentTime", "i", "limitCount", "d", "f", "bloodSugar", "n", "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface us1 {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBBloodSugar> list);

    @Update
    int b(@NotNull List<DBBloodSugar> list);

    @Query("select MAX(modified_timestamp) from DBBloodSugar where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select '' as ssoid, data_client, client_model, data_created_timestamp, type, value, trend, display, sync_status, modified_timestamp from DBBloodSugar where ssoid = :ssoid and sync_status = 0 and data_created_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    @NotNull
    List<DBBloodSugar> d(long startTime, long endTime, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBBloodSugar where ssoid = :ssoid and data_created_timestamp >= :startTime and data_created_timestamp <= :endTime and display = 1 order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc")
    @Nullable
    List<DBBloodSugar> e(@NotNull String ssoid, long startTime, long endTime, int sortOrder);

    @Query("delete from DBBloodSugar where ssoid = :ssoid")
    int f(@NotNull String ssoid);

    @Query("select * from DBBloodSugar where ssoid = :ssoid and data_created_timestamp >= :startTime and data_created_timestamp <= :endTime and display = 1 order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limit")
    @Nullable
    List<DBBloodSugar> h(@NotNull String ssoid, long startTime, long endTime, int sortOrder, int limit);

    @Query("select MAX(modified_timestamp) from DBBloodSugar where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long i(@NotNull String ssoid, long startOfToday, long currentTime);

    @Query("select * from DBBloodSugar where ssoid = :ssoid and data_created_timestamp = :startTime and data_client = :dataClient and display = :display order by data_created_timestamp desc")
    @Nullable
    DBBloodSugar k(@NotNull String ssoid, long startTime, @NotNull String dataClient, int display);

    @Query("select * from DBBloodSugar where ssoid = :ssoid and data_created_timestamp >= :startTime and data_created_timestamp <= :endTime and display = 1  and client_model in (:deviceCategoryList) order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc")
    @Nullable
    List<DBBloodSugar> l(@NotNull String ssoid, long startTime, long endTime, int sortOrder, @NotNull List<String> deviceCategoryList);

    @Query("select * from DBBloodSugar where ssoid = :ssoid and data_created_timestamp >= :startTime and data_created_timestamp <= :endTime and display = 1 and client_model in (:deviceCategoryList) order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limit")
    @Nullable
    List<DBBloodSugar> m(@NotNull String ssoid, long startTime, long endTime, int sortOrder, int limit, @NotNull List<String> deviceCategoryList);

    @Insert(onConflict = 1)
    long n(@NotNull DBBloodSugar bloodSugar);
}
