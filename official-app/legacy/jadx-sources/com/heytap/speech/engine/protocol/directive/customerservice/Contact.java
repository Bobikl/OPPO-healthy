package com.heytap.speech.engine.protocol.directive.customerservice;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.TrackingInfo;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b \u0010!R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR6\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/customerservice/Contact;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "reply", "Ljava/lang/String;", "getReply", "()Ljava/lang/String;", "setReply", "(Ljava/lang/String;)V", "Lcom/heytap/speech/engine/protocol/directive/customerservice/HeaderInfo;", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Lcom/heytap/speech/engine/protocol/directive/customerservice/HeaderInfo;", "getHeader", "()Lcom/heytap/speech/engine/protocol/directive/customerservice/HeaderInfo;", "setHeader", "(Lcom/heytap/speech/engine/protocol/directive/customerservice/HeaderInfo;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/customerservice/ContactInfo;", "Lkotlin/collections/ArrayList;", "contactList", "Ljava/util/ArrayList;", "getContactList", "()Ljava/util/ArrayList;", "setContactList", "(Ljava/util/ArrayList;)V", "Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "trackingInfo", "Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "getTrackingInfo", "()Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "setTrackingInfo", "(Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class Contact extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private ArrayList<ContactInfo> contactList;

    @Nullable
    private HeaderInfo header;

    @Nullable
    private String reply;

    @Nullable
    private TrackingInfo trackingInfo;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.customerservice.Contact$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/customerservice/Contact$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return Contact.VERSION;
        }
    }

    @Nullable
    public final ArrayList<ContactInfo> getContactList() {
        return this.contactList;
    }

    @Nullable
    public final HeaderInfo getHeader() {
        return this.header;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    public final void setContactList(@Nullable ArrayList<ContactInfo> arrayList) {
        this.contactList = arrayList;
    }

    public final void setHeader(@Nullable HeaderInfo headerInfo) {
        this.header = headerInfo;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setTrackingInfo(@Nullable TrackingInfo trackingInfo) {
        this.trackingInfo = trackingInfo;
    }
}
