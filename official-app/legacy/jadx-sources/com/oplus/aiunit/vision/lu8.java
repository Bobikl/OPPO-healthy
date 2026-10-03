package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001Js\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\tH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J \u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH'J'\u0010\u0016\u001a\u00020\t2\u0016\u0010\u0015\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000e0\u0014\"\u0004\u0018\u00010\u000eH'¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/lu8;", "", "", "ssoid", "", "planId", "owner", "docId", "category", "", "state", "ignoreState", "delete", "", "Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthReviewPlan;", "d", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/util/List;", "c", "list", "b", "", "plan", "a", "([Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthReviewPlan;)I", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface lu8 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ List a(lu8 lu8Var, String str, Long l2, String str2, String str3, String str4, Integer num, Integer num2, Integer num3, int i, Object obj) {
            if (obj == null) {
                return lu8Var.d(str, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) == 0 ? num3 : null);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryPlanByCondition");
        }
    }

    @Update
    int a(@NotNull DBHealthReviewPlan... plan);

    @Insert(onConflict = 1)
    @Nullable
    List<Long> b(@Nullable List<DBHealthReviewPlan> list);

    @Query("select MAX(modified_timestamp) from DBHealthReviewPlan where ssoid = :ssoid ")
    long c(@NotNull String ssoid);

    @Query("\n        SELECT * FROM DBHealthReviewPlan\n    WHERE ssoid = :ssoid \n    AND (:planId IS NULL OR plan_id = :planId) \n    AND (:owner IS NULL OR owner = :owner) \n    AND (:docId IS NULL OR doc_id = :docId) \n    AND (:category IS NULL OR category = :category) \n    AND (:state IS NULL OR state = :state) \n    AND (:ignoreState IS NULL OR ignore_state = :ignoreState) \n    AND (:delete IS NULL OR deleted = :delete)\n    ORDER BY review_time  ASC, modified_timestamp DESC")
    @Nullable
    List<DBHealthReviewPlan> d(@NotNull String ssoid, @Nullable Long planId, @Nullable String owner, @Nullable String docId, @Nullable String category, @Nullable Integer state, @Nullable Integer ignoreState, @Nullable Integer delete);
}
