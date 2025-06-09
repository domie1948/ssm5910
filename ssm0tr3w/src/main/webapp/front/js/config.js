
var projectName = '音乐播放器管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '我的收藏',
	url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '音乐推荐',
	url: './pages/yinletuijian/list.html'
}, 
{
	name: '付费音乐',
	url: './pages/fufeiyinle/list.html'
}, 

{
	name: '论坛信息',
	url: './pages/forum/list.html'
}, 
]

var adminurl =  "http://localhost:8080/ssm0tr3w/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"会员类别","menuJump":"列表","tableName":"huiyuanleibie"}],"menu":"会员类别管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"会员信息","menuJump":"列表","tableName":"huiyuanxinxi"}],"menu":"会员信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"音乐分类","menuJump":"列表","tableName":"yinlefenlei"}],"menu":"音乐分类管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"音乐推荐","menuJump":"列表","tableName":"yinletuijian"}],"menu":"音乐推荐管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"付费音乐","menuJump":"列表","tableName":"fufeiyinle"}],"menu":"付费音乐管理"},{"child":[{"buttons":["查看","修改","删除","发货"],"menu":"普通购买","menuJump":"列表","tableName":"putonggoumai"}],"menu":"普通购买管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"普通发货","menuJump":"列表","tableName":"putongfahuo"}],"menu":"普通发货管理"},{"child":[{"buttons":["查看","修改","删除","发货"],"menu":"会员购买","menuJump":"列表","tableName":"huiyuangoumai"}],"menu":"会员购买管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"会员发货","menuJump":"列表","tableName":"huiyuanfahuo"}],"menu":"会员发货管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"音乐推荐列表","menuJump":"列表","tableName":"yinletuijian"}],"menu":"音乐推荐模块"},{"child":[{"buttons":["查看","普通购买","会员购买"],"menu":"付费音乐列表","menuJump":"列表","tableName":"fufeiyinle"}],"menu":"付费音乐模块"}],"roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["新增","查看","支付"],"menu":"会员信息","menuJump":"列表","tableName":"huiyuanxinxi"}],"menu":"会员信息管理"},{"child":[{"buttons":["查看","支付","删除"],"menu":"普通购买","menuJump":"列表","tableName":"putonggoumai"}],"menu":"普通购买管理"},{"child":[{"buttons":["查看"],"menu":"普通发货","menuJump":"列表","tableName":"putongfahuo"}],"menu":"普通发货管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"buttons":["查看","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"音乐推荐列表","menuJump":"列表","tableName":"yinletuijian"}],"menu":"音乐推荐模块"},{"child":[{"buttons":["查看","普通购买","会员购买"],"menu":"付费音乐列表","menuJump":"列表","tableName":"fufeiyinle"}],"menu":"付费音乐模块"}],"roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看","删除","支付"],"menu":"会员购买","menuJump":"列表","tableName":"huiyuangoumai"}],"menu":"会员购买管理"},{"child":[{"buttons":["查看"],"menu":"会员发货","menuJump":"列表","tableName":"huiyuanfahuo"}],"menu":"会员发货管理"},{"child":[{"buttons":["查看","删除"],"menu":"论坛管理","tableName":"forum"}],"menu":"论坛管理"},{"child":[{"buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"音乐推荐列表","menuJump":"列表","tableName":"yinletuijian"}],"menu":"音乐推荐模块"},{"child":[{"buttons":["查看","普通购买","会员购买"],"menu":"付费音乐列表","menuJump":"列表","tableName":"fufeiyinle"}],"menu":"付费音乐模块"}],"roleName":"会员信息","tableName":"huiyuanxinxi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
