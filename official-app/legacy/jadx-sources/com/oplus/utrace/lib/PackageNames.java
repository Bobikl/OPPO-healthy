package com.oplus.utrace.lib;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\bR\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\r\u0010\bR\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0016\u0010\bR\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/oplus/utrace/lib/PackageNames;", "", "()V", "ASSISTANT_SCREEN", "", "CORE_APPS", "", "getCORE_APPS", "()[Ljava/lang/String;", "[Ljava/lang/String;", "KEY_APPS", "getKEY_APPS", "KEY_NEED_PROXY_APP", "getKEY_NEED_PROXY_APP", "LAUNCHER", "METIS", "SCENE_SERVICE", "SECONDARY_HOME", "SYSTEM_UI", "UMS", "UTRACE_APP", "UTRACE_DEMO_APPS", "getUTRACE_DEMO_APPS", "UTRACE_MGR", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PackageNames {

    @NotNull
    public static final String ASSISTANT_SCREEN = "com.coloros.assistantscreen";

    @NotNull
    public static final String LAUNCHER = "com.android.launcher";

    @NotNull
    public static final String SCENE_SERVICE = "com.coloros.sceneservice";

    @NotNull
    public static final String SYSTEM_UI = "com.android.systemui";

    @NotNull
    public static final String UMS = "com.oplus.pantanal.ums";

    @NotNull
    public static final String UTRACE_APP = "com.oplus.utrace";

    @NotNull
    public static final PackageNames INSTANCE = new PackageNames();

    @NotNull
    public static final String UTRACE_MGR = "com.oplus.utrace.agent";

    @NotNull
    private static final String[] CORE_APPS = {UTRACE_MGR, "com.oplus.pantanal.ums"};

    @NotNull
    private static final String[] UTRACE_DEMO_APPS = {"com.oplus.utrace", UTRACE_MGR};

    @NotNull
    public static final String METIS = "com.oplus.metis";

    @NotNull
    public static final String SECONDARY_HOME = "com.oplus.secondaryhome";

    @NotNull
    private static final String[] KEY_APPS = {"com.oplus.utrace", UTRACE_MGR, "com.oplus.pantanal.ums", "com.coloros.sceneservice", METIS, "com.android.launcher", "com.coloros.assistantscreen", "com.android.systemui", SECONDARY_HOME};

    @NotNull
    private static final String[] KEY_NEED_PROXY_APP = {UTRACE_MGR, "com.android.launcher", "com.coloros.assistantscreen", "com.android.systemui", SECONDARY_HOME};

    private PackageNames() {
    }

    @NotNull
    public final String[] getCORE_APPS() {
        return CORE_APPS;
    }

    @NotNull
    public final String[] getKEY_APPS() {
        return KEY_APPS;
    }

    @NotNull
    public final String[] getKEY_NEED_PROXY_APP() {
        return KEY_NEED_PROXY_APP;
    }

    @NotNull
    public final String[] getUTRACE_DEMO_APPS() {
        return UTRACE_DEMO_APPS;
    }
}
