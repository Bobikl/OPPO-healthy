package com.heytap.speech.engine.protocol.directive.app;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u001f\u0010 R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR6\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\b¨\u0006#"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/app/OperateApp;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "type", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/app/AppEntity;", "Lkotlin/collections/ArrayList;", "appList", "Ljava/util/ArrayList;", "getAppList", "()Ljava/util/ArrayList;", "setAppList", "(Ljava/util/ArrayList;)V", "", "existsReply", "Ljava/lang/String;", "getExistsReply", "()Ljava/lang/String;", "setExistsReply", "(Ljava/lang/String;)V", "notExistsReply", "getNotExistsReply", "setNotExistsReply", "index", "getIndex", "setIndex", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class OperateApp extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<AppEntity> appList;

    @Nullable
    private String existsReply;

    @Nullable
    private Integer index;

    @Nullable
    private String notExistsReply;

    @Nullable
    private Integer type;

    @Nullable
    public final ArrayList<AppEntity> getAppList() {
        return this.appList;
    }

    @Nullable
    public final String getExistsReply() {
        return this.existsReply;
    }

    @Nullable
    public final Integer getIndex() {
        return this.index;
    }

    @Nullable
    public final String getNotExistsReply() {
        return this.notExistsReply;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public final void setAppList(@Nullable ArrayList<AppEntity> arrayList) {
        this.appList = arrayList;
    }

    public final void setExistsReply(@Nullable String str) {
        this.existsReply = str;
    }

    public final void setIndex(@Nullable Integer num) {
        this.index = num;
    }

    public final void setNotExistsReply(@Nullable String str) {
        this.notExistsReply = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }
}
