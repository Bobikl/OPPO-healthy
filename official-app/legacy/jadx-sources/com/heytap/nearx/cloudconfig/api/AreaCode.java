package com.heytap.nearx.cloudconfig.api;

import com.heytap.nearx.cloudconfig.env.AreaEnv;
import com.heytap.nearx.cloudconfig.impl.FixedAreaCodeHost;
import com.heytap.nearx.cloudconfig.util.LogUtils;
import com.oplus.aiunit.vision.alf;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u000e\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00030\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/nearx/cloudconfig/api/AreaCode;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "areaHost", "Lcom/heytap/nearx/cloudconfig/impl/FixedAreaCodeHost;", "areaHost$com_heytap_nearx_cloudconfig", "host", "kotlin.jvm.PlatformType", "CN", "EU", alf.SA, "SEA", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public enum AreaCode {
    CN("cn"),
    EU("eu"),
    SA("in"),
    SEA("sg");


    @NotNull
    private final String code;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AreaCode.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AreaCode.CN.ordinal()] = 1;
        }
    }

    AreaCode(String str) {
        this.code = str;
    }

    @NotNull
    public final FixedAreaCodeHost areaHost$com_heytap_nearx_cloudconfig() {
        return new FixedAreaCodeHost(AreaCodeKt.areaUrl(this));
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final String host() {
        try {
            return WhenMappings.$EnumSwitchMapping$0[ordinal()] != 1 ? AreaEnv.configUrl(this.code) : AreaEnv.cnUrl();
        } catch (Throwable th) {
            LogUtils.INSTANCE.w("AreaCode", "无效的url, 请确保您已接入 cloudconfig-env 模块", th, new Object[0]);
            return "";
        }
    }
}
