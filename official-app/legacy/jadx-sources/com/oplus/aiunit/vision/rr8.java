package com.oplus.aiunit.vision;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.room.Update;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthIndicatorStat;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J[\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\f\u0010\rJ(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H'J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u0013H'J \u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH'J\u0016\u0010\u0018\u001a\u00020\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/rr8;", "", "", "ssoid", "name", "owner", "", "tag", "state", "delete", "", "Lcom/heytap/databaseengineservice/db/table/healtharchives/DBHealthIndicatorStat;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/util/List;", "limitCount", TypedValues.CycleType.S_WAVE_OFFSET, "d", "", "c", "Landroidx/sqlite/db/SupportSQLiteQuery;", SearchIntents.EXTRA_QUERY, MapSchema.FIELD_NAME_ENTRY, "list", "f", "b", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface rr8 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ List a(rr8 rr8Var, String str, String str2, String str3, Integer num, Integer num2, Integer num3, int i, Object obj) {
            if (obj == null) {
                return rr8Var.a(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) == 0 ? num3 : null);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryStatByCondition");
        }
    }

    @Query("\n        SELECT * FROM DBHealthIndicatorStat\n    WHERE ssoid = :ssoid \n    AND (:name IS NULL OR indicator_name = :name) \n    AND (:owner IS NULL OR owner = :owner) \n    AND (:state IS NULL OR state = :state) \n    AND (:tag IS NULL OR tag = :tag) \n    AND (:delete IS NULL OR deleted = :delete)\n    ORDER BY tag DESC, state DESC, data_update_time DESC, modified_timestamp DESC")
    @Nullable
    List<DBHealthIndicatorStat> a(@NotNull String ssoid, @Nullable String name, @Nullable String owner, @Nullable Integer tag, @Nullable Integer state, @Nullable Integer delete);

    @Update
    int b(@NotNull List<DBHealthIndicatorStat> list);

    @Query("select MAX(modified_timestamp) from DBHealthIndicatorStat where ssoid = :ssoid ")
    long c(@NotNull String ssoid);

    @Query("SELECT * FROM DBHealthIndicatorStat WHERE ssoid= :ssoid AND (updated=1 OR sync_status=0) limit :limitCount OFFSET :offset")
    @Nullable
    List<DBHealthIndicatorStat> d(@NotNull String ssoid, int limitCount, int offset);

    @RawQuery
    @Nullable
    List<DBHealthIndicatorStat> e(@NotNull SupportSQLiteQuery query);

    @Insert(onConflict = 1)
    @Nullable
    List<Long> f(@Nullable List<DBHealthIndicatorStat> list);
}
