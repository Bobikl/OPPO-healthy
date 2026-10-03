package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.snore.DBSnoreOsaModel;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\bg\u0018\u00002\u00020\u0001J(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H'J8\u0010\r\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH'J@\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH'J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H'J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/ryh;", "", "", "ssoid", "", "startTime", "endTime", "", "Lcom/heytap/databaseengineservice/db/table/snore/DBSnoreOsaModel;", MapSchema.FIELD_NAME_ENTRY, "", "display", "sortOrder", "j", "limit", "c", "startOfToday", "currentTime", b2n.f, "limitCount", "d", "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface ryh {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBSnoreOsaModel> list);

    @Update
    int b(@NotNull List<DBSnoreOsaModel> list);

    @Query("select * from DBSnoreOsaModel where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display order by  case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limit")
    @Nullable
    List<DBSnoreOsaModel> c(@NotNull String ssoid, long startTime, long endTime, int display, int sortOrder, int limit);

    @Query("select '' as ssoid, data_client, data_created_timestamp, record_start_timestamp, record_end_timestamp, total_signal_len, cur_frame_snore_num, last_frame_snore_num, features, sync_status, modified_timestamp, display, updated from DBSnoreOsaModel where ssoid = :ssoid and (sync_status = 0 or updated = 1) and data_created_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    @NotNull
    List<DBSnoreOsaModel> d(long startTime, long endTime, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBSnoreOsaModel where ssoid = :ssoid and data_created_timestamp >= :startTime and :endTime order by data_created_timestamp desc")
    @Nullable
    List<DBSnoreOsaModel> e(@NotNull String ssoid, long startTime, long endTime);

    @Query("select MAX(modified_timestamp) from DBSnoreOsaModel where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long g(@NotNull String ssoid, long startOfToday, long currentTime);

    @Query("select * from DBSnoreOsaModel where ssoid = :ssoid and data_created_timestamp between :startTime and :endTime and display = :display order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc")
    @Nullable
    List<DBSnoreOsaModel> j(@NotNull String ssoid, long startTime, long endTime, int display, int sortOrder);
}
