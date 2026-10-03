package com.example.opponotificationrelay;

import java.io.*;
import java.nio.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;
import java.util.zip.CRC32;
import javax.crypto.Cipher;
import javax.crypto.spec.*;

/** 纯只读快照：校验文件一致性和CRC，只保留白名单键，不调用MMKV原生初始化。 */
final class MmkvSnapshot {
    static byte[] read(File f,int max) throws Exception {
        long length=f.length();
        if(!f.isFile() || length<1 || length>max) throw new IOException("FILE_BOUNDS");
        byte[] b=Files.readAllBytes(f.toPath());
        if(b.length!=length) throw new IOException("FILE_CHANGED");
        return b;
    }
    static int le(byte[] b,int p) {return ByteBuffer.wrap(b,p,4).order(ByteOrder.LITTLE_ENDIAN).getInt();}
    static String utf8(byte[] b) throws Exception {
        return StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT)
            .onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(b)).toString();
    }
    static final class Input {
        final byte[] b;int p;
        Input(byte[] value) {b=value;}
        long varint() throws IOException {
            long value=0;
            for(int shift=0;shift<63;shift+=7) {
                if(p>=b.length) throw new IOException("TRUNCATED_VARINT");
                int v=b[p++]&255;value|=(long)(v&127)<<shift;
                if((v&128)==0) return value;
            }
            throw new IOException("VARINT_LIMIT");
        }
        byte[] bytes(int max) throws IOException {
            long n=varint();
            if(n<0 || n>max || n>b.length-p) throw new IOException("LENGTH_LIMIT");
            byte[] value=Arrays.copyOfRange(b,p,p+(int)n);p+=(int)n;return value;
        }
        void skip(int wire) throws IOException {
            if(wire==0) {varint();return;}
            long n=wire==1?8:wire==5?4:wire==2?varint():-1;
            if(n<0 || n>b.length-p) throw new IOException("WIRE_LIMIT");p+=(int)n;
        }
    }
    static Map<String,byte[]> load(File file,byte[] key,Set<String> wanted) throws Exception {
        byte[] meta=read(new File(file.getPath()+".crc"),65536);
        byte[] data=read(file,2*1024*1024),plain=null;
        try {
            if(meta.length<112 || data.length<4) throw new IOException("HEADER_SHORT");
            int version=le(meta,4),size=le(data,0);
            if(version<1 || version>4 || size<1 || size>data.length-4) throw new IOException("FORMAT_UNSUPPORTED");
            if(version>=3 && size!=le(meta,28)) throw new IOException("SIZE_MISMATCH");
            if(version>=4 && ByteBuffer.wrap(meta,104,8).order(ByteOrder.LITTLE_ENDIAN).getLong()!=0)
                throw new IOException("FLAGS_UNSUPPORTED");
            CRC32 crc=new CRC32();crc.update(data,4,size);
            if(crc.getValue()!=Integer.toUnsignedLong(le(meta,0))) throw new IOException("CRC_MISMATCH");
            if(!Arrays.equals(meta,read(new File(file.getPath()+".crc"),65536))) throw new IOException("META_CHANGED");
            plain=Arrays.copyOfRange(data,4,4+size);
            if(key!=null) {
                if(key.length<16) throw new IOException("KEY_LENGTH");
                byte[] aesKey=Arrays.copyOf(key,16),iv=version>=2?Arrays.copyOfRange(meta,12,28):aesKey.clone();
                try {
                    Cipher cipher=Cipher.getInstance("AES/CFB/NoPadding");
                    cipher.init(Cipher.DECRYPT_MODE,new SecretKeySpec(aesKey,"AES"),new IvParameterSpec(iv));
                    byte[] result=cipher.doFinal(plain);Arrays.fill(plain,(byte)0);plain=result;
                } finally {Arrays.fill(aesKey,(byte)0);Arrays.fill(iv,(byte)0);}
            }
            Input input=new Input(plain);input.varint();
            Map<String,byte[]> result=new HashMap<>();int entries=0;
            while(input.p<plain.length) {
                if(++entries>20000) throw new IOException("ENTRY_LIMIT");
                String name=utf8(input.bytes(4096));
                if(name.isEmpty()) continue;
                byte[] value=input.bytes(2*1024*1024);
                if(wanted.contains(name)) {
                    byte[] old=value.length==0?result.remove(name):result.put(name,value);
                    if(old!=null) Arrays.fill(old,(byte)0);
                    if(value.length==0) Arrays.fill(value,(byte)0);
                } else Arrays.fill(value,(byte)0);
            }
            return result;
        } finally {Arrays.fill(data,(byte)0);Arrays.fill(meta,(byte)0);if(plain!=null)Arrays.fill(plain,(byte)0);}
    }
    static String string(Map<String,byte[]> map,String key) throws Exception {
        byte[] raw=map.get(key);if(raw==null) return null;
        Input in=new Input(raw);byte[] bytes=in.bytes(16384);
        try {
            if(in.p!=raw.length) throw new IOException("STRING_TRAILING");
            return utf8(bytes);
        } finally {Arrays.fill(bytes,(byte)0);}
    }
    static boolean flag(Map<String,byte[]> map,String key) throws Exception {
        byte[] value=map.get(key);
        if(value==null || value.length!=1 || (value[0]!=0&&value[0]!=1)) throw new IOException("FLAG_MISSING");
        return value[0]==1;
    }
    static Map<String,String> dataStore(File file,Set<String> wanted) throws Exception {
        byte[] b=read(file,1024*1024);Map<String,String> result=new HashMap<>();
        try {
            Input root=new Input(b);int count=0;
            while(root.p<b.length) {
                long tag=root.varint();
                if(tag!=10) {root.skip((int)(tag&7));continue;}
                if(++count>1000) throw new IOException("PROTO_ENTRY_LIMIT");
                Input entry=new Input(root.bytes(1024*1024));String key=null;byte[] value=null;
                while(entry.p<entry.b.length) {
                    long t=entry.varint();
                    if(t==10) key=utf8(entry.bytes(4096));
                    else if(t==18) value=entry.bytes(1024*1024);else entry.skip((int)(t&7));
                }
                if(key!=null && wanted.contains(key) && value!=null) {
                    Input v=new Input(value);String text=null;
                    while(v.p<v.b.length) {
                        long t=v.varint();if(t==42) text=utf8(v.bytes(16384));else v.skip((int)(t&7));
                    }
                    if(text!=null && result.put(key,text)!=null) throw new IOException("PROTO_DUPLICATE");
                }
                if(value!=null) Arrays.fill(value,(byte)0);Arrays.fill(entry.b,(byte)0);
            }
            return result;
        } finally {Arrays.fill(b,(byte)0);}
    }
    static String gunzip(byte[] bytes,int max) throws Exception {
        byte[] output=new byte[max+1];
        try(java.util.zip.GZIPInputStream in=new java.util.zip.GZIPInputStream(new ByteArrayInputStream(bytes))) {
            int used=0,n;
            while((n=in.read(output,used,output.length-used))>0) {
                used+=n;if(used>max) throw new IOException("GZIP_LIMIT");
            }
            byte[] value=Arrays.copyOf(output,used);
            try {return utf8(value);} finally {Arrays.fill(value,(byte)0);}
        } finally {Arrays.fill(output,(byte)0);}
    }
    static void wipe(Map<String,byte[]> map) {for(byte[] b:map.values()) Arrays.fill(b,(byte)0);map.clear();}
}
