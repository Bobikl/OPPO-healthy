package com.oplus.aiunit.vision;

import com.oplus.wrapper.os.SystemProperties;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/za5;", "", "", "b", "", "a", "Ljava/lang/String;", "sBrand", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class za5 {

    @NotNull
    public static final za5 INSTANCE = new za5();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static String sBrand;

    @JvmStatic
    @NotNull
    public static final String a() {
        if (sBrand == null) {
            String brand = SystemProperties.get("ro.product.brand");
            Intrinsics.checkNotNullExpressionValue(brand, "brand");
            if (brand.length() == 0) {
                brand = SystemProperties.get("ro.product.brand.sub");
            }
            if (brand.length() == 0) {
                f7b.f("DeviceBrandUtils", "getPhoneBrand: get brand error, brand is null or empty");
                brand = "REALME";
            }
            sBrand = brand;
        }
        String str = sBrand;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sBrand");
            str = null;
        }
        f7b.d("DeviceBrandUtils", Intrinsics.stringPlus("getPhoneBrand: brand: ", str));
        String str2 = sBrand;
        if (str2 != null) {
            return str2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sBrand");
        return null;
    }

    @JvmStatic
    public static final boolean b() {
        return (a().length() == 0) || StringsKt__StringsJVMKt.equals("REALME", a(), true);
    }
}
