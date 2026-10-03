package io.netty.handler.codec.compression;

import com.ning.compress.BufferRecycler;
import com.ning.compress.lzf.ChunkDecoder;
import com.ning.compress.lzf.util.ChunkDecoderFactory;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class LzfDecoder extends ByteToMessageDecoder {
    private static final short MAGIC_NUMBER = 23126;
    private int chunkLength;
    private State currentState;
    private ChunkDecoder decoder;
    private boolean isCompressed;
    private int originalLength;
    private BufferRecycler recycler;

    /* JADX INFO: renamed from: io.netty.handler.codec.compression.LzfDecoder$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$LzfDecoder$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$io$netty$handler$codec$compression$LzfDecoder$State = iArr;
            try {
                iArr[State.INIT_BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$LzfDecoder$State[State.INIT_ORIGINAL_LENGTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$LzfDecoder$State[State.DECOMPRESS_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$compression$LzfDecoder$State[State.CORRUPTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum State {
        INIT_BLOCK,
        INIT_ORIGINAL_LENGTH,
        DECOMPRESS_DATA,
        CORRUPTED
    }

    public LzfDecoder() {
        this(false);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[Catch: Exception -> 0x015d, TryCatch #0 {Exception -> 0x015d, blocks: (B:2:0x0000, B:8:0x001a, B:9:0x0023, B:10:0x0028, B:33:0x008f, B:36:0x0099, B:38:0x009f, B:40:0x00a9, B:42:0x00be, B:44:0x00cc, B:52:0x00fe, B:54:0x0104, B:60:0x0118, B:56:0x010b, B:57:0x010e, B:45:0x00da, B:41:0x00b4, B:59:0x0111, B:27:0x007b, B:30:0x0083, B:32:0x008b, B:62:0x011d, B:63:0x0138, B:11:0x0029, B:14:0x0032, B:16:0x003a, B:19:0x0042, B:23:0x006f, B:64:0x0139, B:65:0x0154, B:20:0x0049, B:21:0x0068, B:22:0x0069, B:66:0x0155, B:67:0x015c, B:47:0x00dd, B:49:0x00ec, B:51:0x00f8, B:50:0x00f5), top: B:71:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x009f A[Catch: Exception -> 0x015d, TryCatch #0 {Exception -> 0x015d, blocks: (B:2:0x0000, B:8:0x001a, B:9:0x0023, B:10:0x0028, B:33:0x008f, B:36:0x0099, B:38:0x009f, B:40:0x00a9, B:42:0x00be, B:44:0x00cc, B:52:0x00fe, B:54:0x0104, B:60:0x0118, B:56:0x010b, B:57:0x010e, B:45:0x00da, B:41:0x00b4, B:59:0x0111, B:27:0x007b, B:30:0x0083, B:32:0x008b, B:62:0x011d, B:63:0x0138, B:11:0x0029, B:14:0x0032, B:16:0x003a, B:19:0x0042, B:23:0x006f, B:64:0x0139, B:65:0x0154, B:20:0x0049, B:21:0x0068, B:22:0x0069, B:66:0x0155, B:67:0x015c, B:47:0x00dd, B:49:0x00ec, B:51:0x00f8, B:50:0x00f5), top: B:71:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9 A[Catch: Exception -> 0x015d, TryCatch #0 {Exception -> 0x015d, blocks: (B:2:0x0000, B:8:0x001a, B:9:0x0023, B:10:0x0028, B:33:0x008f, B:36:0x0099, B:38:0x009f, B:40:0x00a9, B:42:0x00be, B:44:0x00cc, B:52:0x00fe, B:54:0x0104, B:60:0x0118, B:56:0x010b, B:57:0x010e, B:45:0x00da, B:41:0x00b4, B:59:0x0111, B:27:0x007b, B:30:0x0083, B:32:0x008b, B:62:0x011d, B:63:0x0138, B:11:0x0029, B:14:0x0032, B:16:0x003a, B:19:0x0042, B:23:0x006f, B:64:0x0139, B:65:0x0154, B:20:0x0049, B:21:0x0068, B:22:0x0069, B:66:0x0155, B:67:0x015c, B:47:0x00dd, B:49:0x00ec, B:51:0x00f8, B:50:0x00f5), top: B:71:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4 A[Catch: Exception -> 0x015d, TryCatch #0 {Exception -> 0x015d, blocks: (B:2:0x0000, B:8:0x001a, B:9:0x0023, B:10:0x0028, B:33:0x008f, B:36:0x0099, B:38:0x009f, B:40:0x00a9, B:42:0x00be, B:44:0x00cc, B:52:0x00fe, B:54:0x0104, B:60:0x0118, B:56:0x010b, B:57:0x010e, B:45:0x00da, B:41:0x00b4, B:59:0x0111, B:27:0x007b, B:30:0x0083, B:32:0x008b, B:62:0x011d, B:63:0x0138, B:11:0x0029, B:14:0x0032, B:16:0x003a, B:19:0x0042, B:23:0x006f, B:64:0x0139, B:65:0x0154, B:20:0x0049, B:21:0x0068, B:22:0x0069, B:66:0x0155, B:67:0x015c, B:47:0x00dd, B:49:0x00ec, B:51:0x00f8, B:50:0x00f5), top: B:71:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc A[Catch: Exception -> 0x015d, TryCatch #0 {Exception -> 0x015d, blocks: (B:2:0x0000, B:8:0x001a, B:9:0x0023, B:10:0x0028, B:33:0x008f, B:36:0x0099, B:38:0x009f, B:40:0x00a9, B:42:0x00be, B:44:0x00cc, B:52:0x00fe, B:54:0x0104, B:60:0x0118, B:56:0x010b, B:57:0x010e, B:45:0x00da, B:41:0x00b4, B:59:0x0111, B:27:0x007b, B:30:0x0083, B:32:0x008b, B:62:0x011d, B:63:0x0138, B:11:0x0029, B:14:0x0032, B:16:0x003a, B:19:0x0042, B:23:0x006f, B:64:0x0139, B:65:0x0154, B:20:0x0049, B:21:0x0068, B:22:0x0069, B:66:0x0155, B:67:0x015c, B:47:0x00dd, B:49:0x00ec, B:51:0x00f8, B:50:0x00f5), top: B:71:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00da A[Catch: Exception -> 0x015d, TRY_LEAVE, TryCatch #0 {Exception -> 0x015d, blocks: (B:2:0x0000, B:8:0x001a, B:9:0x0023, B:10:0x0028, B:33:0x008f, B:36:0x0099, B:38:0x009f, B:40:0x00a9, B:42:0x00be, B:44:0x00cc, B:52:0x00fe, B:54:0x0104, B:60:0x0118, B:56:0x010b, B:57:0x010e, B:45:0x00da, B:41:0x00b4, B:59:0x0111, B:27:0x007b, B:30:0x0083, B:32:0x008b, B:62:0x011d, B:63:0x0138, B:11:0x0029, B:14:0x0032, B:16:0x003a, B:19:0x0042, B:23:0x006f, B:64:0x0139, B:65:0x0154, B:20:0x0049, B:21:0x0068, B:22:0x0069, B:66:0x0155, B:67:0x015c, B:47:0x00dd, B:49:0x00ec, B:51:0x00f8, B:50:0x00f5), top: B:71:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ec A[Catch: all -> 0x010a, TryCatch #1 {all -> 0x010a, blocks: (B:47:0x00dd, B:49:0x00ec, B:51:0x00f8, B:50:0x00f5), top: B:72:0x00dd, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f5 A[Catch: all -> 0x010a, TryCatch #1 {all -> 0x010a, blocks: (B:47:0x00dd, B:49:0x00ec, B:51:0x00f8, B:50:0x00f5), top: B:72:0x00dd, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0104 A[Catch: Exception -> 0x015d, TryCatch #0 {Exception -> 0x015d, blocks: (B:2:0x0000, B:8:0x001a, B:9:0x0023, B:10:0x0028, B:33:0x008f, B:36:0x0099, B:38:0x009f, B:40:0x00a9, B:42:0x00be, B:44:0x00cc, B:52:0x00fe, B:54:0x0104, B:60:0x0118, B:56:0x010b, B:57:0x010e, B:45:0x00da, B:41:0x00b4, B:59:0x0111, B:27:0x007b, B:30:0x0083, B:32:0x008b, B:62:0x011d, B:63:0x0138, B:11:0x0029, B:14:0x0032, B:16:0x003a, B:19:0x0042, B:23:0x006f, B:64:0x0139, B:65:0x0154, B:20:0x0049, B:21:0x0068, B:22:0x0069, B:66:0x0155, B:67:0x015c, B:47:0x00dd, B:49:0x00ec, B:51:0x00f8, B:50:0x00f5), top: B:71:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0111 A[Catch: Exception -> 0x015d, TryCatch #0 {Exception -> 0x015d, blocks: (B:2:0x0000, B:8:0x001a, B:9:0x0023, B:10:0x0028, B:33:0x008f, B:36:0x0099, B:38:0x009f, B:40:0x00a9, B:42:0x00be, B:44:0x00cc, B:52:0x00fe, B:54:0x0104, B:60:0x0118, B:56:0x010b, B:57:0x010e, B:45:0x00da, B:41:0x00b4, B:59:0x0111, B:27:0x007b, B:30:0x0083, B:32:0x008b, B:62:0x011d, B:63:0x0138, B:11:0x0029, B:14:0x0032, B:16:0x003a, B:19:0x0042, B:23:0x006f, B:64:0x0139, B:65:0x0154, B:20:0x0049, B:21:0x0068, B:22:0x0069, B:66:0x0155, B:67:0x015c, B:47:0x00dd, B:49:0x00ec, B:51:0x00f8, B:50:0x00f5), top: B:71:0x0000, inners: #1 }] */
    @Override // io.netty.handler.codec.ByteToMessageDecoder
    public void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        int i;
        int i2;
        int i3;
        byte[] bArrAllocInputBuffer;
        int iArrayOffset;
        ByteBuf byteBufHeapBuffer;
        byte[] bArrArray;
        try {
            int i4 = AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$LzfDecoder$State[this.currentState.ordinal()];
            int iArrayOffset2 = 0;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            throw new IllegalStateException();
                        }
                        byteBuf.skipBytes(byteBuf.readableBytes());
                        return;
                    }
                }
                i = this.chunkLength;
                if (byteBuf.readableBytes() < i) {
                    return;
                }
                i2 = this.originalLength;
                if (this.isCompressed) {
                    i3 = byteBuf.readerIndex();
                    if (byteBuf.hasArray()) {
                        bArrAllocInputBuffer = byteBuf.array();
                        iArrayOffset = byteBuf.arrayOffset() + i3;
                    } else {
                        bArrAllocInputBuffer = this.recycler.allocInputBuffer(i);
                        byteBuf.getBytes(i3, bArrAllocInputBuffer, 0, i);
                        iArrayOffset = 0;
                    }
                    byteBufHeapBuffer = channelHandlerContext.alloc().heapBuffer(i2, i2);
                    if (byteBufHeapBuffer.hasArray()) {
                        bArrArray = byteBufHeapBuffer.array();
                        iArrayOffset2 = byteBufHeapBuffer.arrayOffset() + byteBufHeapBuffer.writerIndex();
                    } else {
                        bArrArray = new byte[i2];
                    }
                    int i5 = iArrayOffset2;
                    try {
                        this.decoder.decodeChunk(bArrAllocInputBuffer, iArrayOffset, bArrArray, i5, i5 + i2);
                        if (byteBufHeapBuffer.hasArray()) {
                            byteBufHeapBuffer.writerIndex(byteBufHeapBuffer.writerIndex() + i2);
                        } else {
                            byteBufHeapBuffer.writeBytes(bArrArray);
                        }
                        list.add(byteBufHeapBuffer);
                        byteBuf.skipBytes(i);
                        if (!byteBuf.hasArray()) {
                            this.recycler.releaseInputBuffer(bArrAllocInputBuffer);
                        }
                    } catch (Throwable th) {
                        byteBufHeapBuffer.release();
                        throw th;
                    }
                } else if (i > 0) {
                    list.add(byteBuf.readRetainedSlice(i));
                }
                this.currentState = State.INIT_BLOCK;
            }
            if (byteBuf.readableBytes() < 5) {
                return;
            }
            if (byteBuf.readUnsignedShort() != 23126) {
                throw new DecompressionException("unexpected block identifier");
            }
            byte b = byteBuf.readByte();
            if (b == 0) {
                this.isCompressed = false;
                this.currentState = State.DECOMPRESS_DATA;
            } else {
                if (b != 1) {
                    throw new DecompressionException(String.format("unknown type of chunk: %d (expected: %d or %d)", Integer.valueOf(b), 0, 1));
                }
                this.isCompressed = true;
                this.currentState = State.INIT_ORIGINAL_LENGTH;
            }
            int unsignedShort = byteBuf.readUnsignedShort();
            this.chunkLength = unsignedShort;
            if (unsignedShort > 65535) {
                throw new DecompressionException(String.format("chunk length exceeds maximum: %d (expected: =< %d)", Integer.valueOf(this.chunkLength), 65535));
            }
            if (b != 1) {
                return;
            }
            if (byteBuf.readableBytes() < 2) {
                return;
            }
            int unsignedShort2 = byteBuf.readUnsignedShort();
            this.originalLength = unsignedShort2;
            if (unsignedShort2 > 65535) {
                throw new DecompressionException(String.format("original length exceeds maximum: %d (expected: =< %d)", Integer.valueOf(this.chunkLength), 65535));
            }
            this.currentState = State.DECOMPRESS_DATA;
            i = this.chunkLength;
            if (byteBuf.readableBytes() < i) {
                return;
            }
            i2 = this.originalLength;
            if (this.isCompressed) {
                i3 = byteBuf.readerIndex();
                if (byteBuf.hasArray()) {
                    bArrAllocInputBuffer = byteBuf.array();
                    iArrayOffset = byteBuf.arrayOffset() + i3;
                } else {
                    bArrAllocInputBuffer = this.recycler.allocInputBuffer(i);
                    byteBuf.getBytes(i3, bArrAllocInputBuffer, 0, i);
                    iArrayOffset = 0;
                }
                byteBufHeapBuffer = channelHandlerContext.alloc().heapBuffer(i2, i2);
                if (byteBufHeapBuffer.hasArray()) {
                    bArrArray = byteBufHeapBuffer.array();
                    iArrayOffset2 = byteBufHeapBuffer.arrayOffset() + byteBufHeapBuffer.writerIndex();
                } else {
                    bArrArray = new byte[i2];
                }
                int i6 = iArrayOffset2;
                this.decoder.decodeChunk(bArrAllocInputBuffer, iArrayOffset, bArrArray, i6, i6 + i2);
                if (byteBufHeapBuffer.hasArray()) {
                    byteBufHeapBuffer.writerIndex(byteBufHeapBuffer.writerIndex() + i2);
                } else {
                    byteBufHeapBuffer.writeBytes(bArrArray);
                }
                list.add(byteBufHeapBuffer);
                byteBuf.skipBytes(i);
                if (!byteBuf.hasArray()) {
                    this.recycler.releaseInputBuffer(bArrAllocInputBuffer);
                }
            } else if (i > 0) {
                list.add(byteBuf.readRetainedSlice(i));
            }
            this.currentState = State.INIT_BLOCK;
        } catch (Exception e2) {
            this.currentState = State.CORRUPTED;
            this.decoder = null;
            this.recycler = null;
            throw e2;
        }
    }

    public LzfDecoder(boolean z) {
        this.currentState = State.INIT_BLOCK;
        this.decoder = z ? ChunkDecoderFactory.safeInstance() : ChunkDecoderFactory.optimalInstance();
        this.recycler = BufferRecycler.instance();
    }
}
