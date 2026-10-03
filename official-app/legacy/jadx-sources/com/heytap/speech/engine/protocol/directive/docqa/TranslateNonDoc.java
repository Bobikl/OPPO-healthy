package com.heytap.speech.engine.protocol.directive.docqa;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/docqa/TranslateNonDoc;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", "targetLanguage", "getTargetLanguage", "setTargetLanguage", "", "translateType", "Ljava/lang/Integer;", "getTranslateType", "()Ljava/lang/Integer;", "setTranslateType", "(Ljava/lang/Integer;)V", "serviceName", "getServiceName", "setServiceName", "serviceAction", "getServiceAction", "setServiceAction", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class TranslateNonDoc extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String reply;

    @Nullable
    private String serviceAction;

    @Nullable
    private String serviceName;

    @Nullable
    private String targetLanguage;

    @Nullable
    private Integer translateType;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.docqa.TranslateNonDoc$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/docqa/TranslateNonDoc$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return TranslateNonDoc.VERSION;
        }
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final String getServiceAction() {
        return this.serviceAction;
    }

    @Nullable
    public final String getServiceName() {
        return this.serviceName;
    }

    @Nullable
    public final String getTargetLanguage() {
        return this.targetLanguage;
    }

    @Nullable
    public final Integer getTranslateType() {
        return this.translateType;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setServiceAction(@Nullable String str) {
        this.serviceAction = str;
    }

    public final void setServiceName(@Nullable String str) {
        this.serviceName = str;
    }

    public final void setTargetLanguage(@Nullable String str) {
        this.targetLanguage = str;
    }

    public final void setTranslateType(@Nullable Integer num) {
        this.translateType = num;
    }
}
