package com.heytap.nearx.tangramconfig.api;

import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.env.AreaEnv;
import com.heytap.nearx.tangramconfig.impl.FixedAreaCodeHost;
import com.heytap.nearx.tangramconfig.util.LogUtils;
import com.heytap.store.base.core.util.statistics.bean.UtmBean;
import com.oplus.aiunit.vision.alf;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\u000e\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00030\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/heytap/nearx/tangramconfig/api/AreaCode;", "", "code", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "areaHost", "Lcom/heytap/nearx/tangramconfig/impl/FixedAreaCodeHost;", "areaHost$com_heytap_nearx_tangramconfig", "host", "kotlin.jvm.PlatformType", "CN", "EU", alf.SA, alf.US, "SEA", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum AreaCode {
    CN("cn"),
    EU("eu"),
    SA("in"),
    US(UtmBean.US),
    SEA("sg");


    @NotNull
    private final String code;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AreaCode.values().length];
            try {
                iArr[AreaCode.CN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    AreaCode(String str) {
        this.code = str;
    }

    @NotNull
    public final FixedAreaCodeHost areaHost$com_heytap_nearx_tangramconfig() {
        return new FixedAreaCodeHost(AreaCodeKt.areaUrl(this));
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final String host() {
        try {
            return WhenMappings.$EnumSwitchMapping$0[ordinal()] == 1 ? AreaEnv.cnUrl() : AreaEnv.configUrl(this.code);
        } catch (Throwable th) {
            LogUtils.INSTANCE.w("AreaCode", "无效的url, 请确保您已接入 cloudconfig-env 模块", th, new Object[0]);
            return "";
        }
    }
}
