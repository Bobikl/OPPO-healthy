package com.oplus.aiunit.vision;

import com.heytap.health.watch.watchface.proto.Proto$AppChangeEventMessage;
import com.heytap.health.watch.watchface.proto.Proto$DeviceInfo;
import com.heytap.health.watch.watchface.proto.Proto$MessageEnhanceBody;
import com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessage;
import com.heytap.health.watch.watchface.proto.Proto$WfBaseEventMessage;
import com.heytap.health.watch.watchface.proto.Proto$WfEntity;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class r31 extends i11 {
    public static final String TAG = "BaseGenV2DataManager";
    public x31 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f71 f16035l;
    public f48 m;

    public r31(Proto$DeviceInfo proto$DeviceInfo) {
        super(proto$DeviceInfo);
        this.k = F(this);
        this.f16035l = (f71) this.g;
    }

    @Override // com.oplus.aiunit.vision.i11
    public void A(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        ltl.d(TAG, "[onGetUniformMsg] --> do nothing");
        int commandId = proto$WatchFaceMessage.getHeader().getCommandId();
        if (commandId == 16 || commandId == 17) {
            itl.j().m(commandId, proto$WatchFaceMessage);
        }
    }

    public void E(Proto$WatchFaceMessage proto$WatchFaceMessage, boolean z) {
        synchronized (r31.class) {
            this.k.E(z, proto$WatchFaceMessage);
        }
    }

    public abstract x31 F(i11 i11Var);

    @Override // com.oplus.aiunit.vision.i11
    public p21 b() {
        return new h48(this);
    }

    @Override // com.oplus.aiunit.vision.i11
    public void r(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        if (this.m == null) {
            this.m = new f48(this.f12339c);
        }
        this.m.d(proto$WatchFaceMessage);
    }

    @Override // com.oplus.aiunit.vision.i11
    public void s(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        ltl.d(TAG, "[onGetAppChangeEventMsg] --> do nothing");
    }

    @Override // com.oplus.aiunit.vision.i11
    public void t(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        Proto$AppChangeEventMessage appChangeEventMsg = proto$WatchFaceMessage.getEnhanceBody().getAppChangeEventMsg();
        int eventType = appChangeEventMsg.getEventType();
        List<Proto$WfEntity> operateWfList = appChangeEventMsg.getOperateWfList();
        if (operateWfList == null || operateWfList.size() == 0) {
            ltl.i(TAG, "[onGetAppChangeEventMsg] operateWfList = null,and return ");
            return;
        }
        j8l.a().c(eventType, operateWfList);
        Proto$WfEntity proto$WfEntity = operateWfList.get(0);
        String wfUnique = proto$WfEntity.getWfUnique();
        String wfVersion = proto$WfEntity.getWfVersion();
        int styleIndex = proto$WfEntity.getStyleIndex();
        String wfPkgName = proto$WfEntity.getWfPkgName();
        ltl.a(TAG, "[onGetAppChangeEventV2Msg] eventType " + eventType + ",wfUnique " + wfUnique + ",wfVersion " + wfVersion + ",styleIndex " + styleIndex);
        this.k.x(eventType, wfUnique, wfPkgName, wfVersion);
    }

    @Override // com.oplus.aiunit.vision.i11
    public void u(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        synchronized (r31.class) {
            Proto$MessageEnhanceBody enhanceBody = proto$WatchFaceMessage.getEnhanceBody();
            if (enhanceBody == null) {
                ltl.b(TAG, "[onGetBaseEventMsg] --> enhanceBody==null");
                return;
            }
            Proto$WfBaseEventMessage baseEventMsg = enhanceBody.getBaseEventMsg();
            if (baseEventMsg == null) {
                ltl.b(TAG, "[onGetBaseEventMsg] --> baseEventMsg==null");
                return;
            }
            List<Proto$WfEntity> operateWfList = baseEventMsg.getOperateWfList();
            if (lza.a(operateWfList)) {
                ltl.b(TAG, "[onGetBaseEventMsg] --> operateWfList is empty");
                return;
            }
            int eventType = baseEventMsg.getEventType();
            if (eventType == 1) {
                this.f16035l.b(operateWfList);
            } else if (eventType == 2) {
                this.f16035l.d(operateWfList);
            } else if (eventType == 0) {
                this.f16035l.e(operateWfList);
            } else if (eventType == 4) {
                this.f16035l.c(operateWfList);
            } else if (eventType == 3) {
                this.f16035l.f(operateWfList);
            }
            j8l.a().d(eventType, operateWfList);
        }
    }

    @Override // com.oplus.aiunit.vision.i11
    public void w(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        ltl.a(TAG, "[onGetHistoryWfMsg] ActionAnchor = " + proto$WatchFaceMessage.getHeader().getActionAnchor());
        E(proto$WatchFaceMessage, false);
    }

    @Override // com.oplus.aiunit.vision.i11
    public void x(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        ltl.d(TAG, "[onGetResAskRspMsg] --> do nothing");
    }

    @Override // com.oplus.aiunit.vision.i11
    public void y(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        this.k.z(proto$WatchFaceMessage);
    }

    @Override // com.oplus.aiunit.vision.i11
    public void z(Proto$WatchFaceMessage proto$WatchFaceMessage) {
        ltl.a(TAG, "[onGetSyncMsg] message " + proto$WatchFaceMessage);
        C(false);
        E(proto$WatchFaceMessage, true);
    }
}
