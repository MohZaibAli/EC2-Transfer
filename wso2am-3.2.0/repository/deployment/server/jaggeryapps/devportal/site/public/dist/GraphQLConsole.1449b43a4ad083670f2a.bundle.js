(window.webpackJsonp=window.webpackJsonp||[]).push([[15],{1903:function(e,t,a){var n={"./Range.js":1047,"./file.js":1143,"./getASTNodeAtPosition.js":1142,"./index.js":1088,"./validateWithCustomRules.js":1194};function s(e){var t=i(e);return a(t)}function i(e){var t=n[e];if(!(t+1)){var a=new Error("Cannot find module '"+e+"'");throw a.code="MODULE_NOT_FOUND",a}return t}s.keys=function(){return Object.keys(n)},s.resolve=i,e.exports=s,s.id=1903},1904:function(e,t){function a(e){var t=new Error("Cannot find module '"+e+"'");throw t.code="MODULE_NOT_FOUND",t}a.keys=function(){return[]},a.resolve=a,e.exports=a,a.id=1904},1905:function(e,t,a){var n={"./Range.js":[1047],"./file.js":[1143],"./getASTNodeAtPosition.js":[1142],"./index.js":[1088],"./validateWithCustomRules.js":[1194]};function s(e){var t=n[e];return t?Promise.all(t.slice(1).map(a.e)).then((function(){var e=t[0];return a(e)})):Promise.resolve().then((function(){var t=new Error("Cannot find module '"+e+"'");throw t.code="MODULE_NOT_FOUND",t}))}s.keys=function(){return Object.keys(n)},s.id=1905,e.exports=s},1906:function(e,t){function a(e){return Promise.resolve().then((function(){var t=new Error("Cannot find module '"+e+"'");throw t.code="MODULE_NOT_FOUND",t}))}a.keys=function(){return[]},a.resolve=a,e.exports=a,a.id=1906},2043:function(e,t,a){"use strict";a.r(t);var n=a(1),s=a.n(n),i=a(1322),o=a(45),r=a.n(o),l=a(1388),c=a(1300),u=a(258),p=a(1358),m=a(18),d=a(1364),f=a(1838),y=a.n(f),g=a(1941),h=a.n(g),E=(a(1942),a(1215)),O=a(1313),b=a(1944),S=a.n(b),j=a(1399),x=a(950),v=a(259),T=a(1497),C=a(1408),R=a(1407),w=a(1386),P=a.n(w),k=a(1946),N=a.n(k),A=a(1330),L=a(1371),U=a(132);const I=Object(p.a)(e=>({root:{width:"100%"},title:{fontSize:e.typography.pxToRem(15),fontWeight:"bold",flexBasis:"50%",flexShrink:0,marginTop:e.spacing(2),marginBottom:e.spacing(2),marginLeft:e.spacing(4),marginRight:e.spacing(1)},heading:{fontSize:e.typography.pxToRem(15),fontWeight:e.typography.fontWeightRegular,flexBasis:"50%",flexShrink:0,marginTop:e.spacing(1),marginBottom:e.spacing(1)},column:{fontSize:e.typography.pxToRem(15),fontWeight:e.typography.fontWeightRegular,flexBasis:"33.33%",marginLeft:e.spacing(1)}}));function B(e){const t=I(),{api:a}=Object(n.useContext)(x.a),{open:i,setOpen:o}=e,[r,l]=Object(n.useState)([]),[p,m]=Object(n.useState)(null);Object(n.useEffect)(()=>{const e=a.id;(new v.a).getGraphqlPoliciesComplexity(e).then(e=>{m(e.list);const t=[...new Set(e.list.map(e=>e.type))];l(t),0===e.list.length&&function(){const e=a.id;(new v.a).getGraphqlPoliciesComplexityTypes(e).then(e=>{const t=[];e.typeList.map(e=>(e.fieldList.map(a=>{const n={};return n.type=e.type,n.field=a,n.complexityValue=1,t.push(n),a}),t)),m(t);const a=[...new Set(t.map(e=>e.type))];l(a)})}()})},[]);return null===p?s.a.createElement(U.a,null):s.a.createElement(s.a.Fragment,null,s.a.createElement("div",null,s.a.createElement("div",{className:t.title,style:{display:"flex",position:"relative"}},s.a.createElement("div",null,s.a.createElement(u.a,{id:"Apis.Details.GraphQLConsole.QueryComplexityView.title",defaultMessage:"Custom Complexity Values"})),s.a.createElement(L.a,{size:"small",onClick:()=>{o(!i)}},s.a.createElement(P.a,null))),s.a.createElement(A.a,null),s.a.createElement("div",{className:t.root,style:{maxHeight:"740px",overflow:"scroll"}},s.a.createElement("div",null,r.map(e=>s.a.createElement(T.a,null,s.a.createElement(C.a,{expandIcon:s.a.createElement(N.a,null),"aria-controls":"panel1a-content",id:"panel1a-header"},s.a.createElement(c.a,{className:t.heading},e)),s.a.createElement(A.a,null),p.map(a=>a.type===e&&s.a.createElement(R.a,null,s.a.createElement("div",{className:t.column},a.field,":"),s.a.createElement("div",{className:t.column},a.complexityValue)))))))))}B.propTypes={open:r.a.isRequired,setOpen:r.a.func.isRequired};const{buildSchema:D}=a(952);function q(e){const{authorizationHeader:t,URLs:a,securitySchemeType:i,accessTokenProvider:o}=e,{api:r}=Object(n.useContext)(x.a),[l,c]=Object(n.useState)(null),[p,m]=Object(n.useState)(""),[d,f]=Object(n.useState)(!1),g=Object(n.useRef)(null),[b,T]=s.a.useState(!0);Object(n.useEffect)(()=>{const e=r.id;(new v.a).getGraphQLSchemaByAPIId(e).then(e=>{const t=D(e.data);c(t)})},[]);const C={},R=()=>{T(!b)},w=()=>{const e=!d;C.isExplorerOpen=e,f(e)};return null==={schema:l}?s.a.createElement(U.a,null):s.a.createElement(s.a.Fragment,null,s.a.createElement(E.a,{width:"30%",m:1},s.a.createElement(O.a,{label:s.a.createElement(u.a,{defaultMessage:"Gateway URLs",id:"Apis.Details.GraphQLConsole.GraphQLUI.URLs"}),value:a.https,name:"selectedURL",fullWidth:!0,margin:"normal",variant:"outlined",InputProps:a.https,disabled:!0})),s.a.createElement("div",null,s.a.createElement(E.a,{display:"flex"},s.a.createElement(E.a,{display:"flex"},s.a.createElement(j.a,{in:!b,timeout:"auto",unmountOnExit:!0},s.a.createElement(B,{open:b,setOpen:T}))),s.a.createElement(E.a,{display:"flex",width:1},s.a.createElement(E.a,{display:"flex"},s.a.createElement(S.a,{schema:l,query:p,onEdit:m,explorerIsOpen:d,onToggleExplorer:w})),s.a.createElement(E.a,{display:"flex",height:"800px",flexGrow:1},s.a.createElement(y.a,{ref:g,fetcher:function(e){let n;return n="apikey"===t?o():"BASIC"===i?"Basic "+o():"Bearer "+o(),h()(a.https,{method:"post",headers:{Accept:"application/json","Content-Type":"application/json",[t]:n},body:JSON.stringify(e)}).then(e=>e.json())},schema:l,query:p,onEditQuery:m},s.a.createElement(y.a.Toolbar,null,s.a.createElement(y.a.Button,{onClick:()=>g.current.handlePrettifyQuery(),label:"Prettify",title:"Prettify Query (Shift-Ctrl-P)"}),s.a.createElement(y.a.Button,{onClick:()=>g.current.handleToggleHistory(),label:"History",title:"Show History"}),s.a.createElement(y.a.Button,{onClick:()=>f(!d),label:"Explorer",title:"Toggle Explorer"}),s.a.createElement(y.a.Button,{onClick:R,label:"Complexity Analysis",title:"View Field`s Complexity Values"}))))))))}q.propTypes={classes:r.a.shape({paper:r.a.string.isRequired}).isRequired};var G=a(1501);a.d(t,"default",(function(){return z}));const Q=Object(p.a)(e=>({buttonIcon:{marginRight:10},paper:{margin:e.spacing(1),padding:e.spacing(1)},grid:{marginTop:e.spacing(4),marginBottom:e.spacing(4),paddingRight:e.spacing(2),justifyContent:"center"},userNotificationPaper:{padding:e.spacing(2)},titleSub:{marginLeft:e.spacing(2),paddingTop:e.spacing(2),paddingBottom:e.spacing(2)}}));function z(){const e=Q(),{api:t}=Object(n.useContext)(x.a),a=t.endpointURLs,[o,r]=Object(n.useState)(a[0].URLs),[p,f]=Object(n.useState)("OAUTH"),[y,g]=Object(n.useState)(!1),[h,E]=Object(n.useState)(""),[O,b]=Object(n.useState)(""),[S,j]=Object(n.useState)(),[T,C]=Object(n.useState)(),[R,w]=Object(n.useState)([]),[P,k]=Object(n.useState)(),[N,A]=Object(n.useState)(),[L,I]=Object(n.useState)("PRODUCTION"),[B,D]=Object(n.useState)(""),[z,H]=Object(n.useState)(""),[K,M]=Object(n.useState)([]),[_,F]=Object(n.useState)(),W=m.a.getUser();function V(){let e;K.get(L)&&({accessToken:e}=K.get(L).token),"PRODUCTION"===L?k(e):A(e)}if(Object(n.useEffect)(()=>{const e=t.id;(new v.a).getAPIById(e).then(e=>{const t=e.obj;if(t.endpointURLs){const e=t.endpointURLs.map(e=>e.environmentName);C(e)}if(t.labels){const e=t.labels.map(e=>e.name);F(e)}if(t.scopes){const e=t.scopes.map(e=>e.name);w(e)}}).catch(e=>{const{status:t}=e;404===t&&g(!0)})},[]),null==t)return s.a.createElement(U.a,null);if(y)return"API Not found !";let J=!1,Y=t.authorizationHeader?t.authorizationHeader:"Authorization";t&&t.securityScheme&&(J=t.securityScheme.includes("api_key"))&&"API-KEY"===p&&(Y="apikey");const X=t.lifeCycleStatus&&"prototyped"===t.lifeCycleStatus.toLowerCase();return s.a.createElement(s.a.Fragment,null,s.a.createElement(c.a,{variant:"h4",className:e.titleSub},s.a.createElement(u.a,{id:"Apis.Details.GraphQLConsole.GraphQLConsole.title",defaultMessage:"Try Out"})),s.a.createElement(i.a,{className:e.paper},s.a.createElement(l.a,{container:!0,className:e.grid},!X&&!W&&s.a.createElement(l.a,{item:!0,md:6},s.a.createElement(i.a,{className:e.userNotificationPaper},s.a.createElement(c.a,{variant:"h5",component:"h3"},s.a.createElement(d.a,null,"warning")," ",s.a.createElement(u.a,{id:"notice",defaultMessage:"Notice"})),s.a.createElement(c.a,{component:"p"},s.a.createElement(u.a,{id:"api.console.require.access.token",defaultMessage:"You need an access token to try the API. Please log in and subscribe to the API to generate an access token. If you already have an access token, please provide it below."}))))),s.a.createElement(G.a,{setSecurityScheme:f,securitySchemeType:p,setSelectedEnvironment:j,selectedEnvironment:S,productionAccessToken:P,setProductionAccessToken:k,sandboxAccessToken:N,setSandboxAccessToken:A,environments:T,scopes:R,labels:_,setUsername:E,setPassword:b,username:h,password:O,setSelectedKeyType:function(e,t){t?I(e,V):I(e)},selectedKeyType:L,setKeys:M,setURLs:r,setProductionApiKey:H,setSandboxApiKey:D,productionApiKey:z,sandboxApiKey:B,environmentObject:a,api:t}),s.a.createElement(i.a,null)),s.a.createElement(i.a,{className:e.paper},s.a.createElement(q,{authorizationHeader:Y,URLs:o,securitySchemeType:p,accessTokenProvider:function(){if("BASIC"===p){return btoa(h+":"+O)}return"API-KEY"===p?"PRODUCTION"===L?z:B:"PRODUCTION"===L?P:N}})))}z.propTypes={classes:r.a.shape({paper:r.a.string.isRequired,titleSub:r.a.string.isRequired,root:r.a.string.isRequired}).isRequired}}}]);
//# sourceMappingURL=GraphQLConsole.1449b43a4ad083670f2a.bundle.js.map