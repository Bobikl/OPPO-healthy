package com.coui.appcompat.rotateview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.oplus.aiunit.vision.bj2;
import com.support.rotateview.R$attr;
import com.support.rotateview.R$string;
import com.support.rotateview.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUIRotateView extends AppCompatImageView {
    public static final int[] p = {R$attr.supportExpanded};
    public static final int[] q = {R$attr.supportCollapsed};
    public static final int[] r = {R$attr.supportExpandedAnimate};
    public static final int[] s = {R$attr.supportCollapsedAnimate};
    public Interpolator i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f1986j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1987l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f1988n;
    public String o;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            COUIRotateView.this.f1987l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            COUIRotateView.this.f1987l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            COUIRotateView.this.f1987l = true;
        }
    }

    public interface b {
    }

    public COUIRotateView(Context context) {
        this(context, null);
    }

    private void setState(boolean z) {
        if (this.k) {
            if (z) {
                setImageState(r, true);
                return;
            } else {
                setImageState(p, true);
                return;
            }
        }
        if (z) {
            setImageState(s, true);
        } else {
            setImageState(q, true);
        }
    }

    public void b(boolean z, boolean z2) {
        if (this.k == z) {
            return;
        }
        int i = this.m;
        if (i == 1) {
            if (this.f1987l) {
                return;
            }
            this.k = z;
            if (z2) {
                animate().rotation(z ? 180.0f : 0.0f);
            } else {
                setRotation(z ? 180.0f : 0.0f);
            }
        } else if (i == 0) {
            this.k = z;
            setState(z2);
        }
        c();
    }

    public final void c() {
        CharSequence contentDescription = super.getContentDescription();
        if (TextUtils.isEmpty(contentDescription) || TextUtils.equals(contentDescription, this.f1988n) || TextUtils.equals(contentDescription, this.o)) {
            setContentDescription(this.k ? this.f1988n : this.o);
        } else {
            bj2.c("COUIRotateView", "The user has set the content description, so the default description does not take effect.");
        }
    }

    public boolean isExpanded() {
        return this.k;
    }

    public void setExpanded(boolean z) {
        b(z, true);
    }

    public void setOnRotateStateChangeListener(b bVar) {
    }

    @Deprecated
    public void startCollapseAnimation() {
        int i = this.m;
        if (i == 1) {
            animate().rotation(0.0f);
            this.k = false;
            c();
        } else if (i == 0) {
            setExpanded(false);
        }
    }

    @Deprecated
    public void startExpandAnimation() {
        int i = this.m;
        if (i == 1) {
            animate().rotation(180.0f);
            this.k = true;
            c();
        } else if (i == 0) {
            setExpanded(true);
        }
    }

    public COUIRotateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public COUIRotateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.i = PathInterpolatorCompat.create(0.133f, 0.0f, 0.3f, 1.0f);
        this.f1986j = 400L;
        this.k = false;
        this.f1987l = false;
        if (getContext() != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.COUIRotateView);
            this.m = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUIRotateView_supportRotateType, 0);
            this.k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUIRotateView_supportExpanded, false);
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.m;
        if (i2 == 1) {
            animate().setDuration(this.f1986j).setInterpolator(this.i).setListener(new a());
        } else if (i2 == 0) {
            setState(true);
        }
        this.f1988n = getContext().getString(R$string.coui_toolar_expand_button_description);
        this.o = getContext().getString(R$string.coui_toolar_close_button_description);
        c();
    }
}
