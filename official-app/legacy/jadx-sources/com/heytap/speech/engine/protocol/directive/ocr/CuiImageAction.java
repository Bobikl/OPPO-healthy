package com.heytap.speech.engine.protocol.directive.ocr;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.conditional.RouteInfo;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0007\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b5\u00106R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R0\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020!\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R$\u00102\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\b¨\u00069"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/ocr/CuiImageAction;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "", "type", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "title", "getTitle", "setTitle", Feedback.WIDGET_SUBTITLE, "getSubTitle", "setSubTitle", "btnText", "getBtnText", "setBtnText", "Lcom/heytap/speech/engine/protocol/directive/conditional/RouteInfo;", "routeInfo", "Lcom/heytap/speech/engine/protocol/directive/conditional/RouteInfo;", "getRouteInfo", "()Lcom/heytap/speech/engine/protocol/directive/conditional/RouteInfo;", "setRouteInfo", "(Lcom/heytap/speech/engine/protocol/directive/conditional/RouteInfo;)V", "Ljava/util/HashMap;", "", "penetrateData", "Ljava/util/HashMap;", "getPenetrateData", "()Ljava/util/HashMap;", "setPenetrateData", "(Ljava/util/HashMap;)V", "", "needRecognition", "Ljava/lang/Boolean;", "getNeedRecognition", "()Ljava/lang/Boolean;", "setNeedRecognition", "(Ljava/lang/Boolean;)V", "extend", "getExtend", "setExtend", "reply", "getReply", "setReply", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CuiImageAction extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private String btnText;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    private Boolean needRecognition;

    @Nullable
    private HashMap<String, Object> penetrateData;

    @Nullable
    private String reply;

    @Nullable
    private RouteInfo routeInfo;

    @Nullable
    private String subTitle;

    @Nullable
    private String title;

    @Nullable
    private Integer type;

    @Nullable
    private String url;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.ocr.CuiImageAction$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/ocr/CuiImageAction$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return CuiImageAction.VERSION;
        }
    }

    @Nullable
    public final String getBtnText() {
        return this.btnText;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    @Nullable
    public final Boolean getNeedRecognition() {
        return this.needRecognition;
    }

    @Nullable
    public final HashMap<String, Object> getPenetrateData() {
        return this.penetrateData;
    }

    @Nullable
    public final String getReply() {
        return this.reply;
    }

    @Nullable
    public final RouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setBtnText(@Nullable String str) {
        this.btnText = str;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }

    public final void setNeedRecognition(@Nullable Boolean bool) {
        this.needRecognition = bool;
    }

    public final void setPenetrateData(@Nullable HashMap<String, Object> map) {
        this.penetrateData = map;
    }

    public final void setReply(@Nullable String str) {
        this.reply = str;
    }

    public final void setRouteInfo(@Nullable RouteInfo routeInfo) {
        this.routeInfo = routeInfo;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
