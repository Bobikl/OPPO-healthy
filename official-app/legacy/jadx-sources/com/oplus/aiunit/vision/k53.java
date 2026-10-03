package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.databaseengineservice.db.table.cervicalspine.DBCervicalSpine;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J4\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'J<\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H'J(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H'J\u001a\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000fH'J\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J$\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\t2\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH'J\u001a\u0010\u0017\u001a\u00020\u00072\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\tH'¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/k53;", "", "", "ssoid", "", "startTime", "endTime", "", "sortOrder", "", "Lcom/heytap/databaseengineservice/db/table/cervicalspine/DBCervicalSpine;", MapSchema.FIELD_NAME_ENTRY, "count", b2n.g, LogFieldKey.MESSAGE_KEY, "Landroidx/sqlite/db/SupportSQLiteQuery;", SearchIntents.EXTRA_QUERY, LogFieldKey.LEVEL_KEY, "c", "limitCount", "d", "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface k53 {
    @Insert(onConflict = 1)
    @Nullable
    List<Long> a(@Nullable List<DBCervicalSpine> list);

    @Update
    int b(@Nullable List<DBCervicalSpine> list);

    @Query("select MAX(modified_timestamp) from DBCervicalSpine where ssoid = :ssoid")
    long c(@Nullable String ssoid);

    @Query("select '' as ssoid, start_timestamp, end_timestamp, data_client, client_model, low_head_seconds, wear_seconds, good_seconds, mild_seconds, heavy_seconds, low_head_percent, sync_status, modified_timestamp from DBCervicalSpine where ssoid = :ssoid and sync_status = 0  and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limitCount")
    @NotNull
    List<DBCervicalSpine> d(long startTime, long endTime, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBCervicalSpine where ssoid = :ssoid and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc")
    @Nullable
    List<DBCervicalSpine> e(@Nullable String ssoid, long startTime, long endTime, int sortOrder);

    @Query("select * from DBCervicalSpine where ssoid = :ssoid and start_timestamp between :startTime and :endTime order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :count")
    @Nullable
    List<DBCervicalSpine> h(@Nullable String ssoid, long startTime, long endTime, int sortOrder, int count);

    @RawQuery
    @Nullable
    List<DBCervicalSpine> l(@NotNull SupportSQLiteQuery query);

    @Query("select start_timestamp from DBCervicalSpine where ssoid = :ssoid and start_timestamp between :startTime and :endTime and (good_seconds + mild_seconds + heavy_seconds) > 0 group by strftime('%Y-%m-%d', datetime(start_timestamp/1000+0800*36, 'unixepoch'))")
    @NotNull
    List<Long> m(@Nullable String ssoid, long startTime, long endTime);
}
