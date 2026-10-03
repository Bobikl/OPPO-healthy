package com.heytap.health.wallet.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.oppo.lib.common.R$color;
import com.oppo.lib.common.R$id;
import com.oppo.lib.common.R$layout;
import com.oppo.lib.common.R$styleable;

/* JADX INFO: loaded from: classes18.dex */
public class RelativeItemLayout extends RelativeLayout {
    public ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f6423j;
    public TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f6424l;
    public TextView m;

    public RelativeItemLayout(Context context) {
        this(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.layout_relative_item, this);
        this.i = (ImageView) viewInflate.findViewById(R$id.iv_logo);
        this.f6423j = (TextView) viewInflate.findViewById(R$id.tv_left);
        this.k = (TextView) viewInflate.findViewById(R$id.tv_right);
        this.f6424l = (ImageView) viewInflate.findViewById(R$id.arrow);
        this.m = (TextView) viewInflate.findViewById(R$id.dividing_line);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RelativeItemLayout);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.RelativeItemLayout_ImageLeft);
            String string = typedArrayObtainStyledAttributes.getString(R$styleable.RelativeItemLayout_TextLeft);
            String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.RelativeItemLayout_TextRight);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RelativeItemLayout_showImageLeft, false);
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RelativeItemLayout_showArrow, true);
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RelativeItemLayout_showLine, false);
            this.i.setImageDrawable(drawable);
            TextView textView = this.f6423j;
            if (TextUtils.isEmpty(string)) {
                string = "";
            }
            textView.setText(string);
            TextView textView2 = this.k;
            if (TextUtils.isEmpty(string2)) {
                string2 = "";
            }
            textView2.setText(string2);
            this.i.setVisibility(z ? 0 : 8);
            this.f6424l.setVisibility(z2 ? 0 : 8);
            this.m.setVisibility(z3 ? 0 : 8);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            this.f6423j.setTextColor(getResources().getColor(R$color.color_000000, null));
        } else {
            this.f6423j.setTextColor(getResources().getColor(R$color.color_BBC0CB, null));
        }
    }

    public RelativeItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }
}
