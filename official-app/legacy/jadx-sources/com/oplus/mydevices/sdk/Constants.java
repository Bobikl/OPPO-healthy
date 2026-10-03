package com.oplus.mydevices.sdk;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.annotation.AnnotationRetention;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b_\n\u0002\u0010\t\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004tuvwB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010+\u001a\u00020\t8\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b,\u0010\u0002R\u000e\u0010-\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020iX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006x"}, d2 = {"Lcom/oplus/mydevices/sdk/Constants;", "", "()V", "ACTION_MY_DEVICE_SERVICE", "", "ACTION_NOTIFY_APP_ALIVE", "ACTION_NOTIFY_EVENT", "ACTION_NOTIFY_LINKAGE_EVENT", "BOUND_STATUS_BIND", "", "BOUND_STATUS_INVALID_BIND", "BOUND_STATUS_NONE", "BOUND_STATUS_UNBIND", "CODE_INIT", "CODE_INNER_INITIALIZE", "CODE_INNER_NOTIFY_ADDED", "CODE_INNER_NOTIFY_CALLBACK", "CODE_INNER_NOTIFY_REMOVED", "CODE_INNER_NOTIFY_UPDATED", "CODE_INNER_NOTIFY_UPDATE_CONNECTION", "CODE_INNER_NO_CALLBACK", "CODE_NOTIFY_AVAILABLE_DEVICE_EVENT", "CODE_NOTIFY_BIND_DEVICE_EVENT", "CODE_NOTIFY_EVENT", "CODE_NOTIFY_HEADSET_BROADCAST_EVENT", "CODE_NOTIFY_INVALIDATE_BOUND_STATUS_EVENT", "CODE_NOTIFY_IN_EAR_STATE_CHANGED", "CODE_NOTIFY_MANUAL_DISCONNECT_EVENT", "CODE_NOTIFY_PEER_DEVICE_EVENT", "CODE_NOTIFY_RELATED_DEVICE_EVENT", "CODE_NOTIFY_UNBIND_DEVICE_EVENT", "CODE_RELEASE_AUDIO_FOCUS", "CODE_RELEASE_DEVICE_FOCUS", "CODE_REQUEST_AUDIO_FOCUS", "CODE_REQUEST_DEVICE", "CODE_REQUEST_DEVICE_FOCUS", "CODE_REQUEST_LOCAL_DEVICE", "CODE_REQUEST_USER_STATEMENT", "CODE_SHOW_CAPSULE", "CODE_TYPE_INNER_NOTIFY", "CODE_TYPE_NOTIFY", "CODE_TYPE_REQUEST", "CONNECTED_DEVICES", "CONNECTION_STATE_CHANGED", "getCONNECTION_STATE_CHANGED$annotations", "CURRENT_DEVICE", "DEVICES", "DEVICE_ADDED", "DEVICE_CARD_REFRESH", "DEVICE_CARD_STOP_REFRESH", "DEVICE_EVENT_MESSAGE_TYPE_ERROR", "DEVICE_EVENT_MESSAGE_TYPE_PROMPT", "DEVICE_EVENT_MESSAGE_TYPE_WARN", "DEVICE_REMOVED", "HEADSET", "KEEP_ALIVE_FLAG_LINKAGE_SWITCH", "KEEP_ALIVE_FLAG_SHOW_CARD", "KEY_A2DP_ACTIVE_STATUS", "KEY_AUTHORITY", "KEY_AVAILABLE_DEVICE", "KEY_CALLBACK", "KEY_CAPSULE", "KEY_DEVICE", "KEY_DEVICE_CALL_BINDER", "KEY_DEVICE_CONNECTION_STATE", "KEY_DEVICE_ID", "KEY_DEVICE_IDS", "KEY_DEVICE_LIST", "KEY_DEVICE_TYPE", "KEY_ENTER_FROM", "KEY_EVENT_TYPE", "KEY_EVENT_VALUE", "KEY_EXTRA", "KEY_EXTRA_SHORTCUT_ID", "KEY_EXTRA_SHORTCUT_STATE", "KEY_FLAG", "KEY_MY_DEVICE_DATA", "KEY_MY_DEVICE_EVENT", "KEY_PACKAGE_NAME", "KEY_PAIRED_DEVICE", "KEY_PEER_DEVICE", "KEY_PRE_STATE", "KEY_REQUEST_CODE", "KEY_RESPONSE_CODE", "KEY_RESPONSE_MSG", "KEY_RESULT_CODE", "KEY_STATE", "KEY_SUPPORT_AUDIO_CONN", "KEY_SWITCH_AUDIO_CHANNEL", "KEY_SYNC_DEVICE_TYPE", "KEY_TYPE", "KEY_USER_STATEMENT", "KEY_XML_VERSION", "LINKAGE_CONNECT_DEVICE", "LINKAGE_MANUAL_CONNECT", "LINKAGE_MANUAL_SET_ACTIVE", "LINKAGE_SET_ACTIVE", "LINKAGE_STARTED", "LINKAGE_STARTING", "META_DATA_SUPPORT_LINKAGE", "META_DATA_SUPPORT_NOT_KEEP_ALIVE", "META_DATA_UNKNOWN", "METHOD_NOTIFY_BOUND_DEVICE_CHANGE_EVENT", "METHOD_NOTIFY_LINKAGE_EVENT", "MY_DEVICE_VERSION_CODE_OS12", "", "OPLUS_HEADSET", "PACKAGE_NAME_ASSIST_SCREEN", "PACKAGE_NAME_LAUNCHER", "PACKAGE_NAME_MY_DEVICE", "PERMISSION_IOT", "PROPERTY_CHANGED_AUDIO_CONNECTION", "PROPERTY_CHANGED_CONNECTION_STATE", "PROPERTY_CHANGED_MULTI_CONNECT", "PROPERTY_CHANGED_USE_STATE", "USER_STATEMENT_ACTION", "BoundStatus", "DeviceSyncType", "EventType", "MethodName", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class Constants {

    @NotNull
    public static final String ACTION_MY_DEVICE_SERVICE = "com.heytap.mydevices.ProviderMonitor";

    @NotNull
    public static final String ACTION_NOTIFY_APP_ALIVE = "action.intent.oplus.mydevices.NOTIFY_APP_ALIVE";

    @NotNull
    public static final String ACTION_NOTIFY_EVENT = "action.intent.oplus.mydevices.NOTIFY_EVENT";

    @NotNull
    public static final String ACTION_NOTIFY_LINKAGE_EVENT = "com.heytap.mydevices.NOTIFY_LINKAGE_EVENT";
    public static final int BOUND_STATUS_BIND = 1;
    public static final int BOUND_STATUS_INVALID_BIND = 2;
    public static final int BOUND_STATUS_NONE = 0;
    public static final int BOUND_STATUS_UNBIND = 3;
    public static final int CODE_INIT = 0;
    public static final int CODE_INNER_INITIALIZE = 196609;
    public static final int CODE_INNER_NOTIFY_ADDED = 196613;
    public static final int CODE_INNER_NOTIFY_CALLBACK = 196611;
    public static final int CODE_INNER_NOTIFY_REMOVED = 196610;
    public static final int CODE_INNER_NOTIFY_UPDATED = 196615;
    public static final int CODE_INNER_NOTIFY_UPDATE_CONNECTION = 196614;
    public static final int CODE_INNER_NO_CALLBACK = 196612;
    public static final int CODE_NOTIFY_AVAILABLE_DEVICE_EVENT = 131078;
    public static final int CODE_NOTIFY_BIND_DEVICE_EVENT = 131076;
    public static final int CODE_NOTIFY_EVENT = 131073;
    public static final int CODE_NOTIFY_HEADSET_BROADCAST_EVENT = 131082;
    public static final int CODE_NOTIFY_INVALIDATE_BOUND_STATUS_EVENT = 131081;
    public static final int CODE_NOTIFY_IN_EAR_STATE_CHANGED = 131074;
    public static final int CODE_NOTIFY_MANUAL_DISCONNECT_EVENT = 131080;
    public static final int CODE_NOTIFY_PEER_DEVICE_EVENT = 131079;
    public static final int CODE_NOTIFY_RELATED_DEVICE_EVENT = 131075;
    public static final int CODE_NOTIFY_UNBIND_DEVICE_EVENT = 131077;
    public static final int CODE_RELEASE_AUDIO_FOCUS = 65540;
    public static final int CODE_RELEASE_DEVICE_FOCUS = 65542;
    public static final int CODE_REQUEST_AUDIO_FOCUS = 65538;
    public static final int CODE_REQUEST_DEVICE = 65537;
    public static final int CODE_REQUEST_DEVICE_FOCUS = 65541;
    public static final int CODE_REQUEST_LOCAL_DEVICE = 65539;
    public static final int CODE_REQUEST_USER_STATEMENT = 65544;
    public static final int CODE_SHOW_CAPSULE = 65543;
    private static final int CODE_TYPE_INNER_NOTIFY = 196608;
    private static final int CODE_TYPE_NOTIFY = 131072;
    private static final int CODE_TYPE_REQUEST = 65536;
    public static final int CONNECTED_DEVICES = 2;
    public static final int CONNECTION_STATE_CHANGED = 0;
    public static final int CURRENT_DEVICE = 4;
    public static final int DEVICES = 3;
    public static final int DEVICE_ADDED = 1;
    public static final int DEVICE_CARD_REFRESH = 3;
    public static final int DEVICE_CARD_STOP_REFRESH = 4;
    public static final int DEVICE_EVENT_MESSAGE_TYPE_ERROR = 0;
    public static final int DEVICE_EVENT_MESSAGE_TYPE_PROMPT = 2;
    public static final int DEVICE_EVENT_MESSAGE_TYPE_WARN = 1;
    public static final int DEVICE_REMOVED = 2;
    public static final int HEADSET = 0;
    public static final Constants INSTANCE = new Constants();
    public static final int KEEP_ALIVE_FLAG_LINKAGE_SWITCH = 2;
    public static final int KEEP_ALIVE_FLAG_SHOW_CARD = 1;

    @NotNull
    public static final String KEY_A2DP_ACTIVE_STATUS = "a2dp_active_status";

    @NotNull
    public static final String KEY_AUTHORITY = "authority";

    @NotNull
    public static final String KEY_AVAILABLE_DEVICE = "available_device";

    @NotNull
    public static final String KEY_CALLBACK = "callback";

    @NotNull
    public static final String KEY_CAPSULE = "capsule";

    @NotNull
    public static final String KEY_DEVICE = "devices";

    @NotNull
    public static final String KEY_DEVICE_CALL_BINDER = "callBinder";

    @NotNull
    public static final String KEY_DEVICE_CONNECTION_STATE = "deviceConnectionState";

    @NotNull
    public static final String KEY_DEVICE_ID = "deviceId";

    @NotNull
    public static final String KEY_DEVICE_IDS = "key_device_ids";

    @NotNull
    public static final String KEY_DEVICE_LIST = "device_list";

    @NotNull
    public static final String KEY_DEVICE_TYPE = "device_type";

    @NotNull
    public static final String KEY_ENTER_FROM = "event_enter_from";

    @NotNull
    public static final String KEY_EVENT_TYPE = "event_type";

    @NotNull
    public static final String KEY_EVENT_VALUE = "event_value";

    @NotNull
    public static final String KEY_EXTRA = "extra";

    @NotNull
    public static final String KEY_EXTRA_SHORTCUT_ID = "shortcut_id";

    @NotNull
    public static final String KEY_EXTRA_SHORTCUT_STATE = "shortcut_state";

    @NotNull
    public static final String KEY_FLAG = "flag";

    @NotNull
    public static final String KEY_MY_DEVICE_DATA = "data";

    @NotNull
    public static final String KEY_MY_DEVICE_EVENT = "myDeviceEvent";

    @NotNull
    public static final String KEY_PACKAGE_NAME = "package_name";

    @NotNull
    public static final String KEY_PAIRED_DEVICE = "paired_device";

    @NotNull
    public static final String KEY_PEER_DEVICE = "peer_device";

    @NotNull
    public static final String KEY_PRE_STATE = "prev_state";

    @NotNull
    public static final String KEY_REQUEST_CODE = "request_code";

    @NotNull
    public static final String KEY_RESPONSE_CODE = "result_code";

    @NotNull
    public static final String KEY_RESPONSE_MSG = "result_msg";

    @NotNull
    public static final String KEY_RESULT_CODE = "result_code";

    @NotNull
    public static final String KEY_STATE = "state";

    @NotNull
    public static final String KEY_SUPPORT_AUDIO_CONN = "support_audio_conn";

    @NotNull
    public static final String KEY_SWITCH_AUDIO_CHANNEL = "switch_audio_channel";

    @NotNull
    public static final String KEY_SYNC_DEVICE_TYPE = "sync_device_type";

    @NotNull
    public static final String KEY_TYPE = "type";

    @NotNull
    public static final String KEY_USER_STATEMENT = "user_statement";

    @NotNull
    public static final String KEY_XML_VERSION = "xml_version";
    public static final int LINKAGE_CONNECT_DEVICE = 258;
    public static final int LINKAGE_MANUAL_CONNECT = 259;
    public static final int LINKAGE_MANUAL_SET_ACTIVE = 261;
    public static final int LINKAGE_SET_ACTIVE = 260;
    public static final int LINKAGE_STARTED = 257;
    public static final int LINKAGE_STARTING = 256;
    public static final int META_DATA_SUPPORT_LINKAGE = 1;
    public static final int META_DATA_SUPPORT_NOT_KEEP_ALIVE = 2;
    public static final int META_DATA_UNKNOWN = 0;

    @NotNull
    public static final String METHOD_NOTIFY_BOUND_DEVICE_CHANGE_EVENT = "notify_bound_device_change_event";

    @NotNull
    public static final String METHOD_NOTIFY_LINKAGE_EVENT = "notify_linkage_event";
    public static final long MY_DEVICE_VERSION_CODE_OS12 = 108000;
    public static final int OPLUS_HEADSET = 1;

    @NotNull
    public static final String PACKAGE_NAME_ASSIST_SCREEN = "com.coloros.assistantscreen";

    @NotNull
    public static final String PACKAGE_NAME_LAUNCHER = "com.android.launcher";

    @NotNull
    public static final String PACKAGE_NAME_MY_DEVICE = "com.heytap.mydevices";

    @NotNull
    public static final String PERMISSION_IOT = "com.oppo.permission.safe.IOT";
    public static final int PROPERTY_CHANGED_AUDIO_CONNECTION = 514;
    public static final int PROPERTY_CHANGED_CONNECTION_STATE = 512;
    public static final int PROPERTY_CHANGED_MULTI_CONNECT = 515;
    public static final int PROPERTY_CHANGED_USE_STATE = 513;

    @NotNull
    public static final String USER_STATEMENT_ACTION = "com.oplus.mydevices.action.USER_STATEMENT";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/oplus/mydevices/sdk/Constants$BoundStatus;", "", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface BoundStatus {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/oplus/mydevices/sdk/Constants$DeviceSyncType;", "", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface DeviceSyncType {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/oplus/mydevices/sdk/Constants$EventType;", "", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface EventType {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/oplus/mydevices/sdk/Constants$MethodName;", "", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
    @Retention(RetentionPolicy.SOURCE)
    @p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface MethodName {
    }

    private Constants() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "CONNECTION_STATE_CHANGED is deprecated", replaceWith = @ReplaceWith(expression = "PROPERTY_CHANGED_CONNECTION_STATE", imports = {}))
    public static /* synthetic */ void getCONNECTION_STATE_CHANGED$annotations() {
    }
}
