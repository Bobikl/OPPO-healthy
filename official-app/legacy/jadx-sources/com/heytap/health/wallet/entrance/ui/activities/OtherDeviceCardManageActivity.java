package com.heytap.health.wallet.entrance.ui.activities;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.button.COUIButton;
import com.coui.appcompat.toolbar.COUIToolbar;
import com.heytap.health.base.R$id;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.wallet.entrance.R$color;
import com.heytap.health.wallet.entrance.R$layout;
import com.heytap.health.wallet.entrance.R$string;
import com.heytap.health.wallet.model.otherdevice.OtherDeviceCard;
import com.heytap.health.wallet.network.door.params.RemoteDeleteCardReq;
import com.heytap.health.wallet.network.door.rsp.CloudCardVo;
import com.heytap.health.wallet.repository.CardPkgRepository;
import com.heytap.health.wallet.widget.CircleNetworkImageView;
import com.oplus.aiunit.vision.a94;
import com.oplus.aiunit.vision.aec;
import com.oplus.aiunit.vision.drk;
import com.oplus.aiunit.vision.dtd;
import com.oplus.aiunit.vision.e7l;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.ie7;
import com.oplus.aiunit.vision.k06;
import com.oplus.aiunit.vision.k7l;
import com.oplus.aiunit.vision.ktd;
import com.oplus.aiunit.vision.ls5;
import com.oplus.aiunit.vision.q06;
import com.oplus.aiunit.vision.rr6;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.u2j;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.z0k;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/entrance/otherDeviceCardManage")
public class OtherDeviceCardManageActivity extends EntranceBaseActivity {
    public static final String EXTRA_REMOTE_DELETE_SUCCESS = "extra_remote_delete_success";
    public CircleNetworkImageView A;
    public TextView B;
    public TextView C;
    public COUIButton D;
    public COUIButton E;

    @Autowired(name = "KEY_DATA_SOURCE")
    public String u;
    public CloudCardVo v;
    public ktd w;
    public dtd x;
    public final q06 y;
    public final q06 z;

    public class a extends ie7<Boolean> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.ie7
        public void a(@NonNull String str, @NonNull String str2) {
            t6b.d("OtherDeviceCardManage", "remoteDelete onFailure code=" + str + ", msg=" + str2);
            OtherDeviceCardManageActivity.this.J7(false);
        }

        @Override // com.oplus.aiunit.vision.ie7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(@NonNull Boolean bool) {
            t6b.f("OtherDeviceCardManage", "remoteDelete onSuccess result=" + bool);
            OtherDeviceCardManageActivity.this.J7(true);
        }
    }

    public OtherDeviceCardManageActivity() {
        super(R$layout.activity_other_device_card_manage);
        this.y = new q06();
        this.z = new q06();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L7(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M7(View view) {
        Q7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N7(View view) {
        U7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P7(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        S7();
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void A7() {
        this.D.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.etd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.M7(view);
            }
        });
        this.E.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ftd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.N7(view);
            }
        });
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void C7() {
        CloudCardVo cloudCardVo = this.v;
        if (cloudCardVo == null) {
            t6b.i("OtherDeviceCardManage", "setViews mCard null, finish");
            z0k.f(this).s(this, R$string.no_card_detail);
            finish();
            return;
        }
        if (!TextUtils.isEmpty(cloudCardVo.getCardImg())) {
            this.A.setImageUrl(this.v.getCardImg());
        }
        this.B.setText(this.v.getCardName());
        String deviceName = this.v.getDeviceName();
        if (TextUtils.isEmpty(deviceName)) {
            this.C.setText("");
        } else {
            this.C.setText(getString(com.oppo.lib.common.R$string.wallet_src_of_card, deviceName));
        }
    }

    public final void J7(boolean z) {
        Intent intent = new Intent();
        intent.putExtra(EXTRA_REMOTE_DELETE_SUCCESS, z);
        setResult(-1, intent);
        finish();
    }

    public final void K7() {
        COUIToolbar cOUIToolbar = (COUIToolbar) findViewById(R$id.lib_base_toolbar);
        cOUIToolbar.setTitle(R$string.entrance_other_device_card_manage_title);
        cOUIToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.gtd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.L7(view);
            }
        });
        R1(this, cOUIToolbar, true);
    }

    public final void Q7() {
        if (this.v == null) {
            t6b.i("OtherDeviceCardManage", "onCopyToLocalClick skip, mCard null");
            return;
        }
        if (!CardPkgRepository.INSTANCE.h()) {
            t6b.f("OtherDeviceCardManage", "onCopyToLocalClick skip, access list not initialized");
            z0k.f(this).o(com.heytap.health.base.R$string.lib_base_worker_manager_error_tip);
            return;
        }
        if (this.y.a()) {
            t6b.b("OtherDeviceCardManage", "onCopyToLocalClick skip, doubleClick");
            return;
        }
        if (!k7l.a()) {
            t6b.f("OtherDeviceCardManage", "onCopyToLocalClick skip, checkRemoteDeviceSt false");
            return;
        }
        List<OtherDeviceCard> listA = this.w.a(Collections.singletonList(this.v));
        if (listA == null) {
            t6b.i("OtherDeviceCardManage", "onCopyToLocalClick constructCloudDataSource null");
            return;
        }
        String strO = aec.o();
        StringBuilder sb = new StringBuilder();
        sb.append("onCopyToLocalClick cloudBatchShiftIn orderNo=");
        sb.append(this.v.getOrderNo());
        sb.append(", listSize=");
        sb.append(listA.size());
        sb.append(", localCplcLen=");
        sb.append(TextUtils.isEmpty(strO) ? 0 : strO.length());
        t6b.f("OtherDeviceCardManage", sb.toString());
        this.x.b("descUrl", strO, this, listA);
    }

    public final void R7() {
        if (TextUtils.isEmpty(this.u)) {
            t6b.f("OtherDeviceCardManage", "parseCard skip, empty dataSourceStr");
            return;
        }
        List listC = GsonUtil.c(this.u, CloudCardVo.class);
        if (drk.e(listC)) {
            t6b.i("OtherDeviceCardManage", "parseCard list empty after Gson");
            return;
        }
        CloudCardVo cloudCardVo = (CloudCardVo) listC.get(0);
        this.v = cloudCardVo;
        t6b.f("OtherDeviceCardManage", "parseCard ok size=" + listC.size() + ", orderNo=" + cloudCardVo.getOrderNo() + ", AppCode=" + cloudCardVo.getAppCode() + ", cardName=" + cloudCardVo.getCardName() + ", deviceName=" + cloudCardVo.getDeviceName() + ", cplc=" + cloudCardVo.getCplc());
    }

    @SuppressLint({"AutoDispose"})
    public final void S7() {
        if (this.v == null) {
            t6b.i("OtherDeviceCardManage", "performRemoteDelete skip, mCard null");
            return;
        }
        if (this.z.a()) {
            t6b.b("OtherDeviceCardManage", "performRemoteDelete skip, doubleClick");
            return;
        }
        if (!k7l.a()) {
            t6b.f("OtherDeviceCardManage", "performRemoteDelete skip, checkRemoteDeviceSt false");
            return;
        }
        String cplc = this.v.getCplc();
        String orderNo = this.v.getOrderNo();
        String strT7 = T7();
        if (TextUtils.isEmpty(cplc) || TextUtils.isEmpty(strT7) || TextUtils.isEmpty(orderNo)) {
            t6b.i("OtherDeviceCardManage", "performRemoteDelete param invalid, cplcEmpty=" + TextUtils.isEmpty(cplc) + ", deleteAppCodeEmpty=" + TextUtils.isEmpty(strT7) + ", orderNo=" + TextUtils.isEmpty(orderNo));
            J7(false);
            return;
        }
        t6b.f("OtherDeviceCardManage", "performRemoteDelete request orderNo=" + this.v.getOrderNo() + ", cplcLen=" + cplc.length() + ", deleteAppCodeLen=" + strT7.length());
        ((k06) e7l.INSTANCE.a(k06.class)).u(new RemoteDeleteCardReq(cplc, strT7, orderNo)).L0(su8.c()).n0(f30.c()).subscribe(new a());
    }

    public final String T7() {
        CloudCardVo cloudCardVo = this.v;
        if (cloudCardVo == null) {
            return "";
        }
        String appCode = cloudCardVo.getAppCode();
        return TextUtils.isEmpty(appCode) ? "" : appCode;
    }

    public final void U7() {
        t6b.b("OtherDeviceCardManage", "showRemoteDeleteConfirmDialog");
        ls5.d(this, getString(R$string.entrance_remote_delete_confirm_title), getString(R$string.entrance_remote_delete_confirm_message), getString(R$string.cancel), getString(R$string.delete), new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.htd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        }, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.itd
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.i.P7(dialogInterface, i);
            }
        }, true, R$color.entrance_dialog_delete_text);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @u2j(threadMode = ThreadMode.MAIN)
    public void onBatchMigrateComplete(rr6 rr6Var) {
        t6b.f("OtherDeviceCardManage", "onBatchMigrateComplete contextValid=" + a94.a(this));
        if (a94.a(this)) {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity, com.heytap.health.wallet.BaseActivityEx, com.heytap.health.wallet.BaseActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        x0.d().f(this);
        super.onCreate(bundle);
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void y7() {
        this.A = (CircleNetworkImageView) findViewById(com.heytap.health.wallet.entrance.R$id.card_image);
        this.B = (TextView) findViewById(com.heytap.health.wallet.entrance.R$id.tv_card_name);
        this.C = (TextView) findViewById(com.heytap.health.wallet.entrance.R$id.tv_device_info);
        this.D = (COUIButton) findViewById(com.heytap.health.wallet.entrance.R$id.btn_copy_to_local);
        this.E = (COUIButton) findViewById(com.heytap.health.wallet.entrance.R$id.btn_remote_delete);
        K7();
    }

    @Override // com.heytap.health.wallet.entrance.ui.activities.EntranceBaseActivity
    public void z7() {
        this.w = new ktd();
        this.x = new dtd();
        if (!TextUtils.isEmpty(this.u)) {
            try {
                this.u = URLDecoder.decode(this.u, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                t6b.d("OtherDeviceCardManage", "initData URLDecoder dataSourceStr: " + e2.getLocalizedMessage());
            }
        }
        R7();
    }
}
