package com.oplus.aiunit.vision;

import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b&\u0018\u0000 \n2\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0004¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/tz0;", "", "", "b", "c", "", "data", "a", "<init>", "()V", "Companion", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public abstract class tz0 {
    public final void a(@Nullable byte[] data) {
        lif lifVarA;
        if (data == null || (lifVarA = lif.INSTANCE.a()) == null) {
            return;
        }
        lifVarA.s(data);
    }

    public abstract void b();

    public abstract void c();
}
