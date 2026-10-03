package com.oplus.aiunit.model;

import com.heytap.store.platform.videoplayer.base.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes16.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/cp5;", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, "model", "Lcom/oplus/aiunit/vision/ap5;", "b", "mac", "a", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class cp5 {

    @NotNull
    public static final cp5 INSTANCE = new cp5();

    @JvmStatic
    @NotNull
    public static final ap5 a(@Nullable String mac) {
        return new bp5(nq5.c(mac));
    }

    @JvmStatic
    @NotNull
    public static final ap5 b(@Nullable String model) {
        return new bp5(model);
    }
}