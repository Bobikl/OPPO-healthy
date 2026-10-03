package com.oppo.store.web.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\fH\u0014J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0017R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/oppo/store/web/widget/ScrollInterceptWebView;", "Lcom/oppo/store/web/widget/CrashCatchWebView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isScrollX", "", "isShow", "()Z", "setShow", "(Z)V", "parent", "Landroid/view/ViewParent;", "foundScrollableParent", "v", "Landroid/view/View;", "onOverScrolled", "", "scrollX", "scrollY", "clampedX", "clampedY", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ScrollInterceptWebView extends CrashCatchWebView {
    private boolean isScrollX;
    private boolean isShow;

    @Nullable
    private ViewParent parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollInterceptWebView(@Nullable Context context) {
        super(context);
        Intrinsics.checkNotNull(context);
    }

    private final ViewParent foundScrollableParent(View v) {
        if (v.getParent() == null) {
            return null;
        }
        ViewParent parent = v.getParent();
        if (parent instanceof ViewPager) {
            return v.getParent();
        }
        if (!(parent instanceof View)) {
            return null;
        }
        Object parent2 = v.getParent();
        Intrinsics.checkNotNull(parent2, "null cannot be cast to non-null type android.view.View");
        return foundScrollableParent((View) parent2);
    }

    /* JADX INFO: renamed from: isShow, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    @Override // android.webkit.WebView, android.view.View
    public void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        this.isScrollX = clampedX;
        super.onOverScrolled(scrollX, scrollY, clampedX, clampedY);
    }

    @Override // android.webkit.WebView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.parent == null) {
            this.parent = foundScrollableParent(this);
        }
        if (event.getPointerCount() == 1) {
            int action = event.getAction();
            if (action == 0) {
                this.isScrollX = false;
                ViewParent viewParent = this.parent;
                if (viewParent != null && viewParent != null) {
                    viewParent.requestDisallowInterceptTouchEvent(true);
                }
            } else if (action != 2) {
                ViewParent viewParent2 = this.parent;
                if (viewParent2 != null && viewParent2 != null) {
                    viewParent2.requestDisallowInterceptTouchEvent(false);
                }
            } else {
                ViewParent viewParent3 = this.parent;
                if (viewParent3 != null && viewParent3 != null) {
                    viewParent3.requestDisallowInterceptTouchEvent(true ^ this.isScrollX);
                }
            }
        } else {
            ViewParent viewParent4 = this.parent;
            if (viewParent4 != null && viewParent4 != null) {
                viewParent4.requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setShow(boolean z) {
        this.isShow = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollInterceptWebView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNull(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollInterceptWebView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNull(context);
    }
}
