package com.oplus.aiunit.vision;

import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsg;

/* JADX INFO: loaded from: classes16.dex */
public abstract class d5<T> extends s4 {
    public ws9<T> a;

    public d5(int i, ws9<T> ws9Var) {
        this(1, i, ws9Var);
    }

    public static String b(int i, int i2) {
        return i + "_" + i2;
    }

    public String a() {
        return b(getProtocolVersion(), getCommandId());
    }

    public abstract T getWatchAppProtoType(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg);

    @Override // com.oplus.aiunit.vision.s4
    public void onMsgDispatch(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg) {
        T watchAppProtoType = getWatchAppProtoType(watchAppProto$AppCommandMsg);
        ws9<T> ws9Var = this.a;
        if (ws9Var != null) {
            ws9Var.onResponse(watchAppProtoType);
        }
    }

    public d5(int i, int i2, ws9<T> ws9Var) {
        super(i, i2);
        this.a = ws9Var;
    }
}
