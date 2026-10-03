package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.healtharchives.DBIndicatorStat;
import com.heytap.store.business.rn.service.RnConstant;
import com.oplus.smartenginehelper.entity.TextEntity;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\bg\u0018\u00002\u00020\u0001Js\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0083\u0001\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H'J \u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\r2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH'J\u0016\u0010\u0019\u001a\u00020\u00072\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH'¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/kr8;", "", "", "ssoid", "docId", "bodySystem", "type", "", "valueState", "", "isUniform", "owner", RnConstant.KEY_PAGE, "", "Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthIndicatorDetail;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;)Ljava/util/List;", "", "start", TextEntity.ELLIPSIZE_END, "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;JJ)Ljava/util/List;", "c", "list", "b", MapSchema.FIELD_NAME_ENTRY, "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface kr8 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ List a(kr8 kr8Var, String str, String str2, String str3, String str4, Integer num, Boolean bool, String str5, Integer num2, int i, Object obj) {
            if (obj == null) {
                return kr8Var.a(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : str5, (i & 128) == 0 ? num2 : null);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryIndicatorByCondition");
        }
    }

    @Query("\n        SELECT * FROM DBHealthIndicatorDetail \n        WHERE ssoid = :ssoid \n        AND (:docId IS NULL OR doc_id = :docId)\n        AND (:bodySystem IS NULL OR body_system = :bodySystem) \n        AND (:valueState IS NULL OR value_state = :valueState) \n        AND (:type IS NULL OR type = :type) \n        AND (:owner IS NULL OR owner = :owner) \n        AND (:page IS NULL OR file_index = :page) \n        AND (:isUniform IS NULL OR is_uniform = :isUniform) \n        AND deleted = 0 \n        ORDER BY sort ASC\n    ")
    @Nullable
    List<DBIndicatorStat> a(@NotNull String ssoid, @Nullable String docId, @Nullable String bodySystem, @Nullable String type, @Nullable Integer valueState, @Nullable Boolean isUniform, @Nullable String owner, @Nullable Integer page);

    @Insert(onConflict = 1)
    @Nullable
    List<Long> b(@Nullable List<DBIndicatorStat> list);

    @Query("select MAX(modified_timestamp) from DBHealthIndicatorDetail where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("\n        SELECT * FROM DBHealthIndicatorDetail \n        WHERE ssoid = :ssoid \n        AND (:docId IS NULL OR doc_id = :docId)\n        AND (:bodySystem IS NULL OR body_system = :bodySystem) \n        AND (:valueState IS NULL OR value_state = :valueState) \n        AND (:type IS NULL OR type = :type) \n        AND (:owner IS NULL OR owner = :owner) \n        AND (:page IS NULL OR file_index = :page) \n        AND (:isUniform IS NULL OR is_uniform = :isUniform) \n        AND data_created_timestamp BETWEEN :start AND :end\n        AND deleted = 0 \n        ORDER BY sort ASC\n    ")
    @Nullable
    List<DBIndicatorStat> d(@NotNull String ssoid, @Nullable String docId, @Nullable String bodySystem, @Nullable String type, @Nullable Integer valueState, @Nullable Boolean isUniform, @Nullable String owner, @Nullable Integer page, long start, long end);

    @Update
    int e(@NotNull List<DBIndicatorStat> list);
}
