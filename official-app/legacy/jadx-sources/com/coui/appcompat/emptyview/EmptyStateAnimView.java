package com.coui.appcompat.emptyview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.View;
import com.oplus.aiunit.vision.ph2;
import com.oplus.anim.EffectiveAnimationView;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014R*\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00078\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/coui/appcompat/emptyview/EmptyStateAnimView;", "Lcom/oplus/anim/EffectiveAnimationView;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "Landroid/util/Size;", "value", "z", "Landroid/util/Size;", "getAnimSize", "()Landroid/util/Size;", "setAnimSize", "(Landroid/util/Size;)V", "animSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "coui-support-emptyview_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEmptyStateAnimView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmptyStateAnimView.kt\ncom/coui/appcompat/emptyview/EmptyStateAnimView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,47:1\n275#2,2:48\n*S KotlinDebug\n*F\n+ 1 EmptyStateAnimView.kt\ncom/coui/appcompat/emptyview/EmptyStateAnimView\n*L\n37#1:48,2\n*E\n"})
public final class EmptyStateAnimView extends EffectiveAnimationView {

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public Size animSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateAnimView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ph2.c(this, false);
        this.animSize = new Size(0, 0);
    }

    @NotNull
    public final Size getAnimSize() {
        return this.animSize;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(this.animSize.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.animSize.getHeight(), 1073741824));
    }

    public final void setAnimSize(@NotNull Size value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.animSize = value;
        setVisibility(value.getWidth() == 0 || value.getHeight() == 0 ? 4 : 0);
    }
}
