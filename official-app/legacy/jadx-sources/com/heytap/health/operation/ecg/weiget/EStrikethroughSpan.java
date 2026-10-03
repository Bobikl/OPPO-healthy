package com.heytap.health.operation.ecg.weiget;

import android.text.TextPaint;
import android.text.style.StrikethroughSpan;
import androidx.annotation.NonNull;
import com.heytap.health.operation.R$color;
import com.oplus.aiunit.vision.rg7;

/* JADX INFO: loaded from: classes17.dex */
public class EStrikethroughSpan extends StrikethroughSpan {
    private int mColor = rg7.b(R$color.ecg_orign_span_color);

    @Override // android.text.style.StrikethroughSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        textPaint.setColor(this.mColor);
        super.updateDrawState(textPaint);
    }
}
