<template>
    <div>
    <header>
    <div class="topbg">
      <ul class="topnav">
        <a href="/ " target="_blank">Home</a><a href="/ " target="_blank">官方微博</a><a href="/ " target="_blank">关于我们</a>
      </ul>
    </div>
    <div class="topbgline"></div>
    <div class="logo">
      <div class="logo_l f_l"><a href="/"><img src="@/assets/images/logo.png"></a></div>
      <div class="logo_r f_r"><a href="/"><img src="@/assets/images/search.png"></a></div>
    </div>
    <nav id="topnav">
      <ul>
        <a href="/" >网站首页</a>
        <a href="/article/1" >新闻中心</a>
        <a href="/category" >产品中心</a>
        <a href="/about" >关于我们</a>
        <a href="/about" >联系我们</a>
        <a href="/about" >网上留言</a>
      </ul>
    </nav>
  </header>
  <router-view/>
  <footer>
  <div class="endfoot">
    <div class="ft-info f_l">
      <div class="ftlogo"><a href="#" target="_blank"><img src="@/assets/images/ftlogo.png"></a></div>
      <div class="ft-title">
        <p>时尚设计，国内最优化的模板设计平台! </p>
      </div>
    </div>
    <div class="ft-list f_r">
      <div class="ft-nav"> <a href="#" target="_blank">关于我们</a> <a href="#" target="_blank">联系我们</a> <a href="#" target="_blank">版权声明</a> <a href="#" id="qaurl">问题反馈</a> <a href="#" target="_blank">商务合作</a> </div>
      <p class="ft-copyright"> Copyright 2014 Comsenz Inc. Powered by Discuz! X3.2. 粤ICP2014008000-3号</p>
    </div>
  </div>
  <div id="tbox"> <a id="togbook" href="/"></a> <a id="gotop" href="javascript:void(0)"></a> </div>
</footer>
</div>
</template>

<style lang="scss">
@import "./assets/css/base.css";
@import "./assets/css/view.css";
@import "./assets/css/media.css";
</style>
