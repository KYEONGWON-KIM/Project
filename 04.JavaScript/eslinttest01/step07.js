// 기본 지원금
const initFund = 1000;

// 청년 데이터 array
const people = [
  {age: 27, grade: 2, fund: 0},
  {age: 22, grade: 1, fund: 0},
  {age: 40, grade: 2, fund: 0},
  {age: 17, grade: 1, fund: 0},
  {age: 33, grade: 3, fund: 0},
  {age: 35, grade: 1, fund: 0},
  {age: 24, grade: 3, fund: 0},
  {age: 24, grade: 1, fund: 0},
  {age: 31, grade: 2, fund: 0},
];

// 모든 데이터 프린트
people.forEach(printList);

// 필요한 총 예산 계산하기
/*
    people arrajy에서 filter 메소드를사용 하여 나이를 기준으로 필터링한 새로운 array B 생성
    array B에서 map 메소드를 사용하여 소득 분위를 기준으로 지원금을 산정하여 최종 지원금만 추출한 array C 생성
    array C에서 reduce 메소드를 사용하여 지원금의 합인 총 예산을 산출하여 div.totalFund에 출력
    */
document.getElementById('totalFund').innerHTML
    = '필요한 총 예산: ' + people.filter(doFilter).map(doMap).reduce(doReduce) + '원';

// eslint(max-len)
function printList(item, index) {
  document.getElementById('list').innerHTML = document.getElementById('list').innerHTML
  + (index + 1) + '. 나이: ' + item.age + '살, 소득분위: ' + item.grade + '분위 <br>';
}

function doFilter(value) {
  if ( (value.age >= 18) && (value.age < 38) ) {
    return value;
  }
}

function doMap(value) {
  if (value.grade == 1) {
    value.fund = initFund * 0.8;
  } else if (value.grade == 3) {
    value.fund = initFund * 1.2;
  } else { // grade == 2
    value.fund = initFund;
  }
  return value.fund;
}

function doReduce(total, value) {
  return total + value;
}

console.log('객체', people[0].age);
console.log('filter', people.filter(doFilter));
console.log('map', people.filter(doFilter).map(doMap));
console.log('reduce', people.filter(doFilter).map(doMap).reduce(doReduce));
