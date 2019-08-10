<template>
  <div class="footer">
      <footer>
    <div class="endfoot">
      <div class="ft-info f_l">
        <div class="ftlogo"><a href="#" target="_blank"><img src="images/ftlogo.png"></a></div>
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

<script>
export default {
  name: 'footer',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
footer { background: #f6f6f6; border-top: 1px solid #eee; width: 100%; clear: both }
.endfoot { margin: 30px auto 0; width: 1000px; overflow: hidden; padding-bottom: 20px }
.ft-info { margin-top: 24px }
.ft-title { margin-top: 20px; overflow: hidden }
.ft-title p { font-size: 12px; color: #BBBBBB; display: block; height: 20px; line-height: 20px; }
.ftlogo { margin-bottom: 20px }
.ft-nav { display: block; height: 27px; line-height: 27px; margin-top: 5px; text-align: right; margin-right: 100px }
.ft-copyright { color: #CECECE; line-height: 21px; margin-right: 100px }
.ft-list { background: url(../images/ft-wx-s.png) no-repeat right; height: 100px }
.ft-shares { height: 34px; display: block; margin-top: 10px; margin-right: 100px }
.ft-shares a { height: 34px; width: 31px; float: right; margin-left: 20px; background: url(../images/ft-shares.png) no-repeat 0 -999px; }
.ft-shares .shares-ucloud { width: 80px; margin: 0 5px 0 22px; background-position: 0 -137px; }
.ft-shares .shares-ucloud:hover { background-position: -100px -137px }
.ft-shares .shares-sina { background-position: 0 -102px; }
.ft-shares .shares-sina:hover { background-position: -50px -102px }
.ft-shares .shares-ten { background-position: 0 -68px; }
.ft-shares .shares-ten:hover { background-position: -50px -68px }
.ft-shares .shares-weixin { background-position: 0 -34px; }
.ft-shares .shares-weixin:hover { background-position: -50px -34px }
.ft-shares .shares-dib { background-position: 0 0; }
.ft-shares .shares-dib:hover { background-position: -50px 0 }
.ft-shares .shares-dib { background-position: 0 0 }
.ft-shares .shares-dib:hover { background-position: -50px 0 }
</style>
