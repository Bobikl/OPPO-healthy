$ErrorActionPreference='Stop'
$OutputEncoding=[Console]::OutputEncoding=[System.Text.UTF8Encoding]::new()
$nativeRoot=Split-Path -Parent $MyInvocation.MyCommand.Path
$nativeWork=Join-Path $env:TEMP ('oppo-native-'+[Guid]::NewGuid().ToString('N'))
New-Item -ItemType Directory -Force -Path $nativeWork | Out-Null
Copy-Item -LiteralPath (Join-Path $nativeRoot 'root_observer.cpp') -Destination (Join-Path $nativeWork 'root_observer.cpp')
$sdkRoot=if($env:ANDROID_HOME){$env:ANDROID_HOME}else{'D:\Android\Sdk'}
$ndkRoot=if($env:ANDROID_NDK_HOME){$env:ANDROID_NDK_HOME}else{Join-Path $sdkRoot 'ndk\29.0.14206865'}
$toolchain=Join-Path $ndkRoot 'toolchains\llvm\prebuilt\windows-x86_64\bin'
$compiler=Join-Path $toolchain 'clang++.exe'
if(-not(Test-Path -LiteralPath $compiler)){throw 'Set ANDROID_NDK_HOME to Android NDK 29 (Windows x86_64).'}
$out=Join-Path $nativeWork 'root-observer'
& $compiler --target=aarch64-linux-android33 -std=c++17 -O2 -fPIE -pie -static-libstdc++ -ffunction-sections -fdata-sections '-Wl,--gc-sections' '-Wl,-z,max-page-size=16384' -Wall -Wextra -Werror (Join-Path $nativeWork 'root_observer.cpp') -lbinder_ndk -ldl -o $out
if($LASTEXITCODE -ne 0){throw 'Native observer compilation failed'}
$strip=Join-Path $toolchain 'llvm-strip.exe'
& $strip $out
if($LASTEXITCODE -ne 0){throw 'Native observer strip failed'}
$nativeBuild=Join-Path $nativeRoot 'build'
New-Item -ItemType Directory -Force -Path $nativeBuild | Out-Null
Copy-Item -LiteralPath $out -Destination (Join-Path $nativeBuild 'root-observer-arm64')
Write-Output (Join-Path $nativeBuild 'root-observer-arm64')
