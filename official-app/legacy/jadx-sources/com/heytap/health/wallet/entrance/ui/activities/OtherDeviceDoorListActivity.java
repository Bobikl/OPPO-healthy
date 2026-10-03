package com.heytap.health.wallet.entrance.ui.activities;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$id;
import com.heytap.health.base.R$string;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.base.ui.widget.HealthButton;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.health.wallet.network.door.rsp.CloudCardRsp;
import com.heytap.health.wallet.network.door.rsp.CloudCardVo;
import com.heytap.health.wallet.repository.CardPkgRepository;
import com.heytap.health.wallet.utils.ItemDecHelperKt;
import com.heytap.wallet.business.adapters.OtherDeviceDoorListAdapter;
import com.oplus.aiunit.vision.a94;
import com.oplus.aiunit.vision.aec;
import com.oplus.aiunit.vision.drk;
import com.oplus.aiunit.vision.dtd;
import com.oplus.aiunit.vision.ie7;
import com.oplus.aiunit.vision.ihg;
import com.oplus.aiunit.vision.k7l;
import com.oplus.aiunit.vision.ktd;
import com.oplus.aiunit.vision.q06;
import com.oplus.aiunit.vision.rr6;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.u2j;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.z0k;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/entrance/otherDeviceDoorList")
public class OtherDeviceDoorListActivity extends EntranceBaseActivity {
    public RecyclerView A;
    public List<CloudCardVo> B;
    public ktd C;
    public ie7<CloudCardRsp> D;
    public dtd E;
    public q06 F;

    @Autowired(name = "url")
    public String u;

    @Autowired(name = "USER_RIGHT")
    public String v;

    @Autowired(name = "KEY_DATA_SOURCE")
    public String w;
    public HealthButton x;
    public TextView y;
    public OtherDeviceDoorListAdapter z;

    public class a extends ie7<CloudCardRsp> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.ie7
        public void a(@NonNull String str, @NonNull String str2) {
            OtherDeviceDoorListActivity.this.t7(Integer.parseInt(str), str2);
        }

        @Override // com.oplus.aiunit.vision.ie7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(CloudCardRsp cloudCardRsp) {
            OtherDeviceDoorListActivity.this.l7();
            if (cloudCardRsp == null || drk.e(cloudCardRsp.getCloudCardVoList())) {
                return;
            }
            ArrayList arrayList = new ArrayList(cloudCardRsp.getCloudCardVoList());
            Collections.reverse(arrayList);
            OtherDeviceDoorListActivity.this.B = arrayList;
            OtherDeviceDoorListActivity.this.z.h();
            OtherDeviceDoorListActivity.this.z.s(OtherDeviceDoorListActivity.this.B);
            OtherDeviceDoorListActivity.this.z.notifyDataSetChanged();
        }
    }

    public OtherDeviceDoorListActivity() {
        super(R$layout.activity_other_device_door_list);
        this.F = new q06();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L7(boolean z) {
        this.x.setEnabled(!z);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void A7() {
        B7(this.x);
        B7(this.y);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void C7() {
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(R$id.lib_base_toolbar);
        cOUIToolbar.setTitle("");
        R1(this, cOUIToolbar, true);
        K7();
        this.A.addItemDecoration(ItemDecHelperKt.otherDevCardDecor);
        M7();
    }

    public final void J7() {
        this.D = new a();
        new ktd().b(this.D);
    }

    public final void K7() {
        this.A.setLayoutManager(new LinearLayoutManager(this));
        this.A.setAdapter(this.z);
        this.z.u(new OtherDeviceDoorListAdapter.b() { // from class: com.oplus.aiunit.vision.jtd
            @Override // com.heytap.wallet.business.adapters.OtherDeviceDoorListAdapter.b
            public final void a(boolean z) {
                this.a.L7(z);
            }
        });
    }

    public final void M7() {
        r7();
        this.E = new dtd();
        if (!TextUtils.isEmpty(this.w)) {
            List<CloudCardVo> listC = GsonUtil.c(this.w, CloudCardVo.class);
            if (!drk.e(listC)) {
                this.B = listC;
                this.z.h();
                this.z.s(listC);
                this.z.notifyDataSetChanged();
                l7();
                return;
            }
        }
        J7();
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @u2j(threadMode = ThreadMode.MAIN)
    public void onBatchMigrateComplete(rr6 rr6Var) {
        if (a94.a(this)) {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() != com.heytap.health.wallet.entrance.R$id.ackBtn) {
            if (view.getId() == com.heytap.health.wallet.entrance.R$id.enroll_new) {
                ihg.a().b(this, "/entrance/index");
            }
        } else if (!CardPkgRepository.INSTANCE.h()) {
            z0k.f(this).o(R$string.lib_base_worker_manager_error_tip);
        } else {
            if (this.F.a() || !k7l.a()) {
                return;
            }
            this.E.b("descUrl", aec.o(), this, this.C.a(this.z.l()));
        }
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x0.d().f(this);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.D = null;
        super.onDestroy();
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void y7() {
        this.A = (RecyclerView) findViewById(com.heytap.health.wallet.entrance.R$id.cardList_rc);
        HealthButton healthButton = (HealthButton) findViewById(com.heytap.health.wallet.entrance.R$id.ackBtn);
        this.x = healthButton;
        healthButton.setEnabled(false);
        this.y = (TextView) findViewById(com.heytap.health.wallet.entrance.R$id.enroll_new);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void z7() {
        this.C = new ktd();
        if (!TextUtils.isEmpty(this.w)) {
            try {
                this.w = URLDecoder.decode(this.w, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                t6b.c(e2.getLocalizedMessage());
            }
        }
        this.z = new OtherDeviceDoorListAdapter(this, true, false);
    }
}
