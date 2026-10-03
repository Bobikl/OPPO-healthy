package com.heytap.speech.engine.protocol.directive.exclusiveai;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleBlankTimeCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Header;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Header;", "getHeader", "()Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Header;", "setHeader", "(Lcom/heytap/speech/engine/protocol/directive/exclusiveai/Header;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleBlankTime;", "blankTimeList", "Ljava/util/ArrayList;", "getBlankTimeList", "()Ljava/util/ArrayList;", "setBlankTimeList", "(Ljava/util/ArrayList;)V", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleBlankTimeCard extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<ScheduleBlankTime> blankTimeList;

    @Nullable
    private Header header;

    @Nullable
    private String reply;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.exclusiveai.ScheduleBlankTimeCard$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/exclusiveai/ScheduleBlankTimeCard$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return ScheduleBlankTimeCard.VERSION;
        }
    }

    @Nullable
    public final ArrayList<ScheduleBlankTime> getBlankTimeList() {
        return this.blankTimeList;
    }

    @Nullable
    public final Header getHeader() {
        return this.header;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    public final void setBlankTimeList(@Nullable ArrayList<ScheduleBlankTime> arrayList) {
        this.blankTimeList = arrayList;
    }

    public final void setHeader(@Nullable Header header) {
        this.header = header;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }
}
