package com.heytap.speech.engine.protocol.directive.customerservice;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.TrackingInfo;
import com.platform.sdk.center.cons.AcConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b!\u0010\"R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/customerservice/TextAnswer;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "content", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "speakContent", "getSpeakContent", "setSpeakContent", "", "foldLineCount", "Ljava/lang/Integer;", "getFoldLineCount", "()Ljava/lang/Integer;", "setFoldLineCount", "(Ljava/lang/Integer;)V", "", AcConstants.K_HTML, "Ljava/lang/Boolean;", "getHtml", "()Ljava/lang/Boolean;", "setHtml", "(Ljava/lang/Boolean;)V", "Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "trackingInfo", "Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "getTrackingInfo", "()Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "setTrackingInfo", "(Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class TextAnswer extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String content;

    @Nullable
    private Integer foldLineCount;

    @Nullable
    private Boolean html;

    @Nullable
    private String speakContent;

    @Nullable
    private TrackingInfo trackingInfo;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.customerservice.TextAnswer$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/customerservice/TextAnswer$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return TextAnswer.VERSION;
        }
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Integer getFoldLineCount() {
        return this.foldLineCount;
    }

    @Nullable
    public final Boolean getHtml() {
        return this.html;
    }

    @Nullable
    public final String getSpeakContent() {
        return this.speakContent;
    }

    @Nullable
    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setFoldLineCount(@Nullable Integer num) {
        this.foldLineCount = num;
    }

    public final void setHtml(@Nullable Boolean bool) {
        this.html = bool;
    }

    public final void setSpeakContent(@Nullable String str) {
        this.speakContent = str;
    }

    public final void setTrackingInfo(@Nullable TrackingInfo trackingInfo) {
        this.trackingInfo = trackingInfo;
    }
}
