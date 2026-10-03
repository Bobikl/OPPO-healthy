package com.oplus.aiunit.vision;

import com.heytap.msp.okipc.server.UncontrollHandler;
import com.oppo.obus.common.configmetadata.core.entity.common.MinCommonConfig;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
public class rga implements UncontrollHandler {
    @Override // com.heytap.msp.okipc.server.UncontrollHandler
    public void handle(com.heytap.msp.okipc.server.b bVar) {
        ou3 ou3Var = t56.configService;
        MinCommonConfig minCommonConfigJ = ou3Var != null ? ou3Var.j() : null;
        int iIntValue = minCommonConfigJ != null ? minCommonConfigJ.getIpcFreq().intValue() : 0;
        if (iIntValue <= 0) {
            bVar.c(new com.heytap.msp.okipc.e("".getBytes(StandardCharsets.UTF_8)));
        } else {
            bVar.c(new com.heytap.msp.okipc.e(String.valueOf(iIntValue).getBytes(StandardCharsets.UTF_8)));
        }
    }
}
