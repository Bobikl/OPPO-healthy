package com.example.firstproject.compose;

import android.content.Context;
import android.graphics.Canvas;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.menstrual_period.view.compose.multichoice.MultiChoiceDrawable;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/example/firstproject/compose/CtImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "Lcom/heytap/health/menstrual_period/view/compose/multichoice/MultiChoiceDrawable$STATE;", "state", "setState", "Lcom/heytap/health/menstrual_period/view/compose/multichoice/MultiChoiceDrawable;", ResourcesUtil.ResourceType.DRAWABLE, "setMultiDrawable", "", "checked", "setChecked", "i", "Lcom/heytap/health/menstrual_period/view/compose/multichoice/MultiChoiceDrawable$STATE;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final class CtImageView extends AppCompatImageView {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public MultiChoiceDrawable.STATE state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CtImageView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = MultiChoiceDrawable.STATE.NORMAL;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
    }

    public final void setChecked(boolean checked) {
        if (checked) {
            setState(MultiChoiceDrawable.STATE.CHECKED);
        } else {
            setState(MultiChoiceDrawable.STATE.UNCHECKED);
        }
    }

    public final void setMultiDrawable(@NotNull MultiChoiceDrawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        setImageDrawable(drawable);
    }

    public final void setState(@NotNull MultiChoiceDrawable.STATE state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.state = state;
        invalidate();
    }
}
