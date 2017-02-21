# 俺流SpringBoot
---------------

#### 20170221

Helloworld実装しただけ

###### 今日のハマりポイント
  EclipseでGradleを動かしたらJREにtool.jarがないと怒られた。
	どうやら環境変数JAVA_HOMEとは別のところを見ているらしい
	(JAVA_HOMEはCドライブのJREではなくDドライブのJDKを指しているのだが、Gradle実行時のパスはCドライブを向いている様子)

  Preferences => Gradle(STS) =>Argments => Java Home =>Execution EnvironmentでJavaSE-1.8を選択・設定することで解決した。

    参考    "http://www.andr0o0id.com/?p=2245"

    
    