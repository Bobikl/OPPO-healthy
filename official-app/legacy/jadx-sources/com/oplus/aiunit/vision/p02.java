package com.oplus.aiunit.vision;

import com.heytap.databaseengineservice.db.table.weight.DBWeightBodyFat;
import java.util.function.ToLongFunction;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class p02 implements ToLongFunction {
    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        return ((DBWeightBodyFat) obj).getModifiedTime();
    }
}
