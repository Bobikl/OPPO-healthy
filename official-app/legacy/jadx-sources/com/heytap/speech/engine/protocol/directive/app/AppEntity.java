package com.heytap.speech.engine.protocol.directive.app;

import androidx.annotation.Keep;
import com.heytap.health.gdxui.stars.a;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR:\u0010\u0018\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR\u001c\u0010#\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\b¨\u00062"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/app/AppEntity;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "appId", "", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "appLogo", "getAppLogo", "setAppLogo", "appName", "getAppName", "setAppName", "descUrl", "getDescUrl", "setDescUrl", "developer", "getDeveloper", "setDeveloper", "downloadCountDesc", "getDownloadCountDesc", "setDownloadCountDesc", "extend", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "packageName", "getPackageName", "setPackageName", "permissionUrl", "getPermissionUrl", "setPermissionUrl", "privacyUrl", "getPrivacyUrl", "setPrivacyUrl", a.TAG_STAR, "getStar", "setStar", "transparent", "getTransparent", "setTransparent", "version", "getVersion", "setVersion", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AppEntity extends DirectivePayload {

    @Nullable
    private String appId;

    @Nullable
    private String appLogo;

    @Nullable
    private String appName;

    @Nullable
    private String descUrl;

    @Nullable
    private String developer;

    @Nullable
    private String downloadCountDesc;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private String packageName;

    @Nullable
    private String permissionUrl;

    @Nullable
    private String privacyUrl;

    @Nullable
    private String star;

    @Nullable
    private String transparent;

    @Nullable
    private String version;

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getAppLogo() {
        return this.appLogo;
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final String getDescUrl() {
        return this.descUrl;
    }

    @Nullable
    public final String getDeveloper() {
        return this.developer;
    }

    @Nullable
    public final String getDownloadCountDesc() {
        return this.downloadCountDesc;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getPermissionUrl() {
        return this.permissionUrl;
    }

    @Nullable
    public final String getPrivacyUrl() {
        return this.privacyUrl;
    }

    @Nullable
    public final String getStar() {
        return this.star;
    }

    @Nullable
    public final String getTransparent() {
        return this.transparent;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public final void setAppId(@Nullable String str) {
        this.appId = str;
    }

    public final void setAppLogo(@Nullable String str) {
        this.appLogo = str;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setDescUrl(@Nullable String str) {
        this.descUrl = str;
    }

    public final void setDeveloper(@Nullable String str) {
        this.developer = str;
    }

    public final void setDownloadCountDesc(@Nullable String str) {
        this.downloadCountDesc = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setPermissionUrl(@Nullable String str) {
        this.permissionUrl = str;
    }

    public final void setPrivacyUrl(@Nullable String str) {
        this.privacyUrl = str;
    }

    public final void setStar(@Nullable String str) {
        this.star = str;
    }

    public final void setTransparent(@Nullable String str) {
        this.transparent = str;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }
}
