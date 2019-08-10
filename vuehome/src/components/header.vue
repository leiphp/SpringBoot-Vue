<template>
  <div class="header">
    <header>
    <div class="topbg">
      <ul class="topnav">
        <a href="/ " target="_blank">Home</a><a href="/ " target="_blank">官方微博</a><a href="/ " target="_blank">关于我们</a>
      </ul>
    </div>
    <div class="topbgline"></div>
    <div class="logo">
      <div class="logo_l f_l"><a href="/"><img src="images/logo.png"></a></div>
      <div class="logo_r f_r"><a href="/"><img src="images/search.png"></a></div>
    </div>
    <nav id="topnav">
      <ul>
        <a href="index.html" target="_blank">网站首页</a> <a href="news.html" target="_blank">新闻中心</a> <a href="p.html" target="_blank">产品中心</a> <a href="a.html" target="_blank">关于我们</a> <a href="c.html" target="_blank">联系我们</a> <a href="b.html" target="_blank">网上留言</a>
      </ul>
      <script src="js/silder.js"></script>
    </nav>
  </header>
  </div>
</template>

<script>
export default {
  name: 'header',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
header { }
.topbg { background: #f3f3f3; height: 30px; line-height: 30px; width: 100%; }
.topbgline { height: 1px; width: 100%; margin-top: 1px; background: #e3e2e2 }
.topnav { width: 1000px; margin: auto; text-align: right; }
.topnav a { margin-left: 20px }
.topnav a:hover { color: #000 }
.logo { width: 1000px; margin: 30px auto; overflow: hidden; clear: both }
#topnav { width: 100%; background: #31A9B3; height: 50px; line-height: 46px; }
#topnav ul { width: 1000px; margin: auto }
#topnav a { display: inline-block; font-size: 18px; font-family: "Microsoft Yahei", Arial, Helvetica, sans-serif; padding: 0 20px; }
#topnav a:hover { background: #fff; color: #000; border-top: 4px solid #f77825; }
#topnav a { color: #FFF }
#topnav_current { background: #fff; border-top: 4px solid #f77825; color: #000 }/* 高亮选中颜色 */
a#topnav_current { color: #000 }
article { width: 1000px; margin: 20px auto; }
</style>
