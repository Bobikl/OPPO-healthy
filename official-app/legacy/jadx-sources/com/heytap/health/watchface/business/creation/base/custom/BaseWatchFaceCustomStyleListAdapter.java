package com.heytap.health.watchface.business.creation.base.custom;

import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.base.view.RoundedImageView;
import com.heytap.health.watchface.R$dimen;
import com.heytap.health.watchface.R$drawable;
import com.heytap.health.watchface.R$id;
import com.heytap.health.watchface.R$layout;
import com.heytap.health.watchface.business.creation.base.custom.WatchFaceCustomStyleListItem;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.ltl;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BaseWatchFaceCustomStyleListAdapter<T extends WatchFaceCustomStyleListItem> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f6664j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6665l;
    public List<T> m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6666n;
    public int o;
    public int p;
    public GradientDrawable q;
    public Context r;
    public a s;

    public static class WatchFaceCustomItemViewHolder extends RecyclerView.ViewHolder {
        public View i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TextView f6667j;
        public View k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public RoundedImageView f6668l;

        public WatchFaceCustomItemViewHolder(View view) {
            super(view);
            this.i = view.findViewById(R$id.cl_item_root);
            this.f6667j = (TextView) view.findViewById(R$id.tv_name);
            this.k = view.findViewById(R$id.view_selected_bg);
            this.f6668l = (RoundedImageView) view.findViewById(R$id.iv_icon);
        }
    }

    public interface a<T extends WatchFaceCustomStyleListItem> {
        void D5(String str, int i, T t);

        boolean j1(String str, int i, T t);
    }

    public BaseWatchFaceCustomStyleListAdapter(Context context, String str, String str2, List<T> list) {
        this(context, str, str2, list, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i, WatchFaceCustomStyleListItem watchFaceCustomStyleListItem, View view) {
        a aVar;
        if (this.k == i || (aVar = this.s) == null || !aVar.j1(this.i, i, watchFaceCustomStyleListItem)) {
            return;
        }
        e(i);
        if (!watchFaceCustomStyleListItem.isSelected()) {
            watchFaceCustomStyleListItem.setSelected(true);
        }
        notifyItemChanged(i);
    }

    public final void e(int i) {
        int size = this.m.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.m.get(i2).isSelected() && i2 != i) {
                this.m.get(i2).setSelected(false);
                notifyItemChanged(i2);
                return;
            }
        }
    }

    public final void f() {
        GradientDrawable gradientDrawable;
        this.q = (GradientDrawable) ContextCompat.getDrawable(this.r, R$drawable.watch_face_custom_item_round_select_bg);
        if (TextUtils.equals(this.f6664j, "type_square_73_73") || TextUtils.equals(this.f6664j, "type_square_69_69")) {
            this.q = (GradientDrawable) ContextCompat.getDrawable(this.r, R$drawable.watch_face_custom_item_square_select_bg);
        } else if (TextUtils.equals(this.f6664j, "type_rectangle_69_82") || TextUtils.equals(this.f6664j, "type_rectangle_device_adjust")) {
            this.q = (GradientDrawable) ContextCompat.getDrawable(this.r, R$drawable.watch_face_custom_item_rectangle_vertical_select_bg);
        }
        if (this.o == 0 || (gradientDrawable = this.q) == null) {
            return;
        }
        GradientDrawable gradientDrawable2 = (GradientDrawable) gradientDrawable.mutate();
        this.q = gradientDrawable2;
        gradientDrawable2.setStroke(ejg.a(this.r, 2.0f), this.o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<T> list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void h(WatchFaceCustomItemViewHolder watchFaceCustomItemViewHolder, int i, int i2, int i3) {
        if (i == 0 || i2 == 0) {
            ltl.i("BaseWatchFaceCustomSettingAdapter", "reLayoutView deviceHeight == 0 || deviceWidth == 0.");
            return;
        }
        float f = i2;
        ViewGroup.LayoutParams layoutParams = watchFaceCustomItemViewHolder.f6668l.getLayoutParams();
        float f2 = layoutParams.width;
        layoutParams.height = (int) ((i / f) * f2);
        watchFaceCustomItemViewHolder.f6668l.setLayoutParams(layoutParams);
        float f3 = i3;
        watchFaceCustomItemViewHolder.f6668l.setCornerRadius((f2 / f) * f3);
        ViewGroup.LayoutParams layoutParams2 = watchFaceCustomItemViewHolder.k.getLayoutParams();
        int i4 = layoutParams2.width;
        layoutParams2.height = layoutParams.height + ((int) (this.r.getResources().getDimension(R$dimen.watch_face_width_2) * 2.0f));
        watchFaceCustomItemViewHolder.k.setLayoutParams(layoutParams2);
        this.q.setCornerRadius((i4 / f) * f3);
    }

    public void i(int i) {
        if (i >= this.m.size()) {
            ltl.i("BaseWatchFaceCustomSettingAdapter", "[setSelectedState] selectedPosition >= mCustomSettingItemBeanList.size()");
            return;
        }
        if (this.m.get(i).isSelected) {
            ltl.a("BaseWatchFaceCustomSettingAdapter", "[setSelectedState] had selected,and not change.");
            return;
        }
        int size = this.m.size();
        int i2 = 0;
        while (i2 < size) {
            this.m.get(i2).setSelected(i == i2);
            i2++;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        a aVar;
        WatchFaceCustomItemViewHolder watchFaceCustomItemViewHolder = (WatchFaceCustomItemViewHolder) viewHolder;
        final T t = this.m.get(i);
        if (TextUtils.isEmpty(t.getTitle())) {
            watchFaceCustomItemViewHolder.f6667j.setVisibility(8);
        } else {
            watchFaceCustomItemViewHolder.f6667j.setVisibility(0);
            watchFaceCustomItemViewHolder.f6667j.setText(t.getTitle());
            int i2 = this.f6666n;
            if (i2 != 0) {
                watchFaceCustomItemViewHolder.f6667j.setTextColor(i2);
            }
        }
        if (t.getImageResource() != -1) {
            watchFaceCustomItemViewHolder.f6668l.setImageResource(t.getImageResource());
        } else if (t.getBitmap() != null) {
            watchFaceCustomItemViewHolder.f6668l.setImageBitmap(t.getBitmap());
        }
        if (t.getBackgroundColor() != -1) {
            watchFaceCustomItemViewHolder.f6668l.setBackgroundColor(t.getBackgroundColor());
        } else {
            watchFaceCustomItemViewHolder.f6668l.setBackgroundColor(watchFaceCustomItemViewHolder.i.getContext().getColor(R.color.transparent));
        }
        int i3 = this.p;
        if (i3 != 0) {
            watchFaceCustomItemViewHolder.f6668l.setBorderColor(i3);
        }
        if (TextUtils.equals(this.f6664j, "type_rectangle_device_adjust")) {
            h(watchFaceCustomItemViewHolder, t.getDeviceHeight(), t.getDeviceWidth(), t.getDeviceRadius());
        }
        watchFaceCustomItemViewHolder.k.setBackground(this.q);
        if (t.isSelected()) {
            this.k = i;
            if (!this.f6665l && (aVar = this.s) != null) {
                this.f6665l = true;
                aVar.D5(this.i, i, t);
            }
            watchFaceCustomItemViewHolder.k.setVisibility(0);
        } else {
            watchFaceCustomItemViewHolder.k.setVisibility(4);
        }
        watchFaceCustomItemViewHolder.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ea1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.g(i, t, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        int i2 = R$layout.watch_face_custom_item_round;
        if (TextUtils.equals(this.f6664j, "type_square_73_73") || TextUtils.equals(this.f6664j, "type_square_69_69")) {
            i2 = R$layout.watch_face_custom_item_square;
        } else if (TextUtils.equals(this.f6664j, "type_rectangle_69_82") || TextUtils.equals(this.f6664j, "type_rectangle_device_adjust")) {
            i2 = R$layout.watch_face_custom_item_rectangle_vertical;
        }
        return new WatchFaceCustomItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false));
    }

    public void setOnItemClickListener(a aVar) {
        this.s = aVar;
    }

    public BaseWatchFaceCustomStyleListAdapter(Context context, String str, String str2, List<T> list, int i, int i2, int i3) {
        this.r = context;
        this.i = str;
        this.f6664j = str2;
        this.m = list;
        this.f6666n = i;
        this.o = i2;
        this.p = i3;
        f();
    }
}
