package com.platform.sdk.center.sdk.mvvm.view.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.accountcenter.t;
import com.platform.sdk.center.R;
import com.platform.sdk.center.sdk.mvvm.model.data.PlateStyle;
import com.platform.sdk.center.widget.AcBaseView;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class GameVipCard extends AcBaseView {
    private LinearLayout mBlankArea;

    public GameVipCard(Context context) {
        super(context);
    }

    @Override // com.platform.sdk.center.widget.AcBaseView, com.platform.sdk.center.widget.bottomview.IPlateView
    public PlateStyle getPlateViewStyle() {
        return PlateStyle.CARD;
    }

    @Override // com.platform.sdk.center.widget.AcBaseView, android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mBlankArea = (LinearLayout) findViewById(R.id.blank_area);
        setRemindListTextColor(getResources().getColor(R.color.account_center_color_39BF56));
    }

    public void setRemindListTextColor(int i) {
        t tVar = this.mAccountInfoView.mAdapter;
        if (tVar != null) {
            tVar.f486c = i;
        }
    }

    public GameVipCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, R.layout.account_center_game_card, this);
    }
}
