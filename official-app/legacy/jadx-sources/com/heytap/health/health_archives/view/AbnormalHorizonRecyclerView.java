package com.heytap.health.health_archives.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016R\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/health_archives/view/AbnormalHorizonRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "", "velocityX", "velocityY", "fling", "i", "I", "startX", "j", "startY", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class AbnormalHorizonRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int startX;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int startY;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public AbnormalHorizonRecyclerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            this.startX = (int) (ev.getX() + 0.5f);
            this.startY = (int) (ev.getY() + 0.5f);
        } else if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        } else if (actionMasked == 2) {
            int x = (int) (ev.getX() + 0.5f);
            int y = (int) (ev.getY() + 0.5f);
            int iAbs = Math.abs(x - this.startX);
            int iAbs2 = Math.abs(y - this.startY);
            if (iAbs > 0 && iAbs > iAbs2) {
                getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(this.startX - x));
            } else if (iAbs2 > 0) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (actionMasked == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int velocityX, int velocityY) {
        boolean z = true;
        if (!canScrollHorizontally(1) && !canScrollHorizontally(-1)) {
            z = false;
        }
        getParent().requestDisallowInterceptTouchEvent(z);
        return super.fling(velocityX, velocityY);
    }

    public /* synthetic */ AbnormalHorizonRecyclerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbnormalHorizonRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
