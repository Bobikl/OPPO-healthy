package com.oplus.aiunit.vision;

import com.heytap.databaseengineservice.db.table.healtharchives.DBIndicatorStat;
import java.util.function.Function;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class nbf implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return ((DBIndicatorStat) obj).getUniformName();
    }
}
