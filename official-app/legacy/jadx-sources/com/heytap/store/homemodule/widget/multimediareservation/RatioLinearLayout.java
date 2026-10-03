package com.heytap.store.homemodule.widget.multimediareservation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.heytap.store.base.core.util.ImageSizeUtil;
import com.heytap.store.homemodule.data.PicLinkDetail;
import com.heytap.store.homemodule.widget.AspectRatioMeasure;
import com.heytap.store.homemodule.widget.multimediareservation.RatioLinearLayout;
import com.heytap.store.platform.imageloader.ImageLoader;
import com.heytap.store.platform.imageloader.LoadStep;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H\u0014J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\nH\u0002J\u0014\u0010\u001b\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/heytap/store/homemodule/widget/multimediareservation/RatioLinearLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mAspectRatio", "", "mMeasureSpec", "Lcom/heytap/store/homemodule/widget/AspectRatioMeasure$Spec;", "onClickListener", "Landroid/view/View$OnClickListener;", "onItemClickListener", "Lcom/heytap/store/homemodule/widget/multimediareservation/RatioLinearLayout$OnItemClickListener;", "getOnItemClickListener", "()Lcom/heytap/store/homemodule/widget/multimediareservation/RatioLinearLayout$OnItemClickListener;", "setOnItemClickListener", "(Lcom/heytap/store/homemodule/widget/multimediareservation/RatioLinearLayout$OnItemClickListener;)V", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "setAspectRatio", "aspectRatio", "setData", "picKvList", "", "Lcom/heytap/store/homemodule/data/PicLinkDetail;", "OnItemClickListener", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class RatioLinearLayout extends LinearLayout {
    private float mAspectRatio;

    @NotNull
    private final AspectRatioMeasure.Spec mMeasureSpec;

    @NotNull
    private final View.OnClickListener onClickListener;

    @Nullable
    private OnItemClickListener onItemClickListener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/heytap/store/homemodule/widget/multimediareservation/RatioLinearLayout$OnItemClickListener;", "", "onItemClick", "", "index", "", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemClick(int index);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RatioLinearLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    /* JADX INFO: renamed from: onClickListener$lambda-0, reason: not valid java name */
    public static final void m5000onClickListener$lambda0(RatioLinearLayout this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            onItemClickListener.onItemClick(this$0.indexOfChild(view));
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    private final void setAspectRatio(float aspectRatio) {
        if (aspectRatio == this.mAspectRatio) {
            return;
        }
        this.mAspectRatio = aspectRatio;
        requestLayout();
    }

    @Nullable
    public final OnItemClickListener getOnItemClickListener() {
        return this.onItemClickListener;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        AspectRatioMeasure.Spec spec = this.mMeasureSpec;
        spec.width = widthMeasureSpec;
        spec.height = heightMeasureSpec;
        AspectRatioMeasure.updateMeasureSpec(spec, this.mAspectRatio, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        AspectRatioMeasure.Spec spec2 = this.mMeasureSpec;
        super.onMeasure(spec2.width, spec2.height);
    }

    public final void setData(@NotNull List<? extends PicLinkDetail> picKvList) {
        Intrinsics.checkNotNullParameter(picKvList, "picKvList");
        int size = picKvList.size();
        if (size < 1) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        int imageOriginalHeight = ImageSizeUtil.getImageOriginalHeight(picKvList.get(0).getPic());
        Iterator<T> it = picKvList.iterator();
        float imageOriginalWight = 0.0f;
        while (it.hasNext()) {
            imageOriginalWight += ImageSizeUtil.getImageOriginalWight(((PicLinkDetail) it.next()).getPic());
        }
        setAspectRatio(imageOriginalWight / imageOriginalHeight);
        if (getChildCount() > size) {
            int childCount = getChildCount();
            for (int i = size; i < childCount; i++) {
                getChildAt(i).setVisibility(8);
            }
        } else if (getChildCount() < size) {
            int childCount2 = getChildCount();
            while (childCount2 < size) {
                childCount2++;
                ImageView imageView = new ImageView(getContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                imageView.setOnClickListener(this.onClickListener);
                addView(imageView, layoutParams);
            }
        }
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            View childAt = getChildAt(i2);
            if (childAt == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ImageView imageView2 = (ImageView) childAt;
            imageView2.setVisibility(0);
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            ((LinearLayout.LayoutParams) layoutParams2).weight = ImageSizeUtil.getImageOriginalWight(picKvList.get(i2).getPic());
            LoadStep.into$default(ImageLoader.load(picKvList.get(i2).getPic()).scaleType(ImageView.ScaleType.FIT_XY), imageView2, null, 2, null);
            i2 = i3;
        }
    }

    public final void setOnItemClickListener(@Nullable OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RatioLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RatioLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mMeasureSpec = new AspectRatioMeasure.Spec();
        this.onClickListener = new View.OnClickListener() { // from class: com.oplus.aiunit.vision.raf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RatioLinearLayout.m5000onClickListener$lambda0(this.i, view);
            }
        };
    }

    public /* synthetic */ RatioLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }
}
