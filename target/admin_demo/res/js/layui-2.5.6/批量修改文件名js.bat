::══代══码══开══始═══
@echo off
for /f "delims=" %%i in ('dir /a-d /b /s *.js') do (
if not "%%i"==%0 ren "%%i" "%%~ni")

for /f "delims=" %%i in ('dir /a-d /b /s *.min') do (
if not "%%i"==%0 ren "%%i" "%%~ni.js")
echo 命名完毕
pause
::══代══码══结══束═══

::══  for /参数[/D /L /R /F] %变量 in (集) do 命令
::══  for /D %%变量 in (集) do 命令  /D 参数是指定仅对目录而不是文件执行的for命令
::══  for /R 此处可以带有路径 %变量 in (集) do 命令  /R 参数之后还可带盘符及路径
::══  for /L %%变量 in (起始值,每次增值,结束时的比较值) do 命令 /L 参数带起始值,每次增值,结束时的比较值
::══  for /F %%变量 in (集) do 命令  /F 参数打开(集)里的文件，使for命令能处理文本文件的读取和添加删除替换等编辑性的操作
::══  dir /a-d /b /s 来获取完整路径名
::══   ~I - 删除任何引号("),扩充 %I
::══ %~fI - 将 %I 扩充到一个完全合格的路径名
::══ %~dI - 仅将 %I 扩充到一个驱动器号
::══ %~pI - 仅将 %I 扩充到一个路径
::══ %~nI - 仅将 %I 扩充到一个文件名
::══ %~xI - 仅将 %I 扩充到一个文件扩展名
::══ %~sI - 扩充的路径只含有短名
::══ %~aI - 将 %I 扩充到文件的文件属性
::══ %~tI - 将 %I 扩充到文件的日期/时间
::══ %~zI - 将 %I 扩充到文件的大小
::══ %~$PATH:I - 查找列在路径环境变量的目录，并将 %I 扩充到找到的第一个完全合格的名称。如果环境变量名未被定义，或者没有找到文件，此组合键会扩充到空字符串。
::══ %%~dpa. 来获取音乐文件所处的文件夹完整路径(%~d %~p %~a组合)