package com.heytap.health.wallet.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.a;
import com.oplus.aiunit.vision.a94;
import com.oplus.aiunit.vision.fe4;
import com.oplus.aiunit.vision.hqf;
import com.oplus.aiunit.vision.sg7;
import com.oplus.aiunit.vision.u43;
import com.oplus.aiunit.vision.v68;
import com.oppo.lib.common.R$drawable;
import com.oppo.lib.common.R$styleable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class CircleNetworkImageView extends AppCompatImageView {
    public static final int IMG_TYPE_CIRCLE = 804;
    public static final int IMG_TYPE_RECT_TANGLE = 576;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6412j;

    @DrawableRes
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f6413l;
    public WeakReference<Context> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f6414n;

    public CircleNetworkImageView(Context context) {
        super(context);
        this.i = -1;
        this.f6412j = 10;
        this.k = 0;
        WeakReference<Context> weakReference = new WeakReference<>(getContext());
        this.m = weakReference;
        this.f6414n = weakReference.get();
    }

    private Drawable getPlaceHolderDrawable() {
        if (this.k != 0) {
            return ContextCompat.getDrawable(getContext(), this.k);
        }
        return getDrawable() != null ? getDrawable() : ContextCompat.getDrawable(getContext(), R$drawable.bg_placeholder);
    }

    public final hqf<Drawable> a(int i) {
        return (hqf) a.v(this.f6414n).o(Integer.valueOf(i)).k().s0(false).i0(getPlaceHolderDrawable());
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CircleNetworkImageView);
        this.i = typedArrayObtainStyledAttributes.getInteger(R$styleable.CircleNetworkImageView_image_type, -1);
        this.f6412j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.CircleNetworkImageView_radius, 3);
        this.k = typedArrayObtainStyledAttributes.getResourceId(R$styleable.CircleNetworkImageView_place_holder, R$drawable.bg_placeholder);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void c(int i) {
        int i2 = this.i;
        if (i2 == 804) {
            fe4 fe4Var = new fe4(this.f6414n);
            if (a94.a(this.f6414n)) {
                a(i).z0(new u43(), fe4Var).Q0(this);
                return;
            }
            return;
        }
        if (i2 != 576) {
            if (a94.a(this.f6414n)) {
                a(i).c().Q0(this);
            }
        } else {
            v68 v68Var = new v68(this.f6414n, this.f6412j);
            if (a94.a(this.f6414n)) {
                a(i).z0(new u43(), v68Var).Q0(this);
            }
        }
    }

    public String getImgUrl() {
        return this.f6413l;
    }

    public void setImageBitmap(String str) {
        setImageUrl(str);
    }

    public void setImageUrl(String str) {
        if (this.m.get() == null) {
            return;
        }
        this.f6413l = str;
        int i = this.i;
        if (i == 804) {
            fe4 fe4Var = new fe4(this.f6414n);
            if (a94.a(this.f6414n)) {
                a.v(this.f6414n).q(str).k().s0(false).i0(getPlaceHolderDrawable()).z0(new sg7(), fe4Var).Q0(this).clearOnDetach();
                return;
            }
            return;
        }
        if (i != 576) {
            if (a94.a(this.f6414n)) {
                a.v(this.f6414n).q(str).k().s0(false).i0(getPlaceHolderDrawable()).Q0(this);
            }
        } else {
            v68 v68Var = new v68(this.f6414n, this.f6412j);
            if (a94.a(this.f6414n)) {
                a.v(this.f6414n).q(str).k().s0(false).i0(getPlaceHolderDrawable()).z0(new sg7(), v68Var).Q0(this);
            }
        }
    }

    public void setPlaceHolderDrawable(@DrawableRes int i) {
        this.k = i;
    }

    public CircleNetworkImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = -1;
        this.f6412j = 10;
        this.k = 0;
        WeakReference<Context> weakReference = new WeakReference<>(getContext());
        this.m = weakReference;
        this.f6414n = weakReference.get();
        b(context, attributeSet);
    }

    public CircleNetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = -1;
        this.f6412j = 10;
        this.k = 0;
        WeakReference<Context> weakReference = new WeakReference<>(getContext());
        this.m = weakReference;
        this.f6414n = weakReference.get();
        b(context, attributeSet);
    }
}
