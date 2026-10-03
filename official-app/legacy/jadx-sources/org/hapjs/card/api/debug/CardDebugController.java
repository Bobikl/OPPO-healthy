package org.hapjs.card.api.debug;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes11.dex */
public interface CardDebugController {
    public static final String ACTION_CARD_DEBUG_RESULT = "org.hapjs.intent.action.CARD_DEBUG_RESULT";
    public static final String ACTION_DEBUG_CARD = "org.hapjs.intent.action.DEBUG_CARD";
    public static final String ACTION_DEBUG_REGISTRY_HOST = "org.hapjs.action.REGISTER_HOST";
    public static final int CODE_UNKNOWN_ERROR = 0;
    public static final int CODE_UNKNOWN_MESSAGE = 1;
    public static final int CODE_UNSUPPORT_CARD = 3;
    public static final int CODE_UNSUPPORT_DEBUG = 2;
    public static final String EXTRA_ARCHIVE_HOST = "archiveHost";
    public static final String EXTRA_CARD_URL = "url";
    public static final String EXTRA_ERROR_CODE = "errorCode";
    public static final String EXTRA_FROM = "from";
    public static final String EXTRA_IS_SUPPORTED = "isSupported";
    public static final String EXTRA_MESSAGE_CODE = "messageCode";
    public static final String EXTRA_PLATFORM_VERSION_CODE = "platformVersionCode";
    public static final String EXTRA_RESULT = "result";
    public static final String EXTRA_RUNTIME_HOST = "runtimeHost";
    public static final String EXTRA_SERIAL_NUMBER = "serialNumber";
    public static final String EXTRA_SERVER = "server";
    public static final String EXTRA_SHOULD_RELOAD = "shouldReload";
    public static final String EXTRA_SHOW_VERSION = "showVersionInfo";
    public static final String EXTRA_USE_ADB = "useADB";
    public static final String EXTRA_WAIT_DEVTOOLS = "waitDevTools";
    public static final int MSG_CLOSE_DEBUG_CARD = 4;
    public static final int MSG_DEBUG_CARD = 3;
    public static final int MSG_GET_MEMORY = 5;
    public static final int MSG_IS_SUPPORT = 1;
    public static final int MSG_LAUNCH_CARD = 2;
    public static final String PERMISSION_DEBUG_CARD = "org.hapjs.permission.DEBUG_CARD";

    void handleDebugMessage(Context context, Intent intent);

    void setCardDebugHost(CardDebugHost cardDebugHost);
}
