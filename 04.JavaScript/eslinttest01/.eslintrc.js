module.exports = {
    "env": {
        "browser": true,
        "es6": true
    },
    "extends": ["eslint:recommended", "google"
    ],
    "globals": {
        "Atomics": "readonly",
        "SharedArrayBuffer": "readonly"
    },
    "parserOptions": {
        "ecmaVersion": 2018,
        "sourceType": "module"
    },
  
    "rules": {
        "curly" : [2, "multi-line"], // else 및 else if와의 구분을 명확하게 하고자 함
        "linebreak-style" : 0, // 윈도우 기본 설정값과 충돌 (CRLF <-> LF)
        "require-jsdoc": 0, // 작성법이 복잡함
        "arrow-parens" : ["error", "as-needed"], // 간단한 arrow function 기능 활용
        "no-multi-spaces": 1, // 2개 이상 시 지저분해 보임
        "prefer-const": [1, {destructuring: "all"}], // let을 쓰더라도 일단 구동 가능하게 warn으로 교체
        "no-unused-vars": [1, {args: "none"}], // 일단 미사용 변수를 쓰더라도 저장은 되게 warn으로 교체
        "max-len": [2, {
            code: 100,
            tabWidth: 2,
            ignoreUrls: true,
            ignorePattern: "goog\.(module|require)",
          }], // 기존의 길이 제한(80)이 충분하지 않음
        "space-infix-ops": "error", // 산술 연산자 간 여백 필요
        "no-undef" : 1, // 외부 import된 소스 사용시 문제
        "key-spacing" : ["error", {
                "beforeColon": true,
                "afterColon": true,
            }
        ], // key 값 세미콜론 전후 여백 형성
    }
};
