package com.heytap.nearx.uikit.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.oplus.aiunit.vision.k9e;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearRotateView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "expand", "", "isExpanded", "()Z", "setExpanded", "(Z)V", "mDuration", "", "mInterpolator", "Landroid/view/animation/Interpolator;", "mIsExpanded", "startCollapseAnimation", "", "startExpandAnimation", "startRotateAnimation", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearRotateView extends AppCompatImageView {
    private static final int ROTATION_ANGLE = 180;

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private final long mDuration;

    @NotNull
    private final Interpolator mInterpolator;
    private boolean mIsExpanded;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearRotateView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: isExpanded, reason: from getter */
    public final boolean getMIsExpanded() {
        return this.mIsExpanded;
    }

    public final void setExpanded(boolean z) {
        if (this.mIsExpanded == z) {
            return;
        }
        this.mIsExpanded = z;
        setRotation(z ? ROTATION_ANGLE : 0);
    }

    public final void startCollapseAnimation() {
        animate().rotation(0.0f);
        this.mIsExpanded = false;
    }

    public final void startExpandAnimation() {
        animate().rotation(ROTATION_ANGLE);
        this.mIsExpanded = true;
    }

    public final void startRotateAnimation() {
        if (this.mIsExpanded) {
            startCollapseAnimation();
        } else {
            startExpandAnimation();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearRotateView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearRotateView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Interpolator interpolatorA = k9e.INSTANCE.a();
        this.mInterpolator = interpolatorA;
        this.mDuration = 300L;
        animate().setDuration(300L).setInterpolator(interpolatorA);
        this._$_findViewCache = new LinkedHashMap();
    }

    public /* synthetic */ NearRotateView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
