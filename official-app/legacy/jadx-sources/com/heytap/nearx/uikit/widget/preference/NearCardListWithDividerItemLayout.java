package com.heytap.nearx.uikit.widget.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.heytap.nearx.uikit.widget.cardlist.NearCardListSelectedItemLayout;

/* JADX INFO: loaded from: classes18.dex */
public class NearCardListWithDividerItemLayout extends NearCardListSelectedItemLayout {
    public NearCardListWithDividerItemLayout(Context context) {
        super(context);
    }

    @Override // com.heytap.nearx.uikit.widget.preference.NearListSelectedItemLayout, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public NearCardListWithDividerItemLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NearCardListWithDividerItemLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
