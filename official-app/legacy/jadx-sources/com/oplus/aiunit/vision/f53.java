package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.cervicalspine.DBCervicalSpineAction;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J<\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H'J4\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0007H'J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'J$\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\n2\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nH'J\u001a\u0010\u0013\u001a\u00020\u00072\u0010\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nH'¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/f53;", "", "", "ssoid", "", "startTime", "endTime", "", "limit", "sortOrder", "", "Lcom/heytap/databaseengineservice/db/table/cervicalspine/DBCervicalSpineAction;", b2n.f, b2n.g, "c", "limitCount", "d", "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface f53 {
    @Insert(onConflict = 1)
    @Nullable
    List<Long> a(@Nullable List<DBCervicalSpineAction> list);

    @Update
    int b(@Nullable List<DBCervicalSpineAction> list);

    @Query("select MAX(modified_timestamp) from DBCervicalSpineAction where ssoid = :ssoid")
    long c(@Nullable String ssoid);

    @Query("select '' as ssoid, start_timestamp, data_client, client_model, detect_type_data, sync_status, modified_timestamp from DBCervicalSpineAction where ssoid = :ssoid and sync_status = 0 and start_timestamp between :startTime and :endTime and detect_type_data is not null order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limitCount")
    @NotNull
    List<DBCervicalSpineAction> d(long startTime, long endTime, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("select * from DBCervicalSpineAction where ssoid = :ssoid and start_timestamp between :startTime and :endTime  order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc limit :limit")
    @Nullable
    List<DBCervicalSpineAction> g(@Nullable String ssoid, long startTime, long endTime, int limit, int sortOrder);

    @Query("select * from DBCervicalSpineAction where ssoid = :ssoid and start_timestamp between :startTime and :endTime group by start_timestamp order by case when :sortOrder = 1 then start_timestamp end desc, case when :sortOrder = 0 then start_timestamp end asc")
    @Nullable
    List<DBCervicalSpineAction> h(@Nullable String ssoid, long startTime, long endTime, int sortOrder);
}
