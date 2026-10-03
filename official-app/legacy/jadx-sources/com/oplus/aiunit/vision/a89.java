package com.oplus.aiunit.vision;

import com.heytap.httpdns.webkit.extension.util.DnsEnv;
import com.heytap.httpdns.webkit.extension.util.DnsLogLevel;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
public final /* synthetic */ class a89 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[DnsLogLevel.values().length];
        $EnumSwitchMapping$0 = iArr;
        iArr[DnsLogLevel.LEVEL_VERBOSE.ordinal()] = 1;
        iArr[DnsLogLevel.LEVEL_DEBUG.ordinal()] = 2;
        iArr[DnsLogLevel.LEVEL_INFO.ordinal()] = 3;
        iArr[DnsLogLevel.LEVEL_WARNING.ordinal()] = 4;
        iArr[DnsLogLevel.LEVEL_ERROR.ordinal()] = 5;
        iArr[DnsLogLevel.LEVEL_NONE.ordinal()] = 6;
        int[] iArr2 = new int[DnsEnv.values().length];
        $EnumSwitchMapping$1 = iArr2;
        iArr2[DnsEnv.RELEASE.ordinal()] = 1;
        iArr2[DnsEnv.TEST.ordinal()] = 2;
        iArr2[DnsEnv.DEV.ordinal()] = 3;
    }
}
