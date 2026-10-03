package com.oplus.pay.opensdk.model.request;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
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

    public DownLoadRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "appPackage");
        Intrinsics.checkNotNullParameter(str2, "brand");
        Intrinsics.checkNotNullParameter(str3, "androidVersion");
        Intrinsics.checkNotNullParameter(str4, "colorosVersion");
        this.appPackage = str;
        this.brand = str2;
        this.androidVersion = str3;
        this.colorosVersion = str4;
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
