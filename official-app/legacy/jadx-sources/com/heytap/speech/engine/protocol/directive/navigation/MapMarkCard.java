package com.heytap.speech.engine.protocol.directive.navigation;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.TrackingInfo;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import com.oplus.aiunit.vision.c8l;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b;\u0010<R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006\"\u0004\b%\u0010\bR$\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR$\u0010)\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R0\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000204\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/navigation/MapMarkCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "textCard", "Ljava/lang/String;", "getTextCard", "()Ljava/lang/String;", "setTextCard", "(Ljava/lang/String;)V", "icon", "getIcon", "setIcon", "darkIcon", "getDarkIcon", "setDarkIcon", "iconTitle", "getIconTitle", "setIconTitle", "showMore", "getShowMore", "setShowMore", "title", "getTitle", "setTitle", "subtitle", "getSubtitle", "setSubtitle", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "actionInfos", "Ljava/util/ArrayList;", "getActionInfos", "()Ljava/util/ArrayList;", "setActionInfos", "(Ljava/util/ArrayList;)V", c8l.IMAGE_KEY, "getImage", "setImage", "mapId", "getMapId", "setMapId", "status", "getStatus", "setStatus", "Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "trackingInfo", "Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "getTrackingInfo", "()Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;", "setTrackingInfo", "(Lcom/heytap/speech/engine/protocol/directive/common/TrackingInfo;)V", "Ljava/util/HashMap;", "", "params", "Ljava/util/HashMap;", "getParams", "()Ljava/util/HashMap;", "setParams", "(Ljava/util/HashMap;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class MapMarkCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<ActionInfo> actionInfos;

    @Nullable
    private String darkIcon;

    @Nullable
    private String icon;

    @Nullable
    private String iconTitle;

    @Nullable
    private String image;

    @Nullable
    private String mapId;

    @Nullable
    private HashMap<String, Object> params;

    @Nullable
    private String showMore;

    @Nullable
    private String status;

    @Nullable
    private String subtitle;

    @Nullable
    private String textCard;

    @Nullable
    private String title;

    @Nullable
    private TrackingInfo trackingInfo;

    @Nullable
    public final ArrayList<ActionInfo> getActionInfos() {
        return this.actionInfos;
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
    public final String getMapId() {
        return this.mapId;
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
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTextCard() {
        return this.textCard;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    public final void setActionInfos(@Nullable ArrayList<ActionInfo> arrayList) {
        this.actionInfos = arrayList;
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

    public final void setMapId(@Nullable String str) {
        this.mapId = str;
    }

    public final void setParams(@Nullable HashMap<String, Object> map) {
        this.params = map;
    }

    public final void setShowMore(@Nullable String str) {
        this.showMore = str;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
    }

    public final void setSubtitle(@Nullable String str) {
        this.subtitle = str;
    }

    public final void setTextCard(@Nullable String str) {
        this.textCard = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTrackingInfo(@Nullable TrackingInfo trackingInfo) {
        this.trackingInfo = trackingInfo;
    }
}
