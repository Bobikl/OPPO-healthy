package com.heytap.health.watch.notification;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes19.dex */
public enum SuggestionsSid implements Internal.EnumLite {
    SID_SUGGESTIONS_UNDEFINE(0),
    SID_SUGGESTIONS(271),
    UNRECOGNIZED(-1);

    public static final int SID_SUGGESTIONS_UNDEFINE_VALUE = 0;
    public static final int SID_SUGGESTIONS_VALUE = 271;
    private static final Internal.EnumLiteMap<SuggestionsSid> internalValueMap = new Internal.EnumLiteMap<SuggestionsSid>() { // from class: com.heytap.health.watch.notification.SuggestionsSid.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SuggestionsSid findValueByNumber(int i) {
            return SuggestionsSid.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return SuggestionsSid.forNumber(i) != null;
        }
    }

    SuggestionsSid(int i) {
        this.value = i;
    }

    public static SuggestionsSid forNumber(int i) {
        if (i == 0) {
            return SID_SUGGESTIONS_UNDEFINE;
        }
        if (i != 271) {
            return null;
        }
        return SID_SUGGESTIONS;
    }

    public static Internal.EnumLiteMap<SuggestionsSid> internalGetValueMap() {
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
    public static SuggestionsSid valueOf(int i) {
        return forNumber(i);
    }
}
