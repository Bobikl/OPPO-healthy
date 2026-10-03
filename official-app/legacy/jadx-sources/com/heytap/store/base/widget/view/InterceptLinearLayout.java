package com.heytap.store.base.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 02\u00020\u0001:\u00010B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020.H\u0016J\n\u0010/\u001a\u0004\u0018\u00010+H\u0002R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001aR\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/heytap/store/base/widget/view/InterceptLinearLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "executeJump", "Lkotlin/Function0;", "", "getExecuteJump", "()Lkotlin/jvm/functions/Function0;", "setExecuteJump", "(Lkotlin/jvm/functions/Function0;)V", "horizontalRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getHorizontalRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setHorizontalRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "isAllowLeftOverScroll", "", "()Z", "setAllowLeftOverScroll", "(Z)V", "isAllowRightOverScroll", "setAllowRightOverScroll", "lastDownX", "", "lastDownY", "lastMoveX", "lastMoveY", "maxTransition", "getMaxTransition", "()I", "setMaxTransition", "(I)V", "needIntercept", "getNeedIntercept", "setNeedIntercept", "parentRv", "Landroid/view/ViewParent;", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "getParentListView", "Companion", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class InterceptLinearLayout extends LinearLayout {
    private static final int MAX_TRANSITION = 50;
    private static final int NO_MAX_TRANSITION_LIMIT = -1;
    private static final float RATIO = 0.5f;

    @Nullable
    private Function0<Unit> executeJump;

    @Nullable
    private RecyclerView horizontalRecyclerView;
    private boolean isAllowLeftOverScroll;
    private boolean isAllowRightOverScroll;
    private float lastDownX;
    private float lastDownY;
    private float lastMoveX;
    private float lastMoveY;
    private int maxTransition;
    private boolean needIntercept;

    @Nullable
    private ViewParent parentRv;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InterceptLinearLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ViewParent getParentListView() {
        ViewParent parent = getParent();
        if (parent == null) {
            return null;
        }
        while (!(parent instanceof RecyclerView) && parent != null) {
            parent = parent.getParent();
        }
        return parent;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0121  */
    /* JADX WARN: Code duplicated, block: B:114:0x0140  */
    /* JADX WARN: Code duplicated, block: B:116:0x0144  */
    /* JADX WARN: Code duplicated, block: B:117:0x0146  */
    /* JADX WARN: Code duplicated, block: B:127:0x0164  */
    /* JADX WARN: Code duplicated, block: B:131:0x016c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent ev) {
        RecyclerView recyclerView;
        int translationX;
        ViewParent viewParent;
        RecyclerView recyclerView2;
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (!this.needIntercept) {
            return super.dispatchTouchEvent(ev);
        }
        if (this.parentRv == null) {
            this.parentRv = getParentListView();
        }
        int action = ev.getAction();
        if (action != 0) {
            float f = 0.0f;
            if (action == 1) {
                recyclerView = this.horizontalRecyclerView;
                if (recyclerView == null) {
                    translationX = 0;
                } else {
                    translationX = (int) recyclerView.getTranslationX();
                }
                if (Math.abs(translationX) >= Math.abs(this.maxTransition) && (function0 = this.executeJump) != null) {
                    function0.invoke();
                }
                viewParent = this.parentRv;
                if (viewParent != null) {
                    viewParent.requestDisallowInterceptTouchEvent(false);
                }
                recyclerView2 = this.horizontalRecyclerView;
                if (recyclerView2 != null) {
                    recyclerView2.setTranslationX(0.0f);
                }
            } else if (action == 2) {
                if (Math.abs(ev.getRawX() - this.lastDownX) >= Math.abs(ev.getRawY() - this.lastDownY)) {
                    ViewParent viewParent2 = this.parentRv;
                    if (viewParent2 != null) {
                        viewParent2.requestDisallowInterceptTouchEvent(true);
                    }
                } else {
                    ViewParent viewParent3 = this.parentRv;
                    if (viewParent3 != null) {
                        viewParent3.requestDisallowInterceptTouchEvent(false);
                    }
                }
                float rawX = ev.getRawX() - this.lastMoveX;
                this.lastMoveX = ev.getRawX();
                this.lastMoveY = ev.getRawY();
                float f2 = rawX * 0.5f;
                if (f2 > 0.0f) {
                    RecyclerView recyclerView3 = this.horizontalRecyclerView;
                    if (recyclerView3 != null && recyclerView3.canScrollHorizontally(-1)) {
                        RecyclerView recyclerView4 = this.horizontalRecyclerView;
                        if ((recyclerView4 == null ? 0.0f : recyclerView4.getTranslationX()) >= 0.0f) {
                            return super.dispatchTouchEvent(ev);
                        }
                    }
                    RecyclerView recyclerView5 = this.horizontalRecyclerView;
                    float translationX2 = f2 + (recyclerView5 == null ? 0.0f : recyclerView5.getTranslationX());
                    if (translationX2 < 0.0f) {
                        f = translationX2;
                    } else {
                        RecyclerView recyclerView6 = this.horizontalRecyclerView;
                        if (!(recyclerView6 != null && recyclerView6.canScrollHorizontally(-1)) && this.isAllowLeftOverScroll) {
                            f = translationX2;
                        }
                    }
                    if (this.maxTransition != -1 && Math.abs(f) > Math.abs(this.maxTransition)) {
                        f = this.maxTransition;
                    }
                    RecyclerView recyclerView7 = this.horizontalRecyclerView;
                    if (recyclerView7 != null) {
                        recyclerView7.setTranslationX(f);
                    }
                } else if (f2 < 0.0f) {
                    RecyclerView recyclerView8 = this.horizontalRecyclerView;
                    if (recyclerView8 != null && recyclerView8.canScrollHorizontally(1)) {
                        RecyclerView recyclerView9 = this.horizontalRecyclerView;
                        if ((recyclerView9 == null ? 0.0f : recyclerView9.getTranslationX()) <= 0.0f) {
                            return super.dispatchTouchEvent(ev);
                        }
                    }
                    RecyclerView recyclerView10 = this.horizontalRecyclerView;
                    float translationX3 = f2 + (recyclerView10 == null ? 0.0f : recyclerView10.getTranslationX());
                    if (translationX3 > 0.0f) {
                        f = translationX3;
                    } else {
                        RecyclerView recyclerView11 = this.horizontalRecyclerView;
                        if (!(recyclerView11 != null && recyclerView11.canScrollHorizontally(1)) && this.isAllowRightOverScroll) {
                            f = translationX3;
                        }
                    }
                    if (this.maxTransition != -1 && Math.abs(f) > Math.abs(50)) {
                        f = -50.0f;
                    }
                    RecyclerView recyclerView12 = this.horizontalRecyclerView;
                    if (recyclerView12 != null) {
                        recyclerView12.setTranslationX(f);
                    }
                }
            } else if (action == 3) {
                recyclerView = this.horizontalRecyclerView;
                if (recyclerView == null) {
                    translationX = 0;
                } else {
                    translationX = (int) recyclerView.getTranslationX();
                }
                if (Math.abs(translationX) >= Math.abs(this.maxTransition)) {
                    function0.invoke();
                }
                viewParent = this.parentRv;
                if (viewParent != null) {
                    viewParent.requestDisallowInterceptTouchEvent(false);
                }
                recyclerView2 = this.horizontalRecyclerView;
                if (recyclerView2 != null) {
                    recyclerView2.setTranslationX(0.0f);
                }
            }
        } else {
            this.lastDownX = ev.getRawX();
            this.lastDownY = ev.getRawY();
            ViewParent viewParent4 = this.parentRv;
            if (viewParent4 != null) {
                viewParent4.requestDisallowInterceptTouchEvent(true);
            }
        }
        RecyclerView recyclerView13 = this.horizontalRecyclerView;
        if ((recyclerView13 != null ? (int) recyclerView13.getTranslationX() : 0) != 0) {
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Nullable
    public final Function0<Unit> getExecuteJump() {
        return this.executeJump;
    }

    @Nullable
    public final RecyclerView getHorizontalRecyclerView() {
        return this.horizontalRecyclerView;
    }

    public final int getMaxTransition() {
        return this.maxTransition;
    }

    public final boolean getNeedIntercept() {
        return this.needIntercept;
    }

    /* JADX INFO: renamed from: isAllowLeftOverScroll, reason: from getter */
    public final boolean getIsAllowLeftOverScroll() {
        return this.isAllowLeftOverScroll;
    }

    /* JADX INFO: renamed from: isAllowRightOverScroll, reason: from getter */
    public final boolean getIsAllowRightOverScroll() {
        return this.isAllowRightOverScroll;
    }

    public final void setAllowLeftOverScroll(boolean z) {
        this.isAllowLeftOverScroll = z;
    }

    public final void setAllowRightOverScroll(boolean z) {
        this.isAllowRightOverScroll = z;
    }

    public final void setExecuteJump(@Nullable Function0<Unit> function0) {
        this.executeJump = function0;
    }

    public final void setHorizontalRecyclerView(@Nullable RecyclerView recyclerView) {
        this.horizontalRecyclerView = recyclerView;
    }

    public final void setMaxTransition(int i) {
        this.maxTransition = i;
    }

    public final void setNeedIntercept(boolean z) {
        this.needIntercept = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InterceptLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ InterceptLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InterceptLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isAllowRightOverScroll = true;
        this.maxTransition = 50;
        this.needIntercept = true;
        this.parentRv = getParentListView();
    }
}
