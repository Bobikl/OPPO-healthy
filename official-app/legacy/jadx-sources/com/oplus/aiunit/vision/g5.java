package com.oplus.aiunit.vision;

import com.heytap.health.watch.watchapp.proto.WatchAppProto$AppCommandMsg;
import com.heytap.health.watch.watchapp.proto.WatchAppProto$MsgBody;

/* JADX INFO: loaded from: classes16.dex */
public abstract class g5<T> extends s4 {
    protected ys9<T> mResponse;

    public g5(int i, ys9<T> ys9Var) {
        this(1, i, ys9Var);
    }

    public WatchAppProto$MsgBody getMsgRequestBody() {
        return null;
    }

    public ys9<T> getResponse() {
        return this.mResponse;
    }

    public abstract T getWatchAppProtoType(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg);

    public boolean isHasNext() {
        return false;
    }

    @Override // com.oplus.aiunit.vision.s4
    public void onMsgDispatch(WatchAppProto$AppCommandMsg watchAppProto$AppCommandMsg) {
        T watchAppProtoType = getWatchAppProtoType(watchAppProto$AppCommandMsg);
        ys9<T> ys9Var = this.mResponse;
        if (ys9Var != null) {
            ys9Var.onSuccess(watchAppProtoType);
        }
    }

    public void setResponse(ys9<T> ys9Var) {
        this.mResponse = ys9Var;
    }

    public g5(int i, int i2, ys9<T> ys9Var) {
        this(i, i2, "", ys9Var);
    }

    public g5(int i, int i2, String str, ys9<T> ys9Var) {
        super(i, i2, str);
        this.mResponse = ys9Var;
    }
}
