package com.google.zxing.datamatrix.encoder;

import com.garmin.fit.e;
import com.garmin.fit.i;
import com.heytap.health.protocol.fitness.FitnessProto$FitnessCmdId;
import com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoCmdId;
import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.lifesense.plugin.ble.data.tracker.ATDataProfile;
import com.oplus.aiunit.vision.oei;
import com.oplus.aiunit.vision.yo3;

/* JADX INFO: loaded from: classes14.dex */
public final class ErrorCorrection {
    private static final int MODULO_VALUE = 301;
    private static final int[] FACTOR_SETS = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};
    private static final int[][] FACTORS = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, 116, 255, 110, 61}, new int[]{175, ATDataProfile.CMD_BLOOD_OXYGEN_RECORD, 205, 12, 194, 168, 39, UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, e.TotalFractionalDescentFieldNum, 119, ATDataProfile.CMD_BLOOD_OXYGEN_RECORD, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, 195, Proto$SyncEventMessage.OUTFIT_WF_VERSION_FIELD_NUMBER, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, 205, 109, 39, 176, 21, i.O2ToxicityFieldNum, 197, Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER, 223, i.O2ToxicityFieldNum, 21, 5, 172, 254, 124, 12, 181, 184, 96, 50, 193}, new int[]{211, yo3.FILE_SEND_FAIL, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, ATDataProfile.CMD_BLOOD_OXYGEN_RECORD, 110, 213, 141, 136, 120, 151, 233, 168, 93, 255}, new int[]{UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE, 127, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, 220, Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, yo3.FILE_SEND_FAIL, 205, 188, FitnessProto$FitnessCmdId.CMD_SUNLIGHT_STAT_VALUE, 87, FitnessProto$FitnessCmdId.CMD_MCU_AUTO_PAUSE_SPORT_VALUE, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, ATDataProfile.CMD_BLOOD_OXYGEN_RECORD, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, 234, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE, 127, 67, 247, 28, i.O2ToxicityFieldNum, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, FitnessProto$FitnessCmdId.CMD_MCU_BREATHE_RATE_VALUE, 143, 108, FitnessProto$FitnessCmdId.CMD_MCU_BUTTON_TO_PAUSE_OR_RESUME_VALUE, 37, 185, 112, 134, 230, UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE, 63, 197, 190, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, oei.TAI_CHI, 124, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER, 149, 159, 56, 89, 33, 147, Proto$SyncEventMessage.OUTFIT_WF_VERSION_FIELD_NUMBER, 154, 36, 73, 127, 213, 136, 248, 180, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, FitnessProto$FitnessCmdId.CMD_SUNLIGHT_DETAIL_VALUE, 66, 139, 153, 185, 202, 167, 179, 25, 220, 232, 96, 210, yo3.FILE_SEND_FAIL, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, FitnessProto$FitnessCmdId.CMD_MCU_BREATHE_RATE_VALUE, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};
    private static final int[] LOG = new int[256];
    private static final int[] ALOG = new int[255];

    static {
        int i = 1;
        for (int i2 = 0; i2 < 255; i2++) {
            ALOG[i2] = i;
            LOG[i] = i2;
            i <<= 1;
            if (i >= 256) {
                i ^= 301;
            }
        }
    }

    private ErrorCorrection() {
    }

    private static String createECCBlock(CharSequence charSequence, int i) {
        int i2;
        int i3;
        int i4 = 0;
        while (true) {
            int[] iArr = FACTOR_SETS;
            if (i4 >= iArr.length) {
                i4 = -1;
                break;
            }
            if (iArr[i4] == i) {
                break;
            }
            i4++;
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i)));
        }
        int[] iArr2 = FACTORS[i4];
        char[] cArr = new char[i];
        for (int i5 = 0; i5 < i; i5++) {
            cArr[i5] = 0;
        }
        for (int i6 = 0; i6 < charSequence.length(); i6++) {
            int i7 = i - 1;
            int iCharAt = cArr[i7] ^ charSequence.charAt(i6);
            while (i7 > 0) {
                if (iCharAt == 0 || (i3 = iArr2[i7]) == 0) {
                    cArr[i7] = cArr[i7 - 1];
                } else {
                    char c2 = cArr[i7 - 1];
                    int[] iArr3 = ALOG;
                    int[] iArr4 = LOG;
                    cArr[i7] = (char) (iArr3[(iArr4[iCharAt] + iArr4[i3]) % 255] ^ c2);
                }
                i7--;
            }
            if (iCharAt == 0 || (i2 = iArr2[0]) == 0) {
                cArr[0] = 0;
            } else {
                int[] iArr5 = ALOG;
                int[] iArr6 = LOG;
                cArr[0] = (char) iArr5[(iArr6[iCharAt] + iArr6[i2]) % 255];
            }
        }
        char[] cArr2 = new char[i];
        for (int i8 = 0; i8 < i; i8++) {
            cArr2[i8] = cArr[(i - i8) - 1];
        }
        return String.valueOf(cArr2);
    }

    public static String encodeECC200(String str, SymbolInfo symbolInfo) {
        if (str.length() != symbolInfo.getDataCapacity()) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb = new StringBuilder(symbolInfo.getDataCapacity() + symbolInfo.getErrorCodewords());
        sb.append(str);
        int interleavedBlockCount = symbolInfo.getInterleavedBlockCount();
        if (interleavedBlockCount == 1) {
            sb.append(createECCBlock(str, symbolInfo.getErrorCodewords()));
        } else {
            sb.setLength(sb.capacity());
            int[] iArr = new int[interleavedBlockCount];
            int[] iArr2 = new int[interleavedBlockCount];
            int i = 0;
            while (i < interleavedBlockCount) {
                int i2 = i + 1;
                iArr[i] = symbolInfo.getDataLengthForInterleavedBlock(i2);
                iArr2[i] = symbolInfo.getErrorLengthForInterleavedBlock(i2);
                i = i2;
            }
            for (int i3 = 0; i3 < interleavedBlockCount; i3++) {
                StringBuilder sb2 = new StringBuilder(iArr[i3]);
                for (int i4 = i3; i4 < symbolInfo.getDataCapacity(); i4 += interleavedBlockCount) {
                    sb2.append(str.charAt(i4));
                }
                String strCreateECCBlock = createECCBlock(sb2.toString(), iArr2[i3]);
                int i5 = 0;
                int i6 = i3;
                while (i6 < iArr2[i3] * interleavedBlockCount) {
                    sb.setCharAt(symbolInfo.getDataCapacity() + i6, strCreateECCBlock.charAt(i5));
                    i6 += interleavedBlockCount;
                    i5++;
                }
            }
        }
        return sb.toString();
    }
}
