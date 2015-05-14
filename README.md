# ZARD-lrc
ZARD lyrics Project

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
<embed>
https://raw.githubusercontent.com/tomszheng/ZARD-lrc/master/simulate%20output/Proj-ZARD-Lyric.pdf
</embed>

There is still a long long way to go, and the result is far from satisfication.

--------------------------
<code>Add example in html code</code> - 2015-5-14

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

<p align="center">
  <img src="https://github.com/tomszheng/ZARD-lrc/blob/master/html_example.PNG" width="500" style="text-align:center"/>
</p>

=============================
YOU are wellcome !
欢迎有兴趣的同学一起交流。

附上核心算法示意图 :-)
<p align="center">
  <img src="https://github.com/tomszheng/ZARD-lrc/blob/master/algo.PNG" width="500" style="text-align:center"/>
</p>

----
感谢百度贴吧的各位前辈的前期整理工作！ 2015-2-28
