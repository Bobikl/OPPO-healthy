package com.heytap.nearx.uikit.widget;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes18.dex */
public class NearChangeableDialogMessage extends AppCompatTextView {
    public NearChangeableDialogMessage(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null) {
            if (layout.getLineCount() > 1) {
                setTextAlignment(2);
            } else {
                setTextAlignment(4);
            }
            setText(getText());
        }
    }

    public NearChangeableDialogMessage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NearChangeableDialogMessage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
