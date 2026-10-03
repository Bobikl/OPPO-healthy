package com.oplus.aiunit.vision;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;
import com.google.android.gms.actions.SearchIntents;
import com.heytap.databaseengineservice.db.table.datacollection.DataCollection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Dao
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H'J(\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H'J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH'J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H'¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/ps4;", "", "", "date", DataCollection.FIELD, "business", "", "ssoid", "clientId", "c", "", "startTimestamp", "endTimestamp", "b", "Landroidx/sqlite/db/SupportSQLiteQuery;", SearchIntents.EXTRA_QUERY, "", "Lcom/heytap/databaseengineservice/db/table/datacollection/DBDataCollection;", "i", "list", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public interface ps4 {
    @Insert(onConflict = 1)
    @NotNull
    List<Long> a(@NotNull List<DataCollection> list);

    @Query("select content from DBDataCollection where ssoid = :ssoid and start_timestamp between :startTimestamp and :endTimestamp and field = :field order by end_timestamp desc limit 1")
    @NotNull
    String b(long startTimestamp, long endTimestamp, int field, @NotNull String ssoid);

    @Query("select count from DBDataCollection where ssoid = :ssoid and date = :date and field = :field and client_id = :clientId and business = :business")
    int c(int date, int field, int business, @NotNull String ssoid, @NotNull String clientId);

    @RawQuery
    @Nullable
    List<DataCollection> i(@NotNull SupportSQLiteQuery query);
}
