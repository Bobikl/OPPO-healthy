package com.coui.appcompat.searchview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.internal.TextWatcherAdapter;
import com.oplus.aiunit.vision.lh2;
import com.oplus.aiunit.vision.sh2;
import com.support.appcompat.R$attr;
import com.support.toolbar.R$dimen;
import com.support.toolbar.R$id;
import com.support.toolbar.R$style;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class COUIHintAnimationLayout extends FrameLayout {
    public static final TimeInterpolator C = PathInterpolatorCompat.create(0.3f, 0.0f, 0.2f, 1.0f);
    public static final sh2 D = new sh2();
    public int A;
    public int B;
    public List<String> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2026j;
    public Runnable k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f2027l;
    public TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f2028n;
    public String o;
    public AnimatorSet p;
    public AnimatorSet q;
    public ObjectAnimator r;
    public ObjectAnimator s;
    public ObjectAnimator t;
    public ObjectAnimator u;
    public EditText v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (COUIHintAnimationLayout.this.i.isEmpty()) {
                return;
            }
            COUIHintAnimationLayout cOUIHintAnimationLayout = COUIHintAnimationLayout.this;
            cOUIHintAnimationLayout.f2026j = (cOUIHintAnimationLayout.f2026j + 1) % COUIHintAnimationLayout.this.i.size();
            COUIHintAnimationLayout cOUIHintAnimationLayout2 = COUIHintAnimationLayout.this;
            if (cOUIHintAnimationLayout2.x) {
                cOUIHintAnimationLayout2.r((String) cOUIHintAnimationLayout2.i.get(COUIHintAnimationLayout.this.f2026j));
            }
            COUIHintAnimationLayout.this.postDelayed(this, 3000L);
        }
    }

    public class b extends TextWatcherAdapter {
        public b() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(COUIHintAnimationLayout.this.v.getText().toString())) {
                if (TextUtils.isEmpty(COUIHintAnimationLayout.this.o)) {
                    return;
                }
                COUIHintAnimationLayout.this.f2028n.setText(COUIHintAnimationLayout.this.o);
                COUIHintAnimationLayout.this.f2028n.setVisibility(0);
                COUIHintAnimationLayout.this.getNextHintTextView().setVisibility(8);
                return;
            }
            COUIHintAnimationLayout cOUIHintAnimationLayout = COUIHintAnimationLayout.this;
            cOUIHintAnimationLayout.removeCallbacks(cOUIHintAnimationLayout.k);
            COUIHintAnimationLayout.this.f2027l.setVisibility(8);
            COUIHintAnimationLayout.this.m.setVisibility(8);
            COUIHintAnimationLayout.this.s();
            COUIHintAnimationLayout.this.x = false;
        }
    }

    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            COUIHintAnimationLayout cOUIHintAnimationLayout = COUIHintAnimationLayout.this;
            cOUIHintAnimationLayout.f2028n = cOUIHintAnimationLayout.getNextHintTextView();
            if (COUIHintAnimationLayout.this.z) {
                COUIHintAnimationLayout.this.v();
                COUIHintAnimationLayout.this.z = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            COUIHintAnimationLayout.this.getNextHintTextView().setText(COUIHintAnimationLayout.this.o);
            COUIHintAnimationLayout.this.getNextHintTextView().setVisibility(0);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUIHintAnimationLayout.this.q.start();
        }
    }

    public interface e {
    }

    public COUIHintAnimationLayout(@NonNull Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TextView getNextHintTextView() {
        TextView textView = this.f2028n;
        TextView textView2 = this.f2027l;
        return textView == textView2 ? this.m : textView2;
    }

    public TextView getCurrentHintTextView() {
        return this.f2028n;
    }

    public List<String> getHintStrings() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        x();
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        v();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            if (this.y) {
                x();
                this.y = false;
                return;
            }
            return;
        }
        if (this.x) {
            v();
            this.y = true;
        }
    }

    public final boolean q() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.q;
        return (animatorSet2 != null && animatorSet2.isRunning()) || ((animatorSet = this.p) != null && animatorSet.isRunning());
    }

    public final void r(String str) {
        if (this.f2028n == null) {
            return;
        }
        int i = this.B + 1;
        this.B = i;
        int i2 = this.A;
        if (i2 != -1 && i > i2) {
            v();
            return;
        }
        this.o = str;
        int measuredHeight = ((getMeasuredHeight() - this.f2028n.getLineHeight()) / 2) + this.w;
        if (this.p == null || this.q == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f2028n, "translationY", 0.0f, -measuredHeight);
            this.r = objectAnimatorOfFloat;
            TimeInterpolator timeInterpolator = C;
            objectAnimatorOfFloat.setInterpolator(timeInterpolator);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f2028n, "alpha", 1.0f, 0.0f);
            this.s = objectAnimatorOfFloat2;
            sh2 sh2Var = D;
            objectAnimatorOfFloat2.setInterpolator(sh2Var);
            AnimatorSet animatorSet = new AnimatorSet();
            this.p = animatorSet;
            animatorSet.playTogether(this.r, this.s);
            this.p.setDuration(600L);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(getNextHintTextView(), "translationY", measuredHeight, 0.0f);
            this.t = objectAnimatorOfFloat3;
            objectAnimatorOfFloat3.setInterpolator(timeInterpolator);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(getNextHintTextView(), "alpha", 0.0f, 1.0f);
            this.u = objectAnimatorOfFloat4;
            objectAnimatorOfFloat4.setInterpolator(sh2Var);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.q = animatorSet2;
            animatorSet2.playTogether(this.t, this.u);
            this.q.setDuration(600L);
            this.q.addListener(new c());
        } else {
            this.r.setTarget(this.f2028n);
            this.s.setTarget(this.f2028n);
            this.t.setTarget(getNextHintTextView());
            this.u.setTarget(getNextHintTextView());
        }
        postDelayed(new d(), 150L);
        this.p.start();
    }

    public final void s() {
        AnimatorSet animatorSet = this.q;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.q.cancel();
        }
        AnimatorSet animatorSet2 = this.p;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            return;
        }
        this.p.cancel();
    }

    public void setCOUIHintAnimationChangeListener(e eVar) {
    }

    public void setHintsAnimation(List<String> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.v == null) {
            if (!(getChildAt(0) instanceof EditText)) {
                Log.e("COUIHintAnimationLayout", "Before calling this method, you must ensure that there is an edittext object in the container:1, you can call setSearchEditText or add an edittext yourself, refer to COUISearchBar2, you can put an edittext object in xml ( Refer to coui_search_view_animated_support_layout)to use the related functions of this animation container");
                return;
            }
            this.v = (EditText) getChildAt(0);
        }
        if (!TextUtils.isEmpty(this.v.getText().toString())) {
            Log.e("COUIHintAnimationLayout", "Setting hints animation content is invalid when the searchEdittext has a value");
            return;
        }
        t();
        u();
        if (!this.i.equals(list)) {
            this.i.clear();
            this.i.addAll(list);
        }
        if (this.f2028n == null) {
            this.f2028n = this.f2027l;
        }
        if (TextUtils.isEmpty(this.o)) {
            this.o = this.i.get(this.f2026j);
        }
        this.f2028n.setText(this.o);
        this.f2028n.setVisibility(0);
        removeCallbacks(this.k);
        this.v.setHint("");
        postDelayed(this.k, 3000L);
        this.x = true;
    }

    public void setRepeatCount(int i) {
        if (i <= 0) {
            Log.e("COUIHintAnimationLayout", "RepeatCount must be greater than zero");
        } else {
            this.A = i;
        }
    }

    public void setSearchEditText(EditText editText) {
        this.v = editText;
        if (getChildCount() == 0) {
            addView(this.v, new FrameLayout.LayoutParams(-1, -1));
        } else {
            Log.e("COUIHintAnimationLayout", "setSearchEditText() can only be executed once");
        }
    }

    public void setTextSize(int i) {
        TextView textView = this.f2027l;
        if (textView == null || this.m == null) {
            return;
        }
        float f = i;
        textView.setTextSize(0, f);
        this.m.setTextSize(0, f);
    }

    public final void t() {
        if (this.f2027l == null && this.m == null) {
            Context context = getContext();
            int i = R$style.Widget_COUI_EditText_SearchViewStyle_HintText;
            this.f2027l = new TextView(new ContextThemeWrapper(context, i), null);
            this.m = new TextView(new ContextThemeWrapper(getContext(), i), null);
            this.f2027l.setImportantForAccessibility(2);
            this.m.setImportantForAccessibility(2);
            TextView textView = this.f2027l;
            int i2 = com.support.appcompat.R$style.couiTextAppearanceBodyL;
            textView.setTextAppearance(i2);
            this.m.setTextAppearance(i2);
            TextView textView2 = this.f2027l;
            Context context2 = getContext();
            int i3 = R$attr.couiColorLabelSecondary;
            textView2.setTextColor(lh2.a(context2, i3));
            this.m.setTextColor(lh2.a(getContext(), i3));
            this.f2027l.setId(R$id.coui_hint_text_view_first);
            this.m.setId(R$id.coui_hint_text_view_then);
            addView(this.f2027l);
            addView(this.m);
        }
    }

    public final void u() {
        if (this.k == null) {
            this.i = new ArrayList();
            this.k = new a();
            this.v.addTextChangedListener(new b());
        }
    }

    public void v() {
        List<String> list;
        removeCallbacks(this.k);
        if (!this.x || (list = this.i) == null || list.size() == 0) {
            Log.e("COUIHintAnimationLayout", "pauseHintsAnimation return");
            return;
        }
        if (q()) {
            this.z = true;
            return;
        }
        w();
        this.x = false;
        if (TextUtils.isEmpty(this.o)) {
            this.f2027l.setVisibility(8);
            this.m.setVisibility(8);
        } else {
            this.f2028n.setText(this.o);
            this.f2028n.setVisibility(0);
            getNextHintTextView().setVisibility(8);
        }
    }

    public final void w() {
        this.f2027l.setTranslationY(0.0f);
        this.f2027l.setAlpha(1.0f);
        this.m.setTranslationY(0.0f);
        this.m.setAlpha(1.0f);
    }

    public void x() {
        setHintsAnimation(this.i);
    }

    public COUIHintAnimationLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2026j = 0;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = -1;
        this.B = 0;
        this.w = context.getResources().getDimensionPixelSize(R$dimen.coui_search_bar_animation_translate_extra);
    }
}
