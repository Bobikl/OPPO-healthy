package com.heytap.health.wallet.entrance.util;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.wallet.BaseActivity;
import com.heytap.health.wallet.entrance.util.EntranceOperateUtils;
import com.heytap.health.wallet.model.db.EntranceCard;
import com.heytap.health.wallet.network.door.rsp.AvailableDoorCard;
import com.heytap.health.wallet.network.door.rsp.AvailableDoorCardListVo;
import com.heytap.wallet.business.common.util.ExecutorParam;
import com.heytap.wallet.business.entrance.router.EntranceOperateService;
import com.oplus.aiunit.vision.ao6;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.eq;
import com.oplus.aiunit.vision.fkj;
import com.oplus.aiunit.vision.fo6;
import com.oplus.aiunit.vision.hrc;
import com.oplus.aiunit.vision.ie7;
import com.oplus.aiunit.vision.ihg;
import com.oplus.aiunit.vision.lfg;
import com.oplus.aiunit.vision.lid;
import com.oplus.aiunit.vision.s04;
import com.oplus.aiunit.vision.sr6;
import com.oplus.aiunit.vision.suc;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.u85;
import com.oplus.aiunit.vision.zld;
import com.oplus.aiunit.vision.zp;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@Route(path = "/entrance/operateService")
public class EntranceOperateUtils implements EntranceOperateService {
    public static final int DELAY_MS = 500;
    public static final String TAG = "EntranceOperateUtils";

    public class a implements hrc.d {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f6281c;
        public final /* synthetic */ zld d;

        public a(String str, String str2, String str3, zld zldVar) {
            this.a = str;
            this.b = str2;
            this.f6281c = str3;
            this.d = zldVar;
        }

        @Override // com.oplus.aiunit.vision.hrc.d
        public void a(String str, String str2) {
            zld zldVar = this.d;
            if (zldVar != null) {
                zldVar.a(str, str2);
            }
        }

        @Override // com.oplus.aiunit.vision.hrc.d
        public void onSuccess(String str) {
            if ("shiftin".equals(this.a)) {
                EntranceOperateUtils.this.db(this.b, this.f6281c);
            }
            if (this.d != null) {
                this.d.onSuccess(this.b.concat(",").concat(this.f6281c));
            }
        }
    }

    public class b extends ie7<AvailableDoorCardListVo> {
        public final /* synthetic */ zld i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f6283j;
        public final /* synthetic */ BaseActivity k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f6284l;
        public final /* synthetic */ String m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ WeakReference f6285n;

        public b(zld zldVar, String str, BaseActivity baseActivity, String str2, String str3, WeakReference weakReference) {
            this.i = zldVar;
            this.f6283j = str;
            this.k = baseActivity;
            this.f6284l = str2;
            this.m = str3;
            this.f6285n = weakReference;
        }

        @Override // com.oplus.aiunit.vision.ie7
        public void a(@NonNull String str, @NonNull String str2) {
            zld zldVar = this.i;
            if (zldVar != null) {
                zldVar.a(str, str2);
            }
        }

        @Override // com.oplus.aiunit.vision.ie7
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(AvailableDoorCardListVo availableDoorCardListVo) {
            EntranceOperateUtils.this.l3(availableDoorCardListVo, this.i, this.f6283j, this.k, this.f6284l, this.m, this.f6285n);
        }
    }

    public static /* synthetic */ void Q6(WeakReference weakReference, int i) {
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((lid) weakReference.get()).onProgress(i);
    }

    @Override // com.heytap.wallet.business.entrance.router.EntranceOperateService
    public void A2(Activity activity, String str, String str2, String str3) {
        lfg.q(activity, str, str2, "");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x003d A[PHI: r11
  0x003d: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v0 java.lang.String), (r11v2 java.lang.String), (r11v3 java.lang.String) binds: [B:3:0x0004, B:19:0x0032, B:23:0x003b, B:22:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.heytap.wallet.business.entrance.router.EntranceOperateService
    public void B5(Activity activity, String str, String str2, String str3, String str4) {
        String str5;
        if (!TextUtils.isEmpty(str3)) {
            str3.hashCode();
            switch (str3) {
                case "6":
                    str3 = "3";
                    str5 = str3;
                    break;
                case "9":
                    str3 = "5";
                    str5 = str3;
                    break;
                case "11":
                    str5 = "6";
                    break;
                default:
                    str5 = str3;
                    break;
            }
        } else {
            str5 = str3;
        }
        lfg.h(activity, str, str2, "edit", "", str5, str4);
    }

    @Override // com.heytap.wallet.business.entrance.router.EntranceOperateService
    public void D2(Context context, String str, suc<String, Integer, String, Integer, String> sucVar) {
        new zp((Activity) context).n(str, sucVar);
    }

    @Override // com.heytap.wallet.business.entrance.router.EntranceOperateService
    public void N3(Activity activity, String str, String str2, String str3, String str4, String str5) {
        if (!TextUtils.isEmpty(str5)) {
            str5.hashCode();
            switch (str5) {
                case "11":
                    str5 = "6";
                    break;
                case "15":
                    str5 = "7";
                    break;
                case "20":
                    str5 = s04.VIA_SHARE_TYPE_PUBLISHVIDEO;
                    break;
            }
        }
        lfg.k(activity, str, str2, str3, str4, "edit", "", str5);
    }

    @Override // com.heytap.wallet.business.entrance.router.EntranceOperateService
    public void Q0(Activity activity, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str3)) {
            str3.hashCode();
            if (str3.equals("6")) {
                str3 = "3";
            } else if (str3.equals("9")) {
                str3 = "5";
            }
        }
        lfg.g(activity, str, str2, "edit", "", str3);
    }

    @Override // com.heytap.wallet.business.entrance.router.EntranceOperateService
    public void c0(Context context, String str) {
        ihg.a().b(context, "/entrance/carBrandList");
    }

    @Override // com.heytap.wallet.business.entrance.router.EntranceOperateService
    public void c5(String str, String str2, BaseActivity baseActivity, String str3, String str4, String str5, String str6, zld zldVar, WeakReference<lid> weakReference) {
        new eq(baseActivity).d(str, new b(zldVar, str2, baseActivity, str3, str6, weakReference));
    }

    public final void db(String str, String str2) {
        EntranceCard entranceCard = new EntranceCard();
        entranceCard.setAppCode(str2);
        entranceCard.setAid(str);
        entranceCard.setStatus("SUC");
        fo6.f(entranceCard);
        ao6 ao6Var = new ao6();
        ao6Var.d(ao6.CREATE_CARD);
        sr6.c().l(ao6Var);
    }

    @Override // com.heytap.wallet.business.entrance.router.EntranceOperateService
    public boolean e5() {
        return fkj.d().c(b78.a());
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    public final void l3(AvailableDoorCardListVo availableDoorCardListVo, zld zldVar, String str, BaseActivity baseActivity, String str2, String str3, WeakReference<lid> weakReference) {
        if (availableDoorCardListVo == null) {
            t6b.i(TAG, "recoverEntranceCard getCardList null");
            if (zldVar != null) {
                zldVar.a("errCode", " data is null");
                return;
            }
            return;
        }
        List<AvailableDoorCard> availableCardList = availableDoorCardListVo.getAvailableCardList();
        if (availableCardList != null && availableCardList.size() > 0 && availableCardList.get(0) != null) {
            q6(availableCardList.get(0).getAid(), str, baseActivity, str2, availableCardList.get(0).getAppCode(), "shiftin", str3, zldVar, weakReference);
        } else if (zldVar != null) {
            zldVar.a("errCode", " data is empty");
        }
    }

    @Override // com.heytap.wallet.business.entrance.router.EntranceOperateService
    public void n5(Context context, String str) {
        ihg.a().b(context, "/entrance/index");
    }

    public void q6(String str, String str2, BaseActivity baseActivity, String str3, String str4, String str5, String str6, zld zldVar, final WeakReference<lid> weakReference) {
        hrc hrcVar = new hrc(str3);
        ExecutorParam executorParam = new ExecutorParam();
        executorParam.appCode = str4;
        executorParam.orderNo = str6;
        executorParam.commandType = str5;
        executorParam.strExtraInfo = hrc.e("qrCodeVoucher", str2).toString();
        hrcVar.f(executorParam, new a(str5, str, str4, zldVar), new hrc.e() { // from class: com.oplus.aiunit.vision.ho6
            @Override // com.oplus.aiunit.vision.hrc.e
            public final void onProgress(int i) {
                EntranceOperateUtils.Q6(weakReference, i);
            }
        });
    }

    @Override // com.heytap.wallet.business.entrance.router.EntranceOperateService
    public void v7(Context context, String str, Map<String, Object> map, String str2) {
        new u85().d(context, str, map, str2);
    }
}
