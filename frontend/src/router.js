import Vue from "vue";
import VueRouter from "vue-router";
import boardList from "./components/board/boardList";

Vue.use(VueRouter);

const router = new VueRouter({
    mode : "history",
    routes : [
        {
            path:"/boardList",
            component : boardList
        }
    ]
});

export default router ;