package com.heytap.health.watch.contactsync.watchui;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.base.base.BaseApplication;
import com.heytap.health.watch.contactsync.R$id;
import com.heytap.health.watch.contactsync.R$layout;
import com.heytap.health.watch.contactsync.R$string;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ol4;
import com.oplus.aiunit.vision.p44;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ContactStatusAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int TYPE_NORMAL = 1;
    public static final int TYPE_NO_PERMISSION = 2;
    public List<p44> i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f6488j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f6489l;

    public static class a extends RecyclerView.ViewHolder {
        public final TextView i;

        public a(@NonNull View view) {
            super(view);
            this.i = (TextView) view.findViewById(R$id.tv_item_contactstatus_value);
        }
    }

    public interface b {
        void b5(p44 p44Var);

        void y1();
    }

    public static class c extends RecyclerView.ViewHolder {
        public final Button i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final TextView f6490j;

        public c(@NonNull View view) {
            super(view);
            this.i = (Button) view.findViewById(R$id.btn_permissions_open);
            this.f6490j = (TextView) view.findViewById(R$id.tv_permissions_tip);
        }
    }

    public ContactStatusAdapter(String str, String str2) {
        this.f6488j = str;
        this.k = str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(View view) {
        b bVar = this.f6489l;
        if (bVar != null) {
            bVar.y1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(RecyclerView.ViewHolder viewHolder, View view) {
        if (this.f6489l != null) {
            this.f6489l.b5(this.i.get(viewHolder.getLayoutPosition()));
        }
    }

    public List<p44> getData() {
        return this.i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.i.get(i).b();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void h(List<p44> list) {
        this.i = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if (getItemViewType(i) == 1) {
            a aVar = (a) viewHolder;
            int iA = this.i.get(i).a();
            ol4 ol4Var = gl4.managerApi;
            if (!ol4Var.isConnected(this.f6488j) && !ol4Var.isConnected(this.k)) {
                i2 = R$string.watch_contactsync_device_no_connect;
            } else if (iA == 1 || iA == 0) {
                i2 = R$string.watch_contactsync_resource_phone;
            } else if (iA == 2) {
                i2 = R$string.watch_contactsync_resource_watch;
            } else if (iA == 3) {
                i2 = R$string.watch_contactsync_sync_ing;
            } else {
                i2 = iA == 4 ? R$string.watch_contactsync_switch_ing : -1;
            }
            if (i2 == -1) {
                return;
            }
            aVar.i.setText(BaseApplication.a().getResources().getString(i2));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i != 2) {
            final a aVar = new a(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.watch_contactstatus_item, viewGroup, false));
            aVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.o44
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.i.g(aVar, view);
                }
            });
            return aVar;
        }
        c cVar = new c(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.watch_contactsync_item_nopermissions, viewGroup, false));
        cVar.f6490j.setText(viewGroup.getContext().getString(R$string.watch_contactsync_persimiss_new));
        cVar.i.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.n44
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.f(view);
            }
        });
        return cVar;
    }

    public void setOnItemClickListener(b bVar) {
        this.f6489l = bVar;
    }
}
