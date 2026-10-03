package com.example.opponotificationrelay;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/** RFCOMM 的独立长度帧；CRC16/ARC，CRC 字段在线上为大端。 */
public final class OafWire {
    private final InputStream input;
    private final OutputStream output;
    public volatile boolean crc;
    private volatile SendDeadline deadline;
    public void setDeadline(SendDeadline value) {deadline=value;}
    public OafWire(InputStream input, OutputStream output) { this.input = input; this.output = output; }
    public static int crc16(byte[] data) {
        int c = 0;
        for (byte b : data) {
            c ^= b & 255;
            for (int j = 0; j < 8; j++) c = (c >>> 1) ^ ((c & 1) != 0 ? 0xa001 : 0);
        }
        return c;
    }
    private byte[] readFully(int count) throws IOException {
        byte[] out = new byte[count];
        int n = 0;
        while (n < count) {
            int k = input.read(out, n, count - n);
            if (k < 0) throw new EOFException("OAF peer disconnected");
            n += k;
        }
        return out;
    }
    public static int u16(byte[] b, int p) { return ((b[p] & 255) << 8) | (b[p + 1] & 255); }
    public static byte[] be16(int n) { return new byte[]{(byte)(n >>> 8), (byte)n}; }
    public byte[] read() throws IOException {
        byte[] header = readFully(2);
        int size = u16(header, 0);
        if (size < 1 || size > 65525) throw new IOException("OAF invalid frame size " + size);
        if (crc && u16(readFully(2), 0) != crc16(header)) throw new IOException("OAF length CRC mismatch");
        byte[] data = readFully(size);
        if (crc && u16(readFully(2), 0) != crc16(data)) throw new IOException("OAF payload CRC mismatch");
        return data;
    }
    public void write(byte[] data) throws IOException {
        SendDeadline current=deadline;
        if(current==null) writeNow(data);else current.run(() -> writeNow(data));
    }
    private synchronized void writeNow(byte[] data) throws IOException {
        if (data.length < 1 || data.length > 65525) throw new IOException("OAF frame too large");
        byte[] header = be16(data.length);
        output.write(header);
        if (crc) output.write(be16(crc16(header)));
        output.write(data);
        if (crc) output.write(be16(crc16(data)));
        output.flush();
    }
    public void send(int sid, byte[] data) throws IOException {
        if (sid < 0 || sid > 1023) throw new IOException("OAF invalid session");
        write(OafCrypto.concat(new byte[]{(byte)(sid >>> 6), (byte)(sid << 2)}, data));
    }
}
