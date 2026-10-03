package com.oplus.aiunit.vision;

import com.heytap.common.Event;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
public final /* synthetic */ class lu5 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[Event.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[Event.DNS_END.ordinal()] = 1;
        iArr[Event.CONNECTION_START.ordinal()] = 2;
        iArr[Event.DNS_START.ordinal()] = 3;
        iArr[Event.CONNECTION_ACQUIRED.ordinal()] = 4;
        iArr[Event.CONNECTION_FAILED.ordinal()] = 5;
    }
}
