package com.oplus.aiunit.vision;

import com.heytap.health.wallet.model.NfcCardDetail;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class yqc extends tjk<List<NfcCardDetail>> {
    public List<NfcCardDetail> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19106c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public tjk.d f19107e;

    public class a implements tjk.d {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.tjk.d
        public void a(Object obj) {
            yqc.this.i();
        }

        @Override // com.oplus.aiunit.vision.tjk.d
        public void b(int i, String str) {
            yqc.this.i();
        }
    }

    public yqc(List<NfcCardDetail> list) {
        this.d = 272;
        this.f19107e = new a();
        this.b = list;
    }

    @Override // com.oplus.aiunit.vision.tjk
    public void c() {
        List<NfcCardDetail> list = this.b;
        if (list == null || list.isEmpty()) {
            f(this.b);
        } else {
            this.f19106c = 0;
            j();
        }
    }

    public final void i() {
        int i = this.f19106c + 1;
        this.f19106c = i;
        if (i >= this.b.size()) {
            f(this.b);
        } else {
            j();
        }
    }

    public final void j() {
        if (this.f19106c < this.b.size()) {
            new brc(this.b.get(this.f19106c), this.d).g(this.f19107e);
        }
    }

    public yqc(List<NfcCardDetail> list, boolean z) {
        this(list);
        this.d = (this.d | (z ? 1 : 0)) == true ? 1 : 0;
    }
}
