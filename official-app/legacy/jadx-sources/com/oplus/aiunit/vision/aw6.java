package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.exerciseload.DBExerciseIntensity;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J*\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H'J\"\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H'J6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H'J>\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H'J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH'J\u0016\u0010\u0018\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH'¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/aw6;", "", "", "ssoid", "", "startTime", "dataClient", "", "display", "Lcom/heytap/databaseengineservice/db/table/exerciseload/DBExerciseIntensity;", MapSchema.FIELD_NAME_KEY, b2n.g, "endTime", "sortOrder", "", b2n.f, "limit", MapSchema.FIELD_NAME_ENTRY, "c", "limitCount", "d", "f", "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface aw6 {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBExerciseIntensity> list);

    @Update
    int b(@NotNull List<DBExerciseIntensity> list);

    @Query("select MAX(modified_timestamp) from DBExerciseIntensity where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select '' as ssoid, data_client, client_model, start_timestamp, sport_mode, duration, value, raw_exercise_intensity, algo_exercise_load, algo_result, flash_id, modify_source, update_timestamp, sync_to_device, display, sync_status, modified_timestamp from DBExerciseIntensity where ssoid = :ssoid and sync_status = 0 and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then update_timestamp end desc, case when :sortOrder = 0 then update_timestamp end asc limit :limitCount")
    @NotNull
    List<DBExerciseIntensity> d(long startTime, long endTime, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBExerciseIntensity where ssoid = :ssoid and data_client = :dataClient and display != 2 and start_timestamp between :startTime and :endTime order by  case when :sortOrder = 1 then update_timestamp end desc, case when :sortOrder = 0 then update_timestamp end asc limit :limit")
    @NotNull
    List<DBExerciseIntensity> e(@NotNull String ssoid, long startTime, long endTime, int sortOrder, int limit, @NotNull String dataClient);

    @Query("select * from DBExerciseIntensity where ssoid = :ssoid and start_timestamp between :startTime and :endTime and display != 2 order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limitCount")
    @NotNull
    List<DBExerciseIntensity> f(long startTime, long endTime, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBExerciseIntensity where ssoid = :ssoid and data_client = :dataClient and display != 2 and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then update_timestamp end desc, case when :sortOrder = 0 then update_timestamp end asc")
    @NotNull
    List<DBExerciseIntensity> g(@NotNull String ssoid, long startTime, long endTime, int sortOrder, @NotNull String dataClient);

    @Query("select * from DBExerciseIntensity where ssoid = :ssoid and start_timestamp = :startTime and data_client = :dataClient order by start_timestamp desc")
    @Nullable
    DBExerciseIntensity h(@NotNull String ssoid, long startTime, @NotNull String dataClient);

    @Query("select * from DBExerciseIntensity where ssoid = :ssoid and start_timestamp = :startTime and data_client = :dataClient and display = :display order by start_timestamp desc")
    @Nullable
    DBExerciseIntensity k(@NotNull String ssoid, long startTime, @NotNull String dataClient, int display);
}
