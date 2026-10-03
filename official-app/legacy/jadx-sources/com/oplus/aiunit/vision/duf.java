package com.oplus.aiunit.vision;

import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/duf;", "", "Lcom/oplus/aiunit/vision/wr2;", "from", "Lcom/oplus/aiunit/vision/ytf;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "a", "<init>", "()V", "okhttp4_extension_release"}, k = 1, mv = {1, 4, 0})
public final class duf {
    public static final duf INSTANCE = new duf();

    @JvmStatic
    public static final void a(@Nullable wr2 from, @Nullable ytf response) {
        buf attachInfo;
        if (response == null || (attachInfo = response.getAttachInfo()) == null) {
            return;
        }
        attachInfo.b(ks2.f(from));
    }
}
