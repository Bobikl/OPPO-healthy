package com.oplus.aiunit.vision;

import com.heytap.databaseengineservice.db.table.healtharchives.DBIndicatorStat;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class rbf implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((DBIndicatorStat) obj).getDataCreatedTimestamp();
    }
}
