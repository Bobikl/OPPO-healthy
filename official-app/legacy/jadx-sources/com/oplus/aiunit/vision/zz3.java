package com.oplus.aiunit.vision;

import com.nearx.env.TestEnv;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/zz3;", "", "", "a", "<init>", "()V", "com.oplus.nearx.cloudconfig"}, k = 1, mv = {1, 4, 0})
public final class zz3 {
    public static final zz3 INSTANCE = new zz3();

    @NotNull
    public final String a() {
        String strCloudConfigUrl = TestEnv.cloudConfigUrl();
        Intrinsics.checkExpressionValueIsNotNull(strCloudConfigUrl, "com.nearx.env.TestEnv.cloudConfigUrl()");
        return strCloudConfigUrl;
    }
}
