package com.oplus.pantaconnect.fusionservice;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.oplus.aiunit.vision.nt5;
import com.oplus.pantaconnect.agents.Agents;

/* JADX INFO: loaded from: classes8.dex */
public final class Fusionservice {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013fusionservice.proto\u0012$com.oplus.pantaconnect.fusionservice\u001a\fagents.proto\u001a\u0011discoveries.proto\"2\n\u0014ServiceListenerEvent\u0012\f\n\u0004type\u0018\u0001 \u0001(\t\u0012\f\n\u0004args\u0018\u0002 \u0001(\f\"¿\u0003\n\u0013FusionPublishParams\u0012B\n\u0006client\u0018\u0001 \u0001(\u000b22.com.oplus.pantaconnect.agents.InternalAgentClient\u0012L\n\u000bserviceInfo\u0018\u0002 \u0001(\u000b27.com.oplus.pantaconnect.fusionservice.ServiceInfoParams\u0012F\n\u0011discoveryStrategy\u0018\u0003 \u0001(\u000e2+.com.oplus.pantaconnect.agents.StrategyType\u0012\u0016\n\u000edurationMillis\u0018\u0004 \u0001(\u0003\u0012\u0010\n\binterval\u0018\u0005 \u0001(\u0005\u0012M\n\u0006wakeup\u0018\u0006 \u0001(\u000b28.com.oplus.pantaconnect.fusionservice.FusionWakeupParamsH\u0000\u0088\u0001\u0001\u0012\u001d\n\u0015screenOffDiscoverable\u0018\u0007 \u0001(\b\u0012\u0019\n\u0011includeDeviceName\u0018\b \u0001(\b\u0012\u0010\n\bdistance\u0018\t \u0001(\u0003B\t\n\u0007_wakeup\"ð\u0004\n\u0015FusionDiscoveryParams\u0012B\n\u0006client\u0018\u0001 \u0001(\u000b22.com.oplus.pantaconnect.agents.InternalAgentClient\u0012F\n\u0011discoveryStrategy\u0018\u0002 \u0001(\u000e2+.com.oplus.pantaconnect.agents.StrategyType\u0012\u0016\n\u000edurationMillis\u0018\u0004 \u0001(\u0003\u0012\u0010\n\binterval\u0018\u0005 \u0001(\u0005\u0012\u001a\n\u0012acceptStickyResult\u0018\u0006 \u0001(\b\u0012\u0011\n\tstickyTTL\u0018\u0007 \u0001(\u0003\u0012M\n\u0006wakeup\u0018\b \u0001(\u000b28.com.oplus.pantaconnect.fusionservice.FusionWakeupParamsH\u0000\u0088\u0001\u0001\u0012\u001d\n\u0015screenOffDiscoverable\u0018\t \u0001(\b\u0012W\n\fcallbackType\u0018\n \u0001(\u000e2<.com.oplus.pantaconnect.fusionservice.ScanCallbackTypeParamsH\u0001\u0088\u0001\u0001\u0012Y\n\u000fdiscoveryFilter\u0018\u000b \u0001(\u000b2;.com.oplus.pantaconnect.fusionservice.DiscoveryFilterParamsH\u0002\u0088\u0001\u0001\u0012\u0014\n\u0007minRssi\u0018\f \u0001(\u0005H\u0003\u0088\u0001\u0001B\t\n\u0007_wakeupB\u000f\n\r_callbackTypeB\u0012\n\u0010_discoveryFilterB\n\n\b_minRssi\"\u0088\u0002\n\u0011ServiceNodeParams\u0012\u0011\n\tserviceId\u0018\u0001 \u0001(\t\u0012L\n\u000bserviceInfo\u0018\u0002 \u0001(\u000b27.com.oplus.pantaconnect.fusionservice.ServiceInfoParams\u0012N\n\fterminalInfo\u0018\u0003 \u0001(\u000b28.com.oplus.pantaconnect.fusionservice.TerminalInfoParams\u0012B\n\rdiscoveryType\u0018\u0004 \u0001(\u000e2+.com.oplus.pantaconnect.agents.StrategyType\";\n\u0011ServiceInfoParams\u0012\u0011\n\tserviceId\u0018\u0001 \u0001(\t\u0012\u0013\n\u000bserviceData\u0018\u0002 \u0001(\f\"ã\u0001\n\u0012TerminalInfoParams\u0012\u0010\n\bdeviceId\u0018\u0001 \u0001(\t\u0012\u0012\n\ndeviceName\u0018\u0002 \u0001(\t\u0012\u0012\n\ndeviceType\u0018\u0003 \u0001(\u0005\u0012\u0014\n\fconnectState\u0018\u0004 \u0001(\f\u0012K\n\bidentity\u0018\u0005 \u0001(\u000b24.com.oplus.pantaconnect.fusionservice.IdentityParamsH\u0000\u0088\u0001\u0001\u0012\u0015\n\rdeviceAddress\u0018\u0006 \u0001(\t\u0012\f\n\u0004rssi\u0018\u0007 \u0001(\tB\u000b\n\t_identity\"P\n\u000eIdentityParams\u0012\u0013\n\u000baccountHash\u0018\u0001 \u0001(\t\u0012\u0014\n\faccountGroup\u0018\u0002 \u0001(\t\u0012\u0013\n\u000bcontactHash\u0018\u0003 \u0001(\t\"Ñ\u0003\n\u0012FusionWakeupParams\u0012O\n\u000factivity_config\u0018\u0001 \u0001(\u000b24.com.oplus.pantaconnect.fusionservice.ActivityConfigH\u0000\u0012Q\n\u0010broadcast_config\u0018\u0002 \u0001(\u000b25.com.oplus.pantaconnect.fusionservice.BroadcastConfigH\u0000\u0012M\n\u000eservice_config\u0018\u0003 \u0001(\u000b23.com.oplus.pantaconnect.fusionservice.ServiceConfigH\u0000\u0012P\n\tcp_config\u0018\u0004 \u0001(\u000b2;.com.oplus.pantaconnect.fusionservice.ContentProviderConfigH\u0000\u0012\u0010\n\btrace_id\u0018\u0005 \u0001(\t\u0012P\n\u000epullUpStrategy\u0018\u0006 \u0001(\u000e28.com.oplus.pantaconnect.fusionservice.PullUpStrategyTypeB\u0012\n\u0010component_config\"³\u0003\n\fIntentParams\u0012\u0013\n\u0006action\u0018\u0001 \u0001(\tH\u0000\u0088\u0001\u0001\u0012\u0015\n\bdata_uri\u0018\u0002 \u0001(\tH\u0001\u0088\u0001\u0001\u0012\u0016\n\tmime_type\u0018\u0003 \u0001(\tH\u0002\u0088\u0001\u0001\u0012X\n\tcomponent\u0018\u0004 \u0001(\u000b2@.com.oplus.pantaconnect.fusionservice.IntentParams.ComponentNameH\u0003\u0088\u0001\u0001\u0012\u0012\n\ncategories\u0018\u0005 \u0003(\t\u0012\u0012\n\u0005flags\u0018\u0006 \u0001(\u0005H\u0004\u0088\u0001\u0001\u0012 \n\u0013extras_bundle_bytes\u0018\u0007 \u0001(\fH\u0005\u0088\u0001\u0001\u0012\u0019\n\fpackage_name\u0018\b \u0001(\tH\u0006\u0088\u0001\u0001\u001a9\n\rComponentName\u0012\u0014\n\fpackage_name\u0018\u0001 \u0001(\t\u0012\u0012\n\nclass_name\u0018\u0002 \u0001(\tB\t\n\u0007_actionB\u000b\n\t_data_uriB\f\n\n_mime_typeB\f\n\n_componentB\b\n\u0006_flagsB\u0016\n\u0014_extras_bundle_bytesB\u000f\n\r_package_name\"[\n\u000eActivityConfig\u0012I\n\rintent_params\u0018\u0001 \u0001(\u000b22.com.oplus.pantaconnect.fusionservice.IntentParams\"\u0096\u0001\n\u000fBroadcastConfig\u0012I\n\rintent_params\u0018\u0001 \u0001(\u000b22.com.oplus.pantaconnect.fusionservice.IntentParams\u0012 \n\u0013receiver_permission\u0018\u0002 \u0001(\tH\u0000\u0088\u0001\u0001B\u0016\n\u0014_receiver_permission\"\u0082\u0002\n\rServiceConfig\u0012I\n\rintent_params\u0018\u0001 \u0001(\u000b22.com.oplus.pantaconnect.fusionservice.IntentParams\u0012L\n\u000blaunch_type\u0018\u0002 \u0001(\u000e27.com.oplus.pantaconnect.fusionservice.ServiceLaunchType\u0012\u0017\n\nbind_flags\u0018\u0003 \u0001(\u0005H\u0000\u0088\u0001\u0001\u0012\u001c\n\u000funbind_delay_ms\u0018\u0004 \u0001(\u0003H\u0001\u0088\u0001\u0001B\r\n\u000b_bind_flagsB\u0012\n\u0010_unbind_delay_ms\"¶\u0003\n\u0015ContentProviderConfig\u0012\u000b\n\u0003uri\u0018\u0001 \u0001(\t\u0012K\n\fquery_config\u0018\u0002 \u0001(\u000b23.com.oplus.pantaconnect.fusionservice.CpQueryConfigH\u0000\u0012M\n\rinsert_config\u0018\u0003 \u0001(\u000b24.com.oplus.pantaconnect.fusionservice.CpInsertConfigH\u0000\u0012M\n\rupdate_config\u0018\u0004 \u0001(\u000b24.com.oplus.pantaconnect.fusionservice.CpUpdateConfigH\u0000\u0012M\n\rdelete_config\u0018\u0005 \u0001(\u000b24.com.oplus.pantaconnect.fusionservice.CpDeleteConfigH\u0000\u0012I\n\u000bcall_config\u0018\u0006 \u0001(\u000b22.com.oplus.pantaconnect.fusionservice.CpCallConfigH\u0000B\u000b\n\toperation\"\u0089\u0001\n\rCpQueryConfig\u0012\u0012\n\nprojection\u0018\u0001 \u0003(\t\u0012\u0016\n\tselection\u0018\u0002 \u0001(\tH\u0000\u0088\u0001\u0001\u0012\u0016\n\u000eselection_args\u0018\u0003 \u0003(\t\u0012\u0017\n\nsort_order\u0018\u0004 \u0001(\tH\u0001\u0088\u0001\u0001B\f\n\n_selectionB\r\n\u000b_sort_order\"9\n\u000eCpInsertConfig\u0012'\n\u001fserialized_content_values_bytes\u0018\u0001 \u0001(\f\"w\n\u000eCpUpdateConfig\u0012'\n\u001fserialized_content_values_bytes\u0018\u0001 \u0001(\f\u0012\u0016\n\tselection\u0018\u0002 \u0001(\tH\u0000\u0088\u0001\u0001\u0012\u0016\n\u000eselection_args\u0018\u0003 \u0003(\tB\f\n\n_selection\"N\n\u000eCpDeleteConfig\u0012\u0016\n\tselection\u0018\u0001 \u0001(\tH\u0000\u0088\u0001\u0001\u0012\u0016\n\u000eselection_args\u0018\u0002 \u0003(\tB\f\n\n_selection\"r\n\fCpCallConfig\u0012\u000e\n\u0006method\u0018\u0001 \u0001(\t\u0012\u0010\n\u0003arg\u0018\u0002 \u0001(\tH\u0000\u0088\u0001\u0001\u0012 \n\u0013extras_bundle_bytes\u0018\u0003 \u0001(\fH\u0001\u0088\u0001\u0001B\u0006\n\u0004_argB\u0016\n\u0014_extras_bundle_bytes\"B\n\u0015DiscoveryFilterParams\u0012\u0012\n\nfilterType\u0018\u0001 \u0001(\u0005\u0012\u0015\n\rleScanFilters\u0018\u0002 \u0003(\f\"<\n\u0010ActiveAncsParams\u0012\u0018\n\u0010protocolDeviceId\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006enable\u0018\u0002 \u0001(\b\"g\n\rBindAncsParam\u0012\u0014\n\fbluetoothMac\u0018\u0001 \u0001(\t\u0012\u0018\n\u0010protocolDeviceId\u0018\u0002 \u0001(\t\u0012\u0012\n\ndeviceType\u0018\u0003 \u0001(\u0005\u0012\u0012\n\ndeviceName\u0018\u0004 \u0001(\t\"+\n\u000fUnbindAncsParam\u0012\u0018\n\u0010protocolDeviceId\u0018\u0001 \u0001(\t*J\n\u0016ScanCallbackTypeParams\u0012\u000f\n\u000bALL_MATCHES\u0010\u0000\u0012\u000f\n\u000bFIRST_MATCH\u0010\u0001\u0012\u000e\n\nMATCH_LOST\u0010\u0002*V\n\u0011ServiceLaunchType\u0012\u0011\n\rSTART_SERVICE\u0010\u0000\u0012\u001c\n\u0018START_FOREGROUND_SERVICE\u0010\u0001\u0012\u0010\n\fBIND_SERVICE\u0010\u0002*\u0085\u0001\n\u0012PullUpStrategyType\u0012\u0014\n\u0010STRATEGY_UNKNOWN\u0010\u0000\u0012\u001b\n\u0017CONSERVATIVE_BACKGROUND\u0010\u0001\u0012\u0018\n\u0014BALANCED_INTERACTION\u0010\u0002\u0012\u0016\n\u0012IMMEDIATE_RESPONSE\u0010\u0003\u0012\n\n\u0006CUSTOM\u0010\u0004B\u0002P\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[]{Agents.getDescriptor(), nt5.a()});
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_ActiveAncsParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_ActiveAncsParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_ActivityConfig_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_ActivityConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_BindAncsParam_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_BindAncsParam_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_BroadcastConfig_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_BroadcastConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_ContentProviderConfig_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_ContentProviderConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_CpCallConfig_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_CpCallConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_CpDeleteConfig_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_CpDeleteConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_CpInsertConfig_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_CpInsertConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_CpQueryConfig_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_CpQueryConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_CpUpdateConfig_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_CpUpdateConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_DiscoveryFilterParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_DiscoveryFilterParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_FusionDiscoveryParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_FusionDiscoveryParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_FusionPublishParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_FusionPublishParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_FusionWakeupParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_FusionWakeupParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_IdentityParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_IdentityParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_ComponentName_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_ComponentName_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_ServiceConfig_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_ServiceConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_ServiceInfoParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_ServiceInfoParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_ServiceListenerEvent_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_ServiceListenerEvent_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_ServiceNodeParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_ServiceNodeParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_TerminalInfoParams_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_TerminalInfoParams_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_com_oplus_pantaconnect_fusionservice_UnbindAncsParam_descriptor;
    static final GeneratedMessageV3.FieldAccessorTable internal_static_com_oplus_pantaconnect_fusionservice_UnbindAncsParam_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) carambola.carambola(0);
        internal_static_com_oplus_pantaconnect_fusionservice_ServiceListenerEvent_descriptor = descriptor2;
        internal_static_com_oplus_pantaconnect_fusionservice_ServiceListenerEvent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Type", "Args"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) carambola.carambola(1);
        internal_static_com_oplus_pantaconnect_fusionservice_FusionPublishParams_descriptor = descriptor3;
        internal_static_com_oplus_pantaconnect_fusionservice_FusionPublishParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Client", "ServiceInfo", "DiscoveryStrategy", "DurationMillis", "Interval", "Wakeup", "ScreenOffDiscoverable", "IncludeDeviceName", "Distance"});
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) carambola.carambola(2);
        internal_static_com_oplus_pantaconnect_fusionservice_FusionDiscoveryParams_descriptor = descriptor4;
        internal_static_com_oplus_pantaconnect_fusionservice_FusionDiscoveryParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Client", "DiscoveryStrategy", "DurationMillis", "Interval", "AcceptStickyResult", "StickyTTL", "Wakeup", "ScreenOffDiscoverable", "CallbackType", "DiscoveryFilter", "MinRssi"});
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) carambola.carambola(3);
        internal_static_com_oplus_pantaconnect_fusionservice_ServiceNodeParams_descriptor = descriptor5;
        internal_static_com_oplus_pantaconnect_fusionservice_ServiceNodeParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ServiceId", "ServiceInfo", "TerminalInfo", "DiscoveryType"});
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) carambola.carambola(4);
        internal_static_com_oplus_pantaconnect_fusionservice_ServiceInfoParams_descriptor = descriptor6;
        internal_static_com_oplus_pantaconnect_fusionservice_ServiceInfoParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"ServiceId", "ServiceData"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) carambola.carambola(5);
        internal_static_com_oplus_pantaconnect_fusionservice_TerminalInfoParams_descriptor = descriptor7;
        internal_static_com_oplus_pantaconnect_fusionservice_TerminalInfoParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"DeviceId", "DeviceName", "DeviceType", "ConnectState", "Identity", "DeviceAddress", "Rssi"});
        Descriptors.Descriptor descriptor8 = (Descriptors.Descriptor) carambola.carambola(6);
        internal_static_com_oplus_pantaconnect_fusionservice_IdentityParams_descriptor = descriptor8;
        internal_static_com_oplus_pantaconnect_fusionservice_IdentityParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"AccountHash", "AccountGroup", "ContactHash"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) carambola.carambola(7);
        internal_static_com_oplus_pantaconnect_fusionservice_FusionWakeupParams_descriptor = descriptor9;
        internal_static_com_oplus_pantaconnect_fusionservice_FusionWakeupParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"ActivityConfig", "BroadcastConfig", "ServiceConfig", "CpConfig", "TraceId", "PullUpStrategy", "ComponentConfig"});
        Descriptors.Descriptor descriptor10 = (Descriptors.Descriptor) carambola.carambola(8);
        internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_descriptor = descriptor10;
        internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Action", "DataUri", "MimeType", "Component", "Categories", "Flags", "ExtrasBundleBytes", "PackageName"});
        Descriptors.Descriptor descriptor11 = descriptor10.getNestedTypes().get(0);
        internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_ComponentName_descriptor = descriptor11;
        internal_static_com_oplus_pantaconnect_fusionservice_IntentParams_ComponentName_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"PackageName", "ClassName"});
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) carambola.carambola(9);
        internal_static_com_oplus_pantaconnect_fusionservice_ActivityConfig_descriptor = descriptor12;
        internal_static_com_oplus_pantaconnect_fusionservice_ActivityConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"IntentParams"});
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) carambola.carambola(10);
        internal_static_com_oplus_pantaconnect_fusionservice_BroadcastConfig_descriptor = descriptor13;
        internal_static_com_oplus_pantaconnect_fusionservice_BroadcastConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"IntentParams", "ReceiverPermission"});
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) carambola.carambola(11);
        internal_static_com_oplus_pantaconnect_fusionservice_ServiceConfig_descriptor = descriptor14;
        internal_static_com_oplus_pantaconnect_fusionservice_ServiceConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"IntentParams", "LaunchType", "BindFlags", "UnbindDelayMs"});
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) carambola.carambola(12);
        internal_static_com_oplus_pantaconnect_fusionservice_ContentProviderConfig_descriptor = descriptor15;
        internal_static_com_oplus_pantaconnect_fusionservice_ContentProviderConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Uri", "QueryConfig", "InsertConfig", "UpdateConfig", "DeleteConfig", "CallConfig", "Operation"});
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) carambola.carambola(13);
        internal_static_com_oplus_pantaconnect_fusionservice_CpQueryConfig_descriptor = descriptor16;
        internal_static_com_oplus_pantaconnect_fusionservice_CpQueryConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Projection", "Selection", "SelectionArgs", "SortOrder"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) carambola.carambola(14);
        internal_static_com_oplus_pantaconnect_fusionservice_CpInsertConfig_descriptor = descriptor17;
        internal_static_com_oplus_pantaconnect_fusionservice_CpInsertConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"SerializedContentValuesBytes"});
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) carambola.carambola(15);
        internal_static_com_oplus_pantaconnect_fusionservice_CpUpdateConfig_descriptor = descriptor18;
        internal_static_com_oplus_pantaconnect_fusionservice_CpUpdateConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"SerializedContentValuesBytes", "Selection", "SelectionArgs"});
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) carambola.carambola(16);
        internal_static_com_oplus_pantaconnect_fusionservice_CpDeleteConfig_descriptor = descriptor19;
        internal_static_com_oplus_pantaconnect_fusionservice_CpDeleteConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Selection", "SelectionArgs"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) carambola.carambola(17);
        internal_static_com_oplus_pantaconnect_fusionservice_CpCallConfig_descriptor = descriptor20;
        internal_static_com_oplus_pantaconnect_fusionservice_CpCallConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"Method", "Arg", "ExtrasBundleBytes"});
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) carambola.carambola(18);
        internal_static_com_oplus_pantaconnect_fusionservice_DiscoveryFilterParams_descriptor = descriptor21;
        internal_static_com_oplus_pantaconnect_fusionservice_DiscoveryFilterParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"FilterType", "LeScanFilters"});
        Descriptors.Descriptor descriptor22 = (Descriptors.Descriptor) carambola.carambola(19);
        internal_static_com_oplus_pantaconnect_fusionservice_ActiveAncsParams_descriptor = descriptor22;
        internal_static_com_oplus_pantaconnect_fusionservice_ActiveAncsParams_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"ProtocolDeviceId", "Enable"});
        Descriptors.Descriptor descriptor23 = (Descriptors.Descriptor) carambola.carambola(20);
        internal_static_com_oplus_pantaconnect_fusionservice_BindAncsParam_descriptor = descriptor23;
        internal_static_com_oplus_pantaconnect_fusionservice_BindAncsParam_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"BluetoothMac", "ProtocolDeviceId", "DeviceType", "DeviceName"});
        Descriptors.Descriptor descriptor24 = (Descriptors.Descriptor) carambola.carambola(21);
        internal_static_com_oplus_pantaconnect_fusionservice_UnbindAncsParam_descriptor = descriptor24;
        internal_static_com_oplus_pantaconnect_fusionservice_UnbindAncsParam_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{"ProtocolDeviceId"});
        Agents.getDescriptor();
        nt5.a();
    }

    private Fusionservice() {
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
