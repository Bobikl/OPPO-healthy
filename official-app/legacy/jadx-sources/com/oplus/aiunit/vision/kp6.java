package com.oplus.aiunit.vision;

import android.net.http.SslError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/kp6;", "Lcom/oplus/aiunit/vision/yp9;", "handler", "", "c", "Lcom/oplus/aiunit/vision/pr9;", "fragment", "", "errorCode", "", iim.a.f, "", "b", "Landroid/net/http/SslError;", "error", "a", "", "Ljava/util/List;", "errorHandlers", "<init>", "()V", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final class kp6 implements yp9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final List<yp9> errorHandlers = new ArrayList();

    @Override // com.oplus.aiunit.vision.yp9
    public void a(@NotNull pr9 fragment, @NotNull SslError error) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(error, "error");
        List<yp9> list = this.errorHandlers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((yp9) it.next()).a(fragment, error);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.yp9
    public void b(@NotNull pr9 fragment, int errorCode, @NotNull String description) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(description, "description");
        List<yp9> list = this.errorHandlers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((yp9) it.next()).b(fragment, errorCode, description);
            }
        }
    }

    public final boolean c(@NotNull yp9 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.errorHandlers.add(handler);
    }
}
