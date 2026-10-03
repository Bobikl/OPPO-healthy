package com.heytap.health.watch.notification.flashback;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum MsgTemplate implements Internal.EnumLite {
    TEMPLATE_DEFAULT(0),
    TEMPLATE_ONE_BUTTON(1),
    TEMPLATE_TWO_BUTTONS(2),
    TEMPLATE_THREE_BUTTONS(3),
    TEMPLATE_MEDIA(4),
    UNRECOGNIZED(-1);

    public static final int TEMPLATE_DEFAULT_VALUE = 0;
    public static final int TEMPLATE_MEDIA_VALUE = 4;
    public static final int TEMPLATE_ONE_BUTTON_VALUE = 1;
    public static final int TEMPLATE_THREE_BUTTONS_VALUE = 3;
    public static final int TEMPLATE_TWO_BUTTONS_VALUE = 2;
    private static final Internal.EnumLiteMap<MsgTemplate> internalValueMap = new Internal.EnumLiteMap<MsgTemplate>() { // from class: com.heytap.health.watch.notification.flashback.MsgTemplate.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MsgTemplate findValueByNumber(int i) {
            return MsgTemplate.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return MsgTemplate.forNumber(i) != null;
        }
    }

    MsgTemplate(int i) {
        this.value = i;
    }

    public static MsgTemplate forNumber(int i) {
        if (i == 0) {
            return TEMPLATE_DEFAULT;
        }
        if (i == 1) {
            return TEMPLATE_ONE_BUTTON;
        }
        if (i == 2) {
            return TEMPLATE_TWO_BUTTONS;
        }
        if (i == 3) {
            return TEMPLATE_THREE_BUTTONS;
        }
        if (i != 4) {
            return null;
        }
        return TEMPLATE_MEDIA;
    }

    public static Internal.EnumLiteMap<MsgTemplate> internalGetValueMap() {
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
    public static MsgTemplate valueOf(int i) {
        return forNumber(i);
    }
}
