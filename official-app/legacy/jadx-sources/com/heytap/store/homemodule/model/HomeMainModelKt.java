package com.heytap.store.homemodule.model;

import com.heytap.store.platform.tools.ContextGetterUtils;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0003"}, d2 = {"CACHE_FILE_PATH", "", "TAG", "com.heytap.store.business.home-impl"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class HomeMainModelKt {

    @NotNull
    private static final String CACHE_FILE_PATH = Intrinsics.stringPlus(ContextGetterUtils.INSTANCE.getApp().getCacheDir().toString(), "/recommend_cache_v2.dat");

    @NotNull
    private static final String TAG = "HomeMainViewModel";
}
