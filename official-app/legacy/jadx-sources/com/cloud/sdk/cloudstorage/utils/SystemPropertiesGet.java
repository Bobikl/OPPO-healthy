package com.cloud.sdk.cloudstorage.utils;

import android.content.Context;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\u0002J\u001b\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0086\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/SystemPropertiesGet;", "", "()V", "TAG", "", ParserTag.TAG_GET, "context", "Landroid/content/Context;", "key", "def", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class SystemPropertiesGet {

    @NotNull
    public static final SystemPropertiesGet INSTANCE = new SystemPropertiesGet();
    private static final String TAG = "SystemPropertiesGet";

    private SystemPropertiesGet() {
    }

    @NotNull
    public final String get(@Nullable Context context, @NotNull String key) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(key, "key");
        return InvokeSystemUtils.INSTANCE.getStringInvokeMethod(context, "android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class}, new Object[]{key});
    }

    @NotNull
    public final String get(@NotNull Context context, @NotNull String key, @NotNull String def) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(def, "def");
        if (StringsKt__StringsJVMKt.isBlank(key)) {
            final String str = "";
            OcsLog.INSTANCE.e(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.SystemPropertiesGet.get.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "get failed. param exception. return default = " + str;
                }
            });
            return "";
        }
        return InvokeSystemUtils.INSTANCE.getStringInvokeMethod(context, "android.os.SystemProperties", ParserTag.TAG_GET, new Class[]{String.class, String.class}, new Object[]{key, def});
    }
}
