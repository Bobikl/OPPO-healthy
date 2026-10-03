package com.heytap.health.watchface.business.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.health.base.view.RoundedImageView;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watch.watchface.proto.Proto$ScreenType;
import com.oplus.aiunit.vision.ggl;
import com.oplus.aiunit.vision.ltl;

/* JADX INFO: loaded from: classes19.dex */
public class FlexWfPreviewView extends RoundedImageView {
    public Proto$DeviceInfo A;
    public float z;

    public FlexWfPreviewView(Context context) {
        super(context);
        this.z = 1.0f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        setDeviceInfo(size);
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (size * this.z), 1073741824));
    }

    public void setDeviceInfo(Proto$DeviceInfo proto$DeviceInfo) {
        this.A = proto$DeviceInfo;
    }

    public void setHWScale(float f) {
        this.z = f;
        requestLayout();
    }

    private void setDeviceInfo(int i) {
        Proto$DeviceInfo proto$DeviceInfo = this.A;
        if (proto$DeviceInfo != null) {
            Proto$ScreenType screenType = proto$DeviceInfo.getScreenType();
            if (screenType == Proto$ScreenType.SCREEN_TYPE_OVAL) {
                setOval(true);
                return;
            }
            if (screenType == Proto$ScreenType.SCREEN_TYPE_SQUARE) {
                setOval(false);
                int screenWidth = this.A.getScreenWidth();
                int screenHeight = this.A.getScreenHeight();
                this.z = screenHeight / screenWidth;
                ltl.a("FlexWfPreviewView", "[setDeviceInfo] screenWidth " + screenWidth + " screenHeight " + screenHeight);
                setCornerRadius(ggl.l(getContext(), this.A, i));
            }
        }
    }

    public FlexWfPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z = 1.0f;
    }

    public FlexWfPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.z = 1.0f;
    }
}
