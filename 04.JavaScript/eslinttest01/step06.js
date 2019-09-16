// (function myFun1(){
//     alert(1);
// }());

(function() {
  alert(1);
}());
// ? parameter 하나가 있는 즉시 실행 함수 개발 및 호출 - "주변도 살피기 "
// var data = "주변도 살피기";
// (function (v){
//     alert(v);
// }(data));

const data = '주변도 살피기';// 글로벌 변수
(function(v) {
  alert(v);
}(data));
