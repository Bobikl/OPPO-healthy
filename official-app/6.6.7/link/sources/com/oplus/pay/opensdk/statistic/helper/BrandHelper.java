package com.oplus.pay.opensdk.statistic.helper;

import android.content.Context;
import android.os.Build;
import com.oplus.aiunit.vision.noj;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\tH\u0002R\u001b\u0010\u0011\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/pay/opensdk/statistic/helper/BrandHelper;", "", "Landroid/content/Context;", "context", "", "i", "h", "g", "f", "", "c", "e", "b", "a", "Lkotlin/Lazy;", "d", "()Ljava/lang/String;", "subBrand", "<init>", "()V", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
public final class BrandHelper {

    @NotNull
    public static final BrandHelper INSTANCE = new BrandHelper();

    @NotNull
    public static final Lazy a = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0<String>() { // from class: com.oplus.pay.opensdk.statistic.helper.BrandHelper$subBrand$2
        @NotNull
        public final String invoke() {
            try {
                return noj.a("ro.product.brand.sub");
            } catch (Exception unused) {
                return "";
            }
        }
    });

    @JvmStatic
    public static final boolean f(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return i(context) || h() || g();
    }

    @JvmStatic
    public static final boolean g() {
        return StringsKt.equals(Build.BRAND, INSTANCE.a(), true);
    }

    @JvmStatic
    public static final boolean h() {
        BrandHelper brandHelper = INSTANCE;
        String strB = brandHelper.b();
        return StringsKt.equals(brandHelper.d(), strB, true) || StringsKt.equals(Build.BRAND, strB, true);
    }

    @JvmStatic
    public static final boolean i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = Build.BRAND;
        BrandHelper brandHelper = INSTANCE;
        if (StringsKt.equals(str, brandHelper.c(), true)) {
            return true;
        }
        try {
            if (context.getPackageManager().hasSystemFeature(brandHelper.e())) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final String a() {
        return DigestHelper.i("GXXG", 0, 2, null);
    }

    public final String b() {
        return DigestHelper.i("zmidem", 0, 2, null);
    }

    public final String c() {
        return DigestHelper.i("GfmXd}{", 0, 2, null);
    }

    @NotNull
    public final String d() {
        return (String) a.getValue();
    }

    public final String e() {
        return DigestHelper.i("kge&gfmxd}{&egjadmx`gfm", 0, 2, null);
    }
}
