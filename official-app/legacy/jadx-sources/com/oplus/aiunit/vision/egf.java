package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.drs.core.reconciliation.ClearReason;
import com.oplus.drs.core.reconciliation.FilterReason;
import com.oplus.drs.core.reconciliation.FlowControlReason;
import com.oplus.drs.core.reconciliation.UploadFailReason;
import com.oplus.drs.core.reconciliation.ValidationReason;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class egf implements xv9 {
    public final Context a;

    public egf(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // com.oplus.aiunit.vision.xv9
    public void a(String str, Map<Long, Integer> map, String str2) {
        try {
            vv4.t(this.a).O(str, map, s(str2));
        } catch (Exception e2) {
            z6b.p("ReconciliationServiceImpl", "recordValidationFailedBatch error", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.xv9
    public void b(String str, int i, long j2, String str2) {
        try {
            vv4.t(this.a).G(str, i, j2, p(str2));
        } catch (Exception e2) {
            z6b.p("ReconciliationServiceImpl", "recordFiltered error", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.xv9
    public void c(String str, Map<Long, Integer> map) {
        try {
            vv4.t(this.a).J(str, map);
        } catch (Exception e2) {
            z6b.p("ReconciliationServiceImpl", "recordUploadAttemptBatch error", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.xv9
    public void d(String str, int i, long j2, String str2) {
        try {
            vv4.t(this.a).H(str, i, j2, q(str2));
        } catch (Exception e2) {
            z6b.p("ReconciliationServiceImpl", "recordFlowControl error", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.xv9
    public void e(List<String> list) {
        int size;
        if (list != null) {
            try {
                size = list.size();
            } catch (Exception e2) {
                z6b.p("ReconciliationServiceImpl", "removeUploadedReconciliationData error", e2);
                return;
            }
        } else {
            size = 0;
        }
        String string = "";
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    string = list.subList(0, Math.min(3, size)).toString();
                }
            } catch (Exception unused) {
            }
        }
        z6b.q("ReconciliationServiceImpl", "removeUploadedReconciliationData dispatch to manager, count=" + size + ", sample=" + string);
        vv4.t(this.a).P(list);
    }

    @Override // com.oplus.aiunit.vision.xv9
    public void f(String str, List<Long> list, int i) {
        try {
            vv4.t(this.a).M(str, list, i);
        } catch (Exception e2) {
            z6b.p("ReconciliationServiceImpl", "recordUploadedBatch error", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.xv9
    public void g(String str, Map<Long, Integer> map) {
        try {
            vv4.t(this.a).L(str, map);
        } catch (Exception e2) {
            z6b.p("ReconciliationServiceImpl", "recordUploadRequestBatch error", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.xv9
    public void h(String str, int i, long j2) {
        try {
            vv4.t(this.a).I(str, i, j2);
        } catch (Exception e2) {
            z6b.p("ReconciliationServiceImpl", "recordReceived error", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.xv9
    public void i(String str, int i, long j2, String str2) {
        try {
            vv4.t(this.a).F(str, i, j2, o(str2));
        } catch (Exception e2) {
            z6b.p("ReconciliationServiceImpl", "recordCleared error", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.xv9
    public void j(String str, long j2, agf.b bVar) {
        try {
            vv4.t(this.a).D(str, j2, bVar);
        } catch (Exception e2) {
            z6b.p("ReconciliationServiceImpl", "recordAllMetricsBatch error", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.xv9
    public void k(String str, Map<Long, Integer> map, String str2, int i) {
        try {
            vv4.t(this.a).K(str, map, r(str2), i);
        } catch (Exception e2) {
            z6b.p("ReconciliationServiceImpl", "recordUploadFailedBatch error", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.xv9
    public void l(String str, Map<Long, Integer> map, int i) {
        try {
            vv4.t(this.a).E(str, map, i);
        } catch (Exception e2) {
            z6b.p("ReconciliationServiceImpl", "recordCachedBatch error", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.xv9
    public void m(String str, int i, long j2, String str2) {
        try {
            vv4.t(this.a).N(str, i, j2, s(str2));
        } catch (Exception e2) {
            z6b.p("ReconciliationServiceImpl", "recordValidationFailed error", e2);
        }
    }

    @Override // com.oplus.aiunit.vision.xv9
    public boolean n(String str) {
        return bgf.a(str);
    }

    public final ClearReason o(String str) {
        if (str == null) {
            return ClearReason.OTHER;
        }
        switch (str) {
            case "SDK_EXPIRED_CLEAN":
            case "clear_sdk_expired":
                return ClearReason.SDK_EXPIRED_CLEAN;
            case "PENDING_DATA_CLEANUP":
            case "clear_pending_data":
                return ClearReason.PENDING_DATA_CLEANUP;
            case "SDK_CAPACITY_CLEAN":
            case "clear_sdk_capacity":
                return ClearReason.SDK_CAPACITY_CLEAN;
            case "PRIORITY_CLEANUP":
            case "clear_priority":
                return ClearReason.PRIORITY_CLEANUP;
            case "DATA_CORRUPTED":
            case "clear_data_corrupted":
                return ClearReason.DATA_CORRUPTED;
            case "REALTIME_CLEANUP":
            case "clear_realtime":
                return ClearReason.REALTIME_CLEANUP;
            case "clear_db_capacity_full":
            case "DB_CAPACITY_FULL":
                return ClearReason.DB_CAPACITY_FULL;
            case "clear_ttl_expired":
            case "TTL_EXPIRED":
                return ClearReason.TTL_EXPIRED;
            default:
                return ClearReason.OTHER;
        }
    }

    public final FilterReason p(String str) {
        if (str == null) {
            return FilterReason.OTHER;
        }
        switch (str) {
            case "SAMPLE_REJECT":
                return FilterReason.SAMPLE_REJECT;
            case "SDK_PREFILTER_STATUS_DROP":
                return FilterReason.SDK_PREFILTER_STATUS;
            case "SDK_PREFILTER_SAMPLE_DROP":
                return FilterReason.SDK_PREFILTER_SAMPLE;
            case "ILLEGAL_PKG":
                return FilterReason.ILLEGAL_PKG;
            case "RULE_DISABLED":
                return FilterReason.RULE_DISABLED;
            default:
                return FilterReason.OTHER;
        }
    }

    public final FlowControlReason q(String str) {
        if (str == null) {
            return FlowControlReason.OTHER;
        }
        switch (str) {
            case "flow_control_system_busy":
            case "SYSTEM_BUSY":
                return FlowControlReason.SYSTEM_BUSY;
            case "QUEUE_FULL":
            case "flow_control_queue_full":
                return FlowControlReason.QUEUE_FULL;
            case "QUOTA_EXCEEDED":
            case "flow_control_quota_exceeded":
                return FlowControlReason.QUOTA_GLOBAL_EXCEEDED;
            case "QUOTA_GLOBAL_EXCEEDED":
            case "flow_control_quota_global_exceeded":
                return FlowControlReason.QUOTA_GLOBAL_EXCEEDED;
            case "flow_control_quota_app_exceeded":
            case "QUOTA_APP_EXCEEDED":
                return FlowControlReason.QUOTA_APP_EXCEEDED;
            default:
                return FlowControlReason.OTHER;
        }
    }

    public final UploadFailReason r(String str) {
        if (str == null) {
            return UploadFailReason.OTHER;
        }
        switch (str) {
            case "MISSING_SECRET":
                return UploadFailReason.MISSING_SECRET;
            case "SERVER_GATEWAY_ERROR":
                return UploadFailReason.SERVER_GATEWAY_ERROR;
            case "SERVER_TIMEOUT":
                return UploadFailReason.SERVER_TIMEOUT;
            case "INPUT_JSON_ERROR":
                return UploadFailReason.INPUT_JSON_ERROR;
            case "NETWORK_ERROR":
                return UploadFailReason.NETWORK_ERROR;
            case "SERVER_BUSINESS_ERROR":
                return UploadFailReason.SERVER_BUSINESS_ERROR;
            case "HTTP_429":
                return UploadFailReason.HTTP_429;
            case "HTTP_503":
                return UploadFailReason.HTTP_503;
            case "HTTP_4XX":
                return UploadFailReason.HTTP_4XX;
            case "HTTP_5XX":
                return UploadFailReason.HTTP_5XX;
            case "NO_NETWORK":
                return UploadFailReason.NO_NETWORK;
            case "OUTPUT_JSON_ERROR":
                return UploadFailReason.OUTPUT_JSON_ERROR;
            case "SERVER_APP_ID_NOT_SUPPORTED":
                return UploadFailReason.SERVER_APP_ID_NOT_SUPPORTED;
            default:
                try {
                    return UploadFailReason.valueOf(str);
                } catch (Exception unused) {
                    return UploadFailReason.OTHER;
                }
        }
    }

    public final ValidationReason s(String str) {
        if (str == null) {
            return ValidationReason.OTHER;
        }
        switch (str) {
            case "MISSING_REQUIRED_FIELD":
                return ValidationReason.MISSING_REQUIRED_FIELD;
            case "CLIENT_STORAGE_FULL":
                return ValidationReason.CLIENT_STORAGE_FULL;
            case "CLIENT_EXPIRED_CLEAN":
                return ValidationReason.CLIENT_EXPIRED_CLEAN;
            case "CLIENT_DB_WRITE_FAILED":
                return ValidationReason.CLIENT_DB_WRITE_FAILED;
            case "CLIENT_DATA_TOO_LARGE":
                return ValidationReason.CLIENT_DATA_TOO_LARGE;
            case "CLIENT_CAPACITY_CLEAN":
                return ValidationReason.CLIENT_CAPACITY_CLEAN;
            case "CLIENT_IPC_TIMEOUT":
                return ValidationReason.CLIENT_IPC_TIMEOUT;
            case "CLIENT_IPC_SERVICE_UNAVAILABLE":
                return ValidationReason.CLIENT_IPC_SERVICE_UNAVAILABLE;
            case "ENCRYPTION_ERROR":
                return ValidationReason.ENCRYPTION_ERROR;
            case "JSON_PARSE_ERROR":
                return ValidationReason.JSON_PARSE_ERROR;
            case "CLIENT_IPC_RETRY_EXHAUSTED":
                return ValidationReason.CLIENT_IPC_RETRY_EXHAUSTED;
            default:
                return ValidationReason.OTHER;
        }
    }
}
