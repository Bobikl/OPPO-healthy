package com.coui.appcompat.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.coui.appcompat.cardlist.COUICardListSelectedItemLayout;

/* JADX INFO: loaded from: classes13.dex */
public class COUICardListWithDividerItemLayout extends COUICardListSelectedItemLayout {
    public COUICardListWithDividerItemLayout(Context context) {
        super(context);
    }

    @Override // com.coui.appcompat.preference.ListSelectedItemLayout, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public COUICardListWithDividerItemLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public COUICardListWithDividerItemLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
