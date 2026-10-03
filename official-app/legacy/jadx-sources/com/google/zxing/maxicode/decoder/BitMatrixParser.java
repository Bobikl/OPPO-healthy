package com.google.zxing.maxicode.decoder;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import com.alipay.sdk.m.u.a;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.cloud.sdk.cloudstorage.http.ServerException;
import com.garmin.fit.e;
import com.garmin.fit.i;
import com.google.zxing.common.BitMatrix;
import com.heytap.health.protocol.fitness.FitnessProto$FitnessCmdId;
import com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoCmdId;
import com.heytap.health.wallet.widget.CircleNetworkImageView;
import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.heytap.health.watchface.adaptation.common.ConfigHolder;
import com.heytap.nearx.uikit.widget.NearHintRedDot;
import com.heytap.speech.engine.constant.Constant;
import com.heytap.sports.home.compose.SportsKeepListComposeKt;
import com.heytap.sports.move.moving.MovingDataPanelKt;
import com.heytap.store.base.core.state.Constants;
import com.heytap.store.homemodule.data.HomeResponseData;
import com.lifesense.plugin.ble.data.tracker.ATDataProfile;
import com.lifesense.weidong.lzsimplenetlibs.net.invoker.HttpStatus;
import com.omron.lib.ohc.OHQDeviceManager;
import com.oplus.aiunit.vision.hf2;
import com.oplus.aiunit.vision.hq8;
import com.oplus.aiunit.vision.ixb;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.oei;
import com.oplus.aiunit.vision.uvd;
import com.oplus.aiunit.vision.weg;
import com.oplus.aiunit.vision.yo3;
import com.oplus.backup.sdk.common.utils.ModuleType;
import com.oplus.drs.core.net.entity.UploadStateAware;

/* JADX INFO: loaded from: classes14.dex */
final class BitMatrixParser {
    private static final int[][] BITNR = {new int[]{121, 120, 127, 126, 133, 132, 139, ATDataProfile.CMD_BLOOD_OXYGEN_RECORD, 145, 144, 151, 150, e.TotalFractionalDescentFieldNum, 156, 163, 162, 169, 168, 175, 174, 181, 180, 187, 186, 193, 192, 199, 198, -2, -2}, new int[]{123, 122, 129, 128, 135, 134, 141, 140, 147, 146, 153, 152, 159, 158, 165, 164, 171, 170, 177, 176, 183, 182, FitnessProto$FitnessCmdId.CMD_MCU_BREATHE_RATE_VALUE, 188, 195, 194, 201, 200, HomeResponseData.MODEL_CODE_RECOMMEND_FLOW, -3}, new int[]{125, 124, 131, 130, 137, 136, 143, 142, 149, 148, i.O2ToxicityFieldNum, 154, 161, 160, 167, 166, 173, 172, 179, 178, 185, 184, FitnessProto$FitnessCmdId.CMD_MCU_AUTO_PAUSE_SPORT_VALUE, 190, 197, FitnessProto$FitnessCmdId.CMD_MCU_BUTTON_TO_PAUSE_OR_RESUME_VALUE, 203, 202, HomeResponseData.MODEL_CODE_PRODUCT_GRID, HomeResponseData.MODEL_CODE_RECOMMEND_FLOW_TABS}, new int[]{283, 282, 277, 276, 271, 270, 265, ixb.EXERCISE_TITLE, 259, 258, 253, 252, 247, 246, 241, 240, 235, 234, 229, 228, 223, 222, 217, 216, 211, 210, 205, 204, 819, -3}, new int[]{ixb.JUMP, 284, 279, 278, Constants.QR_REQUEST_CODE, 272, 267, 266, com.oplus.mydevices.sdk.Constants.LINKAGE_MANUAL_SET_ACTIVE, com.oplus.mydevices.sdk.Constants.LINKAGE_SET_ACTIVE, 255, 254, 249, 248, 243, 242, FitnessProto$FitnessCmdId.CMD_SUNLIGHT_STAT_VALUE, FitnessProto$FitnessCmdId.CMD_SUNLIGHT_DETAIL_VALUE, yo3.FILE_SEND_FAIL, 230, 225, oei.TAI_CHI, 219, 218, 213, 212, 207, 206, HomeResponseData.MODEL_CODE_BANNER, 820}, new int[]{287, 286, 281, 280, ixb.SLEEP_LEVEL, 274, ixb.SPO2_DATA, 268, 263, ixb.DIVE_ALARM, 257, 256, Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER, 250, UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE, Proto$SyncEventMessage.OUTFIT_WF_VERSION_FIELD_NUMBER, 239, 238, 233, 232, 227, 226, 221, 220, 215, 214, 209, 208, HomeResponseData.MODEL_CODE_PORTRAIT_PIC, -3}, new int[]{ixb.AAD_ACCEL_FEATURES, ModuleType.TYPE_CLOCK, 295, 294, 301, 300, 307, 306, 313, 312, ixb.TANK_UPDATE, TypedValues.AttributesType.TYPE_PIVOT_TARGET, 325, 324, 331, 330, 337, ModuleType.TYPE_ACCOUNT, 343, 342, 349, 348, 355, 354, 361, 360, hf2.DISAPPEAR_DURATION, 366, HomeResponseData.MODEL_CODE_CUBE_PIC, HomeResponseData.MODEL_CODE_HORIZONTAL_PIC}, new int[]{291, 290, ixb.RESPIRATION_RATE, 296, 303, 302, 309, 308, 315, 314, 321, 320, 327, 326, 333, 332, 339, 338, 345, 344, 351, 350, 357, 356, 363, 362, 369, 368, HomeResponseData.MODEL_CODE_VIDEO, -3}, new int[]{293, uvd.REQUEST_CODE_RETRY_NET, 299, 298, 305, 304, 311, 310, 317, TypedValues.AttributesType.TYPE_PATH_ROTATE, ixb.TANK_SUMMARY, 322, 329, SportsKeepListComposeKt.IMG_DEFAULT_WIDTH, 335, 334, 341, 340, 347, ixb.SLEEP_ASSESSMENT, 353, ModuleType.TYPE_LAUNCHER, 359, 358, 365, 364, ixb.HRV_VALUE, ixb.HRV_STATUS_SUMMARY, 827, HomeResponseData.MODEL_CODE_IMMERSIVE_CAROUSEL}, new int[]{409, 408, 403, 402, 397, 396, 391, 390, 79, 78, -2, -2, 13, 12, 37, 36, 2, -1, 44, 43, 109, 108, 385, ModuleType.TYPE_SYSTEM_SETTING, 379, 378, 373, ixb.RAW_BBI, HomeResponseData.MODEL_CODE_HOT_ZONE, -3}, new int[]{411, 410, 405, 404, 399, ixb.SKIN_TEMP_OVERNIGHT, ixb.DIVE_APNEA_ALARM, 392, 81, 80, 40, -2, 15, 14, 39, 38, 3, -1, -1, 45, 111, 110, ixb.CHRONO_SHOT_SESSION, 386, 381, 380, ixb.DEVICE_AUX_BATTERY_INFO, 374, 830, 829}, new int[]{HttpStatus.SC_REQUEST_TOO_LONG, 412, 407, 406, 401, 400, 395, 394, 83, 82, 41, -3, -3, -3, -3, -3, 5, 4, 47, 46, 113, 112, ixb.HSA_CONFIGURATION_DATA, ixb.CHRONO_SHOT_DATA, 383, 382, 377, ixb.HSA_GYROSCOPE_DATA, HomeResponseData.MODEL_CODE_LANTERN, -3}, new int[]{HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE, HttpStatus.SC_REQUEST_URI_TOO_LONG, 421, 420, 427, 426, 103, 102, 55, 54, 16, -3, -3, -3, -3, -3, -3, -3, 20, 19, 85, 84, UploadStateAware.HTTP_REQUEST_EXPIRED, UploadStateAware.HTTP_URL_APPID_INVALID, 439, 438, 445, 444, HomeResponseData.MODEL_CODE_ANNOUNCEMENT, HomeResponseData.MODEL_CODE_BRAND}, new int[]{HttpStatus.SC_EXPECTATION_FAILED, 416, 423, 422, UploadStateAware.HTTP_RATE_LIMIT, 428, 105, 104, 57, 56, -3, -3, -3, -3, -3, -3, -3, -3, 22, 21, 87, 86, UploadStateAware.HTTP_INVALID_SOURCE_SDK_TYPE, UploadStateAware.HTTP_URL_SIGN_INVALID, UploadStateAware.HTTP_DECOMPRESS_FAILED, UploadStateAware.HTTP_DECRYPT_FAILED, 447, Constant.PORT_DEV, HomeResponseData.MODEL_CODE_SERVICE, -3}, new int[]{HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 418, TypedValues.CycleType.TYPE_WAVE_PHASE, 424, UploadStateAware.HTTP_URL_TIMESTAMP_INVALID, UploadStateAware.HTTP_NOT_ENOUGH_URL_PARAMS, 107, 106, 59, 58, -3, -3, -3, -3, -3, -3, -3, -3, -3, 23, 89, 88, 437, 436, 443, UploadStateAware.HTTP_DESERIALIZE_FAILED, 449, MovingDataPanelKt.MOVING_PANEL_MAX_HEIGHT_DP, HomeResponseData.MODEL_CODE_MULTI_TWO_IN_A_ROW, HomeResponseData.MODEL_CODE_ONE_HALF_CARD}, new int[]{481, 480, 475, 474, 469, 468, 48, -2, 30, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 0, 53, 52, 463, 462, 457, 456, UploadStateAware.HTTP_NO_HEAD_FOUND, 450, 837, -3}, new int[]{483, 482, 477, ConfigHolder.DEFAULT_WATCH_HEIGHT, 471, 470, 49, -1, -2, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, -2, -1, 465, 464, 459, 458, UploadStateAware.HTTP_BODY_INVALID, UploadStateAware.HTTP_NO_BODY_FOUND, 839, HomeResponseData.MODEL_CODE_NEAR_SHOP}, new int[]{485, 484, 479, 478, 473, 472, 51, 50, 31, -3, -3, -3, -3, -3, -3, -3, -3, -3, -3, 1, -2, 42, 467, 466, 461, a.i, UploadStateAware.HTTP_NO_DECODE_BODY_FOUND, UploadStateAware.HTTP_HQUEUE_WRITE_FAILED, 840, -3}, new int[]{487, 486, 493, 492, 499, 498, 97, 96, 61, 60, -3, -3, -3, -3, -3, -3, -3, -3, -3, 26, 91, 90, 505, 504, FrameMetricsAggregator.EVERY_DURATION, TypedValues.PositionType.TYPE_POSITION_TYPE, k18.GL_NOTEQUAL, k18.GL_GREATER, HomeResponseData.MODEL_CODE_COUPON, HomeResponseData.MODEL_CODE_NEW_APPOINT}, new int[]{489, 488, 495, 494, 501, 500, 99, 98, 63, 62, -3, -3, -3, -3, -3, -3, -3, -3, 28, 27, 93, 92, 507, 506, 513, 512, k18.GL_ALWAYS, k18.GL_GEQUAL, HomeResponseData.MODEL_CODE_LIVE_CARD, -3}, new int[]{491, 490, 497, 496, 503, 502, 101, 100, 65, 64, 17, -3, -3, -3, -3, -3, -3, -3, 18, 29, 95, 94, 509, TypedValues.PositionType.TYPE_CURVE_FIT, 515, 514, 521, NearHintRedDot.RED_POINT_ANIM_DURATION, HomeResponseData.MODE_CODE_INTEGRAL_EXP, 844}, new int[]{559, UploadStateAware.HTTP_KAFKA_CLUSTER_INIT_FAILED, 553, 552, 547, 546, 541, hq8.WORST_100MI_PACE, 73, 72, 32, -3, -3, -3, -3, -3, -3, 10, 67, 66, 115, 114, 535, 534, 529, 528, 523, 522, 846, -3}, new int[]{561, 560, 555, 554, 549, 548, 543, 542, 75, 74, -2, -1, 7, 6, 35, 34, 11, -2, 69, 68, 117, 116, UploadStateAware.HTTP_NO_SUITABLE_SENDER, 536, 531, 530, 525, 524, 848, 847}, new int[]{563, 562, UploadStateAware.HTTP_PUSH_KAFKA_TIMEOUT, UploadStateAware.HTTP_PUSH_KAFKA_FAILED, 551, 550, 545, 544, 77, 76, -2, 33, 9, 8, 25, 24, -1, -2, 71, 70, 119, 118, 539, 538, 533, 532, 527, OHQDeviceManager.DEFAULT_CONSENT_CODE, 849, -3}, new int[]{565, 564, 571, 570, 577, CircleNetworkImageView.IMG_TYPE_RECT_TANGLE, 583, com.heytap.usercenter.accountsdk.helper.Constants.REQUEST_CODE_MODIFY_ACCOUNTNAME, 589, 588, 595, 594, 601, 600, 607, 606, oei.PADEL_TENNIS, 612, 619, 618, 625, 624, 631, 630, 637, 636, 643, 642, HomeResponseData.MODEL_CODE_SWITCH, 850}, new int[]{567, 566, 573, 572, 579, 578, 585, 584, 591, 590, 597, 596, 603, 602, 609, 608, 615, 614, 621, 620, 627, 626, 633, 632, 639, 638, 645, 644, HomeResponseData.MODEL_CODE_CONFIG, -3}, new int[]{569, 568, 575, 574, 581, 580, 587, 586, 593, ModuleType.TYPE_CONTACTS_BLACKLIST, ServerException.SERVICE_BLOCK_PUT_FAILED, ServerException.SERVICE_READ_TIMEOUT, 605, 604, 611, 610, 617, 616, 623, 622, 629, 628, 635, 634, 641, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 647, 646, 854, 853}, new int[]{727, 726, 721, 720, 715, 714, 709, 708, 703, 702, 697, 696, 691, 690, 685, 684, 679, 678, 673, 672, 667, 666, 661, 660, 655, 654, 649, 648, 855, -3}, new int[]{729, 728, 723, 722, 717, 716, 711, 710, 705, 704, 699, 698, 693, 692, 687, 686, 681, 680, 675, 674, 669, 668, 663, 662, 657, 656, 651, 650, 857, 856}, new int[]{731, 730, 725, 724, 719, 718, 713, 712, 707, 706, 701, 700, 695, 694, 689, 688, 683, 682, 677, 676, 671, 670, 665, 664, 659, 658, 653, 652, 858, -3}, new int[]{733, 732, 739, 738, 745, 744, 751, weg.WINDOW_MORNING_PEAK_END, 757, 756, 763, 762, k18.GL_ONE_MINUS_SRC_COLOR, 768, k18.GL_ONE_MINUS_DST_COLOR, k18.GL_DST_COLOR, 781, 780, 787, 786, 793, 792, 799, 798, 805, 804, HomeResponseData.MODEL_CODE_TWO_IN_A_ROW, 810, 860, 859}, new int[]{735, 734, 741, 740, 747, 746, 753, 752, 759, 758, 765, 764, k18.GL_ONE_MINUS_SRC_ALPHA, k18.GL_SRC_ALPHA, 777, k18.GL_SRC_ALPHA_SATURATE, 783, 782, 789, 788, 795, 794, 801, 800, oei.WATER_POLO, oei.ROWING, HomeResponseData.MODEL_CODE_ONE_IN_A_ROW, HomeResponseData.MODEL_CODE_THREE_IN_A_ROW, 861, -3}, new int[]{737, 736, 743, 742, 749, 748, 755, 754, 761, 760, 767, 766, k18.GL_ONE_MINUS_DST_ALPHA, k18.GL_DST_ALPHA, 779, 778, 785, 784, 791, 790, 797, 796, 803, 802, oei.OPEN_WATER_SWIM, oei.DIVING, HomeResponseData.MODEL_CODE_SCROLLABLE_LINE, HomeResponseData.MODEL_CODE_SEA_VIEW_ROOM, 863, 862}};
    private final BitMatrix bitMatrix;

    public BitMatrixParser(BitMatrix bitMatrix) {
        this.bitMatrix = bitMatrix;
    }

    public byte[] readCodewords() {
        byte[] bArr = new byte[144];
        int height = this.bitMatrix.getHeight();
        int width = this.bitMatrix.getWidth();
        for (int i = 0; i < height; i++) {
            int[] iArr = BITNR[i];
            for (int i2 = 0; i2 < width; i2++) {
                int i3 = iArr[i2];
                if (i3 >= 0 && this.bitMatrix.get(i2, i)) {
                    int i4 = i3 / 6;
                    bArr[i4] = (byte) (((byte) (1 << (5 - (i3 % 6)))) | bArr[i4]);
                }
            }
        }
        return bArr;
    }
}
