package com.coui.appcompat.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.preference.PreferenceViewHolder;
import com.coui.appcompat.textview.COUITextView;
import com.oplus.anim.EffectiveAnimationView;
import com.support.preference.R$attr;
import com.support.preference.R$id;

/* JADX INFO: loaded from: classes13.dex */
public class COUIStatusSwitchingPreference extends COUIPreference {
    public EffectiveAnimationView Q;
    public COUITextView R;
    public ImageView S;
    public int T;
    public int U;
    public int V;
    public int W;
    public CharSequence X;
    public Drawable Y;

    public COUIStatusSwitchingPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiStatusSwitchingPreferenceStyle);
    }

    public final void l() {
        EffectiveAnimationView effectiveAnimationView = this.Q;
        if (effectiveAnimationView != null) {
            effectiveAnimationView.setVisibility(0);
            this.R.setVisibility(8);
            this.S.setVisibility(8);
            p();
            o();
        }
    }

    public final void m() {
        if (this.S == null || this.Y == null) {
            return;
        }
        r();
        this.Q.setVisibility(8);
        this.R.setVisibility(8);
        this.S.setVisibility(0);
        this.S.setImageDrawable(this.Y);
    }

    public final void n() {
        if (this.R != null) {
            r();
            this.Q.setVisibility(8);
            this.R.setVisibility(0);
            this.S.setVisibility(8);
            this.R.setText(this.X);
        }
    }

    public final void o() {
        r();
        this.Q.setAnimation(this.W);
        this.Q.loop(true);
        this.Q.playAnimation();
    }

    @Override // com.coui.appcompat.preference.COUIPreference, androidx.preference.Preference
    public void onBindViewHolder(PreferenceViewHolder preferenceViewHolder) {
        super.onBindViewHolder(preferenceViewHolder);
        this.Q = (EffectiveAnimationView) preferenceViewHolder.findViewById(R$id.coui_anim);
        this.R = (COUITextView) preferenceViewHolder.findViewById(R$id.coui_text);
        this.S = (ImageView) preferenceViewHolder.findViewById(R$id.coui_image);
        int i = this.T;
        if (i == 1) {
            l();
        } else if (i == 2) {
            n();
        } else {
            if (i != 3) {
                return;
            }
            m();
        }
    }

    public final void p() {
        ViewGroup.LayoutParams layoutParams = this.Q.getLayoutParams();
        layoutParams.width = this.U;
        layoutParams.height = this.V;
        this.Q.setLayoutParams(layoutParams);
    }

    public final void r() {
        EffectiveAnimationView effectiveAnimationView = this.Q;
        if (effectiveAnimationView == null || !effectiveAnimationView.isAnimating()) {
            return;
        }
        this.Q.cancelAnimation();
    }

    public COUIStatusSwitchingPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, i);
    }

    public COUIStatusSwitchingPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.T = 0;
        this.U = -2;
        this.V = -2;
    }
}
