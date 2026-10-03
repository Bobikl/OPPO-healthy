package com.heytap.health.watchface.business.legacy.creation.album;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;

/* JADX INFO: loaded from: classes19.dex */
public class c extends PopupWindow implements View.OnClickListener {
    public final ListView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC0707c f6880j;
    public final View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f6881l;
    public int m;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View i;

        public a(View view) {
            this.i = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.i.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            int height = (int) (this.i.getHeight() * 0.625f);
            int height2 = c.this.i.getHeight();
            ViewGroup.LayoutParams layoutParams = c.this.i.getLayoutParams();
            layoutParams.height = Math.min(height2, height);
            c.this.i.setLayoutParams(layoutParams);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) c.this.f6881l.getLayoutParams();
            layoutParams2.height = c.this.m;
            c.this.f6881l.setLayoutParams(layoutParams2);
            c.this.g();
        }
    }

    public class b implements Animator.AnimatorListener {
        public b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c.super.dismiss();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.i.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.watchface.business.legacy.creation.album.c$c, reason: collision with other inner class name */
    public interface InterfaceC0707c {
        void onItemClick(AdapterView<?> adapterView, View view, int i, long j2);
    }

    public c(Context context, BaseAdapter baseAdapter) {
        super(context);
        View viewInflate = View.inflate(context, R$layout.watch_face_pop_folder_select, null);
        viewInflate.findViewById(R$id.fl_pop_layout).setOnClickListener(this);
        this.k = viewInflate.findViewById(R$id.masker);
        View viewFindViewById = viewInflate.findViewById(R$id.margin);
        this.f6881l = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        ListView listView = (ListView) viewInflate.findViewById(R$id.listView);
        this.i = listView;
        listView.setAdapter((ListAdapter) baseAdapter);
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setFocusable(true);
        setOutsideTouchable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        setAnimationStyle(0);
        viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(new a(viewInflate));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.oplus.aiunit.vision.yv7
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
                this.i.i(adapterView, view, i, j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(AdapterView adapterView, View view, int i, long j2) {
        InterfaceC0707c interfaceC0707c = this.f6880j;
        if (interfaceC0707c != null) {
            interfaceC0707c.onItemClick(adapterView, view, i, j2);
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        h();
    }

    public final void g() {
        this.k.setVisibility(0);
        ListView listView = this.i;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(listView, "translationY", listView.getHeight(), 0.0f);
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.start();
    }

    public final void h() {
        this.k.setVisibility(8);
        ListView listView = this.i;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(listView, "translationY", 0.0f, listView.getHeight());
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat.addListener(new b());
        objectAnimatorOfFloat.start();
    }

    public void j(int i) {
        this.m = i;
    }

    public void k(int i) {
        this.i.setSelection(i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dismiss();
    }

    public void setOnItemClickListener(InterfaceC0707c interfaceC0707c) {
        this.f6880j = interfaceC0707c;
    }
}
