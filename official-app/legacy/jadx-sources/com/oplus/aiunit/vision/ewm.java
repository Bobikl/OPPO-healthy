package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ewm {

    @NotNull
    public final String a;

    @NotNull
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f11113c;

    @Nullable
    public final xvm d;

    public ewm(@NotNull String status, @NotNull String msg, @NotNull String traceId, @Nullable xvm xvmVar) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        this.a = status;
        this.b = msg;
        this.f11113c = traceId;
        this.d = xvmVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewm)) {
            return false;
        }
        ewm ewmVar = (ewm) obj;
        return Intrinsics.areEqual(this.a, ewmVar.a) && Intrinsics.areEqual(this.b, ewmVar.b) && Intrinsics.areEqual(this.f11113c, ewmVar.f11113c) && Intrinsics.areEqual(this.d, ewmVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f11113c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        xvm xvmVar = this.d;
        return iHashCode + (xvmVar == null ? 0 : xvmVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "EncryptResponseModel(status=" + this.a + ", msg=" + this.b + ", traceId=" + this.f11113c + ", data=" + this.d + ')';
    }
}
