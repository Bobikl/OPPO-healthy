package com.oplus.aiunit.vision;

import com.heytap.httpdns.env.ApiEnv;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
public final /* synthetic */ class k70 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[ApiEnv.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[ApiEnv.DEV.ordinal()] = 1;
        iArr[ApiEnv.TEST.ordinal()] = 2;
        int[] iArr2 = new int[ApiEnv.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[ApiEnv.RELEASE.ordinal()] = 1;
    }
}
