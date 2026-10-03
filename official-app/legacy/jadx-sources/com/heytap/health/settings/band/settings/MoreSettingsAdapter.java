package com.heytap.health.settings.band.settings;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.device_pair.IDevicePairExtService;
import com.heytap.health.device_settings.impl.R$color;
import com.heytap.health.device_settings.impl.R$drawable;
import com.heytap.health.device_settings.impl.R$id;
import com.heytap.health.device_settings.impl.R$layout;
import com.heytap.health.device_settings.impl.R$string;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.g07;
import com.oplus.aiunit.vision.x0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class MoreSettingsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5306j;
    public List<b> k = new ArrayList();

    public class a extends RecyclerView.ViewHolder {
        public a(View view) {
            super(view);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ViewHolder
        public String toString() {
            return super.toString();
        }
    }

    public static class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }
    }

    public static class c extends RecyclerView.ViewHolder {
        public TextView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public ImageView f5307j;
        public View k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public View f5308l;
        public TextView m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public ImageView f5309n;

        public c(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.tv_title);
            this.k = view.findViewById(R$id.red_dot);
            this.f5308l = view.findViewById(R$id.iv_warn);
            this.f5307j = (ImageView) view.findViewById(R$id.img_icon);
            this.m = (TextView) view.findViewById(R$id.tv_desc);
            this.f5309n = (ImageView) view.findViewById(R$id.color_preference_widget_jump);
        }
    }

    public static class d extends c {
        public TextView o;
        public TextView p;

        public d(@NonNull View view) {
            super(view);
            this.o = (TextView) view.findViewById(R$id.tv_detail);
            this.p = (TextView) view.findViewById(R$id.tv_status);
        }
    }

    public interface e {
        void R5(int i);

        void w1(int i, int i2);
    }

    public MoreSettingsAdapter(int i) {
        this.f5306j = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        int i;
        e eVar = this.i;
        if (eVar == null || (i = this.f5306j) != 103) {
            return;
        }
        eVar.R5(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(int i, int i2, View view) {
        e eVar = this.i;
        if (eVar != null) {
            eVar.w1(i, i2);
        }
    }

    public int f(int i) {
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            if (this.k.get(i2).a == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.k.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.k.get(i).a;
    }

    public final void i(c cVar, final int i, final int i2) {
        cVar.i.setTextColor(g07.a(R$color.band_black));
        cVar.itemView.setBackgroundResource(R$drawable.band_settings_list_item_bg);
        cVar.f5307j.setImageAlpha(255);
        cVar.f5309n.setImageAlpha(255);
        cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.y3c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.h(i, i2, view);
            }
        });
    }

    public final void j(c cVar) {
        cVar.itemView.setBackgroundResource(R.color.transparent);
        cVar.i.setTextColor(g07.a(R$color.band_disable));
        cVar.f5307j.setImageAlpha(102);
        cVar.f5309n.setImageAlpha(102);
        cVar.itemView.setOnClickListener(null);
    }

    public void k(List<b> list) {
        this.k.clear();
        this.k.addAll(list);
        notifyDataSetChanged();
    }

    public void l(int i) {
        this.f5306j = i;
        notifyDataSetChanged();
        a7b.f("MoreSettingsAdapter", "updateBlueToothStatus:" + this.f5306j);
    }

    public void m(int i) {
        int iF = f(i);
        if (iF != -1) {
            notifyItemChanged(iF);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        c cVar;
        int itemViewType = getItemViewType(i);
        Context context = viewHolder.itemView.getContext();
        if (itemViewType == 8) {
            cVar = null;
        } else {
            cVar = (c) viewHolder;
            TextView textView = cVar.m;
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (itemViewType == 0) {
                cVar.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.x3c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.i.g(view);
                    }
                });
            } else if (com.heytap.health.settings.band.settings.a.a(itemViewType)) {
                int i2 = this.f5306j;
                if (i2 != 102) {
                    j(cVar);
                } else {
                    i(cVar, itemViewType, i2);
                }
            } else {
                i(cVar, itemViewType, this.f5306j);
            }
        }
        if (itemViewType == 0) {
            switch (this.f5306j) {
                case 101:
                    cVar.i.setVisibility(0);
                    cVar.f5308l.setVisibility(0);
                    cVar.i.setText(R$string.band_settings_watch_more_settings_bt_connecting);
                    break;
                case 102:
                case 104:
                    cVar.i.setVisibility(8);
                    cVar.f5308l.setVisibility(8);
                    break;
                case 103:
                    cVar.i.setVisibility(0);
                    cVar.f5308l.setVisibility(0);
                    cVar.i.setText(R$string.band_settings_watch_more_settings_bt_disconnected);
                    break;
            }
        } else if (itemViewType == 10) {
            cVar.f5307j.setImageResource(R$drawable.band_settings_manual);
            cVar.i.setText(R$string.band_settings_manual);
        } else if (itemViewType == 12) {
            d dVar = (d) viewHolder;
            dVar.f5307j.setImageResource(R$drawable.band_settings_protect);
            dVar.i.setText(com.heytap.health.device_pair.R$string.oobe_connet_protect_setting);
            dVar.o.setText(com.heytap.health.device_pair.R$string.oobe_connet_protect_setting_desc);
            IDevicePairExtService iDevicePairExtService = (IDevicePairExtService) x0.d().b("/device_pair/DevicePairExtServiceImpl").navigation();
            dVar.p.setText((iDevicePairExtService == null || !iDevicePairExtService.f4(context)) ? com.heytap.health.device_pair.R$string.oobe_keep_alive_unfinish : com.heytap.health.device_pair.R$string.oobe_keep_alive_finish);
        } else if (itemViewType == 15) {
            cVar.f5307j.setImageResource(R$drawable.band_settings_about);
            cVar.i.setText(R$string.band_settings_about_device);
        } else if (itemViewType == 31) {
            cVar.i.setText(R$string.location_helper_title);
            cVar.f5307j.setImageResource(R$drawable.lib_core_ic_location_helper);
            cVar.f5309n.setVisibility(0);
        } else if (itemViewType != 32) {
            switch (itemViewType) {
                case 17:
                    cVar.f5307j.setImageResource(com.heytap.health.ui.R$drawable.lib_ui_device_ic_unbind);
                    cVar.f5309n.setVisibility(8);
                    cVar.i.setText(R$string.band_settings_unbind);
                    cVar.i.setTextColor(Color.parseColor("#FFEA3447"));
                    break;
                case 18:
                    cVar.f5307j.setImageResource(com.heytap.health.ui.R$drawable.lib_ui_ic_notice);
                    cVar.f5309n.setVisibility(0);
                    cVar.i.setText(R$string.band_settings_collect_log);
                    break;
                case 19:
                    cVar.f5307j.setImageResource(R$drawable.band_settings_preference);
                    cVar.i.setText(R$string.band_settings_band_preference);
                    break;
            }
        } else {
            cVar.i.setText(com.heytap.health.interconnection.R$string.settings_weather);
            cVar.f5307j.setImageResource(R$drawable.lib_core_ic_weather);
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewHolder.itemView.getLayoutParams();
        if (i == getItemCount() - 1) {
            layoutParams.setMargins(0, 0, 0, ejg.a(viewHolder.itemView.getContext(), 30.0f));
        } else {
            layoutParams.setMargins(0, 0, 0, 0);
        }
        viewHolder.itemView.setLayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.band_more_settings_item_bt_status, viewGroup, false));
        }
        if (i != 8) {
            return i != 12 ? new c(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.band_more_settings_item_common, viewGroup, false)) : new d(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.band_more_settings_item_detail, viewGroup, false));
        }
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.band_more_settings_item_divider, viewGroup, false));
    }

    public void setOnItemClickListener(e eVar) {
        this.i = eVar;
    }
}
