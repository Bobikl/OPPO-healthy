package com.oplus.aiunit.vision;

import com.heytap.health.wallet.model.NfcCardDetail;

/* JADX INFO: loaded from: classes19.dex */
public class brc extends tjk<NfcCardDetail> {
    public NfcCardDetail b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9827c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9828e;

    public class a implements tjk.d<Integer> {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.tjk.d
        public void b(int i, String str) {
            brc.this.d++;
            brc.this.n();
        }

        @Override // com.oplus.aiunit.vision.tjk.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Integer num) {
            if (num != null && num.intValue() >= -999900 && num.intValue() <= 999900) {
                brc.this.b.setBalance(num.intValue());
                brc.this.f9827c = true;
                if ((brc.this.f9828e & 1) > 0) {
                    o6l.z(brc.this.b);
                }
            }
            brc.this.d++;
            brc.this.n();
        }
    }

    public brc(NfcCardDetail nfcCardDetail) {
        this.d = 0;
        this.f9828e = 272;
        this.b = nfcCardDetail;
    }

    @Override // com.oplus.aiunit.vision.tjk
    public void c() {
        NfcCardDetail nfcCardDetail = this.b;
        if (nfcCardDetail == null) {
            f(nfcCardDetail);
            return;
        }
        NfcCardDetail nfcCardDetailW = o6l.w(nfcCardDetail.getAid());
        t6b.b("DetailUpdater", "onUpdate, dbDetail: " + nfcCardDetailW);
        if (nfcCardDetailW != null) {
            this.b.setBalance(nfcCardDetailW.getBalance());
            this.b.setCardNo(nfcCardDetailW.getCardNo());
        }
        o();
    }

    public final void n() {
        if (this.d >= 1) {
            if (this.f9827c) {
                f(this.b);
            } else {
                d(10000, "b&id both fail");
            }
        }
    }

    public final void o() {
        if ((this.f9828e & 16) != 0) {
            new wqc(this.b.getAid()).g(new a());
        } else {
            this.d++;
            n();
        }
    }

    public brc(NfcCardDetail nfcCardDetail, int i) {
        this(nfcCardDetail);
        this.f9828e = i;
    }
}
