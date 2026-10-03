package com.heytap.health.watch.notification;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum SuggestionsCid implements Internal.EnumLite {
    CID_SUGGESTIONS_UNDEFINE(0),
    CID_SUGGESTIONS_SYNC_SWITCHES(2),
    CID_SUGGESTIONS_SYNC_SWITCH(3),
    CID_SUGGESTIONS_DATA_COMMON(4),
    CID_SUGGESTIONS_DATA_TRAVEL(5),
    CID_SUGGESTIONS_LIFECYCLE_SHOW(6),
    CID_SUGGESTIONS_LIFECYCLE_HIDE(7),
    UNRECOGNIZED(-1);

    public static final int CID_SUGGESTIONS_DATA_COMMON_VALUE = 4;
    public static final int CID_SUGGESTIONS_DATA_TRAVEL_VALUE = 5;
    public static final int CID_SUGGESTIONS_LIFECYCLE_HIDE_VALUE = 7;
    public static final int CID_SUGGESTIONS_LIFECYCLE_SHOW_VALUE = 6;
    public static final int CID_SUGGESTIONS_SYNC_SWITCHES_VALUE = 2;
    public static final int CID_SUGGESTIONS_SYNC_SWITCH_VALUE = 3;
    public static final int CID_SUGGESTIONS_UNDEFINE_VALUE = 0;
    private static final Internal.EnumLiteMap<SuggestionsCid> internalValueMap = new Internal.EnumLiteMap<SuggestionsCid>() { // from class: com.heytap.health.watch.notification.SuggestionsCid.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SuggestionsCid findValueByNumber(int i) {
            return SuggestionsCid.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SuggestionsCid.forNumber(i) != null;
        }
    }

    SuggestionsCid(int i) {
        this.value = i;
    }

    public static SuggestionsCid forNumber(int i) {
        if (i == 0) {
            return CID_SUGGESTIONS_UNDEFINE;
        }
        switch (i) {
            case 2:
                return CID_SUGGESTIONS_SYNC_SWITCHES;
            case 3:
                return CID_SUGGESTIONS_SYNC_SWITCH;
            case 4:
                return CID_SUGGESTIONS_DATA_COMMON;
            case 5:
                return CID_SUGGESTIONS_DATA_TRAVEL;
            case 6:
                return CID_SUGGESTIONS_LIFECYCLE_SHOW;
            case 7:
                return CID_SUGGESTIONS_LIFECYCLE_HIDE;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<SuggestionsCid> internalGetValueMap() {
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
    public static SuggestionsCid valueOf(int i) {
        return forNumber(i);
    }
}
