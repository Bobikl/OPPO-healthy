package com.oplus.drs.core.reconciliation;

import com.heytap.wallet.business.common.constant.ReturnCode;
import com.oplus.drs.core.net.entity.UploadStateAware;

/* JADX INFO: loaded from: classes6.dex */
public enum UploadFailReason {
    NONE(0, "No Upload Failure"),
    NETWORK_ERROR(1, "Network Error"),
    MISSING_SECRET(2, "Missing Secret"),
    INPUT_JSON_ERROR(3, "Input JSON Serialization Error"),
    OUTPUT_JSON_ERROR(4, "Output JSON Deserialization Error"),
    NO_NETWORK(5, "No Network Connection"),
    SERVER_GATEWAY_ERROR(6, "Server Gateway Error"),
    SERVER_BUSINESS_ERROR(7, "Server Business Error"),
    SERVER_APP_ID_NOT_SUPPORTED(8, "Server App ID Not Supported"),
    HTTP_4XX(9, "HTTP 4xx Client Error"),
    HTTP_429(UploadStateAware.HTTP_RATE_LIMIT, "HTTP 429 Rate Limit"),
    HTTP_5XX(10, "HTTP 5xx Server Error"),
    HTTP_400(400, "HTTP 400 Bad Request"),
    HTTP_403(403, "HTTP 403 Forbidden"),
    HTTP_404(404, "HTTP 404 Not Found"),
    HTTP_405(405, "HTTP 405 Method Not Allowed"),
    HTTP_430(UploadStateAware.HTTP_NOT_ENOUGH_URL_PARAMS, "HTTP 430 Not Enough URL Params"),
    HTTP_431(UploadStateAware.HTTP_URL_TIMESTAMP_INVALID, "HTTP 431 URL Timestamp Invalid"),
    HTTP_432(UploadStateAware.HTTP_URL_APPID_INVALID, "HTTP 432 AppId Invalid"),
    HTTP_433(UploadStateAware.HTTP_REQUEST_EXPIRED, "HTTP 433 Request Expired"),
    HTTP_434(UploadStateAware.HTTP_URL_SIGN_INVALID, "HTTP 434 URL Sign Invalid"),
    HTTP_435(UploadStateAware.HTTP_INVALID_SOURCE_SDK_TYPE, "HTTP 435 Invalid SDK Source Type"),
    HTTP_440(UploadStateAware.HTTP_DECRYPT_FAILED, "HTTP 440 Decrypt Failed"),
    HTTP_441(UploadStateAware.HTTP_DECOMPRESS_FAILED, "HTTP 441 Decompress Failed"),
    HTTP_442(UploadStateAware.HTTP_DESERIALIZE_FAILED, "HTTP 442 Deserialize Failed"),
    HTTP_443(443, "HTTP 443 Invalid Protocol"),
    HTTP_444(444, "HTTP 444 Base64 Decode Failed"),
    HTTP_450(450, "HTTP 450 Parse JSON Failed"),
    HTTP_451(UploadStateAware.HTTP_NO_HEAD_FOUND, "HTTP 451 No Head Found"),
    HTTP_452(UploadStateAware.HTTP_NO_BODY_FOUND, "HTTP 452 No Body Found"),
    HTTP_453(UploadStateAware.HTTP_BODY_INVALID, "HTTP 453 Body Invalid"),
    HTTP_454(UploadStateAware.HTTP_HQUEUE_WRITE_FAILED, "HTTP 454 HQueue Write Failed"),
    HTTP_455(UploadStateAware.HTTP_NO_DECODE_BODY_FOUND, "HTTP 455 No Decode Body Found"),
    HTTP_500(500, "HTTP 500 Internal Server Error"),
    HTTP_501(501, "HTTP 501 No Business Error"),
    HTTP_502(502, "HTTP 502 Bad Gateway"),
    HTTP_503(503, "HTTP 503 Service Unavailable"),
    HTTP_504(504, "HTTP 504 Gateway Timeout"),
    HTTP_507(507, "HTTP 507 Service Fuse"),
    HTTP_509(509, "HTTP 509 Service Timeout"),
    HTTP_536(536, "HTTP 536 AppId Not Supported"),
    HTTP_537(UploadStateAware.HTTP_NO_SUITABLE_SENDER, "HTTP 537 No Suitable Sender"),
    HTTP_556(UploadStateAware.HTTP_PUSH_KAFKA_FAILED, "HTTP 556 Kafka Push Failed"),
    HTTP_557(UploadStateAware.HTTP_PUSH_KAFKA_TIMEOUT, "HTTP 557 Kafka Push Timeout"),
    HTTP_558(UploadStateAware.HTTP_KAFKA_CLUSTER_INIT_FAILED, "HTTP 558 Kafka Cluster Init Failed"),
    HTTP_5XX_BUSINESS(10000, "HTTP 5xx Business Server Error"),
    HTTP_500_BUSINESS(10500, "HTTP 500 Business Server Error"),
    HTTP_501_BUSINESS(ReturnCode.OPEN_CARD_FAIL, "HTTP 501 Business Server Error"),
    HTTP_502_BUSINESS(10502, "HTTP 502 Business Server Error"),
    HTTP_503_BUSINESS(10503, "HTTP 503 Business Server Error"),
    HTTP_504_BUSINESS(ReturnCode.OPEN_CARD_COMMAND_FAILED, "HTTP 504 Business Server Error"),
    HTTP_507_BUSINESS(10507, "HTTP 507 Business Server Error"),
    HTTP_509_BUSINESS(10509, "HTTP 509 Business Server Error"),
    HTTP_556_BUSINESS(10556, "HTTP 556 Business Server Error"),
    HTTP_557_BUSINESS(10557, "HTTP 557 Business Server Error"),
    HTTP_558_BUSINESS(10558, "HTTP 558 Business Server Error"),
    SERVER_TIMEOUT(13, "Server Timeout or Fuse"),
    OTHER(99, "Other Upload Failure");

    private final int code;
    private final String description;

    UploadFailReason(int i, String str) {
        this.code = i;
        this.description = str;
    }

    public static UploadFailReason fromCode(int i) {
        for (UploadFailReason uploadFailReason : values()) {
            if (uploadFailReason.getCode() == i) {
                return uploadFailReason;
            }
        }
        return OTHER;
    }

    public static UploadFailReason fromUploadStateCode(int i) {
        return fromUploadStateCode(i, false);
    }

    private static UploadFailReason mapHttpCode(int i, boolean z) {
        if (i >= 400 && i < 500) {
            if (i == 400) {
                return HTTP_400;
            }
            switch (i) {
                case 403:
                    return HTTP_403;
                case 404:
                    return HTTP_404;
                case 405:
                    return HTTP_405;
                default:
                    switch (i) {
                        case UploadStateAware.HTTP_RATE_LIMIT /* 429 */:
                            return HTTP_429;
                        case UploadStateAware.HTTP_NOT_ENOUGH_URL_PARAMS /* 430 */:
                            return HTTP_430;
                        case UploadStateAware.HTTP_URL_TIMESTAMP_INVALID /* 431 */:
                            return HTTP_431;
                        case UploadStateAware.HTTP_URL_APPID_INVALID /* 432 */:
                            return HTTP_432;
                        case UploadStateAware.HTTP_REQUEST_EXPIRED /* 433 */:
                            return HTTP_433;
                        case UploadStateAware.HTTP_URL_SIGN_INVALID /* 434 */:
                            return HTTP_434;
                        case UploadStateAware.HTTP_INVALID_SOURCE_SDK_TYPE /* 435 */:
                            return HTTP_435;
                        default:
                            switch (i) {
                                case UploadStateAware.HTTP_DECRYPT_FAILED /* 440 */:
                                    return HTTP_440;
                                case UploadStateAware.HTTP_DECOMPRESS_FAILED /* 441 */:
                                    return HTTP_441;
                                case UploadStateAware.HTTP_DESERIALIZE_FAILED /* 442 */:
                                    return HTTP_442;
                                case 443:
                                    return HTTP_443;
                                case 444:
                                    return HTTP_444;
                                default:
                                    switch (i) {
                                        case 450:
                                            return HTTP_450;
                                        case UploadStateAware.HTTP_NO_HEAD_FOUND /* 451 */:
                                            return HTTP_451;
                                        case UploadStateAware.HTTP_NO_BODY_FOUND /* 452 */:
                                            return HTTP_452;
                                        case UploadStateAware.HTTP_BODY_INVALID /* 453 */:
                                            return HTTP_453;
                                        case UploadStateAware.HTTP_HQUEUE_WRITE_FAILED /* 454 */:
                                            return HTTP_454;
                                        case UploadStateAware.HTTP_NO_DECODE_BODY_FOUND /* 455 */:
                                            return HTTP_455;
                                        default:
                                            return HTTP_4XX;
                                    }
                            }
                    }
            }
        }
        if (i < 500 || i >= 600) {
            return i == 536 ? HTTP_536 : OTHER;
        }
        if (i == 536) {
            return HTTP_536;
        }
        if (i == 537) {
            return HTTP_537;
        }
        if (z) {
            if (i == 507) {
                return HTTP_507_BUSINESS;
            }
            if (i == 509) {
                return HTTP_509_BUSINESS;
            }
            switch (i) {
                case 500:
                    return HTTP_500_BUSINESS;
                case 501:
                    return HTTP_501_BUSINESS;
                case 502:
                    return HTTP_502_BUSINESS;
                case 503:
                    return HTTP_503_BUSINESS;
                case 504:
                    return HTTP_504_BUSINESS;
                default:
                    switch (i) {
                        case UploadStateAware.HTTP_PUSH_KAFKA_FAILED /* 556 */:
                            return HTTP_556_BUSINESS;
                        case UploadStateAware.HTTP_PUSH_KAFKA_TIMEOUT /* 557 */:
                            return HTTP_557_BUSINESS;
                        case UploadStateAware.HTTP_KAFKA_CLUSTER_INIT_FAILED /* 558 */:
                            return HTTP_558_BUSINESS;
                        default:
                            return HTTP_5XX_BUSINESS;
                    }
            }
        }
        if (i == 507) {
            return HTTP_507;
        }
        if (i == 509) {
            return HTTP_509;
        }
        if (i == 536) {
            return HTTP_536;
        }
        if (i == 537) {
            return HTTP_537;
        }
        switch (i) {
            case 500:
                return HTTP_500;
            case 501:
                return HTTP_501;
            case 502:
                return HTTP_502;
            case 503:
                return HTTP_503;
            case 504:
                return HTTP_504;
            default:
                switch (i) {
                    case UploadStateAware.HTTP_PUSH_KAFKA_FAILED /* 556 */:
                        return HTTP_556;
                    case UploadStateAware.HTTP_PUSH_KAFKA_TIMEOUT /* 557 */:
                        return HTTP_557;
                    case UploadStateAware.HTTP_KAFKA_CLUSTER_INIT_FAILED /* 558 */:
                        return HTTP_558;
                    default:
                        return HTTP_5XX;
                }
        }
    }

    public int getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public static UploadFailReason fromUploadStateCode(int i, boolean z) {
        switch (i) {
            case 1:
                return MISSING_SECRET;
            case 2:
                return INPUT_JSON_ERROR;
            case 3:
                return OUTPUT_JSON_ERROR;
            case 4:
                return NETWORK_ERROR;
            case 5:
                return NO_NETWORK;
            case 6:
                return SERVER_GATEWAY_ERROR;
            case 7:
                return SERVER_BUSINESS_ERROR;
            default:
                return mapHttpCode(i, z);
        }
    }
}
