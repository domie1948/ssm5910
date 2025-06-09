import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discussyinletuijian from '@/views/modules/discussyinletuijian/list'
    import fufeiyinle from '@/views/modules/fufeiyinle/list'
    import yinletuijian from '@/views/modules/yinletuijian/list'
    import huiyuangoumai from '@/views/modules/huiyuangoumai/list'
    import putonggoumai from '@/views/modules/putonggoumai/list'
    import huiyuanfahuo from '@/views/modules/huiyuanfahuo/list'
    import storeup from '@/views/modules/storeup/list'
    import forum from '@/views/modules/forum/list'
    import putongfahuo from '@/views/modules/putongfahuo/list'
    import huiyuanleibie from '@/views/modules/huiyuanleibie/list'
    import yonghu from '@/views/modules/yonghu/list'
    import huiyuanxinxi from '@/views/modules/huiyuanxinxi/list'
    import yinlefenlei from '@/views/modules/yinlefenlei/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/discussyinletuijian',
        name: '音乐推荐评论',
        component: discussyinletuijian
      }
          ,{
	path: '/fufeiyinle',
        name: '付费音乐',
        component: fufeiyinle
      }
          ,{
	path: '/yinletuijian',
        name: '音乐推荐',
        component: yinletuijian
      }
          ,{
	path: '/huiyuangoumai',
        name: '会员购买',
        component: huiyuangoumai
      }
          ,{
	path: '/putonggoumai',
        name: '普通购买',
        component: putonggoumai
      }
          ,{
	path: '/huiyuanfahuo',
        name: '会员发货',
        component: huiyuanfahuo
      }
          ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
          ,{
	path: '/forum',
        name: '论坛管理',
        component: forum
      }
          ,{
	path: '/putongfahuo',
        name: '普通发货',
        component: putongfahuo
      }
          ,{
	path: '/huiyuanleibie',
        name: '会员类别',
        component: huiyuanleibie
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/huiyuanxinxi',
        name: '会员信息',
        component: huiyuanxinxi
      }
          ,{
	path: '/yinlefenlei',
        name: '音乐分类',
        component: yinlefenlei
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
