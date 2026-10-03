package com.oplus.pay.opensdk.model.request;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/oplus/pay/opensdk/model/request/DownLoadRequest;", "Lcom/oplus/pay/opensdk/model/request/BaseRequest;", "appPackage", "", "brand", "androidVersion", "colorosVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAndroidVersion", "()Ljava/lang/String;", "getAppPackage", "getBrand", "getColorosVersion", "paysdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DownLoadRequest extends BaseRequest {

    @NotNull
    private final String androidVersion;

    @NotNull
    private final String appPackage;

    @NotNull
    private final String brand;

    @NotNull
    private final String colorosVersion;

    public DownLoadRequest(@NotNull String appPackage, @NotNull String brand, @NotNull String androidVersion, @NotNull String colorosVersion) {
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(colorosVersion, "colorosVersion");
        this.appPackage = appPackage;
        this.brand = brand;
        this.androidVersion = androidVersion;
        this.colorosVersion = colorosVersion;
    }

    @NotNull
    public final String getAndroidVersion() {
        return this.androidVersion;
    }

    @NotNull
    public final String getAppPackage() {
        return this.appPackage;
    }

    @NotNull
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    public final String getColorosVersion() {
        return this.colorosVersion;
    }
}
