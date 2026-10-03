package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthDiseaseRisk;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'J(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH'J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H'J \u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00052\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H'¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/sq8;", "", "", "ssoid", "diseaseType", "", "Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthDiseaseRisk;", "a", "", "limitCount", TypedValues.CycleType.S_WAVE_OFFSET, "b", "", "c", "list", "d", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface sq8 {
    @Query("\n    SELECT * FROM DBHealthDiseaseRisk\n    WHERE ssoid = :ssoid \n    AND (:diseaseType IS NULL OR disease_type = :diseaseType) \n    AND deleted=0\n    ORDER BY data_created_timestamp DESC\n    ")
    @Nullable
    List<DBHealthDiseaseRisk> a(@NotNull String ssoid, @Nullable String diseaseType);

    @Query("SELECT * FROM DBHealthDiseaseRisk WHERE ssoid= :ssoid AND (updated=1 OR sync_status=0) limit :limitCount OFFSET :offset")
    @Nullable
    List<DBHealthDiseaseRisk> b(@NotNull String ssoid, int limitCount, int offset);

    @Query("select MAX(modified_timestamp) from DBHealthDiseaseRisk where ssoid = :ssoid ")
    long c(@NotNull String ssoid);

    @Insert(onConflict = 1)
    @Nullable
    List<Long> d(@Nullable List<DBHealthDiseaseRisk> list);
}
