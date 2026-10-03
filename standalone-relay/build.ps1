$ErrorActionPreference = 'Stop'
$OutputEncoding = [Console]::OutputEncoding = [System.Text.UTF8Encoding]::new()

$root = Split-Path -Parent $MyInvocation.MyCommand.Path
$work = Join-Path $env:TEMP ('oppo-notification-relay-' + [Guid]::NewGuid().ToString('N'))
$workApp = Join-Path $work 'app'
New-Item -ItemType Directory -Force -Path $work | Out-Null
$sourceApp = Join-Path $root 'app'
Copy-Item -LiteralPath $sourceApp -Destination $workApp -Recurse -Force

# ========== 版本号管理 ==========
$versionFile = Join-Path $root 'version.txt'
if (Test-Path $versionFile) {
    $versionName = (Get-Content -LiteralPath $versionFile -Raw -Encoding UTF8).Trim()
} else {
    $versionName = '0.1.0'
}
$vParts = $versionName.Split('.')
$versionCode = [int]$vParts[0] * 10000 + [int]$vParts[1] * 100 + [int]$vParts[2]
Write-Output "当前版本: $versionName (versionCode=$versionCode)"

$sdk = if ($env:ANDROID_HOME) { $env:ANDROID_HOME } else { 'D:\Android\Sdk' }
$platform = Join-Path $sdk 'platforms\android-35\android.jar'
$buildTools = Join-Path $sdk 'build-tools\36.0.0'
$aapt2 = Join-Path $buildTools 'aapt2.exe'
$d8 = Join-Path $buildTools 'd8.bat'
$zipalign = Join-Path $buildTools 'zipalign.exe'
$apksigner = Join-Path $buildTools 'apksigner.bat'
$javaHome = if ($env:JAVA_HOME) { $env:JAVA_HOME } elseif (Test-Path -LiteralPath 'C:\Program Files (x86)\jdk-17.0.6+10') { 'C:\Program Files (x86)\jdk-17.0.6+10' } else { Split-Path -Parent (Split-Path -Parent (Get-Command java.exe -ErrorAction Stop).Source) }
$java = Join-Path $javaHome 'bin\java.exe'
$javac = Join-Path $javaHome 'bin\javac.exe'
$jar = Join-Path $javaHome 'bin\jar.exe'
$keytool = Join-Path $javaHome 'bin\keytool.exe'

foreach ($path in @($platform, $aapt2, $d8, $zipalign, $apksigner, $java, $javac, $jar, $keytool)) {
    if (-not (Test-Path -LiteralPath $path)) { throw "找不到构建工具或 android.jar: $path" }
}

$distDir = Split-Path -Parent $root
$workBuild = Join-Path $work 'build'
$resCompiled = Join-Path $workBuild 'compiled-res.zip'
$resLinked = Join-Path $workBuild 'linked'
$classes = Join-Path $workBuild 'classes'
$generated = Join-Path $workBuild 'generated'
$dex = Join-Path $workBuild 'dex'
$unsigned = Join-Path $workBuild 'unsigned.apk'
$aligned = Join-Path $workBuild 'oppo-notification-relay-unsigned-aligned.apk'
$output = Join-Path $distDir "oppo-notification-relay-v${versionName}-debug.apk"
$keystore = Join-Path $distDir 'debug.keystore'

New-Item -ItemType Directory -Force -Path $distDir, $workBuild, $resLinked, $classes, $dex | Out-Null
Remove-Item -LiteralPath $resCompiled, $unsigned, $aligned, $output -Force -ErrorAction SilentlyContinue
New-Item -ItemType Directory -Force -Path $classes, $dex, $generated | Out-Null

& $aapt2 compile --dir (Join-Path $workApp 'src\main\res') -o $resCompiled
if ($LASTEXITCODE -ne 0) { throw "aapt2 compile 失败: $LASTEXITCODE" }
& $aapt2 link --java $generated -o $unsigned -I $platform --manifest (Join-Path $workApp 'src\main\AndroidManifest.xml') --auto-add-overlay --min-sdk-version 29 --target-sdk-version 35 --version-code $versionCode --version-name $versionName $resCompiled
if ($LASTEXITCODE -ne 0) { throw "aapt2 link 失败: $LASTEXITCODE" }

$officialUi = Join-Path $root 'official-ui'
$officialApi = Join-Path $officialUi 'compile-only-api.jar'
$classPath = $platform + ';' + $officialApi
$sources = Get-ChildItem -LiteralPath (Join-Path $workApp 'src\main\java') -Recurse -Filter '*.java' | Select-Object -ExpandProperty FullName
$sources += Get-ChildItem -LiteralPath $generated -Recurse -Filter '*.java' | Select-Object -ExpandProperty FullName
& $javac '-J-Dfile.encoding=UTF-8' -encoding UTF-8 -source 8 -target 8 -cp $classPath -d $classes $sources
if ($LASTEXITCODE -ne 0) { throw "javac 失败: $LASTEXITCODE" }
$classesJar = Join-Path $workBuild 'classes.jar'
Remove-Item -LiteralPath $classesJar -Force -ErrorAction SilentlyContinue
& $jar cf $classesJar -C $classes .
if ($LASTEXITCODE -ne 0) { throw "jar 打包失败: $LASTEXITCODE" }
& $d8 --lib $platform --classpath $officialApi --output $dex $classesJar
if ($LASTEXITCODE -ne 0) { throw "d8 失败: $LASTEXITCODE" }
& $jar uf $unsigned -C $dex classes.dex
if ($LASTEXITCODE -ne 0) { throw "写入 APK 失败: $LASTEXITCODE" }

# Original UI classes retain their own resource package in an isolated Resources context.
# compile-only-api.jar contains signatures only and MUST NOT be packaged as runtime code.
$officialDexWork = Join-Path $workBuild 'official-ui-dex'
New-Item -ItemType Directory -Force -Path $officialDexWork | Out-Null
$officialDexIndex = 2
Get-ChildItem -LiteralPath (Join-Path $officialUi 'dex') -Filter '*.dex' | Sort-Object { if ($_.BaseName -eq 'classes') { 1 } else { [int]($_.BaseName.Substring(7)) } } | ForEach-Object {
    $dexName = 'classes' + $officialDexIndex + '.dex'
    Copy-Item -LiteralPath $_.FullName -Destination (Join-Path $officialDexWork $dexName)
    $officialDexIndex++
}
& $jar uf $unsigned -C $officialDexWork . -C $officialUi assets/official-ui-resources.apk -C (Join-Path $officialUi 'java-resources') META-INF/services
if ($LASTEXITCODE -ne 0) { throw 'Official UI resources packaging failed' }


# Root observer loads only its own small class closure, not the entire UI/protocol APK dex.
$helperClasses = Join-Path $workBuild 'helper-classes'
$helperPackage = Join-Path $helperClasses 'com\example\opponotificationrelay'
$helperDex = Join-Path $workBuild 'helper-dex'
$assets = Join-Path $workBuild 'assets'
# Build and bundle the native observer; legacy devices retain the Java helper.
& (Join-Path $root 'native\build.ps1')
if ($LASTEXITCODE -ne 0) { throw 'Native observer build failed' }

New-Item -ItemType Directory -Force -Path $helperPackage, $helperDex, $assets | Out-Null
Get-ChildItem -LiteralPath (Join-Path $classes 'com\example\opponotificationrelay') -Filter '*.class' |
    Where-Object { $_.Name -match '^(RootHealthObserver|RootObserverBootstrap|ObserverMessage|HandoverPolicy|CoalescedRecheck|ObserverStateGate)(\$.*)?\.class$' } |
    ForEach-Object { Copy-Item -LiteralPath $_.FullName -Destination $helperPackage }
$helperJar = Join-Path $workBuild 'helper-classes.jar'
& $jar cf $helperJar -C $helperClasses .
if ($LASTEXITCODE -ne 0) { throw 'Helper class packaging failed' }
& $d8 --lib $platform --min-api 29 --output $helperDex $helperJar
if ($LASTEXITCODE -ne 0) { throw 'Helper dex build failed' }
& $jar cf (Join-Path $assets 'root-observer.jar') -C $helperDex classes.dex
if ($LASTEXITCODE -ne 0) { throw 'Helper dex packaging failed' }
Copy-Item -LiteralPath (Join-Path $root 'native\build\root-observer-arm64') -Destination (Join-Path $assets 'root-observer-arm64')
& $jar uf $unsigned -C $workBuild assets/root-observer-arm64
if ($LASTEXITCODE -ne 0) { throw 'Native observer asset packaging failed' }
& $jar uf $unsigned -C $workBuild assets/root-observer.jar
if ($LASTEXITCODE -ne 0) { throw 'Helper asset packaging failed' }


# One-shot settings reader contains no UI/transport code; official SQLCipher remains in the installed official APK.
$settingsClasses = Join-Path $workBuild 'settings-classes'
$settingsPackage = Join-Path $settingsClasses 'com\example\opponotificationrelay'
$settingsDex = Join-Path $workBuild 'settings-dex'
New-Item -ItemType Directory -Force -Path $settingsPackage, $settingsDex | Out-Null
Get-ChildItem -LiteralPath (Join-Path $classes 'com\example\opponotificationrelay') -Filter '*.class' |
    Where-Object { $_.Name -match '^(RootOfficialSettingsReader|RootHealthDataReader|RootActivityBridge|ActivityBridgePolicy|RootSleepSettingsReader|RootNapWriter|OfficialNapBridge|NapWritePolicy|SettingsImportPlan|MmkvSnapshot|OfficialSettingsPreview|SettingsPreviewProtocol)(\$.*)?\.class$' } |
    ForEach-Object { Copy-Item -LiteralPath $_.FullName -Destination $settingsPackage }
$settingsJar = Join-Path $workBuild 'settings-classes.jar'
& $jar cf $settingsJar -C $settingsClasses .
if ($LASTEXITCODE -ne 0) { throw 'Settings reader classes failed' }
& $d8 --lib $platform --min-api 33 --output $settingsDex $settingsJar
if ($LASTEXITCODE -ne 0) { throw 'Settings reader dex failed' }
& $jar cf (Join-Path $assets 'settings-reader.jar') -C $settingsDex classes.dex
if ($LASTEXITCODE -ne 0) { throw 'Settings reader asset failed' }
& $jar uf $unsigned -C $workBuild assets/settings-reader.jar
if ($LASTEXITCODE -ne 0) { throw 'Settings reader APK packaging failed' }

& $zipalign -f -p 4 $unsigned $aligned
if ($LASTEXITCODE -ne 0) { throw "zipalign 失败: $LASTEXITCODE" }
if (-not (Test-Path -LiteralPath $keystore)) {
    & $keytool -genkeypair -keystore $keystore -storepass android -keypass android -alias androiddebugkey -keyalg RSA -keysize 2048 -validity 10000 -dname 'CN=Android Debug,O=Android,C=US' | Out-Null
}
& $apksigner sign --ks $keystore --ks-pass pass:android --key-pass pass:android --ks-key-alias androiddebugkey --out $output $aligned
if ($LASTEXITCODE -ne 0) { throw "apksigner sign 失败: $LASTEXITCODE" }
& $apksigner verify --verbose $output
if ($LASTEXITCODE -ne 0) { throw "apksigner verify 失败: $LASTEXITCODE" }

# ========== 版本号自动递增 ==========
$newPatch = [int]$vParts[2] + 1
$newVersion = "$($vParts[0]).$($vParts[1]).$newPatch"
try {
    Set-Content -LiteralPath $versionFile -Value $newVersion -NoNewline -Encoding UTF8
} catch {
    Write-Warning "版本号自动递增失败，保留当前 version.txt：$($_.Exception.Message)"
}
Write-Output ""
Write-Output "已生成: $output"
Write-Output "版本: $versionName (versionCode=$versionCode)"
Write-Output "下次构建版本将自动递增为: $newVersion"
