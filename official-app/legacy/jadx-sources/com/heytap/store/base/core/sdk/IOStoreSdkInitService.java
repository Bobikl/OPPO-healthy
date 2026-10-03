package com.heytap.store.base.core.sdk;

import android.content.Context;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\nH&¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/base/core/sdk/IOStoreSdkInitService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "selfRecovery", "", "context", "Landroid/content/Context;", "appId", "", "channel", "initFinishCallBacK", "Lkotlin/Function0;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IOStoreSdkInitService extends IProvider {
    void selfRecovery(@NotNull Context context, @NotNull String appId, @NotNull String channel, @NotNull Function0<Unit> initFinishCallBacK);
}
