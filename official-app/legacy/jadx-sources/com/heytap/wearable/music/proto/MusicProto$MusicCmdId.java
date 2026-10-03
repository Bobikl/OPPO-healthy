package com.heytap.wearable.music.proto;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes2.dex */
public enum MusicProto$MusicCmdId implements Internal.EnumLite {
    CMD_ID_MUSIC_CONTROL_UNDEFINE(0),
    CMD_ID_CHANGE_PLAY_STATE(1),
    CMD_ID_PLAY_INFO(2),
    CMD_ID_PLAY_STATE_INFO(3),
    CMD_ID_PLAY_VOLUME(4),
    CMD_ID_CHANGE_PLAY_VOLUME(5),
    CMD_ID_MUSIC_CLOSE(6),
    CMD_ID_SEND_TOTAL_INFO(7),
    CMD_ID_REQUEST_TOTAL_INFO(8),
    CMD_ID_RESPONSE_REQUEST_TOTAL_INFO(9),
    CMD_ID_MUSIC_TRANSFER_REQUEST(10),
    CMD_ID_MUSIC_LIST_INFO(11),
    CMD_ID_MUSIC_DEL_ACTION(12),
    CMD_ID_SYNC_MUSIC_LIST_INFO(13),
    CMD_ID_PLAY_LIST_INFO(14),
    CMD_ID_SYNC_PLAY_LIST_INFO(15),
    CMD_ID_AUTO_MUSIC_CONTROL(16),
    CMD_ID_SLIDE_CHANGE_VOLUME(17),
    CND_ID_CHECK_PERMISSIONS(18),
    CMD_ID_CONTROL_SWITCH(29),
    CMD_ID_MUSIC_CONTROL_STATUS(30),
    UNRECOGNIZED(-1);

    public static final int CMD_ID_AUTO_MUSIC_CONTROL_VALUE = 16;
    public static final int CMD_ID_CHANGE_PLAY_STATE_VALUE = 1;
    public static final int CMD_ID_CHANGE_PLAY_VOLUME_VALUE = 5;
    public static final int CMD_ID_CONTROL_SWITCH_VALUE = 29;
    public static final int CMD_ID_MUSIC_CLOSE_VALUE = 6;
    public static final int CMD_ID_MUSIC_CONTROL_STATUS_VALUE = 30;
    public static final int CMD_ID_MUSIC_CONTROL_UNDEFINE_VALUE = 0;
    public static final int CMD_ID_MUSIC_DEL_ACTION_VALUE = 12;
    public static final int CMD_ID_MUSIC_LIST_INFO_VALUE = 11;
    public static final int CMD_ID_MUSIC_TRANSFER_REQUEST_VALUE = 10;
    public static final int CMD_ID_PLAY_INFO_VALUE = 2;
    public static final int CMD_ID_PLAY_LIST_INFO_VALUE = 14;
    public static final int CMD_ID_PLAY_STATE_INFO_VALUE = 3;
    public static final int CMD_ID_PLAY_VOLUME_VALUE = 4;
    public static final int CMD_ID_REQUEST_TOTAL_INFO_VALUE = 8;
    public static final int CMD_ID_RESPONSE_REQUEST_TOTAL_INFO_VALUE = 9;
    public static final int CMD_ID_SEND_TOTAL_INFO_VALUE = 7;
    public static final int CMD_ID_SLIDE_CHANGE_VOLUME_VALUE = 17;
    public static final int CMD_ID_SYNC_MUSIC_LIST_INFO_VALUE = 13;
    public static final int CMD_ID_SYNC_PLAY_LIST_INFO_VALUE = 15;
    public static final int CND_ID_CHECK_PERMISSIONS_VALUE = 18;
    private static final Internal.EnumLiteMap<MusicProto$MusicCmdId> internalValueMap = new Internal.EnumLiteMap<MusicProto$MusicCmdId>() { // from class: com.heytap.wearable.music.proto.MusicProto$MusicCmdId.a
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MusicProto$MusicCmdId findValueByNumber(int i) {
            return MusicProto$MusicCmdId.forNumber(i);
        }
    };
    private final int value;

    public static final class b implements Internal.EnumVerifier {
        public static final Internal.EnumVerifier a = new b();

        @Override // com.google.protobuf.Internal.EnumVerifier
        public boolean isInRange(int i) {
            return MusicProto$MusicCmdId.forNumber(i) != null;
        }
    }

    MusicProto$MusicCmdId(int i) {
        this.value = i;
    }

    public static MusicProto$MusicCmdId forNumber(int i) {
        if (i == 29) {
            return CMD_ID_CONTROL_SWITCH;
        }
        if (i == 30) {
            return CMD_ID_MUSIC_CONTROL_STATUS;
        }
        switch (i) {
            case 0:
                return CMD_ID_MUSIC_CONTROL_UNDEFINE;
            case 1:
                return CMD_ID_CHANGE_PLAY_STATE;
            case 2:
                return CMD_ID_PLAY_INFO;
            case 3:
                return CMD_ID_PLAY_STATE_INFO;
            case 4:
                return CMD_ID_PLAY_VOLUME;
            case 5:
                return CMD_ID_CHANGE_PLAY_VOLUME;
            case 6:
                return CMD_ID_MUSIC_CLOSE;
            case 7:
                return CMD_ID_SEND_TOTAL_INFO;
            case 8:
                return CMD_ID_REQUEST_TOTAL_INFO;
            case 9:
                return CMD_ID_RESPONSE_REQUEST_TOTAL_INFO;
            case 10:
                return CMD_ID_MUSIC_TRANSFER_REQUEST;
            case 11:
                return CMD_ID_MUSIC_LIST_INFO;
            case 12:
                return CMD_ID_MUSIC_DEL_ACTION;
            case 13:
                return CMD_ID_SYNC_MUSIC_LIST_INFO;
            case 14:
                return CMD_ID_PLAY_LIST_INFO;
            case 15:
                return CMD_ID_SYNC_PLAY_LIST_INFO;
            case 16:
                return CMD_ID_AUTO_MUSIC_CONTROL;
            case 17:
                return CMD_ID_SLIDE_CHANGE_VOLUME;
            case 18:
                return CND_ID_CHECK_PERMISSIONS;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<MusicProto$MusicCmdId> internalGetValueMap() {
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
    public static MusicProto$MusicCmdId valueOf(int i) {
        return forNumber(i);
    }
}
