package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/x25;", "", "other", "", "equals", "", "hashCode", "Landroid/graphics/drawable/Drawable;", "a", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", ResourcesUtil.ResourceType.DRAWABLE, "b", "Z", "()Z", "isSampled", "<init>", "(Landroid/graphics/drawable/Drawable;Z)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class x25 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Drawable drawable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isSampled;

    public x25(@NotNull Drawable drawable, boolean z) {
        this.drawable = drawable;
        this.isSampled = z;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsSampled() {
        return this.isSampled;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof x25) {
            x25 x25Var = (x25) other;
            if (Intrinsics.areEqual(this.drawable, x25Var.drawable) && this.isSampled == x25Var.isSampled) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.drawable.hashCode() * 31) + Boolean.hashCode(this.isSampled);
    }
}
