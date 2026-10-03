package com.heytap.accessory.file.model;

/* JADX INFO: loaded from: classes14.dex */
public class FileDescription {
    private String mCustomFileInfo;
    private String mFileName;
    private long mFileSize;

    public static class Builder {
        private String mCustomFileInfo;
        private String mFileName;
        private long mFileSize;

        public FileDescription build() {
            return new FileDescription(this);
        }

        public Builder of(FileDescription fileDescription) {
            this.mFileSize = fileDescription.mFileSize;
            this.mFileName = fileDescription.mFileName;
            this.mCustomFileInfo = fileDescription.mCustomFileInfo;
            return this;
        }

        public Builder setCustomFileInfo(String str) {
            this.mCustomFileInfo = str;
            return this;
        }

        public Builder setFileName(String str) {
            this.mFileName = str;
            return this;
        }

        public Builder setFileSize(long j2) {
            this.mFileSize = j2;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getCustomFileInfo() {
        return this.mCustomFileInfo;
    }

    public String getFileName() {
        return this.mFileName;
    }

    public long getFileSize() {
        return this.mFileSize;
    }

    public void setCustomFileInfo(String str) {
        this.mCustomFileInfo = str;
    }

    public void setFileName(String str) {
        this.mFileName = str;
    }

    public void setFileSize(long j2) {
        this.mFileSize = j2;
    }

    private FileDescription(Builder builder) {
        this.mFileSize = builder.mFileSize;
        this.mFileName = builder.mFileName;
        this.mCustomFileInfo = builder.mCustomFileInfo;
    }
}
