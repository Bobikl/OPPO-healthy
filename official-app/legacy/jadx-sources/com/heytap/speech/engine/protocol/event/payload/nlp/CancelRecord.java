package com.heytap.speech.engine.protocol.event.payload.nlp;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.ForceNewDialogPayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/nlp/CancelRecord;", "Lcom/heytap/speech/engine/protocol/event/ForceNewDialogPayload;", "", "roomId", "Ljava/lang/String;", "getRoomId", "()Ljava/lang/String;", "setRoomId", "(Ljava/lang/String;)V", "targetRecordId", "getTargetRecordId", "setTargetRecordId", "", "contentRender", "Ljava/lang/Boolean;", "getContentRender", "()Ljava/lang/Boolean;", "setContentRender", "(Ljava/lang/Boolean;)V", "Ljava/util/ArrayList;", "directives", "Ljava/util/ArrayList;", "getDirectives", "()Ljava/util/ArrayList;", "setDirectives", "(Ljava/util/ArrayList;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CancelRecord extends ForceNewDialogPayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private Boolean contentRender;

    @Nullable
    private ArrayList<String> directives;

    @Nullable
    private String roomId;

    @Nullable
    private String targetRecordId;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.nlp.CancelRecord$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/nlp/CancelRecord$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return CancelRecord.VERSION;
        }
    }

    @Nullable
    public final Boolean getContentRender() {
        return this.contentRender;
    }

    @Nullable
    public final ArrayList<String> getDirectives() {
        return this.directives;
    }

    @Nullable
    public final String getRoomId() {
        return this.roomId;
    }

    @Nullable
    public final String getTargetRecordId() {
        return this.targetRecordId;
    }

    public final void setContentRender(@Nullable Boolean bool) {
        this.contentRender = bool;
    }

    public final void setDirectives(@Nullable ArrayList<String> arrayList) {
        this.directives = arrayList;
    }

    public final void setRoomId(@Nullable String str) {
        this.roomId = str;
    }

    public final void setTargetRecordId(@Nullable String str) {
        this.targetRecordId = str;
    }
}
