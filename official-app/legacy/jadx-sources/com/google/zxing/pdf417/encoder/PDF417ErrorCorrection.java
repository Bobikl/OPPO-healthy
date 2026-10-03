package com.google.zxing.pdf417.encoder;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import com.alipay.sdk.m.u.a;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.cloud.sdk.cloudstorage.http.ServerException;
import com.garmin.fit.e;
import com.garmin.fit.i;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.PDF417Common;
import com.heytap.health.protocol.fitness.FitnessProto$FitnessCmdId;
import com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoCmdId;
import com.heytap.health.wallet.widget.CircleNetworkImageView;
import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.heytap.health.watchface.adaptation.common.ConfigHolder;
import com.heytap.nearx.tangramconfig.net.IResponse;
import com.heytap.nearx.uikit.widget.NearHintRedDot;
import com.heytap.sports.home.compose.SportsKeepListComposeKt;
import com.heytap.store.base.core.state.Constants;
import com.heytap.store.homemodule.data.HomeResponseData;
import com.lifesense.plugin.ble.data.tracker.ATDataProfile;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.HttpStatus;
import com.oplus.aiunit.vision.hq8;
import com.oplus.aiunit.vision.ixb;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.oei;
import com.oplus.aiunit.vision.uvd;
import com.oplus.aiunit.vision.yo3;
import com.oplus.backup.sdk.common.utils.ModuleType;
import com.oplus.drs.core.net.entity.UploadStateAware;

/* JADX INFO: loaded from: classes14.dex */
final class PDF417ErrorCorrection {
    private static final int[][] EC_COEFFICIENTS = {new int[]{27, 917}, new int[]{522, 568, 723, oei.OPEN_WATER_SWIM}, new int[]{FitnessProto$FitnessCmdId.CMD_SUNLIGHT_STAT_VALUE, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, ServerException.SERVICE_BLOCK_PUT_FAILED, 524, 801, 132, 295, 116, UploadStateAware.HTTP_DESERIALIZE_FAILED, 428, 295, 42, 176, 65}, new int[]{361, 575, IResponse.RESPONSE_CODE_SSL_PROTOCOL, 525, 176, 586, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 321, 536, 742, 677, 742, 687, 284, 193, k18.GL_NOTEQUAL, Constants.QR_REQUEST_CODE, 494, 263, 147, 593, 800, 571, 320, 803, 133, yo3.FILE_SEND_FAIL, 390, 685, 330, 63, 410}, new int[]{539, 422, 6, 93, 862, k18.GL_ONE_MINUS_SRC_ALPHA, UploadStateAware.HTTP_BODY_INVALID, 106, 610, 287, 107, 505, 733, 877, 381, 612, 723, ConfigHolder.DEFAULT_WATCH_HEIGHT, 462, 172, UploadStateAware.HTTP_NOT_ENOUGH_URL_PARAMS, 609, 858, HomeResponseData.MODEL_CODE_PORTRAIT_PIC, 543, ixb.HSA_GYROSCOPE_DATA, FrameMetricsAggregator.EVERY_DURATION, 400, 672, 762, 283, 184, UploadStateAware.HTTP_DECRYPT_FAILED, 35, k18.GL_ALWAYS, 31, a.i, 594, 225, 535, k18.GL_NOTEQUAL, ModuleType.TYPE_LAUNCHER, 605, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, k18.GL_ONE_MINUS_SRC_ALPHA, 840, 629, 4, 381, HomeResponseData.MODEL_CODE_LIVE_CARD, 623, ixb.EXERCISE_TITLE, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, HomeResponseData.MODEL_CODE_PORTRAIT_PIC, 93, 217, 208, PDF417Common.MAX_CODEWORDS_IN_BARCODE, Proto$SyncEventMessage.OUTFIT_WF_VERSION_FIELD_NUMBER, 583, 620, 246, 148, 447, 631, uvd.REQUEST_CODE_RETRY_NET, oei.ROPE_SKIPPING, 490, 704, k18.GL_GREATER, 258, 457, 907, 594, 723, 674, uvd.REQUEST_CODE_RETRY_NET, 272, 96, 684, UploadStateAware.HTTP_URL_APPID_INVALID, 686, 606, 860, 569, 193, 219, 129, 186, FitnessProto$FitnessCmdId.CMD_SUNLIGHT_DETAIL_VALUE, 287, 192, k18.GL_ONE_MINUS_DST_COLOR, 278, 173, 40, 379, 712, 463, 646, k18.GL_SRC_ALPHA_SATURATE, 171, 491, ixb.RESPIRATION_RATE, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, HomeResponseData.MODEL_CODE_BANNER, oei.DIVING, 898, 784, 663, 627, 378, 382, ixb.DIVE_ALARM, 380, 602, 754, ModuleType.TYPE_ACCOUNT, 89, 614, 87, UploadStateAware.HTTP_URL_APPID_INVALID, 670, 616, e.TotalFractionalDescentFieldNum, 374, 242, 726, 600, ixb.SPO2_DATA, ixb.DEVICE_AUX_BATTERY_INFO, 898, HomeResponseData.MODE_CODE_INTEGRAL_EXP, UploadStateAware.HTTP_HQUEUE_WRITE_FAILED, 354, 130, HomeResponseData.MODEL_CODE_SEA_VIEW_ROOM, 587, 804, 34, 211, 330, 539, ixb.RESPIRATION_RATE, 827, 865, 37, k18.GL_NOTEQUAL, HomeResponseData.MODEL_CODE_SERVICE, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, ATDataProfile.CMD_BLOOD_OXYGEN_RECORD, 720, 858, 194, 311, 913, ixb.SLEEP_LEVEL, 190, ixb.DEVICE_AUX_BATTERY_INFO, 850, 438, 733, 194, 280, 201, 280, HomeResponseData.MODEL_CODE_HOT_ZONE, 757, 710, HomeResponseData.MODEL_CODE_SEA_VIEW_ROOM, 919, 89, 68, 569, 11, 204, 796, 605, hq8.WORST_100MI_PACE, 913, 801, 700, 799, 137, 439, 418, ModuleType.TYPE_CONTACTS_BLACKLIST, 668, 353, 859, ixb.HRV_STATUS_SUMMARY, 694, 325, 240, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, HomeResponseData.MODEL_CODE_THREE_IN_A_ROW, 684, 461, 334, ixb.HSA_GYROSCOPE_DATA, 849, 521, 307, 291, 803, 712, 19, 358, 399, oei.ROPE_SKIPPING, 103, FrameMetricsAggregator.EVERY_DURATION, 51, 8, k18.GL_NOTEQUAL, 225, ixb.AAD_ACCEL_FEATURES, 470, 637, 731, 66, 255, 917, ixb.SPO2_DATA, 463, 830, 730, UploadStateAware.HTTP_REQUEST_EXPIRED, 848, 585, 136, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, 320, 479, 130, 739, 71, 263, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 374, 601, 192, 605, 142, 673, 687, 234, 722, ModuleType.TYPE_SYSTEM_SETTING, 177, 752, 607, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, UploadStateAware.HTTP_NO_DECODE_BODY_FOUND, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, com.oplus.mydevices.sdk.Constants.LINKAGE_MANUAL_SET_ACTIVE, HomeResponseData.MODEL_CODE_CONFIG, 655, 309, 697, 755, 756, 60, yo3.FILE_SEND_FAIL, k18.GL_ONE_MINUS_DST_ALPHA, UploadStateAware.HTTP_URL_SIGN_INVALID, 421, 726, 528, 503, 118, 49, 795, 32, 144, 500, 238, HomeResponseData.MODEL_CODE_MULTI_TWO_IN_A_ROW, 394, 280, 566, ixb.TANK_UPDATE, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, 609, UploadStateAware.HTTP_DECOMPRESS_FAILED, 180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, ixb.RESPIRATION_RATE, 134, 54, HomeResponseData.MODEL_CODE_SERVICE, 299, IResponse.RESPONSE_CODE_SSL_PROTOCOL, FitnessProto$FitnessCmdId.CMD_MCU_AUTO_PAUSE_SPORT_VALUE, 910, 532, 609, 829, FitnessProto$FitnessCmdId.CMD_MCU_BREATHE_RATE_VALUE, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, 173, 404, Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER, 688, 95, 497, 555, 642, 543, 307, 159, IResponse.RESPONSE_CODE_SSL, UploadStateAware.HTTP_KAFKA_CLUSTER_INIT_FAILED, 648, 55, 497, 10}, new int[]{ModuleType.TYPE_LAUNCHER, 77, 373, 504, 35, ServerException.SERVICE_BLOCK_PUT_FAILED, 428, 207, 409, 574, 118, 498, ixb.JUMP, 380, 350, 492, 197, 265, IResponse.RESPONSE_CODE_SSL_HAND_SHAKE, i.O2ToxicityFieldNum, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, ModuleType.TYPE_LAUNCHER, 781, 846, 75, 327, NearHintRedDot.RED_POINT_ANIM_DURATION, UploadStateAware.HTTP_INVALID_SOURCE_SDK_TYPE, 543, 203, 666, 249, ixb.SLEEP_ASSESSMENT, 781, 621, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 268, 794, 534, 539, 781, 408, 390, 644, 102, ConfigHolder.DEFAULT_WATCH_HEIGHT, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, ixb.AAD_ACCEL_FEATURES, 122, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, ixb.RESPIRATION_RATE, UploadStateAware.HTTP_NO_HEAD_FOUND, 593, 913, 142, oei.DIVING, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, 513, 192, k18.GL_GREATER, 258, 240, k18.GL_GEQUAL, 794, 395, 768, 848, 51, 610, ModuleType.TYPE_SYSTEM_SETTING, 168, 190, HomeResponseData.MODEL_CODE_IMMERSIVE_CAROUSEL, SportsKeepListComposeKt.IMG_DEFAULT_WIDTH, 596, 786, 303, 570, 381, HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, 641, 156, FitnessProto$FitnessCmdId.CMD_SUNLIGHT_STAT_VALUE, 151, UploadStateAware.HTTP_RATE_LIMIT, 531, 207, 676, 710, 89, 168, 304, 402, 40, 708, 575, 162, 864, 229, 65, 861, HomeResponseData.MODEL_CODE_NEW_APPOINT, 512, 164, 477, 221, 92, 358, 785, ModuleType.TYPE_CLOCK, 357, 850, HomeResponseData.MODEL_CODE_MULTI_TWO_IN_A_ROW, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, HomeResponseData.MODEL_CODE_SWITCH, 543, 152, 729, k18.GL_ONE_MINUS_SRC_ALPHA, 95, 248, 361, 578, ixb.TANK_SUMMARY, 856, 797, ixb.AAD_ACCEL_FEATURES, 51, 684, 466, 533, 820, 669, 45, 902, UploadStateAware.HTTP_NO_BODY_FOUND, 167, 342, Proto$SyncEventMessage.OUTFIT_WF_VERSION_FIELD_NUMBER, 173, 35, 463, 651, 51, 699, 591, UploadStateAware.HTTP_NO_BODY_FOUND, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, 420, UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE, ModuleType.TYPE_CLOCK, 594, 394, FrameMetricsAggregator.EVERY_DURATION, 327, 589, 777, 699, 688, 43, 408, HomeResponseData.MODEL_CODE_COUPON, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, HttpStatus.SC_EXPECTATION_FAILED, 158, 209, 563, 564, 343, 693, 109, 608, 563, 365, 181, k18.GL_DST_ALPHA, 677, 310, 248, 353, 708, 410, 579, 870, 617, HomeResponseData.MODEL_CODE_NEW_APPOINT, 632, 860, ixb.AAD_ACCEL_FEATURES, 536, 35, 777, 618, 586, 424, HomeResponseData.MODEL_CODE_ANNOUNCEMENT, 77, 597, ixb.SLEEP_ASSESSMENT, ixb.SPO2_DATA, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, oei.PADEL_TENNIS, 830, IResponse.RESPONSE_CODE_SSL_PROTOCOL, 437, k18.GL_ALWAYS, 644, 905, 789, 420, 305, UploadStateAware.HTTP_DECOMPRESS_FAILED, 207, 300, 892, 827, 141, UploadStateAware.HTTP_NO_SUITABLE_SENDER, 381, 662, 513, 56, 252, 341, 242, 797, HomeResponseData.MODEL_CODE_NEAR_SHOP, 837, 720, oei.TAI_CHI, 307, 631, 61, 87, 560, 310, 756, 665, 397, oei.DIVING, HomeResponseData.MODEL_CODE_SWITCH, 309, 473, 795, 378, 31, 647, 915, 459, oei.ROWING, 590, 731, TypedValues.CycleType.TYPE_WAVE_PHASE, 216, 548, 249, 321, 881, 699, 535, 673, 782, 210, HomeResponseData.MODEL_CODE_SCROLLABLE_LINE, 905, 303, HomeResponseData.MODEL_CODE_LIVE_CARD, IResponse.RESPONSE_CODE_SSL_PROTOCOL, 281, 73, 469, 791, 660, 162, 498, 308, i.O2ToxicityFieldNum, 422, 907, HomeResponseData.MODEL_CODE_RECOMMEND_FLOW_TABS, 187, 62, 16, TypedValues.CycleType.TYPE_WAVE_PHASE, 535, ModuleType.TYPE_ACCOUNT, 286, 437, ixb.DEVICE_AUX_BATTERY_INFO, Constants.QR_REQUEST_CODE, 610, 296, 183, IResponse.RESPONSE_CODE_SSL_PEER_UNVERIFIED, 116, 667, 751, 353, 62, 366, 691, 379, 687, HomeResponseData.MODEL_CODE_COUPON, 37, 357, 720, 742, 330, 5, 39, IResponse.RESPONSE_CODE_SSL_PEER_UNVERIFIED, 311, 424, 242, 749, 321, 54, 669, TypedValues.AttributesType.TYPE_PATH_ROTATE, 342, 299, 534, 105, 667, 488, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 672, CircleNetworkImageView.IMG_TYPE_RECT_TANGLE, hq8.WORST_100MI_PACE, TypedValues.AttributesType.TYPE_PATH_ROTATE, 486, 721, 610, 46, 656, 447, 171, 616, 464, 190, 531, ixb.RESPIRATION_RATE, 321, 762, 752, 533, 175, 134, 14, 381, UploadStateAware.HTTP_REQUEST_EXPIRED, 717, 45, 111, 20, 596, 284, 736, ATDataProfile.CMD_BLOOD_OXYGEN_RECORD, 646, 411, 877, 669, 141, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, 768, 223, 849, 647, 63, 310, 863, Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER, 366, 304, 282, 738, 675, 410, ixb.HSA_CONFIGURATION_DATA, Proto$SyncEventMessage.OUTFIT_WF_VERSION_FIELD_NUMBER, 31, 121, 303, 263}};

    private PDF417ErrorCorrection() {
    }

    public static String generateErrorCorrection(CharSequence charSequence, int i) {
        int errorCorrectionCodewordCount = getErrorCorrectionCodewordCount(i);
        char[] cArr = new char[errorCorrectionCodewordCount];
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = errorCorrectionCodewordCount - 1;
            int iCharAt = (charSequence.charAt(i2) + cArr[i3]) % PDF417Common.NUMBER_OF_CODEWORDS;
            while (i3 > 0) {
                cArr[i3] = (char) ((cArr[i3 - 1] + (929 - ((EC_COEFFICIENTS[i][i3] * iCharAt) % PDF417Common.NUMBER_OF_CODEWORDS))) % PDF417Common.NUMBER_OF_CODEWORDS);
                i3--;
            }
            cArr[0] = (char) ((929 - ((iCharAt * EC_COEFFICIENTS[i][0]) % PDF417Common.NUMBER_OF_CODEWORDS)) % PDF417Common.NUMBER_OF_CODEWORDS);
        }
        StringBuilder sb = new StringBuilder(errorCorrectionCodewordCount);
        for (int i4 = errorCorrectionCodewordCount - 1; i4 >= 0; i4--) {
            char c2 = cArr[i4];
            if (c2 != 0) {
                cArr[i4] = (char) (929 - c2);
            }
            sb.append(cArr[i4]);
        }
        return sb.toString();
    }

    public static int getErrorCorrectionCodewordCount(int i) {
        if (i < 0 || i > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        return 1 << (i + 1);
    }

    public static int getRecommendedMinimumErrorCorrectionLevel(int i) throws WriterException {
        if (i <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        }
        if (i <= 40) {
            return 2;
        }
        if (i <= 160) {
            return 3;
        }
        if (i <= 320) {
            return 4;
        }
        if (i <= 863) {
            return 5;
        }
        throw new WriterException("No recommendation possible");
    }
}
