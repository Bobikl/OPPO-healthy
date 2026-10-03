package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.wallet.key.IOneParamCallBack;
import com.heytap.health.wallet.model.db.EntranceCard;
import com.heytap.health.wallet.network.script.params.ScriptRltVo;
import com.heytap.health.wallet.network.script.rsp.ScriptVo;
import com.heytap.health.wallet.router.WatchCardsUpdateService;
import com.heytap.health.wallet.service.model.BeginTransactionRsp;
import com.heytap.health.wallet.service.model.LoginResult;
import com.heytap.health.wallet.service.model.QueryDeviceInfo;
import com.heytap.health.wallet.service.model.QuerySeidModel;
import com.heytap.health.wallet.service.model.QuerySupportNfc;
import com.heytap.health.wallet.service.model.ResultData;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.store.base.core.util.DeviceInfoUtil;
import com.heytap.wallet.business.common.constant.ReturnCode;
import com.heytap.wallet.business.usecases.ReportCardsUC;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes18.dex */
public class mr0 extends i3 {
    public dld b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nr0 f14162c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f14163e;
    public String f;
    public int g;

    public class a implements dld.e {
        public final /* synthetic */ ResultData a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f14164c;
        public final /* synthetic */ CountDownLatch d;

        public a(ResultData resultData, String str, Map map, CountDownLatch countDownLatch) {
            this.a = resultData;
            this.b = str;
            this.f14164c = map;
            this.d = countDownLatch;
        }

        @Override // com.oplus.aiunit.vision.dld.e
        public void a(String str, String str2) {
            mr0.this.M(this.b, (String) this.f14164c.get("aid"));
            mr0.this.f = null;
            try {
                this.a.setResultCode(Integer.valueOf(str).intValue());
                this.a.setResultMsg(str2);
            } catch (Exception unused) {
                this.a.setResultCode(ReturnCode.OPEN_CARD_COMMAND_FAILED);
                this.a.setResultMsg(str2);
                t6b.i("BYDOperateCard", "onExecute onFailed,errorCode=" + str + ",errorMsg=" + str2);
            }
            this.d.countDown();
            t6b.i("BYDOperateCard", "onExecute onFailed,errorCode=" + str + ",errorMsg=" + str2);
        }

        @Override // com.oplus.aiunit.vision.dld.e
        public void b(String str, String str2) {
            if ("success".equals(str)) {
                this.a.setResultMsg("success");
                this.a.setResultCode(0);
            } else {
                mr0.this.M(this.b, (String) this.f14164c.get("aid"));
                this.a.setResultCode(ReturnCode.OPEN_CARD_COMMAND_FAILED);
                this.a.setResultMsg("type is error");
                mr0.this.f = null;
            }
            this.d.countDown();
            t6b.i("BYDOperateCard", "onExecute onSuccess");
        }
    }

    public class b implements dld.e {
        public final /* synthetic */ ResultData a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f14166c;
        public final /* synthetic */ CountDownLatch d;

        public b(ResultData resultData, String str, Map map, CountDownLatch countDownLatch) {
            this.a = resultData;
            this.b = str;
            this.f14166c = map;
            this.d = countDownLatch;
        }

        @Override // com.oplus.aiunit.vision.dld.e
        public void a(String str, String str2) {
            t6b.i(nr0.TAG, "onExecute end,code=" + str + ",msg=" + str2);
            mr0.this.M(this.b, (String) this.f14166c.get("aid"));
            mr0.this.f = null;
            try {
                this.a.setResultCode(Integer.valueOf(str).intValue());
                this.a.setResultMsg(str2);
            } catch (Exception e2) {
                this.a.setResultCode(ReturnCode.OPEN_CARD_COMMAND_FAILED);
                this.a.setResultMsg(str2);
                t6b.i("BYDOperateCard", "executeCommandFromOutSide e = " + e2.getMessage());
            }
            this.d.countDown();
        }

        @Override // com.oplus.aiunit.vision.dld.e
        public void b(String str, String str2) {
            if ("success".equals(str)) {
                this.a.setResultMsg("success");
                this.a.setResultCode(0);
            } else if (dld.CONTINUE.equals(str)) {
                mr0.this.f = null;
                this.a.setResultMsg(dld.CONTINUE);
                this.a.setResultCode(0);
                this.a.setData(str2);
            } else {
                mr0.this.M(this.b, (String) this.f14166c.get("aid"));
                mr0.this.f = null;
                this.a.setResultCode(ReturnCode.OPEN_CARD_COMMAND_FAILED);
                this.a.setResultMsg("type is error");
            }
            this.d.countDown();
        }
    }

    public class c implements dld.e {
        public final /* synthetic */ dld.e a;
        public final /* synthetic */ ScriptVo b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f14168c;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f14169e;
        public final /* synthetic */ String f;

        public c(dld.e eVar, ScriptVo scriptVo, Map map, String str, String str2, String str3) {
            this.a = eVar;
            this.b = scriptVo;
            this.f14168c = map;
            this.d = str;
            this.f14169e = str2;
            this.f = str3;
        }

        @Override // com.oplus.aiunit.vision.dld.e
        public void a(String str, String str2) {
            if (!String.valueOf(ReturnCode.OPEN_CARD_RETRY_CURRENT).equals(str)) {
                this.a.a(str, str2);
                return;
            }
            if (mr0.this.g <= 0) {
                this.a.a(String.valueOf(ReturnCode.WALLET_SYS_ERROR), "resultMsg is error");
                return;
            }
            mr0.this.g--;
            ResultData resultDataD = mr0.this.f14162c.d(this.f14169e, this.f14168c, this.d);
            if (resultDataD.getResultCode() != 0) {
                this.a.a(String.valueOf(ReturnCode.WALLET_SYS_ERROR), "resultMsg is error");
            } else {
                mr0.this.B(this.f14169e, (ScriptVo) GsonUtil.a(resultDataD.getData(), ScriptVo.class), this.f14168c, this.f, this.a, this.d);
            }
        }

        @Override // com.oplus.aiunit.vision.dld.e
        public void b(String str, String str2) {
            if ("success".equals(str)) {
                this.a.b(str, "");
                return;
            }
            if (!dld.CONTINUE.equals(str)) {
                this.a.a(String.valueOf(ReturnCode.WALLET_SYS_ERROR), "resultMsg is error");
                return;
            }
            ScriptRltVo scriptRltVo = (ScriptRltVo) GsonUtil.a(str2, ScriptRltVo.class);
            ResultData resultDataE = mr0.this.f14162c.e(this.f14168c, this.b.getNextStep(), this.b.getSession(), scriptRltVo, this.d);
            mr0.this.g = 3;
            if (resultDataE.getResultCode() != 0) {
                this.a.a(String.valueOf(ReturnCode.WALLET_SYS_ERROR), "resultMsg is error");
            } else {
                mr0.this.B(this.f14169e, (ScriptVo) GsonUtil.a(resultDataE.getData(), ScriptVo.class), this.f14168c, this.f, this.a, this.d);
            }
        }
    }

    public class d implements dld.e {
        public final /* synthetic */ dld.e a;

        public d(dld.e eVar) {
            this.a = eVar;
        }

        @Override // com.oplus.aiunit.vision.dld.e
        public void a(String str, String str2) {
            this.a.a(str, str2);
        }

        @Override // com.oplus.aiunit.vision.dld.e
        public void b(String str, String str2) {
            if ("success".equals(str)) {
                this.a.b(str, "");
            } else if (dld.CONTINUE.equals(str)) {
                this.a.b(str, str2);
            } else {
                this.a.a(String.valueOf(ReturnCode.WALLET_SYS_ERROR), "resultMsg is error");
            }
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f14170j;

        public e(int i, String str) {
            this.i = i;
            this.f14170j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ydc.n().v(this.i, this.f14170j);
        }
    }

    public class f implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f14171j;

        public f(int i, String str) {
            this.i = i;
            this.f14171j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ydc.n().v(this.i, this.f14171j);
        }
    }

    public class g implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f14172j;

        public g(int i, String str) {
            this.i = i;
            this.f14172j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ydc.n().v(this.i, this.f14172j);
        }
    }

    public mr0(Context context) {
        super(context);
        this.g = 3;
        this.b = new dld(context);
        this.f14162c = new nr0(context);
    }

    public final void A(String str, String str2, Map<String, String> map, String str3, CountDownLatch countDownLatch, ResultData resultData) {
        ResultData resultDataD = this.f14162c.d(str, map, str2);
        if (resultDataD.getResultCode() == 0) {
            this.g = 3;
            B(str, (ScriptVo) GsonUtil.a(resultDataD.getData(), ScriptVo.class), map, str3, new a(resultData, str2, map, countDownLatch), str2);
        } else {
            this.f = null;
            resultData.setResultCode(resultDataD.getResultCode());
            resultData.setResultMsg(resultDataD.getResultMsg());
            countDownLatch.countDown();
        }
    }

    public final void B(String str, ScriptVo scriptVo, Map<String, String> map, String str2, dld.e eVar, String str3) {
        this.b.i(scriptVo, str2, new c(eVar, scriptVo, map, str3, str, str2), null, str3);
    }

    public final void C() {
        ((WatchCardsUpdateService) x0.d().b("/main/watchCardsUpdate").navigation()).n0();
    }

    public final String D() {
        t6b.i("Wallet_MainActivity", "getSeID start");
        return e1j.a(aec.i());
    }

    public final int E() {
        return 1;
    }

    public final void F(String str) {
        if (!y6l.a(gl4.managerApi.getCurrentConnectId()).v()) {
            t6b.b("BYDOperateCard", "noticeSysDeleteNfcAddCard not support");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("from", "wear");
        fkj.d().g(b78.a(), "5", str, "delete", bundle);
    }

    public final void G(String str) {
        if (!y6l.a(gl4.managerApi.getCurrentConnectId()).v()) {
            t6b.b("BYDOperateCard", "noticeSysNfcAddCard not support");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("from", "wear");
        fkj.d().g(b78.a(), "9", str, "add", bundle);
    }

    public final ResultData H(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        ResultData resultData = new ResultData();
        try {
            return this.f14162c.c(i, str, str2, str3, Long.valueOf(str4).longValue(), str5, str7);
        } catch (Exception e2) {
            t6b.i("BYDOperateCard", "notify e = " + e2.getMessage());
            return resultData;
        }
    }

    public final String I(Map<String, String> map) {
        String str = map.get("aid");
        String str2 = map.get("packageName");
        String str3 = map.get("timestamp");
        String str4 = map.get(dld.TRANSACTION_ID);
        String str5 = map.get("signData");
        String strB = this.f14162c.b();
        String str6 = map.get("carExtraInfo");
        String str7 = map.get("type");
        if (!"OPEN_SUC".equals(str7)) {
            ResultData resultDataH = H(2, str, str2, strB, str3, str5, str4, str6);
            t6b.i(nr0.TAG, "onComplete type=" + this.f + ",type=" + str7);
            return moa.g(resultDataH);
        }
        v(str);
        ResultData resultDataH2 = H(1, str, str2, strB, str3, str5, str4, str6);
        u();
        t6b.i(nr0.TAG, "onComplete type=" + this.f + ",type=" + str7);
        return moa.g(resultDataH2);
    }

    public final void J() {
        Handler handler = this.f14163e;
        if (handler != null) {
            handler.postDelayed(this.b.f10615e, 20000L);
        }
    }

    public final void K() {
        if (this.f14163e == null) {
            this.f14163e = sr0.a();
        }
        this.f14163e.removeCallbacks(this.b.f10615e);
    }

    public final void L(String str) {
        t6b.b("BYDOperateCard", "send restockCard aid = " + str);
        ((WatchCardsUpdateService) x0.d().b("/main/watchCardsUpdate").navigation()).Ia(str);
    }

    public final void M(String str, String str2) {
        t6b.b("BYDOperateCard", "sendEvent sendEndFailEvent transactionType =" + str + "aid =" + str2);
        int i = 3;
        if (!"OPEN_SUC".equals(str) && "DELETE_SUC".equals(str)) {
            i = 12;
        }
        t6b.b("BYDOperateCard", "sendEvent sendEndFailEvent =" + i + "aid =" + str2);
        new qv8(new g(i, str2)).start();
    }

    public final void N(String str) {
        t6b.b("BYDOperateCard", "send car Image aid = " + str);
        ((WatchCardsUpdateService) x0.d().b("/main/watchCardsUpdate").navigation()).j7(str);
    }

    public final void O(String str, String str2) {
        t6b.b("BYDOperateCard", "sendEvent sendStartEvent transactionType =" + str + "aid =" + str2);
        int i = (str.equalsIgnoreCase("1005") || str.equalsIgnoreCase("1004")) ? 10 : 1;
        t6b.b("BYDOperateCard", "sendEvent sendStartEvent =" + i + "aid =" + str2);
        new qv8(new e(i, str2)).start();
    }

    public final void P(String str, String str2) {
        t6b.b("BYDOperateCard", "sendEvent sendSucEndEvent transactionType =" + str + "aid =" + str2);
        int i = 2;
        if (!"1003".equals(str) && !"1006".equals(str) && !"1007".equals(str) && ("1004".equals(str) || "1005".equals(str) || "1008".equals(str))) {
            i = 11;
        }
        new x8f(str).a(str2);
        t6b.b("BYDOperateCard", "sendEvent sendEndEvent =" + i + "aid =" + str2);
        new qv8(new f(i, str2)).start();
    }

    @Override // com.oplus.aiunit.vision.i3
    public String h(Map<String, String> map) {
        t6b.b("BYDOperateCard", "onComplete start");
        new ReportCardsUC().f();
        map.get(dld.TRANSACTION_ID);
        K();
        ResultData resultData = new ResultData();
        String str = map.get("aid");
        String str2 = map.get("packageName");
        String str3 = map.get("timestamp");
        String str4 = map.get(dld.TRANSACTION_ID);
        String str5 = map.get("signData");
        String strB = this.f14162c.b();
        String str6 = map.get("carExtraInfo");
        String str7 = map.get("type");
        t6b.b("BYDOperateCard", "onComplete type = " + str7);
        if ("OPEN_SUC".equals(str7) || "DELETE_SUC".equals(str7)) {
            return I(map);
        }
        if (TextUtils.isEmpty(this.d) || !this.d.equals(str4)) {
            resultData.setResultMsg("transaction id is null");
            resultData.setResultCode(10001);
            J();
            return moa.g(resultData);
        }
        this.b.h(str4);
        J();
        t6b.i(nr0.TAG, "onComplete type=" + this.f);
        if ("1003".equals(this.f) || "1006".equals(this.f) || "1007".equals(this.f)) {
            v(str);
            resultData = H(1, str, str2, strB, str3, str5, str4, str6);
            N(str);
            L(str);
            G(str);
        } else if ("1004".equals(this.f)) {
            w(str);
        } else if ("1005".equals(this.f) || "1008".equals(this.f)) {
            resultData = H(2, str, str2, strB, str3, str5, str4, str6);
        }
        P(this.f, str);
        this.d = null;
        this.f = null;
        return moa.g(resultData);
    }

    @Override // com.oplus.aiunit.vision.i3
    public String i(Map<String, String> map) {
        t6b.i("Wallet_MainActivity", "onExecute start");
        map.get(dld.TRANSACTION_ID);
        K();
        ResultData resultData = new ResultData();
        String str = map.get(dld.TRANSACTION_ID);
        String str2 = map.get("type");
        String str3 = map.get(EngineConstant.WAKEUP_TYPE_COMMAND);
        String str4 = map.get("KEY_TOKEN");
        ScriptVo scriptVo = null;
        try {
            if (!TextUtils.isEmpty(str3)) {
                scriptVo = (ScriptVo) GsonUtil.a(str3, ScriptVo.class);
            }
        } catch (Exception e2) {
            t6b.i("BYDOperateCard", "onExecute e = " + e2.getMessage());
        }
        if (TextUtils.isEmpty(this.d) || !this.d.equals(str)) {
            resultData.setResultMsg("transaction id is null");
            resultData.setResultCode(10001);
            J();
            t6b.i("Wallet_MainActivity", "onExecute end1");
            return moa.g(resultData);
        }
        this.f = str2;
        O(str2, map.get("aid"));
        byte b2 = 1;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        t6b.b(nr0.TAG, "card issue type = " + str2);
        str2.hashCode();
        switch (str2.hashCode()) {
            case 1507424:
                b2 = !str2.equals("1001") ? (byte) -1 : (byte) 0;
                break;
            case 1507425:
            default:
                b2 = -1;
                break;
            case 1507426:
                if (!str2.equals("1003")) {
                    b2 = -1;
                }
                break;
            case 1507427:
                b2 = !str2.equals("1004") ? (byte) -1 : (byte) 2;
                break;
            case 1507428:
                b2 = !str2.equals("1005") ? (byte) -1 : (byte) 3;
                break;
            case 1507429:
                b2 = !str2.equals("1006") ? (byte) -1 : (byte) 4;
                break;
            case 1507430:
                b2 = !str2.equals("1007") ? (byte) -1 : (byte) 5;
                break;
            case 1507431:
                b2 = !str2.equals("1008") ? (byte) -1 : (byte) 6;
                break;
            case 1507432:
                b2 = !str2.equals("1009") ? (byte) -1 : (byte) 7;
                break;
        }
        switch (b2) {
            case 0:
                A(str4, "CREATE_SSD", map, str, countDownLatch, resultData);
                break;
            case 1:
            case 3:
                z(scriptVo, resultData, countDownLatch, map, str, "PERSONALIZATION");
                break;
            case 2:
                A(str4, "DELETE", map, str, countDownLatch, resultData);
                break;
            case 4:
                A(str4, "ISSUER_CARD", map, str, countDownLatch, resultData);
                break;
            case 5:
                A(str4, "ADD_DK", map, str, countDownLatch, resultData);
                break;
            case 6:
                A(str4, "DELETE_DK", map, str, countDownLatch, resultData);
                break;
            case 7:
                z(scriptVo, resultData, countDownLatch, map, str, "QUERY_CARD_LIST");
                break;
        }
        try {
            countDownLatch.await(60000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            t6b.i("BYDOperateCard", "InterruptedException e = " + e3.getMessage());
        }
        J();
        t6b.i("BYDOperateCard", "onExecute end2," + str2);
        return moa.g(resultData);
    }

    @Override // com.oplus.aiunit.vision.i3
    public String j(Map<String, String> map) {
        t6b.i("Wallet_MainActivity", "onInvoke start");
        ResultData resultDataH = this.f14162c.h(map, "invokeFunction");
        if (resultDataH.getResultCode() != 0) {
            return moa.g(resultDataH);
        }
        if ("0".equals(map.get("type"))) {
            resultDataH = this.f14162c.a(map);
        }
        return moa.g(resultDataH);
    }

    @Override // com.oplus.aiunit.vision.i3
    public String k(Map<String, String> map) {
        String str = map.get("type");
        t6b.i("Wallet_MainActivity", "onQuery start,type=" + str);
        ResultData resultDataH = "1001".equals(str) ? this.f14162c.h(map, "querySeId") : this.f14162c.h(map, "onQuery");
        if (resultDataH.getResultCode() != 0) {
            return moa.g(resultDataH);
        }
        ResultData resultData = new ResultData();
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case 1507424:
                if (str.equals("1001")) {
                    b2 = 0;
                }
                break;
            case 1507425:
                if (str.equals("1002")) {
                    b2 = 1;
                }
                break;
            case 1507427:
                if (str.equals("1004")) {
                    b2 = 2;
                }
                break;
        }
        switch (b2) {
            case 0:
                resultData.setData(GsonUtil.e(new QuerySeidModel(D(), aec.i())));
                C();
                break;
            case 1:
                resultData.setData(GsonUtil.e(new QuerySupportNfc(E())));
                break;
            case 2:
                WalletDevInfo walletDevInfoB = yj5.c().b();
                String str2 = d7l.a(gl4.managerApi.getCurrentConnectId()).j6() ? DeviceInfoUtil.BRAND_ONEPLUES : "OPPO";
                t6b.b("BYDOperateCard", "deviceInfo getDeviceName" + walletDevInfoB.getDeviceMarketName() + "model " + walletDevInfoB.g() + "manufacturer = " + str2);
                resultData.setData(GsonUtil.e(new QueryDeviceInfo(walletDevInfoB.getDeviceMarketName(), walletDevInfoB.g(), str2)));
                break;
        }
        return moa.g(resultData);
    }

    @Override // com.oplus.aiunit.vision.i3
    public String l(Map<String, String> map) {
        t6b.i("Wallet_MainActivity", "onQueryLogin start");
        ResultData resultDataH = this.f14162c.h(map, "isLogin");
        if (resultDataH.getResultCode() != 0) {
            return moa.g(resultDataH);
        }
        ResultData resultData = new ResultData();
        LoginResult loginResult = new LoginResult();
        loginResult.setResult(true);
        resultData.setData(GsonUtil.e(loginResult));
        return moa.g(resultData);
    }

    @Override // com.oplus.aiunit.vision.i3
    public void m(Map<String, String> map, IOneParamCallBack iOneParamCallBack) {
    }

    @Override // com.oplus.aiunit.vision.i3
    public String n(Map<String, String> map) {
        t6b.i("Wallet_MainActivity", "onStart start");
        ResultData resultDataH = this.f14162c.h(map, "beginTransaction");
        if (resultDataH.getResultCode() != 0) {
            return moa.g(resultDataH);
        }
        map.get("channelID");
        K();
        ResultData resultDataF = this.f14162c.f(this.b);
        String data = resultDataF.getData();
        this.d = data;
        if (TextUtils.isEmpty(data)) {
            resultDataF.setResultCode(ReturnCode.WALLET_SYS_ERROR);
            resultDataF.setResultMsg("get transactionID is null");
            J();
            return moa.g(resultDataF);
        }
        BeginTransactionRsp beginTransactionRsp = new BeginTransactionRsp();
        beginTransactionRsp.setTransactionID(this.d);
        resultDataF.setData(GsonUtil.e(beginTransactionRsp));
        J();
        return moa.g(resultDataF);
    }

    public void u() {
        ao6 ao6Var = new ao6();
        ao6Var.d(ao6.CREATE_CARD);
        sr6.c().l(ao6Var);
    }

    public final void v(String str) {
        EntranceCard entranceCard = new EntranceCard();
        entranceCard.setAid(str);
        entranceCard.setStatus("SUC");
        fo6.f(entranceCard);
    }

    public final void w(String str) {
        t6b.i("Wallet_MainActivity", "clearKeyData");
        String strU = j7l.u();
        if (TextUtils.isEmpty(strU) || TextUtils.equals(str, strU)) {
            j7l.K("no_activite_aid");
        }
        fo6.d(str);
        F(str);
        x();
    }

    public final void x() {
        ao6 ao6Var = new ao6();
        ao6Var.d(ao6.DELETE_CARD);
        sr6.c().l(ao6Var);
    }

    public final void y(ScriptVo scriptVo, Map<String, String> map, String str, dld.e eVar, String str2) {
        t6b.i("Wallet_MainActivity", "executeApduCommand start");
        ResultData resultDataG = this.f14162c.g(map, scriptVo);
        if (resultDataG.getResultCode() != 0) {
            eVar.a(String.valueOf(resultDataG.getResultCode()), resultDataG.getResultMsg());
        } else {
            this.b.i(scriptVo, str, new d(eVar), null, str2);
        }
    }

    public final void z(ScriptVo scriptVo, ResultData resultData, CountDownLatch countDownLatch, Map<String, String> map, String str, String str2) {
        if (scriptVo != null) {
            this.g = 3;
            y(scriptVo, map, str, new b(resultData, str2, map, countDownLatch), str2);
            return;
        }
        M(str2, map.get("aid"));
        this.f = null;
        resultData.setResultCode(ReturnCode.OPEN_CARD_COMMAND_FAILED);
        resultData.setResultMsg("comman is error");
        countDownLatch.countDown();
    }
}
