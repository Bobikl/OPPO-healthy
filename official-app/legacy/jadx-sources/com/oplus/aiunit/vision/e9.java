package com.oplus.aiunit.vision;

import android.content.Context;
import com.heytap.log.INetAvailable;
import com.heytap.log.Nogger;
import com.heytap.log.Settings;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes19.dex */
public class e9 {

    public class a implements Settings.IOpenIdProvider {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.heytap.log.Settings.IOpenIdProvider
        public String getDuid() {
            return ye.b(this.a).a();
        }

        @Override // com.heytap.log.Settings.IOpenIdProvider
        public String getGuid() {
            return "";
        }

        @Override // com.heytap.log.Settings.IOpenIdProvider
        public String getOuid() {
            return "";
        }
    }

    public class b implements INetAvailable {
        public b() {
        }

        @Override // com.heytap.log.INetAvailable
        public boolean isNetworkAvailable() {
            return true;
        }
    }

    public class c implements AcLogUtil.b {
        public final /* synthetic */ Nogger a;

        public c(Nogger nogger) {
            this.a = nogger;
        }

        @Override // com.oplus.accountsdk.base.common.util.AcLogUtil.b
        public void d(String str, String str2) {
            this.a.d(str, str2, false);
        }

        @Override // com.oplus.accountsdk.base.common.util.AcLogUtil.b
        public void e(String str, String str2) {
            this.a.e(str, str2, false);
        }

        @Override // com.oplus.accountsdk.base.common.util.AcLogUtil.b
        public void i(String str, String str2) {
            this.a.i(str, str2, false);
        }

        @Override // com.oplus.accountsdk.base.common.util.AcLogUtil.b
        public void w(String str, String str2) {
            this.a.w(str, str2, false);
        }
    }

    public static class d {
        public static final e9 a = new e9(null);
    }

    public /* synthetic */ e9(a aVar) {
        this();
    }

    public static e9 b() {
        return d.a;
    }

    public final void a(Nogger nogger) {
        File[] allLogFiles = nogger.getAllLogFiles();
        ArrayList arrayList = new ArrayList();
        if (allLogFiles == null || allLogFiles.length == 0) {
            return;
        }
        long length = 0;
        for (File file : allLogFiles) {
            if (file != null && file.getName().contains("account_platform")) {
                length += file.length();
                arrayList.add(file);
            }
        }
        if (length > 2.097152E9d) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
    }

    public void c(Context context) {
        try {
            Settings settingsBuild = new Settings.Builder(context, "account_platform", "2070", "y98H3dPTWmbJwbIvvwPjcVLIb9V27kvW", (Settings.ICustomIDProvider) null, new a(context)).consoleLogLevel(6).fileLogLevel(1).setRegion(m8.b()).setDebug(AcLogUtil.getDebugSwitch()).setNetAvailable(new b()).fileExpireDays(7).build();
            Nogger nogger = new Nogger();
            nogger.init(settingsBuild);
            a(nogger);
            AcLogUtil.setLogUploader(new c(nogger));
            AcLogUtil.i("AcHLogHelp", "init HLog finish");
        } catch (Throwable th) {
            AcLogUtil.w("AcHLogHelp", "HLog init fail" + th.getMessage());
        }
    }

    public e9() {
    }
}
