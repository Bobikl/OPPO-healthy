package com.heytap.speech.engine.protocol.directive.recommend;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/recommend/RelativeText;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "Lcom/heytap/speech/engine/protocol/directive/recommend/TextCard;", "recommends", "Ljava/util/List;", "getRecommends", "()Ljava/util/List;", "setRecommends", "(Ljava/util/List;)V", "", "", "", "commercialData", "Ljava/util/Map;", "getCommercialData", "()Ljava/util/Map;", "setCommercialData", "(Ljava/util/Map;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class RelativeText extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.4";

    @JsonProperty("commercialData")
    @Nullable
    private Map<String, Object> commercialData;

    @JsonProperty("recommends")
    @Nullable
    private List<TextCard> recommends;

    @Nullable
    public final Map<String, Object> getCommercialData() {
        return this.commercialData;
    }

    @Nullable
    public final List<TextCard> getRecommends() {
        return this.recommends;
    }

    public final void setCommercialData(@Nullable Map<String, Object> map) {
        this.commercialData = map;
    }

    public final void setRecommends(@Nullable List<TextCard> list) {
        this.recommends = list;
    }
}
