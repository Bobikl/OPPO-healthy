package com.heytap.health.menstrual_period.ui.fragment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014¨\u0006\""}, d2 = {"Lcom/heytap/health/menstrual_period/ui/fragment/NestedViewPager2Container;", "Landroid/widget/FrameLayout;", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "event", "onTouchEvent", "a", "", "i", "Ljava/lang/String;", "TAG", "", "j", UserInfo.SEX_FEMALE, "startX", MapSchema.FIELD_NAME_KEY, "startY", LogFieldKey.LEVEL_KEY, "Z", "isInContainerArea", LogFieldKey.MESSAGE_KEY, "isHorizontalScroll", "n", "isScrollStarted", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "menstrual_period_impl_release"}, k = 1, mv = {1, 8, 0})
public final class NestedViewPager2Container extends FrameLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float startX;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public float startY;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean isInContainerArea;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isHorizontalScroll;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean isScrollStarted;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NestedViewPager2Container(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean a(MotionEvent event) {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        boolean z = false;
        int i = iArr[0];
        int i2 = iArr[1];
        int width = getWidth();
        int height = getHeight();
        float rawX = event.getRawX();
        float rawY = event.getRawY();
        if (rawX >= i && rawX <= i + width && rawY >= i2 && rawY <= i2 + height) {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("isTouchInContainer: touchX=");
        sb.append(rawX);
        sb.append(", touchY=");
        sb.append(rawY);
        sb.append(", x=");
        sb.append(i);
        sb.append(", y=");
        sb.append(i2);
        sb.append(", width=");
        sb.append(width);
        sb.append(", height=");
        sb.append(height);
        sb.append(", result=");
        sb.append(z);
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        ViewParent parent;
        ViewParent parent2;
        Intrinsics.checkNotNullParameter(ev, "ev");
        int action = ev.getAction();
        if (action == 0) {
            this.startX = ev.getX();
            this.startY = ev.getY();
            this.isScrollStarted = false;
            this.isHorizontalScroll = false;
            this.isInContainerArea = a(ev);
            float x = ev.getX();
            float y = ev.getY();
            boolean z = this.isInContainerArea;
            StringBuilder sb = new StringBuilder();
            sb.append("ACTION_DOWN: x=");
            sb.append(x);
            sb.append(", y=");
            sb.append(y);
            sb.append(", isInContainer=");
            sb.append(z);
        } else if (action == 1) {
            parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        } else if (action != 2) {
            if (action == 3) {
                parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        } else if (this.isInContainerArea && !this.isScrollStarted) {
            float fAbs = Math.abs(ev.getX() - this.startX);
            float fAbs2 = Math.abs(ev.getY() - this.startY);
            if (fAbs > 10.0f || fAbs2 > 10.0f) {
                this.isScrollStarted = true;
                boolean z2 = fAbs > fAbs2;
                this.isHorizontalScroll = z2;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Scroll detected: horizontal=");
                sb2.append(z2);
                sb2.append(", deltaX=");
                sb2.append(fAbs);
                sb2.append(", deltaY=");
                sb2.append(fAbs2);
                if (this.isHorizontalScroll) {
                    ViewParent parent3 = getParent();
                    if (parent3 != null) {
                        parent3.requestDisallowInterceptTouchEvent(true);
                    }
                } else {
                    ViewParent parent4 = getParent();
                    if (parent4 != null) {
                        parent4.requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        } else if (this.isScrollStarted && this.isHorizontalScroll && (parent2 = getParent()) != null) {
            parent2.requestDisallowInterceptTouchEvent(true);
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.isInContainerArea && this.isScrollStarted && this.isHorizontalScroll) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NestedViewPager2Container(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NestedViewPager2Container(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NestedViewPager2Container(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.TAG = "NestedVP2Container";
    }
}
