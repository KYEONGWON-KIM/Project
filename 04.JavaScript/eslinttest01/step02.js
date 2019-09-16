console.log('--- step01--- ');
// step01 - 객체 리터럴
const obj1 = {name : '변영인', age : 27};
console.log(obj1.name);

const obj2 = {};
obj2.name = '김혜경';
console.log(obj2.name);

// ? obj1과 obj2 type 출력하기
console.log(typeof(obj1));// object
console.log(typeof(obj2));// object

console.log(obj1);// {name: "변영인", age: 27}
// console.log(obj1.hasOwnProperty());// false
console.log(obj1.toString());// [object Object]
console.log(obj1.valueOf());

console.log('--- step02--- ');
// step02 - 생성자 함수

const obj3 = {};
obj3.id = 'tester';
console.log(obj3.id);

console.log('--- step03--- ');
// step03 - 사용자 정의 생성자 함수
// User라는 객체 생성 가능한 특이한 함수
function User(id) {
  this.id = id;

  this.setId = function(id) {// 메소드
    this.id = id;
  };
  this.getId = function(id) {// 메소드
    return this.id;
  };
}

// ? User 객체 생성하셔서 id에 tester값을 저장 및 획득해서 콘솔창에 출력
// 인스턴스 생성 및 속성(변수), 메소드 호출
const obj4 = new User('tester');
console.log(obj4.id);
console.log(obj4.getId());
obj4.setId('me');
console.log(obj4.getId());

obj4.address = '서초';
console.log(obj4.address);

// ?address 속성 관려해서 get/set 함수 구현 추가 가능 test하기?
obj4.setAddress = function(addr) {
  this.address = addr;
};
obj4.getAddress = function() {
  return this.address;
};
console.log(obj4.getAddress());
console.log(obj4['address']);// 서초

console.log('--- 반복문 ---');

// for in
for (const data in obj4) {
  if ({}.hasOwnProperty.call(obj4.data)) {
    console.log(data + ' : ' + obj4[data]);
  }
}

// property 삭제 : address 삭제
delete obj4.address;
console.log(obj4.address);
