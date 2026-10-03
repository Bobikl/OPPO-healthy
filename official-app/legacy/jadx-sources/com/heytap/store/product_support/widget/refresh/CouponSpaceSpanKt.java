package com.heytap.store.product_support.widget.refresh;

import android.text.SpannableStringBuilder;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u0002H\u0086\b¨\u0006\u0003"}, d2 = {"space", "Landroid/text/SpannableStringBuilder;", "", "product-support_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CouponSpaceSpanKt {
    @NotNull
    public static final SpannableStringBuilder space(@NotNull SpannableStringBuilder spannableStringBuilder, int i) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        CouponSpaceSpan couponSpaceSpan = new CouponSpaceSpan(i);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append("间距");
        spannableStringBuilder.setSpan(couponSpaceSpan, length, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }
}
