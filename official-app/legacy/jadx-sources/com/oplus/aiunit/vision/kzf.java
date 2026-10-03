package com.oplus.aiunit.vision;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/kzf;", "Lcom/oplus/aiunit/vision/qw9;", "routerInterceptor", "", "b", "Landroid/content/Context;", "context", "Lcom/oplus/aiunit/vision/ezf;", "router", "", "a", "", "Ljava/util/List;", "routerInterceptors", "<init>", "()V", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final class kzf implements qw9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final List<qw9> routerInterceptors = new ArrayList();

    @Override // com.oplus.aiunit.vision.qw9
    public boolean a(@NotNull Context context, @NotNull RouterData router) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(router, "router");
        List<qw9> list = this.routerInterceptors;
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((qw9) it.next()).a(context, router)) {
                return true;
            }
        }
        return false;
    }

    public final void b(@NotNull qw9 routerInterceptor) {
        Intrinsics.checkNotNullParameter(routerInterceptor, "routerInterceptor");
        this.routerInterceptors.add(0, routerInterceptor);
    }
}
