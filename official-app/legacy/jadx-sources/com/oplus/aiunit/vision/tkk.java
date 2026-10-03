package com.oplus.aiunit.vision;

import com.google.gson.Gson;
import com.oplus.drs.core.db.service.ConfigRepository;

/* JADX INFO: loaded from: classes6.dex */
public class tkk {
    public final skk a;
    public final skk b;

    public tkk(ConfigRepository configRepository, Gson gson) {
        this.a = new i75(configRepository, gson);
        this.b = new ggf(configRepository, gson);
    }

    public skk a(String str) {
        return "149700".equals(str) ? this.b : this.a;
    }
}
