package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthIndicatorFocus;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J0\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002H'J(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH'J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H'J \u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H'¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/or8;", "", "", "ssoid", "name", "owner", "", "Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthIndicatorFocus;", "b", "", "limitCount", TypedValues.CycleType.S_WAVE_OFFSET, "d", "", "c", "list", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface or8 {
    @Insert(onConflict = 1)
    @Nullable
    List<Long> a(@Nullable List<DBHealthIndicatorFocus> list);

    @Query("\n    SELECT * FROM DBHealthIndicatorFocus\n    WHERE ssoid = :ssoid \n    AND (:name IS NULL OR indicator_name = :name) \n    AND (:owner IS NULL OR owner = :owner) \n    AND deleted=0\n    ORDER BY data_created_timestamp DESC,modified_timestamp DESC\n    ")
    @Nullable
    List<DBHealthIndicatorFocus> b(@NotNull String ssoid, @Nullable String name, @Nullable String owner);

    @Query("select MAX(modified_timestamp) from DBHealthIndicatorFocus where ssoid = :ssoid ")
    long c(@NotNull String ssoid);

    @Query("SELECT * FROM DBHealthIndicatorFocus WHERE ssoid= :ssoid AND (updated=1 OR sync_status=0) limit :limitCount OFFSET :offset")
    @Nullable
    List<DBHealthIndicatorFocus> d(@NotNull String ssoid, int limitCount, int offset);
}
