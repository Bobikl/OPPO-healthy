package com.oplus.aiunit.vision;

import android.content.Intent;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.option.DataSyncOption;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.privacy.PrivacySyncStatusBean;
import com.heytap.health.device_settings.setting.IDeviceSettingService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class nve implements m71 {
    public rv9 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BaseActivity f14658j;

    public class a extends u61<PrivacySyncStatusBean> {

        /* JADX INFO: renamed from: com.oplus.aiunit.vision.nve$a$a, reason: collision with other inner class name */
        public class C0905a extends ao0<String> {
            public C0905a() {
            }

            @Override // com.oplus.aiunit.vision.ao0
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void b(String str) {
                if (str.equals("1")) {
                    nve.this.i.S5(true);
                } else if (str.equals("0")) {
                    nve.this.i.S5(false);
                }
            }
        }

        public a() {
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            a7b.b("PrivacyDataSettingPresenter", "fetchUserInfoExternal result fail:" + str);
        }

        @Override // com.oplus.aiunit.vision.u61
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void d(PrivacySyncStatusBean privacySyncStatusBean) {
            if (privacySyncStatusBean != null) {
                a7b.f("PrivacyDataSettingPresenter", "fetchUserInfoExternal result success, privacy sync status is: " + privacySyncStatusBean.getPrivacySyncStatus());
                ((mdd) owe.y(privacySyncStatusBean).n0(f30.c()).d1(l4g.b(nve.this.f14658j))).subscribe(new C0905a());
            }
        }
    }

    public class b extends ao0<CommonBackBean> {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            StringBuilder sb = new StringBuilder();
            sb.append("syncDBData HEALTH_ARCHIVE  errorCode=");
            sb.append(commonBackBean.getErrorCode());
        }
    }

    public class c extends ao0<CommonBackBean> {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(CommonBackBean commonBackBean) {
            a7b.f("PrivacyDataSettingPresenter", "syncDBData errorCode=" + commonBackBean.getErrorCode());
            Intent intent = new Intent("sport_one_time_record_update");
            intent.setPackage(nve.this.f14658j.getPackageName());
            nve.this.f14658j.sendBroadcast(intent);
        }
    }

    public class d extends u61<Object> {
        public final /* synthetic */ boolean i;

        public d(boolean z) {
            this.i = z;
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            a7b.b("PrivacyDataSettingPresenter", "updatePrivacySyncStatus result fail:" + str);
            y0k.i(str);
            nve.this.i.S5(this.i ^ true);
        }

        @Override // com.oplus.aiunit.vision.u61
        public void d(Object obj) {
            a7b.f("PrivacyDataSettingPresenter", "updatePrivacySyncStatus result success,result:" + obj);
            nve.this.i.S5(this.i);
            owe.z(this.i);
            v9g.x("privacy_sync_data_state").U("privacy_data_sync_state", this.i ? String.valueOf(1) : String.valueOf(0));
            if (this.i) {
                nve.this.H(0);
            }
            ((IDeviceSettingService) x0.d().b("/device_settings/DeviceSettingServiceImpl").navigation()).n4();
        }
    }

    public class e extends u61<Object> {
        public e() {
        }

        @Override // com.oplus.aiunit.vision.u61
        public void b(Throwable th, String str) {
            y0k.i(str);
            a7b.b("PrivacyDataSettingPresenter", "updatePrivacySyncStatus result fail:" + str);
        }

        @Override // com.oplus.aiunit.vision.u61
        public void d(Object obj) {
            a7b.f("PrivacyDataSettingPresenter", "deleteAllUserInfo result success");
            v9g.x("privacy_sync_data_state").U("privacy_data_sync_state", String.valueOf(0));
            nve.this.i.S5(false);
            owe.z(false);
        }
    }

    public nve(BaseActivity baseActivity, rv9 rv9Var) {
        this.f14658j = baseActivity;
        this.i = rv9Var;
    }

    public void E() {
        ((mdd) ((bwe) com.heytap.health.network.core.a.j(bwe.class)).b().L0(su8.c()).n0(f30.c()).d1(l4g.a(this.f14658j))).subscribe(new e());
    }

    public void H(int i) {
        a7b.f("PrivacyDataSettingPresenter", "syncDBData enter");
        DataSyncOption dataSyncOption = new DataSyncOption();
        dataSyncOption.setSyncAction(0);
        dataSyncOption.setSyncDataType(17);
        SportHealthDataAPI.getInstance().synCloud(dataSyncOption).L0(su8.c()).subscribe(new b());
        DataSyncOption dataSyncOption2 = new DataSyncOption();
        dataSyncOption2.setSyncAction(i);
        dataSyncOption2.setSyncDataType(1000);
        SportHealthDataAPI.getInstance().synCloud(dataSyncOption2).subscribe(new c());
    }

    public void K(boolean z) {
        HashMap map = new HashMap();
        map.put("privacySyncStatus", Integer.valueOf(z ? 1 : 0));
        com.heytap.health.base.track.a.B(12, !z ? 1 : 0);
        ((mdd) ((bwe) com.heytap.health.network.core.a.j(bwe.class)).a(map).L0(su8.c()).n0(f30.c()).d1(l4g.a(this.f14658j))).subscribe(new d(z));
    }

    @Override // com.oplus.aiunit.vision.m71
    public void start() {
        if (v9g.x("privacy_sync_data_state").E("privacy_data_sync_state", "0").equals("0")) {
            this.i.S5(false);
        } else {
            this.i.S5(true);
        }
        if (v9g.x("health_share_preference_oobe").r("account_reset_cloud", false)) {
            ((mdd) ((bwe) com.heytap.health.network.core.a.l(bwe.class)).c().L0(su8.c()).n0(f30.c()).d1(l4g.a(this.f14658j))).subscribe(new a());
        } else if (v9g.x("privacy_sync_data_state").E("privacy_data_sync_state", "-1").equals("-1")) {
            this.i.S5(false);
        }
    }
}
