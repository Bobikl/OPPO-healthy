package com.pantanal.server.content.utils;

import com.google.android.gms.actions.SearchIntents;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.oplus.aiunit.vision.tfk;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)¨\u0006*"}, d2 = {"Lcom/pantanal/server/content/utils/UTraceCode;", "", "code", "", DBHealthReviewPlan.DESC, "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getDesc", "()Ljava/lang/String;", "KEY_TRACE_NODE_INFO_4_000", "KEY_TRACE_NODE_INFO_6_000", "KEY_TRACE_NODE_ERROR_6_001", "KEY_TRACE_NODE_ERROR_6_101", "KEY_TRACE_NODE_INFO_6_010", "KEY_TRACE_NODE_INFO_6_011", "KEY_TRACE_NODE_INFO_6_012", "KEY_TRACE_NODE_INFO_6_020", "KEY_TRACE_NODE_INFO_6_030", "KEY_TRACE_NODE_INFO_6_040", "KEY_TRACE_NODE_INFO_6_003", "KEY_TRACE_NODE_INFO_6_013", "KEY_TRACE_NODE_INFO_6_050", "KEY_TRACE_NODE_INFO_6_051", "KEY_TRACE_NODE_INFO_6_004", "KEY_TRACE_NODE_ERROR_6_111", "KEY_TRACE_NODE_ERROR_6_002", "KEY_TRACE_NODE_ERROR_6_301", "KEY_TRACE_NODE_ERROR_6_302", "KEY_TRACE_NODE_ERROR_6_401", "KEY_TRACE_NODE_ERROR_6_501", "KEY_TRACE_NODE_ERROR_6_502", "KEY_TRACE_NODE_ERROR_6_503", "KEY_TRACE_NODE_ERROR_6_003", "KEY_TRACE_NODE_ERROR_6_004", "KEY_TRACE_NODE_ERROR_6_005", "KEY_TRACE_NODE_ERROR_6_006", "KEY_TRACE_NODE_ERROR_6_007", "KEY_TRACE_NODE_ERROR_6_008", "KEY_TRACE_NODE_ERROR_6_009", "KEY_TRACE_NODE_ERROR_6_010", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public enum UTraceCode {
    KEY_TRACE_NODE_INFO_4_000(tfk.KEY_TRACE_NODE_INFO_4_000, SearchIntents.EXTRA_QUERY),
    KEY_TRACE_NODE_INFO_6_000(tfk.KEY_TRACE_NODE_INFO_6_000, "call updateToLatestVersion"),
    KEY_TRACE_NODE_ERROR_6_001(tfk.KEY_TRACE_NODE_ERROR_6_001, "call updateToLatestVersion, serviceId is null"),
    KEY_TRACE_NODE_ERROR_6_101(tfk.KEY_TRACE_NODE_ERROR_6_101, "call checkUpkValid, serviceId is null"),
    KEY_TRACE_NODE_INFO_6_010(tfk.KEY_TRACE_NODE_INFO_6_010, "call checkUpkValid"),
    KEY_TRACE_NODE_INFO_6_011(tfk.KEY_TRACE_NODE_INFO_6_011, "call isUpkFileExist"),
    KEY_TRACE_NODE_INFO_6_012(tfk.KEY_TRACE_NODE_INFO_6_012, "call deleteUPK"),
    KEY_TRACE_NODE_INFO_6_020(tfk.KEY_TRACE_NODE_INFO_6_020, "call getVersionByServiceId"),
    KEY_TRACE_NODE_INFO_6_030(tfk.KEY_TRACE_NODE_INFO_6_030, "call getUpkInfoFromUms"),
    KEY_TRACE_NODE_INFO_6_040(tfk.KEY_TRACE_NODE_INFO_6_040, "call isAlwaysUseUmsUpk"),
    KEY_TRACE_NODE_INFO_6_003(tfk.KEY_TRACE_NODE_INFO_6_003, "call copyAndUnzipUpk"),
    KEY_TRACE_NODE_INFO_6_013(tfk.KEY_TRACE_NODE_INFO_6_013, "call onUpkUnzipToLocal"),
    KEY_TRACE_NODE_INFO_6_050(tfk.KEY_TRACE_NODE_INFO_6_050, "call safelyCopyFile"),
    KEY_TRACE_NODE_INFO_6_051(tfk.KEY_TRACE_NODE_INFO_6_051, "call copyFile"),
    KEY_TRACE_NODE_INFO_6_004(tfk.KEY_TRACE_NODE_INFO_6_004, "call parseCardConfig"),
    KEY_TRACE_NODE_ERROR_6_111(tfk.KEY_TRACE_NODE_ERROR_6_111, "isUpkExist, serviceId is null"),
    KEY_TRACE_NODE_ERROR_6_002(tfk.KEY_TRACE_NODE_ERROR_6_002, "getUpkEntity exception"),
    KEY_TRACE_NODE_ERROR_6_301(tfk.KEY_TRACE_NODE_ERROR_6_301, "query error, cursor is null"),
    KEY_TRACE_NODE_ERROR_6_302(tfk.KEY_TRACE_NODE_ERROR_6_302, "query error"),
    KEY_TRACE_NODE_ERROR_6_401(tfk.KEY_TRACE_NODE_ERROR_6_401, "last hash is null, need to copy from ums"),
    KEY_TRACE_NODE_ERROR_6_501(tfk.KEY_TRACE_NODE_ERROR_6_501, "safelyCopyFile, copyUri is null"),
    KEY_TRACE_NODE_ERROR_6_502(tfk.KEY_TRACE_NODE_ERROR_6_502, "copyFile error,SecurityException info"),
    KEY_TRACE_NODE_ERROR_6_503(tfk.KEY_TRACE_NODE_ERROR_6_503, "copyFile error"),
    KEY_TRACE_NODE_ERROR_6_003(tfk.KEY_TRACE_NODE_ERROR_6_003, "upkInfo is null,return"),
    KEY_TRACE_NODE_ERROR_6_004(tfk.KEY_TRACE_NODE_ERROR_6_004, "copy failed"),
    KEY_TRACE_NODE_ERROR_6_005(tfk.KEY_TRACE_NODE_ERROR_6_005, "local hash is empty or not correct localHash"),
    KEY_TRACE_NODE_ERROR_6_006(tfk.KEY_TRACE_NODE_ERROR_6_006, "unzip failed"),
    KEY_TRACE_NODE_ERROR_6_007(tfk.KEY_TRACE_NODE_ERROR_6_007, "serviceId is null"),
    KEY_TRACE_NODE_ERROR_6_008(tfk.KEY_TRACE_NODE_ERROR_6_008, "parseCardConfig error"),
    KEY_TRACE_NODE_ERROR_6_009(tfk.KEY_TRACE_NODE_ERROR_6_009, "parseConfig error"),
    KEY_TRACE_NODE_ERROR_6_010(tfk.KEY_TRACE_NODE_ERROR_6_010, "copyAndUnzipUpk failed");

    private final int code;

    @NotNull
    private final String desc;

    UTraceCode(int i, String str) {
        this.code = i;
        this.desc = str;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    /* synthetic */ UTraceCode(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str);
    }
}
