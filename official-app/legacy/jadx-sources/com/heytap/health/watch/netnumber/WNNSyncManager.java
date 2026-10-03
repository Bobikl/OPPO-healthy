package com.heytap.health.watch.netnumber;

import android.content.Context;
import android.os.RemoteException;
import com.google.gson.reflect.TypeToken;
import com.google.protobuf.StringValue;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.wearable.watchnetnumber.proto.WNNProto;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.y9g;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import com.ted.number.TedServiceHelper;
import com.ted.number.entrys.RecognitionNumber;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00162\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J$\u0010\u000f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/watch/netnumber/WNNSyncManager;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/watch/netnumber/IWnnAidl;", "f", "Landroid/content/Context;", "context", "", "c", "b", "", "number", "Lcom/heytap/wearable/watchnetnumber/proto/WNNProto$WNNNumberQueryResultCode;", "code", "Lcom/ted/number/entrys/RecognitionNumber;", "data", b2n.f, "Lcom/heytap/health/watch/netnumber/IWnnAidl$Stub;", "i", "Lcom/heytap/health/watch/netnumber/IWnnAidl$Stub;", "iBinder", "<init>", "()V", "Companion", "a", "contactnetnumber_impl_OPlusRelease"}, k = 1, mv = {1, 8, 0})
public final class WNNSyncManager implements cm9<IWnnAidl> {

    @NotNull
    public static final String TAG = "BlockHealth.WNNSyncManager";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final IWnnAidl.Stub iBinder = new IWnnAidl.Stub() { // from class: com.heytap.health.watch.netnumber.WNNSyncManager$iBinder$1
        @Override // com.heytap.health.watch.netnumber.IWnnAidl
        public boolean onMessageReceived(@NotNull MessageEvent messageEvent) throws RemoteException {
            Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
            a7b.f(WNNSyncManager.TAG, "onMessageReceived() called with: messageEvent = [" + messageEvent + "]");
            int commandId = messageEvent.getCommandId();
            if (commandId == 1) {
                try {
                    WNNProto.WNNNumberQueryData from = WNNProto.WNNNumberQueryData.parseFrom(messageEvent.getData());
                    RecognitionNumber recognitionNumberQueryNumberInfo = TedServiceHelper.getInstance().queryNumberInfo(from.getNumber(), from.getFrom());
                    if (recognitionNumberQueryNumberInfo == null) {
                        this.this$0.g(from.getNumber(), WNNProto.WNNNumberQueryResultCode.WNN_NONE, null);
                    } else {
                        this.this$0.g(from.getNumber(), WNNProto.WNNNumberQueryResultCode.WNN_SUCCESS, recognitionNumberQueryNumberInfo);
                    }
                    return false;
                } catch (Exception unused) {
                    this.this$0.g(null, WNNProto.WNNNumberQueryResultCode.WNN_ERROR, null);
                    return false;
                }
            }
            if (commandId != 5) {
                return false;
            }
            try {
                WNNProto.WNNCallWhiteList from2 = WNNProto.WNNCallWhiteList.parseFrom(messageEvent.getData());
                a7b.f(WNNSyncManager.TAG, "WHITE_LIST_RESPONSE " + from2);
                String strQ = gl4.managerApi.q(ra5.a.INSTANCE);
                List arrayList = (List) GsonUtil.b(y9g.a(strQ), new TypeToken<List<Long>>() { // from class: com.heytap.health.watch.netnumber.WNNSyncManager$iBinder$1$onMessageReceived$savedWhiteListIDList$1
                }.getType());
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                a7b.f(WNNSyncManager.TAG, "WHITE_LIST_RESPONSE savedWhiteListIDList " + arrayList);
                List<WNNProto.WNNCallWhiteNumber> whiteNumberList = from2.getWhiteNumberList();
                Intrinsics.checkNotNullExpressionValue(whiteNumberList, "whiteList.whiteNumberList");
                for (WNNProto.WNNCallWhiteNumber wNNCallWhiteNumber : whiteNumberList) {
                    if (wNNCallWhiteNumber.getSyncStatus() == 1) {
                        arrayList.remove(Long.valueOf(wNNCallWhiteNumber.getId()));
                    } else if (!arrayList.contains(Long.valueOf(wNNCallWhiteNumber.getId()))) {
                        arrayList.add(Long.valueOf(wNNCallWhiteNumber.getId()));
                    }
                }
                a7b.f(WNNSyncManager.TAG, "WHITE_LIST_RESPONSE updateList " + arrayList);
                y9g.d(strQ, GsonUtil.e(arrayList));
                return false;
            } catch (Exception e2) {
                a7b.f(WNNSyncManager.TAG, "WHITE_LIST_RESPONSE error " + e2.getMessage());
                return false;
            }
        }
    };

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f(TAG, "[onDestroy] --> WNNSyncManager");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        a7b.f(TAG, "[onCreate] --> WNNSyncManager");
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public IWnnAidl d() {
        a7b.f(TAG, "[getService] --> WNNSyncManager" + this);
        return this.iBinder;
    }

    public final void g(String number, WNNProto.WNNNumberQueryResultCode code, RecognitionNumber data) {
        WNNProto.WNNNumberQueryResult.Builder builderNewBuilder = WNNProto.WNNNumberQueryResult.newBuilder();
        builderNewBuilder.setCode(code);
        if (number != null) {
            builderNewBuilder.setNumber(StringValue.of(number));
        }
        if (data != null) {
            RecognitionNumber.MarkerData markerData = data.getMarkerData();
            WNNProto.RecognitionNumber.Builder builderNewBuilder2 = WNNProto.RecognitionNumber.newBuilder();
            if (data.getName() != null) {
                builderNewBuilder2.setName(StringValue.of(data.getName()));
            }
            if (data.getLogo() != null) {
                builderNewBuilder2.setLogo(StringValue.of(data.getLogo()));
            }
            if (data.getAddress() != null) {
                builderNewBuilder2.setAddress(StringValue.of(data.getAddress()));
            }
            if (markerData != null) {
                builderNewBuilder2.setMarkerData(WNNProto.MarkerData.newBuilder().setCounter(markerData.getCounter()).setTagType(markerData.getTagType()).setClassify(StringValue.of(markerData.getClassify())).setRiskLevel(markerData.getRiskLevel()).setIsNoMark(markerData.isNoMark()).setIsUploaded(markerData.isUploaded()).setIsCustomMark(markerData.isCustomMark()));
            }
            builderNewBuilder.setValue(builderNewBuilder2);
        }
        gl4.deviceMultiple.messageApi.k(gl4.managerApi.n(), new MessageEvent(16, 2, builderNewBuilder.build().toByteArray()));
    }
}
