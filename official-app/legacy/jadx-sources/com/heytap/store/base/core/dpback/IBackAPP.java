package com.heytap.store.base.core.dpback;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&J\u001e\u0010\t\u001a\u00020\u00032\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH&¨\u0006\r"}, d2 = {"Lcom/heytap/store/base/core/dpback/IBackAPP;", "", "backIntercept", "", "getBackAPPInfo", "Lcom/heytap/store/base/core/dpback/BackAPPInfo;", "gotoTargetApp", "", "backAPPInfo", "match", "urlParams", "", "", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IBackAPP {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean backIntercept(@NotNull IBackAPP iBackAPP) {
            Intrinsics.checkNotNullParameter(iBackAPP, "this");
            return false;
        }
    }

    boolean backIntercept();

    @Nullable
    BackAPPInfo getBackAPPInfo();

    void gotoTargetApp(@Nullable BackAPPInfo backAPPInfo);

    boolean match(@Nullable Map<String, String> urlParams);
}
