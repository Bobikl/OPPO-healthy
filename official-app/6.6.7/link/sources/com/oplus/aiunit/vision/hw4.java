package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Message;
import com.oplus.wearable.linkservice.sdk.internal.file.FileTransferTask;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class hw4 extends ws4 {
    public FileTransferTask b;
    public RandomAccessFile c;
    public long d;
    public int e;
    public String f;
    public int g;

    public hw4(Handler handler) {
        super(handler);
        this.d = 0L;
        this.e = -1;
    }

    @Override // com.oplus.aiunit.vision.zp9
    public synchronized long a() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.zp9
    public synchronized int b(boolean z, int i, int i2, byte[] bArr) {
        if (z) {
            if (this.e == i) {
                long j = i2;
                long j2 = this.d;
                if (j == j2 && j2 != 0) {
                    uml.d("DataReceiver", "onReceiveData: index=" + i + " endPoint=" + i2 + " repeat last");
                    return 0;
                }
            }
        }
        this.g = i;
        int i3 = this.e;
        if (i3 < 0 && i != 0) {
            uml.b("DataReceiver", "onReceiveData FTChunkRequest index = " + i + " mLastIndex " + this.e);
            return 510;
        }
        if (i3 >= 0 && i3 + 1 != i) {
            uml.b("DataReceiver", "onReceiveData ERROR_CONTENT_INDEX index = " + i + " mLastIndex " + this.e);
            d();
            return 510;
        }
        this.e = i;
        if (this.c == null) {
            uml.b("DataReceiver", "onReceiveData mRandomAccessFile == null ");
            return 523;
        }
        if (bArr != null && bArr.length != 0) {
            return i(bArr);
        }
        uml.b("DataReceiver", "onReceiveData buffer == null or buffer.length == 0 ");
        return 523;
    }

    @Override // com.oplus.aiunit.vision.zp9
    public synchronized int c(FileTransferTask fileTransferTask, String str) {
        long length;
        String absolutePath;
        uml.a("DataReceiver", "prepareReceive ");
        this.b = fileTransferTask;
        File file = new File(str);
        this.d = file.length();
        length = file.length();
        absolutePath = file.getAbsolutePath();
        this.f = absolutePath;
        return h(absolutePath, length);
    }

    @Override // com.oplus.aiunit.vision.zp9
    public synchronized void clean() {
        uml.d("DataReceiver", "clean:");
        this.e = -1;
        e();
    }

    public final synchronized void d() {
        uml.a("DataReceiver", "cancelReceive");
        clean();
    }

    public final synchronized void e() {
        uml.a("DataReceiver", "closeStream");
        RandomAccessFile randomAccessFile = this.c;
        if (randomAccessFile != null) {
            try {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    uml.b("DataReceiver", "closeStream: " + e.getMessage());
                }
                this.c = null;
            } catch (Throwable th) {
                this.c = null;
                throw th;
            }
        }
    }

    public final synchronized void f(FileTransferTask fileTransferTask, long j) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 101;
        fileTransferTask.setFileTransferSize((int) j);
        messageObtain.obj = fileTransferTask;
        int fileSize = (int) ((j * 100) / fileTransferTask.getFileSize());
        fileTransferTask.setState(FileTransferTask.State.TRANSFERING);
        fileTransferTask.setProgress(fileSize);
        Handler handler = this.a;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    public final void g(FileTransferTask fileTransferTask, long j) {
        f(fileTransferTask, j);
    }

    public final synchronized int h(String str, long j) {
        File file = new File(str);
        if (file.exists() && file.isFile()) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
            this.c = randomAccessFile;
            randomAccessFile.seek(j);
            return 0;
        }
        try {
            file.createNewFile();
        } catch (IOException e) {
            uml.b("DataReceiver", "prepareStream: " + e.getMessage());
        }
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "rw");
                this.c = randomAccessFile2;
                randomAccessFile2.seek(j);
                return 0;
            } catch (IOException e2) {
                uml.b("DataReceiver", "prepareStream: IOException: " + e2.getMessage());
                try {
                    file.delete();
                } catch (Exception e3) {
                    uml.b("DataReceiver", "file delete: " + e3.getMessage());
                    return 501;
                }
                return 501;
            }
        } catch (FileNotFoundException e4) {
            uml.b("DataReceiver", "prepareStream: FileNotFoundException: " + e4.getMessage());
            file.delete();
            return 501;
        }
        throw th;
    }

    public final synchronized int i(byte[] bArr) {
        if (this.c == null) {
            uml.b("DataReceiver", "writeFile mRandomAccessFile == null");
            return 523;
        }
        FileTransferTask fileTransferTask = this.b;
        if (fileTransferTask == null) {
            uml.b("DataReceiver", "writeFile mFileTransferTask == null");
            return 523;
        }
        if (fileTransferTask.getState() != FileTransferTask.State.COMPLETE && this.b.getState() != FileTransferTask.State.FAILED) {
            long fileSize = this.b.getFileSize();
            int length = bArr.length;
            try {
                this.c.write(bArr);
                long j = this.d + ((long) length);
                this.d = j;
                if (j > fileSize) {
                    uml.b("DataReceiver", "writeFile mReceiveSize > mFileTransferTask.getFileSize() " + this.d + " > " + fileSize);
                    try {
                        if (this.c.length() > fileSize) {
                            return 512;
                        }
                    } catch (IOException e) {
                        uml.b("DataReceiver", "writeFile: length " + e.getMessage());
                        return 501;
                    }
                }
                g(this.b, this.d);
                return 0;
            } catch (IOException e2) {
                uml.b("DataReceiver", "writeFile: write " + e2.getMessage());
                return 501;
            }
        }
        uml.b("DataReceiver", "writeFile state  = " + this.b.getState());
        return 523;
    }
}
