package com.heytap.speech.engine.protocol.event.payload.analogclick;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R.\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\b\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/analogclick/Feedback;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "key", "value", "", "addExtra", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", Feedback.WIDGET_TYPE_EX, "getDuiWidget", "setDuiWidget", "Ljava/util/HashMap;", "extra", "Ljava/util/HashMap;", "getExtra", "()Ljava/util/HashMap;", "", "extend", "getExtend", "setExtend", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class Feedback extends Payload {

    @NotNull
    public static final String TYPE_CONTENT = "content";

    @NotNull
    public static final String TYPE_LIST = "list";

    @NotNull
    public static final String TYPE_MEDIA = "media";

    @NotNull
    public static final String TYPE_TEXT = "text";

    @NotNull
    public static final String TYPE_WEB = "web";

    @NotNull
    private static final String WIDGET_CONTENT = "content";

    @NotNull
    private static final String WIDGET_COUNT = "count";

    @NotNull
    public static final String WIDGET_EXTRA = "extra";

    @NotNull
    public static final String WIDGET_IMAGEURL = "imageUrl";

    @NotNull
    public static final String WIDGET_LABEL = "label";

    @NotNull
    public static final String WIDGET_LINKURL = "linkUrl";

    @NotNull
    public static final String WIDGET_SUBTITLE = "subTitle";

    @NotNull
    public static final String WIDGET_TEXT = "text";

    @NotNull
    public static final String WIDGET_TITLE = "title";

    @NotNull
    private static final String WIDGET_TYPE = "type";

    @NotNull
    private static final String WIDGET_TYPE_EX = "duiWidget";

    @NotNull
    public static final String WIDGET_URL = "url";

    @Nullable
    private String duiWidget;

    @Nullable
    private HashMap<String, Object> extend;

    @NotNull
    private final HashMap<String, String> extra = new HashMap<>();

    @Nullable
    private String type;

    @NotNull
    private static final String VERSION = "2.0";

    public final void addExtra(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.extra.put(key, value);
    }

    @Nullable
    public final String getDuiWidget() {
        return this.duiWidget;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @NotNull
    public final HashMap<String, String> getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public final void setDuiWidget(@Nullable String str) {
        this.duiWidget = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setType(@Nullable String str) {
        this.duiWidget = str;
        this.type = str;
    }
}
