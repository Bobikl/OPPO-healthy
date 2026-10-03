package com.heytap.speech.engine.protocol.directive.notification;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import com.heytap.speech.engine.protocol.directive.common.commercial.ActionInfo;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b!\u0010\"R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R$\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/notification/NotificationMessage;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "sceneId", "Ljava/lang/Integer;", "getSceneId", "()Ljava/lang/Integer;", "setSceneId", "(Ljava/lang/Integer;)V", "notifyId", "getNotifyId", "setNotifyId", "", "notifyStrategy", "Ljava/lang/String;", "getNotifyStrategy", "()Ljava/lang/String;", "setNotifyStrategy", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "content", "getContent", "setContent", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/common/commercial/ActionInfo;", "actionInfos", "Ljava/util/ArrayList;", "getActionInfos", "()Ljava/util/ArrayList;", "setActionInfos", "(Ljava/util/ArrayList;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationMessage extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<ActionInfo> actionInfos;

    @Nullable
    private String content;

    @Nullable
    private Integer notifyId;

    @Nullable
    private String notifyStrategy;

    @Nullable
    private Integer sceneId;

    @Nullable
    private String title;

    @Nullable
    public final ArrayList<ActionInfo> getActionInfos() {
        return this.actionInfos;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Integer getNotifyId() {
        return this.notifyId;
    }

    @Nullable
    public final String getNotifyStrategy() {
        return this.notifyStrategy;
    }

    @Nullable
    public final Integer getSceneId() {
        return this.sceneId;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final void setActionInfos(@Nullable ArrayList<ActionInfo> arrayList) {
        this.actionInfos = arrayList;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setNotifyId(@Nullable Integer num) {
        this.notifyId = num;
    }

    public final void setNotifyStrategy(@Nullable String str) {
        this.notifyStrategy = str;
    }

    public final void setSceneId(@Nullable Integer num) {
        this.sceneId = num;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }
}
