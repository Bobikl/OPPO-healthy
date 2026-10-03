package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.databaseengineservice.db.table.sunshine.DBSunshineDetail;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J0\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'J8\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H'J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u000f\u001a\u00020\u000eH'J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J \u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H'J6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tH'J\u0016\u0010\u001a\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tH'¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/s3j;", "", "", "ssoid", "", "startTimestamp", "endTimestamp", "", "sortOrder", "", "Lcom/heytap/databaseengineservice/db/table/sunshine/DBSunshineDetail;", MapSchema.FIELD_NAME_ENTRY, "count", b2n.g, "Landroidx/sqlite/db/SupportSQLiteQuery;", SearchIntents.EXTRA_QUERY, "", "d", "c", "startOfToday", "currentTime", "i", "limitCount", "f", "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface s3j {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBSunshineDetail> list);

    @Update
    int b(@NotNull List<DBSunshineDetail> list);

    @Query("select MAX(modified_timestamp) from DBSunshineDetail where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @RawQuery
    @NotNull
    List<DBSunshineDetail> d(@NotNull SupportSQLiteQuery query);

    @Query("select * from DBSunshineDetail where ssoid = :ssoid and data_created_timestamp between :startTimestamp and :endTimestamp order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc")
    @Nullable
    List<DBSunshineDetail> e(@NotNull String ssoid, long startTimestamp, long endTimestamp, int sortOrder);

    @Query("select '' as ssoid, data_client, client_model, data_created_timestamp, sun_bathing, light_intensity, vitamin_d_ingestion, display, sync_status, modified_timestamp from DBSunshineDetail where ssoid = :ssoid and sync_status = 0 and vitamin_d_ingestion = 0 and data_created_timestamp between :startTimestamp and :endTimestamp order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :limitCount")
    @NotNull
    List<DBSunshineDetail> f(long startTimestamp, long endTimestamp, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBSunshineDetail where ssoid = :ssoid and data_created_timestamp between :startTimestamp and :endTimestamp order by case when :sortOrder = 1 then data_created_timestamp end desc, case when :sortOrder = 0 then data_created_timestamp end asc limit :count")
    @Nullable
    List<DBSunshineDetail> h(@NotNull String ssoid, long startTimestamp, long endTimestamp, int sortOrder, int count);

    @Query("select MAX(modified_timestamp) from DBSunshineDetail where ssoid = :ssoid and modified_timestamp between :startOfToday and :currentTime")
    long i(@NotNull String ssoid, long startOfToday, long currentTime);
}
