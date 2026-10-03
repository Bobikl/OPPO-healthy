package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;

/* JADX INFO: loaded from: classes13.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$13 implements SQLiteEventStore.Function {
    private final long arg$1;

    private SQLiteEventStore$$Lambda$13(long j2) {
        this.arg$1 = j2;
    }

    public static SQLiteEventStore.Function lambdaFactory$(long j2) {
        return new SQLiteEventStore$$Lambda$13(j2);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public Object apply(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete(DbParams.TABLE_EVENTS, "timestamp_ms < ?", new String[]{String.valueOf(this.arg$1)}));
    }
}
