package com.heytap.speech.engine.protocol.event.payload.nlp;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import com.oplus.aiunit.vision.wka;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.ArrayList;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001<B\t\b\u0016¢\u0006\u0004\b8\u00109B\u001f\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b8\u0010:R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006\"\u0004\b\"\u0010\bR$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR$\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR*\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R0\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000201\u0018\u0001008G@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006="}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/nlp/TextEventPayload;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "text", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", ClickApiEntity.SET_TEXT, "(Ljava/lang/String;)V", "Lcom/heytap/speech/engine/protocol/event/payload/nlp/DeepLink;", "deeplink", "Lcom/heytap/speech/engine/protocol/event/payload/nlp/DeepLink;", "getDeeplink", "()Lcom/heytap/speech/engine/protocol/event/payload/nlp/DeepLink;", "setDeeplink", "(Lcom/heytap/speech/engine/protocol/event/payload/nlp/DeepLink;)V", "regenerate", "getRegenerate", "setRegenerate", "roomId", "getRoomId", "setRoomId", "asrRecordID", "getAsrRecordID", "setAsrRecordID", "", "asrResultEditStatus", "Ljava/lang/Integer;", "getAsrResultEditStatus", "()Ljava/lang/Integer;", "setAsrResultEditStatus", "(Ljava/lang/Integer;)V", "boxId", "getBoxId", "setBoxId", "invokeSource", "getInvokeSource", "setInvokeSource", "agentName", "getAgentName", "setAgentName", "Ljava/util/ArrayList;", "docRecordIds", "Ljava/util/ArrayList;", "getDocRecordIds", "()Ljava/util/ArrayList;", "setDocRecordIds", "(Ljava/util/ArrayList;)V", "", "", "liveData", "Ljava/util/Map;", "getLiveData", "()Ljava/util/Map;", "setLiveData", "(Ljava/util/Map;)V", "<init>", "()V", "(Ljava/lang/String;Lcom/heytap/speech/engine/protocol/event/payload/nlp/DeepLink;)V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class TextEventPayload extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.6";

    @Nullable
    private String agentName;

    @Nullable
    private String asrRecordID;

    @Nullable
    private Integer asrResultEditStatus;

    @Nullable
    private String boxId;

    @Nullable
    private DeepLink deeplink;

    @Nullable
    private ArrayList<String> docRecordIds;

    @Nullable
    private String invokeSource;

    @Nullable
    private Map<String, ? extends Object> liveData;

    @Nullable
    private String regenerate;

    @Nullable
    private String roomId;

    @Nullable
    private String text;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.nlp.TextEventPayload$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/nlp/TextEventPayload$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return TextEventPayload.VERSION;
        }
    }

    public TextEventPayload() {
    }

    @Nullable
    public final String getAgentName() {
        return this.agentName;
    }

    @Nullable
    public final String getAsrRecordID() {
        return this.asrRecordID;
    }

    @Nullable
    public final Integer getAsrResultEditStatus() {
        return this.asrResultEditStatus;
    }

    @Nullable
    public final String getBoxId() {
        return this.boxId;
    }

    @Nullable
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Nullable
    public final ArrayList<String> getDocRecordIds() {
        return this.docRecordIds;
    }

    @Nullable
    public final String getInvokeSource() {
        return this.invokeSource;
    }

    @wka
    @Nullable
    public final Map<String, Object> getLiveData() {
        return this.liveData;
    }

    @Nullable
    public final String getRegenerate() {
        return this.regenerate;
    }

    @Nullable
    public final String getRoomId() {
        return this.roomId;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setAgentName(@Nullable String str) {
        this.agentName = str;
    }

    public final void setAsrRecordID(@Nullable String str) {
        this.asrRecordID = str;
    }

    public final void setAsrResultEditStatus(@Nullable Integer num) {
        this.asrResultEditStatus = num;
    }

    public final void setBoxId(@Nullable String str) {
        this.boxId = str;
    }

    public final void setDeeplink(@Nullable DeepLink deepLink) {
        this.deeplink = deepLink;
    }

    public final void setDocRecordIds(@Nullable ArrayList<String> arrayList) {
        this.docRecordIds = arrayList;
    }

    public final void setInvokeSource(@Nullable String str) {
        this.invokeSource = str;
    }

    public final void setLiveData(@Nullable Map<String, ? extends Object> map) {
        this.liveData = map;
    }

    public final void setRegenerate(@Nullable String str) {
        this.regenerate = str;
    }

    public final void setRoomId(@Nullable String str) {
        this.roomId = str;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public TextEventPayload(@Nullable String str, @Nullable DeepLink deepLink) {
        this.text = str;
        this.deeplink = deepLink;
    }

    public /* synthetic */ TextEventPayload(String str, DeepLink deepLink, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : deepLink);
    }
}
