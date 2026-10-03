package com.heytap.health.wallet.entrance.ui.activities;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.wallet.entrance.R$id;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.health.wallet.network.car.rsp.CardInfoDTO;
import com.oplus.aiunit.vision.una;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/entrance/bound/list")
public class CardBoundListActivity extends EntranceBaseActivity {

    @Autowired(name = "KEY_CARD_LIST")
    public ArrayList<CardInfoDTO> u;
    public ListView v;
    public una w;

    public CardBoundListActivity() {
        super(R$layout.layout_bound_list);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void A7() {
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void C7() {
        una unaVar = new una(this);
        this.w = unaVar;
        this.v.setAdapter((ListAdapter) unaVar);
        this.w.a();
        this.w.b(this.u);
        this.w.notifyDataSetChanged();
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void y7() {
        this.v = (ListView) findViewById(R$id.lv_list);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void z7() {
        try {
            if (getIntent() != null) {
                this.u = (ArrayList) getIntent().getSerializableExtra("KEY_CARD_LIST");
            }
        } catch (Exception unused) {
        }
    }
}
