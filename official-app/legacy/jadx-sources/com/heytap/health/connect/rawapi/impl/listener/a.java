package com.heytap.health.connect.rawapi.impl.listener;

import android.util.ArraySet;
import com.oplus.aiunit.vision.je1;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/connect/rawapi/impl/listener/a;", "Lcom/heytap/health/connect/rawapi/impl/listener/LM4File;", "Lcom/oplus/aiunit/vision/je1$a;", "listener", "", "n0", "Landroid/util/ArraySet;", "z", "Landroid/util/ArraySet;", "mBinderDiedCallbackHolder", "<init>", "()V", "Companion", "a", "lib_heytapconnect_release"}, k = 1, mv = {1, 8, 0})
public class a extends LM4File {

    @NotNull
    public static final String NAME = "iheytap";

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final ArraySet<je1.a> mBinderDiedCallbackHolder = new ArraySet<>();

    public final void n0(@NotNull je1.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mBinderDiedCallbackHolder.add(listener);
    }
}
