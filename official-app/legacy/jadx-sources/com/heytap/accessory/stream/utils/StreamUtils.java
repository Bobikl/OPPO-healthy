package com.heytap.accessory.stream.utils;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes14.dex */
public class StreamUtils {
    private static final int BLE_PACKET_LENGTH = 4840;
    private static final int BT_PACKET_LENGTH = 32768;
    private static final int DEFAULT_PACKET_LENGTH = 32768;
    private static final String TAG = "StreamUtils";
    public static final int TRANSPORT_BLE = 4;
    public static final int TRANSPORT_BT = 2;
    public static final int TRANSPORT_WIFI = 1;
    private static final int WIFI_PACKET_LENGTH = 64888;

    public static class TransferThread extends Thread {
        int mChunkSize;
        InputStream mIn;
        OutputStream mOut;

        public TransferThread(InputStream inputStream, int i, OutputStream outputStream) {
            super("ParcelFileDescriptor Transfer Thread");
            this.mIn = inputStream;
            this.mOut = outputStream;
            this.mChunkSize = getPacketLengthForSender(i);
            setDaemon(true);
        }

        private int getPacketLengthForSender(int i) {
            if (i == 1) {
                return StreamUtils.WIFI_PACKET_LENGTH;
            }
            if (i == 2) {
                return 32768;
            }
            if (i == 4) {
                return StreamUtils.BLE_PACKET_LENGTH;
            }
            Log.w(StreamUtils.TAG, "unsupported transport time, return default packet length");
            return 32768;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            OutputStream outputStream;
            byte[] bArr = new byte[this.mChunkSize];
            while (true) {
                try {
                    try {
                        try {
                            int i = this.mIn.read(bArr);
                            if (i <= 0) {
                                break;
                            } else {
                                this.mOut.write(bArr, 0, i);
                            }
                        } catch (IOException e2) {
                            Log.e("TransferThread", e2.getMessage());
                            try {
                                this.mIn.close();
                                this.mIn = null;
                            } catch (IOException unused) {
                            }
                            outputStream = this.mOut;
                        }
                    } catch (Throwable th) {
                        try {
                            this.mIn.close();
                            this.mIn = null;
                        } catch (IOException unused2) {
                        }
                        try {
                            this.mOut.close();
                            this.mOut = null;
                            throw th;
                        } catch (IOException unused3) {
                            throw th;
                        }
                    }
                } catch (IOException unused4) {
                    return;
                }
            }
            this.mOut.flush();
            try {
                this.mIn.close();
                this.mIn = null;
            } catch (IOException unused5) {
            }
            outputStream = this.mOut;
            outputStream.close();
            this.mOut = null;
        }
    }

    public static ParcelFileDescriptor pipeFrom(InputStream inputStream, int i) throws IOException {
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
        new TransferThread(inputStream, i, new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorArrCreatePipe[1])).start();
        return parcelFileDescriptor;
    }
}
