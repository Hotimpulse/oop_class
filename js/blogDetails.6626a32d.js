"use strict";(self["webpackChunkinterno"]=self["webpackChunkinterno"]||[]).push([[800],{2653:function(t,e,s){s.r(e),s.d(e,{default:function(){return Z}});var a=function(){var t=this,e=t._self._c;return e("div",{class:t.$style.wrapper},[e("main",[e("div",{class:t.$style["details-hero"]},[e("img",{class:t.$style["details-hero-img"],attrs:{src:s(6554),alt:"blog banner image"}})]),e("div",{class:t.$style["details-special"]},[e("section",{attrs:{id:"details-posts"}},[e("div",{class:t.$style["details-breaker"]},[e("img",{class:t.$style["details-breaker-svg"],attrs:{src:s(1708),alt:"logo"}}),e("span",{class:t.$style["details-breaker-text"]},[t._v("The details are not the details. They make the design.")])])])])]),e("BlogComponent")],1)},l=[],i=function(){var t=this,e=t._self._c;return e("div",[e("TagSystem",{attrs:{tags:t.getUniqueTags(),selectedTag:t.selectedTag},on:{filter:t.filterByTag}}),t._l(t.displayedArticles,(function(t){return e("ArticleComponent",{key:t.title,attrs:{title:t.title,content:t.content,imgSrc:t.imgSrc}})}))],2)},r=[],o=function(){var t=this,e=t._self._c;return e("aside",{class:t.$style.details_tags},[e("h2",{class:t.$style.details_header},[t._v("Tags")]),e("div",{class:t.$style["btn-grid"]},t._l(t.tags,(function(s){return e("button",{key:s,class:{[t.$style.btn]:!0,[t.$style.active]:s===t.selectedTag},on:{click:function(e){return t.filterByTag(s)}}},[t._v(" "+t._s(s)+" ")])})),0)])},n=[],d={name:"TagSystem",props:["tags","selectedTag"],methods:{filterByTag(t){this.$emit("filter",t)}}},c=d,p={details_tags:"TagSystem_details_tags_qg7Br",btn:"TagSystem_btn_Dt0s2",active:"TagSystem_active_qgcH3","btn-grid":"TagSystem_btn-grid_r_IB9"},g=s(1001);function _(t){this["$style"]=p.locals||p}var m=(0,g.Z)(c,o,n,!1,_,null,null),u=m.exports,h=function(){var t=this,e=t._self._c;return e("div",{class:t.$style["details-latest-post"]},[e("h1",{class:t.$style["details-latest-post_headline"]},[t._v(t._s(t.title))]),e("p",{class:t.$style["details-latest-post_text"]},[t._v(t._s(t.content))]),e("img",{class:t.$style["details-latest-post_wrapper-img"],attrs:{src:t.imgSrc,alt:"image for "+t.title}})])},b=[],f={name:"ArticleComponent",props:["title","content","imgSrc","tags"]},y=f,v={"details-latest-post_wrapper-img":"ArticleComponent_details-latest-post_wrapper-img_hopXu","details-latest-post_headline":"ArticleComponent_details-latest-post_headline_Bp7Qz","details-latest-post_wrapper-breadcrumbs":"ArticleComponent_details-latest-post_wrapper-breadcrumbs_liMqX","details-latest-post_date":"ArticleComponent_details-latest-post_date_YwTZ6","details-latest-post_breadcrumbs":"ArticleComponent_details-latest-post_breadcrumbs_fma1c","details-latest-post_text":"ArticleComponent_details-latest-post_text_Hmrob","details-latest-post_text-wrapper":"ArticleComponent_details-latest-post_text-wrapper_sOdwl"};function x(t){this["$style"]=v.locals||v}var B=(0,g.Z)(y,h,b,!1,x,null,null),k=B.exports,w={components:{TagSystem:u,ArticleComponent:k},data(){return{articles:[{title:"Design sprints are great for Architecture",content:"Lorem ipsum dolor sit amet, adipiscing Aliquam eu sem vitae turpmaximus...",imgSrc:s(4655),tags:["architecture","all"]},{title:"Let’s Get Solutions for Building Bedrooms",content:"Lorem ipsum dolor sit amet, adipiscing Aliquam eu sem vitae turpmaximus.posuere in.",imgSrc:s(3928),tags:["building","bedroom","all"]},{title:"Are you into Kitchen Planning?",content:"Contrary to popular belief.There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injecthumour, or randomised words which don't look even slightly believable. Embarrassing hidden in the middle of text.",imgSrc:s(6491),tags:["kitchen","kitchen planning","all"]},{title:"Enjoy stellar architecture? Look no further!",content:"All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary.",imgSrc:s(9601),tags:["architecture","all"]},{title:"Building a 4-bedroom house? Manage your expenses!",content:"Lorem ipsum dolor sit amet consectetur, adipisicing elit. Officiis, excepturi!",imgSrc:s(4594),tags:["building","bedroom","all"]}],displayedArticles:[],selectedTag:""}},methods:{getUniqueTags(){const t=new Set;return this.articles.forEach((e=>{Array.isArray(e.tags)?e.tags.forEach((e=>t.add(e))):t.add(e.tags)})),Array.from(t)},filterByTag(t){console.log("Received tag:",t),this.selectedTag=t,this.displayedArticles="All"===t?this.articles:this.articles.filter((e=>Array.isArray(e.tags)?e.tags.includes(t):e.tags===t))}}},A=w,T=(0,g.Z)(A,i,r,!1,null,null,null),D=T.exports,$={name:"IndexPage",components:{BlogComponent:D}},S=$,C={wrapper:"BlogDetails_wrapper_sSY7x","details-hero":"BlogDetails_details-hero_rorkm","details-hero-img":"BlogDetails_details-hero-img_vU5CV","details-special":"BlogDetails_details-special_VfD95","details-latest-post_wrapper-img":"BlogDetails_details-latest-post_wrapper-img_wAiGg","details-latest-post_headline":"BlogDetails_details-latest-post_headline_Dcvdv","details-latest-post_wrapper-breadcrumbs":"BlogDetails_details-latest-post_wrapper-breadcrumbs_mKjb2","details-latest-post_date":"BlogDetails_details-latest-post_date_R0ohU","details-latest-post_breadcrumbs":"BlogDetails_details-latest-post_breadcrumbs_KFsMZ","details-latest-post_text":"BlogDetails_details-latest-post_text_e2ile","details-latest-post_text-wrapper":"BlogDetails_details-latest-post_text-wrapper_R_13e",details_tags:"BlogDetails_details_tags_YHGk4",details_tags_btn:"BlogDetails_details_tags_btn_tEWwz",active:"BlogDetails_active_jHKoL","btn-grid":"BlogDetails_btn-grid_YKJhQ","details-breaker":"BlogDetails_details-breaker_ThrZg","details-breaker-text":"BlogDetails_details-breaker-text_PJG6H"};function q(t){this["$style"]=C.locals||C}var L=(0,g.Z)(S,a,l,!1,q,null,null),Z=L.exports},1708:function(t,e,s){t.exports=s.p+"img/double-quotes.b49f3155.svg"},6554:function(t,e,s){t.exports=s.p+"img/details_banner.360b1063.jpg"},6491:function(t,e,s){t.exports=s.p+"img/kitchen_dets1.e8055ff5.png"},4594:function(t,e,s){t.exports=s.p+"img/kitchen_dets2.776c2c60.png"},3928:function(t,e,s){t.exports=s.p+"img/kitchen_dets3.b8f1f4c0.png"},4655:function(t,e,s){t.exports=s.p+"img/kitchen_dets4.00d33604.png"},9601:function(t,e,s){t.exports=s.p+"img/kitchen_dets5.a1989ba5.png"}}]);
//# sourceMappingURL=blogDetails.6626a32d.js.map