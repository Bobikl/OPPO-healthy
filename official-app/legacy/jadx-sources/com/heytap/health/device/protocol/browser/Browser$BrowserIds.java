package com.heytap.health.device.protocol.browser;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes16.dex */
public enum Browser$BrowserIds implements Internal.EnumLite {
    BROWSER_UNDEFINE(0),
    BROWSER_SID(38),
    BROWSER_CHECK(1),
    GET_ALL_LABEL(2),
    EDIT_LABEL(3),
    EDIT_FROM_WATCH(4),
    SORT_LABEL(5),
    OPEN_URL(6),
    UNRECOGNIZED(-1);

    public static final int BROWSER_CHECK_VALUE = 1;
    public static final int BROWSER_SID_VALUE = 38;
    public static final int BROWSER_UNDEFINE_VALUE = 0;
    public static final int EDIT_FROM_WATCH_VALUE = 4;
    public static final int EDIT_LABEL_VALUE = 3;
    public static final int GET_ALL_LABEL_VALUE = 2;
    public static final int OPEN_URL_VALUE = 6;
    public static final int SORT_LABEL_VALUE = 5;
    private static final Internal.EnumLiteMap<Browser$BrowserIds> internalValueMap = new Internal.EnumLiteMap<Browser$BrowserIds>() { // from class: com.heytap.health.device.protocol.browser.Browser$BrowserIds.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Browser$BrowserIds findValueByNumber(int i) {
            return Browser$BrowserIds.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Browser$BrowserIds.forNumber(i) != null;
        }
    }

    Browser$BrowserIds(int i) {
        this.value = i;
    }

    public static Browser$BrowserIds forNumber(int i) {
        if (i == 38) {
            return BROWSER_SID;
        }
        switch (i) {
            case 0:
                return BROWSER_UNDEFINE;
            case 1:
                return BROWSER_CHECK;
            case 2:
                return GET_ALL_LABEL;
            case 3:
                return EDIT_LABEL;
            case 4:
                return EDIT_FROM_WATCH;
            case 5:
                return SORT_LABEL;
            case 6:
                return OPEN_URL;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<Browser$BrowserIds> internalGetValueMap() {
        return internalValueMap;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return b.a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static Browser$BrowserIds valueOf(int i) {
        return forNumber(i);
    }
}
