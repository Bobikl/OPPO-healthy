package com.oplus.pantaconnect.agents;

import com.coloros.sceneservice.dataprovider.bean.scene.SceneHotelData;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.oplus.aiunit.vision.usm;

/* JADX INFO: loaded from: classes8.dex */
public final class CompatScp {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0010compat_scp.proto\u0012\u001dcom.oplus.pantaconnect.agents\u001a\fagents.proto\"¡\u0001\n\u0015CompatScpConnectParam\u0012\u000f\n\u0007address\u0018\u0001 \u0001(\t\u0012\u0012\n\ndeviceType\u0018\u0002 \u0001(\u0005\u0012\u0014\n\fagentAddress\u0018\u0003 \u0001(\f\u0012?\n\u000bconnectType\u0018\u0004 \u0001(\u000e2*.com.oplus.pantaconnect.agents.ConnectType\u0012\f\n\u0004port\u0018\u0005 \u0001(\u0005\"¯\u0001\n\u001cInternalCompatScpSendPayload\u0012@\n\u0004type\u0018\u0001 \u0001(\u000e22.com.oplus.pantaconnect.agents.InternalPayloadType\u0012\f\n\u0004data\u0018\u0002 \u0001(\f\u0012\u0014\n\fagentAddress\u0018\u0003 \u0001(\f\u0012\u0014\n\fconnectionId\u0018\u0004 \u0001(\u0003\u0012\u0013\n\u000bisHandShake\u0018\u0005 \u0001(\b\"\u009e\u0001\n\u000eCompatScpAgent\u0012\u0014\n\fagentAddress\u0018\u0001 \u0001(\f\u0012\u0014\n\fconnectionId\u0018\u0002 \u0001(\u0003\u0012\u0010\n\bisServer\u0018\u0003 \u0001(\b\u0012\u000b\n\u0003pid\u0018\u0004 \u0001(\u0005\u0012A\n\fwakeUpParams\u0018\u0005 \u0001(\u000b2+.com.oplus.pantaconnect.agents.WakeupParams\"-\n\u0018CompatScpConnectionEvent\u0012\u0011\n\terrorCode\u0018\u0001 \u0001(\u0005\"î\u0002\n\u0015ConnectAccessoryParam\u0012M\n\u0012openConnectionMode\u0018\u0001 \u0001(\u000e21.com.oplus.pantaconnect.agents.OpenConnectionMode\u0012B\n\u0006client\u0018\u0002 \u0001(\u000b22.com.oplus.pantaconnect.agents.InternalAgentClient\u0012?\n\u000bconnectType\u0018\u0003 \u0001(\u000e2*.com.oplus.pantaconnect.agents.ConnectType\u0012\u001c\n\u0014peerProtocolDeviceId\u0018\u0004 \u0001(\t\u0012\u000f\n\u0007address\u0018\u0005 \u0001(\t\u0012\u0010\n\bkscAlias\u0018\u0006 \u0001(\f\u0012\u0012\n\ndeviceType\u0018\u0007 \u0001(\u0005\u0012\u0014\n\finsecureType\u0018\b \u0001(\u0005\u0012\u0016\n\u000eifAccountEqual\u0018\t \u0001(\b\"\u0098\u0001\n\u001fInternalCompatScpReceivePayload\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\u0005\u0012\u0014\n\fisScpPayload\u0018\u0002 \u0001(\b\u0012@\n\u0004type\u0018\u0003 \u0001(\u000e22.com.oplus.pantaconnect.agents.InternalPayloadType\u0012\f\n\u0004data\u0018\u0004 \u0001(\f\"f\n!InternalCompatScpRemoteConnection\u0012\u0015\n\rdeviceAddress\u0018\u0001 \u0001(\t\u0012\u0014\n\fagentAddress\u0018\u0002 \u0001(\f\u0012\u0014\n\fconnectionId\u0018\u0003 \u0001(\u0003\"N\n\u001eInternalConnectAccessoryResult\u0012\u0012\n\nresultCode\u0018\u0001 \u0001(\u0005\u0012\u0018\n\u0010protocolDeviceId\u0018\u0002 \u0001(\f\"·\u0001\n\u000ePairDeviceInfo\u0012\u0016\n\u000eremoteDeviceId\u0018\u0001 \u0001(\f\u0012\u000f\n\u0007address\u0018\u0002 \u0001(\t\u0012A\n\rconnectorType\u0018\u0003 \u0001(\u000e2*.com.oplus.pantaconnect.agents.ConnectType\u0012\u0010\n\bkscAlias\u0018\u0004 \u0001(\t\u0012\u0013\n\u000bisSenseless\u0018\u0005 \u0001(\b\u0012\u0012\n\ndeviceType\u0018\u0006 \u0001(\u0005\"\u0097\u0001\n\u0010RawConnectParams\u0012\u000f\n\u0007address\u0018\u0001 \u0001(\t\u0012\u0012\n\ndeviceType\u0018\u0002 \u0001(\u0005\u0012?\n\u000bconnectType\u0018\u0003 \u0001(\u000e2*.com.oplus.pantaconnect.agents.ConnectType\u0012\f\n\u0004port\u0018\u0004 \u0001(\u0005\u0012\u000f\n\u0007timeout\u0018\u0005 \u0001(\u0003\"|\n\u0014RawConnectionPayload\u0012\u0014\n\fconnectionId\u0018\u0001 \u0001(\u0003\u0012@\n\u0004type\u0018\u0002 \u0001(\u000e22.com.oplus.pantaconnect.agents.InternalPayloadType\u0012\f\n\u0004data\u0018\u0003 \u0001(\f\"\u0085\u0001\n\u0015InternalRawConnection\u0012\u0015\n\rdeviceAddress\u0018\u0001 \u0001(\t\u0012?\n\u000bconnectType\u0018\u0002 \u0001(\u000e2*.com.oplus.pantaconnect.agents.ConnectType\u0012\u0014\n\fconnectionId\u0018\u0003 \u0001(\u0003\"0\n\u0018ConnectedP2pDeviceIdList\u0012\u0014\n\fdeviceIdList\u0018\u0001 \u0003(\tB\u0002P\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[]{Agents.getDescriptor()});
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_CompatScpAgent_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_CompatScpAgent_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_CompatScpConnectParam_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_CompatScpConnectParam_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_CompatScpConnectionEvent_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_CompatScpConnectionEvent_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_ConnectAccessoryParam_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_ConnectAccessoryParam_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_ConnectedP2pDeviceIdList_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_ConnectedP2pDeviceIdList_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_InternalCompatScpReceivePayload_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_InternalCompatScpReceivePayload_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_InternalCompatScpRemoteConnection_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_InternalCompatScpRemoteConnection_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_InternalCompatScpSendPayload_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_InternalCompatScpSendPayload_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_InternalConnectAccessoryResult_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_InternalConnectAccessoryResult_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_InternalRawConnection_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_InternalRawConnection_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_PairDeviceInfo_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_PairDeviceInfo_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_RawConnectParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_RawConnectParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_RawConnectionPayload_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_RawConnectionPayload_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_oplus_pantaconnect_agents_CompatScpConnectParam_descriptor = descriptor2;
        internal_static_com_oplus_pantaconnect_agents_CompatScpConnectParam_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{SceneHotelData.KEY_ADDRESS, "DeviceType", "AgentAddress", "ConnectType", "Port"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_com_oplus_pantaconnect_agents_InternalCompatScpSendPayload_descriptor = descriptor3;
        internal_static_com_oplus_pantaconnect_agents_InternalCompatScpSendPayload_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Type", "Data", "AgentAddress", "ConnectionId", "IsHandShake"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_com_oplus_pantaconnect_agents_CompatScpAgent_descriptor = descriptor4;
        internal_static_com_oplus_pantaconnect_agents_CompatScpAgent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"AgentAddress", "ConnectionId", "IsServer", "Pid", "WakeUpParams"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_com_oplus_pantaconnect_agents_CompatScpConnectionEvent_descriptor = descriptor5;
        internal_static_com_oplus_pantaconnect_agents_CompatScpConnectionEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ErrorCode"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_com_oplus_pantaconnect_agents_ConnectAccessoryParam_descriptor = descriptor6;
        internal_static_com_oplus_pantaconnect_agents_ConnectAccessoryParam_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"OpenConnectionMode", "Client", "ConnectType", "PeerProtocolDeviceId", SceneHotelData.KEY_ADDRESS, "KscAlias", "DeviceType", "InsecureType", "IfAccountEqual"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_com_oplus_pantaconnect_agents_InternalCompatScpReceivePayload_descriptor = descriptor7;
        internal_static_com_oplus_pantaconnect_agents_InternalCompatScpReceivePayload_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{usm.g, "IsScpPayload", "Type", "Data"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_com_oplus_pantaconnect_agents_InternalCompatScpRemoteConnection_descriptor = descriptor8;
        internal_static_com_oplus_pantaconnect_agents_InternalCompatScpRemoteConnection_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"DeviceAddress", "AgentAddress", "ConnectionId"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_com_oplus_pantaconnect_agents_InternalConnectAccessoryResult_descriptor = descriptor9;
        internal_static_com_oplus_pantaconnect_agents_InternalConnectAccessoryResult_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"ResultCode", "ProtocolDeviceId"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_com_oplus_pantaconnect_agents_PairDeviceInfo_descriptor = descriptor10;
        internal_static_com_oplus_pantaconnect_agents_PairDeviceInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"RemoteDeviceId", SceneHotelData.KEY_ADDRESS, "ConnectorType", "KscAlias", "IsSenseless", "DeviceType"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_com_oplus_pantaconnect_agents_RawConnectParams_descriptor = descriptor11;
        internal_static_com_oplus_pantaconnect_agents_RawConnectParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{SceneHotelData.KEY_ADDRESS, "DeviceType", "ConnectType", "Port", "Timeout"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_com_oplus_pantaconnect_agents_RawConnectionPayload_descriptor = descriptor12;
        internal_static_com_oplus_pantaconnect_agents_RawConnectionPayload_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"ConnectionId", "Type", "Data"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_com_oplus_pantaconnect_agents_InternalRawConnection_descriptor = descriptor13;
        internal_static_com_oplus_pantaconnect_agents_InternalRawConnection_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"DeviceAddress", "ConnectType", "ConnectionId"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_com_oplus_pantaconnect_agents_ConnectedP2pDeviceIdList_descriptor = descriptor14;
        internal_static_com_oplus_pantaconnect_agents_ConnectedP2pDeviceIdList_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"DeviceIdList"});
        Agents.getDescriptor();
    }

    private CompatScp() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
