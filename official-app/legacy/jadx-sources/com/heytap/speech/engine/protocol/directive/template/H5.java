package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b¨\u0006!"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/H5;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "tts", "getTts", "setTts", "reply", "getReply", "setReply", "foldUrl", "getFoldUrl", "setFoldUrl", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/template/H5PreLoadInfo;", "preLoadInfos", "Ljava/util/ArrayList;", "getPreLoadInfos", "()Ljava/util/ArrayList;", "setPreLoadInfos", "(Ljava/util/ArrayList;)V", "bizType", "getBizType", "setBizType", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class H5 extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private String bizType;

    @Nullable
    private String foldUrl;

    @Nullable
    private ArrayList<H5PreLoadInfo> preLoadInfos;

    @Nullable
    private String reply;

    @Nullable
    private String tts;

    @Nullable
    private String url;

    @Nullable
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    public final String getFoldUrl() {
        return this.foldUrl;
    }

    @Nullable
    public final ArrayList<H5PreLoadInfo> getPreLoadInfos() {
        return this.preLoadInfos;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getTts() {
        return this.tts;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setBizType(@Nullable String str) {
        this.bizType = str;
    }

    public final void setFoldUrl(@Nullable String str) {
        this.foldUrl = str;
    }

    public final void setPreLoadInfos(@Nullable ArrayList<H5PreLoadInfo> arrayList) {
        this.preLoadInfos = arrayList;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setTts(@Nullable String str) {
        this.tts = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
