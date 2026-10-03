package com.heytap.health.home.datacard;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.home.bean.UserBindDeviceBean;
import com.heytap.health.home.datacard.BindDeviceListAdapter;
import com.heytap.health.home.impl.R$id;
import com.heytap.health.home.impl.R$layout;
import com.heytap.health.home.impl.R$string;
import com.oplus.aiunit.vision.b78;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class BindDeviceListAdapter extends RecyclerView.Adapter<a> {
    public List<UserBindDeviceBean> i = new ArrayList();

    public class a extends RecyclerView.ViewHolder {
        public TextView i;

        public a(View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.tv_device);
        }
    }

    public static /* synthetic */ int e(UserBindDeviceBean userBindDeviceBean, UserBindDeviceBean userBindDeviceBean2) {
        return Integer.compare(userBindDeviceBean.getDeviceType(), userBindDeviceBean2.getDeviceType());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull a aVar, int i) {
        aVar.i.setText("• " + this.i.get(i).getDeviceName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.home_card_step_resource_adapter, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        StringBuilder sb = new StringBuilder();
        sb.append("data size is ");
        sb.append(this.i.size());
        return this.i.size();
    }

    public void setData(List<UserBindDeviceBean> list) {
        this.i.clear();
        UserBindDeviceBean userBindDeviceBean = new UserBindDeviceBean();
        userBindDeviceBean.setDeviceName(b78.a().getResources().getString(R$string.home_step_phone));
        userBindDeviceBean.setDeviceType(0);
        this.i.add(userBindDeviceBean);
        this.i.addAll(list);
        Collections.sort(this.i, new Comparator() { // from class: com.oplus.aiunit.vision.ee1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BindDeviceListAdapter.e((UserBindDeviceBean) obj, (UserBindDeviceBean) obj2);
            }
        });
        StringBuilder sb = new StringBuilder();
        sb.append("setData data size is ");
        sb.append(this.i.size());
        notifyDataSetChanged();
    }
}
