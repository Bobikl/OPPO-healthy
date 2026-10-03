package com.oplus.aiunit.vision;

import com.heytap.health.watch.watchface.proto.Proto$WatchFaceMessage;
import com.heytap.wearable.devicemanager.proto.WatchfacePayInfoProto$WfPayRequest;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes19.dex */
public class jyb {
    public static final String TAG = "MessageParse";

    public static Proto$WatchFaceMessage a(MessageEvent messageEvent) {
        if (messageEvent == null) {
            ltl.b(TAG, "[onMessageReceived] --> messageEvent==null");
        } else if (messageEvent.getServiceId() != 13) {
            ltl.a(TAG, "[onMessageReceived] --> some other service data no need to execute");
        } else {
            try {
                return Proto$WatchFaceMessage.parseFrom(messageEvent.getData());
            } catch (Exception e2) {
                ltl.b(TAG, "[onMessageReceived] --> parse error = " + e2.getMessage());
            }
        }
        return null;
    }

    public static WatchfacePayInfoProto$WfPayRequest b(MessageEvent messageEvent) {
        if (messageEvent == null) {
            ltl.b(TAG, "[onMessageReceived] --> messageEvent==null");
        } else {
            try {
                return WatchfacePayInfoProto$WfPayRequest.parseFrom(messageEvent.getData());
            } catch (Exception e2) {
                ltl.b(TAG, "[onMessageReceived] --> parse payRequest error = " + e2.getMessage());
            }
        }
        return null;
    }
}
