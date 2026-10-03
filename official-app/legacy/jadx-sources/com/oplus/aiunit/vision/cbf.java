package com.oplus.aiunit.vision;

import com.heytap.databaseengineservice.db.table.healtharchives.DBIndicatorStat;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class cbf implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((DBIndicatorStat) obj).isUniform();
    }
}
