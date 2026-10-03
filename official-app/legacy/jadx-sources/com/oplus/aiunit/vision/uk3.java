package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes19.dex */
public class uk3 {

    public static class a {
        public static final uk3 a = new uk3();
    }

    public static uk3 a() {
        return a.a;
    }

    public void b(fd7 fd7Var) {
        ltl.a("ColorOsApi", "[initListener] --> onConnected success");
        bm5 bm5Var = gl4.devicePrimary;
        bm5Var.fileApi.j(trl.WF_URI_CUSTOM, fd7Var);
        bm5Var.fileApi.m(trl.WF_URI_CUSTOM, fd7Var);
        bm5Var.fileApi.j(trl.WF_URI_MEMORY, fd7Var);
        bm5Var.fileApi.m(trl.WF_URI_MEMORY, fd7Var);
        bm5Var.fileApi.j(trl.WF_URI_MEMORY_START, fd7Var);
        bm5Var.fileApi.m(trl.WF_URI_MEMORY_START, fd7Var);
        bm5Var.fileApi.j(trl.WF_URI_OUTFIT_ADD_STYLE, fd7Var);
        bm5Var.fileApi.m(trl.WF_URI_OUTFIT_ADD_STYLE, fd7Var);
        bm5Var.fileApi.j(trl.WF_URI_INSTALL_NEW_PACKAGE, fd7Var);
        bm5Var.fileApi.m(trl.WF_URI_INSTALL_NEW_PACKAGE, fd7Var);
        bm5Var.fileApi.j(trl.WF_URI_INSTALL_PAINT, fd7Var);
        bm5Var.fileApi.m(trl.WF_URI_INSTALL_PAINT, fd7Var);
        bm5Var.fileApi.j(trl.WF_URI_WALLPAPER, fd7Var);
        bm5Var.fileApi.m(trl.WF_URI_WALLPAPER, fd7Var);
        bm5Var.fileApi.j(trl.WF_URI_CLASS, fd7Var);
        bm5Var.fileApi.m(trl.WF_URI_CLASS, fd7Var);
        bm5Var.fileApi.j(trl.WF_URI_AOD, fd7Var);
        bm5Var.fileApi.m(trl.WF_URI_AOD, fd7Var);
        bm5Var.fileApi.j(trl.URI_AOD_FILE, fd7Var);
        bm5Var.fileApi.m(trl.URI_AOD_FILE, fd7Var);
        bm5Var.fileApi.j(trl.WF_URI_OMOJI, fd7Var);
        bm5Var.fileApi.m(trl.WF_URI_OMOJI, fd7Var);
        bm5Var.fileApi.j(trl.WF_URI_VIDEO, fd7Var);
        bm5Var.fileApi.m(trl.WF_URI_VIDEO, fd7Var);
    }

    public uk3() {
    }
}
