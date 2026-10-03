package com.oplus.quickgame.sdk.hall.exception;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class HallRouterException extends Exception {
    private ErrorEnum errorEnum;

    public enum ErrorEnum {
        NULL_ERROR(99, "the url is null", "链接为空"),
        SCHEME_ERROR(100, "the scheme is not oaps", "链接不是以oaps://开头"),
        HOST_ERROR(101, "the host is not qg", "oaps://后面接的不是qg/"),
        VERSION_ERROR(102, "the version of apk doesn't support this oaps url", "小游戏大厅版本过低不支持该链接"),
        NO_ACTIVITY_SUPPORT_ERROR(103, "no activity supports this url", "找不到支持该链接的页面"),
        MISS_KEY_ERROR(104, "miss key: ", "缺少参数");

        private int code;
        private String description;
        private String tips;

        ErrorEnum(int i, String str, String str2) {
            this.code = i;
            this.description = str;
            this.tips = str2;
        }

        public int getCode() {
            return this.code;
        }

        public String getDescription() {
            return this.description;
        }

        public String getTips() {
            return this.tips;
        }

        @Override // java.lang.Enum
        public String toString() {
            return "OAPS_Error//code=" + this.code + ", description='" + this.description;
        }
    }

    public HallRouterException(ErrorEnum errorEnum) {
        super(errorEnum.toString());
        this.errorEnum = errorEnum;
    }

    public ErrorEnum getErrorEnum() {
        return this.errorEnum;
    }

    public HallRouterException(String str) {
        StringBuilder sb = new StringBuilder();
        ErrorEnum errorEnum = ErrorEnum.MISS_KEY_ERROR;
        sb.append(errorEnum.toString());
        sb.append(str);
        super(sb.toString());
        this.errorEnum = errorEnum;
        errorEnum.description = str;
        this.errorEnum.tips += str;
    }
}
