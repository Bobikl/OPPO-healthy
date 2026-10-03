package com.heytap.speech.engine.protocol.directive.template;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.Action;
import com.sensorsdata.analytics.android.sdk.plugin.property.beans.SAPropertyFilter;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/template/OrdinaryBriefCard;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "title", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "imageUrl", "getImageUrl", "setImageUrl", "Lcom/heytap/speech/engine/protocol/directive/common/Action;", "action", "Lcom/heytap/speech/engine/protocol/directive/common/Action;", "getAction", "()Lcom/heytap/speech/engine/protocol/directive/common/Action;", "setAction", "(Lcom/heytap/speech/engine/protocol/directive/common/Action;)V", "", "Lcom/heytap/speech/engine/protocol/directive/template/Property;", SAPropertyFilter.PROPERTIES, "Ljava/util/List;", "getProperties", "()Ljava/util/List;", "setProperties", "(Ljava/util/List;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class OrdinaryBriefCard extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private Action action;

    @Nullable
    private String content;

    @Nullable
    private String imageUrl;

    @Nullable
    private List<Property> properties;

    @Nullable
    private String title;

    @Nullable
    public final Action getAction() {
        return this.action;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final List<Property> getProperties() {
        return this.properties;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setAction(@Nullable Action action) {
        this.action = action;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setImageUrl(@Nullable String str) {
        this.imageUrl = str;
    }

    public final void setProperties(@Nullable List<Property> list) {
        this.properties = list;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
