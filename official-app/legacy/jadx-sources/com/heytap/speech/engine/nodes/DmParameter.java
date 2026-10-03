package com.heytap.speech.engine.nodes;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.speech.engine.internal.data.InternalError;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u00103\u001a\u00020&2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\b\u00107\u001a\u00020\u0003H\u0016R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000b\"\u0004\b\u001b\u0010\rR\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\rR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000b\"\u0004\b!\u0010\rR\u001a\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010\rR\u001e\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u000b\"\u0004\b-\u0010\r¨\u00068"}, d2 = {"Lcom/heytap/speech/engine/nodes/DmParameter;", "", "requestType", "", "wakeupWord", "data", "error", "Lcom/heytap/speech/engine/internal/data/InternalError;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/speech/engine/internal/data/InternalError;)V", "aiType", "getAiType", "()Ljava/lang/String;", "setAiType", "(Ljava/lang/String;)V", "getData", "setData", "echo", "getEcho", "setEcho", "getError", "()Lcom/heytap/speech/engine/internal/data/InternalError;", "setError", "(Lcom/heytap/speech/engine/internal/data/InternalError;)V", SpeechConstant.KEY_RECORD_ID, "getRecordId", "setRecordId", "getRequestType", "setRequestType", "round", "getRound", "setRound", "route", "getRoute", "setRoute", "sessionId", "getSessionId", "setSessionId", EngineConstant.START_VAD, "", "getStartVAD", "()Ljava/lang/Boolean;", "setStartVAD", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getWakeupWord", "setWakeupWord", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class DmParameter {

    @NotNull
    private String aiType;

    @Nullable
    private String data;

    @Nullable
    private String echo;

    @Nullable
    private InternalError error;

    @NotNull
    private String recordId;

    @NotNull
    private String requestType;

    @NotNull
    private String round;

    @Nullable
    private String route;

    @NotNull
    private String sessionId;

    @Nullable
    private Boolean startVAD;

    @NotNull
    private String wakeupWord;

    public DmParameter(@NotNull String requestType, @NotNull String wakeupWord, @Nullable String str, @Nullable InternalError internalError) {
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(wakeupWord, "wakeupWord");
        this.requestType = requestType;
        this.wakeupWord = wakeupWord;
        this.data = str;
        this.error = internalError;
        this.sessionId = "";
        this.recordId = "";
        this.aiType = "";
        this.round = "";
    }

    public static /* synthetic */ DmParameter copy$default(DmParameter dmParameter, String str, String str2, String str3, InternalError internalError, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dmParameter.requestType;
        }
        if ((i & 2) != 0) {
            str2 = dmParameter.wakeupWord;
        }
        if ((i & 4) != 0) {
            str3 = dmParameter.data;
        }
        if ((i & 8) != 0) {
            internalError = dmParameter.error;
        }
        return dmParameter.copy(str, str2, str3, internalError);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequestType() {
        return this.requestType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWakeupWord() {
        return this.wakeupWord;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InternalError getError() {
        return this.error;
    }

    @NotNull
    public final DmParameter copy(@NotNull String requestType, @NotNull String wakeupWord, @Nullable String data, @Nullable InternalError error) {
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        Intrinsics.checkNotNullParameter(wakeupWord, "wakeupWord");
        return new DmParameter(requestType, wakeupWord, data, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DmParameter)) {
            return false;
        }
        DmParameter dmParameter = (DmParameter) other;
        return Intrinsics.areEqual(this.requestType, dmParameter.requestType) && Intrinsics.areEqual(this.wakeupWord, dmParameter.wakeupWord) && Intrinsics.areEqual(this.data, dmParameter.data) && Intrinsics.areEqual(this.error, dmParameter.error);
    }

    @NotNull
    public final String getAiType() {
        return this.aiType;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getEcho() {
        return this.echo;
    }

    @Nullable
    public final InternalError getError() {
        return this.error;
    }

    @NotNull
    public final String getRecordId() {
        return this.recordId;
    }

    @NotNull
    public final String getRequestType() {
        return this.requestType;
    }

    @NotNull
    public final String getRound() {
        return this.round;
    }

    @Nullable
    public final String getRoute() {
        return this.route;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final Boolean getStartVAD() {
        return this.startVAD;
    }

    @NotNull
    public final String getWakeupWord() {
        return this.wakeupWord;
    }

    public int hashCode() {
        int iHashCode = ((this.requestType.hashCode() * 31) + this.wakeupWord.hashCode()) * 31;
        String str = this.data;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        InternalError internalError = this.error;
        return iHashCode2 + (internalError != null ? internalError.hashCode() : 0);
    }

    public final void setAiType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aiType = str;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setEcho(@Nullable String str) {
        this.echo = str;
    }

    public final void setError(@Nullable InternalError internalError) {
        this.error = internalError;
    }

    public final void setRecordId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.recordId = str;
    }

    public final void setRequestType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.requestType = str;
    }

    public final void setRound(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.round = str;
    }

    public final void setRoute(@Nullable String str) {
        this.route = str;
    }

    public final void setSessionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sessionId = str;
    }

    public final void setStartVAD(@Nullable Boolean bool) {
        this.startVAD = bool;
    }

    public final void setWakeupWord(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wakeupWord = str;
    }

    @NotNull
    public String toString() {
        return "DmParameter(requestType='" + this.requestType + "', wakeupWord='" + this.wakeupWord + "', data=" + ((Object) this.data) + ", error=" + this.error + ", sessionId='" + this.sessionId + "', recordId='" + this.recordId + "', aiType='" + this.aiType + "', route='" + ((Object) this.route) + "',echo='" + ((Object) this.echo) + "')";
    }

    public /* synthetic */ DmParameter(String str, String str2, String str3, InternalError internalError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : internalError);
    }
}
