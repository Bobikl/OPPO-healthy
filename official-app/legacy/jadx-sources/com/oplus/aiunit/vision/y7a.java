package com.oplus.aiunit.vision;

import com.heytap.upgrade.enums.ServerType;
import java.io.File;

/* JADX INFO: loaded from: classes19.dex */
public class y7a {
    public boolean a;
    public ServerType b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File f18916c;

    public static y7a a() {
        return new y7a().f(false).i(ServerType.SERVER_NORMAL).g(null).h(null);
    }

    public File b() {
        if (this.f18916c == null && rqk.b() != null) {
            this.f18916c = tp.a(rqk.b());
        }
        if (this.f18916c == null) {
            this.f18916c = new File("/storage/emulated/0/Android/data");
        }
        return this.f18916c;
    }

    public at9 c() {
        return null;
    }

    public ServerType d() {
        return this.b;
    }

    public boolean e() {
        return this.a;
    }

    public y7a f(boolean z) {
        this.a = z;
        return this;
    }

    public y7a g(File file) {
        this.f18916c = file;
        return this;
    }

    public y7a h(at9 at9Var) {
        return this;
    }

    public y7a i(ServerType serverType) {
        this.b = serverType;
        return this;
    }
}
