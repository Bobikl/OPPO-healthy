package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class xvm {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    public xvm(@NotNull String iv, @NotNull String encryptContent) {
        Intrinsics.checkNotNullParameter(iv, "iv");
        Intrinsics.checkNotNullParameter(encryptContent, "encryptContent");
        this.a = iv;
        this.b = encryptContent;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvm)) {
            return false;
        }
        xvm xvmVar = (xvm) obj;
        return Intrinsics.areEqual(this.a, xvmVar.a) && Intrinsics.areEqual(this.b, xvmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "EncryptDataModel(iv=" + this.a + ", encryptContent=" + this.b + ')';
    }
}
