package com.oplus.aiunit.vision;

import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/gf7;", "", "", "a", "", "messageId", "b", "c", "<init>", "()V", "Companion", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class gf7 {
    public final void a() {
        c(null);
    }

    public final void b(@Nullable String messageId) {
        c(messageId);
    }

    public final void c(String messageId) {
        if (i37.b()) {
            return;
        }
        if (!(messageId == null || messageId.length() == 0)) {
            lf7.INSTANCE.m(messageId);
        }
        lf7 lf7Var = lf7.INSTANCE;
        if (!lf7Var.d()) {
            l25.c("FindPhoneHandler", "ignore ring signal by timeout fuse");
        } else if (lf7Var.e()) {
            l25.a("FindPhoneHandler", "mark next playing");
            lf7Var.n(true);
        } else {
            l25.a("FindPhoneHandler", "start playing");
            lf7Var.g().s().r();
        }
    }
}
