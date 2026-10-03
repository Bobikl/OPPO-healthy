package com.oplus.deviceui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.animation.Animation;
import android.widget.ImageView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/oplus/deviceui/RotatableImageView;", "Landroid/widget/ImageView;", "Landroid/view/animation/Animation;", "i", "Landroid/view/animation/Animation;", "getMRotationAnim", "()Landroid/view/animation/Animation;", "setMRotationAnim", "(Landroid/view/animation/Animation;)V", "mRotationAnim", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
@SuppressLint({"AppCompatCustomView"})
public final class RotatableImageView extends ImageView {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public Animation mRotationAnim;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RotatableImageView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    public final Animation getMRotationAnim() {
        return this.mRotationAnim;
    }

    public final void setMRotationAnim(@Nullable Animation animation) {
        this.mRotationAnim = animation;
    }
}
