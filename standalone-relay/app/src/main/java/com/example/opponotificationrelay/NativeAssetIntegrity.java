package com.example.opponotificationrelay;

import java.io.*;
import java.security.*;

/** Bound and verify observer bytes against the asset in this installed APK. */
final class NativeAssetIntegrity {
    private static final int LIMIT=1024*1024;
    static byte[] hash(InputStream input)throws IOException{
        try(InputStream in=input){
            MessageDigest digest=MessageDigest.getInstance("SHA-256");
            byte[] buffer=new byte[8192];int count=0,n;
            while((n=in.read(buffer))!=-1){
                count+=n;if(count>LIMIT)throw new IOException("native size");digest.update(buffer,0,n);
            }
            if(count==0)throw new IOException("native empty");
            return digest.digest();
        }catch(NoSuchAlgorithmException impossible){throw new IllegalStateException(impossible);}
    }
    static boolean matches(File file,byte[] expected)throws IOException{
        if(!file.isFile()||file.length()==0||file.length()>LIMIT)return false;
        return MessageDigest.isEqual(expected,hash(new FileInputStream(file)));
    }
}
