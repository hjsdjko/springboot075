"use strict";(self["webpackChunkvue3_nb0"]=self["webpackChunkvue3_nb0"]||[]).push([[883],{38883:(e,l,o)=>{o.r(l),o.d(l,{default:()=>k});o(10307),o(39524),o(63134);var a=o(67377),n=o(91370),u=o(98479),t=o(51290),i=function(e){return(0,a.dD)("data-v-0fcb30fa"),e=e(),(0,a.Cn)(),e},r={class:"login_view"},s=i((function(){return(0,a._)("div",{class:"title_view"},"大学生志愿者信息管理系统登录",-1)})),v={key:0,class:"list_item"},d=i((function(){return(0,a._)("div",{class:"list_label"}," 账号： ",-1)})),c={key:1,class:"list_item"},m=i((function(){return(0,a._)("div",{class:"list_label"}," 密码： ",-1)})),f=["onKeydown"],p={key:2,class:"list_type"},g={key:3,class:"remember_view"},w={class:"btn_view"};const _={__name:"login",setup:function(e){var l,o=(0,t.iH)([]),i=(0,t.iH)([]),_=(0,t.iH)({role:"",username:"",password:""}),b=(0,t.iH)(""),h=(0,t.iH)(1),k=(0,t.iH)(!0),U=null===(l=(0,a.FN)())||void 0===l?void 0:l.appContext.config.globalProperties,y=function(){if(_.value.username)if(_.value.password){if(o.value.length>1){if(!_.value.role)return null===U||void 0===U||U.$toolUtil.message("请选择角色","error"),void verifySlider.value.reset();for(var e=0;e<i.value.length;e++)i.value[e].roleName==_.value.role&&(b.value=i.value[e].tableName)}else b.value=o.value[0].tableName,_.value.role=o.value[0].roleName;S()}else null===U||void 0===U||U.$toolUtil.message("请输入密码","error");else null===U||void 0===U||U.$toolUtil.message("请输入用户名","error")},S=function(){null===U||void 0===U||U.$http({url:"".concat(b.value,"/login?username=").concat(_.value.username,"&password=").concat(_.value.password),method:"post"}).then((function(e){if(k.value){var l=JSON.parse(JSON.stringify(_.value));delete l.code,null===U||void 0===U||U.$toolUtil.storageSet("loginForm",JSON.stringify(l))}else null===U||void 0===U||U.$toolUtil.storageRemove("loginForm");null===U||void 0===U||U.$toolUtil.storageSet("Token",e.data.token),null===U||void 0===U||U.$toolUtil.storageSet("role",_.value.role),null===U||void 0===U||U.$toolUtil.storageSet("sessionTable",b.value),null===U||void 0===U||U.$toolUtil.storageSet("adminName",_.value.username),null===U||void 0===U||U.$router.push("/")}),(function(e){}))},N=function(){var e={page:1,limit:1,sort:"id"};null===U||void 0===U||U.$http({url:"menu/list",method:"get",params:e}).then((function(e){i.value=JSON.parse(e.data.data.list[0].menujson);for(var l=0;l<i.value.length;l++)"是"==i.value[l].hasBackLogin&&o.value.push(i.value[l]);var a=null===U||void 0===U?void 0:U.$toolUtil.storageGet("loginForm");a||(_.value.role=o.value[0].roleName),null===U||void 0===U||U.$toolUtil.storageSet("menus",JSON.stringify(i.value))}))},$=function(){N();var e=null===U||void 0===U?void 0:U.$toolUtil.storageGet("loginForm");e&&(_.value=JSON.parse(e))};return(0,a.bv)((function(){$()})),function(e,l){var t=(0,a.up)("el-radio"),i=(0,a.up)("el-checkbox"),b=(0,a.up)("el-button"),U=(0,a.up)("el-form"),S=(0,a.up)("Vcode");return(0,a.wg)(),(0,a.iD)("div",null,[(0,a._)("div",r,[(0,a.Wm)(U,{model:_.value,class:"login_form"},{default:(0,a.w5)((function(){return[s,1==h.value?((0,a.wg)(),(0,a.iD)("div",v,[d,(0,a.wy)((0,a._)("input",{class:"list_inp","onUpdate:modelValue":l[0]||(l[0]=function(e){return _.value.username=e}),placeholder:"请输入账号"},null,512),[[n.nr,_.value.username]])])):(0,a.kq)("",!0),1==h.value?((0,a.wg)(),(0,a.iD)("div",c,[m,(0,a.wy)((0,a._)("input",{class:"list_inp","onUpdate:modelValue":l[1]||(l[1]=function(e){return _.value.password=e}),type:"password",placeholder:"请输入密码",onKeydown:(0,n.D2)(y,["enter","native"])},null,40,f),[[n.nr,_.value.password]])])):(0,a.kq)("",!0),o.value.length>1?((0,a.wg)(),(0,a.iD)("div",p,[((0,a.wg)(!0),(0,a.iD)(a.HY,null,(0,a.Ko)(o.value,(function(e,o){return(0,a.wg)(),(0,a.j4)(t,{key:o,modelValue:_.value.role,"onUpdate:modelValue":l[2]||(l[2]=function(e){return _.value.role=e}),label:e.roleName},{default:(0,a.w5)((function(){return[(0,a.Uk)((0,u.zw)(e.roleName),1)]})),_:2},1032,["modelValue","label"])})),128))])):(0,a.kq)("",!0),1==h.value?((0,a.wg)(),(0,a.iD)("div",g,[(0,a.Wm)(i,{modelValue:k.value,"onUpdate:modelValue":l[3]||(l[3]=function(e){return k.value=e}),label:"记住密码",size:"large","true-label":!0,"false-label":!1},null,8,["modelValue"])])):(0,a.kq)("",!0),(0,a._)("div",w,[1==h.value?((0,a.wg)(),(0,a.j4)(b,{key:0,class:"login",type:"success",onClick:y},{default:(0,a.w5)((function(){return[(0,a.Uk)("登录")]})),_:1})):(0,a.kq)("",!0)])]})),_:1},8,["model"])]),(0,a.Wm)(S,{show:e.isShow,onSuccess:e.success,onClose:e.close,onFail:e.fail},null,8,["show","onSuccess","onClose","onFail"])])}}};var b=o(57326);const h=(0,b.Z)(_,[["__scopeId","data-v-0fcb30fa"]]),k=h}}]);
//# sourceMappingURL=883.234ad42a.js.map