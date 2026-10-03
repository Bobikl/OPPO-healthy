package com.heytap.health.settings.band.settings.sporthealthsetting.appsedit;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.heytap.health.device_settings.impl.R$id;
import com.heytap.health.device_settings.impl.R$layout;
import com.oplus.aiunit.vision.g07;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class EditAppsAdapter extends RecyclerView.Adapter<EditViewHolder> {
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f5326j;
    public List<AppEditBean> k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5327l;

    public class EditViewHolder extends RecyclerView.ViewHolder {
        public COUICheckBox i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TextView f5328j;
        public ImageView k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f5329l;
        public String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f5330n;
        public AnimatorSet o;
        public AnimatorSet p;

        public EditViewHolder(View view) {
            super(view);
            this.f5329l = "elevation";
            this.m = "scaleX";
            this.f5330n = "scaleY";
            this.i = (COUICheckBox) view.findViewById(R$id.cb_theme);
            this.f5328j = (TextView) view.findViewById(R$id.tv_name);
            this.k = (ImageView) view.findViewById(R$id.iv_icon_pull);
            a();
        }

        public final void a() {
            c();
            b();
        }

        public final void b() {
            this.p = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.itemView, this.m, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.itemView, this.f5330n, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.itemView, this.f5329l, 16.0f, 0.0f);
            this.p.setDuration(400L);
            this.p.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            this.p.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        }

        public final void c() {
            this.o = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.itemView, this.f5329l, 0.0f, 16.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(PathInterpolatorCompat.create(0.4f, 0.0f, 0.2f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.itemView, this.m, 1.0f, 1.1f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.itemView, this.f5330n, 1.0f, 1.1f);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            this.o.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat);
        }

        public void d() {
            AnimatorSet animatorSet = this.o;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.o.end();
            }
            this.p.start();
            if (EditAppsAdapter.this.f5326j == null || !EditAppsAdapter.this.f5327l) {
                return;
            }
            EditAppsAdapter.this.f5326j.o(EditAppsAdapter.this.k);
        }

        public void e() {
            AnimatorSet animatorSet = this.p;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.p.end();
            }
            this.o.start();
            EditAppsAdapter.this.f5327l = false;
        }
    }

    public interface a {
        void b(RecyclerView.ViewHolder viewHolder);
    }

    public interface b {
        void o(List<AppEditBean> list);
    }

    public EditAppsAdapter(Context context, b bVar, a aVar) {
        this.f5326j = bVar;
        this.i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(AppEditBean appEditBean, EditViewHolder editViewHolder, int i, COUICheckBox cOUICheckBox, int i2) {
        if (cOUICheckBox.isPressed()) {
            boolean z = i2 == 2;
            appEditBean.setSeleted(z);
            editViewHolder.k.setVisibility(z ? 0 : 8);
            this.k.get(i).setSeleted(z);
            b bVar = this.f5326j;
            if (bVar != null) {
                bVar.o(this.k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(AppEditBean appEditBean, EditViewHolder editViewHolder, int i, View view) {
        boolean z = !appEditBean.isSeleted();
        appEditBean.setSeleted(z);
        editViewHolder.i.setState(appEditBean.isSeleted() ? 2 : 0);
        editViewHolder.k.setVisibility(z ? 0 : 8);
        this.k.get(i).setSeleted(z);
        b bVar = this.f5326j;
        if (bVar != null) {
            bVar.o(this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean m(EditViewHolder editViewHolder, View view, MotionEvent motionEvent) {
        if (this.i == null) {
            return false;
        }
        if (motionEvent.getAction() != 0) {
            return true;
        }
        this.i.b(editViewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<AppEditBean> list = this.k;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull final EditViewHolder editViewHolder, final int i) {
        final AppEditBean appEditBean = this.k.get(i);
        editViewHolder.f5328j.setText(g07.b(appEditBean.getScreenContentType().getNameResId()));
        q(editViewHolder, getItemCount() != 1);
        if (appEditBean.getScreenContentType().isCancelable()) {
            editViewHolder.i.setEnabled(true);
            editViewHolder.i.setState(appEditBean.isSeleted() ? 2 : 0);
            editViewHolder.k.setVisibility(appEditBean.isSeleted() ? 0 : 8);
            editViewHolder.i.setOnStateChangeListener(new COUICheckBox.c() { // from class: com.oplus.aiunit.vision.gf6
                @Override // com.coui.appcompat.checkbox.COUICheckBox.c
                public final void a(COUICheckBox cOUICheckBox, int i2) {
                    this.a.k(appEditBean, editViewHolder, i, cOUICheckBox, i2);
                }
            });
            editViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.hf6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.l(appEditBean, editViewHolder, i, view);
                }
            });
        } else {
            editViewHolder.i.setState(2);
            editViewHolder.i.setEnabled(false);
            editViewHolder.itemView.setOnClickListener(null);
        }
        editViewHolder.k.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.if6
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.i.m(editViewHolder, view, motionEvent);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public EditViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new EditViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.band_item_edit_app, viewGroup, false));
    }

    public void p(int i, int i2) {
        this.f5327l = true;
        Collections.swap(this.k, i, i2);
        notifyItemMoved(i, i2);
    }

    public final void q(EditViewHolder editViewHolder, boolean z) {
        editViewHolder.i.setVisibility(z ? 0 : 4);
        editViewHolder.k.setVisibility(z ? 0 : 4);
    }

    public void r(ArrayList<AppEditBean> arrayList) {
        List<AppEditBean> list = this.k;
        if (list == null) {
            this.k = new ArrayList();
        } else {
            list.clear();
        }
        if (arrayList != null) {
            for (AppEditBean appEditBean : arrayList) {
                this.k.add(new AppEditBean(appEditBean.getId(), appEditBean.isSeleted()));
            }
        }
        notifyDataSetChanged();
    }
}
