package com.heytap.speech.engine.protocol.directive.album;

import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/album/Time;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "date", "", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "festival", "getFestival", "setFestival", "month", "getMonth", "setMonth", "year", "getYear", "setYear", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Time extends DirectivePayload {

    @Nullable
    private String date;

    @Nullable
    private String festival;

    @Nullable
    private String month;

    @Nullable
    private String year;

    @Nullable
    public final String getDate() {
        return this.date;
    }

    @Nullable
    public final String getFestival() {
        return this.festival;
    }

    @Nullable
    public final String getMonth() {
        return this.month;
    }

    @Nullable
    public final String getYear() {
        return this.year;
    }

    public final void setDate(@Nullable String str) {
        this.date = str;
    }

    public final void setFestival(@Nullable String str) {
        this.festival = str;
    }

    public final void setMonth(@Nullable String str) {
        this.month = str;
    }

    public final void setYear(@Nullable String str) {
        this.year = str;
    }
}
