package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes16.dex */
public class opf extends r81 {
    public opf(String str, String str2) {
        super(str, str2);
    }

    @Override // com.oplus.aiunit.vision.r81
    public void b() {
        v9g.w().U(this.a, v9g.w().E(this.a, "").replace(this.b.concat("/"), ""));
    }

    @Override // com.oplus.aiunit.vision.r81
    public boolean c(boolean z) {
        if (this.f16119c != z) {
            this.f16119c = z;
            String strE = v9g.w().E(this.a, "");
            v9g.w().U(this.a, z ? strE.concat(this.b).concat("/") : strE.replace(this.b.concat("/"), ""));
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("updateShow with same state with tag: ");
        sb.append(this.a);
        return false;
    }
}
