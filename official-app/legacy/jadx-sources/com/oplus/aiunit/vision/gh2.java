package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.clickablespan.R$color;

/* JADX INFO: loaded from: classes13.dex */
public class gh2 extends ClickableSpan {
    public a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f11762j;
    public Context k;

    public interface a {
        void onClick();
    }

    public gh2(Context context) {
        this.k = context;
    }

    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f11762j = colorStateList;
        }
    }

    public void b(a aVar) {
        this.i = aVar;
    }

    @Override // android.text.style.ClickableSpan
    @SensorsDataInstrumented
    public void onClick(View view) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.onClick();
        }
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        ColorStateList colorStateList = AppCompatResources.getColorStateList(this.k, R$color.coui_clickable_text_color);
        this.f11762j = colorStateList;
        textPaint.setColor(colorStateList.getColorForState(textPaint.drawableState, 0));
    }
}
