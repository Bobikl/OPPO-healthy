package com.heytap.health.voiceassistant.tts;

import androidx.annotation.Keep;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.platform.usercenter.bizuws.executor.dialog.ShowDialogExecutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006%"}, d2 = {"Lcom/heytap/health/voiceassistant/tts/Header;", "", "type", "", SpeechConstant.KEY_RECORD_ID, "sessionId", SpeechConstant.KEY_CONTEXT_ID, "wakeupWord", ShowDialogExecutor.JSON_DIALOG_ID_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContextId", "()Ljava/lang/String;", "setContextId", "(Ljava/lang/String;)V", "getDialogId", "setDialogId", "getRecordId", "setRecordId", "getSessionId", "setSessionId", "getType", "setType", "getWakeupWord", "setWakeupWord", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Header {

    @NotNull
    private String contextId;

    @NotNull
    private String dialogId;

    @Nullable
    private String recordId;

    @NotNull
    private String sessionId;

    @NotNull
    private String type;

    @NotNull
    private String wakeupWord;

    public Header() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Header copy$default(Header header, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = header.type;
        }
        if ((i & 2) != 0) {
            str2 = header.recordId;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = header.sessionId;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = header.contextId;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = header.wakeupWord;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = header.dialogId;
        }
        return header.copy(str, str7, str8, str9, str10, str6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRecordId() {
        return this.recordId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContextId() {
        return this.contextId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWakeupWord() {
        return this.wakeupWord;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDialogId() {
        return this.dialogId;
    }

    @NotNull
    public final Header copy(@NotNull String type, @Nullable String recordId, @NotNull String sessionId, @NotNull String contextId, @NotNull String wakeupWord, @NotNull String dialogId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(contextId, "contextId");
        Intrinsics.checkNotNullParameter(wakeupWord, "wakeupWord");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        return new Header(type, recordId, sessionId, contextId, wakeupWord, dialogId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Header)) {
            return false;
        }
        Header header = (Header) other;
        return Intrinsics.areEqual(this.type, header.type) && Intrinsics.areEqual(this.recordId, header.recordId) && Intrinsics.areEqual(this.sessionId, header.sessionId) && Intrinsics.areEqual(this.contextId, header.contextId) && Intrinsics.areEqual(this.wakeupWord, header.wakeupWord) && Intrinsics.areEqual(this.dialogId, header.dialogId);
    }

    @NotNull
    public final String getContextId() {
        return this.contextId;
    }

    @NotNull
    public final String getDialogId() {
        return this.dialogId;
    }

    @Nullable
    public final String getRecordId() {
        return this.recordId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getWakeupWord() {
        return this.wakeupWord;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.recordId;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sessionId.hashCode()) * 31) + this.contextId.hashCode()) * 31) + this.wakeupWord.hashCode()) * 31) + this.dialogId.hashCode();
    }

    public final void setContextId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contextId = str;
    }

    public final void setDialogId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dialogId = str;
    }

    public final void setRecordId(@Nullable String str) {
        this.recordId = str;
    }

    public final void setSessionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionId = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final void setWakeupWord(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wakeupWord = str;
    }

    @NotNull
    public String toString() {
        return "Header(type=" + this.type + ", recordId=" + this.recordId + ", sessionId=" + this.sessionId + ", contextId=" + this.contextId + ", wakeupWord=" + this.wakeupWord + ", dialogId=" + this.dialogId + ")";
    }

    public Header(@NotNull String type, @Nullable String str, @NotNull String sessionId, @NotNull String contextId, @NotNull String wakeupWord, @NotNull String dialogId) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(contextId, "contextId");
        Intrinsics.checkNotNullParameter(wakeupWord, "wakeupWord");
        Intrinsics.checkNotNullParameter(dialogId, "dialogId");
        this.type = type;
        this.recordId = str;
        this.sessionId = sessionId;
        this.contextId = contextId;
        this.wakeupWord = wakeupWord;
        this.dialogId = dialogId;
    }

    public /* synthetic */ Header(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "type" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "sessionId" : str3, (i & 8) != 0 ? SpeechConstant.KEY_CONTEXT_ID : str4, (i & 16) != 0 ? "wakeWord" : str5, (i & 32) != 0 ? ShowDialogExecutor.JSON_DIALOG_ID_KEY : str6);
    }
}
