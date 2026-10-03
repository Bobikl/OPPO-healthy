package com.heytap.speech.engine.protocol.directive.app;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b-\u0010.R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR$\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bRB\u0010'\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020%\u0018\u00010$j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020%\u0018\u0001`&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/app/InstallApp;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/app/AppEntity;", "Lkotlin/collections/ArrayList;", "appList", "Ljava/util/ArrayList;", "getAppList", "()Ljava/util/ArrayList;", "setAppList", "(Ljava/util/ArrayList;)V", "matchAppName", "getMatchAppName", "setMatchAppName", "matchAppPackage", "getMatchAppPackage", "setMatchAppPackage", "autoDownloadPackage", "getAutoDownloadPackage", "setAutoDownloadPackage", "provideUrl", "getProvideUrl", "setProvideUrl", "cardType", "getCardType", "setCardType", "source", "getSource", "setSource", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class InstallApp extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<AppEntity> appList;

    @Nullable
    private String autoDownloadPackage;

    @Nullable
    private String cardType;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private String matchAppName;

    @Nullable
    private String matchAppPackage;

    @Nullable
    private String provideUrl;

    @Nullable
    private String reply;

    @Nullable
    private String source;

    @Nullable
    public final ArrayList<AppEntity> getAppList() {
        return this.appList;
    }

    @Nullable
    public final String getAutoDownloadPackage() {
        return this.autoDownloadPackage;
    }

    @Nullable
    public final String getCardType() {
        return this.cardType;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getMatchAppName() {
        return this.matchAppName;
    }

    @Nullable
    public final String getMatchAppPackage() {
        return this.matchAppPackage;
    }

    @Nullable
    public final String getProvideUrl() {
        return this.provideUrl;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public final void setAppList(@Nullable ArrayList<AppEntity> arrayList) {
        this.appList = arrayList;
    }

    public final void setAutoDownloadPackage(@Nullable String str) {
        this.autoDownloadPackage = str;
    }

    public final void setCardType(@Nullable String str) {
        this.cardType = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setMatchAppName(@Nullable String str) {
        this.matchAppName = str;
    }

    public final void setMatchAppPackage(@Nullable String str) {
        this.matchAppPackage = str;
    }

    public final void setProvideUrl(@Nullable String str) {
        this.provideUrl = str;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }
}
