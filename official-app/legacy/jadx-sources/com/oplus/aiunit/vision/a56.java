package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\t\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/a56;", "Lcom/oplus/aiunit/vision/p97;", "", "other", "", "equals", "", "hashCode", "Landroid/graphics/drawable/Drawable;", "a", "Landroid/graphics/drawable/Drawable;", "b", "()Landroid/graphics/drawable/Drawable;", ResourcesUtil.ResourceType.DRAWABLE, "Z", "c", "()Z", "isSampled", "Lcoil/decode/DataSource;", "Lcoil/decode/DataSource;", "()Lcoil/decode/DataSource;", "dataSource", "<init>", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;)V", "coil-base_release"}, k = 1, mv = {1, 9, 0})
public final class a56 extends p97 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Drawable drawable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isSampled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DataSource dataSource;

    public a56(@NotNull Drawable drawable, boolean z, @NotNull DataSource dataSource) {
        super(null);
        this.drawable = drawable;
        this.isSampled = z;
        this.dataSource = dataSource;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final DataSource getDataSource() {
        return this.dataSource;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Drawable getDrawable() {
        return this.drawable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsSampled() {
        return this.isSampled;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof a56) {
            a56 a56Var = (a56) other;
            if (Intrinsics.areEqual(this.drawable, a56Var.drawable) && this.isSampled == a56Var.isSampled && this.dataSource == a56Var.dataSource) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.drawable.hashCode() * 31) + Boolean.hashCode(this.isSampled)) * 31) + this.dataSource.hashCode();
    }
}
