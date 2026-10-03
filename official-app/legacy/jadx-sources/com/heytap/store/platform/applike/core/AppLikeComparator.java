package com.heytap.store.platform.applike.core;

import com.heytap.store.platform.applike.template.IAppLike;
import java.util.Comparator;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/heytap/store/platform/applike/core/AppLikeComparator;", "Ljava/util/Comparator;", "Lcom/heytap/store/platform/applike/template/IAppLike;", "Lkotlin/Comparator;", "()V", "compare", "", "o1", "o2", "applike-api_release"}, k = 1, mv = {1, 1, 15})
public final class AppLikeComparator implements Comparator<IAppLike> {
    @Override // java.util.Comparator
    public int compare(@NotNull IAppLike o1, @NotNull IAppLike o2) {
        Intrinsics.checkParameterIsNotNull(o1, "o1");
        Intrinsics.checkParameterIsNotNull(o2, "o2");
        return o1.getPriority() - o2.getPriority();
    }
}
