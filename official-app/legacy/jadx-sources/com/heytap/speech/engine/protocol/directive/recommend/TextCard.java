package com.heytap.speech.engine.protocol.directive.recommend;

import androidx.annotation.Keep;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.Action;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR,\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR \u0010 \u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR \u0010#\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR \u0010&\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001c¨\u0006)"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/recommend/TextCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "action", "Lcom/heytap/speech/engine/protocol/directive/common/Action;", "getAction", "()Lcom/heytap/speech/engine/protocol/directive/common/Action;", "setAction", "(Lcom/heytap/speech/engine/protocol/directive/common/Action;)V", "actionInfos", "", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "getActionInfos", "()Ljava/util/List;", "setActionInfos", "(Ljava/util/List;)V", "commercialResInfo", "", "", "", "getCommercialResInfo", "()Ljava/util/Map;", "setCommercialResInfo", "(Ljava/util/Map;)V", "content", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "exitDialog", "getExitDialog", "setExitDialog", "frontIcon", "getFrontIcon", "setFrontIcon", "id", "getId", "setId", "labelPic", "getLabelPic", "setLabelPic", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TextCard extends DirectivePayload {

    @JsonProperty("action")
    @Nullable
    private Action action;

    @JsonProperty("actionInfos")
    @Nullable
    private List<ActionInfo> actionInfos;

    @JsonProperty("commercialResInfo")
    @Nullable
    private Map<String, ? extends Object> commercialResInfo;

    @JsonProperty("content")
    @Nullable
    private String content;

    @JsonProperty("exitDialog")
    @Nullable
    private String exitDialog;

    @JsonProperty("frontIcon")
    @Nullable
    private String frontIcon;

    @JsonProperty("id")
    @Nullable
    private String id;

    @JsonProperty("labelPic")
    @Nullable
    private String labelPic;

    @Nullable
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    public final List<ActionInfo> getActionInfos() {
        return this.actionInfos;
    }

    @Nullable
    public final Map<String, Object> getCommercialResInfo() {
        return this.commercialResInfo;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getExitDialog() {
        return this.exitDialog;
    }

    @Nullable
    public final String getFrontIcon() {
        return this.frontIcon;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLabelPic() {
        return this.labelPic;
    }

    public final void setAction(@Nullable Action action) {
        this.action = action;
    }

    public final void setActionInfos(@Nullable List<ActionInfo> list) {
        this.actionInfos = list;
    }

    public final void setCommercialResInfo(@Nullable Map<String, ? extends Object> map) {
        this.commercialResInfo = map;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setExitDialog(@Nullable String str) {
        this.exitDialog = str;
    }

    public final void setFrontIcon(@Nullable String str) {
        this.frontIcon = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setLabelPic(@Nullable String str) {
        this.labelPic = str;
    }
}
