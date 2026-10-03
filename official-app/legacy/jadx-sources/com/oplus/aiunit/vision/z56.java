package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: classes6.dex */
public class z56 extends com.heytap.msp.okipc.server.c {
    public static String p(int i) {
        if (i >= 1024) {
            return String.format("%.2fKB", Double.valueOf(((double) i) / 1024.0d));
        }
        return i + c8l.KEY_B;
    }

    @Override // com.heytap.msp.okipc.server.c
    public void a(com.heytap.msp.okipc.server.b bVar) {
        if (bVar == null || bVar.request() == null) {
            return;
        }
        z6b.k("IPC_SERV", "onCallExecuteEnd: path=" + bVar.request().a + " completed");
    }

    @Override // com.heytap.msp.okipc.server.c
    public void b(com.heytap.msp.okipc.server.b bVar) {
        if (bVar == null || bVar.request() == null) {
            return;
        }
        z6b.k("IPC_SERV", "onCallExecuteStart: path=" + bVar.request().a);
    }

    @Override // com.heytap.msp.okipc.server.c
    public void c(com.heytap.msp.okipc.server.b bVar, Throwable th) {
        z6b.p("IPC_SERV", "onCallFailed: path=" + ((bVar == null || bVar.request() == null) ? "unknown" : bVar.request().a) + ", error=" + th.getMessage(), th);
    }

    @Override // com.heytap.msp.okipc.server.c
    public void d(com.heytap.msp.okipc.server.b bVar) {
        if (bVar == null || bVar.request() == null) {
            return;
        }
        com.heytap.msp.okipc.d dVarRequest = bVar.request();
        byte[] bArr = dVarRequest.f7337c;
        z6b.k("IPC_SERV", "onCallParsed: path=" + dVarRequest.a + ", headers=" + dVarRequest.b + ", bodySize=" + p(bArr != null ? bArr.length : 0) + ", callingPkg=" + dVarRequest.e());
    }

    @Override // com.heytap.msp.okipc.server.c
    public void e(int i) {
        z6b.k("IPC_SERV", "onCallReceived: call received from uid=" + i);
    }

    @Override // com.heytap.msp.okipc.server.c
    public void f(com.heytap.msp.okipc.server.b bVar, com.heytap.msp.okipc.e eVar) {
        byte[] bArr;
        String str = (bVar == null || bVar.request() == null) ? "unknown" : bVar.request().a;
        String strValueOf = (bVar == null || bVar.request() == null) ? "" : String.valueOf(bVar.request().b);
        int length = (eVar == null || (bArr = eVar.a) == null) ? 0 : bArr.length;
        z6b.q("IPC_SERV", "onCallRespond: path=" + str + ", reqHeaders=" + strValueOf + ", statusCode=" + (eVar != null ? eVar.f7339c : -1) + ", responseBodySize=" + p(length));
    }

    @Override // com.heytap.msp.okipc.server.c
    public void g() {
        z6b.k("IPC_SERV", "onProviderQuery: Provider query received");
    }

    @Override // com.heytap.msp.okipc.server.c
    public void h(com.heytap.msp.okipc.server.b bVar, String str) {
        z6b.q("IPC_SERV", "onRouteDispatch: dispatching to route path=" + str);
    }

    @Override // com.heytap.msp.okipc.server.c
    public void i() {
        z6b.q("IPC_SERV", "onServerStarted: IPCServer initialized successfully");
    }

    @Override // com.heytap.msp.okipc.server.c
    public void j() {
        z6b.q("IPC_SERV", "onServerStarting: IPCServer initialization starting...");
    }

    @Override // com.heytap.msp.okipc.server.c
    public void k() {
        z6b.q("IPC_SERV", "onServiceBind: IPC service bound");
    }

    @Override // com.heytap.msp.okipc.server.c
    public void l() {
        z6b.q("IPC_SERV", "onServiceCreate: IPC service created");
    }

    @Override // com.heytap.msp.okipc.server.c
    public void m() {
        z6b.q("IPC_SERV", "onServiceDestroy: IPC service destroyed");
    }

    @Override // com.heytap.msp.okipc.server.c
    public void n() {
        z6b.q("IPC_SERV", "onServiceStart: IPC service started");
    }

    @Override // com.heytap.msp.okipc.server.c
    public void o() {
        z6b.q("IPC_SERV", "onServiceUnbind: IPC service unbound");
    }
}
