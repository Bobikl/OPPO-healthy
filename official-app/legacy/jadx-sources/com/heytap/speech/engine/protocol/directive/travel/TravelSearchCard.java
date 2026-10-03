package com.heytap.speech.engine.protocol.directive.travel;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/travel/TravelSearchCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "searchTime", "Ljava/lang/Long;", "getSearchTime", "()Ljava/lang/Long;", "setSearchTime", "(Ljava/lang/Long;)V", "nowTime", "getNowTime", "setNowTime", "", "searchType", "Ljava/lang/String;", "getSearchType", "()Ljava/lang/String;", "setSearchType", "(Ljava/lang/String;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class TravelSearchCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Long nowTime;

    @Nullable
    private Long searchTime;

    @Nullable
    private String searchType;

    @Nullable
    public final Long getNowTime() {
        return this.nowTime;
    }

    @Nullable
    public final Long getSearchTime() {
        return this.searchTime;
    }

    @Nullable
    public final String getSearchType() {
        return this.searchType;
    }

    public final void setNowTime(@Nullable Long l2) {
        this.nowTime = l2;
    }

    public final void setSearchTime(@Nullable Long l2) {
        this.searchTime = l2;
    }

    public final void setSearchType(@Nullable String str) {
        this.searchType = str;
    }
}
