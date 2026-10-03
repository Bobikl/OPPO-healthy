package com.heytap.nearx.cloudconfig;

import com.heytap.nearx.cloudconfig.util.UtilsKt;
import com.oplus.aiunit.vision.srj;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/heytap/nearx/cloudconfig/Env;", "", "(Ljava/lang/String;I)V", "isDebug", "", "testUpdateUrl", "", "RELEASE", "TEST", "DEV", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public enum Env {
    RELEASE,
    TEST,
    DEV;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Env.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Env.DEV.ordinal()] = 1;
            iArr[Env.TEST.ordinal()] = 2;
        }
    }

    public final boolean isDebug() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        return i == 1 || i == 2;
    }

    @NotNull
    public final String testUpdateUrl() {
        return srj.c() + UtilsKt.checkUpdateUrl();
    }
}
