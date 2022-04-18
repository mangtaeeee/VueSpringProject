module.exports = {
    root: true,
    env: {
        node: true,
    },
    extends: ["plugin:vue/essential", "eslint:recommended"],
    parserOptions: {
        parser: "@babel/eslint-parser",
    },
    rules: {
        "no-console": process.env.NODE_ENV === "production" ? "warn" : "off",
        "no-debugger": process.env.NODE_ENV === "production" ? "warn" : "off",
        indent: ["error", 4], //탭  클릭시 스페이스4개
        semi: ["error", "always"], // 글끝에 세미콜론
        quotes: ["error", "double"], // '' ->"" 으로 변환
        "vue/multi-word-component-names":["error",{
            "ignores":["default","Header","Home",]  // Header , Home 이름오류 vue eslint 에서 오류 예외
        }]
    },
};
