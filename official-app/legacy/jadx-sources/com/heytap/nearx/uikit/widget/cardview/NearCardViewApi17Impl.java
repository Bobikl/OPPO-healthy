package com.heytap.nearx.uikit.widget.cardview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;
import com.oplus.aiunit.vision.rkc;

/* JADX INFO: loaded from: classes18.dex */
@RequiresApi(17)
class NearCardViewApi17Impl extends NearCardViewBaseImpl {
    @Override // com.heytap.nearx.uikit.widget.cardview.NearCardViewBaseImpl, com.heytap.nearx.uikit.widget.cardview.NearCardViewImpl
    public void initStatic() {
        NearRoundRectDrawableWithShadow.setRoundRectHelper(new NearRoundRectDrawableWithShadow.RoundRectHelper() { // from class: com.heytap.nearx.uikit.widget.cardview.NearCardViewApi17Impl.1
            @Override // com.heytap.nearx.uikit.widget.cardview.NearRoundRectDrawableWithShadow.RoundRectHelper
            public void drawRoundRect(Canvas canvas, RectF rectF, float f, Paint paint) {
                canvas.drawPath(rkc.a().d(rectF, f), paint);
            }
        });
    }
}
