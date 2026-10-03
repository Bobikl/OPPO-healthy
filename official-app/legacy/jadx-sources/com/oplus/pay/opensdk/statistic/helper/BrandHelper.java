package com.oplus.pay.opensdk.statistic.helper;

import android.content.Context;
import android.os.Build;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.rkj;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.LazyThreadSafetyMode;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\tH\u0002R\u001b\u0010\u0011\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/pay/opensdk/statistic/helper/BrandHelper;", "", "Landroid/content/Context;", "context", "", "i", b2n.g, b2n.f, "f", "", "c", MapSchema.FIELD_NAME_ENTRY, "b", "a", "Lkotlin/Lazy;", "d", "()Ljava/lang/String;", "subBrand", "<init>", "()V", "paysdk_statistic_release"}, k = 1, mv = {1, 8, 0})
public final class BrandHelper {

    @NotNull
    public static final BrandHelper INSTANCE = new BrandHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Lazy subBrand = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<String>() { // from class: com.oplus.pay.opensdk.statistic.helper.BrandHelper$subBrand$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            try {
                return rkj.a("ro.product.brand.sub");
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
        return StringsKt__StringsJVMKt.equals(Build.BRAND, INSTANCE.a(), true);
    }

    @JvmStatic
    public static final boolean h() {
        BrandHelper brandHelper = INSTANCE;
        String strB = brandHelper.b();
        return StringsKt__StringsJVMKt.equals(brandHelper.d(), strB, true) || StringsKt__StringsJVMKt.equals(Build.BRAND, strB, true);
    }

    @JvmStatic
    public static final boolean i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String str = Build.BRAND;
        BrandHelper brandHelper = INSTANCE;
        if (StringsKt__StringsJVMKt.equals(str, brandHelper.c(), true)) {
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
        return (String) subBrand.getValue();
    }

    public final String e() {
        return DigestHelper.i("kge&gfmxd}{&egjadmx`gfm", 0, 2, null);
    }
}
