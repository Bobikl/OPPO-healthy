import com.android.tools.smali.dexlib2.*;
import com.android.tools.smali.dexlib2.iface.*;
import com.android.tools.smali.dexlib2.writer.pool.DexPool;
import com.android.tools.smali.dexlib2.writer.io.FileDataStore;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;
/** Original class bodies only; shared classes remain in the existing UI runtime. */
public final class RuntimeSubset {
 public static void main(String[] args)throws Exception {
  Set<String> wanted=new TreeSet<>(Files.readAllLines(Paths.get(args[1]),StandardCharsets.UTF_8));
  DexPool pool=new DexPool(Opcodes.forDexVersion(39));
  var source=DexFileFactory.loadDexContainer(new File(args[0]),Opcodes.getDefault());
  Set<String> found=new TreeSet<>();
  for(String entry:source.getDexEntryNames()) for(ClassDef cls:source.getEntry(entry).getDexFile().getClasses())
   if(wanted.contains(cls.getType())){if(!found.add(cls.getType()))throw new IllegalStateException("Duplicate class");pool.internClass(cls);}
  if(!found.equals(wanted))throw new IllegalStateException("Missing selected classes");
  FileDataStore output=new FileDataStore(new File(args[2]));try{pool.writeTo(output);}finally{output.close();}
  System.out.println("Original runtime classes: "+found.size());
 }
}