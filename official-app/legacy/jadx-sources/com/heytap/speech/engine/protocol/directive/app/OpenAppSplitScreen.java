package com.heytap.speech.engine.protocol.directive.app;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tRB\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u0001`\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/app/OpenAppSplitScreen;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/app/AppEntity;", "appList", "Ljava/util/ArrayList;", "getAppList", "()Ljava/util/ArrayList;", "setAppList", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "extend", "Ljava/util/HashMap;", "getExtend", "()Ljava/util/HashMap;", "setExtend", "(Ljava/util/HashMap;)V", "", "containTopApp", "Ljava/lang/Boolean;", "getContainTopApp", "()Ljava/lang/Boolean;", "setContainTopApp", "(Ljava/lang/Boolean;)V", "<init>", "()V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class OpenAppSplitScreen extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.2";

    @Nullable
    private ArrayList<AppEntity> appList;

    @Nullable
    private Boolean containTopApp;

    @Nullable
    private HashMap<String, Object> extend;

    @Nullable
    public final ArrayList<AppEntity> getAppList() {
        return this.appList;
    }

    @Nullable
    public final Boolean getContainTopApp() {
        return this.containTopApp;
    }

    @Nullable
    public final HashMap<String, Object> getExtend() {
        return this.extend;
    }

    public final void setAppList(@Nullable ArrayList<AppEntity> arrayList) {
        this.appList = arrayList;
    }

    public final void setContainTopApp(@Nullable Boolean bool) {
        this.containTopApp = bool;
    }

    public final void setExtend(@Nullable HashMap<String, Object> map) {
        this.extend = map;
    }
}
