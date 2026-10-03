package com.oplus.nearx.cloudconfig.api;

import com.oplus.aiunit.vision.alf;
import com.oplus.aiunit.vision.d7b;
import com.oplus.aiunit.vision.rg0;
import com.oplus.aiunit.vision.sg0;
import com.oplus.aiunit.vision.tg0;
import com.oplus.aiunit.vision.tq7;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002J\u000f\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/oplus/nearx/cloudconfig/api/AreaCode;", "", "", "kotlin.jvm.PlatformType", "host", "Lcom/oplus/aiunit/vision/tq7;", "areaHost$com_oplus_nearx_cloudconfig", "()Lcom/oplus/aiunit/vision/tq7;", "areaHost", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "CN", "EU", alf.SA, "SEA", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public enum AreaCode {
    CN("cn"),
    EU("eu"),
    SA("in"),
    SEA("sg");


    @NotNull
    private final String code;

    AreaCode(String str) {
        this.code = str;
    }

    @NotNull
    public final tq7 areaHost$com_oplus_nearx_cloudconfig() {
        return new tq7(sg0.a(this));
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    public final String host() {
        try {
            return rg0.$EnumSwitchMapping$0[ordinal()] != 1 ? tg0.a(this.code) : tg0.b();
        } catch (Throwable th) {
            d7b.INSTANCE.c("AreaCode", "无效的url, 请确保您已接入 cloudconfig-env 模块", th, new Object[0]);
            return "";
        }
    }
}
