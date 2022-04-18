const { defineConfig } = require("@vue/cli-service");
const path = require("path");
const webpack = require("webpack");
module.exports = defineConfig({
    transpileDependencies: true,
    chainWebpack: config => {
        config.resolve.alias.set("@assets", path.join(__dirname,"src/assets"));

        config.plugin("jquery").use(webpack.ProvidePlugin,[{
            $: "jquery"
        }]);
    }, 
    devServer: {
        proxy: {
            "/api":{
                target:"http://localhost:8090", //spring boot 다른ip 를 못들오게 해서 이 proxy를 통해서 다른 로컬 값 들오게 만들어줌
                pathRewrite: {
                    "^/api":"" 
                }
            }
        }
    }
});
