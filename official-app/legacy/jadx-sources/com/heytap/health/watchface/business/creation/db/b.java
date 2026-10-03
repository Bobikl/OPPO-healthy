package com.heytap.health.watchface.business.creation.db;

import android.content.Context;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ltl;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public class b {
    public static boolean a(Throwable th) {
        String message = th.getMessage();
        ltl.d("DbFileUtil", "[checkAndDeleteDbFile] msg=" + message);
        if (message == null || !message.contains("file is not a database: , while compiling:")) {
            return false;
        }
        c(b78.a());
        CreationDatabase.d();
        return true;
    }

    public static void b(Context context, String str) {
        File databasePath = context.getDatabasePath(str);
        if (databasePath == null || !databasePath.exists()) {
            return;
        }
        ltl.d("DbFileUtil", "[deleteDbFile]  delete " + databasePath.delete());
    }

    public static void c(Context context) {
        b(context, CreationDatabase.ENCRYPTED_DATABASE_NAME);
    }
}
