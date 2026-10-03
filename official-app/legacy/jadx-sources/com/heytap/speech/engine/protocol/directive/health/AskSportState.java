package com.heytap.speech.engine.protocol.directive.health;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/health/AskSportState;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "category", "Ljava/lang/String;", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "timeType", "getTimeType", "setTimeType", "startTime", "getStartTime", "setStartTime", "endTime", "getEndTime", "setEndTime", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class AskSportState extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String category;

    @Nullable
    private String endTime;

    @Nullable
    private String startTime;

    @Nullable
    private String timeType;

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final String getTimeType() {
        return this.timeType;
    }

    public final void setCategory(@Nullable String str) {
        this.category = str;
    }

    public final void setEndTime(@Nullable String str) {
        this.endTime = str;
    }

    public final void setStartTime(@Nullable String str) {
        this.startTime = str;
    }

    public final void setTimeType(@Nullable String str) {
        this.timeType = str;
    }
}
