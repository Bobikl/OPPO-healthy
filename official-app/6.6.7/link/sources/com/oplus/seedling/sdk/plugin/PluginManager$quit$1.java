package com.oplus.seedling.sdk.plugin;

import com.oplusos.sau.common.utils.SauAarConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.oplus.seedling.sdk.plugin.PluginManager", f = "PluginManager.kt", i = {0}, l = {323}, m = "quit$pantanal_client_release", n = {"this"}, s = {"L$0"})
public final class PluginManager$quit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PluginManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PluginManager$quit$1(PluginManager pluginManager, Continuation<? super PluginManager$quit$1> continuation) {
        super(continuation);
        this.this$0 = pluginManager;
    }

    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= SauAarConstants.I;
        return this.this$0.quit$pantanal_client_release(this);
    }
}
