package com.heytap.health.settings.watch.preferences.dragutils;

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
import com.airbnb.lottie.LottieAnimationView;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.heytap.health.device_settings.impl.R$id;
import com.heytap.health.device_settings.impl.R$layout;
import com.heytap.health.device_settings.impl.R$string;
import com.oplus.aiunit.vision.h46;
import com.oplus.aiunit.vision.lza;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class DragItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final String TAG = "DragItemAdapter";
    public static final int VIEW_TYPE_DESC = 1;
    public static final int VIEW_TYPE_IMAGE_APP = 3;
    public static final int VIEW_TYPE_IMAGE_CONTROL = 0;
    public static final int VIEW_TYPE_SETTING_ITEM = 2;
    public a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<h46> f5457j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f5458l;

    public static class DescViewHolder extends RecyclerView.ViewHolder {
        public TextView i;

        public DescViewHolder(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.desc);
        }
    }

    public static class GuideViewHolder extends RecyclerView.ViewHolder {
        public LottieAnimationView i;

        public GuideViewHolder(@NonNull View view) {
            super(view);
            this.i = (LottieAnimationView) view.findViewById(R$id.lottie_guide);
        }
    }

    public static class SettingViewHolder extends RecyclerView.ViewHolder {
        public COUICheckBox i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TextView f5459j;
        public ImageView k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f5460l;
        public String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f5461n;
        public SoftReference<DragItemAdapter> o;
        public AnimatorSet p;
        public AnimatorSet q;

        public SettingViewHolder(@NonNull View view, DragItemAdapter dragItemAdapter) {
            super(view);
            this.f5460l = "elevation";
            this.m = "scaleX";
            this.f5461n = "scaleY";
            this.o = new SoftReference<>(dragItemAdapter);
            this.i = (COUICheckBox) view.findViewById(R$id.cb_theme);
            this.f5459j = (TextView) view.findViewById(R$id.tv_name);
            this.k = (ImageView) view.findViewById(R$id.iv_icon_pull);
            b();
        }

        public final void b() {
            d();
            c();
        }

        public final void c() {
            this.q = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.itemView, this.m, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.itemView, this.f5461n, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.itemView, this.f5460l, 16.0f, 0.0f);
            this.q.setDuration(400L);
            this.q.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            this.q.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        }

        public final void d() {
            this.p = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.itemView, this.f5460l, 0.0f, 16.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(PathInterpolatorCompat.create(0.4f, 0.0f, 0.2f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.itemView, this.m, 1.0f, 1.1f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.itemView, this.f5461n, 1.0f, 1.1f);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            this.p.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat);
        }
    }

    public interface a {
        boolean X0();

        void b(RecyclerView.ViewHolder viewHolder);

        void o(List<h46> list);
    }

    public DragItemAdapter(a aVar, boolean z) {
        this.i = aVar;
        this.f5458l = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(SettingViewHolder settingViewHolder, DragItemBean dragItemBean, COUICheckBox cOUICheckBox, int i) {
        if (cOUICheckBox.isPressed()) {
            a aVar = this.i;
            if (aVar != null && !aVar.X0()) {
                settingViewHolder.i.setState(dragItemBean.getBooleanState() ? 2 : 0);
                return;
            }
            boolean z = i == 2;
            settingViewHolder.k.setVisibility(z ? 0 : 8);
            dragItemBean.setBooleanState(z);
            a aVar2 = this.i;
            if (aVar2 != null) {
                aVar2.o(this.f5457j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(SettingViewHolder settingViewHolder, DragItemBean dragItemBean, View view) {
        a aVar = this.i;
        if (aVar != null && !aVar.X0()) {
            settingViewHolder.i.setState(dragItemBean.getBooleanState() ? 2 : 0);
            return;
        }
        boolean z = !dragItemBean.getBooleanState();
        dragItemBean.setBooleanState(z);
        settingViewHolder.i.setState(dragItemBean.getBooleanState() ? 2 : 0);
        settingViewHolder.k.setVisibility(z ? 0 : 8);
        dragItemBean.setBooleanState(z);
        a aVar2 = this.i;
        if (aVar2 != null) {
            aVar2.o(this.f5457j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean j(SettingViewHolder settingViewHolder, View view, MotionEvent motionEvent) {
        a aVar = this.i;
        if (aVar == null || !aVar.X0()) {
            return false;
        }
        if (motionEvent.getAction() != 0) {
            return true;
        }
        this.i.b(settingViewHolder);
        return true;
    }

    public final void g(View view, DragItemBean dragItemBean) {
        if (dragItemBean.isHided()) {
            view.setVisibility(8);
            view.getLayoutParams().height = 0;
        } else {
            view.setVisibility(0);
            view.getLayoutParams().height = -2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (lza.a(this.f5457j)) {
            return 0;
        }
        return this.f5457j.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f5457j.get(i).b();
    }

    public void k(SettingViewHolder settingViewHolder) {
        a aVar;
        if (settingViewHolder == null) {
            return;
        }
        AnimatorSet animatorSet = settingViewHolder.p;
        if (animatorSet != null && animatorSet.isRunning()) {
            settingViewHolder.p.end();
        }
        settingViewHolder.q.start();
        DragItemAdapter dragItemAdapter = (DragItemAdapter) settingViewHolder.o.get();
        if (dragItemAdapter == null || (aVar = dragItemAdapter.i) == null || !dragItemAdapter.k) {
            return;
        }
        aVar.o(dragItemAdapter.f5457j);
    }

    public void l(int i, int i2) {
        this.k = true;
        Collections.swap(this.f5457j, i, i2);
        notifyItemMoved(i, i2);
    }

    public void m(SettingViewHolder settingViewHolder) {
        if (settingViewHolder == null) {
            return;
        }
        AnimatorSet animatorSet = settingViewHolder.q;
        if (animatorSet != null && animatorSet.isRunning()) {
            settingViewHolder.q.end();
        }
        settingViewHolder.p.start();
        if (settingViewHolder.o.get() != null) {
            ((DragItemAdapter) settingViewHolder.o.get()).k = false;
        }
    }

    public void n(List<h46> list) {
        this.f5457j = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0 || itemViewType == 3) {
            GuideViewHolder guideViewHolder = (GuideViewHolder) viewHolder;
            if (guideViewHolder.i.isAnimating()) {
                return;
            }
            if (itemViewType == 0) {
                if (this.f5458l) {
                    guideViewHolder.i.setAnimation("control_center_guide1.json");
                    guideViewHolder.i.setImageAssetsFolder("control_center_images1");
                } else {
                    guideViewHolder.i.setAnimation("control_center_guide.json");
                    guideViewHolder.i.setImageAssetsFolder("control_center_images");
                }
            } else if (this.f5458l) {
                guideViewHolder.i.setAnimation("app_list_guide.json");
                guideViewHolder.i.setImageAssetsFolder("app_list_images");
            } else {
                guideViewHolder.i.setAnimation("quick_center_guide.json");
                guideViewHolder.i.setImageAssetsFolder("quick_center_images");
            }
            guideViewHolder.i.setRepeatCount(-1);
            guideViewHolder.i.playAnimation();
            return;
        }
        if (itemViewType != 2) {
            if (itemViewType == 1) {
                DescViewHolder descViewHolder = (DescViewHolder) viewHolder;
                if (this.f5458l) {
                    descViewHolder.i.setText(R$string.band_apps_edit_tip1);
                    return;
                }
                return;
            }
            return;
        }
        final SettingViewHolder settingViewHolder = (SettingViewHolder) viewHolder;
        final DragItemBean dragItemBeanA = this.f5457j.get(i).a();
        g(settingViewHolder.itemView, dragItemBeanA);
        settingViewHolder.f5459j.setText(dragItemBeanA.getName());
        if (this.f5458l) {
            settingViewHolder.i.setVisibility(8);
            settingViewHolder.i.setEnabled(false);
            settingViewHolder.i.setState(dragItemBeanA.getBooleanState() ? 2 : 0);
        } else if (dragItemBeanA.isCancelable()) {
            settingViewHolder.i.setEnabled(true);
            settingViewHolder.i.setState(dragItemBeanA.getBooleanState() ? 2 : 0);
            settingViewHolder.k.setVisibility(dragItemBeanA.getBooleanState() ? 0 : 8);
            settingViewHolder.i.setOnStateChangeListener(new COUICheckBox.c() { // from class: com.oplus.aiunit.vision.d46
                @Override // com.coui.appcompat.checkbox.COUICheckBox.c
                public final void a(COUICheckBox cOUICheckBox, int i2) {
                    this.a.h(settingViewHolder, dragItemBeanA, cOUICheckBox, i2);
                }
            });
            settingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.e46
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.i(settingViewHolder, dragItemBeanA, view);
                }
            });
        } else {
            settingViewHolder.k.setVisibility(dragItemBeanA.isMoved() ? 0 : 8);
            settingViewHolder.i.setState(2);
            settingViewHolder.i.setEnabled(false);
            settingViewHolder.itemView.setOnClickListener(null);
        }
        settingViewHolder.k.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.f46
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.i.j(settingViewHolder, view, motionEvent);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i != 0) {
            if (i == 1) {
                return new DescViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.settings_item_control_center_desc, viewGroup, false));
            }
            if (i != 3) {
                return new SettingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.settings_item_can_select_move, viewGroup, false), this);
            }
        }
        return new GuideViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.settings_item_control_center_image, viewGroup, false));
    }
}
