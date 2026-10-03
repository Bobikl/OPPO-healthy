package com.heytap.speech.engine.protocol.event.payload.phonecall;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\b¨\u0006 "}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/phonecall/PhoneCallState;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "type", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "", "contactName", "Ljava/lang/String;", "getContactName", "()Ljava/lang/String;", "setContactName", "(Ljava/lang/String;)V", "contactCount", "getContactCount", "setContactCount", "numberCount", "getNumberCount", "setNumberCount", "simIndex", "getSimIndex", "setSimIndex", "selectIndex", "getSelectIndex", "setSelectIndex", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneCallState extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private Integer contactCount;

    @Nullable
    private String contactName;

    @Nullable
    private Integer numberCount;

    @Nullable
    private Integer selectIndex;

    @Nullable
    private String simIndex;

    @Nullable
    private Integer type;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.phonecall.PhoneCallState$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/phonecall/PhoneCallState$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return PhoneCallState.VERSION;
        }
    }

    @Nullable
    public final Integer getContactCount() {
        return this.contactCount;
    }

    @Nullable
    public final String getContactName() {
        return this.contactName;
    }

    @Nullable
    public final Integer getNumberCount() {
        return this.numberCount;
    }

    @Nullable
    public final Integer getSelectIndex() {
        return this.selectIndex;
    }

    @Nullable
    public final String getSimIndex() {
        return this.simIndex;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setContactCount(@Nullable Integer num) {
        this.contactCount = num;
    }

    public final void setContactName(@Nullable String str) {
        this.contactName = str;
    }

    public final void setNumberCount(@Nullable Integer num) {
        this.numberCount = num;
    }

    public final void setSelectIndex(@Nullable Integer num) {
        this.selectIndex = num;
    }

    public final void setSimIndex(@Nullable String str) {
        this.simIndex = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
