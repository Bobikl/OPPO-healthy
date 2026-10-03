package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.omes.srp.sysintegrity.SrpException;
import com.oplus.omes.srp.sysintegrity.core.AttestResponse;
import com.oplus.omes.srp.sysintegrity.util.LogUtil;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/* JADX INFO: loaded from: classes12.dex */
public final class inm {
    public static final Object c_a = new Object();

    public static void a(Context context, AttestResponse attestResponse) {
        synchronized (c_a) {
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("srpsdk-cache", 0);
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStreamOpenFileOutput);
                    try {
                        objectOutputStream.writeObject(attestResponse);
                        objectOutputStream.flush();
                        objectOutputStream.close();
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    } catch (Throwable th) {
                        try {
                            objectOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            } catch (Exception unused) {
                LogUtil.e(SrpException.ERROR_FILE_OUTPUT_EXP);
            }
        }
    }
}
