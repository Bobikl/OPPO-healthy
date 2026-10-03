package com.oplus.aiunit.vision;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ut5 {
    public static final ut5 ALL = new a();
    public static final ut5 NONE = new b();
    public static final ut5 DATA = new c();
    public static final ut5 RESOURCE = new d();
    public static final ut5 AUTOMATIC = new e();

    public class a extends ut5 {
        @Override // com.oplus.aiunit.vision.ut5
        public boolean a() {
            return true;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean b() {
            return true;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    public class b extends ut5 {
        @Override // com.oplus.aiunit.vision.ut5
        public boolean a() {
            return false;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean b() {
            return false;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean c(DataSource dataSource) {
            return false;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    public class c extends ut5 {
        @Override // com.oplus.aiunit.vision.ut5
        public boolean a() {
            return true;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean b() {
            return false;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean c(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }
    }

    public class d extends ut5 {
        @Override // com.oplus.aiunit.vision.ut5
        public boolean a() {
            return false;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean b() {
            return true;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean c(DataSource dataSource) {
            return false;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    public class e extends ut5 {
        @Override // com.oplus.aiunit.vision.ut5
        public boolean a() {
            return true;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean b() {
            return true;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean c(DataSource dataSource) {
            return dataSource == DataSource.REMOTE;
        }

        @Override // com.oplus.aiunit.vision.ut5
        public boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(DataSource dataSource);

    public abstract boolean d(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);
}
