package com.heytap.udeviceui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.uek;
import com.oplus.aiunit.vision.vek;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.ParserTag;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import io.protostuff.MapSchema;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0016\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'B\u001d\b\u0016\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b&\u0010*J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\r\u001a\u00020\u0005H\u0014J0\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0014J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0002R\u001c\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006+"}, d2 = {"Lcom/heytap/udeviceui/UDeviceLinkingCell;", "Landroid/widget/RelativeLayout;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/View$OnClickListener;", "listener", "", "setReconnectListener", "", "linkTitle", "linkContent", MapSchema.FIELD_NAME_ENTRY, "d", "c", "onAttachedToWindow", "", "changed", "", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "onLayout", "onGlobalLayout", "f", "kotlin.jvm.PlatformType", "i", "Ljava/lang/String;", "TAG", "j", "Z", "mLayoutSetEnable", MapSchema.FIELD_NAME_KEY, "mTextTooLong", LogFieldKey.LEVEL_KEY, "Landroid/view/View$OnClickListener;", "mListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class UDeviceLinkingCell extends RelativeLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final String TAG;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean mLayoutSetEnable;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean mTextTooLong;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public View.OnClickListener mListener;
    public HashMap m;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", ParserTag.TAG_ONCLICK}, k = 3, mv = {1, 4, 2})
    public static final class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        @SensorsDataInstrumented
        public final void onClick(View view) {
            View.OnClickListener onClickListener = UDeviceLinkingCell.this.mListener;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            SensorsDataAutoTrackHelper.trackViewOnClick(view);
        }
    }

    public UDeviceLinkingCell(@Nullable Context context) {
        super(context);
        this.TAG = UDeviceLinkingCell.class.getSimpleName();
        View.inflate(getContext(), R$layout.cell_linking, this);
        int i = R$id.mTextLinkAgain;
        TextView mTextLinkAgain = (TextView) a(i);
        Intrinsics.checkNotNullExpressionValue(mTextLinkAgain, "mTextLinkAgain");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        mTextLinkAgain.setBackground(new uek(context2));
        ((TextView) a(i)).setOnClickListener(new a());
    }

    public View a(int i) {
        if (this.m == null) {
            this.m = new HashMap();
        }
        View view = (View) this.m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.m.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void c() {
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        requestLayout();
    }

    public final void d(@NotNull String linkTitle, @NotNull String linkContent) {
        Intrinsics.checkNotNullParameter(linkTitle, "linkTitle");
        Intrinsics.checkNotNullParameter(linkContent, "linkContent");
        this.mLayoutSetEnable = false;
        TextView mTextLinkTitle = (TextView) a(R$id.mTextLinkTitle);
        Intrinsics.checkNotNullExpressionValue(mTextLinkTitle, "mTextLinkTitle");
        mTextLinkTitle.setText(linkTitle);
        int i = R$id.mTextLinkAgain;
        TextView mTextLinkAgain = (TextView) a(i);
        Intrinsics.checkNotNullExpressionValue(mTextLinkAgain, "mTextLinkAgain");
        mTextLinkAgain.setText(linkContent);
        TextView textView = (TextView) a(i);
        vek vekVar = vek.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        textView.setTextColor(vekVar.c(context));
        TextView mTextLinkAgain2 = (TextView) a(i);
        Intrinsics.checkNotNullExpressionValue(mTextLinkAgain2, "mTextLinkAgain");
        mTextLinkAgain2.setVisibility(0);
        TextView mTextLinking = (TextView) a(R$id.mTextLinking);
        Intrinsics.checkNotNullExpressionValue(mTextLinking, "mTextLinking");
        mTextLinking.setVisibility(8);
        c();
    }

    public final void e(@NotNull String linkTitle, @NotNull String linkContent) {
        Intrinsics.checkNotNullParameter(linkTitle, "linkTitle");
        Intrinsics.checkNotNullParameter(linkContent, "linkContent");
        this.mLayoutSetEnable = false;
        TextView mTextLinkTitle = (TextView) a(R$id.mTextLinkTitle);
        Intrinsics.checkNotNullExpressionValue(mTextLinkTitle, "mTextLinkTitle");
        mTextLinkTitle.setText(linkTitle);
        int i = R$id.mTextLinking;
        TextView mTextLinking = (TextView) a(i);
        Intrinsics.checkNotNullExpressionValue(mTextLinking, "mTextLinking");
        mTextLinking.setText(linkContent);
        TextView mTextLinkAgain = (TextView) a(R$id.mTextLinkAgain);
        Intrinsics.checkNotNullExpressionValue(mTextLinkAgain, "mTextLinkAgain");
        mTextLinkAgain.setVisibility(8);
        TextView mTextLinking2 = (TextView) a(i);
        Intrinsics.checkNotNullExpressionValue(mTextLinking2, "mTextLinking");
        mTextLinking2.setVisibility(0);
        c();
    }

    public final void f() {
        int i = R$id.mTextLinkTitle;
        TextView mTextLinkTitle = (TextView) a(i);
        Intrinsics.checkNotNullExpressionValue(mTextLinkTitle, "mTextLinkTitle");
        ViewGroup.LayoutParams layoutParams = mTextLinkTitle.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int i2 = R$id.mTextLinking;
        TextView mTextLinking = (TextView) a(i2);
        Intrinsics.checkNotNullExpressionValue(mTextLinking, "mTextLinking");
        ViewGroup.LayoutParams layoutParams3 = mTextLinking.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        int i3 = R$id.mTextLinkAgain;
        TextView mTextLinkAgain = (TextView) a(i3);
        Intrinsics.checkNotNullExpressionValue(mTextLinkAgain, "mTextLinkAgain");
        ViewGroup.LayoutParams layoutParams5 = mTextLinkAgain.getLayoutParams();
        if (layoutParams5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
        if (this.mTextTooLong) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            layoutParams2.topMargin = context.getResources().getDimensionPixelSize(R$dimen.link_action_title_multi_top_margin);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R$dimen.link_action_content_multi_top_margin);
            TextView mTextLinkTitle2 = (TextView) a(i);
            Intrinsics.checkNotNullExpressionValue(mTextLinkTitle2, "mTextLinkTitle");
            layoutParams4.topMargin = dimensionPixelSize + mTextLinkTitle2.getMeasuredHeight();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            layoutParams4.bottomMargin = context3.getResources().getDimensionPixelSize(R$dimen.link_action_content_multi_bottom_margin);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            int dimensionPixelSize2 = context4.getResources().getDimensionPixelSize(R$dimen.link_action_retry_multi_top_margin);
            TextView mTextLinkTitle3 = (TextView) a(i);
            Intrinsics.checkNotNullExpressionValue(mTextLinkTitle3, "mTextLinkTitle");
            layoutParams6.topMargin = dimensionPixelSize2 + mTextLinkTitle3.getMeasuredHeight();
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "context");
            layoutParams6.bottomMargin = context5.getResources().getDimensionPixelSize(R$dimen.link_action_retry_multi_bottom_margin);
        } else {
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "context");
            Resources resources = context6.getResources();
            int i4 = R$dimen.link_action_title_ver_margin;
            layoutParams2.topMargin = resources.getDimensionPixelSize(i4);
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "context");
            layoutParams2.bottomMargin = context7.getResources().getDimensionPixelSize(i4);
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "context");
            layoutParams4.topMargin = context8.getResources().getDimensionPixelSize(i4);
            Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "context");
            layoutParams4.bottomMargin = context9.getResources().getDimensionPixelSize(i4);
            Context context10 = getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "context");
            Resources resources2 = context10.getResources();
            int i5 = R$dimen.link_action_title_ver_margin_sub;
            layoutParams6.topMargin = resources2.getDimensionPixelSize(i5);
            Context context11 = getContext();
            Intrinsics.checkNotNullExpressionValue(context11, "context");
            layoutParams6.bottomMargin = context11.getResources().getDimensionPixelSize(i5);
        }
        TextView mTextLinkTitle4 = (TextView) a(i);
        Intrinsics.checkNotNullExpressionValue(mTextLinkTitle4, "mTextLinkTitle");
        mTextLinkTitle4.setLayoutParams(layoutParams2);
        TextView mTextLinking2 = (TextView) a(i2);
        Intrinsics.checkNotNullExpressionValue(mTextLinking2, "mTextLinking");
        mTextLinking2.setLayoutParams(layoutParams4);
        TextView mTextLinkAgain2 = (TextView) a(i3);
        Intrinsics.checkNotNullExpressionValue(mTextLinkAgain2, "mTextLinkAgain");
        mTextLinkAgain2.setLayoutParams(layoutParams6);
        this.mLayoutSetEnable = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.mLayoutSetEnable) {
            return;
        }
        f();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        int measuredWidth = getMeasuredWidth();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int dimensionPixelSize = measuredWidth - (context.getResources().getDimensionPixelSize(R$dimen.link_action_padding) * 2);
        TextView mTextLinkTitle = (TextView) a(R$id.mTextLinkTitle);
        Intrinsics.checkNotNullExpressionValue(mTextLinkTitle, "mTextLinkTitle");
        int measuredWidth2 = mTextLinkTitle.getMeasuredWidth();
        TextView mTextLinking = (TextView) a(R$id.mTextLinking);
        Intrinsics.checkNotNullExpressionValue(mTextLinking, "mTextLinking");
        int measuredWidth3 = measuredWidth2 + mTextLinking.getMeasuredWidth();
        TextView mTextLinkAgain = (TextView) a(R$id.mTextLinkAgain);
        Intrinsics.checkNotNullExpressionValue(mTextLinkAgain, "mTextLinkAgain");
        this.mTextTooLong = measuredWidth3 + mTextLinkAgain.getMeasuredWidth() >= dimensionPixelSize;
    }

    public final void setReconnectListener(@NotNull View.OnClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mListener = listener;
    }

    public UDeviceLinkingCell(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = UDeviceLinkingCell.class.getSimpleName();
        View.inflate(getContext(), R$layout.cell_linking, this);
        int i = R$id.mTextLinkAgain;
        TextView mTextLinkAgain = (TextView) a(i);
        Intrinsics.checkNotNullExpressionValue(mTextLinkAgain, "mTextLinkAgain");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        mTextLinkAgain.setBackground(new uek(context2));
        ((TextView) a(i)).setOnClickListener(new a());
    }
}
