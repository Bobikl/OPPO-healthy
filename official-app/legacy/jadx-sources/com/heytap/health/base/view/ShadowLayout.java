package com.heytap.health.base.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.heytap.health.base.R$mipmap;
import com.oplus.aiunit.vision.ejg;

/* JADX INFO: loaded from: classes15.dex */
public class ShadowLayout extends ConstraintLayout {
    public ShadowLayout(Context context) {
        this(context, null);
    }

    public ShadowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ShadowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackground(ContextCompat.getDrawable(context, R$mipmap.lib_base_shadow_bg));
        int iA = ejg.a(context, 16.0f);
        setPadding(iA, ejg.a(context, 12.0f), iA, ejg.a(context, 33.0f));
    }
}
