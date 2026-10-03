package com.heytap.health.community.focus.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.aiunit.vision.a7b;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\tB\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015B!\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0011\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002R\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/community/focus/view/NestedRecycleView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "", "deltaX", "deltaY", "a", "i", UserInfo.SEX_FEMALE, "startX", "j", "startY", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "community_impl_release"}, k = 1, mv = {1, 8, 0})
public final class NestedRecycleView extends RecyclerView {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public float startX;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float startY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedRecycleView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean a(float deltaX, float deltaY) {
        return (deltaX * deltaX) + (deltaY * deltaY) > 100.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int action = ev.getAction() & 255;
        boolean z = false;
        if (action == 0) {
            this.startX = ev.getX();
            this.startY = ev.getY();
            super.onInterceptTouchEvent(ev);
        } else if (action != 1 && action == 2) {
            float x = this.startX - ev.getX();
            float y = this.startY - ev.getY();
            if (Math.abs(x) >= Math.abs(y) && a(x, y)) {
                z = true;
            }
        }
        a7b.f("NestedRecycleView", "onInterceptTouchEvent:" + z);
        return z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedRecycleView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedRecycleView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }
}
