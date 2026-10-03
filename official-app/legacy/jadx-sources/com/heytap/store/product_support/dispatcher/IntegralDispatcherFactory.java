package com.heytap.store.product_support.dispatcher;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/heytap/store/product_support/dispatcher/IntegralDispatcherFactory;", "", "()V", "Companion", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class IntegralDispatcherFactory {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/product_support/dispatcher/IntegralDispatcherFactory$Companion;", "", "()V", "createDispatcher", "Lcom/heytap/store/product_support/dispatcher/BaseDispatcher;", "type", "", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BaseDispatcher createDispatcher(int type) {
            if (type == IntegralType.INTEGRAL_GET.getValue()) {
                return new IntegralGetDispatcher();
            }
            if (type == IntegralType.INTEGRAL_EXCHANGE.getValue()) {
                return new IntegralExchangeDispatcher();
            }
            return type == IntegralType.INTEGRAL_LOGIN.getValue() ? new IntegralLoginDispatcher() : new IntegralGetDispatcher();
        }
    }
}
