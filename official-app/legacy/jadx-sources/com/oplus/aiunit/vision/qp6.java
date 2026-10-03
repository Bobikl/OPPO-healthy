package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/qp6;", "Lcom/oplus/aiunit/vision/m4a;", "", "other", "", "equals", "", "hashCode", "Landroid/graphics/drawable/Drawable;", "a", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", ResourcesUtil.ResourceType.DRAWABLE, "Lcoil/request/a;", "b", "Lcoil/request/a;", "()Lcoil/request/a;", "request", "", "c", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "throwable", "<init>", "(Landroid/graphics/drawable/Drawable;Lcoil/request/a;Ljava/lang/Throwable;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class qp6 extends m4a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final Drawable drawable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final coil.request.a request;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Throwable throwable;

    public qp6(@Nullable Drawable drawable, @NotNull coil.request.a aVar, @NotNull Throwable th) {
        super(null);
        this.drawable = drawable;
        this.request = aVar;
        this.throwable = th;
    }

    @Override // com.oplus.aiunit.vision.m4a
    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public Drawable getDrawable() {
        return this.drawable;
    }

    @Override // com.oplus.aiunit.vision.m4a
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public coil.request.a getRequest() {
        return this.request;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof qp6) {
            qp6 qp6Var = (qp6) other;
            if (Intrinsics.areEqual(getDrawable(), qp6Var.getDrawable()) && Intrinsics.areEqual(getRequest(), qp6Var.getRequest()) && Intrinsics.areEqual(this.throwable, qp6Var.throwable)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Drawable drawable = getDrawable();
        return ((((drawable != null ? drawable.hashCode() : 0) * 31) + getRequest().hashCode()) * 31) + this.throwable.hashCode();
    }
}
