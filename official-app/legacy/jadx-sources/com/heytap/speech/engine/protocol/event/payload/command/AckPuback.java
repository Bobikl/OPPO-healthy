package com.heytap.speech.engine.protocol.event.payload.command;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/command/AckPuback;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "type", "", "", "(Ljava/util/List;)V", "getType", "()Ljava/util/List;", "setType", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class AckPuback extends Payload {

    @Nullable
    private List<String> type;

    /* JADX WARN: Multi-variable type inference failed */
    public AckPuback() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AckPuback copy$default(AckPuback ackPuback, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ackPuback.type;
        }
        return ackPuback.copy(list);
    }

    @Nullable
    public final List<String> component1() {
        return this.type;
    }

    @NotNull
    public final AckPuback copy(@Nullable List<String> type) {
        return new AckPuback(type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AckPuback) && Intrinsics.areEqual(this.type, ((AckPuback) other).type);
    }

    @Nullable
    public final List<String> getType() {
        return this.type;
    }

    public int hashCode() {
        List<String> list = this.type;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setType(@Nullable List<String> list) {
        this.type = list;
    }

    @NotNull
    public String toString() {
        return "AckPuback(type=" + this.type + ')';
    }

    public /* synthetic */ AckPuback(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    public AckPuback(@Nullable List<String> list) {
        this.type = list;
    }
}
