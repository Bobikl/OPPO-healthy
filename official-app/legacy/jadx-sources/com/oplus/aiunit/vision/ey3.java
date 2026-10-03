package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/ey3;", "", "", "d", "", "a", "Z", "b", "()Z", "f", "(Z)V", "socketSucc", "c", b2n.f, "tlsSucc", "", "Ljava/lang/String;", "()Ljava/lang/String;", MapSchema.FIELD_NAME_ENTRY, "(Ljava/lang/String;)V", "msg", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class ey3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean socketSucc;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean tlsSucc;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String msg;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSocketSucc() {
        return this.socketSucc;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getTlsSucc() {
        return this.tlsSucc;
    }

    public final void d() {
        this.socketSucc = false;
        this.tlsSucc = false;
        this.msg = null;
    }

    public final void e(@Nullable String str) {
        this.msg = str;
    }

    public final void f(boolean z) {
        this.socketSucc = z;
    }

    public final void g(boolean z) {
        this.tlsSucc = z;
    }
}
