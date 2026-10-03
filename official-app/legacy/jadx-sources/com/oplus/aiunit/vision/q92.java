package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.wallet.business.bus.bean.TrafficCardInfo;

/* JADX INFO: loaded from: classes19.dex */
public class q92 implements ia2<TrafficCardInfo> {
    public int a;
    public ia2<String> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ia2<String> f15680c;
    public String d;

    public q92(String str, int i, ia2<String> ia2Var) {
        this.d = str;
        this.a = i;
        this.b = ia2Var;
    }

    public static TrafficCardInfo d(String str, String str2, String str3) {
        if (str3.length() <= 56) {
            return null;
        }
        String strSubstring = str3.substring(0, 16);
        String strSubstring2 = str3.substring(40, 48);
        String strSubstring3 = str3.substring(48, 56);
        TrafficCardInfo trafficCardInfo = new TrafficCardInfo();
        trafficCardInfo.cardNo = str2;
        trafficCardInfo.startDate = strSubstring2;
        trafficCardInfo.endDate = strSubstring3;
        trafficCardInfo.aid = str;
        trafficCardInfo.status = str3.substring(18, 20);
        trafficCardInfo.isInBlackList = false;
        trafficCardInfo.cardIssuerId = strSubstring;
        t6b.e(trafficCardInfo.toString());
        return trafficCardInfo;
    }

    @Override // com.oplus.aiunit.vision.ia2
    public int a() {
        return 2;
    }

    @Override // com.oplus.aiunit.vision.ia2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public TrafficCardInfo b(z92 z92Var) {
        ia2<String> ia2Var;
        ia2<String> ia2Var2;
        v92 v92VarA = z92Var.a(this.a);
        if (v92VarA == null || TextUtils.isEmpty(v92VarA.getResult()) || (ia2Var = this.b) == null) {
            return null;
        }
        TrafficCardInfo trafficCardInfoD = d(this.d, ia2Var.b(z92Var), v92VarA.getResult());
        if (trafficCardInfoD != null && (ia2Var2 = this.f15680c) != null) {
            trafficCardInfoD.endDate = ia2Var2.b(z92Var);
        }
        return trafficCardInfoD;
    }

    public q92 e(ia2<String> ia2Var) {
        this.f15680c = ia2Var;
        return this;
    }
}
