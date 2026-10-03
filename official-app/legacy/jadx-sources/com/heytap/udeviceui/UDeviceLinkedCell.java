package com.heytap.udeviceui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.txa;
import com.oplus.deviceui.BatteryView;
import java.util.HashMap;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u001d\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\t\u001a\u00020\u0007H\u0014J0\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fH\u0014J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0002R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/heytap/udeviceui/UDeviceLinkedCell;", "Landroid/widget/RelativeLayout;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "linkTitle", "Lcom/oplus/aiunit/vision/txa;", "linkTextItem", "", "b", "onAttachedToWindow", "", "changed", "", LogFieldKey.LEVEL_KEY, "t", "r", "onLayout", "onGlobalLayout", "c", "i", "Z", "mLayoutSetEnable", "j", "mTextTooLong", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class UDeviceLinkedCell extends RelativeLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean mLayoutSetEnable;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean mTextTooLong;
    public HashMap k;

    public UDeviceLinkedCell(@Nullable Context context) {
        super(context);
        View.inflate(getContext(), R$layout.cell_linked, this);
    }

    public View a(int i) {
        if (this.k == null) {
            this.k = new HashMap();
        }
        View view = (View) this.k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.k.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    public final void b(@Nullable String linkTitle, @Nullable txa linkTextItem) {
        this.mLayoutSetEnable = false;
        if (linkTextItem == null) {
            LinearLayout mContainerLinkedText = (LinearLayout) a(R$id.mContainerLinkedText);
            Intrinsics.checkNotNullExpressionValue(mContainerLinkedText, "mContainerLinkedText");
            mContainerLinkedText.setVisibility(8);
            return;
        }
        TextView mTextLinkedTitle = (TextView) a(R$id.mTextLinkedTitle);
        Intrinsics.checkNotNullExpressionValue(mTextLinkedTitle, "mTextLinkedTitle");
        mTextLinkedTitle.setText(linkTitle);
        LinearLayout mContainerLinkedText2 = (LinearLayout) a(R$id.mContainerLinkedText);
        Intrinsics.checkNotNullExpressionValue(mContainerLinkedText2, "mContainerLinkedText");
        mContainerLinkedText2.setVisibility(0);
        StringBuffer stringBuffer = new StringBuffer();
        if (!TextUtils.isEmpty(linkTextItem.getCom.heytap.speech.engine.protocol.event.payload.analogclick.Feedback.WIDGET_LABEL java.lang.String())) {
            stringBuffer.append(linkTextItem.getCom.heytap.speech.engine.protocol.event.payload.analogclick.Feedback.WIDGET_LABEL java.lang.String());
            stringBuffer.append(" ");
        }
        stringBuffer.append(linkTextItem.getValueShow());
        if (linkTextItem.getShowBattery()) {
            int i = R$id.mIconBattery;
            BatteryView mIconBattery = (BatteryView) a(i);
            Intrinsics.checkNotNullExpressionValue(mIconBattery, "mIconBattery");
            mIconBattery.setVisibility(0);
            ((BatteryView) a(i)).setPower(linkTextItem.getValue());
            ((BatteryView) a(i)).setIsCharging(linkTextItem.getIsCharging());
        } else {
            BatteryView mIconBattery2 = (BatteryView) a(R$id.mIconBattery);
            Intrinsics.checkNotNullExpressionValue(mIconBattery2, "mIconBattery");
            mIconBattery2.setVisibility(8);
        }
        TextView mTextLinked = (TextView) a(R$id.mTextLinked);
        Intrinsics.checkNotNullExpressionValue(mTextLinked, "mTextLinked");
        mTextLinked.setText(stringBuffer.toString());
    }

    public final void c() {
        int i = R$id.mTextLinkedTitle;
        TextView mTextLinkedTitle = (TextView) a(i);
        Intrinsics.checkNotNullExpressionValue(mTextLinkedTitle, "mTextLinkedTitle");
        ViewGroup.LayoutParams layoutParams = mTextLinkedTitle.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int i2 = R$id.mContainerLinkedText;
        LinearLayout mContainerLinkedText = (LinearLayout) a(i2);
        Intrinsics.checkNotNullExpressionValue(mContainerLinkedText, "mContainerLinkedText");
        ViewGroup.LayoutParams layoutParams3 = mContainerLinkedText.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
        if (this.mTextTooLong) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            layoutParams2.topMargin = context.getResources().getDimensionPixelSize(R$dimen.link_action_title_multi_top_margin);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R$dimen.link_action_content_multi_top_margin);
            TextView mTextLinkedTitle2 = (TextView) a(i);
            Intrinsics.checkNotNullExpressionValue(mTextLinkedTitle2, "mTextLinkedTitle");
            layoutParams4.topMargin = dimensionPixelSize + mTextLinkedTitle2.getMeasuredHeight();
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            layoutParams4.bottomMargin = context3.getResources().getDimensionPixelSize(R$dimen.link_action_content_multi_bottom_margin);
        } else {
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            Resources resources = context4.getResources();
            int i3 = R$dimen.link_action_title_ver_margin;
            layoutParams2.topMargin = resources.getDimensionPixelSize(i3);
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "context");
            layoutParams2.bottomMargin = context5.getResources().getDimensionPixelSize(i3);
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "context");
            layoutParams4.topMargin = context6.getResources().getDimensionPixelSize(i3);
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "context");
            layoutParams4.bottomMargin = context7.getResources().getDimensionPixelSize(i3);
        }
        TextView mTextLinkedTitle3 = (TextView) a(i);
        Intrinsics.checkNotNullExpressionValue(mTextLinkedTitle3, "mTextLinkedTitle");
        mTextLinkedTitle3.setLayoutParams(layoutParams2);
        LinearLayout mContainerLinkedText2 = (LinearLayout) a(i2);
        Intrinsics.checkNotNullExpressionValue(mContainerLinkedText2, "mContainerLinkedText");
        mContainerLinkedText2.setLayoutParams(layoutParams4);
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
        c();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t, int r, int b) {
        super.onLayout(changed, l2, t, r, b);
        int measuredWidth = getMeasuredWidth();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int dimensionPixelSize = measuredWidth - (context.getResources().getDimensionPixelSize(R$dimen.link_action_padding) * 2);
        TextView mTextLinkedTitle = (TextView) a(R$id.mTextLinkedTitle);
        Intrinsics.checkNotNullExpressionValue(mTextLinkedTitle, "mTextLinkedTitle");
        int measuredWidth2 = mTextLinkedTitle.getMeasuredWidth();
        LinearLayout mContainerLinkedText = (LinearLayout) a(R$id.mContainerLinkedText);
        Intrinsics.checkNotNullExpressionValue(mContainerLinkedText, "mContainerLinkedText");
        this.mTextTooLong = measuredWidth2 + mContainerLinkedText.getMeasuredWidth() >= dimensionPixelSize;
    }

    public UDeviceLinkedCell(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R$layout.cell_linked, this);
    }
}
