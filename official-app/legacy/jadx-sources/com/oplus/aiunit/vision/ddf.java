package com.oplus.aiunit.vision;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import coil.size.ViewSizeResolver;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u000e\u001a\u00028\u0000\u0012\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000e\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/ddf;", "Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "Lcoil/size/ViewSizeResolver;", "", "other", "", "equals", "", "hashCode", "a", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "b", "Z", "d", "()Z", "subtractPadding", "<init>", "(Landroid/view/View;Z)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class ddf<T extends View> implements ViewSizeResolver<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final T view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean subtractPadding;

    public ddf(@NotNull T t, boolean z) {
        this.view = t;
        this.subtractPadding = z;
    }

    @Override // coil.size.ViewSizeResolver
    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getSubtractPadding() {
        return this.subtractPadding;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ddf) {
            ddf ddfVar = (ddf) other;
            if (Intrinsics.areEqual(getView(), ddfVar.getView()) && getSubtractPadding() == ddfVar.getSubtractPadding()) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.size.ViewSizeResolver
    @NotNull
    public T getView() {
        return this.view;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + Boolean.hashCode(getSubtractPadding());
    }
}
