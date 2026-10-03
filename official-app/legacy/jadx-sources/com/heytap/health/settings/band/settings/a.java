package com.heytap.health.settings.band.settings;

import com.oplus.aiunit.vision.m71;
import com.oplus.aiunit.vision.u91;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class a {

    /* JADX INFO: renamed from: com.heytap.health.settings.band.settings.a$a, reason: collision with other inner class name */
    public interface InterfaceC0543a extends m71 {
        void a(String str);

        List<MoreSettingsAdapter.b> c();

        void f(int i);

        void onDestroy();
    }

    public interface b extends u91<InterfaceC0543a> {
        void E6(int i);

        void hideLoadingDialog();

        void u(int i);
    }

    public static boolean a(int i) {
        return i == 19;
    }
}
