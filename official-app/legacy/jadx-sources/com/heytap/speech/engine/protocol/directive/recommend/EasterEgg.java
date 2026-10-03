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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R0\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/recommend/EasterEgg;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "", "Lcom/heytap/speech/engine/protocol/directive/recommend/EasterEggInfo;", "easterEggInfos", "Ljava/util/List;", "getEasterEggInfos", "()Ljava/util/List;", "setEasterEggInfos", "(Ljava/util/List;)V", "", "", "extend", "Ljava/util/Map;", "getExtend", "()Ljava/util/Map;", "setExtend", "(Ljava/util/Map;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class EasterEgg extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.2";

    @JsonProperty("easterEggInfos")
    @Nullable
    private List<EasterEggInfo> easterEggInfos;

    @JsonProperty("extend")
    @Nullable
    private Map<String, ? extends Object> extend;

    @JsonProperty("title")
    @Nullable
    private String title;

    @Nullable
    public final List<EasterEggInfo> getEasterEggInfos() {
        return this.easterEggInfos;
    }

    @Nullable
    public final Map<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setEasterEggInfos(@Nullable List<EasterEggInfo> list) {
        this.easterEggInfos = list;
    }

    public final void setExtend(@Nullable Map<String, ? extends Object> map) {
        this.extend = map;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
