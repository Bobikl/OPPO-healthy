package com.platform.sdk.center.sdk.mvvm.view.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.platform.sdk.center.R;
import com.platform.sdk.center.widget.AcBaseView;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class HeyTapVipCard extends AcBaseView {
    public HeyTapVipCard(Context context) {
        super(context);
    }

    public HeyTapVipCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.account_center_heytap_card, this);
    }
}
