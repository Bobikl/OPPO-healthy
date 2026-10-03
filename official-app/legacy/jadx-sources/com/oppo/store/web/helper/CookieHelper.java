package com.oppo.store.web.helper;

import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.store.base.core.state.Constants;
import com.heytap.store.base.core.util.SpUtil;
import com.heytap.store.base.core.util.app.HostDomainCenter;
import com.heytap.store.platform.tools.ContextGetterUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u0010\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/oppo/store/web/helper/CookieHelper;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "apkVersion", "getApkVersion", "setApkVersion", "(Ljava/lang/String;)V", "channel", "getChannel", "setChannel", "sourceType", "getSourceType", "setSourceType", "setCookie", "", "url", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class CookieHelper {

    @NotNull
    private final String TAG = "javaClass";

    @Nullable
    private String apkVersion;

    @Nullable
    private String channel;

    @Nullable
    private String sourceType;

    @Nullable
    public final String getApkVersion() {
        return this.apkVersion;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getSourceType() {
        return this.sourceType;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    public final void setApkVersion(@Nullable String str) {
        this.apkVersion = str;
    }

    public final void setChannel(@Nullable String str) {
        this.channel = str;
    }

    public final void setCookie(@Nullable String url) {
        if (SpUtil.getBoolean(Constants.PRIVACY_STATU, false)) {
            HostDomainCenter.allowWebViewActivity(url);
            if (!HttpUtils.isPrivacyUrl(url)) {
                HttpUtils.setDefaultCookieAsync(url, ContextGetterUtils.INSTANCE.getApp(), this.sourceType, this.channel, this.apkVersion);
            }
            if (HttpUtils.isPrivacyUrl(url) || HttpUtils.isCCBBackUrl(url)) {
                return;
            }
            HttpUtils.setCookieWithToken(url, ContextGetterUtils.INSTANCE.getApp());
        }
    }

    public final void setSourceType(@Nullable String str) {
        this.sourceType = str;
    }
}
