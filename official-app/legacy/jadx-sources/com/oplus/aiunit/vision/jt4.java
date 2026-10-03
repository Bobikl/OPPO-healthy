package com.oplus.aiunit.vision;

import com.heytap.sporthealth.fit.R$string;
import com.heytap.sporthealth.fit.data.DialogConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class jt4 {
    public static int[] c() {
        return new int[]{R$string.fit_dialog_device_linkage_title, R$string.fit_diaolg_device_linkage_message};
    }

    public static /* synthetic */ void d(DialogConfig dialogConfig) throws Throwable {
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(rg7.h().getCacheDir().getAbsolutePath() + File.separator + "dialogConfig"));
            try {
                objectOutputStream2.writeObject(dialogConfig);
                objectOutputStream2.close();
                sqk.j(objectOutputStream2);
            } catch (IOException unused) {
                objectOutputStream = objectOutputStream2;
                if (objectOutputStream != null) {
                    sqk.j(objectOutputStream);
                }
            } catch (Throwable th) {
                th = th;
                objectOutputStream = objectOutputStream2;
                if (objectOutputStream != null) {
                    sqk.j(objectOutputStream);
                }
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static /* synthetic */ void e(String str, boolean z) throws Throwable {
        ObjectInputStream objectInputStream = null;
        try {
            ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(rg7.h().getCacheDir().getAbsolutePath() + File.separator + "dialogConfig"));
            try {
                DialogConfig dialogConfig = (DialogConfig) objectInputStream2.readObject();
                if (dialogConfig == null) {
                    dialogConfig = new DialogConfig();
                }
                if (str.equals("DIALOG_MOBILE_CHECK")) {
                    dialogConfig.mobileCheck = z;
                } else if (str.equals("DIALOG_LINKAGE_WATCH_TIP")) {
                    dialogConfig.watchConnectTip = z;
                }
                h(dialogConfig);
                sqk.j(objectInputStream2);
            } catch (Exception unused) {
                objectInputStream = objectInputStream2;
                if (objectInputStream != null) {
                    sqk.j(objectInputStream);
                }
            } catch (Throwable th) {
                th = th;
                objectInputStream = objectInputStream2;
                if (objectInputStream != null) {
                    sqk.j(objectInputStream);
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean f(String str, boolean z) throws Throwable {
        DialogConfig dialogConfig;
        ObjectInputStream objectInputStream = null;
        try {
            ObjectInputStream objectInputStream2 = new ObjectInputStream(new FileInputStream(rg7.h().getCacheDir().getAbsolutePath() + File.separator + "dialogConfig"));
            try {
                try {
                    dialogConfig = (DialogConfig) objectInputStream2.readObject();
                    try {
                        yg7.a("readDialogConfig：", dialogConfig);
                        sqk.j(objectInputStream2);
                    } catch (Exception unused) {
                        objectInputStream = objectInputStream2;
                        if (objectInputStream != null) {
                            sqk.j(objectInputStream);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    objectInputStream = objectInputStream2;
                    if (objectInputStream != null) {
                        sqk.j(objectInputStream);
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                dialogConfig = null;
            }
        } catch (Exception unused3) {
            dialogConfig = null;
        } catch (Throwable th2) {
            th = th2;
        }
        if (dialogConfig == null) {
            return z;
        }
        if (str.equals("DIALOG_MOBILE_CHECK")) {
            return dialogConfig.mobileCheck;
        }
        return str.equals("DIALOG_LINKAGE_WATCH_TIP") ? dialogConfig.watchConnectTip : z;
    }

    public static void g() {
        h(new DialogConfig());
        yg7.a("resetDialogConfig：");
    }

    public static void h(final DialogConfig dialogConfig) {
        new qv8(new Runnable() { // from class: com.oplus.aiunit.vision.ht4
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                jt4.d(dialogConfig);
            }
        }).start();
    }

    public static void i(final String str, final boolean z) {
        new qv8(new Runnable() { // from class: com.oplus.aiunit.vision.it4
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                jt4.e(str, z);
            }
        }).start();
    }
}
