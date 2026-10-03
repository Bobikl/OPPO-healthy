package com.oplus.aiunit.vision;

import coil.size.Size;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/xcf;", "Lcom/oplus/aiunit/vision/m7h;", "Lcoil/size/e;", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "other", "", "equals", "", "hashCode", "Lcoil/size/e;", "size", "<init>", "(Lcoil/size/e;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class xcf implements m7h {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Size size;

    public xcf(@NotNull Size size) {
        this.size = size;
    }

    @Override // com.oplus.aiunit.vision.m7h
    @Nullable
    public Object a(@NotNull Continuation<? super Size> continuation) {
        return this.size;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof xcf) && Intrinsics.areEqual(this.size, ((xcf) other).size);
    }

    public int hashCode() {
        return this.size.hashCode();
    }
}
