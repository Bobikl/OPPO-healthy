package com.oplus.pantaconnect.agents;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

/* JADX INFO: loaded from: classes8.dex */
public final class Agents {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fagents.proto\u0012\u001dcom.oplus.pantaconnect.agents\"¯\u0001\n\u0013InternalAgentClient\u0012\u000f\n\u0007agentId\u0018\u0001 \u0001(\t\u0012\u000b\n\u0003pkg\u0018\u0002 \u0001(\t\u0012\u000b\n\u0003pid\u0018\u0003 \u0001(\u0005\u0012\u000f\n\u0007appName\u0018\u0004 \u0001(\t\u0012\u0013\n\u000bchannelName\u0018\u0005 \u0001(\t\u00121\n\u0004role\u0018\u0006 \u0001(\u000e2#.com.oplus.pantaconnect.agents.Role\u0012\u0014\n\fconnectionId\u0018\u0007 \u0001(\u0003\"\u008e\u0004\n\nAgentEvent\u0012A\n\u0004type\u0018\u0001 \u0001(\u000e23.com.oplus.pantaconnect.agents.AgentEvent.EventType\u0012B\n\u0006client\u0018\u0002 \u0001(\u000b22.com.oplus.pantaconnect.agents.InternalAgentClient\u0012\u0013\n\u000bdisplayName\u0018\u0003 \u0001(\t\u0012?\n\textension\u0018\u0004 \u0001(\u000b2,.com.oplus.pantaconnect.agents.ExtensionArgs\u0012E\n\u0007payload\u0018\u0005 \u0001(\u000b24.com.oplus.pantaconnect.agents.InternalPayloadBuffer\u0012\u0011\n\terrorCode\u0018\u0006 \u0001(\u0005\"È\u0001\n\tEventType\u0012\u000f\n\u000bAGENT_FOUND\u0010\u0000\u0012\u0013\n\u000fAGENT_CONNECTED\u0010\u0001\u0012\u0016\n\u0012AGENT_DISCONNECTED\u0010\u0002\u0012\u0013\n\u000fPAYLOAD_RECEIVE\u0010\u0003\u0012\u0012\n\u000ePAYLOAD_UPDATE\u0010\u0004\u0012\u0013\n\u000fPAYLOAD_REQUEST\u0010\u0005\u0012\u0013\n\u000fEXTENSION_EVENT\u0010\u0006\u0012\u000e\n\nAGENT_LOST\u0010\u0007\u0012\u001a\n\u0016DISPLAY_DEVICES_CHANGE\u0010\b\"B\n\fWakeupParams\u0012\u0015\n\rcomponentType\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003pkg\u0018\u0002 \u0001(\t\u0012\u000e\n\u0006action\u0018\u0003 \u0001(\t\"+\n\rExtensionArgs\u0012\f\n\u0004type\u0018\u0001 \u0001(\t\u0012\f\n\u0004args\u0018\u0002 \u0001(\f\"õ\u0002\n\u0011AdvertisingParams\u0012B\n\u0006client\u0018\u0001 \u0001(\u000b22.com.oplus.pantaconnect.agents.InternalAgentClient\u0012=\n\bstrategy\u0018\u0002 \u0001(\u000e2+.com.oplus.pantaconnect.agents.StrategyType\u0012?\n\textension\u0018\u0003 \u0001(\u000b2,.com.oplus.pantaconnect.agents.ExtensionArgs\u0012_\n\u0017discoverableDeviceLevel\u0018\u0004 \u0001(\u000e2>.com.oplus.pantaconnect.agents.InternalDiscoverableDeviceLevel\u0012;\n\u0006wakeup\u0018\u0005 \u0001(\u000b2+.com.oplus.pantaconnect.agents.WakeupParams\"\u0092\u0002\n\u000fDiscoveryParams\u0012B\n\u0006client\u0018\u0001 \u0001(\u000b22.com.oplus.pantaconnect.agents.InternalAgentClient\u0012=\n\bstrategy\u0018\u0002 \u0001(\u000e2+.com.oplus.pantaconnect.agents.StrategyType\u0012?\n\textension\u0018\u0003 \u0001(\u000b2,.com.oplus.pantaconnect.agents.ExtensionArgs\u0012;\n\u0006wakeup\u0018\u0004 \u0001(\u000b2+.com.oplus.pantaconnect.agents.WakeupParams\"\u008a\u0004\n\rConnectParams\u0012M\n\u0012openConnectionMode\u0018\u0001 \u0001(\u000e21.com.oplus.pantaconnect.agents.OpenConnectionMode\u0012E\n\npairAction\u0018\u0002 \u0001(\u000e21.com.oplus.pantaconnect.agents.InternalPairAction\u0012B\n\u0006client\u0018\u0003 \u0001(\u000b22.com.oplus.pantaconnect.agents.InternalAgentClient\u0012?\n\u000bconnectType\u0018\u0004 \u0001(\u000e2*.com.oplus.pantaconnect.agents.ConnectType\u0012P\n\fscheduleType\u0018\u0005 \u0001(\u000e2:.com.oplus.pantaconnect.agents.ConnectScheduleStrategyType\u0012;\n\u0006wakeup\u0018\u0006 \u0001(\u000b2+.com.oplus.pantaconnect.agents.WakeupParams\u0012\u000e\n\u0006extras\u0018\u0007 \u0001(\f\u0012?\n\textension\u0018\b \u0001(\u000b2,.com.oplus.pantaconnect.agents.ExtensionArgs\"k\n\u0014AuthenticationParams\u0012B\n\u0006client\u0018\u0001 \u0001(\u000b22.com.oplus.pantaconnect.agents.InternalAgentClient\u0012\u000f\n\u0007isAgree\u0018\u0002 \u0001(\b\"\u0098\u0001\n\u0011ProbeDeviceParams\u0012B\n\u0006client\u0018\u0001 \u0001(\u000b22.com.oplus.pantaconnect.agents.InternalAgentClient\u0012?\n\textension\u0018\u0002 \u0001(\u000b2,.com.oplus.pantaconnect.agents.ExtensionArgs\"\u0087\u0003\n\u0015InternalPayloadBuffer\u0012B\n\u0006client\u0018\u0001 \u0001(\u000b22.com.oplus.pantaconnect.agents.InternalAgentClient\u0012@\n\u0004type\u0018\u0002 \u0001(\u000e22.com.oplus.pantaconnect.agents.InternalPayloadType\u0012\f\n\u0004data\u0018\u0003 \u0001(\f\u0012\n\n\u0002id\u0018\u0004 \u0001(\u0005\u0012\u0013\n\u000btotalLength\u0018\u0005 \u0001(\u0003\u0012\u0019\n\u0011transferredLength\u0018\u0006 \u0001(\u0003\u0012S\n\u0006status\u0018\u0007 \u0001(\u000e2C.com.oplus.pantaconnect.agents.InternalPayloadBuffer.TransferStatus\"I\n\u000eTransferStatus\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u000b\n\u0007FAILURE\u0010\u0001\u0012\f\n\bCANCELED\u0010\u0002\u0012\u000f\n\u000bIN_PROGRESS\u0010\u0003* \n\u0004Role\u0012\f\n\bProvider\u0010\u0000\u0012\n\n\u0006Seeker\u0010\u0001*i\n\fStrategyType\u0012\u0007\n\u0003BLE\u0010\u0000\u0012\u0007\n\u0003NSD\u0010\u0001\u0012\u0011\n\rBASED_CONNECT\u0010\u0002\u0012\u0007\n\u0003RTC\u0010\u0003\u0012\b\n\u0004AUTO\u0010\u0004\u0012\u0007\n\u0003LAN\u0010\u0005\u0012\u0007\n\u0003NFC\u0010\u0006\u0012\u000f\n\u000bUSB_CONNECT\u0010\u0007*B\n\u001bConnectScheduleStrategyType\u0012\u000b\n\u0007PREEMPT\u0010\u0000\u0012\b\n\u0004FIFO\u0010\u0001\u0012\f\n\bPRIORITY\u0010\u0002*\u0098\u0001\n\u000bConnectType\u0012\b\n\u0004GATT\u0010\u0000\u0012\u0007\n\u0003SPP\u0010\u0001\u0012\u0010\n\fSPP_INSECURE\u0010\u0002\u0012\u0007\n\u0003P2P\u0010\u0003\u0012\b\n\u0004WLAN\u0010\u0004\u0012\u0007\n\u0003USB\u0010\u0005\u0012\u000f\n\u000bRTC_CONNECT\u0010\u0006\u0012\b\n\u0004NONE\u0010\u0007\u0012\u0011\n\rNETWORK_SETUP\u0010\b\u0012\u000f\n\u000bTV_WLAN_P2P\u0010\t\u0012\t\n\u0005CLOUD\u0010\n*6\n\u0013InternalPayloadType\u0012\t\n\u0005BYTES\u0010\u0000\u0012\n\n\u0006STREAM\u0010\u0001\u0012\b\n\u0004FILE\u0010\u0002*J\n\u001fInternalDiscoverableDeviceLevel\u0012\u0017\n\u0013SAME_ACCOUNT_DEVICE\u0010\u0000\u0012\u000e\n\nALL_DEVICE\u0010\u0001*P\n\u0012OpenConnectionMode\u0012\u0011\n\rCONNECT_AGENT\u0010\u0000\u0012\r\n\tPAIR_ONLY\u0010\u0001\u0012\u0018\n\u0014CONNECT_CHANNEL_ONLY\u0010\u0002*N\n\u0012InternalPairAction\u0012\n\n\u0006ACCEPT\u0010\u0000\u0012\n\n\u0006REJECT\u0010\u0001\u0012\f\n\bPIN_AUTH\u0010\u0002\u0012\u0012\n\u000eCUSTOMIZE_AUTH\u0010\u0003B\u0002P\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_AdvertisingParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_AdvertisingParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_AgentEvent_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_AgentEvent_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_AuthenticationParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_AuthenticationParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_ConnectParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_ConnectParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_DiscoveryParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_DiscoveryParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_ExtensionArgs_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_ExtensionArgs_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_InternalAgentClient_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_InternalAgentClient_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_InternalPayloadBuffer_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_InternalPayloadBuffer_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_ProbeDeviceParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_ProbeDeviceParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_agents_WakeupParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_agents_WakeupParams_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_com_oplus_pantaconnect_agents_InternalAgentClient_descriptor = descriptor2;
        internal_static_com_oplus_pantaconnect_agents_InternalAgentClient_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"AgentId", "Pkg", "Pid", "AppName", "ChannelName", "Role", "ConnectionId"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_com_oplus_pantaconnect_agents_AgentEvent_descriptor = descriptor3;
        internal_static_com_oplus_pantaconnect_agents_AgentEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Type", "Client", "DisplayName", "Extension", "Payload", "ErrorCode"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_com_oplus_pantaconnect_agents_WakeupParams_descriptor = descriptor4;
        internal_static_com_oplus_pantaconnect_agents_WakeupParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"ComponentType", "Pkg", "Action"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_com_oplus_pantaconnect_agents_ExtensionArgs_descriptor = descriptor5;
        internal_static_com_oplus_pantaconnect_agents_ExtensionArgs_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Type", "Args"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_com_oplus_pantaconnect_agents_AdvertisingParams_descriptor = descriptor6;
        internal_static_com_oplus_pantaconnect_agents_AdvertisingParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Client", "Strategy", "Extension", "DiscoverableDeviceLevel", "Wakeup"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_com_oplus_pantaconnect_agents_DiscoveryParams_descriptor = descriptor7;
        internal_static_com_oplus_pantaconnect_agents_DiscoveryParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Client", "Strategy", "Extension", "Wakeup"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_com_oplus_pantaconnect_agents_ConnectParams_descriptor = descriptor8;
        internal_static_com_oplus_pantaconnect_agents_ConnectParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"OpenConnectionMode", "PairAction", "Client", "ConnectType", "ScheduleType", "Wakeup", "Extras", "Extension"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_com_oplus_pantaconnect_agents_AuthenticationParams_descriptor = descriptor9;
        internal_static_com_oplus_pantaconnect_agents_AuthenticationParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Client", "IsAgree"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_com_oplus_pantaconnect_agents_ProbeDeviceParams_descriptor = descriptor10;
        internal_static_com_oplus_pantaconnect_agents_ProbeDeviceParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Client", "Extension"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_com_oplus_pantaconnect_agents_InternalPayloadBuffer_descriptor = descriptor11;
        internal_static_com_oplus_pantaconnect_agents_InternalPayloadBuffer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Client", "Type", "Data", "Id", "TotalLength", "TransferredLength", "Status"});
    }

    private Agents() {
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
