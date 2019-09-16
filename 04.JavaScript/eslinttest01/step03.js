const v1 = '전역변수';
const v2 = '전역변수2';
function myFun1() {
  const v3 = '전역변수3';
  const v4 = '로컬변수';
  console.log(v3 + v4);
  return v3;
}

console.log(v1, v2);
const v3 = myFun1();
console.log(v3);
// console.log(v4); 오류

function myFun2() {
  const v32 = '전역변수3';
  const v42 = '로컬변수';
  console.log(v32);
  console.log(v42);
// console.log(v52);
}

myFun2();
