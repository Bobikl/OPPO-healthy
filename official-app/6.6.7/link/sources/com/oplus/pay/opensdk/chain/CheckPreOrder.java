package com.oplus.pay.opensdk.chain;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oplus.aiunit.vision.axf;
import com.oplus.aiunit.vision.dde;
import com.oplus.aiunit.vision.exf;
import com.oplus.aiunit.vision.itf;
import com.oplus.aiunit.vision.ks2;
import com.oplus.aiunit.vision.nt2;
import com.oplus.aiunit.vision.pce;
import com.oplus.aiunit.vision.sde;
import com.oplus.aiunit.vision.t6h;
import com.oplus.aiunit.vision.ua4;
import com.oplus.aiunit.vision.v3g;
import com.oplus.aiunit.vision.vde;
import com.oplus.aiunit.vision.vgd;
import com.oplus.aiunit.vision.vqk;
import com.oplus.aiunit.vision.yqc;
import com.oplus.pay.opensdk.dialog.LoadingProgress;
import com.oplus.pay.opensdk.eum.PaySdkEnum;
import com.oplus.pay.opensdk.model.CashierType;
import com.oplus.pay.opensdk.model.PayParameters;
import com.oplus.pay.opensdk.model.PreOrderParameters;
import com.oplus.pay.opensdk.model.request.QueryPreOrderRequest;
import com.oplus.pay.opensdk.model.response.PreOrderResponse;
import com.oplus.pay.opensdk.model.response.SuccessResponse;
import com.oplus.pay.opensdk.statistic.model.BizNode;
import com.oplus.pay.opensdk.statistic.model.BizResult;
import com.oplus.pay.opensdk.statistic.model.TransactionProcessStatusCodes;
import com.oplus.pay.opensdk.utils.Resource;
import java.io.IOException;
import java.util.Objects;
import okhttp3.MediaType;
import okhttp3.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class CheckPreOrder implements g {
    public Handler a;
    public Dialog b;

    public class a implements c {
        public final /* synthetic */ PreOrderParameters a;
        public final /* synthetic */ com.oplus.pay.opensdk.chain.a b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ Resource d;
        public final /* synthetic */ g.a e;

        public a(PreOrderParameters preOrderParameters, com.oplus.pay.opensdk.chain.a aVar, Context context, Resource resource, g.a aVar2) {
            this.a = preOrderParameters;
            this.b = aVar;
            this.c = context;
            this.d = resource;
            this.e = aVar2;
        }

        @Override // com.oplus.pay.opensdk.chain.CheckPreOrder.c
        public void a(PreOrderResponse preOrderResponse) {
            PayParameters payParametersB = ua4.b(new PayParameters(), preOrderResponse, this.a);
            CheckPreOrder checkPreOrder = CheckPreOrder.this;
            PreOrderParameters preOrderParameters = this.a;
            checkPreOrder.j(payParametersB, preOrderParameters.inputParameters, preOrderParameters.launchModel);
            com.oplus.pay.opensdk.chain.a aVar = this.b;
            aVar.a(this.c, payParametersB, this.d, aVar, this.e);
            CheckPreOrder.this.a.sendEmptyMessage(1);
        }

        @Override // com.oplus.pay.opensdk.chain.CheckPreOrder.c
        public void onFailed(Exception exc) {
            this.d.updateStatus(PaySdkEnum.CheckPreOrder);
            com.oplus.pay.opensdk.chain.a aVar = this.b;
            aVar.a(this.c, null, this.d, aVar, this.e);
            CheckPreOrder.this.a.sendEmptyMessage(1);
        }
    }

    public class b extends Handler {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Looper looper, Context context) {
            super(looper);
            this.a = context;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            try {
                if (i != 0) {
                    if (i == 1 && CheckPreOrder.this.b != null && CheckPreOrder.this.b.isShowing() && CheckPreOrder.this.g(this.a)) {
                        CheckPreOrder.this.b.dismiss();
                        return;
                    }
                    return;
                }
                if (CheckPreOrder.this.b == null) {
                    CheckPreOrder.this.b = new LoadingProgress(this.a);
                }
                if (CheckPreOrder.this.b.isShowing() || !CheckPreOrder.this.g(this.a)) {
                    return;
                }
                CheckPreOrder.this.b.show();
            } catch (Exception unused) {
            }
        }
    }

    public interface c {
        void a(PreOrderResponse preOrderResponse);

        void onFailed(Exception exc);
    }

    @Override // com.oplus.pay.opensdk.chain.g
    public void a(Context context, PreOrderParameters preOrderParameters, Resource<Intent> resource, com.oplus.pay.opensdk.chain.a aVar, g.a aVar2) {
        pce.b("CheckPreOrder");
        String strM = vde.m(preOrderParameters.inputParameters, dde.TARGET_PACKAGE_NAME);
        String strM2 = vde.m(preOrderParameters.inputParameters, dde.PRE_ORDER_ACTION);
        String strM3 = vde.m(preOrderParameters.inputParameters, dde.TARGET_CASHIER_TYPE);
        String strM4 = vde.m(preOrderParameters.inputParameters, dde.TARGET_CASHIER_LINK_URL);
        if (!TextUtils.isEmpty(preOrderParameters.prePayToken) && CashierType.H5.getValue().equalsIgnoreCase(strM3) && !TextUtils.isEmpty(strM4)) {
            pce.i("CheckPreOrder#h5 not need  preOrderRequest");
            aVar.a(context, preOrderParameters, resource, aVar, aVar2);
            return;
        }
        if (TextUtils.isEmpty(preOrderParameters.prePayToken) || vde.c(context, strM, strM2)) {
            aVar.a(context, preOrderParameters, resource, aVar, aVar2);
            return;
        }
        String str = preOrderParameters.inputParameters;
        String value = BizNode.START_PAY.getValue();
        TransactionProcessStatusCodes transactionProcessStatusCodes = TransactionProcessStatusCodes.CODE_00_000_0004;
        sde.d(str, value, transactionProcessStatusCodes.getStatusCode(), BizResult.WARN.getValue(), transactionProcessStatusCodes.getDesc(), "", "", "");
        QueryPreOrderRequest queryPreOrderRequest = new QueryPreOrderRequest();
        queryPreOrderRequest.prePayToken = preOrderParameters.prePayToken;
        queryPreOrderRequest.sign = t6h.f(queryPreOrderRequest);
        String json = new Gson().toJson(queryPreOrderRequest);
        i(context);
        h(context, vqk.b(context, dde.API_QUERY_PREPAY_INFO, preOrderParameters.mCountryCode, preOrderParameters.userRegisterCountry), json, new a(preOrderParameters, aVar, context, resource, aVar2));
    }

    public final boolean g(Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public final void h(Context context, String str, String str2, final c cVar) {
        vgd vgdVarC = new yqc().c(context, v3g.KEY_PAY, true);
        itf itfVarCreate = itf.create(MediaType.parse("application/json; charset=utf-8"), str2);
        pce.b("mRequestUrl：" + str);
        vgdVarC.a(new Request.Builder().url(str).post(itfVarCreate).build()).g(new nt2() { // from class: com.oplus.pay.opensdk.chain.CheckPreOrder.2
            public void onFailure(ks2 ks2Var, IOException iOException) {
                cVar.onFailed(iOException);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public void onResponse(ks2 ks2Var, axf axfVar) {
                try {
                    exf exfVarG = axfVar.g();
                    Objects.requireNonNull(exfVarG);
                    String strS = exfVarG.s();
                    pce.b("responseStr：" + strS);
                    if (TextUtils.isEmpty(strS)) {
                        cVar.onFailed(new Exception("Response is empty"));
                    } else {
                        SuccessResponse successResponse = (SuccessResponse) new Gson().fromJson(strS, new TypeToken<SuccessResponse<PreOrderResponse>>() { // from class: com.oplus.pay.opensdk.chain.CheckPreOrder.2.1
                        }.getType());
                        Boolean bool = successResponse.success;
                        if (bool == null || !bool.booleanValue()) {
                            cVar.onFailed(new Exception(""));
                        } else {
                            cVar.a((PreOrderResponse) successResponse.data);
                        }
                    }
                } catch (Exception e) {
                    cVar.onFailed(e);
                }
            }
        });
    }

    public final void i(Context context) {
        if (this.a == null) {
            this.a = new b(Looper.getMainLooper(), context);
        }
        this.a.sendEmptyMessage(0);
    }

    public final void j(PayParameters payParameters, String str, String str2) {
        try {
            payParameters.launchModel = str2;
            String strM = vde.m(str, dde.NON_PRE_ORDER_ACTION);
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put(dde.TARGET_ACTION, strM);
            payParameters.inputParameters = jSONObject.toString();
        } catch (JSONException e) {
            pce.c("updateTargetAction:" + e.getMessage());
        }
    }
}
