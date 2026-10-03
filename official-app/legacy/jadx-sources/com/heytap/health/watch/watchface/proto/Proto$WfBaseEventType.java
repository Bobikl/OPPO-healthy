package com.heytap.health.watch.watchface.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum Proto$WfBaseEventType implements Internal.EnumLite {
    SET_CURRENT(0),
    ADD_WF(1),
    DELETE_WF(2),
    SORT_WF(3),
    CHANGE_STYLE(4),
    CLEAR_HISTORY(5),
    SYNC_BACKGROUND(6),
    BUY_CHANGED(7),
    UNRECOGNIZED(-1);

    public static final int ADD_WF_VALUE = 1;
    public static final int BUY_CHANGED_VALUE = 7;
    public static final int CHANGE_STYLE_VALUE = 4;
    public static final int CLEAR_HISTORY_VALUE = 5;
    public static final int DELETE_WF_VALUE = 2;
    public static final int SET_CURRENT_VALUE = 0;
    public static final int SORT_WF_VALUE = 3;
    public static final int SYNC_BACKGROUND_VALUE = 6;
    private static final Internal.EnumLiteMap<Proto$WfBaseEventType> internalValueMap = new Internal.EnumLiteMap<Proto$WfBaseEventType>() { // from class: com.heytap.health.watch.watchface.proto.Proto$WfBaseEventType.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Proto$WfBaseEventType findValueByNumber(int i) {
            return Proto$WfBaseEventType.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return Proto$WfBaseEventType.forNumber(i) != null;
        }
    }

    Proto$WfBaseEventType(int i) {
        this.value = i;
    }

    public static Proto$WfBaseEventType forNumber(int i) {
        switch (i) {
            case 0:
                return SET_CURRENT;
            case 1:
                return ADD_WF;
            case 2:
                return DELETE_WF;
            case 3:
                return SORT_WF;
            case 4:
                return CHANGE_STYLE;
            case 5:
                return CLEAR_HISTORY;
            case 6:
                return SYNC_BACKGROUND;
            case 7:
                return BUY_CHANGED;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<Proto$WfBaseEventType> internalGetValueMap() {
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
    public static Proto$WfBaseEventType valueOf(int i) {
        return forNumber(i);
    }
}
