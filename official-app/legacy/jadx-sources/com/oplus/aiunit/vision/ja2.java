package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.wallet.business.bus.bean.NfcConsumeRecord;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes19.dex */
public class ja2 implements ia2<ArrayList<NfcConsumeRecord>> {
    public static final int MAX_GROUP = 3;
    public static final int UNINIT_INT = -1;
    public int a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12815c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12816e;
    public int f;
    public int[] g = {1400, -1, -1};
    public int[] h = {10, -1, -1};

    public ja2(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i2 <= 0) {
            this.b = 1;
        }
    }

    @Override // com.oplus.aiunit.vision.ia2
    public int a() {
        return 3;
    }

    public NfcConsumeRecord c(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 46) {
            return null;
        }
        NfcConsumeRecord nfcConsumeRecord = new NfcConsumeRecord();
        nfcConsumeRecord.serialNumber = str.substring(0, 4);
        nfcConsumeRecord.creditLine = Integer.valueOf(e1j.f(e1j.e(str.substring(4, 10))));
        nfcConsumeRecord.amount = e1j.f(e1j.e(str.substring(10, 18)));
        nfcConsumeRecord.transeType = str.substring(18, 20);
        nfcConsumeRecord.terminalCode = str.substring(20, 32);
        nfcConsumeRecord.transTime = str.substring(32, 46);
        return nfcConsumeRecord;
    }

    public void d(z92 z92Var, int i, int i2, ArrayList<NfcConsumeRecord> arrayList) {
        NfcConsumeRecord nfcConsumeRecordC;
        if (drk.e(z92Var.getCommands())) {
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            v92 v92VarA = z92Var.a(i + i3);
            if (v92VarA != null && !TextUtils.isEmpty(v92VarA.getResult())) {
                t6b.b("RecordParser", v92VarA.getResult());
                if (!Pattern.matches("0{46}9000", v92VarA.getResult()) && (nfcConsumeRecordC = c(v92VarA.getResult())) != null) {
                    arrayList.add(nfcConsumeRecordC);
                }
            }
        }
    }

    @Override // com.oplus.aiunit.vision.ia2
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ArrayList<NfcConsumeRecord> b(z92 z92Var) {
        int i;
        int i2;
        ArrayList<NfcConsumeRecord> arrayListA = null;
        if (z92Var == null) {
            return null;
        }
        v92 v92VarA = z92Var.a(this.a);
        if (v92VarA != null && !TextUtils.isEmpty(v92VarA.getResult()) && this.b > 0) {
            arrayListA = h0b.a();
            d(z92Var, this.a, this.b, arrayListA);
            int i3 = this.f12815c;
            if (i3 > 0 && (i2 = this.d) > 0) {
                d(z92Var, i3, i2, arrayListA);
            }
            int i4 = this.f12816e;
            if (i4 > 0 && (i = this.f) > 0) {
                d(z92Var, i4, i, arrayListA);
            }
        }
        return arrayListA;
    }

    public void f(int i) {
        j(1, i);
    }

    public void g(int i) {
        this.f12815c = i;
    }

    public void h(int i) {
        this.d = i;
    }

    public void i(int i) {
        k(1, i);
    }

    public void j(int i, int i2) {
        if (i < 0 || i >= 3) {
            return;
        }
        this.g[i] = i2;
    }

    public void k(int i, int i2) {
        if (i < 0 || i >= 3) {
            return;
        }
        this.h[i] = i2;
    }
}
