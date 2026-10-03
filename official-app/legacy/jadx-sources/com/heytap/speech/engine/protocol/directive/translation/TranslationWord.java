package com.heytap.speech.engine.protocol.directive.translation;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b$\u0010%R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR6\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bRB\u0010\u001e\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/translation/TranslationWord;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", "fromText", "getFromText", "setFromText", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/translation/WordInfo;", "Lkotlin/collections/ArrayList;", "translationList", "Ljava/util/ArrayList;", "getTranslationList", "()Ljava/util/ArrayList;", "setTranslationList", "(Ljava/util/ArrayList;)V", "providerName", "getProviderName", "setProviderName", "providerLogo", "getProviderLogo", "setProviderLogo", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class TranslationWord extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private String fromText;

    @Nullable
    private String providerLogo;

    @Nullable
    private String providerName;

    @Nullable
    private String reply;

    @Nullable
    private ArrayList<WordInfo> translationList;

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getFromText() {
        return this.fromText;
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
    public final ArrayList<WordInfo> getTranslationList() {
        return this.translationList;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setFromText(@Nullable String str) {
        this.fromText = str;
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

    public final void setTranslationList(@Nullable ArrayList<WordInfo> arrayList) {
        this.translationList = arrayList;
    }
}
