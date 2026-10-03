package com.heytap.speech.engine.protocol.directive.app;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/app/AddOrReplaceSplitScreen;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/app/AppEntity;", "appList", "Ljava/util/ArrayList;", "getAppList", "()Ljava/util/ArrayList;", "setAppList", "(Ljava/util/ArrayList;)V", "replaceAppList", "getReplaceAppList", "setReplaceAppList", "", "splitType", "Ljava/lang/String;", "getSplitType", "()Ljava/lang/String;", "setSplitType", "(Ljava/lang/String;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class AddOrReplaceSplitScreen extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private ArrayList<AppEntity> appList;

    @Nullable
    private ArrayList<AppEntity> replaceAppList;

    @Nullable
    private String splitType;

    @Nullable
    public final ArrayList<AppEntity> getAppList() {
        return this.appList;
    }

    @Nullable
    public final ArrayList<AppEntity> getReplaceAppList() {
        return this.replaceAppList;
    }

    @Nullable
    public final String getSplitType() {
        return this.splitType;
    }

    public final void setAppList(@Nullable ArrayList<AppEntity> arrayList) {
        this.appList = arrayList;
    }

    public final void setReplaceAppList(@Nullable ArrayList<AppEntity> arrayList) {
        this.replaceAppList = arrayList;
    }

    public final void setSplitType(@Nullable String str) {
        this.splitType = str;
    }
}
