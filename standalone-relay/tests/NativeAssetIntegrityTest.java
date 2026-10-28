package com.example.opponotificationrelay;
import java.io.*;import java.nio.file.*;import java.util.*;
public final class NativeAssetIntegrityTest {
    static int checks;
    static void check(boolean value){checks++;if(!value)throw new AssertionError("ASSET_"+checks);}
    public static void main(String[] args)throws Exception{
        byte[] bytes=new byte[]{1,2,3,4};byte[] expected=NativeAssetIntegrity.hash(new ByteArrayInputStream(bytes));
        Path folder=Files.createTempDirectory("observer-integrity-test-");File file=folder.resolve("observer").toFile();
        try{
            check(!NativeAssetIntegrity.matches(file,expected));
            Files.write(file.toPath(),bytes);check(NativeAssetIntegrity.matches(file,expected));
            Files.write(file.toPath(),new byte[]{4,3,2,1});check(!NativeAssetIntegrity.matches(file,expected));
            Files.write(file.toPath(),new byte[]{1,2});check(!NativeAssetIntegrity.matches(file,expected));
            Files.write(file.toPath(),new byte[0]);check(!NativeAssetIntegrity.matches(file,expected));
            Files.write(file.toPath(),new byte[1024*1024+1]);check(!NativeAssetIntegrity.matches(file,expected));
            for(int size:new int[]{0,1024*1024+1})try{
                NativeAssetIntegrity.hash(new ByteArrayInputStream(new byte[size]));throw new AssertionError("unbounded asset");
            }catch(IOException rejected){checks++;}
            Files.write(file.toPath(),bytes);check(NativeAssetIntegrity.matches(file,expected));
            check(Arrays.equals(expected,NativeAssetIntegrity.hash(new ByteArrayInputStream(bytes))));
        }finally{Files.deleteIfExists(file.toPath());Files.delete(folder);}
        System.out.println("NativeAssetIntegrityTest: "+checks+" checks passed");
    }
}
