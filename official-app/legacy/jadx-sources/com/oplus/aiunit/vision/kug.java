package com.oplus.aiunit.vision;

import com.heytap.msp.okipc.server.UncontrollHandler;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
public class kug implements UncontrollHandler {
    @Override // com.heytap.msp.okipc.server.UncontrollHandler
    public void handle(com.heytap.msp.okipc.server.b bVar) {
        bVar.c(new com.heytap.msp.okipc.e(String.valueOf(com.oplus.drs.base.ntp.b.f().i().first).getBytes(StandardCharsets.UTF_8)));
    }
}
