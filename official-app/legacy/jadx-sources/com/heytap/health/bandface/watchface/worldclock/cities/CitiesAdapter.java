package com.heytap.health.bandface.watchface.worldclock.cities;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.bandface.R$id;
import com.heytap.health.bandface.R$layout;
import com.oplus.aiunit.vision.ayj;
import com.oplus.aiunit.vision.kw0;
import java.util.ArrayList;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes15.dex */
public class CitiesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final String TAG = "CitiesAdapter";
    public final ArrayList<CityBean> i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayoutManager f3145j;
    public c k;

    public class a implements View.OnClickListener {
        public final /* synthetic */ CityBean i;

        public a(CityBean cityBean) {
            this.i = cityBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CitiesAdapter.this.k.a(this.i);
        }
    }

    public static class b extends RecyclerView.ViewHolder {
        public TextView i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TextView f3147j;

        public b(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.tv_title);
            this.f3147j = (TextView) view.findViewById(R$id.tv_desc);
        }
    }

    public interface c {
        void a(CityBean cityBean);
    }

    public CitiesAdapter(LinearLayoutManager linearLayoutManager) {
        this.f3145j = linearLayoutManager;
    }

    public CityBean e(int i) {
        return this.i.get(i);
    }

    public void f(ArrayList<CityBean> arrayList) {
        this.i.clear();
        if (arrayList != null) {
            this.i.addAll(arrayList);
        }
        notifyDataSetChanged();
    }

    public void g(String str) {
        LinearLayoutManager linearLayoutManager;
        if (this.i.isEmpty()) {
            kw0.b(TAG, "[scrollToSection] --> mCities.isEmpty()");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            kw0.b(TAG, "[scrollToSection] --> index is empty");
            return;
        }
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            String firstLetter = this.i.get(i).getFirstLetter();
            if (TextUtils.isEmpty(firstLetter)) {
                kw0.e(TAG, "[scrollToSection] --> firstSpell is empty, continue");
            } else if (str.substring(0, 1).equalsIgnoreCase(firstLetter.substring(0, 1)) && (linearLayoutManager = this.f3145j) != null) {
                linearLayoutManager.scrollToPositionWithOffset(i, 0);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        b bVar = (b) viewHolder;
        CityBean cityBeanE = e(i);
        bVar.i.setText(cityBeanE.getName());
        bVar.f3147j.setText(ayj.c(ayj.b(TimeZone.getTimeZone(cityBeanE.getTimezoneId()))));
        if (this.k != null) {
            bVar.itemView.setOnClickListener(new a(cityBeanE));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.band_item_city, viewGroup, false));
    }

    public void setOnItemClickListener(c cVar) {
        this.k = cVar;
    }
}
