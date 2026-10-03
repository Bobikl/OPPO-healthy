package com.heytap.health.watchface.business.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.health.ui.R$styleable;
import com.heytap.health.ui.widget.CircleImageView;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watch.watchface.proto.Proto$ScreenType;
import com.heytap.wearable.support.watchface.common.utils.DensityUtil;
import com.oplus.aiunit.vision.ggl;

/* JADX INFO: loaded from: classes19.dex */
public class WfPreviewImageView extends CircleImageView {
    public static final int BORDER_WIDTH = 2;
    public static final int INTER_BORDER_WIDTH = 6;
    public Proto$DeviceInfo J;
    public float K;
    public int L;
    public int M;
    public static final int BORDER_COLOR = Color.parseColor("#FF4F4F4F");
    public static final int INTER_BORDER_COLOR = Color.parseColor("#FF000000");

    public WfPreviewImageView(Context context) {
        this(context, null);
    }

    private void init() {
        setBorderColor(BORDER_COLOR);
        setBorderWidth(this.L);
        setInterBorderColor(INTER_BORDER_COLOR);
        int iDp2px = DensityUtil.dp2px(getContext(), 6.0f);
        this.M = iDp2px;
        setInterBorderWidth(iDp2px);
    }

    @Override // com.heytap.health.ui.widget.CircleImageView, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setDeviceInfo(size);
        int i3 = this.L;
        int i4 = this.M;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) ((((size - (i3 * 2)) - (i4 * 2)) * this.K) + (i3 * 2) + (i4 * 2)), 1073741824));
    }

    public void setDeviceInfo(Proto$DeviceInfo proto$DeviceInfo) {
        this.J = proto$DeviceInfo;
    }

    public void setHWScale(float f) {
        this.K = f;
        requestLayout();
    }

    public WfPreviewImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setDeviceInfo(int i) {
        Proto$DeviceInfo proto$DeviceInfo = this.J;
        if (proto$DeviceInfo != null) {
            Proto$ScreenType screenType = proto$DeviceInfo.getScreenType();
            if (screenType == Proto$ScreenType.SCREEN_TYPE_OVAL) {
                setType(0);
                this.K = 1.0f;
            } else if (screenType == Proto$ScreenType.SCREEN_TYPE_SQUARE) {
                setType(1);
                this.K = this.J.getScreenHeight() / this.J.getScreenWidth();
                setRoundRadius((int) ggl.l(getContext(), this.J, i));
            }
        }
    }

    public WfPreviewImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.L = context.obtainStyledAttributes(attributeSet, R$styleable.WfPreviewImageView, i, 0).getDimensionPixelSize(R$styleable.WfPreviewImageView_civ_out_border_width, DensityUtil.dp2px(getContext(), 2.0f));
        init();
    }
}
