package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.heytap.health.wallet.entrance.R$id;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.health.wallet.entrance.R$string;
import com.heytap.health.wallet.network.car.rsp.CardInfoDTO;
import com.heytap.health.wallet.widget.CircleNetworkImageView;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class una extends BaseAdapter {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<CardInfoDTO> f17530j;
    public LayoutInflater k;

    public class a {
        public TextView a;
        public TextView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f17531c;
        public CircleNetworkImageView d;

        public a(View view) {
            this.a = (TextView) view.findViewById(R$id.name);
            this.b = (TextView) view.findViewById(R$id.code);
            this.f17531c = (TextView) view.findViewById(R$id.time);
            this.d = (CircleNetworkImageView) view.findViewById(R$id.item_bg);
        }
    }

    public una(Context context) {
        this.i = context;
        this.k = LayoutInflater.from(context);
    }

    public void a() {
        this.f17530j = null;
    }

    public void b(List<CardInfoDTO> list) {
        if (list != null) {
            List<CardInfoDTO> list2 = this.f17530j;
            if (list2 == null) {
                this.f17530j = list;
            } else {
                list2.addAll(list);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (drk.e(this.f17530j)) {
            return 0;
        }
        return this.f17530j.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f17530j.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        String createTm;
        if (view == null) {
            view = this.k.inflate(R$layout.item_key_info, (ViewGroup) null);
            aVar = new a(view);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        CardInfoDTO cardInfoDTO = this.f17530j.get(i);
        if (!TextUtils.isEmpty(cardInfoDTO.getCarMode())) {
            aVar.a.setText(cardInfoDTO.getCarMode());
        }
        if (!TextUtils.isEmpty(cardInfoDTO.getCarCode())) {
            aVar.b.setText(qz0.mContext.getResources().getString(R$string.car_no, cardInfoDTO.getCarCode()));
        }
        if (!TextUtils.isEmpty(cardInfoDTO.getCreateTm())) {
            try {
                createTm = e1j.c(e1j.format2.parse(cardInfoDTO.getCreateTm()), e1j.format6);
            } catch (Exception unused) {
                createTm = cardInfoDTO.getCreateTm();
            }
            aVar.f17531c.setText(qz0.mContext.getResources().getString(R$string.car_time, createTm));
        }
        if (!TextUtils.isEmpty(cardInfoDTO.getImgUrl())) {
            aVar.d.setImageUrl(cardInfoDTO.getImgUrl());
        }
        return view;
    }
}
