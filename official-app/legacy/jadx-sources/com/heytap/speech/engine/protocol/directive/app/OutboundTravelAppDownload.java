package com.heytap.speech.engine.protocol.directive.app;

import androidx.annotation.Keep;
import com.amap.api.services.district.DistrictSearchQuery;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b%\u0010&R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\b¨\u0006)"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/app/OutboundTravelAppDownload;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", DistrictSearchQuery.KEYWORDS_DISTRICT, "getDistrict", "setDistrict", DeepLinkInterpreter.KEY_DEEP_LINK, "getDeepLink", "setDeepLink", "appIntroduction", "getAppIntroduction", "setAppIntroduction", "Ljava/util/ArrayList;", "appIconList", "Ljava/util/ArrayList;", "getAppIconList", "()Ljava/util/ArrayList;", "setAppIconList", "(Ljava/util/ArrayList;)V", "cardBackground", "getCardBackground", "setCardBackground", "darknessBackground", "getDarknessBackground", "setDarknessBackground", "provideUrl", "getProvideUrl", "setProvideUrl", "provideName", "getProvideName", "setProvideName", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class OutboundTravelAppDownload extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<String> appIconList;

    @Nullable
    private String appIntroduction;

    @Nullable
    private String cardBackground;

    @Nullable
    private String darknessBackground;

    @Nullable
    private String deepLink;

    @Nullable
    private String district;

    @Nullable
    private String provideName;

    @Nullable
    private String provideUrl;

    @Nullable
    private String reply;

    @Nullable
    public final ArrayList<String> getAppIconList() {
        return this.appIconList;
    }

    @Nullable
    public final String getAppIntroduction() {
        return this.appIntroduction;
    }

    @Nullable
    public final String getCardBackground() {
        return this.cardBackground;
    }

    @Nullable
    public final String getDarknessBackground() {
        return this.darknessBackground;
    }

    @Nullable
    public final String getDeepLink() {
        return this.deepLink;
    }

    @Nullable
    public final String getDistrict() {
        return this.district;
    }

    @Nullable
    public final String getProvideName() {
        return this.provideName;
    }

    @Nullable
    public final String getProvideUrl() {
        return this.provideUrl;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    public final void setAppIconList(@Nullable ArrayList<String> arrayList) {
        this.appIconList = arrayList;
    }

    public final void setAppIntroduction(@Nullable String str) {
        this.appIntroduction = str;
    }

    public final void setCardBackground(@Nullable String str) {
        this.cardBackground = str;
    }

    public final void setDarknessBackground(@Nullable String str) {
        this.darknessBackground = str;
    }

    public final void setDeepLink(@Nullable String str) {
        this.deepLink = str;
    }

    public final void setDistrict(@Nullable String str) {
        this.district = str;
    }

    public final void setProvideName(@Nullable String str) {
        this.provideName = str;
    }

    public final void setProvideUrl(@Nullable String str) {
        this.provideUrl = str;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }
}
