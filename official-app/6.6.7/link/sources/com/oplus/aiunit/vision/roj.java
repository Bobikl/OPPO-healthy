package com.oplus.aiunit.vision;

import com.oplus.compat.utils.util.UnSupportedApiVersionException;
import com.oplus.wearable.linkservice.sdk.Node;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0006H\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/roj;", "", "", Node.I_KEY, "default", "a", "", "b", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
public final class roj {

    @NotNull
    public static final roj INSTANCE = new roj();

    @JvmStatic
    @NotNull
    public static final String a(@NotNull String key, @NotNull String str) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        Intrinsics.checkNotNullParameter(str, "default");
        try {
            String strA = soj.a(key, str);
            Intrinsics.checkNotNullExpressionValue(strA, "{\n            SystemProp…t(key, default)\n        }");
            return strA;
        } catch (UnSupportedApiVersionException e) {
            g3e.b("SystemPropertiesCustomize", "get error :" + e);
            return str;
        }
    }

    @JvmStatic
    public static final boolean b(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, Node.I_KEY);
        try {
            return soj.b(key, z);
        } catch (UnSupportedApiVersionException e) {
            g3e.b("SystemPropertiesCustomize", "getBoolean error :" + e);
            return z;
        }
    }
}
