package com.coui.appcompat.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.coui.appcompat.cardlist.COUICardListSelectedItemLayout;
import com.oplus.aiunit.vision.ifk;
import com.support.preference.R$dimen;
import com.support.preference.R$id;
import com.support.preference.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUICustomListSelectedLinearLayout extends COUICardListSelectedItemLayout {
    public static final int REMAINING_TOTAL_LINE = 2;
    public boolean M;
    public boolean N;
    public int O;
    public int P;

    public COUICustomListSelectedLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (r()) {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.coui.appcompat.preference.ListSelectedItemLayout, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.M) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final int p(TextView textView, int i, int i2, float[] fArr) {
        if (i2 == 0 || textView == null || textView.getVisibility() != 0 || TextUtils.isEmpty(textView.getText())) {
            return i2;
        }
        Layout layout = textView.getLayout();
        int lineCount = layout.getLineCount();
        if (i2 == 2) {
            fArr[0] = Float.valueOf(layout.getLineTop(0) + i).floatValue();
            i2--;
            if (lineCount < 2) {
                return i2;
            }
            fArr[1] = Float.valueOf(i + layout.getLineBottom(1)).floatValue();
        } else {
            if (i2 != 1) {
                return i2;
            }
            fArr[1] = Float.valueOf(i + layout.getLineBottom(0)).floatValue();
        }
        return i2 - 1;
    }

    public final void q(Context context, AttributeSet attributeSet) {
        setOrientation(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUICustomListSelectedLinearLayout);
        this.M = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUICustomListSelectedLinearLayout_couiPreferenceWithDividerItem, false);
        typedArrayObtainStyledAttributes.recycle();
        this.O = getContext().getResources().getDimensionPixelSize(R$dimen.support_preference_text_content_padding_top);
        this.P = getContext().getResources().getDimensionPixelSize(R$dimen.support_preference_margin_between_line);
    }

    public final boolean r() {
        AppCompatImageView appCompatImageView;
        int measuredHeight;
        int lineCount;
        int measuredHeight2;
        int lineCount2;
        int iQ;
        View viewFindViewById = findViewById(R$id.img_layout);
        if (viewFindViewById == null || viewFindViewById.getVisibility() != 0 || (appCompatImageView = (AppCompatImageView) findViewById(R.id.icon)) == null) {
            return false;
        }
        boolean z = findViewById(R$id.messageLayout) != null;
        TextView textView = (TextView) findViewById(R.id.title);
        TextView textView2 = (TextView) findViewById(R.id.summary);
        if (textView == null || textView.getVisibility() != 0) {
            measuredHeight = 0;
            lineCount = 0;
        } else {
            lineCount = textView.getLineCount();
            measuredHeight = textView.getMeasuredHeight() + this.P;
        }
        if (textView2 == null || textView2.getVisibility() != 0) {
            measuredHeight2 = 0;
            lineCount2 = 0;
        } else {
            lineCount2 = textView2.getLineCount();
            measuredHeight2 = textView2.getMeasuredHeight() + this.P;
        }
        TextView textView3 = (TextView) findViewById(R$id.assignment);
        int lineCount3 = (z || textView3 == null || textView3.getVisibility() != 0) ? 0 : textView3.getLineCount();
        if (this.N) {
            iQ = ifk.q(getContext(), appCompatImageView.getMeasuredHeight());
        } else {
            iQ = ifk.q(getContext(), appCompatImageView.getDrawable() != null ? appCompatImageView.getDrawable().getIntrinsicHeight() : 0);
        }
        int i = lineCount + lineCount2 + lineCount3;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewFindViewById.getLayoutParams();
        if (i > 2) {
            t(layoutParams, measuredHeight, measuredHeight2, viewFindViewById);
        } else {
            s(layoutParams, iQ, i);
        }
        viewFindViewById.setLayoutParams(layoutParams);
        return true;
    }

    public final void s(LinearLayout.LayoutParams layoutParams, int i, int i2) {
        layoutParams.gravity = 16;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_icon_margin_top);
        if (i == 24) {
            dimensionPixelSize = i2 <= 1 ? getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_24icon_margin_vertical_default) : getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_24icon_margin_top_multiline);
        } else if (i == 32) {
            dimensionPixelSize = i2 <= 1 ? getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_32icon_margin_vertical_default) : getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_32icon_margin_top_multiline);
        } else if (i == 36) {
            dimensionPixelSize = i2 <= 1 ? getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_36icon_margin_vertical_default) : getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_36icon_margin_top_multiline);
        } else if (i == 50) {
            dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_50icon_margin_vertical_default);
        }
        if (layoutParams.topMargin == dimensionPixelSize && layoutParams.bottomMargin == dimensionPixelSize) {
            return;
        }
        layoutParams.topMargin = dimensionPixelSize;
        layoutParams.bottomMargin = dimensionPixelSize;
    }

    public void setIconMarginDependOnImageView(boolean z) {
        this.N = z;
    }

    public final void t(LinearLayout.LayoutParams layoutParams, int i, int i2, View view) {
        layoutParams.gravity = 48;
        float[] fArr = new float[2];
        int i3 = this.O;
        int i4 = i3 + i;
        p((TextView) findViewById(R$id.assignment), i + i3 + i2, p((TextView) findViewById(R.id.summary), i4, p((TextView) findViewById(R.id.title), i3, 2, fArr), fArr), fArr);
        int iMax = Math.max((int) (((fArr[0] + fArr[1]) / 2.0f) - (view.getMeasuredHeight() / 2.0f)), getContext().getResources().getDimensionPixelSize(R$dimen.coui_preference_50icon_margin_vertical_default));
        if (layoutParams.topMargin != iMax) {
            layoutParams.topMargin = iMax;
        }
    }

    public COUICustomListSelectedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = false;
        q(context, attributeSet);
    }
}
