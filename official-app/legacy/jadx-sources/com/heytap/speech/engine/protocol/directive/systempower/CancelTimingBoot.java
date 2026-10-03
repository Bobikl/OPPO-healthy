package com.heytap.speech.engine.protocol.directive.systempower;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/systempower/CancelTimingBoot;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "confirmation", "Ljava/lang/Boolean;", "getConfirmation", "()Ljava/lang/Boolean;", "setConfirmation", "(Ljava/lang/Boolean;)V", "", "hour", "Ljava/lang/String;", "getHour", "()Ljava/lang/String;", "setHour", "(Ljava/lang/String;)V", "minute", "getMinute", "setMinute", "second", "getSecond", "setSecond", "", "", "repeat", "Ljava/util/List;", "getRepeat", "()Ljava/util/List;", "setRepeat", "(Ljava/util/List;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CancelTimingBoot extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Boolean confirmation;

    @Nullable
    private String hour;

    @Nullable
    private String minute;

    @Nullable
    private List<Integer> repeat;

    @Nullable
    private String second;

    @Nullable
    public final Boolean getConfirmation() {
        return this.confirmation;
    }

    @Nullable
    public final String getHour() {
        return this.hour;
    }

    @Nullable
    public final String getMinute() {
        return this.minute;
    }

    @Nullable
    public final List<Integer> getRepeat() {
        return this.repeat;
    }

    @Nullable
    public final String getSecond() {
        return this.second;
    }

    public final void setConfirmation(@Nullable Boolean bool) {
        this.confirmation = bool;
    }

    public final void setHour(@Nullable String str) {
        this.hour = str;
    }

    public final void setMinute(@Nullable String str) {
        this.minute = str;
    }

    public final void setRepeat(@Nullable List<Integer> list) {
        this.repeat = list;
    }

    public final void setSecond(@Nullable String str) {
        this.second = str;
    }
}
