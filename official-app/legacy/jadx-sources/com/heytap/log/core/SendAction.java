package com.heytap.log.core;

/* JADX INFO: loaded from: classes19.dex */
class SendAction {
    String date;
    long fileSize;
    SendLogRunnable sendLogRunnable;
    String uploadPath;

    public boolean isValid() {
        return this.sendLogRunnable != null || this.fileSize > 0;
    }
}
