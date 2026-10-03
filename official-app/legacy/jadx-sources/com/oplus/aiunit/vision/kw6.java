package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.databaseengineservice.db.table.exerciseload.DBExerciseLoad;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H'J.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H'J6\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H'J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0011\u001a\u00020\u0010H'J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0011\u001a\u00020\u0010H'J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/kw6;", "", "", "ssoid", "", "startDay", "endDay", "", "Lcom/heytap/databaseengineservice/db/table/exerciseload/DBExerciseLoad;", "b", "sortOrder", "d", "limit", "f", "", "c", "Landroidx/sqlite/db/SupportSQLiteQuery;", SearchIntents.EXTRA_QUERY, "i", b2n.f, MapSchema.FIELD_NAME_ENTRY, "list", "a", b2n.g, "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface kw6 {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DBExerciseLoad> list);

    @Query("select * from DBExerciseLoad where ssoid = :ssoid and date between :startDay and :endDay order by date desc")
    @NotNull
    List<DBExerciseLoad> b(@NotNull String ssoid, int startDay, int endDay);

    @Query("select MAX(modified_timestamp) from DBExerciseLoad where ssoid = :ssoid")
    long c(@NotNull String ssoid);

    @Query("select * from DBExerciseLoad where ssoid = :ssoid and date between :startDay and :endDay order by case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc")
    @NotNull
    List<DBExerciseLoad> d(@NotNull String ssoid, int startDay, int endDay, int sortOrder);

    @Query("select * from DBExerciseLoad where ssoid = :ssoid order by date desc limit 1")
    @Nullable
    DBExerciseLoad e(@NotNull String ssoid);

    @Query("select * from DBExerciseLoad where ssoid = :ssoid and date between :startDay and :endDay order by  case when :sortOrder = 1 then date end desc, case when :sortOrder = 0 then date end asc limit :limit")
    @NotNull
    List<DBExerciseLoad> f(@NotNull String ssoid, int startDay, int endDay, int sortOrder, int limit);

    @RawQuery
    @NotNull
    List<DBExerciseLoad> g(@NotNull SupportSQLiteQuery query);

    @Insert(onConflict = 5)
    @NotNull
    List<Long> h(@NotNull List<DBExerciseLoad> list);

    @RawQuery
    @NotNull
    List<DBExerciseLoad> i(@NotNull SupportSQLiteQuery query);
}
