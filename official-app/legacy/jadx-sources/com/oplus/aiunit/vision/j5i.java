package com.oplus.aiunit.vision;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j5i extends ClickableSpan implements View.OnClickListener {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12760j;
    public boolean k;

    public j5i(int i) {
        this.i = i;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.i);
        textPaint.setFakeBoldText(this.k);
        textPaint.setUnderlineText(this.f12760j);
        textPaint.clearShadowLayer();
    }
}
