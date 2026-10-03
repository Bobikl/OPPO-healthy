package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.wristtemperature.DBWristTemperature;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H'J8\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH'J0\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\nH'J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H'J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/x2m;", "", "", "ssoid", "", "startTime", "endTime", "", "Lcom/heytap/databaseengineservice/db/table/wristtemperature/DBWristTemperature;", MapSchema.FIELD_NAME_ENTRY, "", "limit", "sortOrder", b2n.f, b2n.g, "startOfToday", "currentTime", "i", "limitCount", "d", "f", "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface x2m {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBWristTemperature> list);

    @Update
    int b(@NotNull List<DBWristTemperature> list);

    @Query("select '' as ssoid, start_timestamp, end_timestamp, data_client, client_model, base_line, confidence, status, value, sync_status, modified_timestamp, display from DBWristTemperature where ssoid = :ssoid and sync_status = 0 and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limitCount")
    @NotNull
    List<DBWristTemperature> d(long startTime, long endTime, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBWristTemperature where ssoid = :ssoid and start_timestamp >= :startTime and end_timestamp <= :endTime order by start_timestamp desc")
    @Nullable
    List<DBWristTemperature> e(@NotNull String ssoid, long startTime, long endTime);

    @Query("delete from DBWristTemperature where ssoid = :ssoid")
    int f(@NotNull String ssoid);

    @Query("select * from DBWristTemperature where ssoid = :ssoid and start_timestamp between :startTime and :endTime  order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limit")
    @Nullable
    List<DBWristTemperature> g(@NotNull String ssoid, long startTime, long endTime, int limit, int sortOrder);

    @Query("select * from DBWristTemperature where ssoid = :ssoid and start_timestamp between :startTime and :endTime group by start_timestamp order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc")
    @Nullable
    List<DBWristTemperature> h(@NotNull String ssoid, long startTime, long endTime, int sortOrder);

    @Query("select MAX(modified_timestamp) from DBWristTemperature where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long i(@NotNull String ssoid, long startOfToday, long currentTime);
}
