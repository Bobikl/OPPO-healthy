package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsg;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgHeader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class be0 {
    public static final String TAG = "AppStoreMsgManager";
    public Map<String, g5> a;
    public Map<String, d5> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t4 f9693c;
    public w6c d;

    public static class a {
        public static final be0 a = new be0();
    }

    public static be0 e() {
        return a.a;
    }

    public <T extends d5> void a(@NonNull T t) {
        s5l.a(TAG, "[registerMsgListener] register message :" + t);
        String strA = t.a();
        if (this.b.containsKey(strA)) {
            this.b.remove(strA);
        }
        this.b.put(strA, t);
    }

    public synchronized void b(String str, g5 g5Var) {
        this.a.put(str, g5Var);
        this.d.b(str, g5Var);
    }

    public final synchronized void c(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg, WatchAppProto$MsgHeader watchAppProto$MsgHeader) {
        s5l.a(TAG, "[dispatchRegisterMsg]  message :" + watchAppProto$AppCommandMsg);
        String strB = d5.b(watchAppProto$MsgHeader.getProtocolVersion(), watchAppProto$MsgHeader.getCommandId());
        d5 d5Var = this.b.get(strB);
        if (d5Var != null) {
            d5Var.onMsgDispatch(watchAppProto$AppCommandMsg);
        } else {
            s5l.g(TAG, "[dispatchRegisterMsg] Not register receiver map,and give up commandUniqueId: " + strB);
        }
    }

    public final synchronized void d(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg, g5 g5Var) {
        s5l.a(TAG, "[dispatchSendMsg]  absAppMsgReceiver :" + g5Var);
        String actionAnchor = watchAppProto$AppCommandMsg.getHeader().getActionAnchor();
        this.d.d(actionAnchor);
        g5Var.onMsgDispatch(watchAppProto$AppCommandMsg);
        if (g5Var.isHasNext()) {
            this.d.b(actionAnchor, g5Var);
        } else {
            this.a.remove(actionAnchor);
        }
    }

    public t4 f() {
        return this.f9693c;
    }

    public synchronized void g(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg) {
        s5l.a(TAG, "[onMessageDispatch] receive message :" + watchAppProto$AppCommandMsg);
        WatchAppProto$MsgHeader header = watchAppProto$AppCommandMsg.getHeader();
        g5 g5Var = this.a.get(header.getActionAnchor());
        if (g5Var == null) {
            c(watchAppProto$AppCommandMsg, header);
        } else if (!header.getIsAck()) {
            d(watchAppProto$AppCommandMsg, g5Var);
        }
    }

    public be0() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.f9693c = new f55();
        w6c w6cVar = new w6c();
        this.d = w6cVar;
        w6cVar.e(this.a);
    }
}
