package com.omron;

/* JADX INFO: loaded from: classes5.dex */
public class bd implements bc {
    private final bc[] a;

    public bd(bc... bcVarArr) {
        this.a = bcVarArr;
    }

    @Override // com.omron.bc
    public void a(int i, String str, String str2) {
        for (bc bcVar : this.a) {
            bcVar.a(i, str, str2);
        }
    }
}
