const base = {
    get() {
        return {
            url : "http://localhost:8080/springbooth4q2o/",
            name: "springbooth4q2o",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbooth4q2o/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "家具商城系统"
        } 
    }
}
export default base
