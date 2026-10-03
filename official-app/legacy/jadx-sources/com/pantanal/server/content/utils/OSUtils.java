package com.pantanal.server.content.utils;

import android.os.Build;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.d4d;
import com.oplus.aiunit.vision.f7b;
import com.oplus.os.OplusBuild;
import com.oplus.smartenginehelper.ParserTag;
import io.netty.util.internal.StringUtil;
import io.protostuff.MapSchema;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0007J\b\u0010\n\u001a\u00020\tH\u0007J\b\u0010\u000b\u001a\u00020\u0006H\u0007J\b\u0010\f\u001a\u00020\u0006H\u0007J\b\u0010\r\u001a\u00020\u0006H\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0007R\u001b\u0010\u0012\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001b\u0010\u0015\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0016\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/pantanal/server/content/utils/OSUtils;", "", "", "key", "defValue", "c", "", "f", MapSchema.FIELD_NAME_ENTRY, "", "b", "j", "i", b2n.f, b2n.g, "a", "Lkotlin/Lazy;", "()Ljava/lang/String;", "brand", "d", "()I", "OS_VERSION", "getModel", "model", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class OSUtils {

    @NotNull
    public static final OSUtils INSTANCE = new OSUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy brand = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.pantanal.server.content.utils.OSUtils$brand$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            String brand2 = Build.BRAND;
            if (brand2 == null || brand2.length() == 0) {
                brand2 = (String) OSUtils.c("ro.product.brand.sub", "OPPO");
            }
            Intrinsics.checkNotNullExpressionValue(brand2, "brand");
            return brand2;
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Lazy OS_VERSION = LazyKt__LazyJVMKt.lazy(new Function0<Integer>() { // from class: com.pantanal.server.content.utils.OSUtils$OS_VERSION$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Integer invoke() {
            Object objM5287constructorimpl;
            int oplusOSVERSION = 0;
            try {
                Result.Companion companion = Result.INSTANCE;
                oplusOSVERSION = OplusBuild.getOplusOSVERSION();
                objM5287constructorimpl = Result.m5287constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
            if (thM5290exceptionOrNullimpl != null) {
                f7b.f(d4d.TAG, Intrinsics.stringPlus("get OS_VERSION: ", thM5290exceptionOrNullimpl.getMessage()));
            }
            return Integer.valueOf(oplusOSVERSION);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy model = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.pantanal.server.content.utils.OSUtils$model$2
        @Override // p010kotlin.jvm.functions.Function0
        public final String invoke() {
            return Build.MODEL;
        }
    });

    @JvmStatic
    public static final int b() {
        return INSTANCE.d();
    }

    @JvmStatic
    @NotNull
    public static final Object c(@NotNull String key, @NotNull String defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defValue, "defValue");
        try {
            f7b.h(d4d.TAG, "SystemProperties get: key == " + key + ", defValue == " + defValue);
            Method method = Class.forName("android.os.SystemProperties").getMethod(ParserTag.TAG_GET, String.class, String.class);
            Intrinsics.checkNotNullExpressionValue(method, "cls.getMethod(\"get\", Str…java, String::class.java)");
            Object objInvoke = method.invoke(null, key, defValue);
            Intrinsics.checkNotNullExpressionValue(objInvoke, "method.invoke(null, key, defValue)");
            return objInvoke;
        } catch (IllegalAccessException e2) {
            f7b.f(d4d.TAG, Intrinsics.stringPlus("SystemProperties get IllegalAccessException: ", e2.getMessage()));
            return defValue;
        } catch (IllegalArgumentException e3) {
            f7b.f(d4d.TAG, Intrinsics.stringPlus("SystemProperties get IllegalArgumentException: ", e3.getMessage()));
            return defValue;
        } catch (InvocationTargetException e4) {
            f7b.f(d4d.TAG, Intrinsics.stringPlus("SystemProperties get InvocationTargetException: ", e4.getMessage()));
            return defValue;
        } catch (Exception e5) {
            f7b.f(d4d.TAG, Intrinsics.stringPlus("SystemProperties get InvocationTargetException: ", e5.getMessage()));
            return defValue;
        }
    }

    @JvmStatic
    public static final boolean e() {
        return INSTANCE.d() >= 37;
    }

    @JvmStatic
    public static final boolean f() {
        return INSTANCE.d() == 30;
    }

    @JvmStatic
    public static final boolean g() {
        return INSTANCE.d() == 35;
    }

    @JvmStatic
    public static final boolean h() {
        return INSTANCE.d() >= 34;
    }

    @JvmStatic
    public static final boolean i() {
        StringBuilder sb = new StringBuilder();
        sb.append("isGreaterThanColorOS1502: OS_VERSION=");
        OSUtils oSUtils = INSTANCE;
        sb.append(oSUtils.d());
        sb.append(StringUtil.SPACE);
        f7b.d(d4d.TAG, sb.toString());
        return oSUtils.d() >= 36;
    }

    @JvmStatic
    public static final boolean j() {
        return INSTANCE.d() < 30;
    }

    @NotNull
    public final String a() {
        return (String) brand.getValue();
    }

    public final int d() {
        return ((Number) OS_VERSION.getValue()).intValue();
    }
}
