package com.oplus.smartsdk.themecard;

import android.util.Log;
import com.opos.process.bridge.base.BridgeConstant;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JS\u0010\u0005\u001a\u0002H\u0006\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000b\u0018\u00010\n2\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\rJW\u0010\u000e\u001a\u0004\u0018\u0001H\u0006\"\u0004\b\u0000\u0010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u00042\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000b\u0018\u00010\n2\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\n\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/oplus/smartsdk/themecard/ReflectionUtils;", "", "()V", "TAG", "", "methodInvoke", "T", "obj", "methodName", "parameterTypes", "", "Ljava/lang/Class;", BridgeConstant.KEY_ARGS, "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;", "methodInvokeSafely", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class ReflectionUtils {

    @NotNull
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    @NotNull
    private static final String TAG = "ReflectionUtils";

    private ReflectionUtils() {
    }

    @JvmStatic
    public static final <T> T methodInvoke(@NotNull Object obj, @Nullable String methodName, @Nullable Class<?>[] parameterTypes, @NotNull Object... args) throws Exception {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(args, BridgeConstant.KEY_ARGS);
        if (parameterTypes != null) {
            if (!(parameterTypes.length == 0)) {
                Method declaredMethod = obj.getClass().getDeclaredMethod(methodName, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
                Intrinsics.checkNotNullExpressionValue(declaredMethod, "obj.javaClass.getDeclaredMethod(methodName, *parameterTypes)");
                return (T) declaredMethod.invoke(obj, Arrays.copyOf(args, args.length));
            }
        }
        Method declaredMethod2 = obj.getClass().getDeclaredMethod(methodName, new Class[0]);
        Intrinsics.checkNotNullExpressionValue(declaredMethod2, "obj.javaClass.getDeclaredMethod(methodName)");
        return (T) declaredMethod2.invoke(obj, new Object[0]);
    }

    @JvmStatic
    @Nullable
    public static final <T> T methodInvokeSafely(@Nullable Object obj, @NotNull String methodName, @Nullable Class<?>[] parameterTypes, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(args, BridgeConstant.KEY_ARGS);
        if (obj == null) {
            Log.w(TAG, "method invoke failed! obj is null!");
            return null;
        }
        try {
            return (T) methodInvoke(obj, methodName, parameterTypes, Arrays.copyOf(args, args.length));
        } catch (Exception e) {
            Log.e(TAG, "method invoke failed! methodName=" + methodName + ", e=" + ((Object) e.getMessage()));
            return null;
        }
    }

    public static /* synthetic */ Object methodInvokeSafely$default(Object obj, String str, Class[] clsArr, Object[] objArr, int i, Object obj2) {
        if ((i & 4) != 0) {
            clsArr = null;
        }
        return methodInvokeSafely(obj, str, clsArr, objArr);
    }
}
