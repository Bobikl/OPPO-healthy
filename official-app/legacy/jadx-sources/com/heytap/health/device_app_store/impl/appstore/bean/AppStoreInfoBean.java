package com.heytap.health.device_app_store.impl.appstore.bean;

import androidx.annotation.Keep;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/device_app_store/impl/appstore/bean/AppStoreInfoBean;", "", "appId", "", "downUrl", "", "md5", TraceConstants.KEY_PKG_NAME, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()I", "getDownUrl", "()Ljava/lang/String;", "getMd5", "getPkgName", "checkInvalid", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "device_app_store_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AppStoreInfoBean {
    private final int appId;

    @NotNull
    private final String downUrl;

    @NotNull
    private final String md5;

    @NotNull
    private final String pkgName;

    public AppStoreInfoBean(int i, @NotNull String downUrl, @NotNull String md5, @NotNull String pkgName) {
        Intrinsics.checkNotNullParameter(downUrl, "downUrl");
        Intrinsics.checkNotNullParameter(md5, "md5");
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        this.appId = i;
        this.downUrl = downUrl;
        this.md5 = md5;
        this.pkgName = pkgName;
    }

    public static /* synthetic */ AppStoreInfoBean copy$default(AppStoreInfoBean appStoreInfoBean, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = appStoreInfoBean.appId;
        }
        if ((i2 & 2) != 0) {
            str = appStoreInfoBean.downUrl;
        }
        if ((i2 & 4) != 0) {
            str2 = appStoreInfoBean.md5;
        }
        if ((i2 & 8) != 0) {
            str3 = appStoreInfoBean.pkgName;
        }
        return appStoreInfoBean.copy(i, str, str2, str3);
    }

    public final boolean checkInvalid() {
        String str = this.downUrl;
        if (!(str == null || str.length() == 0)) {
            String str2 = this.md5;
            if (!(str2 == null || str2.length() == 0)) {
                String str3 = this.pkgName;
                if (!(str3 == null || str3.length() == 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDownUrl() {
        return this.downUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPkgName() {
        return this.pkgName;
    }

    @NotNull
    public final AppStoreInfoBean copy(int appId, @NotNull String downUrl, @NotNull String md5, @NotNull String pkgName) {
        Intrinsics.checkNotNullParameter(downUrl, "downUrl");
        Intrinsics.checkNotNullParameter(md5, "md5");
        Intrinsics.checkNotNullParameter(pkgName, "pkgName");
        return new AppStoreInfoBean(appId, downUrl, md5, pkgName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppStoreInfoBean)) {
            return false;
        }
        AppStoreInfoBean appStoreInfoBean = (AppStoreInfoBean) other;
        return this.appId == appStoreInfoBean.appId && Intrinsics.areEqual(this.downUrl, appStoreInfoBean.downUrl) && Intrinsics.areEqual(this.md5, appStoreInfoBean.md5) && Intrinsics.areEqual(this.pkgName, appStoreInfoBean.pkgName);
    }

    public final int getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getDownUrl() {
        return this.downUrl;
    }

    @NotNull
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    public final String getPkgName() {
        return this.pkgName;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.appId) * 31) + this.downUrl.hashCode()) * 31) + this.md5.hashCode()) * 31) + this.pkgName.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppStoreInfoBean(appId=" + this.appId + ", downUrl=" + this.downUrl + ", md5=" + this.md5 + ", pkgName=" + this.pkgName + ")";
    }
}
