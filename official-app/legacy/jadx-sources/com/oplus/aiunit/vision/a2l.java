package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.sunshine.DBVitamin;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'J6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H'J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH'J\u0016\u0010\u0013\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\tH'¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/a2l;", "", "", "ssoid", "", "startTimestamp", "endTimestamp", "", "sortOrder", "", "Lcom/heytap/databaseengineservice/db/table/sunshine/DBVitamin;", MapSchema.FIELD_NAME_ENTRY, "count", b2n.g, "c", "limitCount", "d", "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface a2l {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBVitamin> list);

    @Update
    int b(@NotNull List<DBVitamin> list);

    @Query("select MAX(modified_timestamp) from DBVitamin where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select '' as ssoid, data_client, client_model, vitamin_name_code, dosage, source, data_created_timestamp, display, sync_status, modified_timestamp from DBVitamin where ssoid = :ssoid and sync_status = 0 and data_created_timestamp between :startTimestamp and :endTimestamp order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    @NotNull
    List<DBVitamin> d(long startTimestamp, long endTimestamp, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBVitamin where ssoid = :ssoid and data_created_timestamp between :startTimestamp and :endTimestamp order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc")
    @NotNull
    List<DBVitamin> e(@NotNull String ssoid, long startTimestamp, long endTimestamp, int sortOrder);

    @Query("select * from DBVitamin where ssoid = :ssoid and data_created_timestamp between :startTimestamp and :endTimestamp order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :count")
    @NotNull
    List<DBVitamin> h(@NotNull String ssoid, long startTimestamp, long endTimestamp, int sortOrder, int count);
}
