package com.cloud.sdk.cloudstorage.utils;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JI\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\f0\u000b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/InvokeSystemUtils;", "", "()V", "TAG", "", "getStringInvokeMethod", "context", "Landroid/content/Context;", "className", "methodName", "paramTypes", "", "Ljava/lang/Class;", "params", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/String;", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class InvokeSystemUtils {

    @NotNull
    public static final InvokeSystemUtils INSTANCE = new InvokeSystemUtils();
    private static final String TAG = "InvokeSystemUtils";

    private InvokeSystemUtils() {
    }

    @NotNull
    public final String getStringInvokeMethod(@Nullable Context context, @NotNull String className, @NotNull String methodName, @NotNull Class<?>[] paramTypes, @NotNull Object[] params) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(paramTypes, "paramTypes");
        Intrinsics.checkNotNullParameter(params, "params");
        final String str = "";
        if (context == null || TextUtils.isEmpty(className) || TextUtils.isEmpty(methodName)) {
            OcsLog.INSTANCE.e(TAG, new Function0<String>() { // from class: com.cloud.sdk.cloudstorage.utils.InvokeSystemUtils.getStringInvokeMethod.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                @NotNull
                public final String invoke() {
                    return "getStringInvokeMethod failed. param exception. return default = " + str;
                }
            });
            return "";
        }
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass(className);
            Method method = clsLoadClass.getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(paramTypes, paramTypes.length));
            Intrinsics.checkNotNullExpressionValue(method, "method");
            method.setAccessible(true);
            Object objInvoke = method.invoke(clsLoadClass, Arrays.copyOf(params, params.length));
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
            return "";
        } catch (IllegalAccessException e3) {
            e3.printStackTrace();
            return "";
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
            return "";
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
            return "";
        }
    }
}
