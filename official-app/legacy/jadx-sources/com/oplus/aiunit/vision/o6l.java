package com.oplus.aiunit.vision;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.heytap.health.wallet.model.NfcCardDetail;
import com.heytap.health.wallet.model.db.DatabaseCard;
import com.heytap.health.wallet.model.response.PayCardInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class o6l {
    public static String a = "W-DB";

    public class a implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f14803j;

        public a(String str, int i) {
            this.i = str;
            this.f14803j = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            o6l.y(this.i, this.f14803j);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f14804j;

        public b(String str, String str2) {
            this.i = str;
            this.f14804j = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            o6l.C(this.i, this.f14804j);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ String i;

        public c(String str) {
            this.i = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            o6l.g(this.i);
        }
    }

    public class d implements Runnable {
        public final /* synthetic */ String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f14805j;
        public final /* synthetic */ String k;

        public d(String str, String str2, String str3) {
            this.i = str;
            this.f14805j = str2;
            this.k = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            o6l.I(aec.o(), this.i, this.f14805j, this.k);
        }
    }

    public static void A(final String str, final int i, l6h<Integer> l6hVar) {
        f5h.e(new o6h() { // from class: com.oplus.aiunit.vision.n6l
            @Override // com.oplus.aiunit.vision.o6h
            public final void a(x5h x5hVar) throws Throwable {
                o6l.q(str, i, x5hVar);
            }
        }).y(su8.c()).b(l6hVar);
    }

    public static void B(String str, int i) {
        sr0.i(new a(str, i));
    }

    public static void C(String str, String str2) {
        String strB = fm6.b(str2);
        if (TextUtils.isEmpty(strB)) {
            t6b.i(a, "There are some trouble on encrypt cardNo when update!");
        } else {
            k6l.c().a().j(aec.o(), str, strB);
        }
    }

    public static void D(String str, String str2) {
        sr0.i(new b(str, str2));
    }

    public static void E(DatabaseCard databaseCard) {
        F(databaseCard, Boolean.TRUE);
    }

    public static void F(DatabaseCard databaseCard, Boolean bool) {
        if (bool.booleanValue()) {
            j(databaseCard);
        }
        k6l.c().a().f(databaseCard);
    }

    public static void G(final String str, final boolean z) {
        sr0.i(new Runnable() { // from class: com.oplus.aiunit.vision.m6l
            @Override // java.lang.Runnable
            public final void run() {
                o6l.r(str, z);
            }
        });
    }

    public static void H(String str, String str2, String str3) {
        sr0.i(new d(str, str2, str3));
    }

    public static void I(String str, String str2, String str3, String str4) {
        k6l.c().a().d(str, str2, str3, str4);
    }

    public static void f(List<PayCardInfo> list, Collection<String> collection) {
        PayCardInfo payCardInfo;
        boolean z;
        List<DatabaseCard> listT = t();
        ArrayList arrayList = list != null ? new ArrayList(list) : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (lza.a(arrayList)) {
            i(collection);
            return;
        }
        int i = 0;
        if (lza.a(listT)) {
            t6b.b(a, "no local cards, insertAllData");
            while (i < arrayList.size()) {
                l((PayCardInfo) arrayList.get(i));
                i++;
            }
            return;
        }
        for (int i2 = 0; i2 < listT.size(); i2++) {
            String aid = listT.get(i2).getAid();
            if (collection.contains(listT.get(i2).getCardType())) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        payCardInfo = null;
                        z = false;
                        break;
                    }
                    payCardInfo = (PayCardInfo) it.next();
                    if (payCardInfo.getBizId() == null) {
                        payCardInfo.setBizId("-1");
                    }
                    if (payCardInfo.getBizId().equals(aid)) {
                        t6b.b(a, "update local data");
                        DatabaseCard databaseCardC = nz4.c(payCardInfo);
                        databaseCardC.setTimestamp(jCurrentTimeMillis - ((long) i2));
                        x(listT.get(i2), databaseCardC);
                        F(databaseCardC, Boolean.FALSE);
                        z = true;
                        break;
                    }
                }
                if (z) {
                    arrayList.remove(payCardInfo);
                } else {
                    g(aid);
                }
            } else {
                DatabaseCard databaseCard = listT.get(i2);
                databaseCard.setTimestamp(jCurrentTimeMillis - ((long) i2));
                E(databaseCard);
            }
        }
        while (i < arrayList.size()) {
            t6b.b(a, "insert some new data");
            DatabaseCard databaseCardC2 = nz4.c((PayCardInfo) arrayList.get(i));
            databaseCardC2.setTimestamp((jCurrentTimeMillis - ((long) listT.size())) - ((long) i));
            E(databaseCardC2);
            i++;
        }
    }

    public static void g(String str) {
        k6l.c().a().h(aec.o(), str);
    }

    public static void h(String str) {
        sr0.i(new c(str));
    }

    public static void i(Collection<String> collection) {
        try {
            k6l.c().a().i(aec.o(), collection);
        } catch (Throwable th) {
            s(th);
        }
    }

    public static void j(DatabaseCard databaseCard) {
        databaseCard.setCardNo(k(databaseCard.getCardNo()));
        if (o(databaseCard.getBalance())) {
            databaseCard.setBalance(k(String.valueOf(databaseCard.getBalance())));
        } else {
            databaseCard.setBalance("");
        }
    }

    @NonNull
    public static String k(String str) {
        return TextUtils.isEmpty(str) ? "" : fm6.b(str);
    }

    public static void l(PayCardInfo payCardInfo) {
        E(nz4.c(payCardInfo));
    }

    public static void m(NfcCardDetail nfcCardDetail) {
        n(nfcCardDetail, true);
    }

    public static void n(NfcCardDetail nfcCardDetail, boolean z) {
        E(nz4.a(nfcCardDetail));
        if (z) {
            sr6.c().l(new qs6(nfcCardDetail));
        }
    }

    public static boolean o(String str) {
        return !TextUtils.isEmpty(str) && !"null".equals(str) && Integer.parseInt(str) >= -999900 && Integer.parseInt(str) <= 999900;
    }

    public static /* synthetic */ void p(String str, x5h x5hVar) throws Throwable {
        NfcCardDetail nfcCardDetailW = w(str);
        if (nfcCardDetailW != null) {
            x5hVar.onSuccess(nfcCardDetailW);
        } else {
            x5hVar.onError(new Throwable());
        }
    }

    public static /* synthetic */ void q(String str, int i, x5h x5hVar) throws Throwable {
        int iY = y(str, i);
        if (iY == 1) {
            x5hVar.onSuccess(Integer.valueOf(iY));
        } else {
            x5hVar.onError(new Throwable());
        }
    }

    public static /* synthetic */ void r(String str, boolean z) {
        k6l.c().a().g(aec.o(), str, z);
    }

    public static void s(Throwable th) {
        t6b.i("DBError", th.getLocalizedMessage());
    }

    public static List<DatabaseCard> t() {
        return k6l.c().a().a(aec.o());
    }

    public static f5h<NfcCardDetail> u(final String str) {
        return f5h.e(new o6h() { // from class: com.oplus.aiunit.vision.l6l
            @Override // com.oplus.aiunit.vision.o6h
            public final void a(x5h x5hVar) throws Throwable {
                o6l.p(str, x5hVar);
            }
        });
    }

    public static DatabaseCard v(String str) {
        DatabaseCard databaseCardB = k6l.c().a().b(aec.o(), str);
        if (databaseCardB != null) {
            databaseCardB.setCardNo(fm6.a(databaseCardB.getCardNo()));
            databaseCardB.setBalance(fm6.a(databaseCardB.getBalance()));
        }
        return databaseCardB;
    }

    public static NfcCardDetail w(String str) {
        DatabaseCard databaseCardV = v(str);
        if (databaseCardV == null) {
            return null;
        }
        NfcCardDetail nfcCardDetail = new NfcCardDetail();
        nfcCardDetail.setAid(databaseCardV.getAid());
        nfcCardDetail.setCardNo(databaseCardV.getCardNo());
        String balance = databaseCardV.getBalance();
        if (o(balance)) {
            nfcCardDetail.setBalance(Integer.parseInt(balance));
        }
        nfcCardDetail.setIsDefault(databaseCardV.isDefault());
        nfcCardDetail.setCardName(databaseCardV.getDisplayName());
        nfcCardDetail.setAppCode(databaseCardV.getAppCode());
        nfcCardDetail.setStatus(databaseCardV.getStatus());
        return nfcCardDetail;
    }

    public static void x(DatabaseCard databaseCard, DatabaseCard databaseCard2) {
        if ("5".equals(databaseCard2.getCardType())) {
            databaseCard2.setBalance(databaseCard.getBalance());
            databaseCard2.setCardNo(databaseCard.getCardNo());
        }
    }

    public static int y(String str, int i) {
        if (!o(String.valueOf(i))) {
            t6b.i(a, "balance invalid when update!");
            return 0;
        }
        String strB = fm6.b(String.valueOf(i));
        if (!TextUtils.isEmpty(strB)) {
            return k6l.c().a().e(aec.o(), str, strB);
        }
        t6b.i(a, "There are some trouble on encrypt balance when update!");
        return i;
    }

    public static void z(NfcCardDetail nfcCardDetail) {
        y(nfcCardDetail.getAid(), nfcCardDetail.getBalance());
    }
}
