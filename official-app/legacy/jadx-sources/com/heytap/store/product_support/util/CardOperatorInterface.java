package com.heytap.store.product_support.util;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/heytap/store/product_support/util/CardOperatorInterface;", "", "onPause", "", "onResume", "isReset", "", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface CardOperatorInterface {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void onResume$default(CardOperatorInterface cardOperatorInterface, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onResume");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        cardOperatorInterface.onResume(z);
    }

    void onPause();

    void onResume(boolean isReset);
}
