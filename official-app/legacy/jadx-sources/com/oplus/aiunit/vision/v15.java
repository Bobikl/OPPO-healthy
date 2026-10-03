package com.oplus.aiunit.vision;

import com.heytap.baselib.database.ITapDatabase;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
public final /* synthetic */ class v15 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ITapDatabase.InsertType.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[ITapDatabase.InsertType.TYPE_INSERT_IGNORE_ON_CONFLICT.ordinal()] = 1;
        iArr[ITapDatabase.InsertType.TYPE_INSERT_REPLACE_ON_CONFLICT.ordinal()] = 2;
    }
}
