package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.thirdsportimport.DBThirdSportImportRecord;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H'J.\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH'J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'J\u0016\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H'¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/yvj;", "", "", "ssoid", "", "Lcom/heytap/databaseengineservice/db/table/thirdsportimport/DBThirdSportImportRecord;", MapSchema.FIELD_NAME_ENTRY, "", "startTime", "endTime", "f", "", "syncStatus", "limit", TypedValues.CycleType.S_WAVE_OFFSET, b2n.f, "list", "a", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface yvj {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBThirdSportImportRecord> list);

    @Update
    int b(@NotNull List<DBThirdSportImportRecord> list);

    @Query("SELECT * FROM DBThirdSportImportRecord WHERE ssoid = :ssoid ORDER BY operation_time DESC")
    @NotNull
    List<DBThirdSportImportRecord> e(@NotNull String ssoid);

    @Query("SELECT * FROM DBThirdSportImportRecord WHERE ssoid = :ssoid AND operation_time BETWEEN :startTime AND :endTime ORDER BY operation_time DESC")
    @NotNull
    List<DBThirdSportImportRecord> f(@NotNull String ssoid, long startTime, long endTime);

    @Query("SELECT * FROM DBThirdSportImportRecord WHERE ssoid = :ssoid AND sync_status = :syncStatus ORDER BY operation_time ASC LIMIT :limit OFFSET :offset")
    @NotNull
    List<DBThirdSportImportRecord> g(@NotNull String ssoid, int syncStatus, int limit, int offset);
}
