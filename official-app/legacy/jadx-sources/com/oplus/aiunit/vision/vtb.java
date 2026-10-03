package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.menstrualcycle.DBMenstrualCycleSymptom;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\bg\u0018\u00002\u00020\u0001J@\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H'J8\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H'J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H'J6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J(\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H'J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH'J\u0016\u0010\u0017\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH'¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/vtb;", "", "", "ssoid", "", "startTime", "endTime", "", "display", "sortOrder", "limit", "", "Lcom/heytap/databaseengineservice/db/table/menstrualcycle/DBMenstrualCycleSymptom;", MapSchema.FIELD_NAME_KEY, "f", "c", "dateList", "j", "limitCount", "d", MapSchema.FIELD_NAME_ENTRY, "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface vtb {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBMenstrualCycleSymptom> list);

    @Update
    int b(@NotNull List<DBMenstrualCycleSymptom> list);

    @Query("select MAX(modified_timestamp) from DBMenstrualCycleSymptom where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select '' as ssoid, data_created_timestamp, data_client, client_model, type, value, update_timestamp, sync_status, modified_timestamp, display from DBMenstrualCycleSymptom where ssoid = :ssoid and sync_status = 0 and data_created_timestamp between :startTime and :endTime and value is not null order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    @NotNull
    List<DBMenstrualCycleSymptom> d(long startTime, long endTime, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBMenstrualCycleSymptom where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime order by data_created_timestamp, type desc")
    @Nullable
    List<DBMenstrualCycleSymptom> e(@NotNull String ssoid, long startTime, long endTime);

    @Query("select * from DBMenstrualCycleSymptom where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc")
    @Nullable
    List<DBMenstrualCycleSymptom> f(@NotNull String ssoid, long startTime, long endTime, int display, int sortOrder);

    @Query("select * from DBMenstrualCycleSymptom where ssoid = :ssoid and data_created_timestamp in (:dateList) and sync_status = 0")
    @NotNull
    List<DBMenstrualCycleSymptom> j(@NotNull List<Long> dateList, @NotNull String ssoid);

    @Query("select * from DBMenstrualCycleSymptom where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limit")
    @Nullable
    List<DBMenstrualCycleSymptom> k(@NotNull String ssoid, long startTime, long endTime, int display, int sortOrder, int limit);
}
