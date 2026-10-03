package com.heytap.connect_dns;

import android.content.Context;
import android.content.SharedPreferences;
import com.heytap.connect.api.IDevice;
import com.oplus.aiunit.vision.r7b;
import java.util.concurrent.ExecutorService;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/heytap/connect_dns/DeviceResource;", "", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/oplus/aiunit/vision/r7b;", "logger", "Lcom/oplus/aiunit/vision/r7b;", "getLogger", "()Lcom/oplus/aiunit/vision/r7b;", "Landroid/content/SharedPreferences;", "spConfig", "Landroid/content/SharedPreferences;", "getSpConfig", "()Landroid/content/SharedPreferences;", "Lcom/heytap/connect/api/IDevice;", "deviceInfo", "Lcom/heytap/connect/api/IDevice;", "getDeviceInfo", "()Lcom/heytap/connect/api/IDevice;", "Ljava/util/concurrent/ExecutorService;", "ioExecutor", "Ljava/util/concurrent/ExecutorService;", "getIoExecutor", "()Ljava/util/concurrent/ExecutorService;", "<init>", "(Landroid/content/Context;Lcom/oplus/aiunit/vision/r7b;Landroid/content/SharedPreferences;Lcom/heytap/connect/api/IDevice;Ljava/util/concurrent/ExecutorService;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceResource {

    @NotNull
    private final Context context;

    @NotNull
    private final IDevice deviceInfo;

    @NotNull
    private final ExecutorService ioExecutor;

    @NotNull
    private final r7b logger;

    @NotNull
    private final SharedPreferences spConfig;

    public DeviceResource(@NotNull Context context, @NotNull r7b logger, @NotNull SharedPreferences spConfig, @NotNull IDevice deviceInfo, @NotNull ExecutorService ioExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(spConfig, "spConfig");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(ioExecutor, "ioExecutor");
        this.context = context;
        this.logger = logger;
        this.spConfig = spConfig;
        this.deviceInfo = deviceInfo;
        this.ioExecutor = ioExecutor;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final IDevice getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final ExecutorService getIoExecutor() {
        return this.ioExecutor;
    }

    @NotNull
    public final r7b getLogger() {
        return this.logger;
    }

    @NotNull
    public final SharedPreferences getSpConfig() {
        return this.spConfig;
    }
}
