package com.heytap.health.watchpair.family;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.devicemanager.processor.bean.VirtualAccountData;
import com.heytap.health.watchpair.R$drawable;
import com.heytap.health.watchpair.R$id;
import com.heytap.health.watchpair.R$layout;
import com.heytap.health.watchpair.R$string;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class FamilyAccountAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public List<VirtualAccountData> i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f7154j;

    public static class a extends RecyclerView.ViewHolder {
        public final ImageView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TextView f7155j;
        public final TextView k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final RadioButton f7156l;

        public a(@NonNull View view) {
            super(view);
            this.i = (ImageView) view.findViewById(R$id.iv_icon);
            this.f7155j = (TextView) view.findViewById(R$id.tv_title);
            this.k = (TextView) view.findViewById(R$id.tv_detail);
            this.f7156l = (RadioButton) view.findViewById(R$id.cb_select);
        }
    }

    public interface b {
        void onItemClick(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(int i, View view) {
        b bVar = this.f7154j;
        if (bVar != null) {
            bVar.onItemClick(i);
        }
    }

    public final int e(String str, String str2) {
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM--dd");
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(1);
        int iAbs = 0;
        try {
            if (!TextUtils.isEmpty(str) && (date = simpleDateFormat.parse(str)) != null) {
                calendar.setTime(date);
                iAbs = Math.abs(i - calendar.get(1));
            }
        } catch (ParseException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("getIcon: birthday ");
            sb.append(str);
            sb.append(",error = ");
            sb.append(e2.getMessage());
        }
        if (TextUtils.equals(str2, "M")) {
            if (iAbs < 25) {
                return R$drawable.icon_man_young;
            }
            return iAbs < 65 ? R$drawable.icon_man_middle_aged : R$drawable.icon_man_elderly;
        }
        if (iAbs < 25) {
            return R$drawable.icon_female_young;
        }
        return iAbs < 65 ? R$drawable.icon_female_middle_aged : R$drawable.icon_female_elderly;
    }

    public VirtualAccountData f(int i) {
        return this.i.get(i);
    }

    public void g(ArrayList<VirtualAccountData> arrayList) {
        this.i.clear();
        if (arrayList != null) {
            this.i.addAll(arrayList);
        }
        notifyDataSetChanged();
    }

    public List<VirtualAccountData> getDataList() {
        return this.i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {
        Context context = viewHolder.itemView.getContext();
        a aVar = (a) viewHolder;
        VirtualAccountData virtualAccountData = this.i.get(i);
        aVar.f7155j.setText(virtualAccountData.getNikcName());
        aVar.k.setText(virtualAccountData.isBindDevice() ? context.getResources().getString(R$string.oobe_device_colon_new, context.getResources().getString(R$string.oobe_manual_pair_device), virtualAccountData.getDeviceName()) : context.getResources().getString(R$string.oobe_family_not_bind_device));
        aVar.i.setImageResource(e(virtualAccountData.getBirthday(), virtualAccountData.getSex()));
        aVar.f7156l.setChecked(virtualAccountData.isChecked());
        aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.c17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$onBindViewHolder$0(i, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.item_family_account_view, viewGroup, false));
    }

    public void setOnItemClickListener(b bVar) {
        this.f7154j = bVar;
    }
}
