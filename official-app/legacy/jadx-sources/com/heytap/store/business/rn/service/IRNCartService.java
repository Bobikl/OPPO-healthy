package com.heytap.store.business.rn.service;

import com.heytap.store.platform.htrouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0005H&J\f\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bH&¨\u0006\f"}, d2 = {"Lcom/heytap/store/business/rn/service/IRNCartService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "addRnCartOpenListener", "", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "count", "getCartFragment", "Ljava/lang/Class;", "rn-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IRNCartService extends IProvider {
    void addRnCartOpenListener(@NotNull Function1<? super Boolean, Unit> callback);

    @NotNull
    Class<?> getCartFragment();
}
