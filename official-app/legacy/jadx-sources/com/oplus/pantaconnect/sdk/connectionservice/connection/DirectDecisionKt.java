package com.oplus.pantaconnect.sdk.connectionservice.connection;

import com.oplus.pantaconnect.connection.DirectionDecisionParams;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"options", "Lcom/oplus/pantaconnect/sdk/connectionservice/connection/DirectDecision;", "Lcom/oplus/pantaconnect/connection/DirectionDecisionParams;", "toParams", "connectionservice_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DirectDecisionKt {
    @NotNull
    public static final DirectDecision options(@NotNull DirectionDecisionParams directionDecisionParams) {
        return new DirectDecision(directionDecisionParams.getMacAddress(), directionDecisionParams.getAdvFreq(), directionDecisionParams.getRemoteIp(), directionDecisionParams.getSsid(), directionDecisionParams.getTag(), directionDecisionParams.getDeviceId(), directionDecisionParams.getKscAlias(), directionDecisionParams.getDeviceKsc(), directionDecisionParams.getName(), directionDecisionParams.getPassword());
    }

    @NotNull
    public static final DirectionDecisionParams toParams(@NotNull DirectDecision directDecision) {
        DirectionDecisionParams.Builder builderNewBuilder = DirectionDecisionParams.newBuilder();
        String macAddress = directDecision.getMacAddress();
        if (macAddress == null) {
            macAddress = "";
        }
        DirectionDecisionParams.Builder macAddress2 = builderNewBuilder.setMacAddress(macAddress);
        String advFreq = directDecision.getAdvFreq();
        if (advFreq == null) {
            advFreq = "";
        }
        DirectionDecisionParams.Builder advFreq2 = macAddress2.setAdvFreq(advFreq);
        String remoteIp = directDecision.getRemoteIp();
        if (remoteIp == null) {
            remoteIp = "";
        }
        DirectionDecisionParams.Builder remoteIp2 = advFreq2.setRemoteIp(remoteIp);
        String ssid = directDecision.getSsid();
        if (ssid == null) {
            ssid = "";
        }
        DirectionDecisionParams.Builder ssid2 = remoteIp2.setSsid(ssid);
        String tag = directDecision.getTag();
        if (tag == null) {
            tag = "";
        }
        DirectionDecisionParams.Builder tag2 = ssid2.setTag(tag);
        String deviceId = directDecision.getDeviceId();
        if (deviceId == null) {
            deviceId = "";
        }
        DirectionDecisionParams.Builder deviceId2 = tag2.setDeviceId(deviceId);
        String kscAlias = directDecision.getKscAlias();
        if (kscAlias == null) {
            kscAlias = "";
        }
        DirectionDecisionParams.Builder kscAlias2 = deviceId2.setKscAlias(kscAlias);
        String deviceKsc = directDecision.getDeviceKsc();
        if (deviceKsc == null) {
            deviceKsc = "";
        }
        DirectionDecisionParams.Builder deviceKsc2 = kscAlias2.setDeviceKsc(deviceKsc);
        String name = directDecision.getName();
        if (name == null) {
            name = "";
        }
        DirectionDecisionParams.Builder name2 = deviceKsc2.setName(name);
        String password = directDecision.getPassword();
        return name2.setPassword(password != null ? password : "").build();
    }
}
