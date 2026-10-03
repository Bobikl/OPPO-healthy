package com.heytap.nearx.uikit.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.xhc;

/* JADX INFO: loaded from: classes18.dex */
public final class TabItem extends View {
    public final CharSequence i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Drawable f7512j;
    public final int k;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TabItem);
        this.i = typedArrayObtainStyledAttributes.getText(R$styleable.TabItem_android_text);
        xhc xhcVar = xhc.INSTANCE;
        this.f7512j = xhc.b(context, typedArrayObtainStyledAttributes, R$styleable.TabItem_android_icon);
        this.k = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TabItem_android_layout, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
