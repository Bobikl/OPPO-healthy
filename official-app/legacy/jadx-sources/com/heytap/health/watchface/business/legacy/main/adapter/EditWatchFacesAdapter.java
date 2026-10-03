package com.heytap.health.watchface.business.legacy.main.adapter;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import com.heytap.health.base.view.RoundedImageView;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.oplus.aiunit.vision.d5a;
import com.oplus.aiunit.vision.ggl;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.ntl;
import com.oplus.aiunit.vision.qn9;
import com.oplus.aiunit.vision.vik;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class EditWatchFacesAdapter extends RecyclerView.Adapter<EditViewHolder> {
    public final a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qn9 f6935j;
    public final List<BaseWatchFaceBean> k = new ArrayList();

    public class EditViewHolder extends RecyclerView.ViewHolder {
        public COUICheckBox i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public RoundedImageView f6936j;
        public TextView k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImageView f6937l;
        public TextView m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f6938n;
        public final String o;
        public final String p;
        public AnimatorSet q;
        public AnimatorSet r;

        public EditViewHolder(View view) {
            super(view);
            this.f6938n = "elevation";
            this.o = "scaleX";
            this.p = "scaleY";
            this.i = (COUICheckBox) view.findViewById(R$id.cb_theme);
            this.f6936j = (RoundedImageView) view.findViewById(R$id.iv_watch_face);
            this.k = (TextView) view.findViewById(R$id.tv_name);
            this.f6937l = (ImageView) view.findViewById(R$id.iv_icon_pull);
            this.m = (TextView) view.findViewById(R$id.tv_small_tag);
            ggl.b(view.getContext(), this.f6936j, ntl.m().g(), false);
            a();
        }

        public final void a() {
            c();
            b();
        }

        public final void b() {
            this.r = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.itemView, "scaleX", 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.itemView, "scaleY", 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.itemView, "elevation", 16.0f, 0.0f);
            this.r.setDuration(400L);
            this.r.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            this.r.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        }

        public final void c() {
            this.q = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.itemView, "elevation", 0.0f, 16.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(PathInterpolatorCompat.create(0.4f, 0.0f, 0.2f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.itemView, "scaleX", 1.0f, 1.1f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.itemView, "scaleY", 1.0f, 1.1f);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            this.q.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat);
        }

        public void d() {
            AnimatorSet animatorSet = this.q;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.q.end();
            }
            this.r.start();
            if (EditWatchFacesAdapter.this.i != null) {
                EditWatchFacesAdapter.this.i.r3();
            }
        }

        public void e() {
            AnimatorSet animatorSet = this.r;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.r.end();
            }
            this.q.start();
        }
    }

    public interface a {
        void b(RecyclerView.ViewHolder viewHolder);

        void r3();
    }

    public EditWatchFacesAdapter(qn9 qn9Var, a aVar) {
        this.f6935j = qn9Var;
        this.i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(EditViewHolder editViewHolder, COUICheckBox cOUICheckBox, int i) {
        if (cOUICheckBox.isPressed()) {
            int adapterPosition = editViewHolder.getAdapterPosition();
            if (adapterPosition == -1) {
                ltl.i("EditWatchFacesAdapter", "[onStateChanged] operatedPos=-1 and click return");
                return;
            }
            boolean z = i == 2;
            qn9 qn9Var = this.f6935j;
            if (qn9Var != null) {
                qn9Var.f4(adapterPosition, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean i(EditViewHolder editViewHolder, View view, MotionEvent motionEvent) {
        if (this.i == null) {
            return false;
        }
        if (motionEvent.getAction() != 0) {
            return true;
        }
        this.i.b(editViewHolder);
        return true;
    }

    public List<BaseWatchFaceBean> g() {
        return this.k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<BaseWatchFaceBean> list = this.k;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull final EditViewHolder editViewHolder, int i) {
        if (i >= this.k.size()) {
            ltl.i("EditWatchFacesAdapter", "[onBindViewHolder] position over the list size,and return");
            return;
        }
        BaseWatchFaceBean baseWatchFaceBean = this.k.get(i);
        editViewHolder.k.setText(baseWatchFaceBean.getAdaptedLangWfName());
        d5a.u(editViewHolder.f6936j, baseWatchFaceBean);
        m(editViewHolder, getItemCount() != 1);
        editViewHolder.m.setVisibility(baseWatchFaceBean.isCurrent() ? 0 : 8);
        editViewHolder.i.setState(baseWatchFaceBean.isSelected() ? 2 : 0);
        editViewHolder.i.setOnStateChangeListener(new COUICheckBox.c() { // from class: com.oplus.aiunit.vision.rg6
            @Override // com.coui.appcompat.checkbox.COUICheckBox.c
            public final void a(COUICheckBox cOUICheckBox, int i2) {
                this.a.h(editViewHolder, cOUICheckBox, i2);
            }
        });
        editViewHolder.f6937l.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.sg6
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.i.i(editViewHolder, view, motionEvent);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public EditViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new EditViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.watch_face_item_edit_watch_face, viewGroup, false));
    }

    public void l(int i, int i2) {
        int size = this.k.size();
        if (size <= i || size <= i2) {
            ltl.i("EditWatchFacesAdapter", "[onItemMove] item move exception,and may (size <= fromPosition) || (size <= toPosition)");
            return;
        }
        vik.d(2, this.k.get(i).getWfUnique(), i2, -1);
        Collections.swap(this.k, i, i2);
        notifyItemMoved(i, i2);
    }

    public final void m(EditViewHolder editViewHolder, boolean z) {
        editViewHolder.i.setVisibility(z ? 0 : 4);
        editViewHolder.f6937l.setVisibility(z ? 0 : 4);
    }

    public void n() {
        notifyDataSetChanged();
    }

    public void setData(List<BaseWatchFaceBean> list) {
        this.k.clear();
        if (list != null) {
            this.k.addAll(list);
        }
    }
}
