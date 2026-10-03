package com.oplus.aiunit.vision;

import android.webkit.ConsoleMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/oplus/aiunit/vision/yz3;", "Lcom/oplus/aiunit/vision/fo9;", "messager", "", "a", "Landroid/webkit/ConsoleMessage;", "message", "", "output", "", "Ljava/util/List;", "messagers", "<init>", "()V", "lib_webpro_release"}, k = 1, mv = {1, 4, 0})
public final class yz3 implements fo9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final List<fo9> messagers = new ArrayList();

    public final boolean a(@NotNull fo9 messager) {
        Intrinsics.checkNotNullParameter(messager, "messager");
        return this.messagers.add(messager);
    }

    @Override // com.oplus.aiunit.vision.fo9
    public void output(@NotNull ConsoleMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        List<fo9> list = this.messagers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((fo9) it.next()).output(message);
            }
        }
    }
}
