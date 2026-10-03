package com.heytap.speech.engine.protocol.directive.aiagent;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.TrackingInfo;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.oplus.aiunit.vision.c8l;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 32\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b1\u00102R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR$\u0010#\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R0\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020*\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u00065"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/aiagent/GeneralJumpCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "icon", "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "darkIcon", "getDarkIcon", "setDarkIcon", "iconTitle", "getIconTitle", "setIconTitle", "showMore", "getShowMore", "setShowMore", "title", "getTitle", "setTitle", Feedback.WIDGET_SUBTITLE, "getSubTitle", "setSubTitle", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "actionInfo", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "getActionInfo", "()Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "setActionInfo", "(Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;)V", c8l.IMAGE_KEY, "getImage", "setImage", "Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "trackingInfo", "Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "getTrackingInfo", "()Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "setTrackingInfo", "(Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;)V", "Ljava/util/HashMap;", "", "params", "Ljava/util/HashMap;", "getParams", "()Ljava/util/HashMap;", "setParams", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class GeneralJumpCard extends DirectivePayload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ActionInfo actionInfo;

    @Nullable
    private String darkIcon;

    @Nullable
    private String icon;

    @Nullable
    private String iconTitle;

    @Nullable
    private String image;

    @Nullable
    private HashMap<String, Object> params;

    @Nullable
    private String showMore;

    @Nullable
    private String subTitle;

    @Nullable
    private String title;

    @Nullable
    private TrackingInfo trackingInfo;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.directive.aiagent.GeneralJumpCard$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/aiagent/GeneralJumpCard$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return GeneralJumpCard.VERSION;
        }
    }

    @Nullable
    public final ActionInfo getActionInfo() {
        return this.actionInfo;
    }

    @Nullable
    public final String getDarkIcon() {
        return this.darkIcon;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getIconTitle() {
        return this.iconTitle;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final HashMap<String, Object> getParams() {
        return this.params;
    }

    @Nullable
    public final String getShowMore() {
        return this.showMore;
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
    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    public final void setActionInfo(@Nullable ActionInfo actionInfo) {
        this.actionInfo = actionInfo;
    }

    public final void setDarkIcon(@Nullable String str) {
        this.darkIcon = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setIconTitle(@Nullable String str) {
        this.iconTitle = str;
    }

    public final void setImage(@Nullable String str) {
        this.image = str;
    }

    public final void setParams(@Nullable HashMap<String, Object> map) {
        this.params = map;
    }

    public final void setShowMore(@Nullable String str) {
        this.showMore = str;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTrackingInfo(@Nullable TrackingInfo trackingInfo) {
        this.trackingInfo = trackingInfo;
    }
}
