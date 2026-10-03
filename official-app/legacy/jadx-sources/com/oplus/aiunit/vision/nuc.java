package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/nuc;", "Lcom/oplus/aiunit/vision/nak;", "", "a", "Lcom/oplus/aiunit/vision/rak;", "Lcom/oplus/aiunit/vision/rak;", "target", "Lcom/oplus/aiunit/vision/m4a;", "b", "Lcom/oplus/aiunit/vision/m4a;", "result", "<init>", "(Lcom/oplus/aiunit/vision/rak;Lcom/oplus/aiunit/vision/m4a;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class nuc implements nak {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final rak target;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final m4a result;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/nuc$a;", "Lcom/oplus/aiunit/vision/nak$a;", "Lcom/oplus/aiunit/vision/rak;", "target", "Lcom/oplus/aiunit/vision/m4a;", "result", "Lcom/oplus/aiunit/vision/nak;", "a", "", "other", "", "equals", "", "hashCode", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
    public static final class a implements nak.a {
        @Override // com.oplus.aiunit.vision.nak.a
        @NotNull
        public nak a(@NotNull rak target, @NotNull m4a result) {
            return new nuc(target, result);
        }

        public boolean equals(@Nullable Object other) {
            return other instanceof a;
        }

        public int hashCode() {
            return a.class.hashCode();
        }
    }

    public nuc(@NotNull rak rakVar, @NotNull m4a m4aVar) {
        this.target = rakVar;
        this.result = m4aVar;
    }

    @Override // com.oplus.aiunit.vision.nak
    public void a() {
        m4a m4aVar = this.result;
        if (m4aVar instanceof f3j) {
            this.target.a(((f3j) m4aVar).getDrawable());
        } else if (m4aVar instanceof qp6) {
            this.target.c(m4aVar.getDrawable());
        }
    }
}
