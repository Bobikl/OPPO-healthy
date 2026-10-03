package com.heytap.speech.engine.protocol.directive.docqa;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/docqa/DocEntity;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "icon", "", "getIcon", "()Ljava/lang/String;", "setIcon", "(Ljava/lang/String;)V", "link", "getLink", "setLink", "size", "getSize", "setSize", ClickApiEntity.TIME, "getTime", "setTime", "title", "getTitle", "setTitle", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DocEntity extends DirectivePayload {

    @Nullable
    private String icon;

    @Nullable
    private String link;

    @Nullable
    private String size;

    @Nullable
    private String time;

    @Nullable
    private String title;

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getSize() {
        return this.size;
    }

    @Nullable
    public final String getTime() {
        return this.time;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setIcon(@Nullable String str) {
        this.icon = str;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setSize(@Nullable String str) {
        this.size = str;
    }

    public final void setTime(@Nullable String str) {
        this.time = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
