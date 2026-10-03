package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.DBSedentary;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J0\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'J8\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H'J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H'J6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tH'J\u0016\u0010\u0015\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\tH'¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/hqg;", "", "", "ssoid", "", "startTime", "endTime", "", "sortOrder", "", "Lcom/heytap/databaseengineservice/db/table/DBSedentary;", MapSchema.FIELD_NAME_ENTRY, "count", b2n.g, "startOfToday", "currentTime", b2n.f, "limitCount", "d", "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface hqg {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBSedentary> list);

    @Update
    int b(@NotNull List<DBSedentary> list);

    @Query("select '' as ssoid, start_timestamp, end_timestamp, data_client, value, sync_status, modified_timestamp from DBSedentary where ssoid = :ssoid and sync_status = 0 and value > 0 and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limitCount")
    @NotNull
    List<DBSedentary> d(long startTime, long endTime, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBSedentary where ssoid = :ssoid and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc")
    @Nullable
    List<DBSedentary> e(@NotNull String ssoid, long startTime, long endTime, int sortOrder);

    @Query("select MAX(modified_timestamp) from DBSedentary where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(@NotNull String ssoid, long startOfToday, long currentTime);

    @Query("select * from DBSedentary where ssoid = :ssoid and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :count")
    @Nullable
    List<DBSedentary> h(@NotNull String ssoid, long startTime, long endTime, int sortOrder, int count);
}
