package com.heytap.health.operation.operation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.option.DataSyncOption;
import com.heytap.health.base.R$color;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.track.NxTrackHelper;
import com.heytap.health.base.track.a;
import com.heytap.health.core.webservice.BaseBrowserActivity;
import com.heytap.health.core.webservice.BrowserView;
import com.heytap.health.core.webservice.uiObserver.EcgEventObserver;
import com.heytap.health.operation.operation.OperationWebViewActivity;
import com.heytap.health.settings.me.setting.NetWorkOfficeWebViewActivity;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.heytap.wearable.emergency.api.emergency.EmergencyTransportApis;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.khg;
import com.oplus.aiunit.vision.kwa;
import com.oplus.aiunit.vision.l4g;
import com.oplus.aiunit.vision.mdd;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.s3k;
import com.oplus.aiunit.vision.sae;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.vda;
import com.oplus.aiunit.vision.vik;
import com.oplus.aiunit.vision.x0;
import com.oplus.aiunit.vision.z62;
import com.oplus.aiunit.vision.zv8;

/* JADX INFO: loaded from: classes17.dex */
@Route(path = "/operation/report/OperationWebViewActivity")
public class OperationWebViewActivity extends BaseBrowserActivity implements NxTrackHelper.g, s3k {
    public static final String EightThousandStepsOperation = "1";
    public static final String KEY_OPERATION_URL = "jumpUrl";
    public static final String TwentyOneDaysOperation = "2";

    @Autowired(name = "actCode")
    public String r;

    @Autowired(name = "parentActCode")
    public String s;

    @Autowired(name = "jumpUrl")
    public String t;
    public EcgEventObserver u;
    public final String q = "actType";

    @Autowired(name = "actType")
    public String v = "1";

    public static /* synthetic */ void B7(Object obj) throws Throwable {
    }

    public static /* synthetic */ void C7(Throwable th) throws Throwable {
        StringBuilder sb = new StringBuilder();
        sb.append("synCloud---throwable: ");
        sb.append(th.getMessage());
    }

    public final boolean A7() {
        return this.t.startsWith("ecg/index.html");
    }

    public final void D7() {
        if (n7().getProgress() == 100) {
            z7("onAppForceUpdate", new String[0]);
        }
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity, com.heytap.health.base.base.BaseViewSizeControl
    public boolean F5() {
        return false;
    }

    @Override // com.oplus.aiunit.vision.dz0
    public boolean Z3() {
        return true;
    }

    @Override // com.heytap.health.base.base.BaseActivity
    public boolean c7() {
        return A7();
    }

    @Override // com.oplus.aiunit.vision.az0
    public void h6(BaseActivity baseActivity, int i) {
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity, com.heytap.health.base.base.BaseActivity, com.heytap.health.base.base.BaseViewSizeControl
    public /* bridge */ /* synthetic */ void handleContentView(View view) {
        super.handleContentView(view);
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity, com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (A7()) {
            this.u = new EcgEventObserver(this, n7());
        }
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("vfs");
            String stringExtra2 = intent.getStringExtra("vfm");
            String stringExtra3 = intent.getStringExtra("vfc");
            if (TextUtils.isEmpty(stringExtra) && TextUtils.isEmpty(stringExtra2) && TextUtils.isEmpty(stringExtra3)) {
                return;
            }
            a.b bVarA = a.x().a("pageid", "OperationWebViewActivity").a(vik.TAG_MODULE_ID, -1);
            if (!TextUtils.isEmpty(stringExtra)) {
                bVarA.a("vfs", stringExtra);
            }
            if (!TextUtils.isEmpty(stringExtra2)) {
                bVarA.a("vfm", stringExtra2);
            }
            if (!TextUtils.isEmpty(stringExtra3)) {
                bVarA.a("vfc", stringExtra3);
            }
            bVarA.b();
        }
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity, com.heytap.health.base.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        sae.h().e();
        EmergencyTransportApis emergencyTransportApis = EmergencyTransportApis.INSTANCE;
        if (emergencyTransportApis.d(this.t)) {
            Bundle bundle = new Bundle();
            bundle.putString(EmergencyTransportApis.EMERGENCY_SAFE_EVENT_KEY_FLUID, this.t);
            emergencyTransportApis.f(bundle);
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String strK = vda.k(intent, "jumpUrl");
        if (strK != null) {
            this.t = strK;
            StringBuilder sb = new StringBuilder();
            sb.append("onNewIntent: new url=");
            sb.append(this.t);
            if (EmergencyTransportApis.INSTANCE.d(this.t)) {
                m7().p();
            }
            m7().u(getMUrl());
        }
    }

    @Override // com.heytap.health.base.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        D7();
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    @SuppressLint({"AutoDispose"})
    public void r7(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("load: ");
        sb.append(str);
        DataSyncOption dataSyncOption = new DataSyncOption();
        dataSyncOption.setSyncDataType(1000);
        dataSyncOption.setSyncAction(0);
        ((mdd) SportHealthDataAPI.getInstance().synCloud(dataSyncOption).L0(su8.c()).d1(l4g.a(this))).b(new o14() { // from class: com.oplus.aiunit.vision.cnd
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                OperationWebViewActivity.B7(obj);
            }
        }, new o14() { // from class: com.oplus.aiunit.vision.dnd
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                OperationWebViewActivity.C7((Throwable) obj);
            }
        });
        m7().u(str);
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    public z62 s7(BrowserView browserView) {
        boolean booleanExtra;
        int i;
        boolean zEquals;
        boolean booleanExtra2;
        boolean booleanExtra3;
        boolean zEqualsIgnoreCase = false;
        try {
            i = getIntent().hasExtra("theme") ? Integer.parseInt(getIntent().getStringExtra("theme")) : 1;
            try {
                booleanExtra = getIntent().hasExtra(NetWorkOfficeWebViewActivity.EXTRA_ADOPT_SCREEN) ? getIntent().getBooleanExtra(NetWorkOfficeWebViewActivity.EXTRA_ADOPT_SCREEN, true) : true;
                try {
                    booleanExtra3 = getIntent().hasExtra(NetWorkOfficeWebViewActivity.EXTRA_SUPPORT_DARK_MODE) ? getIntent().getBooleanExtra(NetWorkOfficeWebViewActivity.EXTRA_SUPPORT_DARK_MODE, false) : false;
                    try {
                        booleanExtra2 = getIntent().hasExtra("supportZoom") ? getIntent().getBooleanExtra("supportZoom", false) : false;
                        try {
                            zEquals = getIntent().hasExtra("supportLongClick") ? SpeechConstant.TRUE_STR.equals(getIntent().getStringExtra("supportLongClick")) : false;
                            try {
                                if (getIntent().hasExtra(khg.KEY_SHOW_PROGRESS)) {
                                    zEqualsIgnoreCase = SpeechConstant.TRUE_STR.equalsIgnoreCase(getIntent().getStringExtra(khg.KEY_SHOW_PROGRESS));
                                }
                            } catch (Exception e2) {
                                e = e2;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Exception: ");
                                sb.append(e.getMessage());
                            }
                        } catch (Exception e3) {
                            e = e3;
                            zEquals = false;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        zEquals = false;
                        booleanExtra2 = false;
                    }
                } catch (Exception e5) {
                    e = e5;
                    zEquals = false;
                    booleanExtra2 = false;
                    booleanExtra3 = false;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Exception: ");
                    sb2.append(e.getMessage());
                    OperationJsExecutor operationJsExecutor = new OperationJsExecutor(this.v, this.r, this.s);
                    kwa.c(getLifecycle(), operationJsExecutor);
                    JsDownloadResource jsDownloadResource = new JsDownloadResource();
                    kwa.c(getLifecycle(), jsDownloadResource);
                    return z62.P(this).J(browserView).O(i).I(true).C(booleanExtra).E(true).N(booleanExtra2).M(zEquals).K(zEqualsIgnoreCase).P(10).F().L(booleanExtra3).A(operationJsExecutor).A(jsDownloadResource).D();
                }
            } catch (Exception e6) {
                e = e6;
                booleanExtra = true;
            }
        } catch (Exception e7) {
            e = e7;
            booleanExtra = true;
            i = 1;
        }
        OperationJsExecutor operationJsExecutor2 = new OperationJsExecutor(this.v, this.r, this.s);
        kwa.c(getLifecycle(), operationJsExecutor2);
        JsDownloadResource jsDownloadResource2 = new JsDownloadResource();
        kwa.c(getLifecycle(), jsDownloadResource2);
        return z62.P(this).J(browserView).O(i).I(true).C(booleanExtra).E(true).N(booleanExtra2).M(zEquals).K(zEqualsIgnoreCase).P(10).F().L(booleanExtra3).A(operationJsExecutor2).A(jsDownloadResource2).D();
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity, com.oplus.aiunit.vision.az0
    public void t3(BaseActivity baseActivity, boolean z, boolean z2) {
        Window window = baseActivity.getWindow();
        if (ejg.k()) {
            return;
        }
        window.setNavigationBarColor(ContextCompat.getColor(baseActivity, R$color.lib_base_common_background_color));
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    public void t7(Bundle bundle) {
        super.t7(bundle);
        x0.d().f(this);
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    public void u7() {
        super.u7();
        v7();
    }

    @Override // com.heytap.health.core.webservice.BaseBrowserActivity
    /* JADX INFO: renamed from: w7 */
    public String getMUrl() {
        return zv8.H5_PATH + this.t;
    }

    public void z7(String str, String... strArr) {
        StringBuilder sb = new StringBuilder("javascript:");
        sb.append(str + "(");
        if (strArr == null || strArr.length == 0) {
            sb.append(")");
        } else {
            for (int i = 0; i < strArr.length; i++) {
                if (i == strArr.length - 1) {
                    sb.append(String.format("'%s'", strArr[i]) + ")");
                } else {
                    sb.append(String.format("'%s'", strArr[i]) + ", ");
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("JsApp---callJsMethod: ");
        sb2.append(sb.toString());
        WebView webViewN7 = n7();
        if (webViewN7 != null) {
            webViewN7.evaluateJavascript(sb.toString(), null);
        }
    }
}
