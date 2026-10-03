package com.heytap.health.operation.ecg.helper;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.coui.appcompat.dialog.COUISecurityAlertDialogBuilder;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.model.CommonBackBean;
import com.heytap.databaseengine.model.ECGRecord;
import com.heytap.databaseengine.option.DataSyncOption;
import com.heytap.health.base.R$color;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.ui.dialog.HealthAlertDialogBuilder;
import com.heytap.health.operation.R$string;
import com.heytap.health.operation.ecg.business.PrivacyContentWebAct;
import com.heytap.health.operation.ecg.data.ProductBean;
import com.heytap.health.operation.ecg.data.SubmitEcgDataBean;
import com.heytap.health.operation.ecg.data.SubmitExpertResultBean;
import com.heytap.health.operation.ecg.helper.EcgHelper;
import com.oplus.aiunit.vision.afk;
import com.oplus.aiunit.vision.ax7;
import com.oplus.aiunit.vision.bdd;
import com.oplus.aiunit.vision.ccd;
import com.oplus.aiunit.vision.d08;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.jdd;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.md1;
import com.oplus.aiunit.vision.mmd;
import com.oplus.aiunit.vision.mnc;
import com.oplus.aiunit.vision.n04;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.oa2;
import com.oplus.aiunit.vision.owe;
import com.oplus.aiunit.vision.qv9;
import com.oplus.aiunit.vision.rg7;
import com.oplus.aiunit.vision.sc8;
import com.oplus.aiunit.vision.v62;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.yha;
import com.oplus.aiunit.vision.z96;
import com.oplus.aiunit.vision.zid;
import com.support.dialog.R$id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public class EcgHelper implements qv9 {
    public static final String CHECKING_QUALITY_ERROR = "hlw is checking data quality now >> check allways -1 reset reportNo";
    public static final String CHECKING_QUALITY_MSG = "hlw is checking data quality now >>";
    public static final String COMPANYID = "1003";
    public static final float DOCTOR_PRICE_DISCOUNT = 0.8f;
    public static final int EXPERT_STATE_DATA_DIRTY = 1;
    public static final int EXPERT_STATE_DATA_GOOD = 2;
    public static final int EXPERT_STATE_NON = 0;
    public static final int EXPERT_STATE_RESULT = 4;
    public static final int EXPERT_STATE_WAIT_RESULT_1 = 100;
    public static final int EXPERT_STATE_WAIT_RESULT_2 = 200;
    public static final String HLWUSERID = "HlwUserId";
    public static final String PUSHEXPERTINTERPRETATION_INTENT_KEY = "packageObject";
    public static final String SPLID = ",";
    public static final String SP_KEY_SFFX_BUY_MSG = "SP_KEY_SFFX_BUY_MSG";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f5177j;
    public static String[] mBuyItems = {"1.00元/ 次"};
    public static List<ProductBean> mProductBeans = Collections.emptyList();
    public int i;

    public static class SyncDataLiveData extends OLiveData<Intent> {
        public List<Observer> k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f5178l;
        public BroadcastReceiver m;

        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                z96.a("onReceive：receive ecg sync succeed broadcast refresh data >>", Integer.valueOf(intent.getIntExtra("DATA_CHANGE_ACTION", 0)));
                SyncDataLiveData.this.postValue(intent);
            }
        }

        public static class b {
            public static SyncDataLiveData a = new SyncDataLiveData();
        }

        public static SyncDataLiveData i() {
            return b.a;
        }

        public void j() {
            z96.a("regestSyncBroardcast：>>");
            v62.a(rg7.h(), this.m, new IntentFilter("com.heytap.health.action_sync_ecg_record_data"));
            this.f5178l = true;
        }

        @Override // com.heytap.health.base.livedata.OLiveData, androidx.lifecycle.LiveData
        public void observe(@NonNull LifecycleOwner lifecycleOwner, @NonNull Observer<? super Intent> observer) {
            super.observe(lifecycleOwner, observer);
            if (this.k.isEmpty()) {
                j();
            }
            this.k.add(observer);
        }

        @Override // com.heytap.health.base.livedata.OLiveData, androidx.lifecycle.LiveData
        public void removeObserver(@NonNull Observer observer) {
            super.removeObserver(observer);
            this.k.remove(observer);
            if (this.f5178l && this.k.isEmpty()) {
                v62.c(rg7.h(), this.m);
                this.f5178l = false;
            }
        }

        private SyncDataLiveData() {
            this.k = new ArrayList();
            this.f5178l = false;
            this.m = new a();
        }
    }

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            EcgHelper.U();
            mmd.c().a(Uri.parse("healthap://app/path=100?tab=0"), null);
        }
    }

    public static class b implements COUISecurityAlertDialogBuilder.g {
        public ccd<Boolean> a;
        public boolean b;

        public b(ccd<Boolean> ccdVar) {
            this.a = ccdVar;
        }

        @Override // com.coui.appcompat.dialog.COUISecurityAlertDialogBuilder.g
        public void onSelected(int i, boolean z) {
            this.b = z;
            if (i == -2) {
                this.a.onComplete();
                return;
            }
            if (i != -1) {
                return;
            }
            if (!z) {
                rg7.m(rg7.e(R$string.ect_service_statement_toast));
                return;
            }
            this.a.onNext(Boolean.TRUE);
            v9g.w().W(oa2.e("EcgHelper"), true);
            this.a.onComplete();
        }
    }

    public static boolean A(ECGRecord eCGRecord) {
        String algorithmsAnalyzeResult = eCGRecord.getAlgorithmsAnalyzeResult();
        return (TextUtils.isEmpty(algorithmsAnalyzeResult) || TextUtils.isDigitsOnly(algorithmsAnalyzeResult)) ? false : true;
    }

    public static void B(String str) {
        z96.b("keepHlwUserId：", str);
        v().U(HLWUSERID, Objects.toString(str, "999998"));
    }

    public static void C(String str) {
        f5177j = str;
    }

    public static /* synthetic */ jdd D(ECGRecord eCGRecord, Object obj, Object obj2, SubmitEcgDataBean submitEcgDataBean) throws Throwable {
        z96.a("submitEcgData：提交心电数据监测是否干扰返回reportId", submitEcgDataBean.reportId);
        eCGRecord.setReportId(submitEcgDataBean.reportId);
        return p(eCGRecord, obj, obj2);
    }

    public static /* synthetic */ void E(ECGRecord eCGRecord, SubmitEcgDataBean submitEcgDataBean) throws Throwable {
        if (submitEcgDataBean.isEcgDataChecking()) {
            z96.a("checkEcgQuality： hlw is checking data quality now >>");
            throw new RuntimeException(CHECKING_QUALITY_MSG);
        }
        if (submitEcgDataBean.isEcgDataOk()) {
            z96.a("checkEcgQuality：ecg data quality result > ok");
            eCGRecord.setExpertState(2);
        } else {
            z96.a("checkEcgQuality：ecg data quality result > bad (-1 正在检测 0正常  1异常  2 导联脱落)", Integer.valueOf(submitEcgDataBean.ecgState));
            eCGRecord.setExpertState(1);
        }
    }

    public static /* synthetic */ Serializable F(Throwable th, Integer num) throws Throwable {
        return (!CHECKING_QUALITY_MSG.equals(th.getMessage()) || num.intValue() >= 7) ? th.getMessage() : num;
    }

    public static /* synthetic */ jdd G(ECGRecord eCGRecord, Object obj) throws Throwable {
        if (!(obj instanceof Integer)) {
            eCGRecord.setReportId("");
            z96.c("checkEcgQuality error ", CHECKING_QUALITY_ERROR);
            return lbd.O(new RuntimeException(CHECKING_QUALITY_ERROR));
        }
        z96.a("checkEcgQuality delay request by " + obj + " second(s)");
        return lbd.b1(Integer.parseInt(obj.toString()), TimeUnit.SECONDS);
    }

    public static /* synthetic */ jdd H(final ECGRecord eCGRecord, lbd lbdVar) throws Throwable {
        return lbdVar.s1(lbd.w0(1, 7), new md1() { // from class: com.oplus.aiunit.vision.fd6
            @Override // com.oplus.aiunit.vision.md1
            public final Object apply(Object obj, Object obj2) {
                return EcgHelper.F((Throwable) obj, (Integer) obj2);
            }
        }).Q(new d08() { // from class: com.oplus.aiunit.vision.sc6
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj) {
                return EcgHelper.G(eCGRecord, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(Activity activity) {
        new HealthAlertDialogBuilder(activity).setTitle(R$string.ecg_submit_sync_tip).setMessage(rg7.e(this.i)).setNegativeButton(com.heytap.health.base.R$string.lib_base_not_yet, null).setPositiveButton(R$string.ecg_submit_error_open_cloud, new a()).show();
    }

    public static /* synthetic */ void L(ccd ccdVar, Long l2) throws Throwable {
        z96.c("ecgDataRetryTip >> sync 5s later  " + ccdVar.isDisposed());
        if (ccdVar.isDisposed()) {
            return;
        }
        ccdVar.onNext(1);
        ccdVar.onComplete();
    }

    public static /* synthetic */ void M(final ccd ccdVar, DialogInterface dialogInterface, int i) {
        U();
        z96.c("ecgDataRetryTip >> sync ing  ");
        lbd.b1(5L, TimeUnit.SECONDS).a(new o14() { // from class: com.oplus.aiunit.vision.wc6
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                EcgHelper.L(ccdVar, (Long) obj);
            }
        });
    }

    public static /* synthetic */ void N(final ccd ccdVar, Throwable th) throws Throwable {
        if (owe.m()) {
            z96.a("submitData2HLW：隐私同步关了 抛出异常 由原来的逻辑处理");
            ccdVar.onError(new RuntimeException(mnc.SUBMIT_ECG_ERROR_ECG_NOT_SYNC));
        } else {
            if (!mnc.SUBMIT_ECG_ERROR_ECG_NOT_SYNC.equals(th.getMessage())) {
                ccdVar.onError(th);
                return;
            }
            Activity activityI = rg7.i();
            if (activityI == null) {
                ccdVar.onComplete();
            } else {
                new HealthAlertDialogBuilder(activityI).setTitle(rg7.e(R$string.operation_ecg_retry_when_submit_title)).setCancelable(false).setMessage(rg7.e(R$string.operation_ecg_retry_when_submit_desc)).setNegativeButton(com.heytap.health.base.R$string.lib_base_not_yet, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.uc6
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        EcgHelper.P(ccdVar, dialogInterface, i);
                    }
                }).setPositiveButton(R$string.operation_ecg_sync_now, new DialogInterface.OnClickListener() { // from class: com.oplus.aiunit.vision.vc6
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        EcgHelper.M(ccdVar, dialogInterface, i);
                    }
                }).show();
            }
        }
    }

    public static /* synthetic */ void O(lbd lbdVar, final ccd ccdVar) throws Throwable {
        ccdVar.onNext("");
        lbdVar.n0(f30.c()).a(new o14() { // from class: com.oplus.aiunit.vision.tc6
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                EcgHelper.N(ccdVar, (Throwable) obj);
            }
        });
    }

    public static /* synthetic */ void P(ccd ccdVar, DialogInterface dialogInterface, int i) {
        z96.c("ecgDataRetryTip >> sync no  " + ccdVar.isDisposed());
        if (ccdVar.isDisposed()) {
            return;
        }
        ccdVar.onComplete();
    }

    public static /* synthetic */ void Q(CommonBackBean commonBackBean) throws Throwable {
        z96.a("syncDBData errorCode=" + commonBackBean.getErrorCode());
    }

    public static lbd<Boolean> R() {
        return v9g.w().r(oa2.e("EcgHelper"), false) ? lbd.h0(Boolean.TRUE) : lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.xc6
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) {
                EcgHelper.q(ccdVar);
            }
        });
    }

    public static String S(int i, String str) {
        return T(i, str, false);
    }

    public static String T(int i, String str, boolean z) {
        if (i <= 2) {
            if (i == 1) {
                return rg7.e(z ? R$string.ecg_expert_state_read_finish : R$string.ecg_data_not_good);
            }
            return rg7.e(z ? R$string.ecg_expert_state_unread2 : R$string.ecg_expert_state_unread);
        }
        String string = Objects.toString(str, "");
        if (string.startsWith(n04.OPEN_BRACE_REGEX) && string.endsWith("}") && string.contains(":")) {
            SubmitExpertResultBean submitExpertResultBean = (SubmitExpertResultBean) sc8.a(string, SubmitExpertResultBean.class);
            if (submitExpertResultBean == null) {
                return rg7.e(R$string.ecg_expert_state_reading);
            }
            string = submitExpertResultBean.interpretationResults;
        }
        if (TextUtils.isEmpty(string)) {
            return rg7.e(R$string.ecg_expert_state_reading);
        }
        return z ? rg7.e(R$string.ecg_expert_state_read_finish) : rg7.f(R$string.ecg_expert_state_result, string);
    }

    @SuppressLint({"CheckResult"})
    public static void U() {
        z96.a("sync ecg Data：");
        DataSyncOption dataSyncOption = new DataSyncOption();
        dataSyncOption.setSyncAction(0);
        dataSyncOption.setSyncDataType(5);
        SportHealthDataAPI.getInstance().synCloud(dataSyncOption).a(new o14() { // from class: com.oplus.aiunit.vision.rc6
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj) throws Throwable {
                EcgHelper.Q((CommonBackBean) obj);
            }
        });
    }

    public static void V() {
        W(new RuntimeException());
    }

    public static void W(Throwable th) {
        if (ax7.j().l()) {
            afk.l(th);
        } else {
            yha.j(th);
        }
    }

    public static lbd<SubmitEcgDataBean> p(final ECGRecord eCGRecord, final Object obj, final Object obj2) {
        if (TextUtils.isEmpty(eCGRecord.getReportId())) {
            z96.a("checkEcgQuality：提交 滤波后的心电数据", eCGRecord.getClientDataId());
            return mnc.N(eCGRecord, obj, obj2).Q(new d08() { // from class: com.oplus.aiunit.vision.cd6
                @Override // com.oplus.aiunit.vision.d08
                public final Object apply(Object obj3) {
                    return EcgHelper.D(eCGRecord, obj, obj2, (SubmitEcgDataBean) obj3);
                }
            }).v0();
        }
        if (eCGRecord.getExpertState() == 2) {
            z96.a("checkEcgQuality：之前已经检查心电数据正常 未提交");
            return lbd.h0(new SubmitEcgDataBean().setEcgDataOk());
        }
        z96.a("checkEcgQuality：没收到心电数据检测质量结果  直接轮训查询结果");
        return mnc.E(rg7.k(mnc.REPORT_ID, eCGRecord.getReportId())).J(new o14() { // from class: com.oplus.aiunit.vision.dd6
            @Override // com.oplus.aiunit.vision.o14
            public final void accept(Object obj3) throws Throwable {
                EcgHelper.E(eCGRecord, (SubmitEcgDataBean) obj3);
            }
        }).D0(new d08() { // from class: com.oplus.aiunit.vision.ed6
            @Override // com.oplus.aiunit.vision.d08
            public final Object apply(Object obj3) {
                return EcgHelper.H(eCGRecord, (lbd) obj3);
            }
        }).v0();
    }

    public static void q(ccd<Boolean> ccdVar) {
        Activity activityI = rg7.i();
        AlertDialog alertDialogShow = new COUISecurityAlertDialogBuilder(activityI).k0(false).l0(true).m0(R.string.cancel).p0(rg7.e(com.heytap.health.base.R$string.lib_base_dialog_confirm)).o0(new b(ccdVar)).j0(activityI.getString(R$string.ecg_service_statement_agree)).q0(true).setTitle(activityI.getString(R$string.ecg_service_statement)).setMessage(activityI.getString(R$string.ecg_service_statement_detail_v2)).setCancelable(false).show();
        alertDialogShow.setCanceledOnTouchOutside(false);
        TextView textView = (TextView) alertDialogShow.findViewById(R$id.coui_security_alertdialog_statement);
        String str = String.format("《%s》", rg7.e(com.heytap.health.device_settings.R$string.settings_user_agreement));
        String str2 = String.format("《%s》", rg7.e(com.heytap.health.device_settings.R$string.settings_privacy_statement));
        String string = activityI.getString(R$string.ecg_service_statement_click, str, str2);
        int i = R$color.lib_base_action_bar_color;
        SpannableString spannableStringA = afk.a(str, activityI.getColor(i), new zid() { // from class: com.oplus.aiunit.vision.zc6
            @Override // com.oplus.aiunit.vision.zid
            public final void a(CharSequence charSequence) {
                PrivacyContentWebAct.V7(PrivacyContentWebAct.APN_ECG, 0);
            }
        });
        SpannableString spannableStringA2 = afk.a(str2, activityI.getColor(i), new zid() { // from class: com.oplus.aiunit.vision.ad6
            @Override // com.oplus.aiunit.vision.zid
            public final void a(CharSequence charSequence) {
                PrivacyContentWebAct.V7(PrivacyContentWebAct.APN_ECG, 1);
            }
        });
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int iIndexOf = string.indexOf(str);
        spannableStringBuilder.replace(iIndexOf, spannableStringA.length() + iIndexOf, (CharSequence) spannableStringA);
        int iIndexOf2 = string.indexOf(str2);
        spannableStringBuilder.replace(iIndexOf2, str2.length() + iIndexOf2, (CharSequence) spannableStringA2);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
    }

    @SuppressLint({"CheckResult"})
    public static lbd s(final lbd<Throwable> lbdVar) {
        return lbd.w(new bdd() { // from class: com.oplus.aiunit.vision.bd6
            @Override // com.oplus.aiunit.vision.bdd
            public final void a(ccd ccdVar) throws Throwable {
                EcgHelper.O(lbdVar, ccdVar);
            }
        });
    }

    public static String t() {
        return f5177j;
    }

    public static String u() {
        return ilj.e();
    }

    public static v9g v() {
        return v9g.x(oa2.e("EcgHelper"));
    }

    public static String w() {
        return v().E(HLWUSERID, "999998");
    }

    public static void x() {
        y(false);
    }

    public static void y(boolean z) {
    }

    public static boolean z(ECGRecord eCGRecord) {
        String algorithmsAnalyzeResult = eCGRecord.getAlgorithmsAnalyzeResult();
        return !TextUtils.isEmpty(algorithmsAnalyzeResult) && TextUtils.isDigitsOnly(algorithmsAnalyzeResult);
    }

    @Override // com.oplus.aiunit.vision.qv9
    public void doNext() {
        final Activity activityI = rg7.i();
        if (activityI == null) {
            return;
        }
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.yc6
            @Override // java.lang.Runnable
            public final void run() {
                this.i.K(activityI);
            }
        });
    }

    public void r(int i) {
        this.i = i;
        ((qv9) owe.k(qv9.class, this)).doNext();
    }
}
