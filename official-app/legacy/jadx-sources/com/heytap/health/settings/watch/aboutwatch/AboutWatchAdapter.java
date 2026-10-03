package com.heytap.health.settings.watch.aboutwatch;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.device_settings.impl.R$id;
import com.heytap.health.device_settings.impl.R$layout;
import com.heytap.health.device_settings.impl.R$string;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.sq5;
import com.oplus.aiunit.vision.y2;
import java.util.ArrayList;
import java.util.List;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AboutWatchAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y2 f5415j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<b> f5416l;

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
        public final TextView i;

        public c(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.tv_title);
        }
    }

    public static class d extends RecyclerView.ViewHolder {
        public final TextView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TextView f5417j;

        public d(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.tv_title);
            this.f5417j = (TextView) view.findViewById(R$id.tv_description);
        }
    }

    public interface e {
        void b0(int i);

        void n1();
    }

    public AboutWatchAdapter(String str, String str2, List<b> list) {
        ArrayList arrayList = new ArrayList();
        this.f5416l = arrayList;
        this.k = str;
        arrayList.addAll(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(View view) {
        e eVar = this.i;
        if (eVar != null) {
            eVar.n1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
        e eVar = this.i;
        if (eVar != null) {
            eVar.b0(i);
        }
    }

    public final int f(String str, Paint paint, int i) {
        if (paint == null || TextUtils.isEmpty(str) || i == 0) {
            return 0;
        }
        int iCeil = (int) Math.ceil(paint.measureText(str));
        return (iCeil / i) + (iCeil % i != 0 ? 1 : 0);
    }

    public y2 g() {
        return this.f5415j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f5416l.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f5416l.get(i).a;
    }

    public void i(y2 y2Var) {
        this.f5415j = y2Var;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        String strM = "_ _ ";
        String strA = "_ _._ _._ _";
        String strK = "_ _ ._ _ ._ _";
        String strD = "_ _";
        switch (getItemViewType(i)) {
            case 0:
                d dVar = (d) viewHolder;
                if (((Boolean) lc5.d(this.k).a(new sq5())).booleanValue()) {
                    dVar.i.setText(R$string.settings_about_device_name);
                } else {
                    dVar.i.setText(R$string.settings_about_watch_name);
                }
                y2 y2Var = this.f5415j;
                if (y2Var != null && !TextUtils.isEmpty(y2Var.d())) {
                    strD = this.f5415j.d();
                }
                dVar.f5417j.setText(strD);
                break;
            case 2:
                d dVar2 = (d) viewHolder;
                dVar2.i.setText(R$string.settings_about_watch_type);
                y2 y2Var2 = this.f5415j;
                if (y2Var2 != null && !TextUtils.isEmpty(y2Var2.h())) {
                    strD = this.f5415j.h();
                }
                dVar2.f5417j.setText(strD);
                break;
            case 3:
                d dVar3 = (d) viewHolder;
                dVar3.i.setText(R$string.settings_about_watch_coloros_version);
                y2 y2Var3 = this.f5415j;
                if (y2Var3 != null && !TextUtils.isEmpty(y2Var3.k())) {
                    strK = this.f5415j.k();
                }
                dVar3.f5417j.setText(strK);
                break;
            case 4:
                d dVar4 = (d) viewHolder;
                dVar4.i.setText(R$string.settings_about_watch_sys_version);
                y2 y2Var4 = this.f5415j;
                if (y2Var4 != null && !TextUtils.isEmpty(y2Var4.n())) {
                    strK = this.f5415j.n();
                }
                dVar4.f5417j.setText(strK);
                break;
            case 5:
                d dVar5 = (d) viewHolder;
                dVar5.i.setText(R$string.settings_about_watch_internal);
                y2 y2Var5 = this.f5415j;
                if (y2Var5 != null && !TextUtils.isEmpty(y2Var5.g())) {
                    strK = this.f5415j.g();
                }
                dVar5.f5417j.setText(strK);
                break;
            case 6:
                d dVar6 = (d) viewHolder;
                dVar6.i.setText(R$string.settings_about_watch_android);
                y2 y2Var6 = this.f5415j;
                if (y2Var6 != null && !TextUtils.isEmpty(y2Var6.a())) {
                    strA = this.f5415j.a();
                }
                dVar6.f5417j.setText(strA);
                break;
            case 7:
                d dVar7 = (d) viewHolder;
                dVar7.i.setText(R$string.settings_about_watch_base_band);
                y2 y2Var7 = this.f5415j;
                if (y2Var7 != null && !TextUtils.isEmpty(y2Var7.b())) {
                    strA = this.f5415j.b();
                }
                Context context = dVar7.f5417j.getContext();
                if (f(strA, dVar7.f5417j.getPaint(), ejg.f(context) - ejg.a(context, 48.0f)) > 1) {
                    dVar7.itemView.getLayoutParams().height = ejg.a(dVar7.f5417j.getContext(), 81.0f);
                }
                dVar7.f5417j.setText(strA);
                break;
            case 8:
                d dVar8 = (d) viewHolder;
                dVar8.i.setText(R$string.settings_about_watch_storage);
                y2 y2Var8 = this.f5415j;
                if (y2Var8 != null && !TextUtils.isEmpty(y2Var8.l())) {
                    strD = this.f5415j.l();
                }
                dVar8.f5417j.setText(strD);
                break;
            case 9:
                d dVar9 = (d) viewHolder;
                dVar9.i.setText(R$string.settings_about_watch_operator);
                y2 y2Var9 = this.f5415j;
                if (y2Var9 != null && !TextUtils.isEmpty(y2Var9.j())) {
                    strD = this.f5415j.j();
                }
                dVar9.f5417j.setText(strD);
                break;
            case 10:
                d dVar10 = (d) viewHolder;
                if (((Boolean) lc5.d(this.k).a(new Function1() { // from class: com.oplus.aiunit.vision.v2
                    @Override // p010kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(((DeviceModel) obj).Q9());
                    }
                })).booleanValue()) {
                    dVar10.i.setText(R$string.settings_about_watch_device_code);
                } else {
                    dVar10.i.setText(R$string.settings_about_watch_imei);
                }
                y2 y2Var10 = this.f5415j;
                if (y2Var10 != null && !TextUtils.isEmpty(y2Var10.f())) {
                    strD = this.f5415j.f();
                }
                dVar10.f5417j.setText(strD);
                break;
            case 11:
                d dVar11 = (d) viewHolder;
                dVar11.i.setText(R$string.settings_about_watch_serial);
                y2 y2Var11 = this.f5415j;
                if (y2Var11 != null && !TextUtils.isEmpty(y2Var11.m())) {
                    strD = this.f5415j.m();
                }
                dVar11.f5417j.setText(strD);
                break;
            case 12:
                d dVar12 = (d) viewHolder;
                dVar12.i.setText(R$string.settings_about_watch_bt);
                y2 y2Var12 = this.f5415j;
                dVar12.f5417j.setText((y2Var12 == null || TextUtils.isEmpty(y2Var12.c())) ? "_ _:_ _:_ _:_ _:_ _:_ _" : this.f5415j.c());
                break;
            case 14:
                c cVar = (c) viewHolder;
                cVar.i.setText(R$string.settings_about_watch_law);
                cVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.w2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.i.lambda$onBindViewHolder$0(i, view);
                    }
                });
                break;
            case 15:
                d dVar13 = (d) viewHolder;
                dVar13.i.setText(R$string.settings_about_family_nike_name);
                y2 y2Var13 = this.f5415j;
                if (y2Var13 != null && !TextUtils.isEmpty(y2Var13.i())) {
                    strD = this.f5415j.i();
                }
                dVar13.f5417j.setText(strD);
                dVar13.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.x2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.i.h(view);
                    }
                });
                break;
            case 16:
                d dVar14 = (d) viewHolder;
                dVar14.i.setText(R$string.band_about_sn);
                y2 y2Var14 = this.f5415j;
                if (y2Var14 != null && !TextUtils.isEmpty(y2Var14.m())) {
                    strM = this.f5415j.m();
                }
                dVar14.f5417j.setText(strM);
                break;
            case 17:
                d dVar15 = (d) viewHolder;
                dVar15.i.setText(R$string.settings_about_watch_eid);
                y2 y2Var15 = this.f5415j;
                if (y2Var15 != null && !TextUtils.isEmpty(y2Var15.e())) {
                    strM = this.f5415j.e();
                }
                dVar15.f5417j.setText(strM);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 1 || i == 13) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.settings_watch_more_settings_item_divider, viewGroup, false));
        }
        return i != 14 ? new d(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.settings_watch_more_settings_item_description, viewGroup, false)) : new c(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.settings_watch_about_watch_item_common, viewGroup, false));
    }

    public void setOnLawItemClickListener(e eVar) {
        this.i = eVar;
    }
}
