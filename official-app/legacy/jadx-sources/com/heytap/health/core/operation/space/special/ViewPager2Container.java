package com.heytap.health.core.operation.space.special;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\u001d\u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002J \u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0002R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017¨\u0006\""}, d2 = {"Lcom/heytap/health/core/operation/space/special/ViewPager2Container;", "Landroid/widget/RelativeLayout;", "", "onFinishInflate", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "", "endX", "disX", "disY", "a", "endY", "b", "Landroidx/viewpager2/widget/ViewPager2;", "i", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager2", "j", "Z", "disallowParentInterceptDownEvent", MapSchema.FIELD_NAME_KEY, "I", "startX", LogFieldKey.LEVEL_KEY, "startY", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final class ViewPager2Container extends RelativeLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public ViewPager2 viewPager2;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean disallowParentInterceptDownEvent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int startX;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int startY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPager2Container(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.disallowParentInterceptDownEvent = true;
    }

    public final void a(int endX, int disX, int disY) {
        ViewPager2 viewPager2 = this.viewPager2;
        if ((viewPager2 != null ? viewPager2.getAdapter() : null) == null) {
            return;
        }
        if (disX <= disY) {
            if (disY > disX) {
                getParent().requestDisallowInterceptTouchEvent(false);
                return;
            }
            return;
        }
        ViewPager2 viewPager3 = this.viewPager2;
        Integer numValueOf = viewPager3 != null ? Integer.valueOf(viewPager3.getCurrentItem()) : null;
        ViewPager2 viewPager4 = this.viewPager2;
        RecyclerView.Adapter adapter = viewPager4 != null ? viewPager4.getAdapter() : null;
        Intrinsics.checkNotNull(adapter);
        int itemCount = adapter.getItemCount();
        if (numValueOf != null && numValueOf.intValue() == 0 && endX - this.startX > 0) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            getParent().requestDisallowInterceptTouchEvent(numValueOf == null || numValueOf.intValue() != itemCount - 1 || endX - this.startX >= 0);
        }
    }

    public final void b(int endY, int disX, int disY) {
        ViewPager2 viewPager2 = this.viewPager2;
        if ((viewPager2 != null ? viewPager2.getAdapter() : null) == null) {
            return;
        }
        ViewPager2 viewPager3 = this.viewPager2;
        Integer numValueOf = viewPager3 != null ? Integer.valueOf(viewPager3.getCurrentItem()) : null;
        ViewPager2 viewPager4 = this.viewPager2;
        RecyclerView.Adapter adapter = viewPager4 != null ? viewPager4.getAdapter() : null;
        Intrinsics.checkNotNull(adapter);
        int itemCount = adapter.getItemCount();
        if (disY <= disX) {
            if (disX > disY) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (numValueOf != null && numValueOf.intValue() == 0 && endY - this.startY > 0) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            getParent().requestDisallowInterceptTouchEvent(numValueOf == null || numValueOf.intValue() != itemCount - 1 || endY - this.startY >= 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ViewPager2) {
                this.viewPager2 = (ViewPager2) childAt;
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        boolean z;
        Intrinsics.checkNotNullParameter(ev, "ev");
        ViewPager2 viewPager2 = this.viewPager2;
        Intrinsics.checkNotNull(viewPager2);
        boolean z2 = false;
        if (viewPager2.isUserInputEnabled()) {
            ViewPager2 viewPager3 = this.viewPager2;
            if ((viewPager3 != null ? viewPager3.getAdapter() : null) != null) {
                ViewPager2 viewPager4 = this.viewPager2;
                RecyclerView.Adapter adapter = viewPager4 != null ? viewPager4.getAdapter() : null;
                Intrinsics.checkNotNull(adapter);
                if (adapter.getItemCount() <= 1) {
                    z = true;
                }
            }
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return super.onInterceptTouchEvent(ev);
        }
        int action = ev.getAction();
        if (action == 0) {
            this.startX = (int) ev.getX();
            this.startY = (int) ev.getY();
            getParent().requestDisallowInterceptTouchEvent(!this.disallowParentInterceptDownEvent);
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (action == 2) {
            int x = (int) ev.getX();
            int y = (int) ev.getY();
            int iAbs = Math.abs(x - this.startX);
            int iAbs2 = Math.abs(y - this.startY);
            ViewPager2 viewPager5 = this.viewPager2;
            if (viewPager5 != null && viewPager5.getOrientation() == 1) {
                b(y, iAbs, iAbs2);
            } else {
                ViewPager2 viewPager6 = this.viewPager2;
                if (viewPager6 != null && viewPager6.getOrientation() == 0) {
                    z2 = true;
                }
                if (z2) {
                    a(x, iAbs, iAbs2);
                }
            }
        } else if (action == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onInterceptTouchEvent(ev);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPager2Container(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.disallowParentInterceptDownEvent = true;
    }
}
