package com.heytap.webview.extension;

import android.content.Context;
import com.heytap.webview.extension.activity.RouterData;
import com.heytap.webview.extension.config.IRouterInterceptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/heytap/webview/extension/RouterInterceptorGroup;", "Lcom/heytap/webview/extension/config/IRouterInterceptor;", "()V", "routerInterceptors", "", "add", "", "routerInterceptor", "intercept", "", "context", "Landroid/content/Context;", "router", "Lcom/heytap/webview/extension/activity/RouterData;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\ngroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 group.kt\ncom/heytap/webview/extension/RouterInterceptorGroup\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1855#2,2:85\n*S KotlinDebug\n*F\n+ 1 group.kt\ncom/heytap/webview/extension/RouterInterceptorGroup\n*L\n76#1:85,2\n*E\n"})
public final class RouterInterceptorGroup implements IRouterInterceptor {

    @NotNull
    private final List<IRouterInterceptor> routerInterceptors = new ArrayList();

    public final void add(@NotNull IRouterInterceptor routerInterceptor) {
        Intrinsics.checkNotNullParameter(routerInterceptor, "routerInterceptor");
        this.routerInterceptors.add(0, routerInterceptor);
    }

    @Override // com.heytap.webview.extension.config.IRouterInterceptor
    public boolean intercept(@NotNull Context context, @NotNull RouterData router) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(router, "router");
        List<IRouterInterceptor> list = this.routerInterceptors;
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((IRouterInterceptor) it.next()).intercept(context, router)) {
                return true;
            }
        }
        return false;
    }
}
