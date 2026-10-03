package com.heytap.health.bandface.watchface.edit;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
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
import com.heytap.health.bandface.R$id;
import com.heytap.health.bandface.R$layout;
import com.heytap.health.bandface.watchface.bean.BandFaceBean;
import com.heytap.health.bandface.watchface.bean.BandFaceNameRes;
import com.heytap.health.bandface.watchface.bean.BandFaceOnlineBean;
import com.heytap.health.bandface.watchface.view.BandFaceView;
import com.oplus.aiunit.vision.kw0;
import com.oplus.aiunit.vision.n5h;
import com.oplus.aiunit.vision.tv0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class BandFacesEditAdapter extends RecyclerView.Adapter<EditViewHolder> {
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f3106j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c f3107l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f3108n;
    public int o;
    public final List<BandFaceBean> k = new ArrayList();
    public final List<BandFaceBean> m = new ArrayList();

    public class EditViewHolder extends RecyclerView.ViewHolder {
        public COUICheckBox i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public BandFaceView f3109j;
        public TextView k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImageView f3110l;
        public TextView m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f3111n;
        public final String o;
        public final String p;
        public AnimatorSet q;
        public AnimatorSet r;

        public EditViewHolder(View view) {
            super(view);
            this.f3111n = "elevation";
            this.o = "scaleX";
            this.p = "scaleY";
            this.i = (COUICheckBox) view.findViewById(R$id.cb_theme);
            this.f3109j = (BandFaceView) view.findViewById(R$id.iv_watch_face);
            this.k = (TextView) view.findViewById(R$id.tv_name);
            this.f3110l = (ImageView) view.findViewById(R$id.iv_icon_pull);
            this.m = (TextView) view.findViewById(R$id.tv_small_tag);
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
            if (BandFacesEditAdapter.this.f3107l != null) {
                BandFacesEditAdapter.this.f3107l.o(BandFacesEditAdapter.this.k);
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

    public class a extends n5h {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.n5h
        public void a(View view) {
            int iIntValue = ((Integer) view.getTag()).intValue();
            if (BandFacesEditAdapter.this.o == iIntValue) {
                return;
            }
            BandFacesEditAdapter.this.t(iIntValue, !((BandFaceBean) BandFacesEditAdapter.this.k.get(iIntValue)).isSelected());
        }
    }

    public interface b {
        void b(RecyclerView.ViewHolder viewHolder);
    }

    public interface c {
        void o(List<BandFaceBean> list);

        void p(List<BandFaceBean> list);
    }

    public BandFacesEditAdapter(Context context, b bVar, String str) {
        this.i = bVar;
        this.f3108n = context;
        this.f3106j = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(EditViewHolder editViewHolder, COUICheckBox cOUICheckBox, int i) {
        if (cOUICheckBox.isPressed()) {
            t(editViewHolder.getAdapterPosition(), i != 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean l(EditViewHolder editViewHolder, View view, MotionEvent motionEvent) {
        if (this.i == null) {
            return false;
        }
        if (motionEvent.getAction() != 0) {
            return true;
        }
        this.i.b(editViewHolder);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(EditViewHolder editViewHolder, BandFaceBean bandFaceBean, int i, BandFaceOnlineBean bandFaceOnlineBean, String str) {
        if (i == 0) {
            if (editViewHolder.k.getTag().equals(bandFaceOnlineBean.dialKey)) {
                editViewHolder.k.setText(bandFaceOnlineBean.getName());
                editViewHolder.f3109j.setStaticOnlineView(bandFaceOnlineBean.previewImg);
                return;
            }
            return;
        }
        if (editViewHolder.k.getTag().equals(bandFaceOnlineBean.dialKey)) {
            editViewHolder.f3109j.d(this.f3106j, bandFaceBean);
            editViewHolder.k.setText("");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull final EditViewHolder editViewHolder, int i) {
        BandFaceBean bandFaceBean = this.k.get(editViewHolder.getAdapterPosition());
        r(bandFaceBean, editViewHolder);
        if (this.o == editViewHolder.getAdapterPosition()) {
            editViewHolder.i.setState(0);
            editViewHolder.i.setEnabled(false);
            editViewHolder.i.setVisibility(4);
        } else {
            editViewHolder.i.setVisibility(0);
            editViewHolder.i.setEnabled(true);
            editViewHolder.i.setState(bandFaceBean.isSelected() ? 2 : 0);
        }
        editViewHolder.itemView.setTag(Integer.valueOf(editViewHolder.getAdapterPosition()));
        editViewHolder.m.setVisibility(bandFaceBean.isCurrent() ? 0 : 4);
        editViewHolder.i.setOnStateChangeListener(new COUICheckBox.c() { // from class: com.oplus.aiunit.vision.yv0
            @Override // com.coui.appcompat.checkbox.COUICheckBox.c
            public final void a(COUICheckBox cOUICheckBox, int i2) {
                this.a.k(editViewHolder, cOUICheckBox, i2);
            }
        });
        editViewHolder.itemView.setOnClickListener(new a());
        editViewHolder.f3110l.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.zv0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.i.l(editViewHolder, view, motionEvent);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public EditViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new EditViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.band_face_item_edit, viewGroup, false));
    }

    public void p(int i, int i2) {
        Collections.swap(this.k, i, i2);
        notifyItemMoved(i, i2);
    }

    public final void q(String str) {
        if (this.m.size() == 0) {
            return;
        }
        for (int size = this.m.size() - 1; size >= 0; size--) {
            if (this.m.get(size).getFace().getWatchDialId().equals(str)) {
                this.m.remove(size);
            }
        }
    }

    public final void r(final BandFaceBean bandFaceBean, final EditViewHolder editViewHolder) {
        String watchDialId = bandFaceBean.getFace().getWatchDialId();
        editViewHolder.m.setVisibility(bandFaceBean.isCurrent() ? 0 : 8);
        editViewHolder.k.setTag(watchDialId);
        int type = bandFaceBean.getFace().getType();
        if (type == 0) {
            tv0.i(this.f3106j, watchDialId, this.f3108n, new tv0.e() { // from class: com.oplus.aiunit.vision.aw0
                @Override // com.oplus.aiunit.vision.tv0.e
                public final void a(int i, BandFaceOnlineBean bandFaceOnlineBean, String str) {
                    this.a.m(editViewHolder, bandFaceBean, i, bandFaceOnlineBean, str);
                }
            });
            return;
        }
        if (type == 1) {
            editViewHolder.f3109j.setAlbumView(bandFaceBean);
            editViewHolder.k.setText(BandFaceNameRes.getAlbumName());
        } else {
            if (type != 2) {
                return;
            }
            editViewHolder.f3109j.setWorldView(bandFaceBean);
            editViewHolder.k.setText(BandFaceNameRes.getClockName());
        }
    }

    public void s(c cVar) {
        this.f3107l = cVar;
    }

    public final void t(int i, boolean z) {
        if (this.f3107l != null) {
            BandFaceBean bandFaceBean = this.k.get(i);
            if (!z || bandFaceBean.isSelected()) {
                bandFaceBean.setSelected(false);
                q(bandFaceBean.getFace().getWatchDialId());
            } else {
                bandFaceBean.setSelected(true);
                this.m.add(bandFaceBean);
            }
            this.f3107l.p(this.m);
            u();
        }
    }

    public final void u() {
        if (this.k.size() == 1) {
            this.o = 0;
        } else if (this.m.size() >= this.k.size() - 1) {
            HashSet hashSet = new HashSet();
            Iterator<BandFaceBean> it = this.m.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getFace().getWatchDialId());
            }
            for (int i = 0; i < this.k.size(); i++) {
                if (!hashSet.contains(this.k.get(i).getFace().getWatchDialId())) {
                    this.o = i;
                    break;
                }
            }
        } else {
            this.o = -1;
        }
        kw0.a("EditWatchFacesAdapter", "[updateRetainOneFace] lastPosition = " + this.o);
        notifyDataSetChanged();
    }

    public void v(List<BandFaceBean> list) {
        w(list, true);
    }

    public void w(List<BandFaceBean> list, boolean z) {
        this.k.clear();
        if (z) {
            this.m.clear();
        }
        this.k.addAll(list);
        u();
    }

    public void x(List<BandFaceBean> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        this.k.clear();
        this.k.addAll(list);
        if (this.m.size() > 0) {
            HashSet hashSet = new HashSet();
            Iterator<BandFaceBean> it = this.m.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().getFace().getWatchDialId());
            }
            for (int i = 0; i < this.k.size(); i++) {
                if (hashSet.contains(this.k.get(i).getFace().getWatchDialId())) {
                    this.k.get(i).setSelected(true);
                }
            }
        }
        u();
    }
}
