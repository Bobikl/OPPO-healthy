package com.heytap.health.watchface.business.manager.adapter;

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
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watchface.R$drawable;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.R$string;
import com.heytap.health.watchface.adaptation.base.BaseWatchFaceBean;
import com.heytap.health.watchface.business.view.WfPreviewImageView;
import com.oplus.aiunit.vision.d5a;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.qn9;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class EditWatchFace2Adapter extends RecyclerView.Adapter<EditViewHolder> {
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Proto$DeviceInfo f6978j;
    public qn9 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public List<BaseWatchFaceBean> f6979l;
    public EditViewHolder m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f6980n;

    public class EditViewHolder extends RecyclerView.ViewHolder {
        public COUICheckBox i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public WfPreviewImageView f6981j;
        public TextView k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ImageView f6982l;
        public TextView m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f6983n;
        public String o;
        public String p;
        public AnimatorSet q;
        public AnimatorSet r;

        public EditViewHolder(View view) {
            super(view);
            this.f6983n = "elevation";
            this.o = "scaleX";
            this.p = "scaleY";
            this.i = (COUICheckBox) view.findViewById(R$id.cb_theme);
            this.f6981j = (WfPreviewImageView) view.findViewById(R$id.iv_watch_face);
            this.k = (TextView) view.findViewById(R$id.tv_name);
            this.f6982l = (ImageView) view.findViewById(R$id.iv_icon_pull);
            this.m = (TextView) view.findViewById(R$id.tv_small_tag);
            if (EditWatchFace2Adapter.this.f6978j != null) {
                this.f6981j.setDeviceInfo(EditWatchFace2Adapter.this.f6978j);
            }
            b();
        }

        public TextView a() {
            return this.m;
        }

        public final void b() {
            d();
            c();
        }

        public final void c() {
            this.r = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.itemView, this.o, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.itemView, this.p, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.itemView, this.f6983n, 16.0f, 0.0f);
            this.r.setDuration(400L);
            this.r.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            this.r.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        }

        public final void d() {
            this.q = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.itemView, this.f6983n, 0.0f, 16.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(PathInterpolatorCompat.create(0.4f, 0.0f, 0.2f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.itemView, this.o, 1.0f, 1.1f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.itemView, this.p, 1.0f, 1.1f);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            this.q.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat);
        }

        public void e() {
            AnimatorSet animatorSet = this.q;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.q.end();
            }
            this.r.start();
            if (EditWatchFace2Adapter.this.i != null) {
                EditWatchFace2Adapter.this.i.A1(EditWatchFace2Adapter.this.f6979l);
            }
        }

        public void f() {
            if (EditWatchFace2Adapter.this.m != null) {
                EditWatchFace2Adapter.this.m.m.setVisibility(8);
            }
            AnimatorSet animatorSet = this.r;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.r.end();
            }
            this.q.start();
        }
    }

    public class a implements COUICheckBox.c {
        public final /* synthetic */ EditViewHolder a;

        public a(EditViewHolder editViewHolder) {
            this.a = editViewHolder;
        }

        @Override // com.coui.appcompat.checkbox.COUICheckBox.c
        public void a(COUICheckBox cOUICheckBox, int i) {
            if (cOUICheckBox.isPressed()) {
                int adapterPosition = this.a.getAdapterPosition();
                if (adapterPosition == -1) {
                    ltl.i("WatchFaceEditFacesAdapter", "[onStateChanged] operatedPos=-1 and click return");
                    return;
                }
                boolean z = i == 2;
                if (EditWatchFace2Adapter.this.k != null) {
                    EditWatchFace2Adapter.this.k.f4(adapterPosition, z);
                }
            }
        }
    }

    public interface b {
        void A1(List<BaseWatchFaceBean> list);

        void b(RecyclerView.ViewHolder viewHolder);
    }

    public EditWatchFace2Adapter(Context context, Proto$DeviceInfo proto$DeviceInfo, qn9 qn9Var, b bVar) {
        this.f6980n = context;
        this.k = qn9Var;
        this.i = bVar;
        this.f6978j = proto$DeviceInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean j(EditViewHolder editViewHolder, View view, MotionEvent motionEvent) {
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
        List<BaseWatchFaceBean> list = this.f6979l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull final EditViewHolder editViewHolder, int i) {
        BaseWatchFaceBean baseWatchFaceBean = this.f6979l.get(editViewHolder.getBindingAdapterPosition());
        editViewHolder.k.setText(baseWatchFaceBean.getAdaptedLangWfName());
        d5a.v(this.f6980n, this.f6978j, editViewHolder.f6981j, baseWatchFaceBean);
        if (editViewHolder.getBindingAdapterPosition() == 0) {
            this.m = editViewHolder;
        }
        boolean zIsNoPay = baseWatchFaceBean.isNoPay();
        if (zIsNoPay) {
            editViewHolder.m.setText(R$string.watch_face_install_experienment);
            editViewHolder.m.setBackgroundResource(R$drawable.watch_face_album_small_tag_shape_blue);
        }
        if (baseWatchFaceBean.isCurrent()) {
            editViewHolder.m.setText(R$string.watch_face_main_current);
            editViewHolder.m.setBackgroundResource(R$drawable.watch_face_album_small_tag_shape);
        }
        n(editViewHolder, getItemCount() != 1);
        editViewHolder.m.setVisibility((baseWatchFaceBean.isCurrent() || zIsNoPay) ? 0 : 8);
        editViewHolder.i.setState(baseWatchFaceBean.isSelected() ? 2 : 0);
        editViewHolder.i.setOnStateChangeListener(new a(editViewHolder));
        editViewHolder.f6982l.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.fg6
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.i.j(editViewHolder, view, motionEvent);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public EditViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new EditViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.watch_face_item_edit2_watch_face, viewGroup, false));
    }

    public void m(int i, int i2) {
        Collections.swap(this.f6979l, i, i2);
        notifyItemMoved(i, i2);
    }

    public final void n(EditViewHolder editViewHolder, boolean z) {
        editViewHolder.i.setVisibility(z ? 0 : 4);
        editViewHolder.f6982l.setVisibility(z ? 0 : 4);
    }

    public void o(List<BaseWatchFaceBean> list) {
        this.f6979l = list;
    }
}
