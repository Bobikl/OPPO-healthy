package com.heytap.store.business.component.widget.assist;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.store.business.component.utils.ScreenParamUtilKt;
import com.heytap.store.platform.tools.LogUtils;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\fH\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/heytap/store/business/component/widget/assist/AssistCardRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "startX", "", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "getShowScreenWidth", "view", "Landroid/view/View;", "isShowInScreen", "isLeftDirect", "onTouchEvent", MapSchema.FIELD_NAME_ENTRY, "reset", "", "upAction", "direction", "isDetach", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AssistCardRecyclerView extends RecyclerView {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private float startX;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AssistCardRecyclerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getShowScreenWidth(View view) {
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        return rect.width();
    }

    private final boolean isShowInScreen(View view, boolean isLeftDirect) {
        Rect rect = new Rect();
        view.getLocalVisibleRect(rect);
        int iWidth = (rect.width() * 100) / view.getWidth();
        int iHeight = (rect.height() * 100) / view.getHeight();
        LogUtils.INSTANCE.d(AssistCardRecyclerViewKt.C_TAG, "当前的控件宽度比例：" + iWidth + "，高度比例：" + iHeight + "--是否是左滑：" + isLeftDirect);
        if (isLeftDirect) {
            if (iWidth > 95 && iHeight > 50) {
                return true;
            }
        } else if (iWidth > 5 && iHeight > 50) {
            return true;
        }
        return false;
    }

    private final void upAction(int direction, boolean isDetach) {
        int iFindFirstVisibleItemPosition;
        View viewFindViewByPosition;
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        Integer numValueOf = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (viewFindViewByPosition = linearLayoutManager.findViewByPosition((iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()))) == null) {
            return;
        }
        boolean zIsShowInScreen = isShowInScreen(viewFindViewByPosition, direction == 1);
        int showScreenWidth = getShowScreenWidth(viewFindViewByPosition);
        if (zIsShowInScreen || isDetach) {
            numValueOf = Integer.valueOf(iFindFirstVisibleItemPosition);
        } else if (direction == 1) {
            numValueOf = Integer.valueOf(iFindFirstVisibleItemPosition + 1);
        } else if (direction == 2) {
            numValueOf = Integer.valueOf(iFindFirstVisibleItemPosition - 1);
        }
        LogUtils logUtils = LogUtils.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append("当前是否向左滑动：");
        sb.append(direction == 1);
        sb.append("，当前需要显示的item为当前需要显示的item为：");
        sb.append(numValueOf);
        logUtils.d(AssistCardRecyclerViewKt.C_TAG, sb.toString());
        if (numValueOf != null) {
            if (numValueOf.intValue() < 0) {
                numValueOf = 0;
            }
            if (RangesKt___RangesKt.until(0, linearLayoutManager.getItemCount()).contains(numValueOf.intValue())) {
                int iComputeHorizontalScrollOffset = computeHorizontalScrollOffset();
                if (numValueOf.intValue() == iFindFirstVisibleItemPosition) {
                    showScreenWidth = -(viewFindViewByPosition.getWidth() - showScreenWidth);
                }
                logUtils.d(AssistCardRecyclerViewKt.C_TAG, "当前的offset：" + iComputeHorizontalScrollOffset + "，，，需要滚动的distance" + showScreenWidth);
                smoothScrollBy(showScreenWidth, 0);
            }
        }
    }

    public static /* synthetic */ void upAction$default(AssistCardRecyclerView assistCardRecyclerView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        assistCardRecyclerView.upAction(i, z);
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

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        if (ScreenParamUtilKt.isPad(getContext())) {
            return super.onTouchEvent(e2);
        }
        int action = e2.getAction();
        if (action == 1) {
            upAction$default(this, e2.getX() - this.startX > 0.0f ? 2 : 1, false, 2, null);
            this.startX = 0.0f;
            return true;
        }
        if (action == 2) {
            if (this.startX == 0.0f) {
                this.startX = e2.getX();
            }
        }
        return super.onTouchEvent(e2);
    }

    public final void reset() {
        if (ScreenParamUtilKt.isPad(getContext())) {
            return;
        }
        try {
            upAction(1, true);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AssistCardRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AssistCardRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AssistCardRecyclerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
    }
}
