package com.example.opponotificationrelay;
import java.nio.*;import java.nio.file.*;import java.util.*;import java.io.*;import java.util.zip.CRC32;
import javax.crypto.Cipher;import javax.crypto.spec.*;
public class MmkvSnapshotTest {
 static int count;static void check(boolean b){count++;if(!b)throw new AssertionError("case "+count);}
 static byte[] hex(String s){byte[] b=new byte[s.length()/2];for(int i=0;i<b.length;i++)b[i]=(byte)Integer.parseInt(s.substring(i*2,i*2+2),16);return b;}
 static byte[] var(int v){ByteArrayOutputStream o=new ByteArrayOutputStream();while(v>=128){o.write((v&127)|128);v>>>=7;}o.write(v);return o.toByteArray();}
 static byte[] data(byte[] b)throws Exception{ByteArrayOutputStream o=new ByteArrayOutputStream();o.write(var(b.length));o.write(b);return o.toByteArray();}
 static byte[] str(String s)throws Exception{return data(s.getBytes("UTF-8"));}
 static byte[] concat(byte[]...chunks)throws Exception{ByteArrayOutputStream o=new ByteArrayOutputStream();for(byte[] b:chunks)o.write(b);return o.toByteArray();}
 static void put(byte[] b,int p,int x){ByteBuffer.wrap(b,p,4).order(ByteOrder.LITTLE_ENDIAN).putInt(x);}
 static void fixture(Path p,byte[] clear,byte[] key)throws Exception{
  byte[] iv=hex("000102030405060708090a0b0c0d0e0f"),value=clear;
  if(key!=null){Cipher c=Cipher.getInstance("AES/CFB/NoPadding");c.init(Cipher.ENCRYPT_MODE,new SecretKeySpec(Arrays.copyOf(key,16),"AES"),new IvParameterSpec(iv));value=c.doFinal(clear);}
  byte[] file=new byte[value.length+4],meta=new byte[4096];put(file,0,value.length);System.arraycopy(value,0,file,4,value.length);
  CRC32 crc=new CRC32();crc.update(value);put(meta,0,(int)crc.getValue());put(meta,4,4);put(meta,28,value.length);System.arraycopy(iv,0,meta,12,16);
  Files.write(p,file);Files.write(Paths.get(p+".crc"),meta);
 }
 static void reject(Path p,byte[] key)throws Exception{
  boolean rejected=false;try{MmkvSnapshot.load(p.toFile(),key,Collections.singleton("wanted"));}catch(Exception expected){rejected=true;}check(rejected);
 }
 public static void main(String[] args)throws Exception{
  byte[] key=hex("2b7e151628aed2a6abf7158809cf4f3c");
  Cipher n=Cipher.getInstance("AES/CFB/NoPadding");n.init(Cipher.DECRYPT_MODE,new SecretKeySpec(key,"AES"),new IvParameterSpec(hex("000102030405060708090a0b0c0d0e0f")));
  check(Arrays.equals(n.doFinal(hex("3b3fd92eb72dad20333449f8e83cfb4a")),hex("6bc1bee22e409f96e93d7e117393172a")));
  Path p=Paths.get(args[0],"synthetic-mmkv");
  byte[] clear=concat(var(0),str("ignored"),data(str("secret-not-returned")),str("wanted"),data(str("old")),
   str("wanted"),data(new byte[0]),str("wanted"),data(str("午休13:00")));
  for(byte[] crypt:new byte[][]{null,key}){
   fixture(p,clear,crypt);Map<String,byte[]> got=MmkvSnapshot.load(p.toFile(),crypt,Collections.singleton("wanted"));
   check(got.size()==1);check("午休13:00".equals(MmkvSnapshot.string(got,"wanted")));MmkvSnapshot.wipe(got);check(got.isEmpty());
   byte[] original=Files.readAllBytes(p);original[original.length-1]^=1;Files.write(p,original);reject(p,crypt);
   fixture(p,clear,crypt);byte[] meta=Files.readAllBytes(Paths.get(p+".crc"));put(meta,28,1);Files.write(Paths.get(p+".crc"),meta);reject(p,crypt);
   fixture(p,clear,crypt);meta=Files.readAllBytes(Paths.get(p+".crc"));put(meta,104,1);Files.write(Paths.get(p+".crc"),meta);reject(p,crypt);
   fixture(p,clear,crypt);meta=Files.readAllBytes(Paths.get(p+".crc"));put(meta,4,99);Files.write(Paths.get(p+".crc"),meta);reject(p,crypt);
   fixture(p,new byte[]{0,(byte)128},crypt);reject(p,crypt);
  }
  fixture(p,clear,key);reject(p,new byte[16]);
  byte[] value=concat(new byte[]{42},str("wrapped-only"));
  byte[] entry=concat(new byte[]{10},str("db_key"),new byte[]{18},data(value));
  Path ds=Paths.get(args[0],"synthetic.preferences_pb");Files.write(ds,concat(new byte[]{10},data(entry)));
  check("wrapped-only".equals(MmkvSnapshot.dataStore(ds.toFile(),Collections.singleton("db_key")).get("db_key")));
  check(MmkvSnapshot.dataStore(ds.toFile(),Collections.singleton("unselected")).isEmpty());
  ByteArrayOutputStream gz=new ByteArrayOutputStream();try(java.util.zip.GZIPOutputStream out=new java.util.zip.GZIPOutputStream(gz)){out.write("synthetic-account".getBytes("UTF-8"));}
  check("synthetic-account".equals(MmkvSnapshot.gunzip(gz.toByteArray(),256)));
  boolean limited=false;try{MmkvSnapshot.gunzip(gz.toByteArray(),4);}catch(IOException expected){limited=true;}check(limited);
  System.out.println("PASS "+count+" checks: NIST CFB vector, plaintext/encrypted snapshots, selected keys, deletion, corruption, size/flags/version/truncation rejection, protobuf.");
 }
}
