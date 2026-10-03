package com.heytap.store.homemodule.view;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.heytap.store.home.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/homemodule/view/NoInterceptViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mTempRect", "Landroid/graphics/Rect;", "canIntercept", "", "parent", "Landroid/view/ViewGroup;", "x", "", "y", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "Companion", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NoInterceptViewPager extends ViewPager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DO_NOT_INTERCEPT_KEY = R.string.pf_heytap_business_widget_not_intercept_tag;

    @NotNull
    public static final String DO_NOT_INTERCEPT_TAG = "do_not_intercept";

    @NotNull
    private final Rect mTempRect;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/heytap/store/homemodule/view/NoInterceptViewPager$Companion;", "", "()V", "DO_NOT_INTERCEPT_KEY", "", "getDO_NOT_INTERCEPT_KEY", "()I", "DO_NOT_INTERCEPT_TAG", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getDO_NOT_INTERCEPT_KEY() {
            return NoInterceptViewPager.DO_NOT_INTERCEPT_KEY;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoInterceptViewPager(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mTempRect = new Rect();
    }

    private final boolean canIntercept(ViewGroup parent, int x, int y) {
        int childCount = parent.getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            View childAt = parent.getChildAt(i);
            if (childAt.isShown()) {
                childAt.getGlobalVisibleRect(this.mTempRect);
                if (this.mTempRect.contains(x, y)) {
                    Object tag = childAt.getTag(DO_NOT_INTERCEPT_KEY);
                    if ((tag instanceof String) && TextUtils.equals((CharSequence) tag, DO_NOT_INTERCEPT_TAG)) {
                        return false;
                    }
                    if (childAt instanceof ViewGroup) {
                        return canIntercept((ViewGroup) childAt, x, y);
                    }
                } else {
                    continue;
                }
            }
            i = i2;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        boolean zCanIntercept;
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (ev.getActionMasked() == 0) {
            try {
                zCanIntercept = canIntercept(this, (int) ev.getRawX(), (int) ev.getRawY());
            } catch (IllegalArgumentException unused) {
                return false;
            }
        } else {
            zCanIntercept = true;
        }
        return zCanIntercept && super.onInterceptTouchEvent(ev);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoInterceptViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mTempRect = new Rect();
    }
}
