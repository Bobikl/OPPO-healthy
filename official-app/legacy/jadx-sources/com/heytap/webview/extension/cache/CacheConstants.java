package com.heytap.webview.extension.cache;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/webview/extension/cache/CacheConstants;", "", "Character", "Debug", "Product", "Word", "config", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CacheConstants {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/heytap/webview/extension/cache/CacheConstants$Character;", "", "()V", "OLD", "", "UNDERSCORE", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Character {

        @NotNull
        public static final Character INSTANCE = new Character();

        @NotNull
        public static final String OLD = ".old";

        @NotNull
        public static final String UNDERSCORE = "_";

        private Character() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/heytap/webview/extension/cache/CacheConstants$Debug;", "", "()V", "DEBUG_DETAILS", "", "DEBUG_FAIL", "MODEL_TAG", "", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Debug {
        public static final boolean DEBUG_DETAILS = true;
        public static final boolean DEBUG_FAIL = true;

        @NotNull
        public static final Debug INSTANCE = new Debug();

        @NotNull
        public static final String MODEL_TAG = "WebExtCache";

        private Debug() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/heytap/webview/extension/cache/CacheConstants$Product;", "", "()V", "CONFIG_NAME", "", "PRODUCT_ID", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Product {

        @NotNull
        public static final String CONFIG_NAME = "WebCache_UriConfig";

        @NotNull
        public static final Product INSTANCE = new Product();

        @NotNull
        public static final String PRODUCT_ID = "mdp_269";

        private Product() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/heytap/webview/extension/cache/CacheConstants$Word;", "", "()V", "CACHECONFIGDATABASE", "", "CACHE_CONTROL", "CONFIGURATION", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Word {

        @NotNull
        public static final String CACHECONFIGDATABASE = "cache_config_database";

        @NotNull
        public static final String CACHE_CONTROL = "Cache-Control";

        @NotNull
        public static final String CONFIGURATION = "configuration";

        @NotNull
        public static final Word INSTANCE = new Word();

        private Word() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/heytap/webview/extension/cache/CacheConstants$config;", "", "()V", "DATABASE_VERSION", "", "READ_BUF_SIZE", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class config {
        public static final int DATABASE_VERSION = 1;

        @NotNull
        public static final config INSTANCE = new config();
        public static final int READ_BUF_SIZE = 10240;

        private config() {
        }
    }
}
