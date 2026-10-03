package com.oplus.aiunit.vision;

import com.oplus.drs.base.concurrent.DeviceTier;

/* JADX INFO: loaded from: classes6.dex */
public final class zz4 {
    public static final int BUSY_TIMEOUT_MS = 5000;
    public static final int CACHE_SIZE_HIGH = -8192;
    public static final int CACHE_SIZE_LOW = -8192;
    public static final int CACHE_SIZE_MID = -8192;
    public static final int CACHE_SIZE_UNIFIED = -8192;
    public static final String DB_NAME = "oplus_statistic_rom";
    public static final int DB_VERSION = 3;
    public static final int INGEST_BACKPRESSURE_THRESHOLD = 5000;
    public static final int INGEST_BATCH_SIZE_DEFAULT = 50;
    public static final int INGEST_BATCH_SIZE_HIGH_TRAFFIC = 100;
    public static final long INGEST_BATCH_WINDOW_MS = 20;
    public static final long JOURNAL_SIZE_LIMIT_HIGH = 67108864;
    public static final long JOURNAL_SIZE_LIMIT_LOW = 33554432;
    public static final long JOURNAL_SIZE_LIMIT_MID = 50331648;
    public static final long MMAP_SIZE_HIGH = 8388608;
    public static final long MMAP_SIZE_LOW = 8388608;
    public static final long MMAP_SIZE_MID = 8388608;
    public static final long MMAP_SIZE_UNIFIED = 8388608;
    public static final int WAL_AUTOCHECKPOINT_HIGH = 0;
    public static final int WAL_AUTOCHECKPOINT_LOW = 4000;
    public static final int WAL_AUTOCHECKPOINT_MID = 8000;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DeviceTier.values().length];
            a = iArr;
            try {
                iArr[DeviceTier.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DeviceTier.HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static String[] a() {
        return new String[]{"CREATE INDEX IF NOT EXISTS idx_rt_event_time ON common_info_rt(event_time)", "CREATE INDEX IF NOT EXISTS idx_rt_state ON common_info_rt(cache_flag, event_time, _id)", "CREATE INDEX IF NOT EXISTS idx_rt_triplet ON common_info_rt(common_appid, common_logtag, common_eventid)", "CREATE INDEX IF NOT EXISTS idx_rt_sequence ON common_info_rt(sequence_id)", "CREATE INDEX IF NOT EXISTS idx_nr_event_time ON common_info_nr(event_time)", "CREATE INDEX IF NOT EXISTS idx_nr_state ON common_info_nr(cache_flag, event_time, _id)", "CREATE INDEX IF NOT EXISTS idx_nr_triplet ON common_info_nr(common_appid, common_logtag, common_eventid)", "CREATE INDEX IF NOT EXISTS idx_nr_sequence ON common_info_nr(sequence_id)", "CREATE INDEX IF NOT EXISTS idx_dyn_state ON dynamic_event_log(cache_flag, event_time)", "CREATE INDEX IF NOT EXISTS idx_sta_state ON static_event_log(cache_flag, event_time)", "CREATE UNIQUE INDEX IF NOT EXISTS uniq_header_index_json ON header_index(headerJson)", "CREATE INDEX IF NOT EXISTS idx_recon_app_time ON data_reconciliation(app_id, event_time)", "CREATE INDEX IF NOT EXISTS idx_recon_source ON data_reconciliation(source_process)", "CREATE INDEX IF NOT EXISTS idx_recon_seq ON data_reconciliation(sequence_id)", "CREATE INDEX IF NOT EXISTS idx_recon_create_time ON data_reconciliation(create_time)"};
    }

    public static String[] b() {
        return new String[]{"CREATE TABLE IF NOT EXISTS common_info_rt (_id INTEGER PRIMARY KEY AUTOINCREMENT,event_key_long INTEGER,header_index INTEGER,common_header TEXT,body_blob BLOB NOT NULL,sequence_id TEXT,common_appid TEXT,common_logtag TEXT,common_eventid TEXT,head_switch INTEGER,event_level INTEGER,network_type INTEGER,upload_type INTEGER,event_time INTEGER,cache_flag INTEGER,event_source INTEGER,raw_size INTEGER DEFAULT 0)", "CREATE TABLE IF NOT EXISTS common_info_nr (_id INTEGER PRIMARY KEY AUTOINCREMENT,event_key_long INTEGER,header_index INTEGER,common_header TEXT,body_blob BLOB NOT NULL,sequence_id TEXT,common_appid TEXT,common_logtag TEXT,common_eventid TEXT,head_switch INTEGER,event_level INTEGER,network_type INTEGER,upload_type INTEGER,event_time INTEGER,cache_flag INTEGER,event_source INTEGER,raw_size INTEGER DEFAULT 0)", "CREATE TABLE IF NOT EXISTS dynamic_event_log (_id INTEGER PRIMARY KEY AUTOINCREMENT,event_key_long INTEGER,common_header TEXT,common_body TEXT,common_appid TEXT,event_time INTEGER,upload_mode INTEGER,cache_flag INTEGER)", "CREATE TABLE IF NOT EXISTS static_event_log (_id INTEGER PRIMARY KEY AUTOINCREMENT,event_key_long INTEGER,common_header TEXT,common_body TEXT,common_appid TEXT,event_time INTEGER,upload_mode INTEGER,cache_flag INTEGER)", "CREATE TABLE IF NOT EXISTS event_rules (appId TEXT,event_key_long INTEGER,eventGroup TEXT,eventId TEXT,acceptNetType INTEGER,headSwitch INTEGER,eventLevel INTEGER,uploadType INTEGER,status INTEGER,sample_rate INTEGER DEFAULT 100000,v INTEGER,updated_at INTEGER,PRIMARY KEY (appId, eventGroup, eventId))", "CREATE TABLE IF NOT EXISTS host_config (scope TEXT,appId TEXT,bizHost TEXT,techHost TEXT,v INTEGER,is_expired INTEGER,updated_at INTEGER,area TEXT,PRIMARY KEY (scope, appId))", "CREATE TABLE IF NOT EXISTS header_index (_id INTEGER PRIMARY KEY AUTOINCREMENT,headerJson TEXT,created_at INTEGER)", "CREATE TABLE IF NOT EXISTS rate_limit_quota (date_key TEXT NOT NULL,app_id TEXT NOT NULL,quota_type INTEGER NOT NULL,used_bytes INTEGER DEFAULT 0,dropped_bytes INTEGER DEFAULT 0,dropped_count INTEGER DEFAULT 0,updated_at INTEGER,PRIMARY KEY (date_key, app_id, quota_type))", "CREATE TABLE IF NOT EXISTS stats_aggregate (stat_type TEXT,appId TEXT,code INTEGER,reason TEXT,count INTEGER DEFAULT 0,updated_at INTEGER,PRIMARY KEY (stat_type, appId, code, reason))", "CREATE TABLE IF NOT EXISTS app_secrets (appId TEXT PRIMARY KEY,app_key TEXT,app_secret TEXT)", "CREATE TABLE IF NOT EXISTS data_reconciliation (_id INTEGER PRIMARY KEY AUTOINCREMENT,app_id TEXT,event_time INTEGER,source_process INTEGER DEFAULT 0,received_count INTEGER DEFAULT 0,validation_failed_reasons TEXT DEFAULT '{}',filtered_reasons TEXT DEFAULT '{}',cached_count INTEGER DEFAULT 0,cached_pending_count INTEGER DEFAULT 0,flow_control_reasons TEXT DEFAULT '{}',upload_attempt_count INTEGER DEFAULT 0,upload_request_count INTEGER DEFAULT 0,upload_failed_reasons TEXT DEFAULT '{}',upload_retry_distribution TEXT DEFAULT '{}',uploaded_count INTEGER DEFAULT 0,clear_reasons TEXT DEFAULT '{}',sequence_id TEXT DEFAULT '0',record_date INTEGER,create_time INTEGER,update_time INTEGER)"};
    }

    public static int c(DeviceTier deviceTier) {
        return -8192;
    }

    public static long d(DeviceTier deviceTier) {
        if (deviceTier == null) {
            return JOURNAL_SIZE_LIMIT_MID;
        }
        int i = a.a[deviceTier.ordinal()];
        if (i != 1) {
            return i != 2 ? JOURNAL_SIZE_LIMIT_MID : JOURNAL_SIZE_LIMIT_HIGH;
        }
        return JOURNAL_SIZE_LIMIT_LOW;
    }

    public static long e(DeviceTier deviceTier) {
        return 8388608L;
    }

    public static int f(DeviceTier deviceTier) {
        if (deviceTier == null) {
            return 8000;
        }
        int i = a.a[deviceTier.ordinal()];
        if (i != 1) {
            return i != 2 ? 8000 : 0;
        }
        return 4000;
    }
}
