package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public class x26 extends h41 {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(String str, qp9 qp9Var, String str2) {
        if (TextUtils.isEmpty(str)) {
            qp9Var.h(60003, "path is null", null);
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            qp9Var.h(60004, "url is null", null);
            return;
        }
        q7b.j("PreloadDownloadRepository", "download: %s path: %s", str2, str);
        try {
            ar9 ar9VarF = f(str2, null);
            try {
                if (ar9VarF.b()) {
                    m(ar9VarF, str, qp9Var);
                } else {
                    l(ar9VarF, qp9Var);
                }
                ar9VarF.close();
            } catch (Throwable th) {
                if (ar9VarF != null) {
                    try {
                        ar9VarF.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            qp9Var.h(60001, "download file failed", e2);
        }
    }

    public void k(final String str, final String str2, final qp9 qp9Var) {
        lwj.i(new Runnable() { // from class: com.oplus.aiunit.vision.w26
            @Override // java.lang.Runnable
            public final void run() {
                this.i.n(str2, qp9Var, str);
            }
        });
    }

    public final void l(ar9 ar9Var, qp9 qp9Var) {
        String strJ;
        int iStatusCode;
        if (ar9Var == null) {
            iStatusCode = 60000;
            strJ = null;
        } else {
            try {
                strJ = ar9Var.j();
                iStatusCode = ar9Var.statusCode();
            } catch (IOException e2) {
                q7b.f("PreloadDownloadRepository", "download failed!", e2);
                return;
            }
        }
        if (TextUtils.isEmpty(strJ)) {
            strJ = "download file failed";
        }
        q7b.d("PreloadDownloadRepository", strJ);
        qp9Var.h(iStatusCode, strJ, null);
    }

    public final void m(ar9 ar9Var, String str, qp9 qp9Var) {
        File file = new File(str);
        if (o(ar9Var, file)) {
            qp9Var.g(file);
        } else {
            td7.f(file);
            qp9Var.h(60003, "save file failed", null);
        }
    }

    public final boolean o(ar9 ar9Var, File file) {
        try {
            InputStream inputStreamF = ar9Var.f();
            try {
                if (!file.exists() && !file.createNewFile()) {
                    q7b.d("PreloadDownloadRepository", "create file failed");
                }
                if (td7.j(file, inputStreamF)) {
                    if (inputStreamF != null) {
                        inputStreamF.close();
                    }
                    return true;
                }
                if (inputStreamF != null) {
                    inputStreamF.close();
                }
                return false;
            } catch (Throwable th) {
                if (inputStreamF != null) {
                    try {
                        inputStreamF.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            q7b.f("PreloadDownloadRepository", "writeResponseBodyToDisk failed!", e2);
        }
    }
}
