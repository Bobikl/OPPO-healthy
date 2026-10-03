package com.heytap.health.settings.watch.sporthealthsettings.activity.customize.adapter;

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
import com.heytap.health.base.base.BaseApplication;
import com.heytap.health.device_settings.impl.R$drawable;
import com.heytap.health.device_settings.impl.R$id;
import com.heytap.health.device_settings.impl.R$layout;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.settings.watch.sporthealthsettings.activity.customize.bean.CustomizeDataBean;
import com.oplus.aiunit.vision.oh4;
import com.oplus.aiunit.vision.y0k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class CustomizeDataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final String TAG = "CustomizeDataAdapter";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f5494j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5495l;
    public int m;
    public List<CustomizeDataBean> i = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5496n = 1;

    public class CommonHolder extends RecyclerView.ViewHolder {
        public final ImageView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TextView f5497j;
        public String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f5498l;
        public String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public AnimatorSet f5499n;
        public AnimatorSet o;

        public CommonHolder(View view) {
            super(view);
            this.k = "elevation";
            this.f5498l = "scaleX";
            this.m = "scaleY";
            this.f5497j = (TextView) view.findViewById(R$id.tv_customizedata_item_name);
            ImageView imageView = (ImageView) view.findViewById(R$id.iv_customizedata_item_add_delete);
            this.i = imageView;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ih4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.i.h(view2);
                }
            });
            ((ImageView) view.findViewById(R$id.iv_customizedata_item_move)).setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.jh4
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.i.i(view2, motionEvent);
                }
            });
            e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(View view) {
            int size;
            CustomizeDataAdapter customizeDataAdapter = CustomizeDataAdapter.this;
            if (customizeDataAdapter.k) {
                return;
            }
            customizeDataAdapter.k = true;
            int adapterPosition = getAdapterPosition();
            CustomizeDataBean customizeDataBean = CustomizeDataAdapter.this.i.get(adapterPosition);
            if (customizeDataBean.isAdd()) {
                size = CustomizeDataAdapter.this.i.size() - 1;
            } else {
                Iterator<CustomizeDataBean> it = CustomizeDataAdapter.this.i.iterator();
                size = 0;
                while (it.hasNext() && !it.next().isTipType()) {
                    size++;
                }
            }
            if (CustomizeDataAdapter.this.h(adapterPosition, size, false)) {
                CustomizeDataAdapter.this.i.add(size, CustomizeDataAdapter.this.i.remove(adapterPosition));
                CustomizeDataAdapter.this.notifyItemMoved(adapterPosition, size);
                CustomizeDataAdapter.this.g(this, customizeDataBean);
                CustomizeDataAdapter.this.f5494j.q6();
            }
            CustomizeDataAdapter.this.k = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean i(View view, MotionEvent motionEvent) {
            if (CustomizeDataAdapter.this.f5494j == null) {
                return false;
            }
            if (motionEvent.getAction() != 0) {
                return true;
            }
            CustomizeDataAdapter.this.f5494j.b(this);
            return true;
        }

        public final void e() {
            g();
            f();
        }

        public final void f() {
            this.o = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.itemView, this.f5498l, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.itemView, this.m, 1.1f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.itemView, this.k, 16.0f, 0.0f);
            this.o.setDuration(400L);
            this.o.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            this.o.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        }

        public final void g() {
            this.f5499n = new AnimatorSet();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.itemView, this.k, 0.0f, 16.0f);
            objectAnimatorOfFloat.setDuration(300L);
            objectAnimatorOfFloat.setInterpolator(PathInterpolatorCompat.create(0.4f, 0.0f, 0.2f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.itemView, this.f5498l, 1.0f, 1.1f);
            objectAnimatorOfFloat2.setDuration(300L);
            objectAnimatorOfFloat2.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.itemView, this.m, 1.0f, 1.1f);
            objectAnimatorOfFloat3.setDuration(300L);
            objectAnimatorOfFloat3.setInterpolator(PathInterpolatorCompat.create(0.15f, 0.0f, 0.0f, 1.0f));
            this.f5499n.play(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat);
        }

        public void j() {
            AnimatorSet animatorSet = this.f5499n;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.f5499n.end();
            }
            this.o.start();
            a aVar = CustomizeDataAdapter.this.f5494j;
            if (aVar != null) {
                aVar.q6();
            }
        }

        public void k() {
            AnimatorSet animatorSet = this.o;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.o.end();
            }
            this.f5499n.start();
        }
    }

    public static class TipHolder extends RecyclerView.ViewHolder {
        public final TextView i;

        public TipHolder(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.tv_customizedata_item_tip);
        }
    }

    public interface a {
        void b(RecyclerView.ViewHolder viewHolder);

        void q6();
    }

    public CustomizeDataAdapter(a aVar, int i) {
        this.f5494j = aVar;
        this.m = i;
        StringBuilder sb = new StringBuilder();
        sb.append("CustomizeDataAdapter-->mMaxAdd:");
        sb.append(this.m);
    }

    public void e(List<CustomizeDataBean> list) {
        this.f5495l = 0;
        Iterator<CustomizeDataBean> it = list.iterator();
        while (it.hasNext() && it.next().isAdd()) {
            this.f5495l++;
        }
        this.i = list;
        notifyDataSetChanged();
    }

    public boolean f(int i, int i2, RecyclerView.ViewHolder viewHolder) {
        boolean zH = h(i, i2, true);
        if (zH) {
            Collections.swap(this.i, i, i2);
            notifyItemMoved(i, i2);
            if (viewHolder instanceof CommonHolder) {
                g((CommonHolder) viewHolder, this.i.get(i2));
            }
        }
        return zH;
    }

    public final void g(CommonHolder commonHolder, CustomizeDataBean customizeDataBean) {
        if (customizeDataBean.isAdd()) {
            commonHolder.i.setImageResource(R$drawable.settings_customize_vector_delete);
        } else {
            commonHolder.i.setImageResource(R$drawable.settings_customize_vector_add);
        }
    }

    public List<CustomizeDataBean> getData() {
        return this.i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.i.get(i).getType();
    }

    public boolean h(int i, int i2, boolean z) {
        if (z && Math.abs(i - i2) > 1) {
            return false;
        }
        Iterator<CustomizeDataBean> it = this.i.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = 0;
                break;
            }
            if (it.next().isTipType()) {
                break;
            }
            i3++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("verifyAndFixData()-->mAddCount:");
        sb.append(this.f5495l);
        sb.append("    tipIndex:");
        sb.append(i3);
        sb.append("    toPosition:");
        sb.append(i2);
        sb.append("    fromPosition:");
        sb.append(i);
        if (i > i3 && i2 > i3) {
            return true;
        }
        if (i < i3 && i2 < i3) {
            return true;
        }
        if (i2 == i3) {
            if (i < i3) {
                int i4 = this.f5495l;
                if (i4 - 1 < this.f5496n) {
                    y0k.i(String.format(BaseApplication.a().getString(R$string.settings_customize_sport_min_data_new), Integer.valueOf(this.f5496n)));
                    return false;
                }
                this.f5495l = i4 - 1;
                getData().get(i).setAdd(false);
            } else {
                int i5 = this.f5495l;
                if (i5 + 1 > this.m) {
                    y0k.i(String.format(BaseApplication.a().getString(R$string.settings_customize_sport_max_data_new), Integer.valueOf(this.m)));
                    return false;
                }
                this.f5495l = i5 + 1;
                getData().get(i).setAdd(true);
            }
        } else if (i2 < i3) {
            int i6 = this.f5495l;
            if (i6 + 1 > this.m) {
                y0k.i(String.format(BaseApplication.a().getString(R$string.settings_customize_sport_max_data_new), Integer.valueOf(this.m)));
                return false;
            }
            this.f5495l = i6 + 1;
            getData().get(i).setAdd(true);
        } else {
            int i7 = this.f5495l;
            if (i7 - 1 < this.f5496n) {
                y0k.i(String.format(BaseApplication.a().getString(R$string.settings_customize_sport_min_data_new), Integer.valueOf(this.f5496n)));
                return false;
            }
            this.f5495l = i7 - 1;
            getData().get(i).setAdd(false);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == -1) {
            ((TipHolder) viewHolder).i.setText(this.i.get(i).getName());
            return;
        }
        CommonHolder commonHolder = (CommonHolder) viewHolder;
        CustomizeDataBean customizeDataBean = this.i.get(i);
        String name = customizeDataBean.getName();
        if (oh4.m(name)) {
            name = oh4.e(-1).get(Integer.valueOf(customizeDataBean.getType()));
        }
        commonHolder.f5497j.setText(name);
        g(commonHolder, customizeDataBean);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return i == -1 ? new TipHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.settings_customizedata_item_tip, viewGroup, false)) : new CommonHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.settings_customizedata_item, viewGroup, false));
    }
}
