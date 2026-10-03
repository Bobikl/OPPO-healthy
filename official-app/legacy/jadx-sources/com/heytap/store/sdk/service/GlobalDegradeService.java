package com.heytap.store.sdk.service;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import com.heytap.store.base.core.util.deeplink.interceptor.LoginInterceptor;
import com.heytap.store.platform.htrouter.facade.PostCard;
import com.heytap.store.platform.htrouter.facade.annotations.Route;
import com.heytap.store.platform.htrouter.facade.service.DegradeService;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouterKt;
import com.heytap.store.platform.tools.ToastUtils;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Route(path = "/service/GlobalDegradeService")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/sdk/service/GlobalDegradeService;", "Lcom/heytap/store/platform/htrouter/facade/service/DegradeService;", "()V", "init", "", "p0", "Landroid/content/Context;", "onLost", "context", "postcard", "Lcom/heytap/store/platform/htrouter/facade/Postcard;", "heytapstoresdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GlobalDegradeService implements DegradeService {
    @Override // com.heytap.store.platform.htrouter.facade.template.IProvider
    public void init(@Nullable Context p0) {
    }

    @Override // com.heytap.store.platform.htrouter.facade.service.DegradeService
    public void onLost(@Nullable Context context, @Nullable PostCard postcard) {
        String originalUrl;
        Bundle bundle;
        boolean z = (postcard == null || (bundle = postcard.getBundle()) == null) ? false : bundle.getBoolean("need_login");
        if ((postcard != null ? postcard.getContext() : null) instanceof Application) {
            ToastUtils.show$default(ToastUtils.INSTANCE, "Error: context is Application.", 0, 0, 0, 14, (Object) null);
            return;
        }
        if (postcard == null || (originalUrl = HTAliasRouterKt.getOriginalUrl(postcard)) == null) {
            originalUrl = "";
        }
        DeepLinkInterpreter deepLinkInterpreter = new DeepLinkInterpreter(originalUrl, z ? new LoginInterceptor() : null);
        Context context2 = postcard != null ? postcard.getContext() : null;
        Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type android.app.Activity");
        deepLinkInterpreter.operate((Activity) context2, null);
    }
}
