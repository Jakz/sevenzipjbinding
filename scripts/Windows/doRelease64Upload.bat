@echo off

call env-win64.bat

SET BUILD_DIR=SevenZipJBinding.Release64

cd %BUILD_DIR%

%MSYS_CMD% 'scp *.zip %SCP_UPLOAD_PATH%'

cd ..