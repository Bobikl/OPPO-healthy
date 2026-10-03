package com.platform.sdk.center.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.platform.sdk.center.R;

/* JADX INFO: loaded from: classes9.dex */
public class GameAccountInfoView extends HeyTapAccountInfoView {
    public GameAccountInfoView(Context context) {
        super(context);
    }

    @Override // com.platform.sdk.center.widget.HeyTapAccountInfoView
    public final void inflateView(Context context) {
        View.inflate(context, R.layout.account_center_header_heytap_account_info_game, this);
    }

    public GameAccountInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
