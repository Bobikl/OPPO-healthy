package com.oplus.aiunit.vision;

import com.heytap.httpdns.env.ApiEnv;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
public final /* synthetic */ class iug {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;

    static {
        int[] iArr = new int[ApiEnv.values().length];
        $EnumSwitchMapping$0 = iArr;
        ApiEnv apiEnv = ApiEnv.TEST;
        iArr[apiEnv.ordinal()] = 1;
        ApiEnv apiEnv2 = ApiEnv.DEV;
        iArr[apiEnv2.ordinal()] = 2;
        int[] iArr2 = new int[ApiEnv.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[apiEnv.ordinal()] = 1;
        iArr2[apiEnv2.ordinal()] = 2;
        int[] iArr3 = new int[ApiEnv.values().length];
        $EnumSwitchMapping$2 = iArr3;
        iArr3[apiEnv.ordinal()] = 1;
        iArr3[apiEnv2.ordinal()] = 2;
        int[] iArr4 = new int[ApiEnv.values().length];
        $EnumSwitchMapping$3 = iArr4;
        iArr4[apiEnv.ordinal()] = 1;
    }
}
