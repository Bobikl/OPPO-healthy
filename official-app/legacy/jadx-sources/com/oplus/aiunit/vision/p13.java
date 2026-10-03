package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.heytap.health.wallet.entrance.R$id;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.health.wallet.network.door.rsp.CardThemeGroup;
import com.heytap.health.wallet.widget.ConstantGridView;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class p13 extends BaseAdapter {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<CardThemeGroup> f15145j;
    public LayoutInflater k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public cdk<Integer, Integer> f15146l;

    public class a implements AdapterView.OnItemClickListener {
        public final /* synthetic */ int i;

        public a(int i) {
            this.i = i;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j2) {
            if (p13.this.f15146l != null) {
                p13.this.f15146l.a(Integer.valueOf(this.i), Integer.valueOf(i));
            }
        }
    }

    public class b {
        public TextView a;
        public ConstantGridView b;

        public b(View view) {
            this.a = (TextView) view.findViewById(R$id.themeGroup);
            this.b = (ConstantGridView) view.findViewById(R$id.themeGroupGv);
        }
    }

    public p13(Context context, List<CardThemeGroup> list) {
        this.i = context;
        this.f15145j = list;
        this.k = LayoutInflater.from(context);
    }

    public void b(cdk cdkVar) {
        this.f15146l = cdkVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f15145j.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f15145j.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        if (view == null) {
            view = this.k.inflate(R$layout.layout_card_theme, (ViewGroup) null);
            bVar = new b(view);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        CardThemeGroup cardThemeGroup = this.f15145j.get(i);
        if (cardThemeGroup == null) {
            return null;
        }
        if (!TextUtils.isEmpty(cardThemeGroup.getGroupName())) {
            bVar.a.setText(cardThemeGroup.getGroupName());
        }
        if (cardThemeGroup.getCardThemes() != null) {
            bVar.b.setAdapter((ListAdapter) new q13(this.i, cardThemeGroup.getCardThemes()));
            bVar.b.setOnItemClickListener(new a(i));
        }
        return view;
    }
}
