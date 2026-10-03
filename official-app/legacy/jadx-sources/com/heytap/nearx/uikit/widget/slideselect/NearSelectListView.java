package com.heytap.nearx.uikit.widget.slideselect;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Space;
import android.widget.TextView;
import com.heytap.nearx.uikit.R$color;
import com.oplus.aiunit.vision.hhd;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)B\u001b\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b(\u0010,B!\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020\u0016¢\u0006\u0004\b(\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\bR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u001f\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\"\u0010!\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00060"}, d2 = {"Lcom/heytap/nearx/uikit/widget/slideselect/NearSelectListView;", "Landroid/widget/ListView;", "Landroid/view/MotionEvent;", "ev", "", "changeBgAndTextColorByLongClick", "startViberation", "changeBgAndTextColorByClick", "Landroid/view/View;", "child", "setItemLoseFocus", "setItemFous", "", "onTouchEvent", "Lcom/oplus/aiunit/vision/hhd;", "tdsListView", "setOnFingerUpListener", "view", "Landroid/graphics/RectF;", "calcViewScreenLocation", "triggerListener", "Lcom/oplus/aiunit/vision/hhd;", "", "selectItem", "I", "hasChangeItemRegion", "Z", "isAnimationPregress", "()Z", "setAnimationPregress", "(Z)V", "isFirstDown", "setFirstDown", "triggerSource", "getTriggerSource", "()I", "setTriggerSource", "(I)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0})
public class NearSelectListView extends ListView {
    public static final int FROM_CLICK = 1;
    public static final int FROM_LONGCLICK = 0;
    public static final int FROM_UNSET = 2;
    public static final int UN_SELECT_ITEM = -10;

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private boolean hasChangeItemRegion;
    private boolean isAnimationPregress;
    private boolean isFirstDown;
    private int selectItem;

    @Nullable
    private hhd triggerListener;
    private int triggerSource;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearSelectListView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
    }

    private final void changeBgAndTextColorByClick(MotionEvent ev) {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            View child = getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(child, "child");
            if (!calcViewScreenLocation(child).contains(ev.getRawX(), ev.getRawY())) {
                setItemLoseFocus(child);
            } else {
                if (this.selectItem == i) {
                    return;
                }
                this.selectItem = i;
                startViberation();
                setItemFous(child);
            }
            i = i2;
        }
    }

    private final void changeBgAndTextColorByLongClick(MotionEvent ev) {
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            int i2 = i + 1;
            View child = getChildAt(i);
            if (!(child instanceof Space)) {
                Intrinsics.checkNotNullExpressionValue(child, "child");
                if (calcViewScreenLocation(child).contains(ev.getRawX(), ev.getRawY())) {
                    if (this.isFirstDown) {
                        this.selectItem = i;
                        this.isFirstDown = false;
                        this.hasChangeItemRegion = false;
                        return;
                    }
                    int i3 = this.selectItem;
                    if (i3 != i) {
                        this.hasChangeItemRegion = true;
                    }
                    if (!this.hasChangeItemRegion) {
                        continue;
                    } else {
                        if (i3 == i) {
                            return;
                        }
                        this.selectItem = i;
                        startViberation();
                        setItemFous(child);
                    }
                } else if (this.hasChangeItemRegion) {
                    FrameLayout frameLayout = (FrameLayout) child;
                    View childAt = frameLayout.getChildAt(0);
                    if (childAt == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    int currentTextColor = ((TextView) childAt).getCurrentTextColor();
                    Resources resources = getResources();
                    int i4 = R$color.NXcolor_select_prefernce_default_tv_color;
                    if (currentTextColor != resources.getColor(i4)) {
                        View childAt2 = frameLayout.getChildAt(0);
                        if (childAt2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                        ((TextView) childAt2).setTextColor(getResources().getColor(i4));
                    }
                    if (child.getBackground() instanceof ColorDrawable) {
                        int color = getResources().getColor(R$color.nx_color_slide_secletor_item_bg);
                        Drawable background = child.getBackground();
                        if (background == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                        }
                        if (((ColorDrawable) background).getColor() == color) {
                            setItemLoseFocus(child);
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            i = i2;
        }
    }

    private final void setItemFous(View child) {
        child.setBackgroundColor(getResources().getColor(R$color.nx_color_slide_secletor_item_bg));
        View childAt = ((FrameLayout) child).getChildAt(0);
        if (childAt == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) childAt).setTextColor(getResources().getColor(R$color.NXcolor_select_prefernce_focus_tv_color));
    }

    private final void setItemLoseFocus(View child) {
        child.setBackgroundColor(getResources().getColor(R.color.transparent));
        View childAt = ((FrameLayout) child).getChildAt(0);
        if (childAt == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        ((TextView) childAt).setTextColor(getResources().getColor(R$color.NXcolor_select_prefernce_default_tv_color));
    }

    private final void startViberation() {
        VibrationEffect vibrationEffectCreateOneShot = VibrationEffect.createOneShot(16L, 250);
        Object systemService = getContext().getSystemService("vibrator");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
        }
        ((Vibrator) systemService).vibrate(vibrationEffectCreateOneShot);
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

    @NotNull
    public final RectF calcViewScreenLocation(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new RectF(i, iArr[1], i + view.getWidth(), iArr[1] + view.getHeight());
    }

    public final int getTriggerSource() {
        return this.triggerSource;
    }

    /* JADX INFO: renamed from: isAnimationPregress, reason: from getter */
    public final boolean getIsAnimationPregress() {
        return this.isAnimationPregress;
    }

    /* JADX INFO: renamed from: isFirstDown, reason: from getter */
    public final boolean getIsFirstDown() {
        return this.isFirstDown;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (this.isAnimationPregress) {
            return true;
        }
        if (this.triggerSource != 0) {
            int action = ev.getAction();
            if (action != 0) {
                if (action == 1) {
                    this.triggerSource = 2;
                    hhd hhdVar = this.triggerListener;
                    if (hhdVar != null) {
                        hhdVar.onUpEvent(this.selectItem);
                    }
                    return true;
                }
                if (action != 2) {
                    return super.onTouchEvent(ev);
                }
            }
            changeBgAndTextColorByClick(ev);
            return true;
        }
        int action2 = ev.getAction();
        if (action2 == 1) {
            hhd hhdVar2 = this.triggerListener;
            if (hhdVar2 != null) {
                if (this.hasChangeItemRegion) {
                    hhdVar2.onUpEvent(this.selectItem);
                } else {
                    hhdVar2.onUpEvent(-10);
                }
            }
            this.hasChangeItemRegion = false;
            this.triggerSource = 2;
        } else if (action2 == 2) {
            changeBgAndTextColorByLongClick(ev);
            return true;
        }
        return super.onTouchEvent(ev);
    }

    public final void setAnimationPregress(boolean z) {
        this.isAnimationPregress = z;
    }

    public final void setFirstDown(boolean z) {
        this.isFirstDown = z;
    }

    public final void setOnFingerUpListener(@NotNull hhd tdsListView) {
        Intrinsics.checkNotNullParameter(tdsListView, "tdsListView");
        this.triggerListener = tdsListView;
    }

    public final void setTriggerSource(int i) {
        this.triggerSource = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearSelectListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearSelectListView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this._$_findViewCache = new LinkedHashMap();
    }
}
