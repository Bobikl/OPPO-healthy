param([string]$TemporaryRoot='D:\CodexData\scratch')
$ErrorActionPreference='Stop'
$OutputEncoding=[Console]::OutputEncoding=[System.Text.UTF8Encoding]::new()
$nativeRoot=Split-Path -Parent $MyInvocation.MyCommand.Path
if(-not [IO.Path]::IsPathRooted($TemporaryRoot)){throw 'TemporaryRoot must be absolute'}
$nativeTempRoot=([IO.Path]::GetFullPath($TemporaryRoot)).TrimEnd([char[]]@('\','/'))
New-Item -ItemType Directory -Force -Path $nativeTempRoot | Out-Null
if((Get-Item -LiteralPath $nativeTempRoot).Attributes -band [IO.FileAttributes]::ReparsePoint){throw 'TemporaryRoot must not be a reparse point'}
$nativeWork=Join-Path $nativeTempRoot ('oppo-native-'+[Guid]::NewGuid().ToString('N'))
try {
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
} finally {
    try {
        if (Test-Path -LiteralPath $nativeWork) {
            $cleanupDirectory = Get-Item -LiteralPath $nativeWork -Force -ErrorAction Stop
            if (-not $cleanupDirectory.PSIsContainer -or
                -not [string]::Equals([IO.Path]::GetDirectoryName($cleanupDirectory.FullName), $nativeTempRoot, [StringComparison]::OrdinalIgnoreCase) -or
                $cleanupDirectory.Name -notmatch '^oppo-native-[0-9a-f]{32}$' -or
                ($cleanupDirectory.Attributes -band [IO.FileAttributes]::ReparsePoint)) {
                throw 'Build cleanup target failed path validation'
            }
            $linkedEntry = Get-ChildItem -LiteralPath $cleanupDirectory.FullName -Recurse -Force -Attributes ReparsePoint -ErrorAction Stop | Select-Object -First 1
            if ($null -ne $linkedEntry) { throw 'Build cleanup target contains a reparse point' }
            Remove-Item -LiteralPath $cleanupDirectory.FullName -Recurse -Force -ErrorAction Stop
        }
    } catch {
        Write-Warning "原生临时构建目录清理失败：$nativeWork；$($_.Exception.Message)"
    }
}
