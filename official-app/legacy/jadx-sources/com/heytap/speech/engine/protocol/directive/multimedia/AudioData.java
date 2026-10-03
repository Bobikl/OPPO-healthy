package com.heytap.speech.engine.protocol.directive.multimedia;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR:\u0010\n\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bj\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017¨\u0006!"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/multimedia/AudioData;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "duration", "", "getDuration", "()Ljava/lang/Long;", "setDuration", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "extend", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "imgUrl", "getImgUrl", "()Ljava/lang/String;", "setImgUrl", "(Ljava/lang/String;)V", "playUrl", "getPlayUrl", "setPlayUrl", Feedback.WIDGET_SUBTITLE, "getSubTitle", "setSubTitle", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class AudioData extends DirectivePayload {

    @Nullable
    private Long duration;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private String imgUrl;

    @Nullable
    private String playUrl;

    @Nullable
    private String subTitle;

    @Nullable
    private String title;

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    @Nullable
    public final String getPlayUrl() {
        return this.playUrl;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setDuration(@Nullable Long l2) {
        this.duration = l2;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setImgUrl(@Nullable String str) {
        this.imgUrl = str;
    }

    public final void setPlayUrl(@Nullable String str) {
        this.playUrl = str;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
