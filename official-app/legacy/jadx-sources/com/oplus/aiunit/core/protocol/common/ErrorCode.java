package com.oplus.aiunit.core.protocol.common;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import com.heytap.health.watch.notification.impl.ui.j;

/* JADX INFO: loaded from: classes3.dex */
public enum ErrorCode {
    UNKNOWN(-1),
    kErrorNone(0),
    kErrorOperationNoPerm(1),
    kErrorNoSuchFileOrDirectory(2),
    kErrorIOError(5),
    kErrorParamLengthMismatch(7),
    kErrorNoMemory(12),
    kErrorPermissionDenied(13),
    kErrorBusy(16),
    kErrorFileExists(17),
    kErrorNotADirectory(20),
    kErrorIsADirectory(21),
    kErrorInvalidParam(22),
    kErrorTooManyFiles(24),
    kErrorFileTooBig(27),
    kErrorReadOnlyFile(30),
    kErrorOutOfMathDomain(33),
    kErrorOutOfMathRange(34),
    kErrorFileNameTooLong(36),
    kErrorMethodNotImplement(38),
    kErrorDirectoryNotEmpty(39),
    kErrorNoDataAvailable(61),
    kErrorTimeOut(62),
    kErrorOutOfResources(63),
    kErrorCommunication(70),
    kErrorProtocol(71),
    kErrorCannotExecASharedLib(83),
    kErrorNoBufferSpace(105),
    kErrorRemoteDead(106),
    KErrorNetworkUnavailable(107),
    kErrorStop(108),
    kErrorRequestLimit(109),
    kErrorCancelledByUser(110),
    kErrorEnvFailed(200),
    kErrorGetRuntime(201),
    kErrorInterrupt(202),
    kErrorNewTask(203),
    kErrorScheduleApi(204),
    kErrorTaskPending(205),
    kErrorRepeatedTask(206),
    kErrorInvalidTask(207),
    kErrorRepeatedLlmTask(208),
    kErrorEnvBattery(211),
    kErrorEnvMemory(212),
    kErrorEnvGaming(213),
    kErrorEnvNetwork(214),
    kErrorEnvPower(215),
    kErrorEnvTemperature(216),
    kErrorScreenState(217),
    kErrorLlmOapAlive(218),
    kErrorChargeState(219),
    kErrorEngineNotFound(300),
    kErrorConfigFileInvalid(301),
    kErrorConfigInvalid(302),
    kErrorModelFileNotFound(303),
    kErrorModelFileInvalid(304),
    kErrorInvalidServiceState(305),
    kErrorCodeExpiration(306),
    kErrorNotReady(307),
    kErrorVersionMismatch(308),
    kErrorServiceVersionOutOfDate(309),
    kErrorClientVersionOutOfDate(310),
    kErrorNoNeed(311),
    kErrorPluginVersion(312),
    kErrorPluginManifest(313),
    kErrorCheckSumInvalid(314),
    kErrorOaaNotFound(350),
    kErrorNotInit(400),
    kErrorPluginNotFound(401),
    kErrorPluginNoVersion(402),
    kErrorPluginNoPluginImplementation(403),
    kErrorPluginClassNotInstantiation(404),
    kErrorAssetsFilesIllegal(405),
    kErrorAssetsCopyFailed(406),
    kErrorPluginLoadFailed(407),
    kErrorNoClassLoader(408),
    kErrorNoPluginContext(409),
    kErrorPluginPathNotExists(410),
    KErrorClassNotFound(411),
    kErrorMDPError(500),
    kErrorSynchronizeFailed(501),
    kErrorPluginNotUsable(502),
    kErrorFileCRCError(503),
    kErrorNoUpdate(504),
    kErrorNoRemoteConfig(505),
    kErrorConfigNotIllegalNoDownloadParam(506),
    kErrorDownloadError(507),
    kErrorSyncFailed(TypedValues.PositionType.TYPE_CURVE_FIT),
    kErrorDetectorHasEmptyEngine(509),
    kErrorDetectorUpdateSubEngineFailed(TypedValues.PositionType.TYPE_POSITION_TYPE),
    kErrorUnknownConfig(FrameMetricsAggregator.EVERY_DURATION),
    kErrorDownloadNotAllowed(512),
    kErrorUpdateInMainThread(513),
    kErrorUpdateButNoListener(514),
    kErrorUpdateWaitFailed(515),
    kErrorRouteDisabled(600),
    kErrorRouteNotFound(601),
    kErrorApiLevelNotSupported(700),
    kErrorSdkVersionNotSupported(701),
    kErrorAIUnitVersionNotSupported(702),
    kErrorOSVersionNotSupported(703),
    kErrorDeviceNotSupported(704),
    kErrorUnitNotFound(800),
    kErrorDetectorNotFound(801),
    kErrorAuthorizeFail(802),
    kErrorRouterFail(803),
    kErrorAttachFail(804),
    kErrorProcessFail(805),
    kErrorLowMemory(900),
    kErrorLowBattery(901),
    kErrorLowPowerSaveModel(902),
    kErrorOverload(903),
    kErrorHighTemperature(904),
    kErrorUserForceLocal(905),
    kErrorPrivacyReject(906),
    kErrorUrlEmpty(907),
    kErrorNoInternet(j.VIEW_TYPE_SWITCH_FLASHBACK),
    kErrorNoDownload(951),
    kErrorSwitchClose(952),
    kErrorNoApply(953),
    kErrorApplying(954),
    kErrorApplyFail(955),
    kErrorNoAccount(956),
    kErrorOffline(957),
    kErrorDetectNotInit(958),
    kErrorDetectNotAvailable(959),
    kErrorInProcessing(960),
    kErrorDetectNotInstalled(961),
    kErrorConcurrencyError(962);

    private int value;

    ErrorCode(int i) {
        this.value = i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    public static ErrorCode find(int i) {
        ErrorCode errorCode;
        for (int i2 = 0; i2 < values().length; i2++) {
            if (values()[i2].equals(i)) {
                errorCode = values()[i2];
                if (errorCode == null) {
                    return UNKNOWN;
                }
                return errorCode;
            }
        }
        errorCode = null;
        if (errorCode == null) {
            return UNKNOWN;
        }
        return errorCode;
    }

    public boolean equals(int i) {
        return this.value == i;
    }

    public int value() {
        return this.value;
    }
}
