package com.heytap.speech.engine.protocol.directive.app;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.commercial.CommercialInfo;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b5\u00106R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+RB\u0010/\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-\u0018\u00010,j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-\u0018\u0001`.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00069"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/app/LaunchApp;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "appName", "Ljava/lang/String;", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "packageName", "getPackageName", "setPackageName", DeepLinkInterpreter.KEY_DEEP_LINK, "getDeepLink", "setDeepLink", "token", AcCommonApiMethod.GET_TOKEN, "setToken", "reply", "getReply", "setReply", "downloadReply", "getDownloadReply", "setDownloadReply", "extShopParams", "getExtShopParams", "setExtShopParams", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialInfo;", "commercialInfo", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialInfo;", "getCommercialInfo", "()Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialInfo;", "setCommercialInfo", "(Lcom/heytap/speech/engine/protocol/directive/common/commercial/CommercialInfo;)V", "transparent", "getTransparent", "setTransparent", "", "autoDownload", "Ljava/lang/Boolean;", "getAutoDownload", "()Ljava/lang/Boolean;", "setAutoDownload", "(Ljava/lang/Boolean;)V", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class LaunchApp extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @JsonProperty("appName")
    @Nullable
    private String appName;

    @Nullable
    private Boolean autoDownload;

    @Nullable
    private CommercialInfo commercialInfo;

    @JsonProperty(DeepLinkInterpreter.KEY_DEEP_LINK)
    @Nullable
    private String deepLink;

    @Nullable
    private String downloadReply;

    @Nullable
    private String extShopParams;

    @Nullable
    private HashMap<String, Object> extend;

    @JsonProperty("packageName")
    @Nullable
    private String packageName;

    @Nullable
    private String reply;

    @JsonProperty("token")
    @Nullable
    private String token;

    @Nullable
    private String transparent;

    @Nullable
    public final String getAppName() {
        return this.appName;
    }

    @Nullable
    public final Boolean getAutoDownload() {
        return this.autoDownload;
    }

    @Nullable
    public final CommercialInfo getCommercialInfo() {
        return this.commercialInfo;
    }

    @Nullable
    public final String getDeepLink() {
        return this.deepLink;
    }

    @Nullable
    public final String getDownloadReply() {
        return this.downloadReply;
    }

    @Nullable
    public final String getExtShopParams() {
        return this.extShopParams;
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
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getToken() {
        return this.token;
    }

    @Nullable
    public final String getTransparent() {
        return this.transparent;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setAutoDownload(@Nullable Boolean bool) {
        this.autoDownload = bool;
    }

    public final void setCommercialInfo(@Nullable CommercialInfo commercialInfo) {
        this.commercialInfo = commercialInfo;
    }

    public final void setDeepLink(@Nullable String str) {
        this.deepLink = str;
    }

    public final void setDownloadReply(@Nullable String str) {
        this.downloadReply = str;
    }

    public final void setExtShopParams(@Nullable String str) {
        this.extShopParams = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setToken(@Nullable String str) {
        this.token = str;
    }

    public final void setTransparent(@Nullable String str) {
        this.transparent = str;
    }
}
