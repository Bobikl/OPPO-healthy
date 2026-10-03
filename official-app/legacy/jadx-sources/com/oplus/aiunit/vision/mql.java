package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.weight.DBWeightGoal;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H'J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH'J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH'J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH'J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H'J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'J\u0016\u0010\u0017\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'J\u0016\u0010\u0018\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/mql;", "", "", "ssoid", "", "Lcom/heytap/databaseengineservice/db/table/weight/DBWeightGoal;", MapSchema.FIELD_NAME_ENTRY, "userTagId", b2n.g, "", "createdAt", "j", "startTime", "endTime", "f", b2n.f, "c", "", "limitCount", "sortOrder", "d", "list", "a", "b", "i", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface mql {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBWeightGoal> list);

    @Update
    int b(@NotNull List<DBWeightGoal> list);

    @Query("select MAX(modified_timestamp) from DBWeightGoal where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select '' as ssoid, user_tag_id, effective_date, initial_weight_g, target_weight_g, expected_achieve_date, created_at, modified_timestamp, goal_direction, sync_status, latest_weight_g, latest_weight_timestamp, state, actual_end_date from DBWeightGoal where ssoid = :ssoid and sync_status = 0 and created_at between :startTime and :endTime order by case when :sortOrder = 1 then created_at end desc, case when :sortOrder = 0 then created_at end asc limit :limitCount")
    @NotNull
    List<DBWeightGoal> d(long startTime, long endTime, int limitCount, int sortOrder, @NotNull String ssoid);

    @Query("SELECT * FROM DBWeightGoal WHERE ssoid = :ssoid ORDER BY created_at DESC")
    @NotNull
    List<DBWeightGoal> e(@NotNull String ssoid);

    @Query("SELECT * FROM DBWeightGoal WHERE ssoid = :ssoid AND created_at BETWEEN :startTime AND :endTime ORDER BY created_at DESC")
    @NotNull
    List<DBWeightGoal> f(@NotNull String ssoid, long startTime, long endTime);

    @Query("SELECT * FROM DBWeightGoal WHERE ssoid = :ssoid AND user_tag_id = :userTagId AND created_at BETWEEN :startTime AND :endTime ORDER BY created_at DESC")
    @NotNull
    List<DBWeightGoal> g(@NotNull String ssoid, @NotNull String userTagId, long startTime, long endTime);

    @Query("SELECT * FROM DBWeightGoal WHERE ssoid = :ssoid AND user_tag_id = :userTagId ORDER BY created_at DESC")
    @NotNull
    List<DBWeightGoal> h(@NotNull String ssoid, @NotNull String userTagId);

    @Delete
    int i(@NotNull List<DBWeightGoal> list);

    @Query("SELECT * FROM DBWeightGoal WHERE ssoid = :ssoid AND created_at = :createdAt")
    @Nullable
    DBWeightGoal j(@NotNull String ssoid, long createdAt);
}
