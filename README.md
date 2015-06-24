# ZARD-lrc
ZARD lyrics Project

=============================
Online Book [Experiment] is now available!
<<<<<<< HEAD
>see [ZARD Lyrics Book Online](http://tomszheng.gitbooks.io/zard_lyrics/content/)
>also see [ZARD Lyrics Book Online](http://47.88.2.219:8080/ZARD/_book/index.html)
=======
>see [ZARD Lyrics Book Online](http://tomszheng.gitbooks.io/zard-lyrics/content/)
>>>>>>> c9e819a721e3a4e21c8c5f1d42f7cba41981e75b

Site's QR code:
<p align="center">
  <img src="https://github.com/tomszheng/ZARD-lrc/blob/master/site.PNG" width="500" style="text-align:center"/>
</p>

PDF file is available now:
>see [book.pdf](http://47.88.2.219:8080/ZARD/_book/book.pdf)

==============================
* 本项目旨在通过现有的歌词文件(以日语歌词为例)，通过代码生成排版更为精美的歌词文档。
* This project aims to make nice Lyric files (will be in PDF format) by using existing lyric files.

PDF文件将由Latex生成。
Latex文件的部分代码将由java代码生成。

Input file will be like this
------------------------
<b>lrc file - Version One</b>
~~~
愛（あい）は手探（てさぐ）り
暗闇（くらやみ）の中（なか）で
踊（おど）る　It's gonna be a great night, yeah～

駆（か）け拔（ぬ）ける　Freeway
この思（おも）い　To be your slave
Oh, you, crazy rainy night, no one care
素直（すなお）になれ　Night　濡（ぬ）れた　Memories

こんなにも　For you
感（かん）じてる　But you're so cold
Oh! Tonight and everynight, you'd be mine
目移（めうつ）り気（き）になる
恋（こい）の駆（か）け引（ひ）き
~~~
------------------------

<b>lrc file - <code>Version Two</code></b>

In <code>{X|Y}</code> , <code>X</code> indicates the string and <code>Y</code> indicates how to read it.

~~~
{愛|あい}は{手探|てさぐ}り
{暗闇|くらやみ}の{中|なか}で
{踊|おど}る　It's gonna be a great night, yeah～

{駆|か}け{拔|ぬ}ける　Freeway
この{思|おも}い　To be your slave
Oh, you, crazy rainy night, no one care
{素直|すなお}になれ　Night　{濡|ぬ}れた　Memories

こんなにも　For you
{感|かん}じてる　But you're so cold
Oh! Tonight and everynight, you'd be mine
{目移|めうつ}り{気|き}になる
{恋|こい}の{駆|か}け{引|ひ}き
~~~

Output file example ?
------------------------
Example in Tex output:

<embed>
https://raw.githubusercontent.com/tomszheng/ZARD-lrc/master/simulate%20output/Proj-ZARD-Lyric.pdf
</embed>


--------------------------

Added example in html code
>the markdown will show it nicely in the browser directly. - 2015-5-14

<p align="center">

<br><ruby>愛<rt>あい</ruby>は<ruby>手探<rt>てさぐ</ruby>り
<br><ruby>暗闇<rt>くらやみ</ruby>の<ruby>中<rt>なか</ruby>で
<br><ruby>踊<rt>おど</ruby>る　It's gonna be a great night, yeah～

<br><br><ruby>駆<rt>か</ruby>け<ruby>拔<rt>ぬ</ruby>ける　Freeway
<br>この<ruby>思<rt>おも</ruby>い　To be your slave
<br>Oh, you, crazy rainy night, no one care
<br><ruby>素直<rt>すなお</ruby>になれ　Night　<ruby>濡<rt>ぬ</ruby>れた　Memories

<br><br>こんなにも　For you
<br><ruby>感<rt>かん</ruby>じてる　But you're so cold
<br>Oh! Tonight and everynight, you'd be mine
<br><ruby>目移<rt>めうつ</ruby>り<ruby>気<rt>き</ruby>になる
<br><ruby>恋<rt>こい</ruby>の<ruby>駆<rt>か</ruby>け<ruby>引<rt>ひ</ruby>き

</p>

=============================

附上核心算法示意图 :-)
<p align="center">
  <img src="https://github.com/tomszheng/ZARD-lrc/blob/master/algo.PNG" width="500" style="text-align:center"/>
</p>

该算法用于将`lrc file - Version One`转换成`lrc file - Version Two`,核心思路是从每行的最后一个字符从后向前扫描。

- 扫到")"替换成"}"
- 扫到"("替换成"|"
- 扫到"X"替换成"{"

关键就是对于"X"的判定

本算法中认为，平假名、片假名、英文、汉字不连用。类型转变时，代表新的"段"的开始。

Following are the main handle functions.

```java
package com.zard; //Just go in to this file to see what happened.

//示例代码中为将歌词(Version One)替换为 tex 格式，后面将会添加 替换为html格式 的代码。
private static String AnalyseLine(String line);
private static int typeOf(char character);
```

----
感谢百度贴吧的各位前辈的前期整理工作！ 

2015-2-28 - First Version 
>Original File -> `Tex`

2015-5-15 - Second Version 
>Original File -> `HTML`


----
### 参考页面 ###
包含`罗马读音`以及`英文翻译`
>[http://zardthebest.tripod.com/translation.html](http://http://zardthebest.tripod.com/translation.html "English_Version_Lyric")

`lrc`格式的歌词
>[https://github.com/adanBreak/ZARD-Lyric](https://github.com/adanBreak/ZARD-Lyric "Lyrics_in_lrc_format")

百度`ZARD吧` <u>田可柔</u> 精心整理
[http://pan.baidu.com/s/1o62vRei](http://pan.baidu.com/s/1o62vRei) 

- 密码: `tkta`

**若以上连接失效，请留言。**
