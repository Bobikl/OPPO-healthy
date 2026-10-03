package com.oplus.aiunit.vision;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/omk;", "Lcom/oplus/aiunit/vision/qz9;", "urlInterceptor", "", "b", "Lcom/oplus/aiunit/vision/pr9;", "fragment", "Landroid/net/Uri;", "oldUri", "newUri", "", "a", "", "Ljava/util/List;", "urlInterceptors", "<init>", "()V", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final class omk implements qz9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final List<qz9> urlInterceptors = new ArrayList();

    @Override // com.oplus.aiunit.vision.qz9
    public boolean a(@NotNull pr9 fragment, @NotNull Uri oldUri, @NotNull Uri newUri) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(oldUri, "oldUri");
        Intrinsics.checkNotNullParameter(newUri, "newUri");
        List<qz9> list = this.urlInterceptors;
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((qz9) it.next()).a(fragment, oldUri, newUri)) {
                return true;
            }
        }
        return false;
    }

    public final void b(@NotNull qz9 urlInterceptor) {
        Intrinsics.checkNotNullParameter(urlInterceptor, "urlInterceptor");
        this.urlInterceptors.add(0, urlInterceptor);
    }
}
