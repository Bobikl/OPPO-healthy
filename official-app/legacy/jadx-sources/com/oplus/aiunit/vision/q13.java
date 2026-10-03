package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.heytap.health.wallet.entrance.R$drawable;
import com.heytap.health.wallet.entrance.R$id;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.health.wallet.network.door.rsp.CardTheme;
import com.heytap.health.wallet.widget.CircleNetworkImageView;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class q13 extends BaseAdapter {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<CardTheme> f15581j;
    public LayoutInflater k;

    public class a {
        public CircleNetworkImageView a;
        public CircleNetworkImageView b;

        public a(View view) {
            this.a = (CircleNetworkImageView) view.findViewById(R$id.itemImgSelectContent);
            this.b = (CircleNetworkImageView) view.findViewById(R$id.itemImgSelectShadow);
        }
    }

    public q13(Context context, List<CardTheme> list) {
        this.i = context;
        this.f15581j = list;
        this.k = LayoutInflater.from(context);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f15581j.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f15581j.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = this.k.inflate(R$layout.item_img_select, (ViewGroup) null);
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        CardTheme cardTheme = this.f15581j.get(i);
        if (cardTheme == null) {
            return null;
        }
        if (!TextUtils.isEmpty(cardTheme.getCardImg())) {
            aVar.a.setPlaceHolderDrawable(R$drawable.img_card_defaul_bg);
            aVar.a.setImageUrl(cardTheme.getCardImg());
        }
        if (cardTheme.getSelected() == 0) {
            aVar.b.setVisibility(8);
        } else {
            aVar.b.setVisibility(0);
        }
        return view;
    }
}
