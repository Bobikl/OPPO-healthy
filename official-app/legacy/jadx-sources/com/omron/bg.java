package com.omron;

import android.support.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
public class bg implements bc, bf.a {
    private final bi a = new bi();
    private volatile bf b = new bf(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ba f8840c;

    public bg(@NonNull ba baVar) {
        this.f8840c = baVar;
        bl.a(baVar.a());
    }

    private String a() {
        return bm.a(System.currentTimeMillis(), bm.a()) + ".txt";
    }

    private CharSequence b(long j2, int i, String str, String str2) {
        return bm.a(j2) + ':' + bb.a(i) + ':' + str + bk.a() + str2;
    }

    private void a(int i, String str) {
        File[] fileArrListFiles = new File(str).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f8840c.b(file)) {
                ay.a("过期文件删除:（" + bb.a(i) + "）:" + file.getName() + ";结果:" + file.delete());
            }
        }
    }

    @Override // com.omron.bc
    public void a(int i, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.b.a()) {
            this.b.b();
        }
        this.b.a(new be(jCurrentTimeMillis, str, i, str2));
    }

    private void a(long j2, int i, String str, String str2) {
        String strD = this.a.d();
        boolean z = !this.a.e();
        String strA = this.f8840c.a(bb.a(i));
        boolean zA = bl.a(strA);
        String strA2 = a();
        if (strA2.trim().length() == 0) {
            return;
        }
        if (i != this.a.b() || !strA2.equals(strD) || z) {
            this.a.a();
            a(i, strA);
            if (!zA) {
                ay.a("文件夹创建失败:" + str2);
            }
            if (!this.a.a(i, new File(strA, strA2))) {
                return;
            } else {
                strD = strA2;
            }
        }
        File fileC = this.a.c();
        if (this.f8840c.a(fileC)) {
            this.a.a();
            a(fileC, strA);
            if (!this.a.a(i, new File(strA, strD))) {
                return;
            }
        }
        this.a.a(b(j2, i, str, str2).toString());
    }

    @Override // com.omron.bf.a
    public void a(be beVar) {
        a(beVar.d(), beVar.a(), beVar.c(), beVar.b());
    }

    private void a(File file, String str) {
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            String str2 = file.getName().replace(".txt", "") + "-" + i + ".txt";
            if (!new File(str, str2).exists()) {
                bl.a(file, str2);
                return;
            }
        }
    }
}
