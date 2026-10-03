package com.heytap.speech.engine.protocol.directive.translation;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\"\u0010#R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bRB\u0010\u001c\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019j\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/translation/WordExplain;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", "speak", "getSpeak", "setSpeak", "Lcom/heytap/speech/engine/protocol/directive/translation/WordInfo;", "translation", "Lcom/heytap/speech/engine/protocol/directive/translation/WordInfo;", "getTranslation", "()Lcom/heytap/speech/engine/protocol/directive/translation/WordInfo;", "setTranslation", "(Lcom/heytap/speech/engine/protocol/directive/translation/WordInfo;)V", "providerName", "getProviderName", "setProviderName", "providerLogo", "getProviderLogo", "setProviderLogo", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class WordExplain extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private String providerLogo;

    @Nullable
    private String providerName;

    @Nullable
    private String reply;

    @Nullable
    private String speak;

    @Nullable
    private WordInfo translation;

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getProviderLogo() {
        return this.providerLogo;
    }

    @Nullable
    public final String getProviderName() {
        return this.providerName;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getSpeak() {
        return this.speak;
    }

    @Nullable
    public final WordInfo getTranslation() {
        return this.translation;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setProviderLogo(@Nullable String str) {
        this.providerLogo = str;
    }

    public final void setProviderName(@Nullable String str) {
        this.providerName = str;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setSpeak(@Nullable String str) {
        this.speak = str;
    }

    public final void setTranslation(@Nullable WordInfo wordInfo) {
        this.translation = wordInfo;
    }
}
