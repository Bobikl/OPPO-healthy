package com.heytap.health.watchface.business.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.coui.appcompat.scrollview.COUIScrollView;
import com.heytap.databaseengine.model.UserInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000e\u0010\u0012B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u000e\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/watchface/business/view/HorizontalAdaptScrollView;", "Lcom/coui/appcompat/scrollview/COUIScrollView;", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "", "f0", UserInfo.SEX_FEMALE, "startX", "g0", "startY", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class HorizontalAdaptScrollView extends COUIScrollView {

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public float startX;

    /* JADX INFO: renamed from: g0, reason: from kotlin metadata */
    public float startY;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalAdaptScrollView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.coui.appcompat.scrollview.COUIScrollView, android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int action = ev.getAction() & 255;
        if (action != 0) {
            if (action == 1 || action != 2) {
                return false;
            }
            return Math.abs(this.startX - ev.getX()) < Math.abs(this.startY - ev.getY());
        }
        this.startX = ev.getX();
        this.startY = ev.getY();
        super.onInterceptTouchEvent(ev);
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalAdaptScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalAdaptScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
