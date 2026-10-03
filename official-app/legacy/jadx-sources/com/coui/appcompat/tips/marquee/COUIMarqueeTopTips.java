package com.coui.appcompat.tips.marquee;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.coui.appcompat.tips.def.COUIDefaultTopTips;
import com.coui.appcompat.tips.def.COUIDefaultTopTipsView;
import com.oplus.aiunit.vision.dp9;

/* JADX INFO: loaded from: classes13.dex */
public class COUIMarqueeTopTips extends COUIDefaultTopTips {
    public COUIDefaultTopTipsView x;

    public COUIMarqueeTopTips(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.coui.appcompat.tips.def.COUIDefaultTopTips
    public dp9 d() {
        COUIDefaultTopTipsView cOUIDefaultTopTipsView = (COUIDefaultTopTipsView) super.d();
        this.x = cOUIDefaultTopTipsView;
        return cOUIDefaultTopTipsView;
    }

    public COUIMarqueeTopTips(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIMarqueeTopTips(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
