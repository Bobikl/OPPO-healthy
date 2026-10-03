package com.heytap.health.health_archives.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.heytap.databaseengine.model.UserInfo;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/health_archives/view/CustomHorizontalScrollView;", "Landroid/widget/HorizontalScrollView;", "Landroid/view/ViewGroup;", "verticalScrollView", "", "setVerticalScrollView", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "onTouchEvent", "", "i", UserInfo.SEX_FEMALE, "lastX", "j", "lastY", MapSchema.FIELD_NAME_KEY, "Landroid/view/ViewGroup;", "verticalLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class CustomHorizontalScrollView extends HorizontalScrollView {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public float lastX;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float lastY;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public ViewGroup verticalLayout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomHorizontalScrollView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Intrinsics.checkNotNullParameter(ev, "ev");
        int action = ev.getAction();
        if (action == 0) {
            this.lastX = ev.getX();
            this.lastY = ev.getY();
            ViewGroup viewGroup3 = this.verticalLayout;
            if (viewGroup3 != null) {
                viewGroup3.requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 1) {
            viewGroup = this.verticalLayout;
            if (viewGroup != null) {
                viewGroup.requestDisallowInterceptTouchEvent(false);
            }
        } else if (action == 2) {
            float x = ev.getX();
            float y = ev.getY();
            float fAbs = Math.abs(x - this.lastX);
            float fAbs2 = Math.abs(y - this.lastY);
            double d = fAbs2;
            double d2 = ((double) fAbs) * 0.5d;
            if (d > d2 && fAbs2 > ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                ViewGroup viewGroup4 = this.verticalLayout;
                if (viewGroup4 != null) {
                    viewGroup4.requestDisallowInterceptTouchEvent(false);
                }
            } else if (d2 > d && fAbs > ViewConfiguration.get(getContext()).getScaledTouchSlop() && (viewGroup2 = this.verticalLayout) != null) {
                viewGroup2.requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 3) {
            viewGroup = this.verticalLayout;
            if (viewGroup != null) {
                viewGroup.requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        return super.onTouchEvent(ev);
    }

    public final void setVerticalScrollView(@NotNull ViewGroup verticalScrollView) {
        Intrinsics.checkNotNullParameter(verticalScrollView, "verticalScrollView");
        this.verticalLayout = verticalScrollView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomHorizontalScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CustomHorizontalScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomHorizontalScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
