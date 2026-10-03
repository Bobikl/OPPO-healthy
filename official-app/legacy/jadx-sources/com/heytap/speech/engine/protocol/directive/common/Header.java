package com.heytap.speech.engine.protocol.directive.common;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/common/Header;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "actionInfos", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "getActionInfos", "()Ljava/util/ArrayList;", "setActionInfos", "(Ljava/util/ArrayList;)V", "buttonLink", "", "getButtonLink", "()Ljava/lang/String;", "setButtonLink", "(Ljava/lang/String;)V", "buttonName", "getButtonName", "setButtonName", "darkIconUrl", "getDarkIconUrl", "setDarkIconUrl", "iconUrl", "getIconUrl", "setIconUrl", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Header extends DirectivePayload {

    @Nullable
    private ArrayList<ActionInfo> actionInfos;

    @Nullable
    private String buttonLink;

    @Nullable
    private String buttonName;

    @Nullable
    private String darkIconUrl;

    @Nullable
    private String iconUrl;

    @Nullable
    private String title;

    @Nullable
    public final ArrayList<ActionInfo> getActionInfos() {
        return this.actionInfos;
    }

    @Nullable
    public final String getButtonLink() {
        return this.buttonLink;
    }

    @Nullable
    public final String getButtonName() {
        return this.buttonName;
    }

    @Nullable
    public final String getDarkIconUrl() {
        return this.darkIconUrl;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setActionInfos(@Nullable ArrayList<ActionInfo> arrayList) {
        this.actionInfos = arrayList;
    }

    public final void setButtonLink(@Nullable String str) {
        this.buttonLink = str;
    }

    public final void setButtonName(@Nullable String str) {
        this.buttonName = str;
    }

    public final void setDarkIconUrl(@Nullable String str) {
        this.darkIconUrl = str;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
