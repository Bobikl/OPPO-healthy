package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.alipay.sdk.m.x.d;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001e\u0010\u001f\u001a\u0004\u0018\u00010 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010&\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\r\"\u0004\b(\u0010\u000fR\u001c\u0010)\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010\u000fR\u001c\u0010,\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000fR\u001c\u0010/\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\r\"\u0004\b1\u0010\u000fR(\u00102\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u000204\u0018\u000103X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u00109\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\r\"\u0004\b;\u0010\u000fR\u001c\u0010<\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\r\"\u0004\b>\u0010\u000f¨\u0006?"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/RelatedItem;", "Ljava/io/Serializable;", "()V", "actionInfos", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "getActionInfos", "()Ljava/util/ArrayList;", "setActionInfos", "(Ljava/util/ArrayList;)V", "bgUrl", "", "getBgUrl", "()Ljava/lang/String;", "setBgUrl", "(Ljava/lang/String;)V", "darkBgUrl", "getDarkBgUrl", "setDarkBgUrl", "darkIcon", "getDarkIcon", "setDarkIcon", "darkSourceIcon", "getDarkSourceIcon", "setDarkSourceIcon", "icon", "getIcon", "setIcon", "priorityOpenAid", "getPriorityOpenAid", "setPriorityOpenAid", d.q, "", "getShowBackButton", "()Ljava/lang/Boolean;", "setShowBackButton", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "sourceIcon", "getSourceIcon", "setSourceIcon", "sourceName", "getSourceName", "setSourceName", Feedback.WIDGET_SUBTITLE, "getSubTitle", "setSubTitle", "title", "getTitle", "setTitle", "tracking", "Ljava/util/HashMap;", "", "getTracking", "()Ljava/util/HashMap;", "setTracking", "(Ljava/util/HashMap;)V", "type", "getType", "setType", "videoOpenAids", "getVideoOpenAids", "setVideoOpenAids", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class RelatedItem implements Serializable {

    @Nullable
    private ArrayList<ActionInfo> actionInfos;

    @Nullable
    private String bgUrl;

    @Nullable
    private String darkBgUrl;

    @Nullable
    private String darkIcon;

    @Nullable
    private String darkSourceIcon;

    @Nullable
    private String icon;

    @Nullable
    private String priorityOpenAid;

    @Nullable
    private Boolean showBackButton;

    @Nullable
    private String sourceIcon;

    @Nullable
    private String sourceName;

    @Nullable
    private String subTitle;

    @Nullable
    private String title;

    @Nullable
    private HashMap<String, Object> tracking;

    @Nullable
    private String type;

    @Nullable
    private String videoOpenAids;

    @Nullable
    public final ArrayList<ActionInfo> getActionInfos() {
        return this.actionInfos;
    }

    @Nullable
    public final String getBgUrl() {
        return this.bgUrl;
    }

    @Nullable
    public final String getDarkBgUrl() {
        return this.darkBgUrl;
    }

    @Nullable
    public final String getDarkIcon() {
        return this.darkIcon;
    }

    @Nullable
    public final String getDarkSourceIcon() {
        return this.darkSourceIcon;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getPriorityOpenAid() {
        return this.priorityOpenAid;
    }

    @Nullable
    public final Boolean getShowBackButton() {
        return this.showBackButton;
    }

    @Nullable
    public final String getSourceIcon() {
        return this.sourceIcon;
    }

    @Nullable
    public final String getSourceName() {
        return this.sourceName;
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
    public final HashMap<String, Object> getTracking() {
        return this.tracking;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getVideoOpenAids() {
        return this.videoOpenAids;
    }

    public final void setActionInfos(@Nullable ArrayList<ActionInfo> arrayList) {
        this.actionInfos = arrayList;
    }

    public final void setBgUrl(@Nullable String str) {
        this.bgUrl = str;
    }

    public final void setDarkBgUrl(@Nullable String str) {
        this.darkBgUrl = str;
    }

    public final void setDarkIcon(@Nullable String str) {
        this.darkIcon = str;
    }

    public final void setDarkSourceIcon(@Nullable String str) {
        this.darkSourceIcon = str;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setPriorityOpenAid(@Nullable String str) {
        this.priorityOpenAid = str;
    }

    public final void setShowBackButton(@Nullable Boolean bool) {
        this.showBackButton = bool;
    }

    public final void setSourceIcon(@Nullable String str) {
        this.sourceIcon = str;
    }

    public final void setSourceName(@Nullable String str) {
        this.sourceName = str;
    }

    public final void setSubTitle(@Nullable String str) {
        this.subTitle = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTracking(@Nullable HashMap<String, Object> map) {
        this.tracking = map;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setVideoOpenAids(@Nullable String str) {
        this.videoOpenAids = str;
    }
}
