package com.heytap.connect_dns;

/* JADX INFO: loaded from: classes13.dex */
public class ResponseCode {
    public static final int HTTP_RESPONSE_EMPTY = 1099;
    public static final int HTTP_RESPONSE_SUCCESS = 200;

    public interface ErrorCode {
        public static final int SERVER_ERROR = -1001;
        public static final int SERVER_IO_ERROR = -1002;
        public static final int SERVER_RESULT_PARSER_TYPE_MISSING_ERROR = -1003;
    }

    public interface ErrorMsg {
        public static final String SERVER_IO_EXCEPTION = "IOException happened while request server";
        public static final String SERVER_RESP_CONTENT_IS_NULL = "Server Response Content Is Null";
        public static final String SERVER_RESP_IS_NULL = "Server response is null.";
        public static final String SERVER_RESULT_PARSE_TYPE_MISSING = "Server Result Parse Class Type Is Missing";
    }
}
