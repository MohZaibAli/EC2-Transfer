(window.webpackJsonp=window.webpackJsonp||[]).push([[25],{2047:function(e,a,t){"use strict";t.r(a);var r=t(1),n=t.n(r),s=t(258),o=t(18),d=t(12),i=t.n(d),l=t(1231),c=t.n(l),m=t(1215),p=t(1388),w=t(1371),u=t(1358),g=t(1313),f=t(1300),h=t(1322),P=t(45),E=t.n(P);const y=Object(u.a)(e=>({createTitle:{color:e.palette.getContrastText(e.palette.background.default)},formContent:{"& span, & div, & p, & input":{color:e.palette.getContrastText(e.palette.background.paper)}}}));function C(e){const{title:a,children:t}=e,r=y();return n.a.createElement(m.a,{width:1,mt:5},n.a.createElement(p.a,{justify:"center",container:!0,spacing:3},n.a.createElement(p.a,{item:!0,sm:6,md:4},n.a.createElement(p.a,{container:!0,spacing:4},n.a.createElement(p.a,{item:!0,md:12,className:r.createTitle},a),n.a.createElement(p.a,{item:!0,md:12,className:r.formContent},n.a.createElement(h.a,{elevation:0},t))))))}C.propTypes={title:E.a.element.isRequired,children:E.a.element.isRequired};var b=C,v=t(1219),x=t(259),M=t(941),O=t(132),j=t(133);function S(e,a){var t=Object.keys(e);if(Object.getOwnPropertySymbols){var r=Object.getOwnPropertySymbols(e);a&&(r=r.filter((function(a){return Object.getOwnPropertyDescriptor(e,a).enumerable}))),t.push.apply(t,r)}return t}function k(e,a,t){return a in e?Object.defineProperty(e,a,{value:t,enumerable:!0,configurable:!0,writable:!0}):e[a]=t,e}const T=Object(u.a)(e=>({mandatoryStarText:{"& label>span:nth-child(1)":{color:"red"}},passwordChangeForm:{"& span, & div, & p, & input":{color:e.palette.getContrastText(e.palette.background.paper)}}}));function F(e,a){let{field:t,value:r}=a;return function(e){for(var a=1;a<arguments.length;a++){var t=null!=arguments[a]?arguments[a]:{};a%2?S(Object(t),!0).forEach((function(a){k(e,a,t[a])})):Object.getOwnPropertyDescriptors?Object.defineProperties(e,Object.getOwnPropertyDescriptors(t)):S(Object(t)).forEach((function(a){Object.defineProperty(e,a,Object.getOwnPropertyDescriptor(t,a))}))}return e}({},e,{[t]:r})}a.default=()=>{const{settings:{IsPasswordChangeEnabled:e,userStorePasswordPattern:a,passwordPolicyPattern:t,passwordPolicyMinLength:d,passwordPolicyMaxLength:l}}=Object(j.d)(),u=T(),h=o.a.getUser().name,P={currentPassword:void 0,newPassword:void 0,repeatedNewPassword:void 0},[E,y]=Object(r.useReducer)(F,P),{currentPassword:C,newPassword:S,repeatedNewPassword:k}=E,N=i.a.passwordChange.guidelinesEnabled;let q=[];N&&(q=i.a.passwordChange.policyList);const R=()=>""===C,D=()=>{let e=c.a.string().empty();d&&-1!==d&&(e=e.min(d)),l&&-1!==l&&(e=e.max(l));const r=e.validate(S).error;if(r){const e=r.details[0].type;if("string.empty"===e)return n.a.createElement(s.a,{id:"Change.Password.password.empty",defaultMessage:"Password is empty"});if("string.min"===e)return n.a.createElement(s.a,{id:"Change.Password.password.length.short",defaultMessage:"Password is too short!"});if("string.max"===e)return n.a.createElement(s.a,{id:"Change.Password.password.length.long",defaultMessage:"Password is too long!"})}if(a){const e=c.a.string().pattern(new RegExp(a)).validate(S).error;if(e){if("string.pattern.base"===e.details[0].type)return n.a.createElement(s.a,{id:"Change.Password.password.pattern.invalid",defaultMessage:"Invalid password pattern"})}}if(t){const e=c.a.string().pattern(new RegExp(t)).validate(S).error;if(e){if("string.pattern.base"===e.details[0].type)return n.a.createElement(s.a,{id:"Change.Password.password.pattern.invalid",defaultMessage:"Invalid password pattern"})}}return!1},I=()=>{if(k&&S!==k)return n.a.createElement(s.a,{id:"Change.Password.password.mismatch",defaultMessage:"Password doesn't match"})},B=e=>{let{target:{name:a,value:t}}=e;y({field:a,value:t})},L=()=>{return(new x.a).changePassword(C,S).then(e=>{M.a.success(n.a.createElement(s.a,{id:"Change.Password.password.changed.success",defaultMessage:"Password changed successfully"})),window.history.back()}).catch(e=>{switch(e.response.body.code){case 901450:M.a.error(n.a.createElement(s.a,{id:"Change.Password.password.change.disabled",defaultMessage:"Password change disabled"}));break;case 901451:M.a.error(n.a.createElement(s.a,{id:"Change.Password.current.password.incorrect",defaultMessage:"Current password is incorrect"}));break;case 901452:M.a.error(n.a.createElement(s.a,{id:"Change.Password.password.pattern.invalid",defaultMessage:"Invalid password pattern"}))}})},W=n.a.createElement(n.a.Fragment,null,n.a.createElement(f.a,{variant:"h5"},n.a.createElement(s.a,{id:"Change.Password.title",defaultMessage:"Change Password"}),": "+h),n.a.createElement(f.a,{variant:"caption"},n.a.createElement(s.a,{id:"Change.Password.description",defaultMessage:"Change your own password. Required fields are marked with an asterisk ( * )"})),N&&q.length>0?n.a.createElement(f.a,{variant:"body2"},n.a.createElement(s.a,{id:"Change.Password.password.policy",defaultMessage:"Password policy:"}),n.a.createElement("ul",{style:{marginTop:"-4px",marginBottom:"-8px"}},q.map(e=>n.a.createElement("li",null,e)))):null);return void 0===e?n.a.createElement(O.a,null):e?n.a.createElement(b,{title:W},n.a.createElement(m.a,{py:2,display:"flex",justifyContent:"center"},n.a.createElement(p.a,{item:!0,xs:10,md:9},n.a.createElement(m.a,{component:"div",m:2},n.a.createElement(p.a,{container:!0,mt:2,spacing:2,direction:"column",justify:"center",alignItems:"flex-start"},n.a.createElement(g.a,{classes:{root:u.mandatoryStarText},required:!0,autoFocus:!0,margin:"dense",name:"currentPassword",value:C,onChange:B,label:n.a.createElement(s.a,{id:"Settings.ChangePasswordForm.current.password",defaultMessage:"Current Password"}),fullWidth:!0,error:R(),helperText:n.a.createElement(s.a,{id:"Settings.ChangePasswordForm.enter.current.password",defaultMessage:"Enter Current Password"}),variant:"outlined",type:"password"}),n.a.createElement(g.a,{classes:{root:u.mandatoryStarText},margin:"dense",name:"newPassword",value:S,onChange:B,label:n.a.createElement(s.a,{id:"Settings.ChangePasswordForm.new.password",defaultMessage:"New Password"}),required:!0,fullWidth:!0,error:D(),helperText:D()||n.a.createElement(s.a,{id:"Settings.ChangePasswordForm.enter.new.password",defaultMessage:"Enter a New Password"}),variant:"outlined",type:"password"}),n.a.createElement(g.a,{classes:{root:u.mandatoryStarText},margin:"dense",name:"repeatedNewPassword",value:k,onChange:B,label:n.a.createElement(s.a,{id:"Settings.ChangePasswordForm.confirm.new.password",defaultMessage:"Confirm new Password"}),required:!0,fullWidth:!0,error:I(),helperText:I()||n.a.createElement(s.a,{id:"Settings.ChangePasswordForm.confirmationOf.new.password",defaultMessage:"Confirmation of new Password"}),variant:"outlined",type:"password"}),n.a.createElement(m.a,{my:2,display:"flex",flexDirection:"row"},n.a.createElement(m.a,{mr:1},n.a.createElement(w.a,{color:"primary",variant:"contained",onClick:L},n.a.createElement(s.a,{id:"Settings.ChangePasswordForm.Save.Button.text",defaultMessage:"Save"}))),n.a.createElement(m.a,{mx:1},n.a.createElement(w.a,{onClick:()=>window.history.back()},n.a.createElement(s.a,{id:"Settings.ChangePasswordForm.Cancel.Button.text",defaultMessage:"Cancel"}))))))))):n.a.createElement(v.a,null)}}}]);
//# sourceMappingURL=25.5ddcffe64ba268cc0a23.bundle.js.map