package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.coui.appcompat.bottomnavigation.COUINavigationView;
import com.coui.appcompat.button.COUIButton;

/* JADX INFO: loaded from: classes19.dex */
public class r50 {

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ COUIButton i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ COUINavigationView f16064j;

        public a(COUIButton cOUIButton, COUINavigationView cOUINavigationView) {
            this.i = cOUIButton;
            this.f16064j = cOUINavigationView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f16064j.clearAnimation();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            COUIButton cOUIButton = this.i;
            if (cOUIButton != null) {
                cOUIButton.setVisibility(8);
            }
            COUINavigationView cOUINavigationView = this.f16064j;
            cOUINavigationView.setTranslationY(cOUINavigationView.getHeight());
            this.f16064j.setVisibility(0);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public final /* synthetic */ COUINavigationView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ COUIButton f16065j;

        public b(COUINavigationView cOUINavigationView, COUIButton cOUIButton) {
            this.i = cOUINavigationView;
            this.f16065j = cOUIButton;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.i.clearAnimation();
            this.i.setVisibility(8);
            COUIButton cOUIButton = this.f16065j;
            if (cOUIButton != null) {
                cOUIButton.setVisibility(0);
            }
        }
    }

    public static void a(@NonNull COUINavigationView cOUINavigationView, @Nullable COUIButton cOUIButton) {
        cOUINavigationView.animate().translationY(cOUINavigationView.getHeight()).setDuration(300L).setListener(new b(cOUINavigationView, cOUIButton)).start();
    }

    public static void b(@NonNull COUINavigationView cOUINavigationView, @Nullable COUIButton cOUIButton) {
        cOUINavigationView.animate().translationY(0.0f).setDuration(300L).setListener(new a(cOUIButton, cOUINavigationView)).start();
    }
}
